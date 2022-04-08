package com.android.ctgapp.activity.mine.team

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityAddMemberBinding
import com.android.ctgapp.entity.FindUserEntity
import com.android.ctgapp.entity.MyTeamEntity
import com.android.ctgapp.util.*
import org.jetbrains.anko.startActivityForResult

/**
 *作者:LiBW
 *创建日期: 2020/10/11
 *描述: 添加员工 编辑员工 页面
 */
class AddOrEditMemberActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityAddMemberBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root

    //当前选择的员工职位
    private var labelName = ""
    private var labelId: Int? = null

    //工号
    private var userNo = ""

    private var isEdit = false

    //是否为管理员
    private var isAdmin = false

    //当前选择的部门
    private var departmentName = ""
    private var departmentId = -1
    private var olderDepartmentId: Int? = null
    private var userId: Int? = null

    private val mViewModel: AddOrEditMemberViewModel by lazy { ViewModelProvider(this)[AddOrEditMemberViewModel::class.java] }
    private var autoRegister = false
    override fun event() {
        //只有公司创建者可以设置管理员
        mBinding.mAdminSelectLL.visibility = if (BaseApplication.isCompanyCreator) View.VISIBLE else View.GONE
        val data = intent.getStringExtra(MyConstants.ITEM_ENTITY)
        //如果携带数据过来则为编辑员工
        data?.let { d ->
            MyLog.d("携带过来的数据:$d")
            isEdit = true
            mBinding.mTitleBar.setTitle("编辑员工")
            val entity = getGson().fromJson(d, MyTeamEntity.DataBean::class.java)
            MyLog.d("需要修改的UserID:${entity.userId}")
            userId = entity.userId
            mBinding.mPhoneET.textSet(entity.telephone.handlerNull())
            mBinding.mPhoneET.isEnabled = false
            mBinding.mNameTV.textSet(entity.realName.handlerNull())
            labelId = entity.positionLabelId
            val label = entity.labelName.handlerNull()
            mBinding.mPositionTV.text = if (label.isNotEmpty()) label else "请选择职位"
            entity.departmentId?.let {
                departmentId = it
                olderDepartmentId = it
            }
            entity.departmentName?.let { mBinding.mDepartmentTV.text = it }
            mBinding.mWorkNumberET.textSet(entity.userNo.handlerNull())
            //是否为管理员
            mBinding.mSetManagerSwitch.isChecked = entity.isCompanyAdmin
            isAdmin = entity.isCompanyAdmin
        }

        mViewModel.error.observe(this, {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })
        mViewModel.result.observe(this, {
            loading.dismiss()
            MyLog.d("添加/修改员工回调:$it")
            val entity = initData(it)
            if (entity.status == 0) {
                showToast("操作成功")
                finish()
            } else {
                showToast(entity.msg)
            }
        })
        mViewModel.userResult.observe(this, {
            loading.dismiss()
            MyLog.d("查询用户回调:$it")
            val entity = getGson().fromJson(it, FindUserEntity::class.java)
            if (entity.status == 0) {
                entity.data?.let { bean ->
                    userId = bean.id
                    mBinding.mNameTV.textSet(bean.realName.handlerNull())
                    //查到人了就不让改了
                    mBinding.mNameTV.isEnabled = false
                    autoRegister = false
                    isAdmin = bean.isCompanyAdmin
                    mBinding.mSetManagerSwitch.isChecked = bean.isCompanyAdmin
                }
                if (entity.data == null) {
                    userId = null
                    mBinding.mNameTV.hint = "请输入员工姓名"
                    mBinding.mNameTV.textSet("")
                    mBinding.mNameTV.isEnabled = true
                    autoRegister = true
                }
            } else {
                userId = null
                mBinding.mNameTV.hint = "请输入员工姓名"
                mBinding.mNameTV.textSet("")
                mBinding.mNameTV.isEnabled = true
                autoRegister = true
            }
        })

        mBinding.mPhoneET.handlerText {
            if (it.length == 11) {
                //输入11位的时候自动查询员工姓名
                mViewModel.findUser(it)
            }
        }
        if (!isEdit) {
            mBinding.mRemoveBTN.visibility = View.GONE
        }
    }

    override fun click() {
        //选择职位
        mBinding.mSearchPositionLL.setOnClickListener {
            startActivityForResult<SelectPositionActivity>(
                1000,
                MyConstants.LABEL_NAME to labelName,
                MyConstants.LABEL_ID to labelId
            )
        }
        //选择部门
        mBinding.mSearchDepartmentLL.setOnClickListener {
            startActivityForResult<DepartmentSelectActivity>(
                1001,
                MyConstants.DEPARTMENT to departmentName,
                MyConstants.DEPARTMENT_ID to departmentId
            )
        }
        //保存
        mBinding.mSaveBTN.setOnClickListener {
            if (mBinding.mWorkNumberET.text.handlerNull().isNotEmpty()) {
                userNo = mBinding.mWorkNumberET.text.toString()
            }
            when {
                mBinding.mPhoneET.text.handlerNull().length < 11 -> showToast("请输入完整的手机号")
                !autoRegister && userId == null -> showToast("未查询到相关员工")
                autoRegister && mBinding.mNameTV.text.handlerNull().isEmpty() -> showToast("请输入用户名")
                else -> {
                    loading.show()
                    if (isEdit) {
                        //编辑模式
                        mViewModel.editMember(olderDepartmentId, departmentId, userId!!, userNo.handlerNull(), labelId, isAdmin)
                    } else {
                        //添加未注册的人
                        if (autoRegister) {
                            mViewModel.addMemberAutoRegister(departmentId, userNo.handlerNull(), labelId, isAdmin, mBinding.mPhoneET.text.handlerNull(), mBinding.mNameTV.text.handlerNull())
                        } else {
                            //添加已注册的人
                            mViewModel.addMember(departmentId, userNo.handlerNull(), userId!!, labelId, isAdmin)
                        }
                    }
                }
            }
        }
        //移除
        mBinding.mRemoveBTN.setOnClickListener {
            userId?.let {
                commonDialog("确认要移除该员工么") {
                    mViewModel.removeMember(it)
                }
            }
        }

        //是否为管理员
        mBinding.mSetManagerSwitch.setOnCheckedChangeListener { _, isChecked ->
            MyLog.d("开关状态:$isChecked")
            isAdmin = isChecked
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //职位标签
        if (resultCode == 1000) {
            data?.let {
                val position = it.getStringExtra(MyConstants.LABEL_NAME).handlerNull()
                labelName = position
                labelId = it.getIntExtra(MyConstants.LABEL_ID, -1)
                mBinding.mPositionTV.text = position
            }
        }
        //部门
        if (resultCode == 1001) {
            data?.let {
                departmentId = it.getIntExtra(MyConstants.DEPARTMENT_ID, -1)
                departmentName = it.getStringExtra(MyConstants.DEPARTMENT).handlerNull()
                mBinding.mDepartmentTV.text = departmentName
            }
        }
    }
}
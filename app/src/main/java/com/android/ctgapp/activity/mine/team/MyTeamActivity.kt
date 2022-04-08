package com.android.ctgapp.activity.mine.team

import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.core.view.GravityCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.message.chart.PersonInfoActivity
import com.android.ctgapp.adapter.mine.MyTeamAdapter
import com.android.ctgapp.adapter.mine.TeamDepartmentLabelAdapter
import com.android.ctgapp.adapter.mine.TeamDepartmentMenuAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.entity.DepartmentMenusEntity
import com.android.ctgapp.entity.MyTeamEntity
import com.android.ctgapp.entity.mine.LabelEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_my_team.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.startActivityForResult

/**
 *作者:LiBW
 *创建日期: 2020/10/11
 *描述:我的团队  页面
 */
class MyTeamActivity : BaseActivity(), MyTeamAdapter.Listener {
    override fun getLayout() = R.layout.activity_my_team
    private val mViewModel: MyTeamViewModel by lazy { ViewModelProvider(this)[MyTeamViewModel::class.java] }
    private val mLabelModel: SelectPositionViewMode by lazy { ViewModelProvider(this)[SelectPositionViewMode::class.java] }

    private val mList = ArrayList<MyTeamEntity.DataBean>()
    private var mAdapter: MyTeamAdapter? = null

    private var mSearchText = ""

    //选择搜索的部门
    var departmentSelectName = ""
    var departmentSelectId = -1

    //选择搜索的职位标签
    var labelSelectName = ""
    var labelSelectId = -1

    //是否为主管(搜索条件)
    private var isManager: Boolean? = null

    //抽屉内部门分组菜单
    private val mDepartmentList = ArrayList<DepartmentMenusEntity.DataBean>()
    private val mDepartmentAdapter: TeamDepartmentMenuAdapter by lazy { TeamDepartmentMenuAdapter(this, mDepartmentList) }

    //抽屉内的职位分组
    private val mLabelList = ArrayList<LabelEntity.DataBean>()
    private val mLabelAdapter: TeamDepartmentLabelAdapter by lazy { TeamDepartmentLabelAdapter(this, mLabelList) }

    override fun onResume() {
        super.onResume()

        if (BaseApplication.isCompanyAdmin) {
            mFinishRL.visibility = View.GONE
            mButtonLL.visibility = View.VISIBLE
        }
        getData()
        //部门分组 和标签分组
        mViewModel.getDepartmentList()
        mLabelModel.getLabels()
    }

    private fun getData() {
        mList.clear()
        loading.show()
        mViewModel.getTeamList(mSearchText, departmentSelectId, isManager, labelSelectId)
    }

    override fun event() {
        mTitleBar.setTitle(BaseApplication.companyName)
        //根据是否为管理员或公司创建者决定是否展示管理相关按钮
        if (!BaseApplication.isCompanyAdmin || !BaseApplication.isCompanyCreator) {
            mButtonLL.visibility = View.GONE
            mAddMembersTV.visibility = View.GONE
        }

        //成员
        mTeamRV.adapter = mAdapter
        mTeamRV.layoutManager = LinearLayoutManager(this)


        mDepartmentRV.adapter = mDepartmentAdapter
        mDepartmentRV.layoutManager = GridLayoutManager(this, 3, RecyclerView.VERTICAL, false)
        mLabelRV.adapter = mLabelAdapter
        mLabelRV.layoutManager = GridLayoutManager(this, 3, RecyclerView.VERTICAL, false)



        mViewModel.departmentResult.observe(this, Observer { result ->
            loading.dismiss()
            MyLog.d("部门列表:$result")
            val data = initData(result)
            if (data.status == 0) {
                val entity = getGson().fromJson(result, DepartmentMenusEntity::class.java).data
                entity?.let {
                    mDepartmentList.clear()
                    mDepartmentList.addAll(it)
                    mDepartmentAdapter.notifyDataSetChanged()
                }
            } else {
                showToast(data.msg)
            }
        })


        mViewModel.result.observe(this, Observer { result ->
            loading.dismiss()
            MyLog.d("部门成员列表:$result")
            val data = initData(result)
            if (data.status == 0) {
                val entity = getGson().fromJson(result, MyTeamEntity::class.java).data
                entity?.let {
                    mList.addAll(it)
                    mAdapter = MyTeamAdapter(this, mList, this, false)
                    mTeamRV.adapter = mAdapter
                    mTeamRV.layoutManager = LinearLayoutManager(this)
                }
            } else {
                showToast(data.msg)
            }
        })
        mLabelModel.getLabelResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("获取标签回调:$it")
            handlerHttpResult(it) {
                val entity = getGson().fromJson(it, LabelEntity::class.java).data
                entity?.let { list ->
                    mLabelList.clear()
                    mLabelList.addAll(list)
                    mLabelAdapter.notifyDataSetChanged()
                }
            }
        })

        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })
        mLabelModel.error.observe(this, Observer {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })
        mGroupSettingDL.bottomCannotClick()
    }


    override fun click() {
        //保存筛选选项
        mItemSaveTV.setOnClickListener {
            mGroupSettingDL.closeDrawer(GravityCompat.END)
            getData()
        }

        //添加成员
        mAddMembersTV.setOnClickListener {
            startActivity<AddOrEditMemberActivity>()
        }
        //组织架构 搜索功能(打开抽屉)
        mFrameworkIV.setOnClickListener {
            mGroupSettingDL.openDrawer(GravityCompat.END)
        }
        //申请通知
        mApplyNotificationTV.setOnClickListener {
            startActivity<ApplyNotifyActivity>()
        }
        if (BaseApplication.inviteCode.isEmpty()){
            mInviteEmployeesBTN.visibility=View.GONE
        }

        //邀请员工
        mInviteEmployeesBTN.setOnClickListener {
            startActivity<InviteUserToTeamActivity>()
        }
        //管理团队
        mManagementTeamBTN.setOnClickListener {
            startActivityForResult<ManagementTeamMenuActivity>(1000)

//            mFinishRL.visibility = View.VISIBLE
//            mButtonLL.visibility = View.GONE
//            repeat(mList.size) {
//                mList[it].editType = true
//            }
//            mAdapter?.notifyDataSetChanged()


        }
        //完成(管理团队)
        mFinishBTN.setOnClickListener {
            startActivity<ManagementTeamMenuActivity>()
//            mFinishRL.visibility = View.GONE
//            mButtonLL.visibility = View.VISIBLE
//            repeat(mList.size) {
//                mList[it].editType = false
//            }
//            mAdapter?.notifyDataSetChanged()


        }
        //搜索框
        mSearchET.handlerText {
            mSearchText = it
            if (it.isEmpty()) {
                getData()
            }
        }
        //搜索框的搜索按钮
        mSearchET.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                //收起键盘
                hideEditTextView()
                getData()
            }
            false
        }
    }


    override fun onBackPressed() {
        if (mGroupSettingDL.isDrawerOpen(GravityCompat.END)) {
            mGroupSettingDL.closeDrawer(GravityCompat.END)
        } else {
            super.onBackPressed()
        }
    }

    //点击编辑按钮
    override fun onEditSelectListener(data: MyTeamEntity.DataBean) {
//        startActivity<AddOrEditMemberActivity>(MyConstants.ITEM_ENTITY to getGson().toJson(data))
    }

    //进入个人详情
    override fun onItemSelectListener(data: MyTeamEntity.DataBean) {
        startActivity<PersonInfoActivity>(
            MyConstants.FRIEND_USER_ID to data.userId,
            MyConstants.COMPANY_ID to BaseApplication.companyId,
            MyConstants.MY_IMAGE_URL to data.imageUrl
        )
    }

    //跳转到聊天
//    override fun onGoToChart(data: MyTeamEntity.DataBean) {
//        if (BaseApplication.userId == data.userId) {
//            showToast("抱歉,不能和自己聊天!")
//        } else {
//            jumpToChart(data.userId, data.realName.handlerNull(), data.imageUrl.handlerNull(), globalCompanyName)
//        }
//    }


}
package com.android.ctgapp.activity.mine.friend

import android.Manifest
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.FindUserEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_add_business_friend.*
import org.jetbrains.anko.startActivityForResult
import org.json.JSONArray

/**
 *作者:LiBW
 *创建日期: 2020/10/12
 *描述:添加商友 页面
 */
class AddBusinessFriendActivity : BaseActivity() {
    private var groupId = -1
    private val permissions = arrayOf(Manifest.permission.READ_CONTACTS)
    private val mViewModel: AddBusinessFriendViewModel by lazy { ViewModelProvider(this)[AddBusinessFriendViewModel::class.java] }
    private var mPhoneNumList = ""
    private var userId: Int? = null
    override fun event() {
//        mBookIV.handlerViewByTheme(this,R.drawable.icon_contact_book)

        //获取当前所有商友手机号码
        mViewModel.getAllPhoneNum()
        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })
        mViewModel.phoneNumResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("所有手机号码:$it")
            val data = initData(it)
            if (data.status == 0) {
                val json = JSONArray(data.data.toString())
                mPhoneNumList = json.toString()
            }
        })
        mViewModel.result.observe(this, Observer {
            loading.dismiss()
            MyLog.d("添加:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("添加成功")
                finish()
            } else {
                showToast(data.msg)
            }
        })


        mViewModel.userResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("查询用户回调:$it")
            val entity = getGson().fromJson(it, FindUserEntity::class.java)
            if (entity.status == 0) {
                entity.data?.let { bean ->
                    userId = bean.id
                    mNameTV.text = bean.realName.handlerNull()
                }
                if (entity.data == null) {
                    userId = null
                    mNameTV.text = "员工姓名"
                }
            } else {
                userId = null
                mNameTV.text = "员工姓名"
            }
        })
    }

    override fun click() {
        //选择分组
        mSelectGroupLL.setOnClickListener {
            startActivityForResult(Intent(this, AddSelectGroupActivity::class.java), 1000)
        }

        //保存
        mSaveBTN.setOnClickListener {
            val phone = mPhoneET.text.toString()
            val remark = mRemarkET.text.handlerNull()
            when {
                phone.isEmpty() -> showToast("电话号码不能为空")
                else -> {
                    if (userId == null) {
                        //如果userId不存在则提示用户邀请好友注册
                        commonDialog("用户不存在,是否邀请该用户注册") {
                            mViewModel.inviteUser(phone)
                        }
                    } else {
                        mViewModel.addFriend(userId!!, groupId, remark)
                    }
                }
            }
        }


        mPhoneET.handlerText {
            if (it.length == 11) {
                mViewModel.findUser(it)
            } else {
                mNameTV.text = "员工姓名"
            }
        }

        mViewModel.inviteUserResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("邀请用户回调:$it")
            handlerData(it) {
                showToast("邀请已发出")
                finish()


            }
        })

        //打开手机联系人
        mOpenContactLL.setOnClickListener {
            check()
        }
    }


    private fun check() {
        handlerPermission(permissions) {
            //跳转到联系人列表并且吧所有手机号都带过去
            startActivityForResult<PhoneContactActivity>(
                1001,
                MyConstants.GROUP_PHONE_NUMBERS to mPhoneNumList
            )
        }
    }

    //权限回调
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSION_APPLY_CODE) {
            check()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1000) {
            data?.let {
                mGroupNmaeTV.text = data.getStringExtra(MyConstants.GROUP_NAME).handlerNull()
                groupId = data.getIntExtra(MyConstants.GROUP_ID, -1)
            }
        }
        //通讯录带回来的
        if (requestCode == 1001) {
            data?.let {
                mPhoneET.textSet(data.getStringExtra(MyConstants.PHONE).handlerNull())
                mNameTV.text = data.getStringExtra(MyConstants.NAME).handlerNull()
                mViewModel.findUser(data.getStringExtra(MyConstants.PHONE).handlerNull())
            }
        }
    }


    override fun getLayout() = R.layout.activity_add_business_friend
}
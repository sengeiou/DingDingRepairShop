package com.android.ctgapp.activity.message.chart

import android.Manifest
import android.content.*
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.BuildConfig.WX_APP_ID
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.company.CompanyDetailActivity
import com.android.ctgapp.activity.mine.friend.MyBusinessFriendViewModel
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.entity.BusinessFriendInfoEntity
import com.android.ctgapp.entity.CardInfoEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.BusinessFriendAddDialog
import com.android.ctgapp.widget.dialog.BusinessFriendEditDialog
import com.bumptech.glide.Glide
import com.permissionx.guolindev.PermissionX
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram
import com.tencent.mm.opensdk.openapi.WXAPIFactory
import kotlinx.android.synthetic.main.activity_other_detail.*
import kotlinx.android.synthetic.main.activity_other_detail.mAddressTV
import kotlinx.android.synthetic.main.activity_other_detail.mAuthIcon
import kotlinx.android.synthetic.main.activity_other_detail.mPhoneNumTV
import kotlinx.android.synthetic.main.activity_other_detail.mUserNameTV
import kotlinx.android.synthetic.main.item_delete_edit_popup_window.view.*
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.startActivity
import java.lang.StringBuilder

/**
 *作者:LiBW
 *创建日期: 3/31/21
 *描述: 团队成员详情 商友详情  名片详情 页面(融合) 个人详情V2
 */
class PersonInfoActivity : BaseActivity(), BusinessFriendEditDialog.GroupEditCallback, BusinessFriendAddDialog.AddCallback {
    override fun getLayout() = R.layout.activity_other_detail
    private val mViewModel: MyBusinessFriendViewModel by lazy { ViewModelProvider(this)[MyBusinessFriendViewModel::class.java] }

    private var friendEntity: BusinessFriendInfoEntity? = null
    private var mName = ""
    private var mPhone = ""
    private var mCompanyName = ""
    private var mRemark = ""
    private var mGroupName = ""
    private var mGroupId = -1

    //设置
    private var menuPopup: PopupWindow? = null

    //修改商友
    private var mBusinessFriendEditDialog: BusinessFriendEditDialog? = null


    //用户ID 必传
    private val userId: Int by lazy { intent.getIntExtra(MyConstants.FRIEND_USER_ID, -1) }

    //头像必传
    private val mImage: String by lazy { intent.getStringExtra(MyConstants.MY_IMAGE_URL).handlerNull() }

    //公司ID必传
    private val companyId: Int by lazy { intent.getIntExtra(MyConstants.COMPANY_ID, -1) }

    private val permissions = arrayOf(Manifest.permission.WRITE_CONTACTS)
    private val readContactPermission = arrayOf(Manifest.permission.READ_CONTACTS)


    override fun onResume() {
        super.onResume()
        mViewModel.getFriendInfo(userId)
    }

    override fun event() {
        //如果用户有公司则展示 没公司则隐藏
        mCompanyInfoLL.visibility = if (companyId == 0 || companyId == -1) View.GONE else View.VISIBLE
        Glide.with(this).load(mImage.ossUrlHandler()).
            placeholder(R.drawable.defaulthead)
            .error(R.drawable.defaulthead)
        .into(mHeaderIV)
        val mPhoneList = ArrayList<String>()
        PermissionX.init(this).permissions(*readContactPermission)
            .onExplainRequestReason { scope, deniedList ->
                val message = "需要您同意以下权限才能正常使用"
                scope.showRequestReasonDialog(deniedList, message, "确定", "取消")
            }
            //被用户永久拒绝的权限
            .onForwardToSettings { _, deniedList ->
                MyPermissionUtil.jumpToPermissionDialog(deniedList,this)
            }
            .request { allGranted, _, _ ->
                if (allGranted) {
                    mPhoneList.addAll(PhoneContactUtil.getAllNumber(this))
                } else {
                    showToast("请手动设置读取通讯录权限")
                }
            }

        mViewModel.friendResult.observe(this, { result ->
            loading.dismiss()
            MyLog.d("名片详细信息:$result")
            handlerData(result) {
                val data = getGson().fromJson(result, CardInfoEntity::class.java).data
                data?.let { info ->
                    //认证
                    mAuthIcon.visibility = View.VISIBLE
                    if (info.doCertified) mAuthIcon.imageResource = R.drawable.icon_auth_on else mAuthIcon.imageResource = R.drawable.icon_auth_off
                    //公司名称 如果是团队成员附带部门
                    val companyName = StringBuilder(info.companyName.handlerNull())
                    mUserNameTV.text = info.userName.handlerNull()
                    mName = info.userName.handlerNull()
                    mPhone = info.telephone.handlerNull()
                    mCompanyName = info.companyName.handlerNull()
                    mRemark = info.remark.handlerNull()
                    mGroupId = info.groupId
                    mGroupName = info.groupName.handlerNull()
                    //行业属性
                    val industry = info.industry.handlerNull()
                    if (industry.isNotEmpty()) {
                        mIndustryTV.visibility = View.VISIBLE
                        mIndustryTV.text = industry
                    }
                    mPhoneNumTV.text = info.telephone.handlerNull()
                    mAddressTV.text = info.companyAddress.handlerNull()
                    //关系
                    mRelationTV.text = info.relation.handlerNull()
                    //判断通讯录中是否已存在这个手机号码

                    mPhoneList.forEach { phone ->
                        if (phone == info.telephone.handlerNull()) {
                            mAddToPhoneContactTV.isEnabled = false
                            mAddToPhoneContactTV.text = "已在通讯录中"
                        }
                    }
                    //名片上用户与当前查看者的关系（商友、同事、临时会话 三者选一）
                    when (info.relation) {
                        "商友" -> {
                            mAddFriendTV.visibility = View.GONE
                            mBusinessLL.visibility = View.VISIBLE
                            //分组
                            mGroupNameTV.text = info.groupName.handlerNull()
                            //备注
                            mRemarkTV.text = info.remark.handlerNull()
                            //仅商友可以编辑
                            mSettingIV.visibility = View.VISIBLE
                            //企业
                            mCompanyNameLineTV.text = info.companyName.handlerNull()
                        }
                        "同事" -> {
                            mAddFriendTV.visibility = View.GONE
                            mTeamLL.visibility = View.VISIBLE
                            mCompanyInfoLL.visibility = View.GONE
                            val department = info.departmentName.handlerNull()
                            if (department.isNotEmpty()) {
                                companyName.append(department)
                                //部门
                                mDepartmentTV.text = department
                            }
                            //职位
                            mPositionTV.text = info.labelName.handlerNull()
                        }
                        "临时会话" -> {
                            mAddFriendTV.visibility = View.VISIBLE
                        }
                    }
                    mCompanyNameTV.text = companyName.handlerNull()
                }
            }
        })

        mViewModel.error.observe(this, {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })
        mViewModel.friendDeleteResult.observe(this, {
            loading.dismiss()
            MyLog.d("删除商友回调:$it")
            handlerData(it) {
                showToast("删除商友成功")
                finish()
            }
        })
    }

    override fun click() {
        //添加到商友
        mAddFriendTV.setOnClickListener {
            BusinessFriendAddDialog(userId, mName, this).show(supportFragmentManager, "")
        }

        //设置按钮
        mSettingIV.setOnClickListener {
            val menuView = LayoutInflater.from(this).inflate(R.layout.item_delete_edit_popup_window, null, false)
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            params.marginEnd = 30f.toPx(this)
            menuView.layoutParams = params
            menuPopup = PopupWindow(menuView, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, true)
            //设置背景透
            menuPopup?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            menuPopup?.showAsDropDown(mSettingIV)
            //编辑
            menuView.mEditTV.setOnClickListener {
                mBusinessFriendEditDialog = BusinessFriendEditDialog(mGroupName, mGroupId, mName, mRemark, userId, friendEntity, this)
                if (!mBusinessFriendEditDialog?.isAdded!!) {
                    mBusinessFriendEditDialog?.show(supportFragmentManager, "")
                }
            }
            //删除
            menuView.mDeleteTV.setOnClickListener {
                commonDialog("确认删除该商友么") {
                    mViewModel.businessFriendDelete(userId)
                }
            }
        }

        //存入通讯录
        mAddToPhoneContactTV.setOnClickListener {
            MyLog.d("开始存入通讯录")
            PermissionX.init(this).permissions(*permissions)
                .onExplainRequestReason { scope, deniedList ->
                    val message = "需要您同意以下权限才能正常使用"
                    scope.showRequestReasonDialog(deniedList, message, "确定", "取消")
                }
                //被用户永久拒绝的权限
                .onForwardToSettings { _, deniedList ->
                    MyPermissionUtil.jumpToPermissionDialog(deniedList,this)
                }
                .request { allGranted, _, _ ->
                    if (allGranted) {
                        addContactToPhone(mName, mPhone)
                    } else {
                        showToast("请手动设置存取权限")
                    }
                }
        }
        //分享名片
        mShareCardBTN.setOnClickListener {
            friendEntity?.data?.userinfo?.let { friend ->
                //发送商友名片
                MyLog.d("分享名片")
                val api = WXAPIFactory.createWXAPI(this, WX_APP_ID)
                val req = WXLaunchMiniProgram.Req()
                req.userName = "gh_a9eb273c7c97"
                //TODO 数据缺失 商友公司 商友联盟ID
                req.path = "pages/common/sharePage/sharePage?userId=${friend.id}&companyId=${companyId}&allianceId=${BaseApplication.allianceId}"
                //正式版
                req.miniprogramType = WXLaunchMiniProgram.Req.MINIPTOGRAM_TYPE_RELEASE
                api.sendReq(req)
            }
        }

        //发消息
        mSendMsgBTN.setOnClickListener {
            if (BaseApplication.userId == userId) {
                showToast("抱歉,不能和自己聊天!")
            } else {
                val imageUrl = if (mImage.isEmpty()) "" else ossHeader + mImage
                jumpToChart(userId, mName, imageUrl, mCompanyName)
            }
        }
        //查看商友企业信息
        mCompanyInfoLL.setOnClickListener {
            startActivity<CompanyDetailActivity>(MyConstants.COMPANY_ID to companyId)
        }
        //分享名片
        mShareCardBTN.setOnClickListener {

        }
    }

    private fun Context.addContactToPhone(name: String, tel: String) {
        //插入raw_contacts表，并获取_id属性
        try {
            var uri: Uri = Uri.parse("content://com.android.contacts/raw_contacts")
            val resolver: ContentResolver = contentResolver
            val values = ContentValues()
            resolver.insert(uri, values)?.let {
                val contactId: Long = ContentUris.parseId(it)
                //插入data表
                uri = Uri.parse("content://com.android.contacts/data")
                values.put("raw_contact_id", contactId)
                values.put(ContactsContract.Data.MIMETYPE, "vnd.android.cursor.item/name")
                values.put("data2", name)
                values.put("data1", name)
                resolver.insert(uri, values)
                values.clear()
                values.put("raw_contact_id", contactId)
                values.put(ContactsContract.Data.MIMETYPE, "vnd.android.cursor.item/phone_v2")
                values.put("data2", "2") //手机
                values.put("data1", tel)
                resolver.insert(uri, values)
                values.clear()
                mAddToPhoneContactTV.isEnabled = false
                mAddToPhoneContactTV.text = "已在通讯录中"
                showToast("已存入通讯录,请注意查看")
            }
        } catch (e: Exception) {
            showToast("存入失败:${e.message}")
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        mBusinessFriendEditDialog?.onActivityResult(requestCode, resultCode, data)

    }

    override fun onDestroy() {
        super.onDestroy()
        if (menuPopup != null) {
            menuPopup?.dismiss()
            menuPopup = null
        }
    }

    override fun editFinish() {
        mViewModel.getFriendInfo(userId)
    }

    companion object {
        fun jumpHere(context: Context, otherID: Int, otherImage: String, companyId: Int) {
            MyLog.d("详情页面带过来的数据:$otherID  $companyId")
            val intent = Intent(context, PersonInfoActivity::class.java)
            intent.putExtra(MyConstants.FRIEND_USER_ID, otherID)
            intent.putExtra(MyConstants.MY_IMAGE_URL, otherImage)
            intent.putExtra(MyConstants.COMPANY_ID, companyId)
            context.startActivity(intent)
        }
    }

    override fun addFinish() {
        mViewModel.getFriendInfo(userId)
    }
}


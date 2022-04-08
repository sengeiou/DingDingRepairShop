package com.android.ctgapp.activity.mine

import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.setting.PersonalAuthenticationActivity
import com.bumptech.glide.Glide
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.UserInfoEntity
import com.android.ctgapp.event.MineFragmentRefresh
import com.android.ctgapp.util.*
import com.nanchen.compresshelper.CompressHelper
import com.permissionx.guolindev.PermissionX
import com.zhihu.matisse.Matisse
import kotlinx.android.synthetic.main.activity_person_info.*
import org.greenrobot.eventbus.EventBus
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2020/10/10
 *描述: 个人信息 页面 (修改)
 */
class PersonInfoChangeActivity : BaseActivity() {
    override fun getLayout() = R.layout.activity_person_info
    private val mViewModel: PersonInfoViewModel by lazy { ViewModelProvider(this)[PersonInfoViewModel::class.java] }
    private var imageUrl = ""

    //默认已经认证
    private var isCertification = true

    override fun event() {
        showLoading()
        mViewModel.getUserInfo()

        //个人信息回调
        mViewModel.userInfoResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("用户信息回调:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, UserInfoEntity::class.java).data
                data?.let {
                    //公司名和地址使用请求的数据
                    mNicknameET.textSet(data.realName.handlerNull())
                    mNicknameET.setSelection(data.realName.handlerNull().length)
                    imageUrl = data.imageUrl.handlerNull()
                    //职位
                    mExternalPositionET.textSet(data.externalPost.handlerNull())
                    val url = ossHeader + data.imageUrl.handlerNull()
                    Glide.with(this@PersonInfoChangeActivity).load(url).
                        placeholder(R.drawable.defaulthead)
                        .error(R.drawable.defaulthead)
                    .into(mImageView)
                    //status  null   "未认证" : 0  "已申请"  1  "认证成功"2 "认证失败"
                    val status = when (data.identificationStatus) {
                        -1 -> {
                            isCertification = false
                            "未认证"
                        }
                        0 -> "已申请"
                        1 -> {
                            //认证成功后不可再次进入
                            mCertificationLL.isEnabled = false
                            "认证成功"
                        }
                        2 -> "认证失败"
                        else -> "未知"
                    }
                    mCertificationStatueTV.text = status
                }
            }
        })

        mViewModel.fileResult.observe(this, Observer {
            loading.dismiss()
            val data = initData(it)
            if (data.status == 0) {
                MyLog.d("图片地址:${ossHeader + data.data}")
                imageUrl = data.data.handlerNull()
            } else {
                showToast(data.msg)
            }
        })

        mViewModel.error.observe(this, Observer {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })
        mViewModel.updateUserInfoResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("修改回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("修改用户信息成功")
                EventBus.getDefault().post(MineFragmentRefresh())
                finish()
            }
        })
    }

    override fun click() {
        //切换照片
        mImageView.setOnClickListener {
            PermissionX.init(this).permissions(*TakePhotoPermissions)
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
                        initSingleImagePicker(1000)
                    } else {
                        showToast("没有取得相应权限")
                    }
                }
        }

        //保存按钮
        mSaveBTN.setOnClickListener {
            val realName = mNicknameET.text.handlerNull()
            val externalPost = mExternalPositionET.text.handlerNull()
            when {
                realName.isEmpty() -> showToast("请输入昵称")
//                imageUrl.isEmpty() -> showToast("请选择头像")
//                externalPost.isEmpty() -> showToast("请填写对外职位")
                else -> {
                    mViewModel.changeInfo(
                        handlerBody(
                            "realName" to realName,
                            "imageUrl" to imageUrl,
                            "externalPost" to externalPost
                        )
                    )
                }
            }
        }
        //进入认证
        mCertificationLL.setOnClickListener {
            startActivity<PersonalAuthenticationActivity>(MyConstants.IS_CERTIFICATION to isCertification)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1000 && data != null) {
            //图片路径 同样视频地址也是这个 根据requestCode
            val mSelected = Matisse.obtainResult(data)
            MyLog.d("图片地址:$mSelected")
            if (mSelected.isNotEmpty()) {
                val file = changeFile(this, mSelected[0])
                file?.let {
                    loading.show()
                    mViewModel.upLoadFile(CompressHelper.getDefault(applicationContext).compressToFile(file))
                    Glide.with(this).load(file).
                        placeholder(R.drawable.defaulthead)
                        .error(R.drawable.defaulthead)
                    .into(mImageView)
                }
            }
        }
    }
}
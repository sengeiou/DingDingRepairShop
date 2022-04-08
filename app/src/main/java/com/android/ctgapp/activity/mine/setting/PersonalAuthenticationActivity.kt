package com.android.ctgapp.activity.mine.setting

import android.content.Intent
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.CertificationResultEntity
import com.android.ctgapp.util.*
import com.bumptech.glide.Glide
import com.nanchen.compresshelper.CompressHelper
import com.permissionx.guolindev.PermissionX
import com.zhihu.matisse.Matisse
import kotlinx.android.synthetic.main.activity_personal_authentication.*

/**
 *作者:LiBW
 *创建日期: 12/19/20
 *描述:个人认证 页面
 */
class PersonalAuthenticationActivity : BaseActivity() {
    //认证通过后无法再进入此页面
    private val mViewModel: PersonalAuthenticationViewModel by lazy { ViewModelProvider(this)[PersonalAuthenticationViewModel::class.java] }
    private var image1 = ""
    private var image2 = ""

    //是否认证
    private val isCertification: Boolean by lazy { intent.getBooleanExtra(MyConstants.IS_CERTIFICATION, true) }
    private var isLeft = true
    override fun event() {
        showLoading()
        mViewModel.getCertificationResult()

        mViewModel.result.observe(this, Observer {
            loading.dismiss()
            MyLog.d("认证信息回调:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, CertificationResultEntity::class.java).data
                data?.let {
                    //status  null   "未认证" : 0  "已申请"  1  "认证成功"2 "认证失败"
                    if (data.status == 0) {
                        mStatusIV.visibility = View.VISIBLE
                    }

                    mRealNameET.textSet(data.realName)
                    mRealNameET.setSelection(data.realName.handlerNull().length)
                    mCardNumberET.textSet(data.idcardNum)
                    mCardNumberET.setSelection(data.idcardNum.handlerNull().length)
                    image1 = data.aimage.handlerNull()
                    image2 = data.bimage.handlerNull()
                    MyLog.d("${ossHeader}${data.aimage}")
                    Glide.with(this).asBitmap().load("${ossHeader}${data.aimage}").
                        placeholder(R.drawable.img_id_card_b)
                        .error(R.drawable.img_id_card_b)
                    .into(mLeftImageView)
                    Glide.with(this).asBitmap().load("${ossHeader}${data.bimage}").
                        placeholder(R.drawable.img_id_card_a)
                        .error(R.drawable.img_id_card_a)
                    .into(mRightImageView)
                }

            }
        })

        mViewModel.confirmResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("提交回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("提交成功")
                finish()
            } else {
                showToast(data.msg)
            }
        })

        mViewModel.fileResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("上传图片回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                MyLog.d("图片地址:${ossHeader + data.data}")
                if (isLeft) {
                    image1 = data.data.handlerNull()
                } else {
                    image2 = data.data.handlerNull()
                }

            } else {
                showToast(data.msg)
            }

        })
        mViewModel.error.observe(this, Observer {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })
    }

    override fun click() {
        //提交
        mConfirmBTN.setOnClickListener {
            val name = mRealNameET.text.handlerNull()
            val cardNumber = mCardNumberET.text.handlerNull()
            when {
                name.isEmpty() -> showToast("请输入姓名")
                cardNumber.length < 18 -> showToast("请输入完整的身份证号")
                image1.isEmpty() -> showToast("请上传身份照")
                image2.isEmpty() -> showToast("请上传身份照")
                else -> {
                    showLoading()
                    mViewModel.certification(
                        isCertification, handlerBody(
                            "realName" to name,
                            "idcardNum" to cardNumber,
                            "aimage" to image1,
                            "bimage" to image2
                        )
                    )
                }
            }
        }
        //点击选取左侧身份证
        mLeftImageView.setOnClickListener {
            isLeft = true
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
                        initSingleImagePicker(1001)
                    } else {

                        showToast("抱歉没有获取到相应的权限")

                    }
                }


        }
        //点击选取右侧
        mRightImageView.setOnClickListener {
            isLeft = false
            PermissionX.init(this).permissions(*TakePhotoPermissions)
                .onExplainRequestReason { scope, deniedList ->
                    val message = "需要您同意以下权限才能正常使用"
                    scope.showRequestReasonDialog(deniedList, message, "确定", "取消")
                }
                //被用户永久拒绝的权限
                .onForwardToSettings { _, deniedList ->
                    MyPermissionUtil.jumpToPermissionDialog(deniedList,this)
                }
                .request { allGranted, _, deniedList ->
                    if (allGranted) {
                        initSingleImagePicker(1002)
                    } else {

                        showToast("抱歉没有获取到相应的权限")

                    }
                }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1001 && data != null) {
            //图片路径 同样视频地址也是这个 根据requestCode
            val mSelected = Matisse.obtainResult(data)
            MyLog.d("图片地址:$mSelected")
            if (mSelected.isNotEmpty()) {
                val file = changeFile(this, mSelected[0])
                file?.let {
                    loading.show()
                    mViewModel.upLoadFile(CompressHelper.getDefault(applicationContext).compressToFile(file))
                    Glide.with(this).load(file).apply {
                        placeholder(R.drawable.img_id_card_b)
                        error(R.drawable.img_id_card_b)
                    }.into(mLeftImageView)
                }
            }
        }
        if (requestCode == 1002 && data != null) {
            //图片路径 同样视频地址也是这个 根据requestCode
            val mSelected = Matisse.obtainResult(data)
            MyLog.d("图片地址:$mSelected")
            if (mSelected.isNotEmpty()) {
                val file = changeFile(this, mSelected[0])
                file?.let {
                    loading.show()
                    mViewModel.upLoadFile(CompressHelper.getDefault(applicationContext).compressToFile(file))
                    Glide.with(this).load(file).apply {
                        placeholder(R.drawable.img_id_card_a)
                        error(R.drawable.img_id_card_a)
                    }.into(mRightImageView)
                }
            }
        }

    }


    override fun getLayout() = R.layout.activity_personal_authentication
}
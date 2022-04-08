package com.android.ctgapp.activity.mine.alliance

import android.app.Activity
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.util.*
import com.bumptech.glide.Glide
import com.lwkandroid.imagepicker.ImagePicker
import com.lwkandroid.imagepicker.data.ImageBean
import com.lwkandroid.imagepicker.data.ImagePickType
import com.nanchen.compresshelper.CompressHelper
import com.permissionx.guolindev.PermissionX
import kotlinx.android.synthetic.main.activity_create_alliance.*
import okhttp3.MediaType
import okhttp3.RequestBody
import java.io.File

/**
 *作者:LiBW
 *创建日期: 12/28/20
 *描述: 创建联盟 页面
 */
class CreateAllianceActivity : BaseActivity() {
    private val mViewModel: CreateAllianceViewModel by lazy { ViewModelProvider(this)[CreateAllianceViewModel::class.java] }

    //展示的图片地址
    private var imageShow = ""
    private var ossResultImageUrl = ""

    override fun event() {

        mViewModel.error.observe(this, Observer {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })


        mViewModel.result.observe(this, Observer {
            dismissLoading()
            MyLog.d("创建联盟回调:$it")
            handlerData(it) {
                showToast("创建联盟成功")
                finish()
            }
        })
        mViewModel.fileResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("图片回调:$it")
            handlerData(it) { url ->
                ossResultImageUrl = url.handlerNull()
                MyLog.d("图片拼接:${OssImageHandler(url.handlerNull())}")
            }
        })
    }

    override fun click() {
        //选择公司LOGO
        mAllianceLogoIV.setOnClickListener {
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
                        ImagePicker()
                            .cachePath(getExternalFilesDir(null)?.absolutePath)
                            .pickType(ImagePickType.MULTI)
                            .displayer(ImagePickerLoader())
                            .maxNum(1)
                            .start(this, 1000)
                    } else {
                        showToast("请开启相应的权限")
                    }
                }


        }
        //提交创建联盟
        mConfirmBTN.setOnClickListener {
            val name = mAllianceNameET.text.handlerNull()
            val phone = mAlliancePhoneET.text.handlerNull()
            val intro = mAllianceIntroET.text.handlerNull()
            when {
                name.isEmpty() -> showToast("请输入联盟名称")
                else -> {
                    val map = HashMap<String, Any>()
                    map["industry"] = "ALLIANCE"
                    map["orgname"] = name
                    if (phone.isNotEmpty()) {
                        map["phone"] = phone
                    }
                    if (ossResultImageUrl.isNotEmpty()) {
                        map["logo"] = ossResultImageUrl
                    }
                    if (intro.isNotEmpty()) {
                        map["remark"] = intro
                    }
                    map["allianceType"] = 2
                    val body = RequestBody.create(
                        MediaType.parse("application/json; charset=utf-8"),
                        getGson().toJson(map)
                    )
                    mViewModel.createAlliance(body)
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1000 && resultCode == Activity.RESULT_OK && data != null) {
            val list: List<ImageBean> = data.getParcelableArrayListExtra(ImagePicker.INTENT_RESULT_DATA)!!
            for (imageBean in list) {
                imageShow = imageBean.imagePath

                mViewModel.upLoadFile(CompressHelper.getDefault(applicationContext).compressToFile(File(imageShow)))
                Glide.with(this)
                    .load(imageShow)
                    .placeholder(R.drawable.icon_camera_bg)
                    .error(R.drawable.icon_camera_bg)
                    .into(mAllianceLogoIV)
                MyLog.d("图片地址:$imageShow")
            }
        }
    }

    override fun getLayout() = R.layout.activity_create_alliance

}
package com.android.ctgapp.activity.mine.company

import android.content.Intent
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.entity.mine.CompanyAuthEntity
import com.android.ctgapp.util.*
import com.bumptech.glide.Glide
import com.nanchen.compresshelper.CompressHelper
import com.permissionx.guolindev.PermissionX
import com.zhihu.matisse.Matisse
import kotlinx.android.synthetic.main.activity_company_attestation.*
import org.jetbrains.anko.imageResource

/**
 *作者:LiBW
 *创建日期: 3/30/21
 *描述:企业认证 页面
 */
class CompanyAttestationActivity : BaseActivity() {
    override fun getLayout() = R.layout.activity_company_attestation
    private val mViewModel by lazy { ViewModelProvider(this)[CompanyAttestationViewModel::class.java] }

    //认证状态 0真核中 1成功 2失败
    private val attStatus by lazy { intent.getIntExtra(MyConstants.STATUE, -1) }

    private val companyId by lazy { intent.getIntExtra(MyConstants.COMPANY_ID, BaseApplication.companyId) }

    //新建模式
    private var createModel = true

    //编辑模式
    private var editModel = false
    private var imageUrl = ""
    override fun event() {
        when (attStatus) {
            //已申请 审核中
            0 -> {
                //展示印章
                mAuthResultIV.visibility = View.VISIBLE
                mAuthResultIV.imageResource = R.drawable.icon_audit_wait
                //隐藏编辑按钮 和提交按钮
                mEditTV.visibility = View.GONE
                mSubmitRL.visibility = View.GONE
                mViewModel.getAttestationInfo(companyId)
            }
            //认证成功
            1 -> {
                mAuthResultIV.visibility = View.VISIBLE
                mAuthResultIV.imageResource = R.drawable.icon_audit_ok
                //隐藏编辑按钮 和提交按钮
                mEditTV.visibility = View.GONE
                mSubmitRL.visibility = View.GONE
                mViewModel.getAttestationInfo(companyId)
            }
            //认证失败
            2 -> {
                mAuditResultTV.visibility = View.VISIBLE
                //认证失败可以编辑
                mEditTV.visibility = View.VISIBLE
                mAuthResultIV.visibility = View.VISIBLE
                mAuthResultIV.imageResource = R.drawable.icon_audit_fail
                mViewModel.getAttestationInfo(companyId)
            }
            else -> {
                editModel = true
                //新建
                //隐藏编辑按钮 展示提交按钮
                mEditTV.visibility = View.GONE
                mSubmitRL.visibility = View.VISIBLE
                //隐藏印章
                mAuthResultIV.visibility = View.INVISIBLE
                //可以编辑
                mCompanyNameET.isEnabled = true
                mNumberET.isEnabled = true
                mLegalET.isEnabled = true
            }
        }

        mViewModel.error.observe(this, Observer {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, Observer {
            dismissLoading()
            MyLog.d("获取认证信息:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, CompanyAuthEntity::class.java).data
                data?.let {
                    mCompanyNameET.textSet(data.companyName.handlerNull())
                    mNumberET.textSet(data.registerNum.handlerNull())
                    mLegalET.textSet(data.legalMan.handlerNull())
                    imageUrl = data.businessLicense.handlerNull()
                    val result = "审核意见:${data.reason.handlerNull()}"
                    mAuditResultTV.text = result
                    Glide.with(this)
                        .load(data.businessLicense.ossUrlHandler())
                        .error(R.drawable.img_camera_circel_bg)
                        .placeholder(R.drawable.img_camera_circel_bg)

                        .into(mAuditIV)
                }
            }
        })

        mViewModel.createResult.observe(this, Observer {
            dismissLoading()
            handlerData(it) {
                showToast("提交成功")
                finish()
            }
        })
        mViewModel.updateResult.observe(this, Observer {
            dismissLoading()
            handlerData(it) {
                showToast("提交成功")
                finish()
            }
        })


        mViewModel.fileResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("上传图片回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                MyLog.d("图片地址:${ossHeader + data.data}")
                imageUrl = data.data.handlerNull()
            } else {
                showToast(data.msg)
            }

        })
    }

    override fun click() {
        //提交
        mSubmitBTN.setOnClickListener {
            val name = mCompanyNameET.text.handlerNull()
            val number = mNumberET.text.handlerNull()
            val legal = mLegalET.text.handlerNull()
            when {
                imageUrl.isEmpty() -> showToast("请上传营业执照")
                name.isEmpty() -> showToast("请填写企业名称")
                number.isEmpty() -> showToast("请填写信用代码或注册号")
                legal.isEmpty() -> showToast("请填写法人代表")
                else -> {
                    showLoading()
                    val body = handlerBody(
                        "companyName" to name,
                        "businessLicense" to imageUrl,
                        "registerNum" to number,
                        "legalMan" to legal
                    )
                    MyLog.d("现在的创建模式:$createModel")
                    if (createModel) mViewModel.createCompanyAudit(body) else mViewModel.updateCompanyAudit(body)
                }
            }
        }

        //加载图片
        mAuditIV.setOnClickListener {
            if (editModel) {
                PermissionX.init(this).permissions(*TakePhotoPermissions)
                    .onExplainRequestReason { scope, deniedList ->
                        val message = "需要您同意以下权限才能正常使用"
                        scope.showRequestReasonDialog(deniedList, message, "确定", "取消")
                    }
                    //被用户永久拒绝的权限
                    .onForwardToSettings { _, deniedList ->
                        MyPermissionUtil.jumpToPermissionDialog(deniedList, this)
                    }
                    .request { allGranted, _, deniedList ->
                        if (allGranted) {
                            initSingleImagePicker(1001)
                        } else {
                            showToast("抱歉没有获取到相应的权限")
                        }
                    }
            }
        }
        //编辑
        mEditTV.setOnClickListener {
            mCompanyNameET.isEnabled = true
            mNumberET.isEnabled = true
            mLegalET.isEnabled = true
            createModel = false
            editModel = true
            //隐藏印章
            mAuthResultIV.visibility = View.INVISIBLE
            //隐藏失败原因
            mAuditResultTV.visibility = View.GONE
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
                    Glide.with(this).load(file).placeholder(R.drawable.img_id_card_b)
                        .error(R.drawable.img_id_card_b)
                        .into(mAuditIV)
                }
            }
        }
    }
}
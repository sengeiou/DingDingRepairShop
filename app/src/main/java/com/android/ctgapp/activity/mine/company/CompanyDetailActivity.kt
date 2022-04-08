package com.android.ctgapp.activity.mine.company

import android.Manifest
import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.activity.address.AddressListActivity
import com.bumptech.glide.Glide
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.callback.CompanyCallback
import com.android.ctgapp.databinding.ActivityMyCompanyBinding
import com.android.ctgapp.entity.*
import com.android.ctgapp.enum.getShowName
import com.android.ctgapp.event.MineFragmentRefresh
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.company.*
import com.nanchen.compresshelper.CompressHelper
import com.zhihu.matisse.Matisse
import org.greenrobot.eventbus.EventBus
import org.jetbrains.anko.startActivity
import java.lang.StringBuilder

/**
 *作者:LiBW
 *创建日期: 2020/10/9
 *描述: 企业 页面 企业详情 页面 企业信息 页面 公司详情 页面
 */
class CompanyDetailActivity : BaseActivityV2(), CompanyCallback {
    private val mBinding by lazy { ActivityMyCompanyBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root

    private val mViewModel: MyCompanyViewModel by lazy { ViewModelProvider(this)[MyCompanyViewModel::class.java] }

    //公司id 查看别人企业时传入
    private val companyId: Int by lazy { intent.getIntExtra(MyConstants.COMPANY_ID, -1) }

    //公司详情
    private var companyInfo: CompanyDetailEntity.DataBean? = null
    private var companyEntity = ""

    //修改企业信息
    private var mCompanyInfoChangeDialog: CompanyInfoChangeCompanyDialog? = null

    //相机权限相关
    private val permissions = arrayOf(Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE)

    //是否认证
    private var isAttestation = false

    //认证状态
    private var attestationStatus = -1

    override fun onResume() {
        super.onResume()
        MyLog.d("获取企业头像")
        refreshCompanyInfo()
    }

    override fun onDestroy() {
        EventBus.getDefault().post(MineFragmentRefresh())
        super.onDestroy()
    }

    private fun refreshCompanyInfo() {
        loading.show()
        //不为-1 则表明查询的是其他人的公司 为-1则表示查询自己的企业
        if (companyId != -1) {
            mViewModel.getCompanyDetail(companyId)
        } else {
            mViewModel.getMyCompany()
        }
    }

    override fun event() {
        if (companyId != -1) {
            //说明是其他人的公司 不允许修改相关信息
            mBinding.mSettingIV.visibility = View.GONE
            mBinding.mBottomItemsLL.visibility = View.GONE
            mBinding.mCompanyIV.isEnabled = false
        }
        changeStatusIconColor(false)
        MyLog.d("看看这个companyID:$companyId")
        mCompanyInfoChangeDialog = CompanyInfoChangeCompanyDialog(companyInfo, this)
        mViewModel.error.observe(this, {
            loading.dismiss()
            showToast(it)
        })
        //公司详情回调
        mViewModel.companyDetailResult.observe(this, {
            loading.dismiss()
            MyLog.d("公司详情show:$it")
            val data = initData(it)
            if (data.status == 0) {
                companyEntity = it
                val entity = getGson().fromJson(it, CompanyDetailEntity::class.java).data
                entity?.let { result ->
                    companyInfo = result
                    mCompanyInfoChangeDialog = CompanyInfoChangeCompanyDialog(companyInfo, this)
                    val remark = "公司简介:${result.remark.handlerNull()}"
                    mBinding.mCompanyIntroTV.text = remark
                    mBinding.mCompanyNameTV.text = result.orgname.handlerNull()
                    mBinding.mIndustryTV.text = getShowName(result.industry.handlerNull())
                    mBinding.mCompanyPhoneTV.text = result.phone.handlerNull()
                    mBinding.mCompanyEmailTV.text = result.email.handlerNull()
                    mBinding.mCompanyUrlTV.text = result.websiteUrl.handlerNull()
                    //邀请码
                    val code=result.invitationCode.handlerNull()
                    //邀请码
                    if (code.isNotEmpty()){
                        mBinding.mInvitationCodeTV.text = code
                        mBinding.mCopyLL.visibility=View.VISIBLE
                    }
                    //是否认证
                    isAttestation = result.isAttestation
                    if (result.isAttestation) mBinding.mAuditIV.visibility = View.VISIBLE
                    //认证状态
                    attestationStatus = result.attestationStatus
                    var scale = ""
                    when (result.employeeScale.handlerNull()) {
                        "1" -> scale = "0-20人"
                        "2" -> scale = "21-50人"
                        "3" -> scale = "51-100人"
                        "4" -> scale = "100人以上"
                    }
                    //企业性质
                    when (result.industry) {
                        "REPAIRSHOP" -> {
                            //修理厂
                            mBinding.mJYFWLL.visibility = View.GONE
                            mBinding.mXLCLL.visibility = View.VISIBLE

                        }
                        "AGENCY" -> {
                            //其他 含有经营范围
                            mBinding.mJYFWLL.visibility = View.VISIBLE
                            mBinding.mXLCLL.visibility = View.GONE
                            mViewModel.getCompanyRange()
                        }
                        else -> {
                            mBinding.mJYFWLL.visibility = View.GONE
                            mBinding.mXLCLL.visibility = View.GONE
                        }
                    }

                    mBinding.mCompanySizeTV.text = scale
                    val address = "${result.province.handlerNull()} ${result.city.handlerNull()} ${result.district.handlerNull()} ${result.address.handlerNull()}"

                    mBinding.mCompanyAddressTV.text = address
                    val logo = ossHeader + result.logo.handlerNull()
                    Glide.with(this).load(logo).
                        placeholder(R.drawable.takephoto)
                        .error(R.drawable.takephoto)
                    .into(mBinding.mCompanyIV)

                    //主修车系
                    val carSeries = StringBuilder()
                    result.carSeries?.forEach { series ->
                        carSeries.append(series.name.handlerNull() + " ")
                    }
                    mBinding.mCarSeries.text = carSeries.handlerNull()
                    //合作保险公司
                    val insuranceCompanies = StringBuilder()
                    result.insuranceCompanies?.forEach { companies ->
                        insuranceCompanies.append(companies.name.handlerNull() + " ")
                    }
                    mBinding.mInsuranceTV.text = insuranceCompanies.handlerNull()
                    mBinding.mLevelTV.text = result.gradeName.handlerNull()
                }
            } else {
                showToast(data.msg)
            }
        })

        mViewModel.rangeResult.observe(this, {
            MyLog.d("企业经营范围:$it")
            handlerHttpResult(it) {
                val bean = getGson().fromJson(it, RangeEntity::class.java).data
                val range = StringBuilder()
                bean?.let { list ->
                    list.forEach { bean ->
                        range.append(bean.rangeName + " ")
                    }
                }
            }
        })

        //修改通用
        mViewModel.commonUpdateResult.observe(this, {
            loading.dismiss()
            MyLog.d("修改回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                //如果企业信息修改成功则隐藏dialog并刷新公司数据
                mCompanyInfoChangeDialog?.dialog?.let { dialog ->
                    if (dialog.isShowing) {
                        refreshCompanyInfo()
                        dialog.dismiss()
                    }
                }
                showToast("修改成功")
            } else {
                showToast(data.msg)
            }
        })


        //图片回调
        mViewModel.fileResult.observe(this, {
            loading.dismiss()
            MyLog.d("上传文件回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                MyLog.d("图片地址:${ossHeader + data.data}")
                mViewModel.changeCompanyLogo(data.data.handlerNull())

                Glide.with(this).load( data.data.handlerNull().ossUrlHandler()).
                    placeholder(R.drawable.defaulthead)
                    .error(R.drawable.defaulthead)
                .into(mBinding.mCompanyIV)

            } else {
                showToast(data.msg)
            }
        })
    }

    override fun click() {
        //复制邀请码
        mBinding.mCopyLL.setOnClickListener {
            copyTextToPhone(this,mBinding.mInvitationCodeTV.text.handlerNull())
            showToast("邀请码已复制到剪切板")
        }
        //对外联系人
        mBinding.mExternalContactsTV.setOnClickListener {
            if (companyId != -1) {
                ExternalContactsCompanyDialog(companyId, false).show(supportFragmentManager, "")
            } else {
                ExternalContactsCompanyDialog(BaseApplication.companyId).show(supportFragmentManager, "")
            }
        }
        //账户信息
        mBinding.mAccountInfoTV.setOnClickListener {
            if (companyId != -1) {
                AccountInfoCompanyDialog(companyId, false).show(supportFragmentManager, "")
            } else {
                AccountInfoCompanyDialog(BaseApplication.companyId).show(supportFragmentManager, "")
            }
        }
        //开票信息
        mBinding.mInvoiceInfoTV.setOnClickListener {
            if (companyId != -1) {
                InvoiceInfoCompanyDialog(companyId, false).show(supportFragmentManager, "")
            } else {
                InvoiceInfoCompanyDialog(BaseApplication.companyId).show(supportFragmentManager, "")
            }
        }
        //收货信息
        mBinding.mShoppingAddressTV.setOnClickListener {
            startActivity<AddressListActivity>()
        }

        //企业认证
        mBinding.mEnterpriseCertificationTV.setOnClickListener {
            when {
                companyId != -1 && !isAttestation -> showToast("该企业还未进行认证!")
                companyId != -1 && isAttestation -> {
                    startActivity<CompanyAttestationActivity>(
                        MyConstants.IS_ATTESTATION to isAttestation, MyConstants.STATUE to attestationStatus,
                        MyConstants.COMPANY_ID to companyId
                    )
                }
                else -> {
                    startActivity<CompanyAttestationActivity>(
                        MyConstants.IS_ATTESTATION to isAttestation, MyConstants.STATUE to attestationStatus
                    )
                }
            }
        }
        mBinding.mBackIV.setOnClickListener {
            finish()
        }
        //修改公司Logo
        mBinding.mCompanyIV.setOnClickListener {
            takePhoto()
        }
        //设置
        mBinding.mSettingIV.setOnClickListener {
            startActivity<CompanyInfoSettingActivity>(MyConstants.COMPANY_ENTITY to companyEntity)
        }
    }


    private fun takePhoto() {
        handlerPermission(permissions) {
            initSingleImagePicker(1000)
        }
    }

    override fun saveIntro(companyIntro: String) {

    }

    //修改公司信息
    override fun changeCompanyInfo(data: CompanyDetailEntity.DataBean) {
        loading.show()
        mViewModel.updateCompanyInfo(data)
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
                    .into(mBinding.mCompanyIV)
                }
            }
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSION_APPLY_CODE) {
            takePhoto()
        }
    }
}
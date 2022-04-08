package com.android.ctgapp.activity.mine.company

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.CarSeriesEntity
import com.android.ctgapp.entity.CityEntity
import com.android.ctgapp.entity.CompanyDetailEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.CitySelectDialog
import com.android.ctgapp.widget.dialog.company.CarSeriesSelectDialog
import com.android.ctgapp.widget.dialog.company.CooperativeInsuranceCompanyDialog
import com.android.ctgapp.widget.dialog.company.WeiXiuDengJiDialog
import kotlinx.android.synthetic.main.activity_comoany_info_setting.*
import kotlinx.android.synthetic.main.item_team_size_select_popupwindow.view.*
import org.jetbrains.anko.startActivityForResult
import java.lang.StringBuilder

/**
 *作者:LiBW
 *创建日期: 2/23/21
 *描述: 公司设置页面 企业信息 页面 (修改)
 */
class CompanyInfoSettingActivity : BaseActivity(), CitySelectDialog.SelectOverListener, CarSeriesSelectDialog.Callback, WeiXiuDengJiDialog.WXDJCallback, CooperativeInsuranceCompanyDialog.Callback {
    override fun getLayout() = R.layout.activity_comoany_info_setting
    private val mViewModel: MyCompanyViewModel by lazy { ViewModelProvider(this)[MyCompanyViewModel::class.java] }
    private var menuPopup: PopupWindow? = null
    private val companyEntityStr by lazy { intent.getStringExtra(MyConstants.COMPANY_ENTITY) }
    private var companyEntity: CompanyDetailEntity.DataBean? = null
    private var mProvince = ""
    private var mCity = ""
    private var mDistrict = ""

    private var companyIntro = ""

    private val mZXCXlist = mutableSetOf<CarSeriesEntity.DataBean>()
    private val mBXGSlist = mutableSetOf<CarSeriesEntity.DataBean>()
    private var mWXDJid: Int? = null

    private var mSize = 0

    private var mCarSeriesSelectDialog: CarSeriesSelectDialog? = null
    private var mCooperativeInsuranceCompanyDialog: CooperativeInsuranceCompanyDialog? = null
    private var mWXDJdialog: WeiXiuDengJiDialog? = null


    private lateinit var cityEntity: CityEntity
    private val citySelectDialog: CitySelectDialog by lazy { CitySelectDialog(cityEntity, this) }
    override fun event() {
        cityEntity = getGson().fromJson(getParentMenuCode(), CityEntity::class.java)
        companyEntityStr?.let {
            companyEntity = getGson().fromJson(it, CompanyDetailEntity::class.java).data
            companyEntity?.let { item ->
                mCompanyPhoneET.textSet(item.phone.handlerNull())
                mCompanyEmailET.textSet(item.email.handlerNull())
                mCompanyUrlET.textSet(item.websiteUrl.handlerNull())
                mAddressDetailET.textSet(item.address.handlerNull())
                mProvince = item.province.handlerNull()
                mCity = item.city.handlerNull()
                mDistrict = item.district.handlerNull()
                val address = "$mProvince $mCity $mDistrict"
                mAddressSelectTV.text = address
                mCompanyIntroTV.text = item.remark.handlerNull()
                //规模
                mSize = item.employeeScale
                val scale =
                    when (item.employeeScale.handlerNull()) {
                        "1" -> "0-20人"
                        "2" -> "21-50人"
                        "3" -> "51-100人"
                        "4" -> "100人以上"
                        else -> ""
                    }
                mCompanySizeTV.text = scale

                companyIntro = item.remark.handlerNull()
                //维修厂等级
                mWXDJid = item.gradeId
                //主修车系
                val carSeries = StringBuilder()
                item.carSeries?.forEach { series ->
                    carSeries.append(series.name.handlerNull())
                    mZXCXlist.add(series)
                }
                mCarSeries.text = if (carSeries.handlerNull().isEmpty()) "请选择主修车系" else carSeries.handlerNull()

                //合作保险公司
                val insuranceCompanies = StringBuilder()
                item.insuranceCompanies?.forEach { companies ->
                    mBXGSlist.add(companies)
                    insuranceCompanies.append(companies.name.handlerNull())
                }
                mInsuranceTV.text = if (insuranceCompanies.handlerNull().isEmpty()) "请选择合作保险公司" else insuranceCompanies.handlerNull()

                mLevelTV.text = if (item.gradeName.handlerNull().isEmpty()) "请选择维修等级" else item.gradeName.handlerNull()
            }
        }

        mViewModel.commonUpdateResult.observe(this, Observer {
            handlerData(it) {
                finish()
            }
        })
    }

    override fun click() {
        //地址选择
        mAddressSelectLL.setOnClickListener {
            if (!citySelectDialog.isAdded) {
                citySelectDialog.show(supportFragmentManager, "")
            }
        }
        //选择车系
        mCarSeriesLL.setOnClickListener {
            mCarSeriesSelectDialog = CarSeriesSelectDialog(mZXCXlist, this)
            mCarSeriesSelectDialog?.let {
                if (!it.isAdded) {
                    it.show(supportFragmentManager, "")
                }
            }
        }
        //选择维修等级
        mLevelLL.setOnClickListener {
            mWXDJdialog = WeiXiuDengJiDialog(mWXDJid, this)
            mWXDJdialog?.let {
                if (!it.isAdded) {
                    it.show(supportFragmentManager, "")
                }
            }
        }
        //合作保险公司
        mInsuranceLL.setOnClickListener {
            mCooperativeInsuranceCompanyDialog = CooperativeInsuranceCompanyDialog(mBXGSlist, this)
            mCooperativeInsuranceCompanyDialog?.let {
                if (!it.isAdded) {
                    it.show(supportFragmentManager, "")
                }
            }
        }
        //选择规模
        mCompanySizeTV.setOnClickListener {
            val menuView = LayoutInflater.from(this).inflate(R.layout.item_team_size_select_popupwindow, null, false)
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            params.marginEnd = 30f.toPx(this)
            menuView.layoutParams = params
            menuPopup = PopupWindow(menuView, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, true)
            //设置背景透
            menuPopup?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            menuPopup?.showAsDropDown(mSizePoint)
            menuView.mTeam1.setOnClickListener {
                mSize = 1
                mCompanySizeTV.text = menuView.mTeam1.text.toString()
                menuPopup?.dismiss()
            }
            menuView.mTeam2.setOnClickListener {
                mSize = 2
                mCompanySizeTV.text = menuView.mTeam2.text.toString()
                menuPopup?.dismiss()
            }
            menuView.mTeam3.setOnClickListener {
                mSize = 3
                mCompanySizeTV.text = menuView.mTeam3.text.toString()
                menuPopup?.dismiss()
            }
            menuView.mTeam4.setOnClickListener {
                mSize = 4
                mCompanySizeTV.text = menuView.mTeam4.text.toString()
                menuPopup?.dismiss()
            }
        }
        //企业简介
        mIntroLL.setOnClickListener {
            startActivityForResult<CompanyIntroActivity>(1000, MyConstants.COMPANY_INTRO to companyIntro)
        }

        //确认
        mConfirmBTN.setOnClickListener {
            val phone = mCompanyPhoneET.text.handlerNull()
            val email = mCompanyEmailET.text.handlerNull()
            val url = mCompanyUrlET.text.handlerNull()
            val address = mAddressDetailET.text.handlerNull()
            val intro = mCompanyIntroTV.text.handlerNull()

            companyEntity?.let {
                it.phone = phone
                it.email = email
                it.websiteUrl = url
                it.district = mDistrict
                it.city = mCity
                it.province = mProvince
                it.address = address
                it.employeeScale = mSize
                it.remark = intro
            }
            when {
                else -> {
                    companyEntity?.let { bean ->
                        if (mWXDJid != null) {
                            mViewModel.updateCompanyInfoV2(bean, mZXCXlist, mWXDJid, mBXGSlist)
                        } else {
                            showToast("请选择维修厂等级")
                        }
                    }
                }
            }
        }
    }


    override fun onSelectOver(province: String, city: String, district: String) {
        mProvince = province
        mCity = city
        mDistrict = district
        val select = "$province $city $district"
        mAddressSelectTV.text = select
    }

    override fun closeSelect() {
        mProvince = ""
        mCity = ""
        mDistrict = ""
        mAddressSelectTV.text = "所在地区"
    }

    //选中的主修车系
    override fun chexiCallback(list: Set<CarSeriesEntity.DataBean>) {
        mZXCXlist.clear()
        mZXCXlist.addAll(list)
        MyLog.d("有点意思" + getGson().toJson(list))
        if (list.isNotEmpty()) {
            val sp = StringBuilder()
            list.forEach {
                sp.append(it.name + " ")
            }
            mCarSeries.text = sp.handlerNull()
        } else {
            mCarSeries.text = "请选择主修车系"
        }
    }

    //选中的维修厂等级
    override fun wxdjCallback(data: CarSeriesEntity.DataBean?) {
        mLevelTV.text = data?.name?.handlerNull() ?: "请选择维修等级"
        data?.id?.let {
            mWXDJid = it
        }
    }

    //选中合作保险公司
    override fun cooperativeInsuranceCompanyCallback(list: Set<CarSeriesEntity.DataBean>) {
        mBXGSlist.clear()
        mBXGSlist.addAll(list)
        if (list.isNotEmpty()) {
            val sp = StringBuilder()
            list.forEach {
                sp.append(it.name + " ")
            }
            mInsuranceTV.text = sp.handlerNull()
        } else {
            mInsuranceTV.text = "请选择合作保险公司"
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1000 && data != null) {
            companyIntro = data.getStringExtra(MyConstants.COMPANY_INTRO).handlerNull()
            MyLog.d(companyIntro)
            mCompanyIntroTV.text = companyIntro
        }
    }


}
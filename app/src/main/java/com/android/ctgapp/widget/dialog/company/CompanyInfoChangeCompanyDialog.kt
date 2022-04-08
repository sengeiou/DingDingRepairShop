package com.android.ctgapp.widget.dialog.company

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupWindow
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseCompanyDialogFragment
import com.android.ctgapp.callback.CompanyCallback
import com.android.ctgapp.entity.CityEntity
import com.android.ctgapp.entity.CompanyDetailEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.CitySelectDialog
import kotlinx.android.synthetic.main.item_company_info_change.*
import kotlinx.android.synthetic.main.item_team_size_select_popupwindow.view.*

/**
 *作者:LiBW
 *创建日期: 2020/10/10
 *描述:公司信息修改
 */
class CompanyInfoChangeCompanyDialog(private val companyInfo: CompanyDetailEntity.DataBean?, private val companyCallback: CompanyCallback) : BaseCompanyDialogFragment(), CitySelectDialog.SelectOverListener {
    private var entity = CompanyDetailEntity.DataBean()
    private var menuPopup: PopupWindow? = null
    //省市区
    private var mProvince = ""
    private var mCity = ""
    private var mDistrict = ""
    private lateinit var cityEntity: CityEntity
    private val citySelectDialog: CitySelectDialog by lazy { CitySelectDialog(cityEntity, this) }
    private var mSize = 0
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        cityEntity = getGson().fromJson(requireActivity().getParentMenuCode(), CityEntity::class.java)
        //关闭
        mDeleteIV.setOnClickListener {
            dismiss()
        }
        companyInfo?.let {
            mProvince = it.province.handlerNull()
            mCity = it.city.handlerNull()
            mDistrict = it.district.handlerNull()
            val select = "$mProvince $mCity $mDistrict"
            mAddressTV.text = select

            mPhoneET.text = setEditText(it.phone.handlerNull())
            mEmailET.text = setEditText(it.email.handlerNull())
            mUrlET.text = setEditText(it.websiteUrl.handlerNull())

            mSize=it.employeeScale
            val  scale = when (mSize) {
                1 -> "1-20人"
                2 -> "21-50人"
                3 -> "51-100人"
                4 -> "100人以上"
                else-> ""
            }
            mSizeTV.text = scale
            mAddressET.text = setEditText(it.address.handlerNull())
        }
        //保存
        mSaveBTN.setOnClickListener {
            val phone = mPhoneET.text.toString()
            val email = mEmailET.text.toString()
            val url = mUrlET.text.toString()
            val address = mAddressET.text.toString()
            entity.phone = phone
            entity.email = email
            entity.websiteUrl = url
            entity.employeeScale = mSize
            entity.address = address
            entity.province = mProvince
            entity.city = mCity
            entity.district = mDistrict
            companyCallback.changeCompanyInfo(entity)
        }
        //选择地址
        mAddressLL.setOnClickListener {
            if (!citySelectDialog.isAdded) {
                citySelectDialog.show(requireActivity().supportFragmentManager, "")
            }
        }
        //选择规模
        mSizeLL.setOnClickListener {
            val menuView = LayoutInflater.from(requireContext()).inflate(R.layout.item_team_size_select_popupwindow, null, false)
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            params.marginEnd = 30f.toPx(requireContext())
            menuView.layoutParams = params
            menuPopup = PopupWindow(menuView, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, true)
            //设置背景透
            menuPopup?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            menuPopup?.showAsDropDown(mPupPoint)
            menuView.mTeam1.setOnClickListener {
                mSize = 1
                mSizeTV.text=menuView.mTeam1.text.toString()
                menuPopup?.dismiss()
            }
            menuView.mTeam2.setOnClickListener {
                mSize = 2
                mSizeTV.text=menuView.mTeam2.text.toString()
                menuPopup?.dismiss()
            }
            menuView.mTeam3.setOnClickListener {
                mSize = 3
                mSizeTV.text=menuView.mTeam3.text.toString()
                menuPopup?.dismiss()
            }
            menuView.mTeam4.setOnClickListener {
                mSize = 4
                mSizeTV.text=menuView.mTeam4.text.toString()
                menuPopup?.dismiss()
            }
        }
    }

    override fun getLayout() = R.layout.item_company_info_change
    override fun onSelectOver(province: String, city: String, district: String) {
        mProvince = province
        mCity = city
        mDistrict = district
        val select = "$province $city $district"
        mAddressTV.text = select
    }

    override fun closeSelect() {
        mProvince = ""
        mCity = ""
        mDistrict = ""
        mAddressTV.text = "请选择地址"
    }

    override fun onDestroy() {
        super.onDestroy()
        if (menuPopup != null) {
            menuPopup?.dismiss()
            menuPopup = null
        }
    }
}

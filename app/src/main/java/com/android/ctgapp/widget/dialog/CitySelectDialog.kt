package com.android.ctgapp.widget.dialog

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.home.address.CityAdapter
import com.android.ctgapp.adapter.home.address.DistrictAdapter
import com.android.ctgapp.adapter.home.address.ProvinceAdapter
import com.android.ctgapp.base.BaseCompanyDialogFragment
import com.android.ctgapp.callback.CitySelectListener
import com.android.ctgapp.callback.CitySelectManager
import com.android.ctgapp.entity.CityEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.item_account_info.mDeleteIV
import kotlinx.android.synthetic.main.item_city_select_dialog.*
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 2020/10/10
 *描述:地址选择器 Dialog
 */
class CitySelectDialog(private var entity: CityEntity, private val listener: SelectOverListener) : BaseCompanyDialogFragment(), CitySelectListener {
    private var mProvince = ""
    private var mCity = ""
    private var mDistrict = ""
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        CitySelectManager.setCallback(this)
        dialog?.setCanceledOnTouchOutside(false)
        //排序类
        val sortEntity = CityEntity()
        val provinces = ArrayList<CityEntity.ProvinceBean>()
        entity.province?.forEach { province ->
            val bean = CityEntity.ProvinceBean()
            val c = province.city?.sortedBy { ContactUtil.getFirstLetter(it.name) }
            val cc = ArrayList<CityEntity.ProvinceBean.CityBean>()
            c?.forEach { district ->
                val ccc = CityEntity.ProvinceBean.CityBean()
                val cccc = district.area?.sortedBy { ContactUtil.getFirstLetter(it) }
                ccc.name = district.name
                ccc.area = cccc
                cc.add(ccc)
            }
            bean.city = cc
            bean.name = province.name
            provinces.add(bean)
        }

        //排序
        sortEntity.province = provinces.sortedBy { ContactUtil.getFirstLetter(it.name) }
        entity = sortEntity

        val mAdapter = ProvinceAdapter(requireContext(), entity.province!!, mProvince)
        mCityRV.adapter = mAdapter
        mCityRV.layoutManager = LinearLayoutManager(requireContext())
        mProvinceTV.text = "请选择"
        mProvinceTV.textColorResource = R.color.red_start
        //省份
        mProvinceTV.setOnClickListener {
            mCity = ""
            mDistrict = ""
            mCityTV.visibility = View.INVISIBLE
            mDistrictTV.visibility = View.INVISIBLE
            val adapter = ProvinceAdapter(requireContext(), entity.province!!, mProvince)
            mCityRV.adapter = adapter
            mCityRV.layoutManager = LinearLayoutManager(requireContext())
        }
        //市
        mCityTV.setOnClickListener {
            mDistrictTV.visibility = View.INVISIBLE
            mDistrict = ""
            entity.province?.forEach {
                if (mProvince == it.name) {
                    val adapter = CityAdapter(requireContext(), it.city!!, mCity)
                    mCityRV.adapter = adapter
                    mCityRV.layoutManager = LinearLayoutManager(requireContext())
                }
            }
        }
        //区
        mDistrictTV.setOnClickListener {
            entity.province?.forEach { _ ->
                entity.province?.forEach {
                    if (mProvince == it.name) {
                        it.city?.forEach { district ->
                            if (district.name == mDistrict) {
                                val adapter = DistrictAdapter(requireContext(), district, mDistrict)
                                mCityRV.adapter = adapter
                                mCityRV.layoutManager = LinearLayoutManager(requireContext())
                            }
                        }
                    }
                }
            }
        }
        //关闭
        mDeleteIV.setOnClickListener {
            listener.closeSelect()
            dismiss()
        }
    }

    override fun getLayout() = R.layout.item_city_select_dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.Theme_Design_BottomSheetDialog)
    }

    override fun provinceSelectOver(province: String) {
        mProvince = province
        mCityTV.text = "请选择"
        mCityTV.textColorResource = R.color.red_start
        mCityTV.visibility = View.VISIBLE
        mProvinceTV.visibility = View.VISIBLE
        mProvinceTV.text = province
        mProvinceTV.textColorResource = R.color.gray_text
        mDistrict = ""
        entity.province?.forEach {
            if (mProvince == it.name) {
                val adapter = CityAdapter(requireContext(), it.city!!, mCity)
                mCityRV.adapter = adapter
                mCityRV.layoutManager = LinearLayoutManager(requireContext())
            }
        }
    }

    override fun citySelectOver(city: String) {
        mCity = city
        mDistrictTV.visibility = View.VISIBLE
        mDistrictTV.text = "请选择"
        mDistrictTV.textColorResource = R.color.red_start
        mCityTV.visibility = View.VISIBLE
        mCityTV.textColorResource = R.color.gray_text
        mCityTV.text = city
        entity.province?.forEach { _ ->
            entity.province?.forEach {
                if (mProvince == it.name) {
                    it.city?.forEach { district ->
                        if (district.name == mCity) {
                            val adapter = DistrictAdapter(requireContext(), district, mDistrict)
                            mCityRV.adapter = adapter
                            mCityRV.layoutManager = LinearLayoutManager(requireContext())
                        }
                    }
                }
            }
        }
    }

    //当区选择完毕后关闭dialog
    override fun districtOver(district: String) {
        mDistrict = district
        mDistrictTV.visibility = View.VISIBLE
        mDistrictTV.textColorResource = R.color.gray_text
        mDistrictTV.text = district
        listener.onSelectOver(mProvince, mCity, mDistrict)
        dismiss()
    }

    interface SelectOverListener {
        fun onSelectOver(province: String, city: String, district: String)
        fun closeSelect()
    }
}

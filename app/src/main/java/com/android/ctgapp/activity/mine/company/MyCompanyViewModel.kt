package com.android.ctgapp.activity.mine.company

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.entity.CarSeriesEntity
import com.android.ctgapp.entity.CompanyDetailEntity
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*
import com.google.gson.Gson
import okhttp3.MediaType
import okhttp3.RequestBody

class MyCompanyViewModel : BaseViewModel() {
    private val mCompanyDetailResult = MutableLiveData<String>()
    val companyDetailResult: LiveData<String> get() = mCompanyDetailResult

    //通用修改回调
    private val mCommonUpdateResult = MutableLiveData<String>()
    val commonUpdateResult: LiveData<String> get() = mCommonUpdateResult


    //获取企业信息
    fun getCompanyDetail(companyId: Int) {
        launch {
            mCompanyDetailResult.value = ApiMethods.retrofit.getCompanyDetail(BaseApplication.userToken, companyId).awaitSync()
        }
    }

    //获取本企业的信息
    fun getMyCompany() {
        launch {
            mCompanyDetailResult.value = ApiMethods.retrofit.getMyCompany(BaseApplication.userToken).awaitSync()
        }
    }

    private val mRangeResult = MutableLiveData<String>()
    val rangeResult: LiveData<String> get() = mRangeResult

    //获取经营范围
    fun getCompanyRange() {
        launch {
            mRangeResult.value = ApiMethods.retrofit.getCompanyRange(BaseApplication.userToken).awaitSync()
        }
    }

    //修改公司信息
    fun updateCompanyInfo(data: CompanyDetailEntity.DataBean) {
        val map: MutableMap<String, Any> =
            java.util.HashMap()
        map["phone"] = data.phone.handlerNull()
        map["email"] = data.email.handlerNull()
        map["websiteUrl"] = data.websiteUrl.handlerNull()
        map["address"] = data.address.handlerNull()
        map["city"] = data.city.handlerNull()
        map["province"] = data.province.handlerNull()
        map["district"] = data.district.handlerNull()
        map["employeeScale"] = data.employeeScale.handlerNull()
        map["remark"] = data.remark.handlerNull()

        val obj = Gson().toJson(map)
        val body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), obj)

        launch {
            mCommonUpdateResult.value = ApiMethods.retrofit.updateCompanyDetail(
                BaseApplication.userToken, body
            ).awaitSync()
        }
    }

    //修改公司信息
    fun updateCompanyInfoV2(
        data: CompanyDetailEntity.DataBean,
        carSeries: MutableSet<CarSeriesEntity.DataBean>?,
        gradeId: Int?,
        insuranceCompanies: MutableSet<CarSeriesEntity.DataBean>?) {
        val map: MutableMap<String, Any> =
            java.util.HashMap()
        map["phone"] = data.phone.handlerNull()
        map["email"] = data.email.handlerNull()
        map["websiteUrl"] = data.websiteUrl.handlerNull()
        map["address"] = data.address.handlerNull()
        map["city"] = data.city.handlerNull()
        map["province"] = data.province.handlerNull()
        map["district"] = data.district.handlerNull()
        map["employeeScale"] = data.employeeScale.handlerNull()
        map["remark"] = data.remark.handlerNull()
        val seriesList = ArrayList<Int>()
        carSeries?.forEach {
            seriesList.add(it.id)
        }
        if (seriesList.isNotEmpty()) map["carSeriesIds"] = seriesList
        val insuranceCompaniesList = ArrayList<Int>()
        insuranceCompanies?.forEach {
            insuranceCompaniesList.add(it.id)
        }
        if (insuranceCompaniesList.isNotEmpty()) map["insuranceCompanyIds"] = insuranceCompaniesList
        gradeId?.let {
            map["gradeId"] = it
        }

        val obj = Gson().toJson(map)
        val body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), obj)

        launch {
            mCommonUpdateResult.value = ApiMethods.retrofit.updateCompanyDetailV2(
                BaseApplication.userToken, body
            ).awaitSync()
        }
    }

    //修改公司Logo
    fun changeCompanyLogo(logoUrl: String) {
        launch {
            mCommonUpdateResult.value = ApiMethods.retrofit.updateCompanyDetail(
                BaseApplication.userToken, handlerBody(
                    "logo" to logoUrl
                )
            ).awaitSync()
        }
    }
}
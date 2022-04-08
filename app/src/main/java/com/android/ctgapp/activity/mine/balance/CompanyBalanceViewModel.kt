package com.android.ctgapp.activity.mine.balance

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*
import okhttp3.RequestBody

class CompanyBalanceViewModel : BaseViewModel() {
    private val mCompanyResult = MutableLiveData<String>()
    val companyResult: LiveData<String> get() = mCompanyResult


    //获取企业余额
    fun getCompanyBalance(body: RequestBody) {
        launch {
            mCompanyResult.value = ApiMethods.retrofit.getCompanyBalance(BaseApplication.userToken, 3, body).awaitSync()
        }
    }

    private val mCompanyDetailResult = MutableLiveData<String>()
    val companyDetailResult: LiveData<String> get() = mCompanyDetailResult

    //提现充值记录
    fun getCompanyBalanceDetail(page: Int) {
        launch {
            mCompanyDetailResult.value = ApiMethods.retrofit.getCompanyBalanceDetail(BaseApplication.userToken, BaseApplication.allianceId, BaseApplication.companyId, 3, 20, page).awaitSync()
        }
    }
}
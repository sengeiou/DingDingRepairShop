package com.android.ctgapp.activity.mine.balance

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*
import okhttp3.RequestBody

class BalanceTopUpViewModel : BaseViewModel() {
    private val mApplyResult = MutableLiveData<String>()
    val applyResult: LiveData<String> get() = mApplyResult


    private val mPayResult = MutableLiveData<String>()
    val payResult: LiveData<String> get() = mPayResult



    /***发起支付请求*/
    fun applyPay(body: RequestBody) {
        launch {
            mApplyResult.value = ApiMethods.retrofit.topUpBalance(BaseApplication.userToken, body).awaitSync()
        }
    }



}
package com.android.ctgapp.activity.home.shop

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*

class PayResultViewModel : BaseViewModel() {

    private val mAfterPayResult = MutableLiveData<String>()
    val afterPayResult: LiveData<String> get() = mAfterPayResult

    //支付成功后验证后台是否支付成功
    fun afterPay(orderId: String, payWay: Int) {
        launch {
            mAfterPayResult.value = ApiMethods.retrofit.afterPay(
                BaseApplication.userToken, orderId, payWay
            ).awaitSync()
        }
    }

    private val mCheckPayResult = MutableLiveData<String>()
    val checkPayResult: LiveData<String> get() = mCheckPayResult

    fun checkResult() {
        launch {
            mCheckPayResult.value = ApiMethods.retrofit.topUpCheck(BaseApplication.userToken, globalCashChangeNo, BaseApplication.companyId, 3).awaitSync()
        }
    }

    private val mWhiteBarResult = MutableLiveData<String>()
    val whiteBarResult: LiveData<String> get() = mWhiteBarResult
    //白条单独还款验证
    fun whiteBarPayFinish(orderId: String){
        MyLog.d("立即还款 调用接口了么")
        launch {
            mAfterPayResult.value = ApiMethods.retrofit.whiteBarPayFinish(
                BaseApplication.userToken, orderId
            ).awaitSync()
        }
    }
}
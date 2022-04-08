package com.android.ctgapp.activity.home.shop

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*
import okhttp3.MediaType
import okhttp3.RequestBody

class CheckoutViewModel : BaseViewModel() {


    private val mCreateOrderResult = MutableLiveData<String>()
    val createOrderResult: LiveData<String> get() = mCreateOrderResult

    private val mCurrentPayResult = MutableLiveData<String>()
    val currentPayResult: LiveData<String> get() = mCurrentPayResult

    //结算
    fun createOrder(bean: Any) {
        MyLog.d("我来康康:${getGson().toJson(bean)}")
        val body = RequestBody.create(
            MediaType.parse("application/json; charset=utf-8"),
            getGson().toJson(bean)
        )
        launch {
            mCreateOrderResult.value = ApiMethods.retrofit.createOrder(BaseApplication.userToken, body).awaitSync()
        }
    }

    //继续支付
    fun continueToPay(bean: Any) {
        launch {
            mCurrentPayResult.value = ApiMethods.retrofit.continueToPay(BaseApplication.userToken, handlerBodyEntity(bean)).awaitSync()
        }

    }
}
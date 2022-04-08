package com.android.ctgapp.activity.deal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class OrderDetailViewModel : BaseViewModel() {

    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult


    private val mConfirmResult = MutableLiveData<String>()
    val confirmResult: LiveData<String> get() = mConfirmResult

    private val mCancelResult = MutableLiveData<String>()
    val cancelResult: LiveData<String> get() = mCancelResult

    fun getOrderDetail(orderId: String) {
        launch {
            mResult.value = ApiMethods.retrofit.getOrderDetail(BaseApplication.userToken,orderId).awaitSync()
        }
    }
    fun getOrderDetailByOrderNo(orderNo: String) {
        launch {
            mResult.value = ApiMethods.retrofit.getOrderDetail(BaseApplication.userToken,orderNo = orderNo).awaitSync()
        }
    }
    fun cancelOrder(orderId: String) {
        launch {
            mCancelResult.value = ApiMethods.retrofit.cancelOrder(BaseApplication.userToken, orderId).awaitSync()
        }
    }

    fun confirmGetGoods(orderId: String) {
        launch {
            mConfirmResult.value = ApiMethods.retrofit.confirmGetGoods(BaseApplication.userToken, orderId).awaitSync()
        }
    }

    private val mCreditConfirmResult = MutableLiveData<String>()
    val creditConfirmResult: LiveData<String> get() = mCreditConfirmResult

    fun findOrderSupportWithCredit(orderId: String) {
        launch {
            mCreditConfirmResult.value = ApiMethods.retrofit.findOrderSupportWithCreditV2(BaseApplication.userToken, orderId).awaitSync()
        }
    }
}
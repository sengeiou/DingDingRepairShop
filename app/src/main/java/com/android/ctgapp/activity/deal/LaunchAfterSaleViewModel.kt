package com.android.ctgapp.activity.deal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch
import okhttp3.MultipartBody

class LaunchAfterSaleViewModel : BaseViewModel() {
    private val mApplyResult = MutableLiveData<String>()
    val applyResult: LiveData<String> get() = mApplyResult




    private val mOrderDetailResult = MutableLiveData<String>()
    val orderDetailResult: LiveData<String> get() = mOrderDetailResult

    fun getOrderDetail(orderId: String) {
        launch {
            mOrderDetailResult.value = ApiMethods.retrofit.getCanRefund(BaseApplication.userToken, orderId).awaitSync()
        }
    }


    fun applyForRefund(orderId: String, parts:ArrayList<MultipartBody.Part>){
        launch {
            mApplyResult.value= ApiMethods.retrofit.applyForRefund(BaseApplication.userToken,orderId,parts).awaitSync()
        }
    }
}
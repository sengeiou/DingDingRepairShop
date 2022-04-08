package com.android.ctgapp.activity.deal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch
import okhttp3.MultipartBody

class ReturnGoodsDetailViewModel : BaseViewModel() {
    private val mDetailResult = MutableLiveData<String>()
    val detailResult: LiveData<String> get() = mDetailResult


    private val mCancelResult = MutableLiveData<String>()
    val cancelResult: LiveData<String> get() = mCancelResult

    private val mChangeResult = MutableLiveData<String>()
    val changeResult: LiveData<String> get() = mChangeResult

    fun getReturnGoodsDetail(orderId: String) {
        launch {
            mDetailResult.value = ApiMethods.retrofit.getReturnGoodsDetail(BaseApplication.userToken, orderId).awaitSync()
        }
    }
    fun getReturnGoodsDetailV2(returnNo: String) {
        launch {
            mDetailResult.value = ApiMethods.retrofit.getReturnGoodsDetailV2(BaseApplication.userToken, returnNo).awaitSync()
        }
    }
    //撤销退货
    fun cancelReturnGoodsOrder(returnOrderId: String) {
        launch {
            mCancelResult.value = ApiMethods.retrofit.cancelReturnGoodsOrder(BaseApplication.userToken, returnOrderId).awaitSync()
        }
    }

    //修改退货单
    fun changeForRefund(returnOrderId: String,parts:ArrayList<MultipartBody.Part>){
        launch {
            mChangeResult.value=ApiMethods.retrofit.changeForRefund(BaseApplication.userToken,returnOrderId,parts).awaitSync()
        }
    }

}
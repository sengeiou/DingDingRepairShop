package com.android.ctgapp.activity.mine.whitebar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.handlerBody
import com.android.ctgapp.util.launch

class WhiteBarDealDetailViewModel : BaseViewModel(){
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    fun getData(billNo:String,orderNo:String,sellerCompanyId:Int){
        launch {
           mResult.value= ApiMethods.retrofit.getWhiteBarDetail4(BaseApplication.userToken, handlerBody(
                "billNo" to billNo,
                "companyId"  to BaseApplication.companyId,
                "orderNo" to orderNo
            )).awaitSync()
        }
    }

    private val mOrderDetailResult = MutableLiveData<String>()
    val orderDetailResult: LiveData<String> get() = mOrderDetailResult

    fun getOrderDetail(orderId: String) {
        launch {
            mOrderDetailResult.value = ApiMethods.retrofit.getOrderDetailWhitBar(BaseApplication.userToken, orderId).awaitSync()
        }
    }

}
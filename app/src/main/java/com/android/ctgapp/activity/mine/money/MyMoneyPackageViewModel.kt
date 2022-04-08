package com.android.ctgapp.activity.mine.money

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.handlerBody
import com.android.ctgapp.util.launch
import io.reactivex.Observer
import okhttp3.RequestBody
import okhttp3.ResponseBody

class MyMoneyPackageViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult
    val mOrderResult= MutableLiveData<String>()
    val orderResult: LiveData<String> get() = mOrderResult
    private val mRechargeConfirmResult= MutableLiveData<String>()
    val rechargeConfirmResult: LiveData<String> get() =mRechargeConfirmResult
    fun getList() {
        launch {
            println("clientid:"+BaseApplication.companyId)
            mResult.value = ApiMethods.retrofit.rechargeDetail(BaseApplication.userToken,BaseApplication.companyId).awaitSync()
        }
    }
    fun getRechargeList(companyId:String,clentid:String) {
        launch {
            mResult.value = ApiMethods.retrofit.rechargeActvity(BaseApplication.userToken,companyId,clentid).awaitSync()
        }
    }
    fun getRechargeRecordList(companyId:String,search:String,clientId:String,page:Int) {
        launch {
            mResult.value = ApiMethods.retrofit.getRechargeRecord(token = BaseApplication.userToken,companyId=companyId,search = search,clientId =clientId ,pageNum = page,pageSize = 20).awaitSync()
        }
    }
    /**生成流水单*/
    fun MakeRechargeSerial(body: RequestBody){
       //ApiMethods.apiSubscribe(ApiMethods.retrofit.MakeRechargeSerial(body))
        launch {
            mResult.value = ApiMethods.retrofit.MakeRechargeSerial(body).awaitSync()
        }
    }

    /**充值*/
    fun RechargeSerial(body: RequestBody){
        //ApiMethods.apiSubscribe(ApiMethods.retrofit.MakeRechargeSerial(body))
        launch {
            mOrderResult.value = ApiMethods.retrofit.Recharge(body).awaitSync()
        }
    }
    /**充值*/
    fun RechargeConfirm(body: RequestBody){
        //ApiMethods.apiSubscribe(ApiMethods.retrofit.MakeRechargeSerial(body))
        launch {
            mRechargeConfirmResult.value = ApiMethods.retrofit.RechargeConfirm(body).awaitSync()
        }
    }
    private val mGetStoredCardAmountResult = MutableLiveData<String>()
    val getStoredCardAmountResult: LiveData<String> get() = mGetStoredCardAmountResult
    fun getStoredCardAmount(companyId: String,clientId: String){
        launch {
            mGetStoredCardAmountResult.value = ApiMethods.retrofit.getStoredCardAmount(token = BaseApplication.userToken,companyId=companyId,clientId = clientId).awaitSync()
        }
    }
}
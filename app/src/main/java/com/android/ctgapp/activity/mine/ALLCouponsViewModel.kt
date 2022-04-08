package com.android.ctgapp.activity.mine

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class ALLCouponsViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    fun getCoupons(clientId: String, companyId:String,status:Int) {
        launch {
           // mResult.value = ApiMethods.retrofit.getCoupons(BaseApplication.userToken, BaseApplication.companyId, isOverdue, isUsed, pageNum, 20).awaitSync()
            mResult.value = ApiMethods.retrofit.getCoupons(BaseApplication.userToken, clientId = clientId,companyId =companyId,status = status ).awaitSync()

        }
    }
}
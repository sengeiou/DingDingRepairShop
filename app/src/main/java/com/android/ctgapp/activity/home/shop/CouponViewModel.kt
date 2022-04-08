package com.android.ctgapp.activity.home.shop

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch
import okhttp3.RequestBody

class CouponViewModel:BaseViewModel() {
    private val mCanUseResult = MutableLiveData<String>()
    val canUseResult: LiveData<String> get() = mCanUseResult

    fun getCouponCanUse(body: RequestBody){
        launch {
            mCanUseResult.value=ApiMethods.retrofit.getCouponCanUse(BaseApplication.userToken,body).awaitSync()
        }
    }
}
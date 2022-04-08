package com.android.ctgapp.fragment.deal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*

class DealOrderViewModel : BaseViewModel() {
    private val mOrderResult = MutableLiveData<String>()
    val orderResult: LiveData<String> get() = mOrderResult


    fun getOrder(page: Int, size: Int, type: Int? = null) {
        launch {
            mOrderResult.value = ApiMethods.retrofit.getOrder2(BaseApplication.userToken, BaseApplication.companyId, page, size, type).awaitSync()
        }
    }
}
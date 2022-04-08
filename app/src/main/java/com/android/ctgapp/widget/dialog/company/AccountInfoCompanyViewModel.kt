package com.android.ctgapp.widget.dialog.company

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*
import okhttp3.RequestBody

class AccountInfoCompanyViewModel : BaseViewModel() {
    private val mGetResult = MutableLiveData<String>()
    val getResult: LiveData<String> get() = mGetResult

    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    fun getAccountInfo(companyId:Int) {
        launch {
            mGetResult.value = ApiMethods.retrofit.getAccountInfo(BaseApplication.userToken, companyId).awaitSync()
        }
    }

    fun createAccountInfo(body: RequestBody) {
        launch {
            mResult.value= ApiMethods.retrofit.createAccountInfo(BaseApplication.userToken, body).awaitSync()
        }
    }
    fun updateAccountInfo(body: RequestBody) {
        launch {
            mResult.value= ApiMethods.retrofit.updateAccountInfo(BaseApplication.userToken, body).awaitSync()
        }
    }
}
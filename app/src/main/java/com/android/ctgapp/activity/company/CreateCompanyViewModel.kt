package com.android.ctgapp.activity.company

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch
import okhttp3.RequestBody

class CreateCompanyViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult


    fun createCompany(body: RequestBody) {
        launch {
            mResult.value = ApiMethods.retrofit.createCompany(BaseApplication.userToken, body).awaitSync()
        }
    }
}
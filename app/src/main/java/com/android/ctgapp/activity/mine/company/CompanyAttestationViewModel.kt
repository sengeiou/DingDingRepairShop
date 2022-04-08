package com.android.ctgapp.activity.mine.company

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch
import okhttp3.RequestBody

class CompanyAttestationViewModel : BaseViewModel() {

    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult


    fun getAttestationInfo(companyId:Int) {
        launch {
            mResult.value = ApiMethods.retrofit.getCompanyAuditInfo(BaseApplication.userToken,companyId).awaitSync()
        }
    }


    private val mCreateResult = MutableLiveData<String>()
    val createResult: LiveData<String> get() = mCreateResult
    fun createCompanyAudit(body: RequestBody) {
        launch {
            mCreateResult.value = ApiMethods.retrofit.createCompanyAudit(BaseApplication.userToken, body).awaitSync()
        }
    }


    private val mUpdateResult = MutableLiveData<String>()
    val updateResult: LiveData<String> get() = mUpdateResult
    fun updateCompanyAudit(body: RequestBody) {
        launch {
            mUpdateResult.value = ApiMethods.retrofit.updateCompanyAudit(BaseApplication.userToken, body).awaitSync()
        }
    }
}
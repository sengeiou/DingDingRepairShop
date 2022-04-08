package com.android.ctgapp.activity.company

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*

class SwitchCompanyViewModel : BaseViewModel() {
    private val mCompanyListResult = MutableLiveData<String>()
    val companyListResult: LiveData<String> get() = mCompanyListResult

    private val mCompanyChangeResult = MutableLiveData<String>()
    val companyChangeResult: LiveData<String> get() = mCompanyChangeResult

    fun getCompanyListCanChange() {
        launch {
            mCompanyListResult.value = ApiMethods.retrofit.getCompanyListCanChange(BaseApplication.userToken, "REPAIRSHOP").awaitSync()
        }
    }


    fun changeCompany(companyId: Int) {
        launch {
            mCompanyChangeResult.value = ApiMethods.retrofit.changeCompany(
                BaseApplication.userToken, "common", companyId, handlerBody(
                    "key" to handlerPassword(BuildConfig.ANDROID_KEY),
                    "platform" to BuildConfig.ANDROID_PLATFORM
                )
            ).awaitSync()
        }
    }

    private val mSetDefaultResult = MutableLiveData<String>()
    val setDefaultResult: LiveData<String> get() = mSetDefaultResult

    fun setDefault(companyId: Int) {
        launch {
            mSetDefaultResult.value = ApiMethods.retrofit.setDefaultCompany(BaseApplication.userToken, BaseApplication.userId, companyId).awaitSync()
        }

    }


    private val mLeaveResult = MutableLiveData<String>()
    val leaveResult: LiveData<String> get() = mLeaveResult

    fun leaveCompany(companyId: Int) {
        launch {
            mLeaveResult.value = ApiMethods.retrofit.leaveOrDissolveCompany(BaseApplication.userToken, companyId).awaitSync()
        }
    }

}
package com.android.ctgapp.activity.mine.company

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*

class JoinCompanyByCodeViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    fun joinCompany(code: String) {
        launch {
            mResult.value = ApiMethods.retrofit.joinCompanyByCode(BaseApplication.userToken, handlerBody("invitationCode" to code)).awaitSync()
        }
    }

    private val mUserInfoResult = MutableLiveData<String>()
    val userInfoResult: LiveData<String> get() = mUserInfoResult

    fun getUserInfo() {
        launch {
            mUserInfoResult.value = ApiMethods.retrofit.getUserInfo(BaseApplication.userToken, BaseApplication.userId).awaitSync()
        }
    }

}
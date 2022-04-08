package com.android.ctgapp.activity.mine

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.BuildConfig.APP_CODE
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch
import com.android.ctgapp.util.handlerBody

class UserInfoViewModel : BaseViewModel() {
    private val mUserInfoResult = MutableLiveData<String>()
    val userInfoResult: LiveData<String> get() = mUserInfoResult

    fun findUser(userId: Int) {
        launch {
            mUserInfoResult.value = ApiMethods.retrofit.getUserInfo(BaseApplication.userToken, userId).awaitSync()
        }
    }

    private val mUpdateResult = MutableLiveData<String>()
    val updateResult: LiveData<String> get() = mUpdateResult
    fun checkUpdate(code: String) {
        launch {
            mUpdateResult.value = ApiMethods.retrofit.updateAppCheck(
                handlerBody(
                    "appCode" to APP_CODE,
                    "appVersion" to code
                )
            ).awaitSync()
        }
    }
}
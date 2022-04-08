package com.android.ctgapp.activity.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.handlerPassword
import com.android.ctgapp.util.launch

class ForgetPasswordViewModel : BaseViewModel() {
    private val mAuthCodeResult = MutableLiveData<String>()
    val authCodeResult: LiveData<String> get() = mAuthCodeResult

    private val mConfirmResult = MutableLiveData<String>()
    val confirmResult: LiveData<String> get() = mConfirmResult

    /***获取验证码*/
    fun getAuthCode(phone: String) {
        launch {
            mAuthCodeResult.value = ApiMethods.retrofit.getAuth(phone, "PASSWORD_FORGET").awaitSync()
        }
    }

    /***修改密码确认*/
    fun confirmNewPassword(phone: String, authCode: String, password: String) {
        launch {
            mConfirmResult.value = ApiMethods.retrofit.forgetPassword(phone, authCode, handlerPassword(password)).awaitSync()
        }
    }
}
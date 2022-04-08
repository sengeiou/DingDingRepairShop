package com.android.ctgapp.activity.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*
import okhttp3.RequestBody

class RegisterViewModel : BaseViewModel() {
    private val mAuthCodeResult = MutableLiveData<String>()
    val authCodeResult: LiveData<String> get() = mAuthCodeResult

    private val mConfirmResult = MutableLiveData<String>()
    val confirmResult: LiveData<String> get() = mConfirmResult

    /***获取验证码*/
    fun getAuthCode(phone: String) {
        launch {
            mAuthCodeResult.value = ApiMethods.retrofit.getAuth(phone, "REGISTER").awaitSync()
        }
    }

    /***提交注册*/
    fun userRegister(body: RequestBody) {
        launch {
            mConfirmResult.value= ApiMethods.retrofit.register(body).awaitSync()
        }
    }

    private val mLoginResult = MutableLiveData<String>()
    val loginResult: LiveData<String> get() = mLoginResult

    /***密码登录*/
    fun loginByPassword(phone: String, password: String) {
        launch {
            mLoginResult.value = ApiMethods.retrofit.loginPass(
                "common",
                handlerBody(
                    "telephone" to phone,
                    "password" to handlerPassword(password),
                    "key" to handlerPassword(BuildConfig.ANDROID_KEY),
                    "platform" to BuildConfig.ANDROID_PLATFORM
                )
            ).awaitSync()
        }
    }
}
package com.android.ctgapp.activity.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*

class LoginViewModel : BaseViewModel() {
    private val mAuthCodeResult = MutableLiveData<String>()
    val authCodeResult: LiveData<String> get() = mAuthCodeResult

    private val mLoginResult = MutableLiveData<String>()
    val loginResult: LiveData<String> get() = mLoginResult

    /***获取验证码(登录用)*/
    fun getAuthCode(phone: String) {
        launch {
            mAuthCodeResult.value = ApiMethods.retrofit.getAuth(phone, "LOGIN").awaitSync()
        }
    }

    /***验证码登录*/
    fun loginByAuthCode(phone: String, authCode: String) {
        launch {
            mLoginResult.value = ApiMethods.retrofit.loginAuth(
                "common",
                handlerBody(
                    "telephone" to phone,
                    "code" to authCode,
                    "key" to handlerPassword(BuildConfig.ANDROID_KEY),
                    "platform" to BuildConfig.ANDROID_PLATFORM
                )
            ).awaitSync()
        }
    }

    /***密码登录*/
    fun loginByPassword(phone: String, password: String) {
        MyLog.d("登录账号:$phone")
        MyLog.d("登录密码:$password")
        MyLog.d("登录密码:${handlerPassword(password)}")
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
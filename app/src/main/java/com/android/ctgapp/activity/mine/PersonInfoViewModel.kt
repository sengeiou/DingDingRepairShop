package com.android.ctgapp.activity.mine

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch
import okhttp3.RequestBody

class PersonInfoViewModel : BaseViewModel() {

    private val mUserInfoResult = MutableLiveData<String>()
    val userInfoResult: LiveData<String> get() = mUserInfoResult

    private val mUpdateUserInfoResult = MutableLiveData<String>()
    val updateUserInfoResult: LiveData<String> get() = mUpdateUserInfoResult


    fun changeInfo(body: RequestBody) {
        launch {
            mUpdateUserInfoResult.value = ApiMethods.retrofit.updateUserInfo(BaseApplication.userToken, body).awaitSync()
        }
    }


    //获取用户信息
    fun getUserInfo() {
        launch {
            mUserInfoResult.value = ApiMethods.retrofit.getUserInfo(BaseApplication.userToken).awaitSync()
        }
    }

}
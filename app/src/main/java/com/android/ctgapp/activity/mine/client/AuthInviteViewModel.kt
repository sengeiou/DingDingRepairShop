package com.android.ctgapp.activity.mine.client

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class AuthInviteViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    fun invite(authCode: String) {
        launch {
            mResult.value = ApiMethods.retrofit.addClientWithAuth(BaseApplication.userToken, "upstream", authCode).awaitSync()
        }
    }

}
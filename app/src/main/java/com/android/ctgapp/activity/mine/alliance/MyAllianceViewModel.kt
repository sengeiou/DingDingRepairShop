package com.android.ctgapp.activity.mine.alliance

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class MyAllianceViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    private val mQuiteResult = MutableLiveData<String>()
    val quiteResult: LiveData<String> get() = mQuiteResult

    fun getAlliance() {
        launch {
            mResult.value = ApiMethods.retrofit.getAlliance(BaseApplication.userToken, true, null).awaitSync()
        }
    }

    fun quiteAlliance(id: Int) {
        launch {
            mQuiteResult.value = ApiMethods.retrofit.quiteAlliance(BaseApplication.userToken, id).awaitSync()
        }
    }

}
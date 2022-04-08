package com.android.ctgapp.activity.mine.alliance

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch
import okhttp3.RequestBody

class CreateAllianceViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    //创建联盟 使用创建公司接口
    fun createAlliance(body: RequestBody) {
        launch {
            mResult.value = ApiMethods.retrofit.createCompany(BaseApplication.userToken, body).awaitSync()
        }
    }
}
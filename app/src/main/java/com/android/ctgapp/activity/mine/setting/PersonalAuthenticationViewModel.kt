package com.android.ctgapp.activity.mine.setting

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch
import okhttp3.RequestBody

class PersonalAuthenticationViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    private val mConfirmResult = MutableLiveData<String>()
    val confirmResult: LiveData<String> get() = mConfirmResult

    //获取认证结果
    fun getCertificationResult() {
        launch {
            mResult.value = ApiMethods.retrofit.getCertificationResult(BaseApplication.userToken).awaitSync()
        }
    }

    fun certification(isCreate: Boolean, body: RequestBody) {
        launch {
            if (isCreate) {
                MyLog.d("修改")
                mConfirmResult.value = ApiMethods.retrofit.updateCertification(BaseApplication.userToken, body).awaitSync()
            } else {
                MyLog.d("创建")
                mConfirmResult.value = ApiMethods.retrofit.createCertification(BaseApplication.userToken, body).awaitSync()
            }
        }
    }
}
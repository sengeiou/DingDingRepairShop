package com.android.ctgapp.activity.mine.team

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class ApplyNotifyViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    private val mApplyResult = MutableLiveData<String>()
    val applyResult: LiveData<String> get() = mApplyResult

    fun getList(pageNum: Int) {
        launch {
            mResult.value = ApiMethods.retrofit.getCompanyApply(BaseApplication.userToken, 20, pageNum).awaitSync()
        }
    }

    fun handlerApply(id: Int, isPass: Boolean) {
        launch {
            mApplyResult.value = ApiMethods.retrofit.handlerUserApply(BaseApplication.userToken, id, isPass).awaitSync()
        }
    }
}
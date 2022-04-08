package com.android.ctgapp.activity.mine.whitebar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*

class WhiteBarViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult
    //旧
    fun getWhiteBarList(page: Int, size: Int) {
        launch {
            mResult.value = ApiMethods.retrofit.findWhiteBarV2(BaseApplication.userToken, page, size).awaitSync()
        }
    }

    private val mWhiteBarResult = MutableLiveData<String>()
    val whiteBarResult: LiveData<String> get() = mWhiteBarResult
    fun getWhiteBar() {
        launch {
            mWhiteBarResult.value = ApiMethods.retrofit.getWhiteBar(
                BaseApplication.userToken, handlerBody(
                    "companyId" to BaseApplication.companyId
                )
            ).awaitSync()
        }
    }
}
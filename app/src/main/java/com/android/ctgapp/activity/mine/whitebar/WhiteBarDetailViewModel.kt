package com.android.ctgapp.activity.mine.whitebar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*

class WhiteBarDetailViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    fun getList(billNo: String) {
        launch {
            mResult.value = ApiMethods.retrofit.getWhiteBarDetail(
                BaseApplication.userToken, handlerBody(
                    "companyId" to BaseApplication.companyId,
                    "billNo" to billNo,
                )
            ).awaitSync()
        }
    }


}
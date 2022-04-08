package com.android.ctgapp.activity.mine.whitebar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*

class WhiteBarDetailChildViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    fun getList(billNo: String, companyId: Int) {
        launch {
            mResult.value = ApiMethods.retrofit.getWhiteBarDetailChild(
                BaseApplication.userToken, handlerBody(
                    "companyId" to BaseApplication.companyId,
                    "billNo" to billNo,
                    "agentId" to companyId
                )
            ).awaitSync()
        }
    }
    private val mConfirmResult = MutableLiveData<String>()
    val confirmResult: LiveData<String> get() = mConfirmResult

    fun whiteBarConfirm(billNo: String){
        launch {
            mConfirmResult.value=ApiMethods.retrofit.whiteConfirm(BaseApplication.userToken,billNo,1,0).awaitSync()
        }
    }

}
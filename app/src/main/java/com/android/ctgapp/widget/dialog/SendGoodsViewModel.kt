package com.android.ctgapp.widget.dialog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class SendGoodsViewModel : BaseViewModel() {

    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    fun sendGoods(orderId: String, company: String?, number: String?) {
        MyLog.d("去发货了")
        launch {
            mResult.value = ApiMethods.retrofit.returnOrderCommon(
                BaseApplication.userToken,
                orderId, "WAIT_RECEIVE", company, number
            ).awaitSync()
        }
    }
}
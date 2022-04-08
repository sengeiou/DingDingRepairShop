package com.android.ctgapp.activity.home.shop

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.entity.mine.WhiteBarMorePayBean
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.handlerBodyEntity
import com.android.ctgapp.util.launch

class WhiteBarReturnViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult
    fun whiteBarReturnSingle(orderId: String, repayWay: Int) {
        launch {
            mResult.value = ApiMethods.retrofit.whiteBarReturnSingle(
                BaseApplication.userToken, orderId, repayWay
            ).awaitSync()
        }
    }

    private val mMoreResult = MutableLiveData<String>()
    val moreResult: LiveData<String> get() = mMoreResult

    fun whiteBarReturnMore(payBean: WhiteBarMorePayBean){
        launch {
            mMoreResult.value= ApiMethods.retrofit.whiteBarReturnMore(BaseApplication.userToken,
                handlerBodyEntity(payBean)
                ).awaitSync()
        }
    }

}
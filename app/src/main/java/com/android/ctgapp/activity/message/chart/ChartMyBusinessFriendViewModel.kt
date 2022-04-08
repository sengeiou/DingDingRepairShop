package com.android.ctgapp.activity.message.chart

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class ChartMyBusinessFriendViewModel : BaseViewModel(){

    private val mFriendResult = MutableLiveData<String>()
    val friendResult: LiveData<String> get() = mFriendResult


    fun getFriendInfo(friendId: Int) {
        launch {
            mFriendResult.value = ApiMethods.retrofit.getChartFriendInfo(BaseApplication.userToken, friendId).awaitSync()
        }
    }


}
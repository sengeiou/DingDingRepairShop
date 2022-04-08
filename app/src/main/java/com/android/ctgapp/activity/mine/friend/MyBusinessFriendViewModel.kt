package com.android.ctgapp.activity.mine.friend

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class MyBusinessFriendViewModel : BaseViewModel() {
    private val mFriendResult = MutableLiveData<String>()
    val friendResult: LiveData<String> get() = mFriendResult


    private val mFriendDeleteResult = MutableLiveData<String>()
    val friendDeleteResult: LiveData<String> get() = mFriendDeleteResult

    fun getFriendInfo(friendId: Int) {
        launch {
//            mFriendResult.value = ApiMethods.retrofit.getFriendInfo(globalUserToken, friendId).awaitSync()
            mFriendResult.value = ApiMethods.retrofit.getUserInfoV2(BaseApplication.userToken, friendId, BaseApplication.userId).awaitSync()
        }
    }

    fun businessFriendDelete(id: Int) {
        launch {
            mFriendDeleteResult.value = ApiMethods.retrofit.businessFriendDelete(BaseApplication.userToken, id).awaitSync()
        }
    }


}
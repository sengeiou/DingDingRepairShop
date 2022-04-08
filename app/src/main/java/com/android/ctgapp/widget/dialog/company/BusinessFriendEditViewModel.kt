package com.android.ctgapp.widget.dialog.company

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class BusinessFriendEditViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    fun updateBusinessFriend(id: Int, groupId:Int?,friendRemark:String) {
        launch {
            mResult.value = ApiMethods.retrofit.updateBusinessFriend(BaseApplication.userToken, id, groupId ,friendRemark).awaitSync()
        }
    }


    private val mAddResult = MutableLiveData<String>()
    val addResult: LiveData<String> get() = mAddResult

    fun addFriend(friendUserId: Int, groupId: Int?,remark:String?) {
        launch {
            mAddResult.value = ApiMethods.retrofit.addBusinessFriend(BaseApplication.userToken, friendUserId, groupId,remark).awaitSync()
        }
    }
}
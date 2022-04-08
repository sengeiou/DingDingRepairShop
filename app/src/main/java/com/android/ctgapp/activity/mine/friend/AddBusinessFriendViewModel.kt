package com.android.ctgapp.activity.mine.friend

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class AddBusinessFriendViewModel : BaseViewModel() {
    private val mPhoneNumResult = MutableLiveData<String>()
    val phoneNumResult: LiveData<String> get() = mPhoneNumResult

    private val mInviteUserResult = MutableLiveData<String>()
    val inviteUserResult: LiveData<String> get() = mInviteUserResult

    fun getAllPhoneNum() {
        launch {
            mPhoneNumResult.value = ApiMethods.retrofit.getFriendsPhoneNum(BaseApplication.userToken).awaitSync()
        }
    }

    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    fun addFriend(friendUserId: Int, groupId: Int?, remark: String) {
        val id: Int? = if (groupId == -1) null else groupId
        val mark:String?=if (remark.isEmpty()) null else remark

        launch {
            mResult.value = ApiMethods.retrofit.addBusinessFriend(BaseApplication.userToken, friendUserId, id, mark).awaitSync()
        }
    }

    //邀请用户注册
    fun inviteUser(phone: String) {
        launch {
            mInviteUserResult.value = ApiMethods.retrofit.inviteUser(BaseApplication.userToken, phone).awaitSync()
        }
    }

    private val mUserResult = MutableLiveData<String>()
    val userResult: LiveData<String> get() = mUserResult

    //查找用户
    fun findUser(phone: String) {
        launch {
            mUserResult.value = ApiMethods.retrofit.findUser(BaseApplication.userToken, "one", phone).awaitSync()
        }
    }
}
package com.android.ctgapp.activity.mine.friend

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class AddSelectGroupViewModel : BaseViewModel() {

    private val mGroupResult = MutableLiveData<String>()
    val groupResult: LiveData<String> get() = mGroupResult

    fun getGroup() {
        launch {
            mGroupResult.value = ApiMethods.retrofit.getCustomFriendGroup(BaseApplication.userToken).awaitSync()
        }
    }

}
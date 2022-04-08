package com.android.ctgapp.activity.mine.friend

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class CustomGroupSettingViewModel : BaseViewModel() {
    private val mCustomFriendGroup = MutableLiveData<String>()
    val customFriendGroup: LiveData<String> get() = mCustomFriendGroup


    private val mCommonResult = MutableLiveData<String>()
    val commonGroup: LiveData<String> get() = mCommonResult

    /***获取自定义商友分组*/
    fun findCustomIndustry() {
        launch {
            mCustomFriendGroup.value = ApiMethods.retrofit.getCustomFriendGroup(BaseApplication.userToken).awaitSync()
        }
    }

    /***删除自定义分组商友*/
    fun deleteGroup(id: Int) {
        launch {
            mCommonResult.value = ApiMethods.retrofit.deleteGroup(BaseApplication.userToken, id).awaitSync()
        }
    }

    /***添加分组*/
    fun addGroup(groupName: String) {
        launch {
            mCommonResult.value = ApiMethods.retrofit.addGroup(BaseApplication.userToken, groupName).awaitSync()
        }
    }
    /***编辑分组*/
    fun editGroup(groupId:Int,groupName: String) {
        launch {
            mCommonResult.value = ApiMethods.retrofit.updateGroup(BaseApplication.userToken,groupId, groupName).awaitSync()
        }
    }

}
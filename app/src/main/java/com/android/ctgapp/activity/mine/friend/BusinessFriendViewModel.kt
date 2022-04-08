package com.android.ctgapp.activity.mine.friend

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.entity.BusinessFriendGroupEntity
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*
import okhttp3.MediaType
import okhttp3.RequestBody

class BusinessFriendViewModel : BaseViewModel() {
    private val mAllResult = MutableLiveData<String>()
    val allResult: LiveData<String> get() = mAllResult

    private val mCustomFriendGroup = MutableLiveData<String>()
    val customFriendGroup: LiveData<String> get() = mCustomFriendGroup

    private val mSaveGroupResult = MutableLiveData<String>()
    val saveGroupResult: LiveData<String> get() = mSaveGroupResult

    /***查询所有*/
    fun findAll() {
        MyLog.d("查询所有")
        launch {
            mAllResult.value = ApiMethods.retrofit.getFriendALL(BaseApplication.userToken).awaitSync()
        }
    }

    /***根据修理厂等字段查询*/
    fun findByIndustry(industry: String) {
        MyLog.d("获取字段的内容:$industry")
        launch {
            mAllResult.value = ApiMethods.retrofit.getFriendByIndustry(BaseApplication.userToken, industry).awaitSync()
        }
    }

    /***根据自定义Group的ID查询*/
    fun findByIndustry(id: Int) {
        MyLog.d("获取友商了么:$id")
        launch {
            mAllResult.value = ApiMethods.retrofit.getFriendById(BaseApplication.userToken, id).awaitSync()
        }
    }

    /***获取自定义商友分组*/
    fun getCustomGroup() {
        launch {
            mCustomFriendGroup.value = ApiMethods.retrofit.getCustomFriendGroup(BaseApplication.userToken).awaitSync()
        }
    }

    /***批量修改自定义商友选中状态*/
    fun bulkEditGroup(mList: ArrayList<BusinessFriendGroupEntity.DataBean>) {
        launch {
            mSaveGroupResult.value= ApiMethods.retrofit.bulkUpdateGroup(
                BaseApplication.userToken, RequestBody.create(
                    MediaType.parse("application/json; charset=utf-8"),
                    getGson().toJson(mList)
                )
            ).awaitSync()
        }
    }
}
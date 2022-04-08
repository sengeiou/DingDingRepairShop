package com.android.ctgapp.activity.home.shop

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.entity.home.ChangesSelectBean
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*
import okhttp3.MediaType
import okhttp3.RequestBody

class TrolleyViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    private val mChangesSelectResult = MutableLiveData<String>()
    val changesSelectResult: LiveData<String> get() = mChangesSelectResult

    private val mTrolleyResult = MutableLiveData<String>()
    val trolleyResult: LiveData<String> get() = mTrolleyResult

    private val mTrolleyDeleteResult = MutableLiveData<String>()
    val trolleyDeleteResult: LiveData<String> get() = mTrolleyDeleteResult
    fun getTrolley() {
        launch {
            mResult.value = ApiMethods.retrofit.getTrolley(BaseApplication.userToken, BaseApplication.companyId).awaitSync()
        }
    }

    //商品数量变更
    fun trolleyChangeCount(trolleyId: Int, num: Int) {
        launch {
            mTrolleyResult.value = ApiMethods.retrofit.trolleyChangeCount(
                BaseApplication.userToken, handlerBody(
                    "id" to trolleyId.handlerNull(),
                    "num" to num.handlerNull()
                )
            ).awaitSync()
        }
    }

    //删除商品
    fun trolleyDelete(trolleyIds: List<Int>) {
        if (trolleyIds.isNotEmpty()) {
            launch {
                val map = HashMap<String, List<Int>>()
                map["ids"] = trolleyIds
                val body = RequestBody.create(
                    MediaType.parse("application/json; charset=utf-8"),
                    getGson().toJson(map)
                )

                mTrolleyDeleteResult.value = ApiMethods.retrofit.trolleyDelete(
                    BaseApplication.userToken, body
                ).awaitSync()
            }
        }
    }

    //批量修改选中状态
    fun changesSelect(ids: List<Int>, isSelected: Int) {
        if (ids.isNotEmpty()) {
            val changesSelectBean = ChangesSelectBean(
                ids, isSelected
            )
            launch {
                val body = RequestBody.create(
                    MediaType.parse("application/json; charset=utf-8"),
                    getGson().toJson(changesSelectBean)
                )
                mChangesSelectResult.value = ApiMethods.retrofit.changesSelect(BaseApplication.userToken, body).awaitSync()
            }
        }
    }
}
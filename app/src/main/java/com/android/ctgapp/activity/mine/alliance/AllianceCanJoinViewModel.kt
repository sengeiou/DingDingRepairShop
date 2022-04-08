package com.android.ctgapp.activity.mine.alliance

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch
import okhttp3.RequestBody

class AllianceCanJoinViewModel : BaseViewModel() {
    private val mUnJoinResult = MutableLiveData<String>()
    val unJoinResult: LiveData<String> get() = mUnJoinResult

    private val mJoinResult = MutableLiveData<String>()
    val joinResult: LiveData<String> get() = mJoinResult

    fun getAllianceUnJoin(search: String) {
        var s: String? = null
        if (search.isNotEmpty()) {
            s = search
        }
        launch {
            mUnJoinResult.value = ApiMethods.retrofit.getAlliance(BaseApplication.userToken, null, s).awaitSync()
        }
    }

    fun applyJoinAlliance(body: RequestBody) {
        launch {
            mJoinResult.value = ApiMethods.retrofit.applyJoinAlliance(BaseApplication.userToken, "BE_ALLIANCE_CLIENT", body).awaitSync()
        }
    }

}
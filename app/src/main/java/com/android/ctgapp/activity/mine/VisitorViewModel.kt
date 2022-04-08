package com.android.ctgapp.activity.mine

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class VisitorViewModel : BaseViewModel() {
    private val mListResult = MutableLiveData<String>()
    val listResult: LiveData<String> get() = mListResult


    private val mLineResult = MutableLiveData<String>()
    val lineResult: LiveData<String> get() = mLineResult

    fun getLine() {
        launch {
            mLineResult.value = ApiMethods.retrofit.getVisitorLine(BaseApplication.userToken, BaseApplication.userId, 30).awaitSync()
        }
    }

    fun getList() {
        launch {
            mListResult.value = ApiMethods.retrofit.getVisitorList(BaseApplication.userToken, BaseApplication.userId, 30).awaitSync()
        }
    }
}
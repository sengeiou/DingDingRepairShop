package com.android.ctgapp.widget.dialog.company

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class CarSeriesSelectViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    fun findSomeThing(code: String) {
        launch {
            mResult.value = ApiMethods.retrofit.getDict(BaseApplication.userToken, code).awaitSync()
        }

    }
}
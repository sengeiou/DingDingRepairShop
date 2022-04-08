package com.android.ctgapp.activity.mine.whitebar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class PrepaymentViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    fun getNoBillList() {
        launch {
//            mResult.value = ApiMethods.retrofit.getNoBillList(BaseApplication.userToken, BaseApplication.companyId).awaitSync()
            mResult.value = ApiMethods.retrofit.getNoBillList(BaseApplication.userToken, 12345).awaitSync()
        }
    }

}
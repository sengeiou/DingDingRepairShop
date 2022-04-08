package com.android.ctgapp.activity.deal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.util.launch

class OrderViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

//    fun getOrder(page: Int) {
//        launch {
//            mResult.value= ApiMethods.retrofit.getOrder(globalUserToken, page, BaseApplication.companyId, 1, null).awaitSync()
//        }
//    }
}
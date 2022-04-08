package com.android.ctgapp.activity.mine.client

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class ClientManagementViewModel : BaseViewModel() {
    private val mClientResult = MutableLiveData<String>()
    val clientResult: LiveData<String> get() = mClientResult

    fun getClientList(clientType: String, searchText: String, pageSize: Int, pageNum: Int) {
        launch {
            mClientResult.value = ApiMethods.retrofit.getClientList(BaseApplication.userToken, clientType,"page" ,searchText, pageNum, pageSize).awaitSync()
        }
    }


    private val mRemoveResult = MutableLiveData<String>()
    val removeResult: LiveData<String> get() = mRemoveResult
    fun removeClient(clientType: String, clientId: String) {
        launch {
            mRemoveResult.value = ApiMethods.retrofit.removeClient(clientType, clientId).awaitSync()
        }
    }
}
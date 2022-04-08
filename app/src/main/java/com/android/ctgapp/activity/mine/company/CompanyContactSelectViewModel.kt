package com.android.ctgapp.activity.mine.company

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class CompanyContactSelectViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult


    fun getTeamList(search: String, pageSize: Int, pageNum: Int) {
        var searchText: String? = null
        if (search.isNotEmpty()) {
            searchText = search
        }
        launch {
            mResult.value = ApiMethods.retrofit.getCompanyContactUnAdd(BaseApplication.userToken, searchText, pageNum, pageSize).awaitSync()
        }
    }
}
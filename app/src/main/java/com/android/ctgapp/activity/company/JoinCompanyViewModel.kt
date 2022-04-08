package com.android.ctgapp.activity.company

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class JoinCompanyViewModel : BaseViewModel() {
    private val mCompanyListResult = MutableLiveData<String>()
    val companyListResult: LiveData<String> get() = mCompanyListResult

    private val mCompanyJoinResult = MutableLiveData<String>()
    val companyJoinResult: LiveData<String> get() = mCompanyJoinResult

    fun getCompanyList(search: String, pageNum: Int, pageSize: Int) {
        var query: String? = null
        if (search.isNotEmpty()) {
            query = search
        }
        launch {
            mCompanyListResult.value = ApiMethods.retrofit.getCompanyCanJoin(BaseApplication.userToken, "REPAIRSHOP", query, pageNum, pageSize).awaitSync()
        }

    }


    fun applyJoinCompany(companyId: Int) {
        launch {
            mCompanyJoinResult.value = ApiMethods.retrofit.applyJoinCompany(BaseApplication.userToken, companyId).awaitSync()
        }
    }
}
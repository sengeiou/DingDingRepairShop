package com.android.ctgapp.activity.mine.client

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class AddClientViewModel : BaseViewModel() {

    private val mListResult = MutableLiveData<String>()
    val listResult: LiveData<String> get() = mListResult


    //获取列表
    fun getList(pageNum: Int, pageSize: Int, search: String, searchCode: String) {
        var mSearch: String? = null
        var mSearchCode: String? = null
        if (search.isNotEmpty()) {
            mSearch = search
        }
        if (searchCode.isNotEmpty()) {
            mSearchCode = searchCode
        }
        launch {
            mListResult.value = ApiMethods.retrofit.getClientForAdd(BaseApplication.userToken, "upstream", "page", pageNum, pageSize, mSearch, mSearchCode).awaitSync()
        }
    }

    private val mAddResult = MutableLiveData<String>()
    val addResult: LiveData<String> get() = mAddResult

    //添加客户
    fun addClient(companyId: Int) {
        launch {
            mAddResult.value = ApiMethods.retrofit.addClient(BaseApplication.userToken, "upstream", companyId).awaitSync()
        }
    }

}
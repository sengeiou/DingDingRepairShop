package com.android.ctgapp.activity.mine.team

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class MyTeamViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    private val mDepartmentResult = MutableLiveData<String>()
    val departmentResult: LiveData<String> get() = mDepartmentResult

    fun getTeamList(search: String? = null, departmentId: Int? = null, isManager: Boolean? = null, labelId: Int) {
        var searchText: String? = null
        search?.let {
            if (it.isNotEmpty()) {
                searchText = it
            }
        }
        //部门ID
        var id: Int? = null
        departmentId?.let {
            if (it != -1) {
                id = it
            }
        }
        //职位ID
        var lId: Int? = null
        if (labelId != -1) {
            lId = labelId
        }

        launch {
            if (id == null) {
                mResult.value = ApiMethods.retrofit.getDepartments(BaseApplication.userToken, searchText, isManager, lId).awaitSync()
            } else {
                //搜索职位
                mResult.value = ApiMethods.retrofit.getDepartments(BaseApplication.userToken, id!!, searchText, isManager, lId).awaitSync()
            }
        }
    }

    fun getDepartmentList() {
        launch {
            mDepartmentResult.value = ApiMethods.retrofit.getDepartmentMenu(BaseApplication.userToken).awaitSync()
        }
    }
}
package com.android.ctgapp.activity.mine.team

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class DepartmentSelectViewModel : BaseViewModel() {
    private val mDepartmentListResult = MutableLiveData<String>()
    val departmentListResult: LiveData<String> get() = mDepartmentListResult

    private val mAddDepartmentResult = MutableLiveData<String>()
    val addDepartmentResult: LiveData<String> get() = mAddDepartmentResult

    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    fun getDepartment(departmentId: Int) {
        launch {
            mDepartmentListResult.value = ApiMethods.retrofit.getDepartmentMenu(BaseApplication.userToken, departmentId).awaitSync()
        }
    }

    fun addDepartment(parentDepartmentName: String, parentDepartmentId: Int? = null) {
        launch {
            if (parentDepartmentId == null || parentDepartmentId == 0) {
                mAddDepartmentResult.value = ApiMethods.retrofit.addDepartment(BaseApplication.userToken, parentDepartmentName).awaitSync()
            } else {
                MyLog.d("走的是这里么:$parentDepartmentId")
                mAddDepartmentResult.value = ApiMethods.retrofit.addDepartment(BaseApplication.userToken, parentDepartmentId, parentDepartmentName).awaitSync()
            }
        }
    }

    fun editDepartment(departmentName: String, departmentId: Int) {
        launch {
            mResult.value = ApiMethods.retrofit.updateDepartment(BaseApplication.userToken, departmentId, departmentName).awaitSync()
        }
    }

    fun deleteDepartment(departmentId: Int) {
        launch {
            mResult.value = ApiMethods.retrofit.deleteDepartment(BaseApplication.userToken, departmentId).awaitSync()
        }
    }
}
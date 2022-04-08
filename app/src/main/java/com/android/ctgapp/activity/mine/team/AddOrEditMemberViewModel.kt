package com.android.ctgapp.activity.mine.team

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*
import com.google.gson.Gson
import okhttp3.MediaType
import okhttp3.RequestBody

class AddOrEditMemberViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    private val mUserResult = MutableLiveData<String>()
    val userResult: LiveData<String> get() = mUserResult

    fun addMember(departmentId: Int, userNo: String, userId: Int, labelId: Int?, isAdmin: Boolean) {
        launch {
            val map = HashMap<String, Any>()

//            if (userNo.isNotEmpty()) {
            map["userNo"] = userNo
//            }
            map["userId"] = userId
            if (labelId != -1 && labelId != null) {
                map["positionLabelId"] = labelId
            }

            if (departmentId != -1) {
                map["departmentId"] = departmentId
            }
            if (isAdmin) {
                map["isCompanyAdmin"] = THE_TRUE
            } else {
                map["isCompanyAdmin"] = THE_FALSE
            }

            val body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"),
                Gson().toJson(map)
            )
            mResult.value = ApiMethods.retrofit.addMember(BaseApplication.userToken, body).awaitSync()
        }
    }

    fun addMemberAutoRegister(departmentId: Int, userNo: String, labelId: Int?, isAdmin: Boolean, phone: String, name: String) {
        launch {
            val map = HashMap<String, Any>()

//            if (userNo.isNotEmpty()) {
            map["userNo"] = userNo
            map["autoRegister"] = true
            map["telephone"] = phone
            map["userName"] = name

//            }
            if (labelId != -1 && labelId != null) {
                map["positionLabelId"] = labelId
            }

            if (departmentId != -1) {
                map["departmentId"] = departmentId
            }
            if (isAdmin) {
                map["isCompanyAdmin"] = THE_TRUE
            } else {
                map["isCompanyAdmin"] = THE_FALSE
            }

            val body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"),
                Gson().toJson(map)
            )
            mResult.value = ApiMethods.retrofit.addMember(BaseApplication.userToken, body).awaitSync()
        }
    }

    fun removeMember(userId: Int) {
        launch {
            mResult.value = ApiMethods.retrofit.removeMember(BaseApplication.userToken, userId).awaitSync()
        }
    }


    fun editMember(oldDepartmentId: Int?, newDepartmentId: Int, userId: Int, userNo: String, labelId: Int?, isAdmin: Boolean) {

        val map = HashMap<String, Any>()
        if (userNo.isNotEmpty()) {
            map["userNo"] = userNo
        }
        if (oldDepartmentId != null && oldDepartmentId != -1) {
            map["departmentId"] = oldDepartmentId
        }
        if (newDepartmentId != -1) {
            map["newDepartmentId"] = newDepartmentId
        }
        if (labelId != -1 && labelId != null) {
            map["positionLabelId"] = labelId
        }
        if (isAdmin) {
            map["isCompanyAdmin"] = THE_TRUE
        } else {
            map["isCompanyAdmin"] = THE_FALSE
        }


        val body = RequestBody.create(
            MediaType.parse("application/json; charset=utf-8"),
            Gson().toJson(map)
        )
        launch {
            mResult.value = ApiMethods.retrofit.editMember(BaseApplication.userToken, userId, body).awaitSync()
        }

    }

    fun findUser(phone: String) {
        launch {
            mUserResult.value = ApiMethods.retrofit.findUser(BaseApplication.userToken, "one", phone).awaitSync()
        }
    }
}
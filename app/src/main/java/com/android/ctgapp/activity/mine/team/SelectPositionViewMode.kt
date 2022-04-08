package com.android.ctgapp.activity.mine.team

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class SelectPositionViewMode : BaseViewModel() {
    private val mGetLabelResult = MutableLiveData<String>()
    val getLabelResult: LiveData<String> get() = mGetLabelResult

    private val mAddLabelResult = MutableLiveData<String>()
    val addLabelResult: LiveData<String> get() = mAddLabelResult


    fun getLabels() {
        launch {
            mGetLabelResult.value = ApiMethods.retrofit.getLabels(BaseApplication.userToken, "EMPLOYEE", BaseApplication.companyId).awaitSync()
        }
    }

    fun addLabel(label: String) {
        launch {
            mAddLabelResult.value = ApiMethods.retrofit.addLabel(BaseApplication.userToken, "EMPLOYEE", label).awaitSync()
        }
    }

}
package com.android.ctgapp.fragment.mine

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class MineFragmentViewModel : BaseViewModel() {

    private val mCompanyDetailResult = MutableLiveData<String>()
    val companyDetailResult: LiveData<String> get() = mCompanyDetailResult

    //通用修改回调
    private val mCommonUpdateResult = MutableLiveData<String>()
    val commonUpdateResult: LiveData<String> get() = mCommonUpdateResult


    private val mUserInfoResult = MutableLiveData<String>()
    val userInfoResult: LiveData<String> get() = mUserInfoResult

    fun getCompanyDetail() {
        launch {
            mCompanyDetailResult.value = ApiMethods.retrofit.getMyCompany(BaseApplication.userToken).awaitSync()
        }
    }

    //获取用户信息
    fun getUserInfo() {
        launch {
            mUserInfoResult.value = ApiMethods.retrofit.getUserInfo(BaseApplication.userToken).awaitSync()
        }
    }


}
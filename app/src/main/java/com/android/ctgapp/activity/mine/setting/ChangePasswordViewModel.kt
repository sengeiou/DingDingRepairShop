package com.android.ctgapp.activity.mine.setting

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*

class ChangePasswordViewModel : BaseViewModel() {
    private val mChangeResult = MutableLiveData<String>()
    val changeResult: LiveData<String> get() = mChangeResult
    fun updatePassword(old: String, new: String) {
        launch {
            mChangeResult.value = ApiMethods.retrofit.changePassword(
                BaseApplication.userToken, handlerPassword(old), handlerPassword(new)
            ).awaitSync()
        }
    }
}
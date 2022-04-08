package com.android.ctgapp.activity.address

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch
import okhttp3.RequestBody

class AddressEditViewModel : BaseViewModel() {

    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult


    fun createAddress(body: RequestBody) {
        launch {
            mResult.value = ApiMethods.retrofit.createAddress(BaseApplication.userToken, body).awaitSync()
        }
    }


    fun updateAddress(addressId: String, body: RequestBody) {
        launch {
            mResult.value = ApiMethods.retrofit.updateAddress(BaseApplication.userToken, addressId, body).awaitSync()
        }
    }

}
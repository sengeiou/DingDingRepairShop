package com.android.ctgapp.activity.address

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.entity.AddressEntity
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*
import okhttp3.MediaType
import okhttp3.RequestBody

class AddressListViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    private val mDefaultResult = MutableLiveData<String>()
    val defaultResult: LiveData<String> get() = mDefaultResult

    private val mDeleteResult = MutableLiveData<String>()
    val deleteResult: LiveData<String> get() = mDeleteResult


    fun getAddress() {
        launch {
            mResult.value = ApiMethods.retrofit.getAddress(BaseApplication.userToken).awaitSync()
        }
    }

    fun setDefault(bean: AddressEntity.DataBean) {
        val body = RequestBody.create(
            MediaType.parse("application/json; charset=utf-8"),
            getGson().toJson(bean)
        )
        launch {
            mDefaultResult.value = ApiMethods.retrofit.updateAddress(BaseApplication.userToken, bean.id.handlerNull(), body).awaitSync()
        }
    }


    fun deleteAddress(id: String) {
        launch {
            mDeleteResult.value = ApiMethods.retrofit.deleteAddress(BaseApplication.userToken, id).awaitSync()
        }
    }

}
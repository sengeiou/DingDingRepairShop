package com.android.ctgapp.activity.home.shop

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.util.ArrayList

class EnquiryViewModel : BaseViewModel() {
    private val mAddPartResult = MutableLiveData<String>()
    val addPartResult: LiveData<String> get() = mAddPartResult

    fun getBatchAddPatch() {
        launch {
            mAddPartResult.value = ApiMethods.retrofit.batchAddParts(BaseApplication.userToken).awaitSync()
        }
    }

    private val mCompanyResult = MutableLiveData<String>()
    val companyResult: LiveData<String> get() = mCompanyResult
    fun queryGetCompany(carRange: String) {
        MyLog.d("你自己看你传的啥:$carRange")
        launch {
            mCompanyResult.value = ApiMethods.retrofit.queryGetCompany(carRange).awaitSync()
        }
    }

    private val mSubmitResult = MutableLiveData<String>()
    val submitResult: LiveData<String> get() = mSubmitResult
    fun submitOrder(body: RequestBody) {
        launch {
            mSubmitResult.value = ApiMethods.retrofit.submitEnquiryOrder(body).awaitSync()
        }
    }

    private val mImagesResult = MutableLiveData<String>()
    val imagesResult: LiveData<String> get() = mImagesResult

    /**多图上传*/
    fun uploadImage(img: ArrayList<MultipartBody.Part>) {
        launch {
            mImagesResult.value = ApiMethods.retrofit.enquiryUploadImage(img).awaitSync()
        }
    }

}
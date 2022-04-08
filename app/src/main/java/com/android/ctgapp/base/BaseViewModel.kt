package com.android.ctgapp.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch
import okhttp3.MediaType
import okhttp3.MultipartBody

import okhttp3.RequestBody
import java.io.File


/**
 *作者:LiBW
 *创建日期: 2020/9/3
 *描述: ViewModel基类
 */
open class BaseViewModel : ViewModel() {
    private val mError: MutableLiveData<String> = MutableLiveData()
    val error: LiveData<String> get() = mError


    private val mFileResult: MutableLiveData<String> = MutableLiveData()
    val fileResult: LiveData<String> get() = mFileResult


    private val mFileResultWithFileName: MutableLiveData<String> = MutableLiveData()
    val fileResultWithFileName: LiveData<String> get() = mFileResultWithFileName

    fun setError(msg: String) {
        mError.value = msg
    }

    fun upLoadFile(file: File) {
        launch {
            val requestFile: RequestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file)
            val part = MultipartBody.Part.createFormData("file", file.name, requestFile)
            mFileResult.value = ApiMethods.retrofit.uploadImage(BaseApplication.userToken, part).awaitSync()
        }
    }


    fun upLoadFileResultFileName(file: File){
        launch {
            val list=ArrayList<MultipartBody.Part>()
            val requestFile: RequestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file)
            val part = MultipartBody.Part.createFormData("file", file.name, requestFile)
            val part1=MultipartBody.Part.createFormData("withFilename","true")
            list.add(part)
            list.add(part1)
            mFileResultWithFileName.value = ApiMethods.retrofit.uploadFileReturnOldFileName(BaseApplication.userToken, list).awaitSync()
        }
    }
}
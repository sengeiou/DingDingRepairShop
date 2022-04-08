package com.android.ctgapp.activity.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*

class VinSearchViewModel : BaseViewModel() {
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult

    fun getCarInfo(vin: String) {
        launch {
//            if (BuildConfig.APPLICATION_ID==MyConstants.APPLICATION_ID_WL){
//                mResult.value = ApiMethods.retrofit.getCarByVINWL(
//                    BaseApplication.userToken, handlerBody(
//                        "vin" to vin
//                    )
//                ).awaitSync()
//            }else{
//                mResult.value = ApiMethods.retrofit.getCarByVIN(
//                    BaseApplication.userToken, handlerBody(
//                        "vin" to vin
//                    )
//                ).awaitSync()
//            }
            //所有版本都只用这个接口
                mResult.value = ApiMethods.retrofit.getCarByVINWL(
                    BaseApplication.userToken, handlerBody(
                        "vin" to vin
                    )
                ).awaitSync()

        }
    }
}
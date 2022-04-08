package com.android.ctgapp.activity.home.enquiry

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.handlerBody
import com.android.ctgapp.util.launch

class BatchAddPartViewModel : BaseViewModel() {
    private val mPartSearchChildResult = MutableLiveData<String>()
    val partSearchChildResult: LiveData<String> get() = mPartSearchChildResult

    fun searchBathAddPartsChild(categoryId: String, carid: String,epc:String) {
        launch {
            val map=HashMap<String,HashMap<String,String>>()
            val map1=HashMap<String,String>()
            map1["simpleCategoryId"]=categoryId
            map1["carid"]=carid
            map1["categoryType"]="CTG"
            map["epcBoomData"]=map1


            mPartSearchChildResult.value = ApiMethods.retrofit.searchBathAddParts(
                BaseApplication.userToken, handlerBody(map
                )
            ).awaitSync()
        }
    }

//    private val mPartSearchParentResult = MutableLiveData<String>()
//    val partSearchParentResult: LiveData<String> get() = mPartSearchParentResult
//
//    fun searchBathAddPartsParent(categoryId: String, carId: String) {
//        launch {
//            mPartSearchParentResult.value = ApiMethods.retrofit.searchBathAddPartsParent(
//                globalUserToken, handlerBody(
//                    "categoryId" to categoryId,
//                    "carid" to carId,
//                    "categoryType" to "EPC"
//                )
//            ).awaitSync()
//        }
//    }
}
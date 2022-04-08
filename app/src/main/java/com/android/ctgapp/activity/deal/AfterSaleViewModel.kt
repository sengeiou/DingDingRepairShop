package com.android.ctgapp.activity.deal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*

class AfterSaleViewModel : BaseViewModel() {
    private val mListResult = MutableLiveData<String>()
    val listResult: LiveData<String> get() = mListResult

    fun getList(pageNum: Int, pageSize: Int, statueCode: Int?,isFinished:Boolean?) {

        launch {
            if (statueCode==5){
                mListResult.value = ApiMethods.retrofit.getSalesReturn(BaseApplication.userToken, BaseApplication.companyId.handlerNull(), pageNum, pageSize, null,isFinished,1).awaitSync()
            }else{
                mListResult.value = ApiMethods.retrofit.getSalesReturn(BaseApplication.userToken, BaseApplication.companyId.handlerNull(), pageNum, pageSize, statueCode,isFinished,null).awaitSync()

            }
        }

    }
}
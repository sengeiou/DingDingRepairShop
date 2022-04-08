package com.android.ctgapp.widget.dialog.company

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.*
import okhttp3.RequestBody

class InvoiceInfoCompanyViewModel : BaseViewModel() {
    private val mGetInvoiceResult = MutableLiveData<String>()
    val getInvoiceResult: LiveData<String> get() = mGetInvoiceResult

    private val mCreateInvoiceResult = MutableLiveData<String>()
    val createInvoiceResult: LiveData<String> get() = mCreateInvoiceResult
    fun getInvoiceInfo(companyId:Int) {
        launch {
            mGetInvoiceResult.value = ApiMethods.retrofit.getInvoiceInfo(BaseApplication.userToken, companyId).awaitSync()
        }
    }

    fun createInvoice(body: RequestBody) {
        launch {
            mCreateInvoiceResult.value = ApiMethods.retrofit.createInvoiceInfo(BaseApplication.userToken, body).awaitSync()
        }
    }

    fun updateInvoice(body: RequestBody) {
        MyLog.d("我进行更新了")
        launch {
            mCreateInvoiceResult.value = ApiMethods.retrofit.updateInvoiceInfo(BaseApplication.userToken, body).awaitSync()
        }
    }

}
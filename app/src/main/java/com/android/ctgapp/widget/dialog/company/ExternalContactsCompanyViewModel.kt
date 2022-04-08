package com.android.ctgapp.widget.dialog.company

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class ExternalContactsCompanyViewModel :BaseViewModel(){
    //对外联系人
    private val mLinkmanResult = MutableLiveData<String>()
    val linkmanResult: LiveData<String> get() = mLinkmanResult

    //获取对外联系人
    fun getExternalContact(companyId:Int) {
        launch {
            mLinkmanResult.value = ApiMethods.retrofit.getLinkman(BaseApplication.userToken,companyId).awaitSync()
        }
    }
}
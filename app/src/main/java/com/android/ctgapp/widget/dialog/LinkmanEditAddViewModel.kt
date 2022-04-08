package com.android.ctgapp.widget.dialog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.handlerBody
import com.android.ctgapp.util.launch

class LinkmanEditAddViewModel : BaseViewModel() {

    private val mLinkmanResult = MutableLiveData<String>()
    val mResult: LiveData<String> get() = mLinkmanResult

    fun updateLinkman(id: Int, remark: String) {
        MyLog.d("触发了修改")
        launch {
            mLinkmanResult.value = ApiMethods.retrofit.updateLinkman(BaseApplication.userToken, id, remark).awaitSync()
        }
    }

    fun deleteLinkman(id: Int) {
        MyLog.d("触发了删除")
        launch {
            mLinkmanResult.value = ApiMethods.retrofit.deleteLinkman(BaseApplication.userToken
                , id
            ).awaitSync()
        }
    }

    fun addLinkman(id: Int, remark: String) {
        MyLog.d("触发了添加")
        launch {
            mLinkmanResult.value = ApiMethods.retrofit.addLinkman(BaseApplication.userToken, id, remark).awaitSync()
        }
    }
}
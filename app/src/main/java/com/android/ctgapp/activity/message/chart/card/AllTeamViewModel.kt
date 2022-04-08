package com.android.ctgapp.activity.message.chart.card

import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.util.awaitSync
import com.android.ctgapp.util.launch

class AllTeamViewModel : BaseViewModel() {
    private val mAllTeamResult = MutableLiveData<String>()
    val allTeamResult get() = mAllTeamResult
    
    fun allTeam() {
        launch {
            mAllTeamResult.value = ApiMethods.retrofit.getAllCorporator(BaseApplication.userToken).awaitSync()
        }
    }

    private val mSearchResult = MutableLiveData<String>()
    val searchResult get() = mSearchResult
    fun findSomeOne(str:String) {
        launch {
            mSearchResult.value = ApiMethods.retrofit.getAllCorporator(BaseApplication.userToken,str).awaitSync()
        }
    }
}
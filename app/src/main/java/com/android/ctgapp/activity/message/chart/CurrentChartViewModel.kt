package com.android.ctgapp.activity.message.chart

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.ctgapp.base.BaseViewModel

class CurrentChartViewModel : BaseViewModel(){
    private val mResult = MutableLiveData<String>()
    val result: LiveData<String> get() = mResult




}
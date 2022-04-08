package com.android.ctgapp.entity

import com.google.gson.annotations.SerializedName

class  ResultEntity<T> (
    @SerializedName("data")
    val data :T,
    @SerializedName("status")
    val status:Int,
    @SerializedName("msg")
    val msg:Any
)
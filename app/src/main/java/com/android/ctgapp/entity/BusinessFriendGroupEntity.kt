package com.android.ctgapp.entity

data class BusinessFriendGroupEntity(val mList: List<DataBean>? = null) {
    data class DataBean(
        val groupName: String,
        val id: Any,
        var isDisplay: Boolean = true
    )
}
package com.android.ctgapp.entity

/**
 *作者:LiBW
 *创建日期: 2020/10/12
 *描述: 友商横向列表entity
 */
data class BusinessFriendHorizontalItemEntity(
    val name: String,
    val id: Int = -1,
    val industry: String = "",
    var isSelect: Boolean = false
)
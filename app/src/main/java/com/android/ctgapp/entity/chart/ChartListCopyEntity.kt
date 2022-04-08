package com.android.ctgapp.entity.chart


class ChartListCopyEntity(

) {
    //对方发送者的Id如果Id为空说明是群组消息
    var otherId: Int? = null

    //对方发送者的头像
    var otherHeaderImg: String? = null

    //对方发送者的姓名
    var otherName: String? = null

    //公司名称
    var companyName: String? = null

    //当前用户的Id
    var currentUserId: Int? = null
    var selected: Boolean = false
    var onLine = false
}
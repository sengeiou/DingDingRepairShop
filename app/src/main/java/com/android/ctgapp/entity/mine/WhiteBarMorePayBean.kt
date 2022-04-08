package com.android.ctgapp.entity.mine

import java.io.Serializable

class WhiteBarMorePayBean :Serializable{
    var repayWay = -1
    var data: ArrayList<Data>? = null

    class Data :Serializable{
        var orderNo = ""
        var totalPrice = ""
    }
}
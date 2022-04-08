package com.android.ctgapp.entity.home

class UpdateAppEntity {
    var status=-1
    var msg=""
    var data:DataBean?=null

    class DataBean{
        var resultType=-1
        var appUrl=""
        var message=""
    }

}
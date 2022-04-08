package com.android.ctgapp.entity.mine

class CheckFlowEntity {
    var name: String? = null
    var data: List<DataBean>? = null

     class DataBean {
        var childName: String? = null
    }
}
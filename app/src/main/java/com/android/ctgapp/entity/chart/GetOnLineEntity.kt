package com.android.ctgapp.entity.chart

class GetOnLineEntity {
    var action = 4
    var msg: MsgBean? = null

    class MsgBean {
        var linkIdList: HashSet<Int>? = null
    }
}
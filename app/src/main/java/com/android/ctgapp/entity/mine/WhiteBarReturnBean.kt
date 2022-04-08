package com.android.ctgapp.entity.mine

class WhiteBarReturnBean {
    var firstId = ""
    var firstList: List<FirstBeans>? = null

    class FirstBeans {
        var secondId = ""
        var secondList: List<SecondBeans>? = null
    }

    class SecondBeans {
        var threadId = ""
        var threadList: List<String>? = null
    }
}
package com.android.ctgapp.entity.home

import java.util.ArrayList

class ShoppingSupportWithCreditEntity {
    /**
     * status : 0
     * msg : null
     * data : [12345]
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var isSuccess = false
    var data: List<DataBean> = ArrayList()

    class DataBean {
        var companyId = 0
        var amount = ""
        var flag = false
    }

}
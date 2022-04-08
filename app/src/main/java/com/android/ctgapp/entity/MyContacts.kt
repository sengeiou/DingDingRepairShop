package com.android.ctgapp.entity

class MyContacts {
    var name: String = ""
    var phone: String = ""
    var phoneList: ArrayList<PhoneBean> = arrayListOf()
    var existing: Boolean = false
    class PhoneBean {
        var phoneNum: String = ""
        var existing: Boolean = false
    }
}
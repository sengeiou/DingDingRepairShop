package com.android.ctgapp.callback

import com.android.ctgapp.entity.ContactUnAddEntity

object ContactSelectManager {
    private var contactSelectListener: ContactSelectListener? = null

    fun setCallback(listener: ContactSelectListener?) {
        contactSelectListener = listener
    }

    fun whenItemSelect(data: ContactUnAddEntity.DataBean.RecordsBean?) {
        contactSelectListener!!.onContactSelected(data!!)
    }
}
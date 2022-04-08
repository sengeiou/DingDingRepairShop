package com.android.ctgapp.callback

import com.android.ctgapp.entity.ContactUnAddEntity
import com.android.ctgapp.entity.MyTeamEntity

interface ContactSelectListener {
    fun onContactSelected(data: ContactUnAddEntity.DataBean.RecordsBean)
}
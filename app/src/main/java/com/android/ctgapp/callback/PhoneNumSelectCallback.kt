package com.android.ctgapp.callback

import com.android.ctgapp.entity.ContactModel

interface PhoneNumSelectCallback {
    fun showList(contact: ContactModel)
    fun contactBack(contact: ContactModel)
}
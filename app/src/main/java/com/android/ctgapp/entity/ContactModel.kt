package com.android.ctgapp.entity

import com.android.ctgapp.util.ContactUtil

/**
 *
 * 联系人model实体类
 */
data class ContactModel(
    val name: String, val phone: String, val existing: Boolean = false,
    var phoneList: ArrayList<MyContacts.PhoneBean> = arrayListOf()) {
    //将姓氏首字母提取作为index
    val index: String = ContactUtil.getFirstLetter(name)
}
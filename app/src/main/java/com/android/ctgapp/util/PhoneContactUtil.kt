package com.android.ctgapp.util

import android.content.ContentResolver
import android.content.ContentUris
import android.content.ContentValues
import android.content.Context
import android.net.Uri
import android.provider.ContactsContract
import com.android.ctgapp.entity.MyContacts

class PhoneContactUtil {

    companion object {
        //获取通讯录
        fun getAllNumber(context: Context): ArrayList<String> {
            val mList = ArrayList<String>()
            val cursor = context.contentResolver.query(
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI, arrayOf(
                    "display_name", "sort_key", "contact_id",
                    "data1"
                ), null, null, "sort_key"
            )
            cursor?.let {
                while (cursor.moveToNext()) {
                    var phone = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER))
                    phone = phone.replace("-", "")
                    phone = phone.replace(" ", "")
                    mList.add(phone)

                }
            }
            cursor?.close()
            return mList
        }
    }
}

/**
 *作者:LiBW
 *创建日期: 1/6/21
 *描述将手机号和姓名加入通讯录
 */
fun Context.addContactToPhone(name: String, tel: String) {
    //插入raw_contacts表，并获取_id属性
    try {
        var uri: Uri = Uri.parse("content://com.android.contacts/raw_contacts")
        val resolver: ContentResolver = contentResolver
        val values = ContentValues()
        resolver.insert(uri, values)?.let {
            val contactId: Long = ContentUris.parseId(it)
            //插入data表
            uri = Uri.parse("content://com.android.contacts/data")
            //add Name
            values.put("raw_contact_id", contactId)
            values.put(ContactsContract.Data.MIMETYPE, "vnd.android.cursor.item/name")
            values.put("data2", name)
            values.put("data1", name)
            resolver.insert(uri, values)
            values.clear()
            //add Phone
            values.put("raw_contact_id", contactId)
            values.put(ContactsContract.Data.MIMETYPE, "vnd.android.cursor.item/phone_v2")
            values.put("data2", "2") //手机
            values.put("data1", tel)
            resolver.insert(uri, values)
            values.clear()
            showToast("已存入通讯录,请注意查看")
        }
    } catch (e: Exception) {
        showToast("存入失败:${e.message}")
    }
}


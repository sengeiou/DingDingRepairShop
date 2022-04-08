package com.android.ctgapp.activity.mine.friend

import android.content.Intent
import android.provider.ContactsContract.CommonDataKinds.Phone
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.ContactsAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.callback.PhoneNumSelectCallback
import com.android.ctgapp.entity.ContactModel
import com.android.ctgapp.entity.MyContacts
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerText
import com.android.ctgapp.widget.dialog.PhoneNumSelectDialog
import com.nanchen.wavesidebar.Trans2PinYinUtil
import kotlinx.android.synthetic.main.activity_phone_contact.*
import org.json.JSONArray


/**
 *作者:LiBW
 *创建日期: 2020/10/14
 *描述:手机联系人 页面
 */
class PhoneContactActivity : BaseActivity(), PhoneNumSelectCallback {
    private val mContactList = ArrayList<ContactModel>()
    private val copyList = ArrayList<ContactModel>()
    private val mAdapter: ContactsAdapter by lazy { ContactsAdapter(mContactList, this) }
    private var phoneNumbers = ArrayList<String>()

    override fun event() {
        val phoneNumbersJson = intent.getStringExtra(MyConstants.GROUP_PHONE_NUMBERS)
        phoneNumbersJson?.let {
            val array = JSONArray(it)
            repeat(array.length()) { index ->
                phoneNumbers.add(array.getString(index))
            }
        }
        mContactsRV.adapter = mAdapter
        mContactsRV.layoutManager = LinearLayoutManager(this)

        mContactList.clear()
        val list = getContacts()

        list.forEach {
            mContactList.add(ContactModel(it.name, it.phone, it.existing, it.phoneList))
            copyList.add(ContactModel(it.name, it.phone, it.existing, it.phoneList))
        }
        mAdapter.notifyDataSetChanged()
    }

    override fun click() {
        //搜索框的内容
        mSearchEditText.handlerText {
            if (it.isNotEmpty()) {
                mContactList.clear()
                for (model in copyList) {
                    val str = Trans2PinYinUtil.trans2PinYin(model.name)
                    if (str.contains(it) || model.name.contains(it)) {
                        mContactList.add(model)
                    }
                }
                mAdapter.notifyDataSetChanged()
            } else {
                mContactList.clear()
                mContactList.addAll(copyList)
                mAdapter.notifyDataSetChanged()
            }
        }
        mWaveSideBarView.setOnSelectIndexItemListener {
            for (i in mContactList.indices) {
                if (mContactList[i].index == it) {
                    (mContactsRV.layoutManager as LinearLayoutManager).scrollToPositionWithOffset(i, 0)
                    return@setOnSelectIndexItemListener
                }
            }
        }
    }

    //获取通讯录
    private fun getContacts(): ArrayList<MyContacts> {
        val mList = ArrayList<MyContacts>()
        val cursor = contentResolver.query(
            Phone.CONTENT_URI, arrayOf(
                "display_name", "sort_key", "contact_id",
                "data1"
            ), null, null, "sort_key"
        )
        cursor?.let {
            var prePosition = 0
            while (cursor.moveToNext()) {
                val data = MyContacts()
                val name = cursor.getString(cursor.getColumnIndex(Phone.DISPLAY_NAME))
                var phone = cursor.getString(cursor.getColumnIndex(Phone.NUMBER))
                phone = phone.replace("-", "")
                phone = phone.replace(" ", "")

                //如果列表内是空的当然就新建第一个人物
                if (mList.isEmpty()) {
                    data.name = name
                    data.phone = phone
                    val flag=phone in phoneNumbers
                    data.existing=flag
                    val bean = MyContacts.PhoneBean()
                    bean.phoneNum = phone
                    bean.existing = flag
                    data.phoneList.add(bean)
                    mList.add(data)
                } else {
                    //如果List的上一个人和这次的人是同一个就把手机号加入到列表而不是新建
                    if (mList[prePosition].name == name) {
                        val phoneEntity = MyContacts.PhoneBean()
                        phoneEntity.phoneNum = phone
                        //判断手机号是否已经是商友
                        phoneEntity.existing = phone in phoneNumbers
                        mList[prePosition].phoneList.add(phoneEntity)
                        mList[prePosition].phone = "多个手机号请点击添加后选择"

                    } else {
                        data.name = name
                        data.phone = phone
                        val flag = phone in phoneNumbers
                        data.existing = flag
                        val bean = MyContacts.PhoneBean()
                        bean.phoneNum = phone
                        bean.existing = flag
                        data.phoneList.add(bean)
                        mList.add(data)
                        prePosition++
                    }
                }
            }
        }
        cursor?.close()
        return mList
    }

    override fun getLayout() = R.layout.activity_phone_contact

    override fun showList(contact: ContactModel) {
        //多号码选择
        PhoneNumSelectDialog(contact, this).show(supportFragmentManager, "")
    }

    override fun contactBack(contact: ContactModel) {
        val intent = Intent()
        intent.putExtra(MyConstants.NAME, contact.name)
        intent.putExtra(MyConstants.PHONE, contact.phone)
        setResult(1001, intent)
        finish()
    }
}
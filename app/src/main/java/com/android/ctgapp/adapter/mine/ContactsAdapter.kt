package com.android.ctgapp.adapter.mine

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.ContactsAdapter.ContactsViewHolder
import com.android.ctgapp.callback.PhoneNumSelectCallback
import com.android.ctgapp.entity.ContactModel
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 2020/10/14
 *描述: Contact联系人适配器
 */
class ContactsAdapter(private val contacts: List<ContactModel>, private val callback: PhoneNumSelectCallback) : RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.layaout_item_contacts, null)
        return ContactsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val data = contacts[position]
        if (position == 0 || contacts[position - 1].index != data.index) {
            holder.mIndexTV.visibility = View.VISIBLE
            holder.mIndexTV.text = data.index
        } else {
            holder.mIndexTV.visibility = View.GONE
        }
        holder.mContactName.text = data.name
        holder.mPhoneNumTV.text = data.phone

        if (data.phoneList.size==1) {
            holder.mAddTV.background = null
            holder.mAddTV.textColorResource = R.color.gray_text
            holder.mAddTV.isEnabled = false
            holder.mAddTV.text = "已添加"
        } else {
            holder.mAddTV.backgroundResource = R.drawable.bg_btn_common_rectangle
            holder.mAddTV.textColorResource = R.color.white
            holder.mAddTV.isEnabled = true
            holder.mAddTV.text = "添加"
        }

        if (data.existing) {
            holder.mAddTV.background = null
            holder.mAddTV.textColorResource = R.color.gray_text
            holder.mAddTV.isEnabled = false
            holder.mAddTV.text = "已添加"
        } else {
            holder.mAddTV.backgroundResource = R.drawable.bg_btn_common_rectangle
            holder.mAddTV.textColorResource = R.color.white
            holder.mAddTV.isEnabled = true
            holder.mAddTV.text = "添加"
        }

        //添加按钮
        holder.mAddTV.setOnClickListener {
            //手机列表内有数据则打开Toast
            if (data.phoneList.size==1) {
                callback.contactBack(data)
            } else {
                //没数据则带回去
                callback.showList(data)
            }
        }
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    inner class ContactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mIndexTV: TextView = itemView.findViewById(R.id.mIndexTV)
        var mContactImageIV: ImageView = itemView.findViewById(R.id.mContactImageIV)
        var mContactName: TextView = itemView.findViewById(R.id.mContactName)
        var mAddTV: TextView = itemView.findViewById(R.id.mAddTV)
        var mPhoneNumTV: TextView = itemView.findViewById(R.id.mPhoneNumTV)
    }
}
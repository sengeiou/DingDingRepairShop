package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.callback.PhoneNumSelectCallback
import com.android.ctgapp.entity.ContactModel

class PhoneNumSelectAdapter(private val context: Context, private val contact: ContactModel, private val callback: PhoneNumSelectCallback) : RecyclerView.Adapter<PhoneNumSelectAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_phone_num_select_list, null, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contact.phoneList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = contact.phoneList[position]
        if (data.existing) {
            holder.mExistingTV.visibility = View.VISIBLE
            holder.mPhoneSelectLL.isEnabled = false
        } else {
            holder.mExistingTV.visibility = View.GONE
            holder.mPhoneSelectLL.isEnabled = true
        }
        val index = "电话${position + 1}"
        holder.mPhoneIndexTV.text = index
        holder.mPhoneNumTV.text = data.phoneNum
        holder.mPhoneSelectLL.setOnClickListener {
            val mData = ContactModel(contact.name, data.phoneNum)
            callback.contactBack(mData)
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mPhoneIndexTV: TextView = view.findViewById(R.id.mPhoneIndexTV)
        val mPhoneNumTV: TextView = view.findViewById(R.id.mPhoneNumTV)
        val mExistingTV: TextView = view.findViewById(R.id.mExistingTV)
        val mPhoneSelectLL: LinearLayout = view.findViewById(R.id.mPhoneSelectLL)
    }


}
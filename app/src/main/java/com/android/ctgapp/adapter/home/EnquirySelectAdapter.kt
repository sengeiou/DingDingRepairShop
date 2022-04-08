package com.android.ctgapp.adapter.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.EnquirySelectBean

class EnquirySelectAdapter(private val context: Context, private val mList: List<EnquirySelectBean>, private val listener: EnquirySelectCallback) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_eqnuiry_select_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mCheckBox.isChecked = data.isSelect
            holder.mTextView.text = data.name
            holder.mParentLL.setOnClickListener {
                holder.mCheckBox.performClick()
            }
            holder.mCheckBox.setOnClickListener {
                listener.onItemSelect(data)
                listener.onItemSelect(holder.mCheckBox.isChecked, data.name)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
        val mTextView: TextView = view.findViewById(R.id.mTextView)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
    }

    interface EnquirySelectCallback {
        fun onItemSelect(data: EnquirySelectBean)
        fun onItemSelect(select: Boolean, selectName: String)
    }

}
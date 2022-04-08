package com.android.ctgapp.adapter.deal

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

class QueryRecordChildAdapter(private val context: Context, private val mList: List<String>) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_query_record_child_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mParentLL.setOnClickListener {
                holder.mCheckBox.performClick()
            }
            holder.mCheckBox.setOnClickListener {
                //点击事件

            }

        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mCompanyNameTV: TextView = view.findViewById(R.id.mCompanyNameTV)
        val mBrandTV: TextView = view.findViewById(R.id.mBrandTV)
        val mPriceTV: TextView = view.findViewById(R.id.mPriceTV)
        val mArrivalTimeTV: TextView = view.findViewById(R.id.mArrivalTimeTV)
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
        val mUnderLine: View = view.findViewById(R.id.mUnderLine)
    }

}
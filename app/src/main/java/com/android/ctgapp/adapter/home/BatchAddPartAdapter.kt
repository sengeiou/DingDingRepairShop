package com.android.ctgapp.adapter.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.BatchAddPartBean
import com.android.ctgapp.util.handlerNull
import com.bumptech.glide.Glide

class BatchAddPartAdapter(private val context: Context, private val mList: List<BatchAddPartBean>, private val listener: AddPartCallback) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_batch_add_part_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mPartNameTV.text = data.partName.handlerNull()
            Glide.with(context).load(data.resource).into(holder.mPartIV)
            holder.mParentLL.setOnClickListener {
                listener.onAddPartClick(data.id)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mPartIV: ImageView = view.findViewById(R.id.mPartIV)
        val mPartNameTV: TextView = view.findViewById(R.id.mPartNameTV)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
    }

    interface AddPartCallback {
        fun onAddPartClick(id: Int)
    }
}
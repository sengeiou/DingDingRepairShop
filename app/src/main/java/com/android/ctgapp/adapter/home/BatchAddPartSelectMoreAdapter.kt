package com.android.ctgapp.adapter.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.BatchAddPartChildEntity
import com.android.ctgapp.entity.home.BatchAddPartChildEntityV2
import com.android.ctgapp.util.handlerNull
import com.bumptech.glide.Glide

class BatchAddPartSelectMoreAdapter(private val context: Context, private val mList: List<BatchAddPartChildEntityV2.DataBean.PartsGroupBean>, private val listener: BatchAddPartSelectMoreAdapterCallBack) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_batch_add_part_more_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            //选中状态
            holder.mCheckBox.isChecked = data.select
            holder.mTopTextTV.text = data.ctgname.handlerNull()
            holder.mNumberTV.text = data.oe.handlerNull()
            Glide.with(context).load(data.img).into(holder.mPartIV)
            holder.mParentRL.setOnClickListener {
                holder.mCheckBox.performClick()
            }
            holder.mCheckBox.setOnClickListener {
                data.select=holder.mCheckBox.isChecked
                notifyItemChanged(position)
//                listener.onItemSelect(data, holder.mCheckBox.isChecked)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
        val mPartIV: ImageView = view.findViewById(R.id.mPartIV)
        val mTopTextTV: TextView = view.findViewById(R.id.mTopTextTV)
        val mNumberTV: TextView = view.findViewById(R.id.mNumberTV)
        val mParentRL: RelativeLayout = view.findViewById(R.id.mParentRL)
    }

    interface BatchAddPartSelectMoreAdapterCallBack {
        fun onItemSelect(data: BatchAddPartChildEntity.DataBean, select: Boolean)
    }
}
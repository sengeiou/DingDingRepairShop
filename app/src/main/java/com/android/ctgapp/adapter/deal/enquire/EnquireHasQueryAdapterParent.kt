package com.android.ctgapp.adapter.deal.enquire

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.EnquireWhiteEntityV3

class EnquireHasQueryAdapterParent(private val context: Context, private val mList: List<EnquireWhiteEntityV3.DataBean.ImmutablePairsBean>) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_enquire_has_query_parent, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder){
            val data=mList[position]
            holder.mCompanyNameTV.text=data.name
            data.items?.let {list->
                holder.mChildRV.adapter=EnquireHasQueryAdapterChild(context,list)
                holder.mChildRV.layoutManager=LinearLayoutManager(context)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mCompanyNameTV: TextView = view.findViewById(R.id.mCompanyNameTV)
        val mChildRV: RecyclerView = view.findViewById(R.id.mChildRV)
        val mParentLL: LinearLayoutCompat = view.findViewById(R.id.mParentLL)
    }
}
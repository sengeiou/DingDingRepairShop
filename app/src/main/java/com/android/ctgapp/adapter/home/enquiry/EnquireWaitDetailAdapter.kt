package com.android.ctgapp.adapter.home.enquiry

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.databinding.ItemCarConfigSelectBinding
import com.android.ctgapp.databinding.ItemHorizontalTwoTextListBinding
import com.android.ctgapp.entity.home.CarConfigSelectBean
import com.android.ctgapp.entity.home.EnquireWhiteEntity
import com.android.ctgapp.entity.home.EnquireWhiteEntityV3
import com.android.ctgapp.util.handlerNull

class EnquireWaitDetailAdapter(private val context: Context, private val mList:List<EnquireWhiteEntityV3.DataBean.EnquiryDetailsBean>) :BaseRecyclerViewAdapter(context, mList){
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val binding = ItemHorizontalTwoTextListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder){
            val data=mList[position]
            holder.start.text=data.partName
//            holder.end.text=data.ssssPrice.handlerNull()
            "x${data.num.handlerNull()}".also { holder.end.text = it }
        }
    }
    inner class MyViewHolder(view:ItemHorizontalTwoTextListBinding):RecyclerView.ViewHolder(view.root){
        val start:TextView=view.mStartTV
        val end:TextView=view.mEndTV

    }

}
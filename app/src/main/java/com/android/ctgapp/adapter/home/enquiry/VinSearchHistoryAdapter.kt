package com.android.ctgapp.adapter.home.enquiry

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.databinding.ItemVinHistoryListBinding
import com.android.ctgapp.entity.VinSearchHistoryBean
import com.bumptech.glide.Glide
import java.text.SimpleDateFormat
import java.util.*

class VinSearchHistoryAdapter(private val context: Context, private val mList:List<VinSearchHistoryBean>, private val listener:VinSearchHistoryCallback) :BaseEmptyRecyclerViewAdapter(context, mList){
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val binding = ItemVinHistoryListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder){
            val data=mList[position]
            holder.mCarInfoTV.text=data.carInfo
            Glide.with(context).load(data.brandImage).into(holder.mImageView)
            holder.mVinCodeTV.text=data.vinCode
            val format= SimpleDateFormat("yy年MM月", Locale.CHINA)
            holder.mTimeTV.text=format.format(data.time)
            holder.mParentRL.setOnClickListener {
                listener.onItemClick(data.vinCode)
            }
        }
    }
    inner class MyViewHolder(view:ItemVinHistoryListBinding):RecyclerView.ViewHolder(view.root){
        val mImageView:ImageView =view.mImageView
        val mCarInfoTV:TextView =view.mCarInfoTV
        val mVinCodeTV:TextView =view.mVinCodeTV
        val mTimeTV:TextView =view.mTimeTV
        val mParentRL:RelativeLayout =view.mParentRL
    }
    interface VinSearchHistoryCallback{
        fun onItemClick(vin:String)
    }
}
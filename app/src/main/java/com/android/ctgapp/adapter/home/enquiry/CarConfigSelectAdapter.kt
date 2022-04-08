package com.android.ctgapp.adapter.home.enquiry

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.databinding.ItemCarConfigSelectBinding
import com.android.ctgapp.entity.home.CarConfigSelectBean

class CarConfigSelectAdapter(private val context: Context, private val mList:List<CarConfigSelectBean>,private val listener:CarConfigSelectCallback) :BaseRecyclerViewAdapter(context, mList){
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val binding = ItemCarConfigSelectBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder){
            val data=mList[position]
            (data.grade+data.config).also { holder.textView.text = it }
            holder.textView.setOnClickListener {
                listener.onItemClick(data.carID)
            }
        }
    }
    inner class MyViewHolder(view:ItemCarConfigSelectBinding):RecyclerView.ViewHolder(view.root){
        val textView:TextView=view.mTextView
    }
    interface CarConfigSelectCallback{
        fun onItemClick(carId:String)
    }
}
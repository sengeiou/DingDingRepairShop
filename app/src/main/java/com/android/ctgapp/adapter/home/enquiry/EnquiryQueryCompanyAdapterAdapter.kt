package com.android.ctgapp.adapter.home.enquiry

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.databinding.ItemEnquiryQueryComoanyListBinding
import com.android.ctgapp.entity.home.EnquiryQueryCompanyEntity
import com.android.ctgapp.entity.home.EnquiryQueryCompanyEntityChild

class EnquiryQueryCompanyAdapterAdapter(private val context: Context, private val mList:List<EnquiryQueryCompanyEntityChild>, private val listener:EnquiryQueryCompanyAdapterCallback) :BaseRecyclerViewAdapter(context, mList){
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val binding = ItemEnquiryQueryComoanyListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder){
            val data=mList[position]
            holder.textView.text=data.name
            holder.imageView.setOnClickListener {
                listener.onItemDelete(position)
            }
            holder.imageView.visibility=if (data.canDelete) View.VISIBLE else View.GONE
        }
    }
    inner class MyViewHolder(view:ItemEnquiryQueryComoanyListBinding):RecyclerView.ViewHolder(view.root){
        val textView:TextView=view.mTextView
        val imageView:ImageView=view.mImageView
    }
    interface EnquiryQueryCompanyAdapterCallback{
        fun onItemDelete(position: Int)
    }
}
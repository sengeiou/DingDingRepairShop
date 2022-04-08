package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.BrandEntity
import com.android.ctgapp.util.handlerNull

class CompanyBrandAdapter(private val context: Context, private val list: List<BrandEntity.DataBean>) : BaseRecyclerViewAdapter(context, list) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_company_rang, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            holder.mTextView.text = list[position].carBrand.handlerNull()
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mTextView: TextView = view.findViewById(R.id.mTextView)
    }
}
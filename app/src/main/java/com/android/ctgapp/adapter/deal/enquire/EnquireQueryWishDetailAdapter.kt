package com.android.ctgapp.adapter.deal.enquire

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.deal.enquire.EnquireWishDetailEntity
import com.android.ctgapp.util.handlerNull

class EnquireQueryWishDetailAdapter(private val context: Context, private val mList: List<EnquireWishDetailEntity.DataBean.DetailsBean>) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_enquire_query_wish_detail_parent, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder){
            val data=mList[position]
            "零件名称: ${data.partName.handlerNull()}".also { holder.mPartNameTV.text = it }
            "总数量: ${data.num.handlerNull()}".also { holder.mCountTV.text = it }
            "总价格: ${data.price.handlerNull()}".also { holder.mAllMoneyTV.text = it }
            "品牌: ${data.brand.handlerNull()}".also { holder.mBrandNameTV.text = it }

        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mPartNameTV: TextView = view.findViewById(R.id.mPartNameTV)
        val mCountTV: TextView = view.findViewById(R.id.mCountTV)
        val mAllMoneyTV: TextView = view.findViewById(R.id.mAllMoneyTV)
        val mBrandNameTV: TextView = view.findViewById(R.id.mBrandNameTV)
    }
}
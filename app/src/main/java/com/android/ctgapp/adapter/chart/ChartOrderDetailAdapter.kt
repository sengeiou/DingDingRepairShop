package com.android.ctgapp.adapter.chart

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.deal.OrderDetailEntity
import com.android.ctgapp.entity.deal.OrderDetailTalkUseEntity
import com.android.ctgapp.util.handlerNull
import java.math.BigDecimal

class ChartOrderDetailAdapter(private val context: Context, private val mList: List<OrderDetailTalkUseEntity.DataBean.OrderDetailSBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_chart_order_detail_list, parent, false)
        return MyViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            val b: BigDecimal = BigDecimal(data.goodsPrice.handlerNull()).setScale(2, BigDecimal.ROUND_HALF_UP)
            val totalStr = "${position + 1}. ${data.goodsName.handlerNull()} ¥${b.handlerNull()} x${data.goodsAmount.handlerNull()}"
            holder.mPartNameTV.text = totalStr
//            holder.mPartNameTV.text="${position+1}. ${data.goodsName.handlerNull()}"
//            holder.mPartCountTV.text="x${data.goodsAmount.handlerNull()}"
//            val price="¥${data.goodsPrice.handlerNull()}"
//            holder.mPartPriceTV.text=price
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mPartNameTV: TextView = view.findViewById(R.id.mPartNameTV)
        //        val mPartTypeTV:TextView=view.findViewById(R.id.mPartTypeTV)
//        val mPartPriceTV: TextView = view.findViewById(R.id.mPartPriceTV)
//        val mPartCountTV: TextView = view.findViewById(R.id.mPartCountTV)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
    }
}
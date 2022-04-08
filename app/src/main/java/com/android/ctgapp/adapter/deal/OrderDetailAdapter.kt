package com.android.ctgapp.adapter.deal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.bumptech.glide.Glide
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.deal.OrderDetailEntity
import com.android.ctgapp.util.handlerNull
import com.google.gson.internal.bind.DateTypeAdapter

class OrderDetailAdapter(private val context: Context, private val mList: List<OrderDetailEntity.DataBean.OrderDetailSBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_order_detail_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            Glide.with(context).load(data.goodsImg).error(R.drawable.logo_app_gray)
                .placeholder(R.drawable.logo_app_gray)
                .into(holder.mImageView)

            holder.mPartNameTV.text = data.goodsName.handlerNull()

            //没有优先级 数据让前端来处理....
            holder.mPartTypeTV.visibility = View.VISIBLE
            when {
                data.goodsNo.handlerNull().isNotEmpty() -> holder.mPartTypeTV.text ="编号:${data.goodsNo.handlerNull()}"
                data.factoryid.handlerNull().isNotEmpty() -> holder.mPartTypeTV.text = "编号:${data.factoryid.handlerNull()}"
                data.partOe.handlerNull().isNotEmpty() -> holder.mPartTypeTV.text = "OE号:${data.partOe.handlerNull()}"
                else -> {
                    holder.mPartTypeTV.visibility = View.INVISIBLE
                }
            }

            holder.mPartCountTV.text = data.goodsAmount.handlerNull()
            holder.mPartPriceTV.text = data.goodsPrice.handlerNull()
            if (data.refundGoodsAmount!! > 0) {
                holder.mReturnCountTV.visibility = View.VISIBLE
                "退:${data.refundGoodsAmount}".also { holder.mReturnCountTV.text = it }
            } else {
                holder.mReturnCountTV.visibility = View.GONE
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mImageView: ImageView = view.findViewById(R.id.mImageView)
        val mPartNameTV: TextView = view.findViewById(R.id.mPartNameTV)
        val mPartTypeTV: TextView = view.findViewById(R.id.mPartTypeTV)
        val mPartPriceTV: TextView = view.findViewById(R.id.mPartPriceTV)
        val mPartCountTV: TextView = view.findViewById(R.id.mPartCountTV)
        val mReturnCountTV: TextView = view.findViewById(R.id.mReturnCountTV)
    }
}
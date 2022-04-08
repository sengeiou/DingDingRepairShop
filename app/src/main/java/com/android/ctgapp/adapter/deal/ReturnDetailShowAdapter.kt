package com.android.ctgapp.adapter.deal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.deal.ReturnGoodsDetailEntity
import com.android.ctgapp.util.handlerNull
import com.bumptech.glide.Glide

/**
 * 作者:LiBW
 * 创建日期: 12/11/20
 * 描述: 退货详情 列表 展示
 */
class ReturnDetailShowAdapter(private val context: Context, private val mList: List<ReturnGoodsDetailEntity.DataBean.ReturnOrderDetailsBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_return_detail_show_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            Glide.with(context).load(data.goodsImg).
                error(R.drawable.logo_app_gray)
                    .placeholder(R.drawable.logo_app_gray)
            .into(holder.mImageView)
            holder.mPartNameTV.text = data.goodsName.handlerNull()
            holder.mPartTypeTV.text = data.goodsNo.handlerNull()
            holder.mPartCountTV.text = data.returnNum.handlerNull()
            holder.mPartPriceTV.text = data.goodsPrice.handlerNull()

        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mImageView: ImageView = view.findViewById(R.id.mImageView)
        val mPartNameTV: TextView = view.findViewById(R.id.mPartNameTV)
        val mPartTypeTV: TextView = view.findViewById(R.id.mPartTypeTV)
        val mPartPriceTV: TextView = view.findViewById(R.id.mPartPriceTV)
        val mPartCountTV: TextView = view.findViewById(R.id.mPartCountTV)


    }
}
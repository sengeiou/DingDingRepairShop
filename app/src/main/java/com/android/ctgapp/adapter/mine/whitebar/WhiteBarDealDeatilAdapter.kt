package com.android.ctgapp.adapter.mine.whitebar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.mine.WhiteBarDealDetailEntity
import com.android.ctgapp.util.handlerNull
import com.bumptech.glide.Glide

class WhiteBarDealDetailAdapter(private val context: Context, private val mList: List<WhiteBarDealDetailEntity.DataBean.OrderDetailSBean>) : BaseRecyclerViewAdapter(context, mList) {


    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_white_bar_detail_adapter, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]



            Glide.with(context).load(data.goodsImg).
                error(R.drawable.logo_app_gray)
                .placeholder(R.drawable.logo_app_gray)
            .into(holder.mImageView)
            holder.mPartNameTV.text=data.goodsName.handlerNull()


//            holder.mPartTypeTV.text=data.goodsNo.handlerNull()

            holder.mCountTV.text=data.goodsAmount.handlerNull()
            holder.mPriceTV.text=data.goodsPrice.handlerNull()




        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mImageView:ImageView=view.findViewById(R.id.mImageView)
        val mPartNameTV:TextView=view.findViewById(R.id.mPartNameTV)
        val mBrandCodeTV:TextView=view.findViewById(R.id.mBrandCodeTV)
        val mPartCodeTV:TextView=view.findViewById(R.id.mPartCodeTV)
        val mPartFromTV:TextView=view.findViewById(R.id.mPartFromTV)
        val mPriceTV:TextView=view.findViewById(R.id.mPriceTV)
        val mCountTV:TextView=view.findViewById(R.id.mCountTV)
        val mStatueTV:TextView=view.findViewById(R.id.mStatueTV)

    }
}
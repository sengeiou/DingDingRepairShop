package com.android.ctgapp.adapter.deal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.deal.ReturnGoodsDetailEntity
import com.android.ctgapp.util.handlerNull
import com.bumptech.glide.Glide

/**
 * 作者:LiBW
 * 创建日期: 12/11/20
 * 描述: 退货详情 修改 展示
 */
class ReturnDetailImageAdapter(private val context: Context, private val mList: List<ReturnGoodsDetailEntity.DataBean.ReturnPicsBean>) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_return_detail_image_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            Glide.with(context).load(data.picUrl.handlerNull()).
                error(R.drawable.logo_app_gray)
                .placeholder(R.drawable.logo_app_gray)
            .into(holder.mImageView)
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mImageView: ImageView = view.findViewById(R.id.mImageView)
    }
}
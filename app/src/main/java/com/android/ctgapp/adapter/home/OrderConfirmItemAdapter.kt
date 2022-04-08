package com.android.ctgapp.adapter.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.bumptech.glide.Glide
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.TrolleyEntity
import com.android.ctgapp.util.*

/**
 *作者:LiBW
 *创建日期: 2020/11/6
 *描述: 购物车
 */
class OrderConfirmItemAdapter(private val context: Context, private val mList: List<TrolleyEntity.DataBean.DetailsBean>) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_order_confirm_item_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            if (data.isOnsale == 0 || data.isDeleted == 1 || data.isSelected == THE_FALSE) {
                holder.mParentLL.visibility = View.GONE
            }
            val count = "x${data.num.handlerNull()}"
            //设置选中数量
            holder.mCountTV.text = count
            //设置图片
            Glide.with(context).load(data.imgName).
                placeholder(R.drawable.logo_app_gray)
                . error(R.drawable.logo_app_gray)
            .into(holder.mItemImageIV)
            //商品名称
//            val name = "${data.nname.handlerNull()} ${data.brandName.handlerNull()} ${data.specStyle.handlerNull()}"
            holder.mPartNameTV.text = data.goodsName.handlerNull()
            //商品编码
            val code = "编码: ${data.factoryid.handlerNull()}"
            holder.mPartCodeTV.text = code
            //商品价格
            val price = "¥${data.price.handlerNull()}"
            holder.mPartPriceTV.text = price
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mItemImageIV: ImageView = view.findViewById(R.id.mItemImageIV)
        val mPartNameTV: TextView = view.findViewById(R.id.mPartNamesTV)
        val mPartCodeTV: TextView = view.findViewById(R.id.mPartCodeTV)
        val mPartPriceTV: TextView = view.findViewById(R.id.mPartPriceTV)
        val mCountTV: TextView = view.findViewById(R.id.mContentTV)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
    }
}
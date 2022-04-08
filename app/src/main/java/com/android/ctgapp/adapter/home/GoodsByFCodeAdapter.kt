package com.android.ctgapp.adapter.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.bumptech.glide.Glide
import com.android.ctgapp.activity.home.shop.GoodsDetailActivity
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.home.GoodsItemEntity
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.startActivity

class GoodsByFCodeAdapter(private val context: Context, private val mList: List<GoodsItemEntity>, private val listener: GoodsByFCodeListener) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_goods_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            Glide.with(context).load(data.images).
                error(R.drawable.logo_app_gray)
                . placeholder(R.drawable.logo_app_gray)
            .into(holder.mImageView)
            //商品顶部名称展示
//            val partDetail = "${data.brandName.handlerNull()}  ${data.spec.handlerNull()}  ${data.specStyle.handlerNull()}"
            val partDetail = data.goodsName.handlerNull()
            //展示品牌和型号
//            val partDetail = "${data.brandName.handlerNull()} ${data.specStyle.handlerNull()}"
            holder.mPartDetailTV.text = partDetail

            holder.mWarehouse.text = data.orgName.handlerNull()

            holder.mPartPriceTV.text = data.salesPrice.handlerNull()
            holder.mPayedCountTV.text = data.sales.handlerNull()
            //库存
            holder.mStockTV.text = data.stock.handlerNull()
            //加入购物车
            holder.mAddTrolleyIV.setOnClickListener {
                listener.onAddTrolleyFCodeListener(data)
            }
            //查看详情
            holder.mParentLL.setOnClickListener {
                context.startActivity<GoodsDetailActivity>(MyConstants.PART_ID to data.id)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mImageView: ImageView = view.findViewById(R.id.mImageView)
        val mAddTrolleyIV: ImageView = view.findViewById(R.id.mAddTrolleyIV)
        val mPartDetailTV: TextView = view.findViewById(R.id.mPartDetailTV)
        val mPartPriceTV: TextView = view.findViewById(R.id.mPartPriceTV)
        val mPayedCountTV: TextView = view.findViewById(R.id.mPayedCountTV)
        val mWarehouse: TextView = view.findViewById(R.id.mWarehouse)
        val mStockTV: TextView = view.findViewById(R.id.mStockTV)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
    }

    interface GoodsByFCodeListener {
        fun onAddTrolleyFCodeListener(goods: GoodsItemEntity)
    }
}
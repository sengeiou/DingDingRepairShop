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
import com.android.ctgapp.entity.home.EnquireWhiteEntityV2
import com.android.ctgapp.entity.home.TrolleyEntity
import com.android.ctgapp.entity.home.enquire.EnquireDetailByCompanyEntityV2
import com.android.ctgapp.util.*

/**
 *作者:LiBW
 *创建日期: 2020/11/6
 *描述: 询价单确认
 */
//class EnquireOrderConfirmItemAdapter(private val context: Context, private val mList: List<EnquireWhiteEntityV2.DataBean.QuotationDetailsBean>) : BaseRecyclerViewAdapter(context, mList) {
class EnquireOrderConfirmItemAdapter(private val context: Context, private val mList: List<EnquireDetailByCompanyEntityV2.DataBean.ImmutablePairsBean.ItemsBean>) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_enquire_order_confirm_item_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            val count = "x${data.num.handlerNull()}"
            //设置选中数量
            holder.mCountTV.text = count
            //商品名称
            holder.mPartNameTV.text = "零件: ${data.partName.handlerNull()}"
            holder.mBrandTV.text = "品牌: ${data.brand.handlerNull()}"

            holder.YJDH.text = "预计到货: ${data.aogTime.handlerNull()}"

            val code = "价格: ¥${data.price.handlerNull()}"
            holder.mPriceTV.text = code
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mPartNameTV: TextView = view.findViewById(R.id.mPartNamesTV)
        val mBrandTV: TextView = view.findViewById(R.id.mBrandTV)
        val mPriceTV: TextView = view.findViewById(R.id.mPriceTV)
        val mCountTV: TextView = view.findViewById(R.id.mContentTV)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
        val YJDH: TextView = view.findViewById(R.id.YJDH)
    }
}
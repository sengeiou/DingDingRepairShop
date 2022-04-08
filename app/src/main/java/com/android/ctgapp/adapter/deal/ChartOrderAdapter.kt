package com.android.ctgapp.adapter.deal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.OrderEntity
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.textColorResource


class ChartOrderAdapter(private val context: Context, private val mList: List<OrderEntity.DataBean.RecordsBean>, private val listener: ItemClickCallback) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_order_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]

            holder.mOrderId.text = data.orderNo.handlerNull()
            holder.mSellerTV.text = data.sellerCompanyName.handlerNull()
            holder.mOrderCreateTimeTV.text = data.createTime.handlerNull()
            val count = "共${data.totalNumber.handlerNull()}件,实付:"
            holder.mTotalCountTV.text = count

            val price = "¥${data.totalPrice.handlerNull()}"
            holder.mTotalPriceTV.text = price


            //1待付款  2待发货 3待收货 4已完成  7已取消 9退款中
            val status = when (data.state) {
                1 -> {
                    holder.mStatusTV.textColorResource = R.color.red_dark
                    "待付款"
                }
                2 -> {
                    holder.mStatusTV.textColorResource = R.color.text_gray_light
                    "待发货"
                }
                3 -> {
                    holder.mStatusTV.textColorResource = R.color.red_dark
                    "待收货"
                }
                4 -> {
                    holder.mStatusTV.textColorResource = R.color.green_color
                    "已完成"
                }
                7 -> {
                    holder.mStatusTV.textColorResource = R.color.text_gray_light
                    "已取消"
                }
                9 -> {
                    holder.mStatusTV.textColorResource = R.color.text_gray_light
                    "退货中"
                }
                else -> ""
            }
            holder.mStatusTV.text = status
            holder.mPartNamesTV.text = data.goodsNames.handlerNull()
            holder.mParentLL.setOnClickListener {
                listener.onItemClick(data)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mSendTV: TextView = view.findViewById(R.id.mSendTV)
        val mOrderId: TextView = view.findViewById(R.id.mOrderId)
        val mStatusTV: TextView = view.findViewById(R.id.mStatusTV)
        val mOrderCreateTimeTV: TextView = view.findViewById(R.id.mOrderCreateTimeTV)
        val mSellerTV: TextView = view.findViewById(R.id.mSellerTV)
        val mPartNamesTV: TextView = view.findViewById(R.id.mPartNamesTV)
        val mTotalPriceTV: TextView = view.findViewById(R.id.mTotalPriceTV)
        val mTotalCountTV: TextView = view.findViewById(R.id.mTotalCountTV)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
    }

    interface ItemClickCallback {
        fun onItemClick(bean: OrderEntity.DataBean.RecordsBean)
    }
}
package com.android.ctgapp.adapter.deal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.deal.OrderDetailActivity
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.OrderEntity
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.widget.dialog.SendGoodsDialog
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 11/16/20
 *描述: 订单 适配器
 */
class OrderAdapter(private val context: FragmentActivity, private val mList: List<OrderEntity.DataBean.RecordsBean>, private val listener: OrderListener) : BaseEmptyRecyclerViewAdapter(context, mList), SendGoodsDialog.Callback {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_order_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mOrderId.text = data.orderNo.handlerNull()
            //根据flow如果为2展示联盟名称其他展示卖家
            if (data.flow == 2) {
                holder.mSellerTV.text = data.allianceName.handlerNull()
            } else {
                holder.mSellerTV.text = data.sellerCompanyName.handlerNull()
            }
            holder.mOrderCreateTimeTV.text = data.createTime.handlerNull()
            val money = MyConstants.RMB + data.totalPrice.handlerNull()
            holder.mTotalPriceTV.text = money
            //1待付款  2待发货 3待收货 4已完成  7已取消 9退款中
            val status = when (data.state) {
                1 -> {
                    holder.mStatusTV.textColorResource = R.color.red_start
                    "待付款"
                }
                2 -> {
                    holder.mStatusTV.textColorResource = R.color.text_gray_light
                    "待发货"
                }
                3 -> {
                    holder.mStatusTV.textColorResource = R.color.red_start
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
            val part="${data.goodsNames.handlerNull()}x${data.totalNumber}"
            holder.mPartNamesTV.text = part
            //订单详情
            holder.mParentLL.setOnClickListener {
                MyLog.d("带过去的type:${data.state}")
                context.startActivity<OrderDetailActivity>(
                    MyConstants.TYPE to data.state,
                    MyConstants.ORDER_ID to data.orderId
                )
            }
            if (data.returnStatus == 2) {
                holder.mSendTV.visibility = View.VISIBLE
            } else {
                holder.mSendTV.visibility = View.GONE
            }

            holder.mSendTV.setOnClickListener {
                SendGoodsDialog(data.returnOrderId.handlerNull(), this).show(context.supportFragmentManager, "")
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mOrderId: TextView = view.findViewById(R.id.mOrderId)
        val mStatusTV: TextView = view.findViewById(R.id.mStatusTV)
        val mOrderCreateTimeTV: TextView = view.findViewById(R.id.mOrderCreateTimeTV)
        val mSellerTV: TextView = view.findViewById(R.id.mSellerTV)
        val mPartNamesTV: TextView = view.findViewById(R.id.mPartNamesTV)
        val mSendTV: TextView = view.findViewById(R.id.mSendTV)
        val mTotalPriceTV: TextView = view.findViewById(R.id.mTotalPriceTV)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
    }

    override fun sendGoodsFinish() {
        listener.onReturnCallback()
    }

    interface OrderListener {
        fun onReturnCallback()
    }
}
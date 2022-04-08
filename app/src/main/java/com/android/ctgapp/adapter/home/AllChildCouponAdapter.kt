package com.android.ctgapp.adapter.home

import android.content.Context
import android.graphics.Color
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.deal.OrderDetailActivity
import com.android.ctgapp.activity.deal.ReturnGoodsDetailActivity
import com.android.ctgapp.activity.mine.ALLCouponsActivity
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.CouponAllEntity
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.*

/**
 *作者:LiBW
 *创建日期: 12/30/20
 *描述: 全部优惠券详情子页面使用的适配器
 */
class AllChildCouponAdapter(private val context: Context, private val mList: List<CouponAllEntity.Data.UseRecord>) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_child_coupon_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            //val activity = context as ALLCouponsActivity
            val data = mList[position]
            holder.mBillNoTV.text= Html.fromHtml("<u>${data.billNo}</u>")
            holder.mTimeTV.text=data.createTime.replace("T"," ")
            holder.mUseAmountTV.text=data.useAmount.handlerNull()
            holder.mUserNameTV.text=data.userName
            //跳转到订单详情或退货详情
            holder.mBillNoTV.setOnClickListener {
               when(data.changeType){
                   2->{
                       context.startActivity<ReturnGoodsDetailActivity>(
                           MyConstants.ORDER_NO to data.billNo
                       )
                   }
                   else->{
                       context.startActivity<OrderDetailActivity>(
                           MyConstants.ORDER_NO to data.billNo
                       )
                   }
               }
            }

        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mBillNoTV: TextView = view.findViewById(R.id.mBillNoTV)
        val mUseAmountTV: TextView = view.findViewById(R.id.mUseAmountTV)
        val mUserNameTV: TextView = view.findViewById(R.id.mUserNameTV)
        val mTimeTV: TextView = view.findViewById(R.id.mTimeTV)
    }


}
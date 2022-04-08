package com.android.ctgapp.adapter.deal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.deal.ReturnGoodsDetailActivity
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.deal.AfterSaleListEntity
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.startActivity
import java.lang.StringBuilder

class AfterSaleAdapter(private val context: Context, private val mList: List<AfterSaleListEntity.DataBean.RecordsBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_after_sale_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mOrderNumberTV.text = data.returnNo.handlerNull()

            val status=when(data.returnStatus){
                1->"审核中"
                2->"待退货"
                3->"拒绝退货"
                4->"验货不通过"
//                5->"已收货"
                5->"验货中"
                6->"退款成功"
                7->"已取消"
                8->"退款中"
//                9->"待收货/已发货"
                9->"验货中"
                -1->"审核不通过"
                -2->"待审核"
                else->""
            }

            holder.mStatueTV.text = status

            //根据flow如果为2展示联盟名称其他展示卖家
            if (data.flow==2){
                holder.mSellerTV.text = data.allianceName.handlerNull()
            }else{
                holder.mSellerTV.text = data.sellerCompanyName.handlerNull()
            }
            //所有售出配件
            val parts = StringBuilder()
            data.returnOrderGoods?.forEach {
                parts.append("  ${it.goodsName}")
                parts.append(" x${it.returnNum}")
            }
            holder.mPartsTV.text = parts.toString()
            holder.mRelevancyOrderNumberTV.text = data.orderNo.handlerNull()
            holder.mParentLL.setOnClickListener {
                context.startActivity<ReturnGoodsDetailActivity>(
                    MyConstants.ORDER_ID to data.id,
                    MyConstants.TYPE to data.returnStatus
                )
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mOrderNumberTV: TextView = view.findViewById(R.id.mOrderNumberTV)
        val mStatueTV: TextView = view.findViewById(R.id.mStatueTV)
        val mPartsTV: TextView = view.findViewById(R.id.mPartsTV)
        val mSellerTV: TextView = view.findViewById(R.id.mSellerTV)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)


        //关联订单号
        val mRelevancyOrderNumberTV: TextView = view.findViewById(R.id.mRelevancyOrderNumberTV)
    }
}
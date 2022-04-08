package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.mine.JiaoYiLiuShuiEntity
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.textColorResource

class CheckFlowAdapter(private val context: Context, private val mList: List<JiaoYiLiuShuiEntity.DataBean.RecordsBean>) : BaseRecyclerViewAdapter(context, mList) {


    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_check_flow_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mCompanyNameTV.text=data.orgName.handlerNull()
            holder.mFromTV.text=when(data.payWay){
                1-> "白条"
                2-> "微信"
                3-> "支付宝"
                4-> "余额"
                5-> "erp支付"
                6-> "线下支付"
                7->"储值卡"
                8->"代金券"
                else->""
            }

            var money=""
            if (data.balanceType==1){
                money="+ ¥${data.amount}"
                holder.mMoneyTV.textColorResource=R.color.green
            }else{
                money= "- ¥${data.amount}"
                holder.mMoneyTV.textColorResource=R.color.red_start
            }
            holder.mMoneyTV.text=money
            holder.mOrderTV.text=data.actionNum.handlerNull()
            holder.mTimeTV.text=data.recordTime.handlerNull()
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mCompanyNameTV: TextView = view.findViewById(R.id.mCompanyNameTV)
        val mFromTV: TextView = view.findViewById(R.id.mFromTV)
        val mMoneyTV: TextView = view.findViewById(R.id.mMoneyTV)
        val mOrderTV: TextView = view.findViewById(R.id.mOrderTV)
        val mTimeTV: TextView = view.findViewById(R.id.mTimeTV)
    }
}
package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.CurrentBalanceDetailEntity
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.textColorResource

class CompanyBalanceDetailAdapter(private val context: Context, private val mList: List<CurrentBalanceDetailEntity.DataBean.RecordsBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_company_balance_detail_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mTimeTV.text = data.changeTime.handlerNull()
            //变动类型 1-充值 2-提现 3-消费 4-退货
            when (data.cashChangeCategory) {
                1 -> {
                    holder.mTypeTV.text = "充值"
                    holder.mMoneyTV.textColorResource=R.color.green_color
                    val  cashChange="+ ${data.cashChange.handlerNull()}"
                    holder.mMoneyTV.text=cashChange
                }
                2 -> {
                    holder.mTypeTV.text = "提现"
                    holder.mMoneyTV.textColorResource=R.color.red_start
                    val  cashChange="- ${data.cashChange.handlerNull()}"
                    holder.mMoneyTV.text=cashChange
                }
                3 -> {
                    holder.mTypeTV.text = "消费"
                    holder.mMoneyTV.textColorResource=R.color.red_start
                    val  cashChange="- ${data.cashChange.handlerNull()}"
                    holder.mMoneyTV.text=cashChange
                }
                4 -> {
                    holder.mTypeTV.text = "退货"
                    holder.mMoneyTV.textColorResource=R.color.green_color
                    val  cashChange="+ ${data.cashChange.handlerNull()}"
                    holder.mMoneyTV.text=cashChange

                }
                else ->{
                    holder.mTypeTV.text = "未知交易"
                    holder.mMoneyTV.textColorResource=R.color.gray_text
                    holder.mMoneyTV.text=data.cashChange.handlerNull()
                }
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mTypeTV: TextView = view.findViewById(R.id.mTypeTV)
        val mTimeTV: TextView = view.findViewById(R.id.mTimeTV)
        val mMoneyTV: TextView = view.findViewById(R.id.mMoneyUsedTV)
    }

}
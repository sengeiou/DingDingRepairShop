package com.android.ctgapp.adapter.mine.whitebar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.mine.WhiteBarDetailEntity
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.textColorResource

class WhitBarDetailAdapter(private val context: Context, private val mList: List<WhiteBarDetailEntity.DataBean.ListBean>, private val listener: WhitBarDetailCallback) : BaseRecyclerViewAdapter(context, mList) {


    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_white_bar_detail_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mParentLL.setOnClickListener {
                listener.onItemSelect(position)
            }
            holder.mCompanyNameTV.text = data.orgName.handlerNull()
            //0.对账中 1.未还款 2.已还款
            when (data.returnType) {
                0 -> {
                    holder.mPayStatueTV.text = "对账中"
                    holder.mPayStatueTV.textColorResource = R.color.blue_light
                    holder.mCheckBox.isEnabled = false
                }
                1 -> {
                    holder.mPayStatueTV.text = "未还款"
                    holder.mPayStatueTV.textColorResource = R.color.red_start
                    holder.mCheckBox.isEnabled = true
                }
                2 -> {
                    holder.mPayStatueTV.text = "已还款"
                    holder.mPayStatueTV.textColorResource = R.color.green_color
                    holder.mCheckBox.isEnabled = false
                }
            }
            //设置选中状态
            if (data.returnType == 1) {
                holder.mCheckBox.isChecked = data.selected
            }

            val count = "(共${data.num}笔)"
            holder.mPayedCountTV.text = count
            val money = "¥${data.totalMoney.handlerNull()}"
            holder.mPayMoneyTV.text = money

            holder.mCheckBox.setOnClickListener {
                listener.onCheckBoxSelect(position, holder.mCheckBox.isChecked)
            }

        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
        val mCompanyNameTV: TextView = view.findViewById(R.id.mCompanyNameTV)
        val mPayStatueTV: TextView = view.findViewById(R.id.mPayStatueTV)
        val mPayedCountTV: TextView = view.findViewById(R.id.mPayedCountTV)
        val mPayMoneyTV: TextView = view.findViewById(R.id.mPayMoneyTV)
        val mParentLL: LinearLayoutCompat = view.findViewById(R.id.mParentLL)
    }

    interface WhitBarDetailCallback {
        fun onItemSelect(position: Int)
        fun onCheckBoxSelect(position: Int, select: Boolean)
    }
}
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
import com.android.ctgapp.entity.mine.WhiteBarDetailChildEntity
import com.android.ctgapp.util.handlerNull

class WhiteBarDetailChildAdapter(private val context: Context, private val mList: List<WhiteBarDetailChildEntity.DataBean.ListBean>,private val listener:WhiteBarDetailChildCallback) : BaseRecyclerViewAdapter(context, mList) {


    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_white_bar_detail_child_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mCheckBox.isEnabled=data.canSelect
            holder.mCheckBox.isChecked=data.selected
            holder.mCheckBox.setOnClickListener {
                listener.onCheckBoxClick(position,holder.mCheckBox.isChecked)
            }
            holder.mParentLL.setOnClickListener {
                listener.onItemClick(position)
            }
            val order = "${data.orderNo.handlerNull()}"
            holder.mOrderNumberTV.text = order
            val money1 = "¥${data.orderMoney.handlerNull()}"
            holder.mOrderPriceTV.text = money1
            val money2 = "¥${data.billMoney.handlerNull()}"
            holder.mAccountPriceTV.text = money2
            val time="${data.createTime}"
            holder.mOrderTimeTV.text=time
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mParentLL: LinearLayoutCompat = view.findViewById(R.id.mParentLL)
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
        val mOrderPriceTV: TextView = view.findViewById(R.id.mOrderPriceTV)
        val mAccountPriceTV: TextView = view.findViewById(R.id.mAccountPriceTV)
        val mOrderNumberTV:TextView=view.findViewById(R.id.mOrderNumberTV)
        val mOrderTimeTV:TextView=view.findViewById(R.id.mOrderTimeTV)
    }
    interface WhiteBarDetailChildCallback{
        fun onCheckBoxClick(position: Int, select:Boolean)
        fun onItemClick(position: Int)
    }

}
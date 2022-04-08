package com.android.ctgapp.adapter.mine.whitebar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.mine.PrepaymentChildEntity
import com.android.ctgapp.entity.mine.PrepaymentEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull

class PrepaymentChildAdapter(private val context: Context, private val mList: List<PrepaymentChildEntity.DataBean.PageBean.RecordsBean>, private val listener: PrepaymentChildCallback) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_prerpayment_child_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mCheckBox.isChecked=data.selected
            holder.mCheckBox.setOnClickListener {
                MyLog.d("来来来 点击了按钮")
                listener.onCheckBoxCheck(position, holder.mCheckBox.isChecked)
            }
            holder.mParentLL.setOnClickListener {
                listener.onItemSelect(position)
            }
            "采购订单:${data.orderId.handlerNull()}".also { holder.mOrderNoTV.text = it }
            "¥${data.amount.handlerNull()}".also { holder.mMoneyTV.text = it }
            val money=data.amount.handlerNull()
            if (money == "0" || money == "0.0" || money == "0.00" || money.isEmpty()) {
                holder.mCheckBox.visibility = View.INVISIBLE
            } else {
                holder.mCheckBox.visibility = View.VISIBLE
            }
        }
    }


    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
        val mOrderNoTV: TextView = view.findViewById(R.id.mOrderNoTV)
        val mMoneyTV: TextView = view.findViewById(R.id.mMoneyTV)
        val mParentLL: LinearLayoutCompat = view.findViewById(R.id.mParentLL)

    }

    interface PrepaymentChildCallback {
        fun onItemSelect(position: Int)
        fun onCheckBoxCheck(position: Int, select: Boolean)
    }
}
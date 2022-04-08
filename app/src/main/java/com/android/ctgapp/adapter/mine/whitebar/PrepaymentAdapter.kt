package com.android.ctgapp.adapter.mine.whitebar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.mine.PrepaymentEntity
import com.android.ctgapp.util.handlerNull

class PrepaymentAdapter(private val context: Context, private val mList: List<PrepaymentEntity.DataBean.ListBean>, private val listener: PrepaymentCallback) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_prerpayment_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mCheckBox.isChecked = data.selected

            holder.mCheckBox.setOnClickListener {
                listener.onCheckBoxCheck(position, holder.mCheckBox.isChecked)
            }
            holder.mCompanyNameTV.text = data.companyName.handlerNull()
            "共(${data.count.handlerNull()})笔".also { holder.mPayCountTV.text = it }
            val money = data.noPayMoney.handlerNull()
            "¥${money}".also { holder.mMoneyTV.text = it }
            if (money == "0" || money == "0.0" || money == "0.00" || money.isEmpty()) {
                holder.mCheckBox.visibility = View.INVISIBLE
            } else {
                holder.mCheckBox.visibility = View.VISIBLE
            }
            holder.mParentRL.setOnClickListener {
                listener.onItemSelect(position)
            }
        }
    }


    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
        val mCompanyNameTV: TextView = view.findViewById(R.id.mCompanyNameTV)
        val mPayCountTV: TextView = view.findViewById(R.id.mPayCountTV)
        val mMoneyTV: TextView = view.findViewById(R.id.mMoneyTV)
        val mParentRL: RelativeLayout = view.findViewById(R.id.mParentRL)
    }

    interface PrepaymentCallback {
        fun onItemSelect(position: Int)
        fun onCheckBoxCheck(position: Int, select: Boolean)
    }
}
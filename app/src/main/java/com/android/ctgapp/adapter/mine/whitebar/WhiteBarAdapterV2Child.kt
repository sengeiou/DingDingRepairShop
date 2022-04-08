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
import com.android.ctgapp.activity.mine.whitebar.WhiteBarDetailActivity
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.WhiteBarEntityV2
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource

class WhiteBarAdapterV2Child(private val context: Context, private val mList: List<WhiteBarEntityV2.DataBean.ListBeanX.ListBean>, private val time: String, private val listener: WhiteBarAdapterV2ChildCallBack, private val positionParent: Int) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_white_bar_listv2_child, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            val time1 = "${time}-01"
            holder.mLeftDateTV.text = time1
            val time2 = "最迟还款日:${data.lastDay.handlerNull()}"
            holder.mRightDateTV.text = time2
            holder.mOrderNumberTV.text = data.billNo.handlerNull()
            holder.mNeedInvoiceTV.text = if (data.invoiceType == 1) "开票" else "不开票"
            //0.对账中 1.未还款 2.已还款
            when (data.returnType) {
                0 -> {
                    holder.mIsPayedTV.text = "对账中"
                    holder.mIsPayedTV.textColorResource = R.color.blue_light
                    holder.mCheckBox.isEnabled = false
                }
                1 -> {
                    holder.mIsPayedTV.text = "未还款"
                    holder.mIsPayedTV.textColorResource = R.color.red_start
                    holder.mCheckBox.isEnabled = true
                }
                2 -> {
                    holder.mIsPayedTV.text = "已还款"
                    holder.mIsPayedTV.textColorResource = R.color.green_color
                    holder.mCheckBox.isEnabled = false
                }
            }


            val money = "¥${data.noPayMoney.handlerNull()}"
            holder.mInvoiceAmountTV.text = money



            if (data.returnType == 1) {
                holder.mCheckBox.isChecked = data.selected
            }


            holder.mCheckBox.setOnClickListener {
                listener.onItemClick(positionParent, position, holder.mCheckBox.isChecked)
            }
            holder.mParentRL.setOnClickListener {
                context.startActivity<WhiteBarDetailActivity>(
                    MyConstants.BILL_NO to data.billNo.handlerNull(),

                    )
            }
        }
    }


    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mLeftDateTV: TextView = view.findViewById(R.id.mLeftDateTV)
        val mRightDateTV: TextView = view.findViewById(R.id.mRightDateTV)
        val mOrderNumberTV: TextView = view.findViewById(R.id.mOrderNumberTV)
        val mNeedInvoiceTV: TextView = view.findViewById(R.id.mNeedInvoiceTV)
        val mIsPayedTV: TextView = view.findViewById(R.id.mIsPayedTV)
        val mInvoiceAmountTV: TextView = view.findViewById(R.id.mInvoiceAmountTV)
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
        val mParentRL: RelativeLayout = view.findViewById(R.id.mParentRL)
    }

    interface WhiteBarAdapterV2ChildCallBack {
        fun onItemClick(positionParent: Int, positionChild: Int, select: Boolean)
    }
}
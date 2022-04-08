package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.deal.ChatersBean
import com.android.ctgapp.entity.deal.OrderDetailEntity
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.widget.dialog.company.OrderDetailCanChartDialog

class OrderCanChartAdapter(private val context: Context, private val list: List<ChatersBean>, private val listener: OrderCanChartAdapterListener) : BaseEmptyRecyclerViewAdapter(context, list){
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_order_can_chartist, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data=list[position]
            holder.mNameTV.text=data.name.handlerNull()
            holder.mCardParent.setOnClickListener {
                listener.goTalk(position)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mNameTV: TextView = view.findViewById(R.id.mNameTV)
        val mCardParent: LinearLayout = view.findViewById(R.id.mCardParent)
    }

    interface OrderCanChartAdapterListener {
        fun goTalk(position: Int)
    }
}
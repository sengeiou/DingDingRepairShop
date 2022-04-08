package com.android.ctgapp.adapter.mine.whitebar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.WhiteBarEntityV1
import com.android.ctgapp.util.handlerNull

class WhiteBarAdapter(private val context: Context, private val mList: List<WhiteBarEntityV1.DataBean.PageBean.RecordsBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_white_bar_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mMoneyUsedTV.text = data.allMoney.handlerNull()
            holder.mNameTV.text = data.companyName.handlerNull()
            holder.mMoneyNeedReturnTV.text = data.noPayMoney.handlerNull()
        }
    }


    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mNameTV: TextView = view.findViewById(R.id.mNameTV)
        val mMoneyUsedTV: TextView = view.findViewById(R.id.mMoneyUsedTV)
        val mMoneyNeedReturnTV: TextView = view.findViewById(R.id.mMoneyNeedReturnTV)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)

    }
}
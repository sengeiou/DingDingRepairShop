package com.android.ctgapp.adapter.mine.whitebar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.WhiteBarEntityV2
import com.android.ctgapp.util.handlerNull

class WhiteBarAdapterV2(private val context: Context, private val mList: List<WhiteBarEntityV2.DataBean.ListBeanX>,private val listener: WhiteBarAdapterV2CallBack) : BaseEmptyRecyclerViewAdapter(context, mList), WhiteBarAdapterV2Child.WhiteBarAdapterV2ChildCallBack {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_white_bar_listv2, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            val time = data.time.handlerNull()
            holder.mTopDateTV.text = time
            data.list?.let {
                val mAdapter = WhiteBarAdapterV2Child(context, it, time,this,position)
                holder.mRecyclerView.adapter = mAdapter
                holder.mRecyclerView.layoutManager = LinearLayoutManager(context)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mTopDateTV: TextView = view.findViewById(R.id.mTopDateTV)
        val mRecyclerView: RecyclerView = view.findViewById(R.id.mRecyclerView)
    }

    interface WhiteBarAdapterV2CallBack {
        fun onItemClick(positionParent:Int,positionChild: Int, select: Boolean)
    }

    override fun onItemClick(positionParent: Int, positionChild: Int, select: Boolean) {
        listener.onItemClick(positionParent, positionChild, select)
    }
}
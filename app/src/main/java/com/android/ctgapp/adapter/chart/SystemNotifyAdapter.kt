package com.android.ctgapp.adapter.chart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.chart.ChartFaceBean
import com.android.ctgapp.entity.chart.SystemNotifyEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import com.bumptech.glide.Glide

class SystemNotifyAdapter(private val context: Context, private val mList: List<SystemNotifyEntity.DataBean.RecordsBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {
    private var listener: SystemNotifyListener? = null

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var mParentLL: LinearLayoutCompat = view.findViewById(R.id.mParentLL)
        var mCompanyNameTV: TextView = view.findViewById(R.id.mCompanyNameTV)
        var mTitleTV: TextView = view.findViewById(R.id.mTitleTV)
        var mTimeTV: TextView = view.findViewById(R.id.mTimeTV)
        var mContantTV: TextView = view.findViewById(R.id.mContantTV)
        var mUnreadIV: ImageView = view.findViewById(R.id.mUnreadIV)
    }

    fun getListener(listener: SystemNotifyListener) {
        this.listener = listener
    }

    interface SystemNotifyListener {
        fun onItemClickListener(position: Int)
    }


    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_system_notify_list, parent, false)
        return MyViewHolder(view)
    }

//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        val data = mList[position]
//        MyLog.d("打印一下:${data.isRead}")
//        if (data.isRead==1){
//            holder.mUnreadIV.visibility=View.GONE
//        }else{
//            holder.mUnreadIV.visibility=View.VISIBLE
//        }
//
//        holder.mTitleTV.text=data.msgTypeDesc.handlerNull()
//
//        if (data.senderCompanyName.handlerNull().isEmpty()){
//            holder.mCompanyNameTV.visibility=View.GONE
//        }else{
//            holder.mCompanyNameTV.visibility=View.VISIBLE
//            holder.mCompanyNameTV.text=data.senderCompanyName.handlerNull()
//        }
//        holder.mTimeTV.text=data.createTime.handlerNull()
//        holder.mContantTV.text=data.message.handlerNull()
//        holder.mParentLL.setOnClickListener {
//            listener?.onItemClickListener(position)
//        }
//    }


    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            MyLog.d("打印一下:${data.isRead}")
            if (data.isRead == 1) {
                holder.mUnreadIV.visibility = View.GONE
            } else {
                holder.mUnreadIV.visibility = View.VISIBLE
            }

            holder.mTitleTV.text = data.msgTypeDesc.handlerNull()

            if (data.senderCompanyName.handlerNull().isEmpty()) {
                holder.mCompanyNameTV.visibility = View.GONE
            } else {
                holder.mCompanyNameTV.visibility = View.VISIBLE
                holder.mCompanyNameTV.text = data.senderCompanyName.handlerNull()
            }
            holder.mTimeTV.text = data.createTime.handlerNull()
            holder.mContantTV.text = data.message.handlerNull()
            holder.mParentLL.setOnClickListener {
                listener?.onItemClickListener(position)
            }
        }
    }

}
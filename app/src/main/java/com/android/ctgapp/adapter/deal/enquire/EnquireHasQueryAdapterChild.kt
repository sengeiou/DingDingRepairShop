package com.android.ctgapp.adapter.deal.enquire

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.EnquireWhiteEntityV3
import com.android.ctgapp.entity.home.ImmutablePairsChildBean
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.textColorResource

class EnquireHasQueryAdapterChild(private val context: Context, private val mList: List<ImmutablePairsChildBean>) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_enquire_has_query_child, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder){
            val data=mList[position]
            holder.mNameTV.text=data.partName.handlerNull()
            "编码: ${data.oe.handlerNull()}".also { holder.mCodeTV.text = it }
            holder.mReceiveTimeTV.text="送达时间: ${data.aogTime.handlerNull()}"
            "¥${data.price.handlerNull()}".also { holder.mMoneyTV.text = it }
            if (data.partState==0){
                holder.mStatueTV.text="未购"
                holder.mStatueTV.textColorResource=R.color.red_start
                holder.mMoneyTV.textColorResource=R.color.red_start

            }else{
                holder.mStatueTV.text="已购"
                holder.mStatueTV.textColorResource=R.color.green_color
                holder.mMoneyTV.textColorResource=R.color.green_color
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mNameTV:TextView=view.findViewById(R.id.mNameTV)
        val mStatueTV:TextView=view.findViewById(R.id.mStatueTV)
        val mCodeTV:TextView=view.findViewById(R.id.mCodeTV)
        val mMoneyTV:TextView=view.findViewById(R.id.mMoneyTV)
        val mReceiveTimeTV:TextView=view.findViewById(R.id.mReceiveTimeTV)
    }
}
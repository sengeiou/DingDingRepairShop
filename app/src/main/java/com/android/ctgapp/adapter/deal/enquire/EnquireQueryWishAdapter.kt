package com.android.ctgapp.adapter.deal.enquire

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.deal.enquire.EnquireWishDetailActivity
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.deal.enquire.EnquireWishEntity
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource

class EnquireQueryWishAdapter(private val context: Context, private val mList: List<EnquireWishEntity.DataBean>) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_enquire_query_wish_parent, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder){
            val data=mList[position]
            //1:待处理 2:已处理（已完成）
            when(data.wishListStatus){
                1->{
                    holder.mStatueTV.text="待处理"
                    holder.mStatueTV.textColorResource=R.color.red_start
                }
                2->{
                    holder.mStatueTV.text="已完成"
                    holder.mStatueTV.textColorResource=R.color.green
                }
            }
            holder.mTimeTV.text=data.createTime.handlerNull()
            "零件名称: ${data.partNames.handlerNull()}".also { holder.mPartNameTV.text = it }
            "总数量: ${data.totalNumber.handlerNull()}".also { holder.mCountTV.text = it }
            "总价格: ¥${data.totalPrice.handlerNull()}".also { holder.mAllMoneyTV.text = it }
            holder.mParentLL.setOnClickListener {
                context.startActivity<EnquireWishDetailActivity>(
                    MyConstants.FLAG to data.wishListId
                )
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mTimeTV: TextView = view.findViewById(R.id.mTimeTV)
        val mStatueTV: TextView = view.findViewById(R.id.mStatueTV)
        val mPartNameTV: TextView = view.findViewById(R.id.mPartNameTV)
        val mCountTV: TextView = view.findViewById(R.id.mCountTV)
        val mAllMoneyTV: TextView = view.findViewById(R.id.mAllMoneyTV)
        val mParentLL: LinearLayoutCompat = view.findViewById(R.id.mParentLL)
    }
}
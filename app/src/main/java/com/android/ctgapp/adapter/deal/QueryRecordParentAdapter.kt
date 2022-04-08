package com.android.ctgapp.adapter.deal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.activity.deal.QueryRecordActivity
import com.android.ctgapp.activity.message.chart.CurrentChartActivity
import com.android.ctgapp.activity.message.chart.jumpToChart
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.databinding.ItemQueryRecordParentListBinding
import com.android.ctgapp.entity.home.enquire.RightBean
import com.android.ctgapp.util.handlerNull

class QueryRecordParentAdapter(private val context: Context, private val mList: List<RightBean>,private val listener:RightCallback ,private val isPart:Boolean) : BaseRecyclerViewAdapter(context, mList) {

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val mBinding=ItemQueryRecordParentListBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(mBinding)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mCheckBox.isChecked=data.select
            if (isPart){
                holder.mPartNameTV.text=data.companyName
            }else{
                holder.mPartNameTV.text=data.partName
            }
            holder.mPartPriceTV.text=data.ssssPrice.handlerNull()
            holder.mBrandTV.text=data.brand.handlerNull()
            holder.mPriceTV.text=data.price.handlerNull()
            holder.mArrivalTimeTV.text=data.receiveTime.handlerNull()
            holder.mCheckBox.setOnClickListener {
                listener.onItemClick(data,holder.mCheckBox.isChecked)
            }
            holder.mParentLL.setOnClickListener {
                holder.mCheckBox.performClick()
            }
            holder.mTalkToCompanyIV.setOnClickListener {
                context.jumpToChart(data.userId,data.userName,"",data.companyName)
            }
        }
    }

    inner class MyViewHolder(view: ItemQueryRecordParentListBinding) : RecyclerView.ViewHolder(view.root) {
        val mPartNameTV: TextView = view.mNameTV
        val mPartPriceTV: TextView = view.mPartPriceTV
        val mBrandTV: TextView = view.mBrandTV
        val mPriceTV: TextView = view.mPriceTV
        val mArrivalTimeTV: TextView = view.mArrivalTimeTV
        val mCheckBox: CheckBox = view.mCheckBox
        val mParentLL: LinearLayout = view.mParentLL
        val mUnderLine: View = view.mUnderLine
        val mTalkToCompanyIV: ImageView = view.mTalkToCompanyIV
    }
    interface RightCallback{
        fun onItemClick(data:RightBean,isCheck:Boolean)
    }

}
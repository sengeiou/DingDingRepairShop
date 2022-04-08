package com.android.ctgapp.adapter.deal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.home.EnquiryListEntity
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.textColor
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 2021/5/6
 *描述: 询价记录适配器
 */
class QueryRecordAdapter(private val context: Context, private val mList: List<EnquiryListEntity.DataBean.RecordsBean>, private val listener: QueryRecordListClick) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_query_record_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mCarNameTV.text = data.modelInfo.handlerNull()
            //询价单状态 0草稿单 1待报价 2已失效 3已报价 4已完成
            var statue = ""
            when (data.enquiryStatus) {
                0 -> {
                    holder.mStatusTV.textColorResource=R.color.gray_text
                    statue = "草稿单"
                }
                1 -> {
                    holder.mStatusTV.textColorResource=R.color.gray_text
                    statue =  "待报价"
                }
                2 -> {
                    holder.mStatusTV.textColorResource=R.color.red_start
                    statue = "已过期"
                }
                3 -> {
                    holder.mStatusTV.textColorResource=R.color.green_color
                    statue = "已报价"
                }
                4 -> {
                    statue = "已完成"
                    holder.mStatusTV.textColorResource=R.color.green_color
                }
                else -> {
                    holder.mStatusTV.textColorResource=R.color.green_color
                    statue =  ""
                }
            }
            holder.mStatusTV.text = statue
            holder.mTimeTV.text = data.createTime.handlerNull()
            holder.mOrderTV.text = data.enquiryNo.handlerNull()
            holder.mPersonTV.text = data.createUserName.handlerNull()
            (data.quotedNum.handlerNull() + "家").also { holder.mCompanyNumberTV.text = it }
            holder.mParentLL.setOnClickListener {
                listener.onListItemClick(data.enquiryId, data.enquiryStatus)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mCarNameTV: TextView = view.findViewById(R.id.mCarNameTV)
        val mStatusTV: TextView = view.findViewById(R.id.mStatusTV)
        val mTimeTV: TextView = view.findViewById(R.id.mTimeTV)
        val mOrderTV: TextView = view.findViewById(R.id.mOrderTV)
        val mPersonTV: TextView = view.findViewById(R.id.mPersonTV)
        val mCompanyNumberTV: TextView = view.findViewById(R.id.mCompanyNumberTV)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
    }

    interface QueryRecordListClick {
        fun onListItemClick(enquiryId: Int, statuesCode: Int)
    }


}
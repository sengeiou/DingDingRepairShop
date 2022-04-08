package com.android.ctgapp.adapter.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.home.TrolleyEntity
import com.android.ctgapp.util.handlerNull
import com.yanzhenjie.recyclerview.SwipeRecyclerView
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 2020/11/10
 *描述: 确认订单
 */
class OrderConfirmAdapter(private val context: Context, private var mList: List<TrolleyEntity.DataBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_order_confirm_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            val list = ArrayList<TrolleyEntity.DataBean.DetailsBean>()
            val mAdapter = OrderConfirmItemAdapter(context, list)
            holder.mItemRV.adapter = mAdapter
            holder.mItemRV.layoutManager = LinearLayoutManager(context)
            holder.mTitleTV.text = data.companyName.handlerNull()
            data.details?.let {
                list.clear()
                list.addAll(it)
                mAdapter.notifyDataSetChanged()
            }
            data.supportWithCredit?.let {
                holder.mSupportCreditTV.visibility = View.VISIBLE
                if (it) {
                    holder.mSupportCreditTV.text = "该企业支持挂账"
                    holder.mSupportCreditTV.textColorResource=R.color.gray_text
                } else {
                    holder.mSupportCreditTV.text = "该企业不支持挂账"
                    holder.mSupportCreditTV.textColorResource=R.color.red_start
                }
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mItemRV: SwipeRecyclerView = view.findViewById(R.id.mItemRV)
        val mTitleTV: TextView = view.findViewById(R.id.mTitleTV)
        val mSupportCreditTV: TextView = view.findViewById(R.id.mSupportCreditTV)
    }


}
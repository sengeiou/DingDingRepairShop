package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.CarSeriesEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull

class WeiXiuDengJiAdapter(private val context: Context, private val mList: List<CarSeriesEntity.DataBean>, private val listener: WeiXiuDengJiAdapter.CallBack) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_car_series_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {

            val data = mList[position]
            holder.mCheckBox.isChecked=data.select
            holder.mItemNameTV.text = data.name.handlerNull()
            holder.mParentLL.setOnClickListener {
                holder.mCheckBox.performClick()
            }

            holder.mCheckBox.setOnClickListener {
                mList.forEach {
                    it.select=false
                }
                mList[position].select=true
                notifyDataSetChanged()
            }
        }
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mItemNameTV: TextView = view.findViewById(R.id.mItemNameTV)
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
    }

    interface CallBack {
        fun selectCallBack(select: Boolean, data: CarSeriesEntity.DataBean)
    }

}
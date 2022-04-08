package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.DepartmentHorizontalEntity
import com.android.ctgapp.util.handlerNull

class DepartmentHorizontalAdapter(private val context: Context, private val mList: ArrayList<DepartmentHorizontalEntity>, private val listener: HorizontalListener) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_department_horizontal_list, null, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]

            holder.mDepartmentNameTV.text = data.departmentName.handlerNull()
            //点击事件
            holder.mDepartmentLL.setOnClickListener {
                listener.onItemClickListener(position,data.departmentId)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mDepartmentNameTV: TextView = view.findViewById(R.id.mDepartmentNameTV)
        val mDepartmentLL: LinearLayout = view.findViewById(R.id.mDepartmentLL)
    }

    interface HorizontalListener {
        fun onItemClickListener(index: Int, departmentId: Int)
    }
}
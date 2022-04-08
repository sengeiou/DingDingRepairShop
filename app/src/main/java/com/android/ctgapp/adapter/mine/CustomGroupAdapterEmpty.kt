package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.FriendGroupEntity

/**
 *作者:LiBW
 *创建日期: 2020/10/12
 *描述: 自定义商友分组 页面
 */
class CustomGroupAdapterEmpty(private val context: Context, private val mList: List<FriendGroupEntity.DataBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {


    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_custom_group_list, null, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mGroupNameTV.text = data.groupName

        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mGroupNameTV: TextView = view.findViewById(R.id.mGroupNameTV)
    }
}
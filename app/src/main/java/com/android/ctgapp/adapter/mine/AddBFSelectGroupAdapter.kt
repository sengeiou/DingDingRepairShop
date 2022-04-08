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
import com.android.ctgapp.activity.mine.friend.AddSelectGroupActivity
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.FriendGroupEntity
import com.android.ctgapp.util.handlerNull

/**
 *作者:LiBW
 *创建日期: 2020/10/13
 *描述:添加商友 选择分组
 */
class AddBFSelectGroupAdapter(private val mContext: Context, private val mList: List<FriendGroupEntity.DataBean>) : BaseEmptyRecyclerViewAdapter(mContext, mList) {
    private var preSelect = -1

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.item_add_bf_select_group, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val mActivity = mContext as AddSelectGroupActivity
            val data = mList[position]
            holder.mGroupNameTV.text = data.groupName.handlerNull()
            holder.mCheckBox.isChecked = data.isSelect
            //选择
            holder.mCheckBox.setOnClickListener {
                //判断当前选中状态
                val isSelect = data.isSelect
                if (isSelect) {
                    //取消选中
                    if (preSelect != -1) {
                        mList[position].isSelect = false
                        preSelect = -1
                        notifyDataSetChanged()
                        mActivity.currentSelectId = -1
                        mActivity.currentSelectName = ""
                    }
                } else {
                    mList[position].isSelect = true
                    //恢复上一个
                    if (preSelect != -1) {
                        mList[preSelect].isSelect = false
                    }
                    preSelect = position
                    mActivity.currentSelectId = data.id
                    mActivity.currentSelectName = data.groupName.handlerNull()
                    notifyDataSetChanged()
                }
            }
            holder.mGroupLL.setOnClickListener {
                holder.mCheckBox.performClick()
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mGroupNameTV: TextView = view.findViewById(R.id.mGroupNameTV)
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
        val mGroupLL: LinearLayout = view.findViewById(R.id.mGroupLL)
    }
}
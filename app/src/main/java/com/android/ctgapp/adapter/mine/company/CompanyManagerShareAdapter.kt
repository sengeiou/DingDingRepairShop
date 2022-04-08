package com.android.ctgapp.adapter.mine.company

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.mine.company.CompanyAllUserEntity
import com.android.ctgapp.util.handlerNull

/**
 *作者:LiBW
 *创建日期: 2021/8/25
 *描述:公司 选择负责人 和选择共享人 适配器
 */
class CompanyManagerShareAdapter(private val context: Context, private val mList: List<CompanyAllUserEntity.DataBean>, private val single: Boolean = false) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_company_manager_share_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mCheckBox.isChecked = data.select
            holder.mNameTV.text = data.name.handlerNull()
            holder.mParentLL.setOnClickListener {
                holder.mCheckBox.performClick()
            }
            holder.mCheckBox.setOnClickListener {
                val check = holder.mCheckBox.isChecked
                if (single) {
                    mList.forEach {
                        it.select = false
                    }
                    data.select = check
                    notifyDataSetChanged()
                } else {
                    //多选直接改
                    data.select = check
                    notifyItemChanged(position)
                }
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mNameTV: TextView = view.findViewById(R.id.mNameTV)
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
    }
}
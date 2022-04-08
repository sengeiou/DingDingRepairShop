package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.AddClientHorizontalItemEntity
import com.android.ctgapp.entity.BusinessFriendHorizontalItemEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.textColorResource

/**
 * 作者:LiBW
 * 创建日期: 2020/10/12
 * 描述: 横向group
 */
class AddClientHorizontalMenuAdapter(private val context: Context, private val mList: ArrayList<AddClientHorizontalItemEntity>, private val callback: SelectCallback) : BaseRecyclerViewAdapter(context, mList) {
    private var preItem = 0
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_horizontal_group_list, null, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mGroupNameTV.text = data.industryName.handlerNull()
            if (data.isSelect) {
                holder.mGroupNameTV.textColorResource = R.color.colorAccent
                holder.mGroupNameIV.visibility = View.VISIBLE
            } else {
                holder.mGroupNameTV.textColorResource = R.color.gray_text
                holder.mGroupNameIV.visibility = View.INVISIBLE
            }
            holder.mGroupLL.setOnClickListener {
                if (position == preItem) return@setOnClickListener
                //更新列表
                if (data.industryCode.isNotEmpty()) {
                    callback.findByIndustryCode(data.industryCode)
                }
                mList[preItem].isSelect = false
                mList[position].isSelect = true
                preItem = position
                notifyDataSetChanged()
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mGroupNameTV: TextView = view.findViewById(R.id.mGroupNameTV)
        val mGroupNameIV: ImageView = view.findViewById(R.id.mGroupNameIV)
        val mGroupLL: LinearLayout = view.findViewById(R.id.mGroupLL)
    }

    interface SelectCallback {
        fun findByIndustryCode(industryCode: String)
    }
}
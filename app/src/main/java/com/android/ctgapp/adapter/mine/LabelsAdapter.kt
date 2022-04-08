package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.team.SelectPositionActivity
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.mine.LabelEntity
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

class LabelsAdapter(private val context: Context, private val mList: List<LabelEntity.DataBean>) : BaseRecyclerViewAdapter(context, mList) {
    private var preSelectPosition = -1

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_labels_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val mActivity = context as SelectPositionActivity
            val data = mList[position]
            holder.mLabelTV.text = data.labelName.handlerNull()
//            if (data.isSelected) {
            if (mActivity.currentLabelId==data.id) {
                holder.mLabelTV.backgroundResource = R.drawable.bg_btn_blue_light
                holder.mLabelTV.textColorResource = R.color.colorAccent
            } else {
                holder.mLabelTV.backgroundResource = R.drawable.bg_btn_gray_circle
                holder.mLabelTV.textColorResource = R.color.gray_text
            }

            holder.mLabelTV.setOnClickListener {
                //如果当前点击和之前点击的不相同
                if (preSelectPosition != position) {
                    data.isSelected = true
                    mActivity.currentLabelId = data.id
                    mActivity.currentLabelName = data.labelName.handlerNull()
                    //回复生一个标签
                    if (preSelectPosition != -1) {
                        mList[preSelectPosition].isSelected = false
                    }
                    preSelectPosition = position
                } else {
                    //如果相同则取消选中
                    mActivity.currentLabelId = -1
                    mActivity.currentLabelName = ""
                    data.isSelected = false
                }
                notifyDataSetChanged()
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mLabelTV: TextView = view.findViewById(R.id.mLabelTV)
    }

//    interface LabelsCallback {
//        fun currentSelectId(labelId: Int, labelName: String)
//    }
}
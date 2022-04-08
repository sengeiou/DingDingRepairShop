package com.android.ctgapp.adapter.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.AddPartBean
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

class AddPartAdapter(private val context: Context, private val mList: ArrayList<AddPartBean>, private val addPartCallback: AddPartCallback) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_add_part_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mTextView.text = data.partName
            holder.mParentLL.setOnClickListener {
                addPartCallback.onItemClick(data.partName,data.partCategoryId,!data.select,position)
            }
            if (data.select){
                holder.mParentLL.backgroundResource= R.drawable.bg_btn_common
                holder.mTextView.textColorResource=R.color.white_color

            }else{
                holder.mParentLL.backgroundResource= R.drawable.bg_btn_gray_circle
                holder.mTextView.textColorResource=R.color.gray_text_light
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mParentLL: RelativeLayout = view.findViewById(R.id.mParentLL)
        val mTextView: TextView = view.findViewById(R.id.mTextView)
    }

    interface AddPartCallback {
        fun onItemClick(partName:String,categoryId: String,select:Boolean,position: Int)
    }
}
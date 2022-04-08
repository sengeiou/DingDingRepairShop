package com.android.ctgapp.adapter.pupupwindow

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.GoodsByFCodeEntity
import com.android.ctgapp.entity.home.OtherAttrEntity
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource
import java.util.HashMap

class OtherAttrChildDrawAdapter(private val parentPosition:Int,private val context: Context, private val mList: List<OtherAttrEntity.DataBean.SelectBean>, private val listener: OtherAttrChildDrawListener) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_attr_horizontal_list_wrap, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            if (data.name.isEmpty()){
                holder.mTextView.text = "全部"
            }else{
                holder.mTextView.text = data.name.handlerNull()
            }
            if (data.select) {
                holder.mTextView.backgroundResource = R.drawable.bg_border_acc_circle

            } else {
                holder.mTextView.backgroundResource = R.drawable.bg_solid_gary_light_100dp
            }
            holder.mParentRL.setOnClickListener {
                listener.otherAttrChildDrawClick(!data.select, position,parentPosition)
            }

            holder.mParentRL.setOnClickListener {
                listener.otherAttrChildDrawClick(!data.select, position,parentPosition)
            }

        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mTextView: TextView = view.findViewById(R.id.mTextView)
        val mParentRL: RelativeLayout = view.findViewById(R.id.mParentRL)
    }

    interface OtherAttrChildDrawListener {
        fun otherAttrChildDrawClick(select: Boolean, position: Int,parentPosition:Int)
    }
}
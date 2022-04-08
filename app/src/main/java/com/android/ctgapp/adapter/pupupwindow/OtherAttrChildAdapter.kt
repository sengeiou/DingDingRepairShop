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

class OtherAttrChildAdapter(private val context: Context, private val mList: List<OtherAttrEntity.DataBean.SelectBean>, private val listener: OtherAttrChildListener) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_shop_vertical_menu_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mNameTV.text = data.name
            if (data.name.isEmpty()){
                holder.mParentLL.visibility=View.GONE
            }else{
                holder.mParentLL.visibility=View.VISIBLE
            }
            if (data.select) {
                holder.mNameTV.textColorResource = R.color.colorAccent
                holder.mLine.backgroundResource = R.color.colorAccent
                holder.mSelectIV.visibility = View.VISIBLE
            } else {
                holder.mNameTV.textColorResource = R.color.gray_text
                holder.mLine.backgroundResource = R.color.gray_page
                holder.mSelectIV.visibility = View.GONE
            }

            holder.mParentLL.setOnClickListener {
                listener.otherAttrChildClick(!data.select, position)
            }

        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mNameTV: TextView = view.findViewById(R.id.mNameTV)
        val mParentLL: RelativeLayout = view.findViewById(R.id.mParentLL)
        val mSelectIV: ImageView = view.findViewById(R.id.mSelectIV)
        val mLine: View = view.findViewById(R.id.mLine)
    }

    interface OtherAttrChildListener {
        fun otherAttrChildClick(select: Boolean, position: Int)
    }
}
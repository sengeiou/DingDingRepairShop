package com.android.ctgapp.adapter.home

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
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.BatchAddPartEntity
import com.android.ctgapp.entity.home.BatchAddPartEntityV2
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import com.bumptech.glide.Glide
import org.jetbrains.anko.backgroundResource

class BathAddPartChildItemAdapter(private val context: Context, private val mList: List<BatchAddPartEntityV2.DataBean>, private val listener: PartSearchCallback) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_bath_add_part_chile_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            if (data.selected) {
                holder.mSelectedTV.visibility = View.VISIBLE
                holder.mParentRL.backgroundResource = R.drawable.bg_blue_border_radius_5
            } else {
                holder.mSelectedTV.visibility = View.GONE
                holder.mParentRL.backgroundResource = R.drawable.bg_border_gray_solid_white_radius3_light
            }
            Glide.with(context).load(data.image).into(holder.mPartIV)
            holder.mPartNameTV.text = data.des.handlerNull()
            holder.mParentLL.setOnClickListener {
                listener.onPartSearchClick(data.categoryId.handlerNull(),!data.selected,data.des.handlerNull(),data.parentCategoryId.handlerNull())
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mParentRL: RelativeLayout = view.findViewById(R.id.mParentRL)
        val mPartIV: ImageView = view.findViewById(R.id.mPartIV)
        val mSelectedTV: ImageView = view.findViewById(R.id.mSelectedTV)
        val mPartNameTV: TextView = view.findViewById(R.id.mPartNameTV)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
    }

    interface PartSearchCallback {
        fun onPartSearchClick(categoryId: String,select:Boolean,partName:String,parentCategoryId:String)
    }
}
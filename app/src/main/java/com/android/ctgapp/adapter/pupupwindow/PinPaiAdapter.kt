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
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

class PinPaiAdapter(private val context: Context, private val mList: List<GoodsByFCodeEntity.DataBean.BrandListBean>, private val listener: PinPaiListener) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_attr_horizontal_list_wrap, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mTextView.text = data.brandName.handlerNull()
            if (data.select) {
                holder.mTextView.backgroundResource = R.drawable.bg_border_acc_circle
            } else {
                holder.mTextView.backgroundResource = R.drawable.bg_solid_gary_light_100dp
            }
            holder.mParentRL.setOnClickListener {
                listener.pinlaiClick(!data.select, position)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mTextView: TextView = view.findViewById(R.id.mTextView)
        val mParentRL: RelativeLayout = view.findViewById(R.id.mParentRL)
    }

    interface PinPaiListener {
        fun pinlaiClick(select: Boolean, position: Int)
    }
}
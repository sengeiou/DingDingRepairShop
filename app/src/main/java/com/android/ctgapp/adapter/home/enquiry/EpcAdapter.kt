package com.android.ctgapp.adapter.home.enquiry

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
import com.android.ctgapp.entity.home.EpcMenuEntity
import com.android.ctgapp.entity.home.enquire.EpcRightMenuEntity
import com.android.ctgapp.util.handlerNull
import com.bumptech.glide.Glide
import org.jetbrains.anko.backgroundResource

class EpcAdapter(private val context: Context, private var mList: List<EpcRightMenuEntity.DataBean>, private val epcCallback: EpcCallback) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_epc_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mParentLL.setOnClickListener {
                epcCallback.epcClick(position)
            }
            Glide.with(context).load(data.img.handlerNull()).into(holder.mImageView)
            holder.mTextView.text=data.des.handlerNull()
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
        val mImageView: ImageView = view.findViewById(R.id.mImageView)
        val mTextView: TextView = view.findViewById(R.id.mTextView)
    }

    interface EpcCallback {
        fun epcClick(position: Int)
    }
}
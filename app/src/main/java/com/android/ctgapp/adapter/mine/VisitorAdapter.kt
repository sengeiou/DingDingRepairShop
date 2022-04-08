package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.mine.VisitorListEntity
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.ossUrlHandler
import com.bumptech.glide.Glide

class VisitorAdapter(private val context: Context, private val mList: List<VisitorListEntity.DataBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_visitor_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
//            val from = "来源:${data.visitorFrom.handlerNull()}"
            holder.mFromWhereTV.text = data.visitorFrom.handlerNull()
            //判断时间和上一个是否重复 以显示时间
            when {
                position == 0 -> {
                    holder.mTimeTV.visibility = View.VISIBLE
                    holder.mTimeTV.text = data.visitDate.handlerNull()
                }
                //和上一个时间相同时不显示时间
                mList[position - 1].visitDate == mList[position].visitDate -> {
                    holder.mTimeTV.visibility = View.GONE
                }
                else -> {
                    holder.mTimeTV.visibility = View.VISIBLE
                    holder.mTimeTV.text = data.visitDate.handlerNull()
                }
            }
            //判断是否为最后一个 以区分长短下划线
            when {
                position == mList.size - 1 -> {
                    holder.mLongLine.visibility = View.GONE
                    holder.mShotLine.visibility = View.GONE
                }
                mList[position].visitDate == mList[position + 1].visitDate -> {
                    holder.mLongLine.visibility = View.GONE
                    holder.mShotLine.visibility = View.VISIBLE
                }

                else -> {
                    holder.mLongLine.visibility = View.VISIBLE
                    holder.mShotLine.visibility = View.GONE
                }
            }

            if (position == 0) {
                holder.mTimeTV.visibility = View.VISIBLE
                holder.mTimeTV.text = data.visitDate.handlerNull()
            }

            holder.mNameTV.text = data.visitorName.handlerNull().trim()
            holder.mCompanyTV.text = data.visitorDefaultCompanyName.handlerNull()
            Glide.with(context).load(data.visitorImageUrl.ossUrlHandler())
                .placeholder(R.drawable.defaulthead)
                .error(R.drawable.defaulthead)
                .into(holder.mImageView)
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mTimeTV: TextView = view.findViewById(R.id.mTimeTV)
        val mImageView: ImageView = view.findViewById(R.id.mImageView)
        val mNameTV: TextView = view.findViewById(R.id.mNameTV)
        val mCompanyTV: TextView = view.findViewById(R.id.mCompanyTV)
        val mFromWhereTV: TextView = view.findViewById(R.id.mFromWhereTV)
        val mLongLine: View = view.findViewById(R.id.mLongLine)
        val mShotLine: View = view.findViewById(R.id.mShotLine)
    }
}
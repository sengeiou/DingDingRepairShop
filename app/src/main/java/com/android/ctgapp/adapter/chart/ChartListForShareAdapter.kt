package com.android.ctgapp.adapter.chart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.activity.message.chart.card.CardShareRecentChartActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.chart.ChartListCopyEntity
import com.android.ctgapp.entity.chart.ChartListEntity
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.ossUrlHandler
import com.bumptech.glide.Glide
import org.jetbrains.anko.backgroundColorResource
import org.jetbrains.anko.textColorResource
import java.text.SimpleDateFormat
import java.util.*


class ChartListForShareAdapter(private val context: Context, private val mList: List<ChartListCopyEntity>, private val listener: ChartListListener) : BaseRecyclerViewAdapter(context, mList) {

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_chart_share_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            if (data.otherId in BaseApplication.onLineFriendIds){
                holder.mOnlineTV.text="在线"
                holder.mOnlineTV.backgroundColorResource=R.color.colorAccentLight
                holder.mOnlineTV.textColorResource=R.color.colorAccent
            }else{
                holder.mOnlineTV.text="离线"
                holder.mOnlineTV.backgroundColorResource=R.color.gray_text_light_more
                holder.mOnlineTV.textColorResource=R.color.gray_text
            }
            holder.mCheckBox.isChecked=data.selected
            Glide.with(context).load(data.otherHeaderImg.ossUrlHandler()).
                error(R.drawable.defaulthead)
                .placeholder(R.drawable.defaulthead)
            .into(holder.mImageHeaderIV)
            holder.mTitleTV.text = data.otherName
            holder.mParentRL.setOnClickListener {
                holder.mCheckBox.performClick()
            }
            holder.mCheckBox.setOnClickListener {
                val isSelect = holder.mCheckBox.isChecked
                listener.onItemClick(data.otherId, data.otherName.handlerNull(), data.otherHeaderImg.handlerNull(), data.companyName.handlerNull(), isSelect,position)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mImageHeaderIV: ImageView = view.findViewById(R.id.mImageHeaderIV)
        val mOnlineTV: TextView = view.findViewById(R.id.mOnlineTV)
        val mTitleTV: TextView = view.findViewById(R.id.mTitleTV)
        val mParentRL: RelativeLayout = view.findViewById(R.id.mParentRL)
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
    }

    interface ChartListListener {
        fun onItemClick(otherID: Int?,  otherName: String, otherImage: String, companyName: String, isSelect: Boolean,position:Int)
    }
}

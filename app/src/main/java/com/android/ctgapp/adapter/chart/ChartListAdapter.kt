package com.android.ctgapp.adapter.chart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.chart.ChartListEntity
import com.android.ctgapp.entity.chart.ChartListEntityCopy
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.ossUrlHandler
import com.bumptech.glide.Glide
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.backgroundColorResource
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource
import java.text.SimpleDateFormat
import java.util.*

class ChartListAdapter(private val context: Context, private val mList: List<ChartListEntity>, private val listener: ChartListListener) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_chart_list_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            if (data.online==1){
                holder.mOnLineIV.backgroundResource=R.drawable.bg_solid_green_circle
            }else{
                holder.mOnLineIV.backgroundResource=R.drawable.bg_solid_gray_circle_unline
            }

            Glide.with(context).load(data.otherHeaderImg.ossUrlHandler()).
                error(R.drawable.defaulthead)
                .placeholder(R.drawable.defaulthead)
            .into(holder.mImageHeaderIV)

            holder.mTitleTV.text = data.otherName
            if (data.unRedMsg == 0) {
                holder.mMegCountTV.visibility = View.GONE
            } else {
                holder.mMegCountTV.visibility = View.VISIBLE
                //信息数量超过99只显示99
                holder.mMegCountTV.text = if (data.unRedMsg > 99) "99" else data.unRedMsg.toString()
            }
            holder.mContentTV.text = data.lastMsg.handlerNull()
            val currentTime = System.currentTimeMillis()
            val checkFormat = SimpleDateFormat("dd", Locale.CHINA)
            //当天只显示时间
            val dataFormat = if (checkFormat.format(currentTime) == checkFormat.format(data.lastMsgTime)) {
                SimpleDateFormat("HH:mm", Locale.CHINA)
            } else {
                SimpleDateFormat("MM-dd HH:mm", Locale.CHINA)
            }
            holder.mLastTimeTV.text = dataFormat.format(data.lastMsgTime)
            //点击列表进入聊天室
            holder.mParentRL.setOnClickListener {
                if (data.groupId!=null){
                    //群聊
                    listener.onItemClickForMore(data.otherId, data.groupId, data.otherName, data.otherHeaderImg,data.companyName)
                }else{
                    //单聊
                    listener.onItemClick(data.otherId, data.groupId, data.otherName, data.otherHeaderImg,data.companyName)
                }
            }

            //最后一条不显示分割线
            holder.mBottomLine.visibility = if (mList.size - 1 == position) View.GONE else View.VISIBLE
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mOnLineIV: TextView = view.findViewById(R.id.mOnLineIV)
        val mImageHeaderIV: ImageView = view.findViewById(R.id.mImageHeaderIV)
        val mMegCountTV: TextView = view.findViewById(R.id.mMegCountTV)
        val mTitleTV: TextView = view.findViewById(R.id.mTitleTV)
        val mContentTV: TextView = view.findViewById(R.id.mContentTV)
        val mLastTimeTV: TextView = view.findViewById(R.id.mLastTimeTV)
        val mParentRL: RelativeLayout = view.findViewById(R.id.mParentRL)
        val mBottomLine: View = view.findViewById(R.id.mBottomLine)
    }

    interface ChartListListener {
        fun onItemClick(otherID: Int?, groupID: Int?, otherName: String, otherImage: String,companyName:String)
        fun onItemClickForMore(otherID: Int?, groupID: Int?, otherName: String, otherImage: String,companyName:String)
    }
}

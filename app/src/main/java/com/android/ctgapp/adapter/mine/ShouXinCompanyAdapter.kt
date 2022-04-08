package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.ClientCanJoinEntity
import com.android.ctgapp.entity.QiYeShouXinEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.OssImageHandler
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

class ShouXinCompanyAdapter(private val context: Context, private val mList: List<QiYeShouXinEntity.DataBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_shouxin, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mNameTV.text =data.orgName.handlerNull()
            val canUseMoney="可用额度: ¥${data.amount}"
            holder.mCanUseMoneyTV.text =canUseMoney
            MyLog.d("目标出现:${data.isAllow}")

            when (data.isAllow) {
                true -> {
                    holder.mStatueTV.text="已授权"
                    holder.mStatueTV.textColorResource=R.color.green
                }
                false -> {
                    holder.mStatueTV.text="未授权"
                    holder.mStatueTV.textColorResource=R.color.red_start
                }
                else -> {
                    holder.mStatueTV.text=""
                }
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mNameTV: TextView = view.findViewById(R.id.mNameTV)
        val mTimeTV: TextView = view.findViewById(R.id.mTimeTV)
        val mStatueTV: TextView = view.findViewById(R.id.mStatueTV)
        val mCanUseMoneyTV: TextView = view.findViewById(R.id.mCanUseMoneyTV)
    }


}
package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.AllianceEntity
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.OssImageHandler
import com.bumptech.glide.Glide
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

class AllianceUnAddedAdapter(private val context: Context, private val mList: List<AllianceEntity.DataBean>, private val listener: ListListener) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_alliance_un_added_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            Glide.with(context).load(OssImageHandler(data.logo.handlerNull()))
                .placeholder(R.drawable.logo_app_gray)
                .error(R.drawable.logo_app_gray)
                .into(holder.mLoGoIV)
            holder.mNameTV.text = data.orgname.handlerNull()
            holder.mPhoneTV.text = data.phone.handlerNull()
            holder.mTypeTV.text = data.allianceType.handlerNull()
            holder.mTypeTV.visibility = if (data.allianceType.isEmpty()) View.GONE else View.VISIBLE


            //如果非加入状态都是可以加入的
            if (data.isAdded){
                holder.mButtonTV.text = "已加入"
                holder.mButtonTV.isEnabled = false
                holder.mButtonTV.background = null
                holder.mButtonTV.textColorResource = R.color.colorAccent
            }else{
                //0:等待审核 1:审核通过 2:审核不通过（拒绝）
                when (data.auditStatus) {
                    0 -> {
                        holder.mButtonTV.text = "审核中"
                        holder.mButtonTV.isEnabled = false
                        holder.mButtonTV.background = null
                        holder.mButtonTV.textColorResource = R.color.red_start
                    }
                    else -> {
                        holder.mButtonTV.text = "加入"
                        holder.mButtonTV.isEnabled = true
                        holder.mButtonTV.backgroundResource = R.drawable.bg_company_icon
                        holder.mButtonTV.textColorResource = R.color.colorAccent
                    }
                }
            }



            holder.mButtonTV.setOnClickListener {
                listener.onItemClickListener(data.allianceId)
            }
        }
    }


    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mLoGoIV: ImageView = view.findViewById(R.id.mLoGoIV)
        val mNameTV: TextView = view.findViewById(R.id.mNameTV)
        val mPhoneTV: TextView = view.findViewById(R.id.mCompanyTV)
        val mTypeTV: TextView = view.findViewById(R.id.mTypeTV)
        val mButtonTV: TextView = view.findViewById(R.id.mButtonTV)
    }

    interface ListListener {
        fun onItemClickListener(id: Int)
    }

}
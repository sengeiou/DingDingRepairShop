package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.ApplyTeamEntity
import com.android.ctgapp.util.handlerNull
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class TeamApplyNotifyAdapter(private val context: Context, private val mList: List<ApplyTeamEntity.DataBean.RecordsBean>, private val listener: ApplyNotifyCallback) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_team_apply_notify_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mNameTV.text = data.applyUserName.handlerNull()
            val img = ossHeader + data.applyUserImageUrl
            Glide.with(context).load(img)
                .placeholder(R.drawable.defaulthead)
                .error(R.drawable.defaulthead)
                .into(holder.mImageView)
            holder.mPhoneTV.text=data.applyUserTelephone.handlerNull()
            holder.mRemarkTV.text=data.msg.handlerNull()
            //0:审核中 ；1：验证通过； 2 拒绝
            when(data.auditStatus){
                0->{
                    holder.mAgreeBTN.visibility=View.VISIBLE
                    holder.mRejectBTN.visibility=View.VISIBLE
                    holder.mAgreedTV.visibility=View.GONE
                    holder.mRejectedTV.visibility=View.GONE
                }
                1->{
                    holder.mAgreeBTN.visibility=View.GONE
                    holder.mRejectBTN.visibility=View.GONE
                    holder.mAgreedTV.visibility=View.VISIBLE
                    holder.mRejectedTV.visibility=View.GONE
                }
                2->{
                    holder.mAgreeBTN.visibility=View.GONE
                    holder.mRejectBTN.visibility=View.GONE
                    holder.mAgreedTV.visibility=View.GONE
                    holder.mRejectedTV.visibility=View.VISIBLE
                }
                else->{
                    holder.mAgreeBTN.visibility=View.GONE
                    holder.mRejectBTN.visibility=View.GONE
                    holder.mAgreedTV.visibility=View.GONE
                    holder.mRejectedTV.visibility=View.GONE
                }
            }


            //同意
            holder.mAgreeBTN.setOnClickListener {
                listener.agreeClick(data.id)
            }
            //拒绝
            holder.mRejectBTN.setOnClickListener {
                listener.rejectClick(data.id)
            }
        }
    }


    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mImageView: CircleImageView = view.findViewById(R.id.mImageView)
        val mNameTV: TextView = view.findViewById(R.id.mNameTV)
        val mPhoneTV: TextView = view.findViewById(R.id.mCompanyTV)
        val mRemarkTV: TextView = view.findViewById(R.id.mRemarkTV)
        val mAgreeBTN: TextView = view.findViewById(R.id.mAgreeBTN)
        val mRejectBTN: TextView = view.findViewById(R.id.mRejectBTN)
        val mAgreedTV: TextView = view.findViewById(R.id.mAgreedTV)
        val mRejectedTV: TextView = view.findViewById(R.id.mRejectedTV)
    }

    interface ApplyNotifyCallback {
        fun agreeClick(id: Int)
        fun rejectClick(id: Int)

    }
}
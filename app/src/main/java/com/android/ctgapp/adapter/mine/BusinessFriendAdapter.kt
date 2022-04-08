package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.bumptech.glide.Glide
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.databinding.ItemBusinessFriendListBinding
import com.android.ctgapp.entity.BusinessFriendEntity
import com.android.ctgapp.util.handlerNull
import de.hdodenhof.circleimageview.CircleImageView


/**
 *作者:LiBW
 *创建日期: 2020/10/11
 *描述:商友list适配器
 */
class BusinessFriendAdapter(private val context: Context, private val mList: ArrayList<BusinessFriendEntity.DataBean>, private val callback: Callback) : BaseEmptyRecyclerViewAdapter(context, mList) {

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val mBinding = ItemBusinessFriendListBinding.inflate(LayoutInflater.from(context), parent, false)
        return MyViewHolder(mBinding)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            val showName = when {
                data.realName.handlerNull().isNotEmpty() -> data.realName.handlerNull()
                data.friendRemark.handlerNull().isNotEmpty() -> data.friendRemark.handlerNull()
                else -> ""
            }
            holder.mUserNameTV.text = showName
            holder.mCompanyNameTV.text = data.orgname.handlerNull()

            //status状态.0:正常状态。-1：该用户被锁定 -2: 未注册
            holder.mInvitationRegisterTV.visibility = if (data.status == 2) View.VISIBLE else View.INVISIBLE
            //邀请注册
            holder.mInvitationRegisterTV.setOnClickListener {

            }
            //如果为注册则不允许进入详情页面 status状态.0:正常状态。-1：该用户被锁定 -2: 未注册
            holder.mItemRL.isEnabled = data.status == 0

            //整体点击事件
            holder.mItemRL.setOnClickListener {
                callback.onItemClick(data)
            }

            val picture = ossHeader + data.imageUrl.handlerNull()
            Glide.with(context).load(picture).
                placeholder(R.drawable.defaulthead)
                .error(R.drawable.defaulthead)
            .into(holder.mHeaderIV)
        }
    }



    inner class MyViewHolder(view: ItemBusinessFriendListBinding) : RecyclerView.ViewHolder(view.root) {
        val mHeaderIV: CircleImageView = view.mHeaderIV
        val mUserNameTV: TextView = view.mUserNameTV
        val mCompanyNameTV: TextView = view.mCompanyNameTV
        val mInvitationRegisterTV: TextView = view.mInvitationRegisterTV
        val mItemRL: RelativeLayout = view.mItemRL
    }

    interface Callback {
        fun onItemClick(data: BusinessFriendEntity.DataBean)
    }
}
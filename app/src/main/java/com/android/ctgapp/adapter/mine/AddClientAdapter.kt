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
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.OssImageHandler
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

class AddClientAdapter(private val context: Context, private val mList: List<ClientCanJoinEntity.DataBean.RecordsBean>, private val listener: AddClientListener) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_add_client_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            Glide.with(context).load(OssImageHandler(data.logo.handlerNull()))
                .
                    placeholder(R.drawable.defaulthead)
                .error(R.drawable.defaulthead)
                .into(holder.mImageView)
            holder.mCompanyNameTV.text = data.orgname.handlerNull()
            holder.mPhoneNumTV.text = data.phone
            if (data.isAdd) {
                holder.mButtonTV.isEnabled = false
                holder.mButtonTV.text = "已添加"
                holder.mButtonTV.textColorResource = R.color.text_gray_light
                holder.mButtonTV.background = null
            } else {
                holder.mButtonTV.isEnabled = true
                holder.mButtonTV.text = "添加"
                holder.mButtonTV.textColorResource = R.color.white_color
                holder.mButtonTV.backgroundResource = R.drawable.bg_btn_common_3dp
            }
            holder.mButtonTV.setOnClickListener {
                listener.onItemClick(data.companyId)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mImageView: CircleImageView = view.findViewById(R.id.mImageView)
        val mCompanyNameTV: TextView = view.findViewById(R.id.mCompanyNameTV)
        val mPhoneNumTV: TextView = view.findViewById(R.id.mPhoneNumTV)
        val mButtonTV: TextView = view.findViewById(R.id.mButtonTV)
    }

    interface AddClientListener {
        fun onItemClick(companyId: Int)
    }
}
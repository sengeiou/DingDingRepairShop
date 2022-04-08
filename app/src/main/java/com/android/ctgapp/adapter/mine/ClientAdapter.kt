package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.ClientEntity
import com.android.ctgapp.util.handlerNull

class ClientAdapter(private val context: Context, private val mList: List<ClientEntity.DataBean.RecordsBean>, private val listener: ClientCallback) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_client_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mCompanyNameTV.text = data.orgname.handlerNull()
            holder.mPhoneNumTV.text = data.phone.handlerNull()
            holder.mFirstTV.text = data.industry.handlerNull()
            if (data.industry == null) {
                holder.mFirstTV.visibility = View.GONE
            }
            //TODO 第二个字段暂时没有
            holder.mSecondTV.visibility = View.GONE
            val imageUrl = ossHeader + data.logo
            val options: RequestOptions = RequestOptions()
                .placeholder(R.drawable.defaulthead) //图片加载出来前，显示的图片
                .fallback(R.drawable.defaulthead) //url为空的时候,显示的图片
                .error(R.drawable.defaulthead) //图片加载失败后，显示的图片
            Glide.with(context).load(imageUrl).apply(options).into(holder.mImageView)
            //供应商不需要负责人
//            holder.mHeadNameTV.text = data.createUser.handlerNull()
            holder.mParentLL.setOnClickListener {
                listener.onClientItemClick(data)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mImageView: ImageView = view.findViewById(R.id.mImageView)
        val mCompanyNameTV: TextView = view.findViewById(R.id.mCompanyNameTV)
        val mFirstTV: TextView = view.findViewById(R.id.mFirstTV)
        val mSecondTV: TextView = view.findViewById(R.id.mSecondTV)
        val mPhoneNumTV: TextView = view.findViewById(R.id.mPhoneNumTV)
//        val mHeadNameTV: TextView = view.findViewById(R.id.mHeadNameTV)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
    }

    interface ClientCallback {
        fun onClientItemClick(data: ClientEntity.DataBean.RecordsBean)
    }
}
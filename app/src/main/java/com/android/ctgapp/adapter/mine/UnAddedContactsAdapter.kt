package com.android.ctgapp.adapter.mine

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.bumptech.glide.Glide
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.ContactUnAddEntity
import com.android.ctgapp.util.*
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import de.hdodenhof.circleimageview.CircleImageView

/**
 *作者:LiBW
 *创建日期: 12/28/20
 *描述: 未添加的企业对外联系人 adapter
 */
class UnAddedContactsAdapter(private val context: Context, private val mList: List<ContactUnAddEntity.DataBean.RecordsBean>, private val listener: Listener) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_unadd_contacts_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        holder.setIsRecyclable(false)
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mUserNameTV.text = data.linkmanName.handlerNull()
            holder.mPhoneNumTV.text = data.linkmanTel.handlerNull()
            holder.mUserImageTextIV.visibility = View.VISIBLE
            holder.mUserImageIV.visibility = View.GONE

            if (data.linkmanName.handlerNull().isNotEmpty()) {
                val text = data.linkmanName.handlerNull().substring(0, 1)
                holder.mUserImageTextIV.text = text
            }

            val imageUrl = ossHeader + data.imageUrl
            Glide.with(context).load(imageUrl)
                .placeholder(R.drawable.defaulthead)
                .error(R.drawable.defaulthead)
                .listener(object : RequestListener<Drawable> {
                    override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Drawable>?, isFirstResource: Boolean): Boolean {
                        holder.mUserImageTextIV.visibility = View.VISIBLE
                        holder.mUserImageIV.visibility = View.GONE
                        return false
                    }

                    override fun onResourceReady(resource: Drawable?, model: Any?, target: Target<Drawable>?, dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                        holder.mUserImageTextIV.visibility = View.GONE
                        holder.mUserImageIV.visibility = View.VISIBLE
                        return false
                    }
                })
                .into(holder.mUserImageIV)


            holder.mCardParentLL.setOnClickListener {
                listener.onItemSelectListener(data)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mUserImageIV: CircleImageView = view.findViewById(R.id.mUserImageIV)
        val mUserImageTextIV: TextView = view.findViewById(R.id.mUserImageTextIV)
        val mUserNameTV: TextView = view.findViewById(R.id.mUserNameTV)
        val mPhoneNumTV: TextView = view.findViewById(R.id.mPhoneNumTV)
        val mCardParentLL: LinearLayout = view.findViewById(R.id.mCardParentLL)
    }

    interface Listener {
        fun onItemSelectListener(data: ContactUnAddEntity.DataBean.RecordsBean)
    }
}
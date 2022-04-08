package com.android.ctgapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.ClientCanJoinEntity
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.OssImageHandler
import com.android.ctgapp.widget.ShowImgVideoFragment
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource

class ImageAdapter(private val context: FragmentActivity, private val mList: List<String>) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_image_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            Glide.with(context).load(data)
                .error(R.drawable.logo_app_gray)
                .placeholder(R.drawable.logo_app_gray)
                .into(holder.mImageView)
            holder.mImageView.setOnClickListener {
                ShowImgVideoFragment(data, false).show(context.supportFragmentManager, "")
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mImageView: ImageView = view.findViewById(R.id.mImageView)
    }


}
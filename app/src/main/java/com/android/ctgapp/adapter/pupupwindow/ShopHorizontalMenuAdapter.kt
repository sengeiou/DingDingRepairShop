package com.android.ctgapp.adapter.pupupwindow

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
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

class ShopHorizontalMenuAdapter(private val context: Context, private val mList: List<String>, private val listener: ShopHorizontalListener) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_shop_horizontal_menu_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mParentLL.setOnClickListener {
                listener.onHorizontalItemClick(position)
            }
            holder.mBrandNameTV.text=data
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mParentLL:LinearLayout=view.findViewById(R.id.mParentLL)
        val mBrandNameTV:TextView=view.findViewById(R.id.mBrandNameTV)
    }

    interface ShopHorizontalListener {
        fun onHorizontalItemClick(position: Int)
    }
}
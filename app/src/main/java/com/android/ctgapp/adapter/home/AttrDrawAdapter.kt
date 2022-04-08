package com.android.ctgapp.adapter.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.adapter.pupupwindow.OtherAttrChildAdapter
import com.android.ctgapp.adapter.pupupwindow.OtherAttrChildDrawAdapter
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.ClientCanJoinEntity
import com.android.ctgapp.entity.home.OtherAttrEntity
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.OssImageHandler
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

class AttrDrawAdapter(private val context: Context, private val mList: List<OtherAttrEntity.DataBean>, private val listener: AttrDrawListener) : BaseRecyclerViewAdapter(context, mList), OtherAttrChildDrawAdapter.OtherAttrChildDrawListener {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_attr_drawer_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mTextView.text = data.name
            data.selectList?.let { list ->
                holder.mDrawerChildRV.adapter = OtherAttrChildDrawAdapter(position, context, list, this)
                holder.mDrawerChildRV.layoutManager = GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mTextView: TextView = view.findViewById(R.id.mTextView)
        val mDrawerChildRV: RecyclerView = view.findViewById(R.id.mDrawerChildRV)
    }

    interface AttrDrawListener {
        fun attrDrawItemCallBack(parentPosition: Int, position: Int, select: Boolean)
    }

    override fun otherAttrChildDrawClick(select: Boolean, position: Int, parentPosition: Int) {
        listener.attrDrawItemCallBack(parentPosition, position, select)
    }


}

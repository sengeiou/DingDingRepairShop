package com.android.ctgapp.adapter

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

class TestAdapter(private val context: Context, private val mList: List<String>, private val listener: TestListener) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_add_client_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]

        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mButtonTV: TextView = view.findViewById(R.id.mButtonTV)
    }

    interface TestListener {
        fun onItemClick(position: Int)
    }
}
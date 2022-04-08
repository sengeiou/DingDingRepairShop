package com.android.ctgapp.adapter.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.GoodsByFCodeEntity
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.backgroundColorResource
import org.jetbrains.anko.textColorResource

class GoodsMenuFCodeAdapter(private val context: Context, private val mList: List<GoodsByFCodeEntity.DataBean.BrandListBean>, private val listener: MenuListener) : BaseRecyclerViewAdapter(context, mList) {
    private var preSelect = 0
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_goods_menu_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mTextView.text = data.brandName.handlerNull()
            if (data.select) {
                holder.mTextLine.visibility = View.VISIBLE
                holder.mTextView.textColorResource = R.color.colorAccent
                holder.mTextLL.backgroundColorResource = R.color.white
            } else {
                holder.mTextLine.visibility = View.INVISIBLE
                holder.mTextView.textColorResource = R.color.gray_text
                holder.mTextLL.backgroundColorResource = R.color.gray_page
            }
            //点击事件
            holder.mTextLL.setOnClickListener {
                if (preSelect != position) {
                    listener.itemSelect(data.id.handlerNull())
                    mList[preSelect].select = false
                    mList[position].select = true
                    preSelect = position
                    notifyDataSetChanged()
                }
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mTextLL: LinearLayout = view.findViewById(R.id.mTextLL)
        val mTextLine: View = view.findViewById(R.id.mTextLine)
        val mTextView: TextView = view.findViewById(R.id.mTextView)
    }

    interface MenuListener {
        fun itemSelect(brandId: String)
    }

}
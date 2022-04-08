package com.android.ctgapp.adapter.deal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.enquire.EnquireDetailByCompanyEntityV2
import com.android.ctgapp.entity.home.enquire.LeftMenuBean
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.backgroundColorResource
import org.jetbrains.anko.textColorResource

class QueryLeftMenuAdapter(private val context: Context, private val mList: List<EnquireDetailByCompanyEntityV2.DataBean.ImmutablePairsBean>, private val listener: LeftMenuListener) : BaseRecyclerViewAdapter(context, mList) {
    private var preSelect = 0
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_goods_menu_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mTextView.text = data.name.handlerNull()
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
                listener.leftItemSelect(position)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mTextLL: LinearLayout = view.findViewById(R.id.mTextLL)
        val mTextLine: View = view.findViewById(R.id.mTextLine)
        val mTextView: TextView = view.findViewById(R.id.mTextView)
    }

    interface LeftMenuListener {
        fun leftItemSelect(position: Int)
    }

}
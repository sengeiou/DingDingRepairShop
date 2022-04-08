package com.android.ctgapp.adapter.home.enquiry

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.EpcMenuEntity
import com.android.ctgapp.entity.home.enquire.EpcLeftMenuEntity
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.backgroundResource

class EpcMenuAdapter(private val context: Context, private var mList: List<EpcLeftMenuEntity.DataBean>, private val epcMenuCallback: EpcMenuCallback) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_epc_meun_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            val index = position + 1
            holder.mIndexTV.text = index.handlerNull()
            holder.mTextView.text = data.des.handlerNull()
            //选中的
            if (data.select) {
                holder.mParentRL.backgroundResource = R.drawable.epc_gray_bg
                holder.mStartView.visibility = View.VISIBLE
            } else {
                holder.mStartView.visibility = View.GONE
                holder.mParentRL.backgroundResource = R.drawable.epc_white_bg
            }
            if (data.selectDown){
                holder.mParentRL.backgroundResource = R.drawable.epc_white_bg_top_cricel
            }
            if (data.selectTop){
                holder.mParentRL.backgroundResource = R.drawable.epc_white_bg_bottom_cricel
            }
        holder.mParentRL.setOnClickListener {
            epcMenuCallback.epcMenuClick(position,"$index${data.des.handlerNull()}")
        }


        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mStartView: View = view.findViewById(R.id.mStartView)
        val mIndexTV: TextView = view.findViewById(R.id.mIndexTV)
        val mTextView: TextView = view.findViewById(R.id.mTextView)
        val mParentRL: RelativeLayout = view.findViewById(R.id.mParentRL)
    }
    interface EpcMenuCallback{
        fun epcMenuClick(position: Int, title: String)
    }
}
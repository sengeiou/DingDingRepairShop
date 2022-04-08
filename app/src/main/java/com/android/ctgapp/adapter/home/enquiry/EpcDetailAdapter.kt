package com.android.ctgapp.adapter.home.enquiry

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.EpcMenuEntity
import com.android.ctgapp.entity.home.enquire.EpcDetailEntity
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

class EpcDetailAdapter(private val context: Context, private val mList: List<EpcDetailEntity.DataBean>, private val epcDetailCallback: EpcDetailCallback) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_epc_detail_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mNameTV.text=data.des.handlerNull()
//            holder.mNameDetailTV.text=data.ctgname.handlerNull()


            val oe = "OE号:${data.oe.handlerNull()}"
            holder.mOENumberTV.text=oe
            val price4S = if (data.price.handlerNull().isEmpty()){
                "4S价格:暂无价格 数量:1"
            }else{
                "4S价格:¥${data.price.handlerNull()}  数量:1"
            }

            holder.m4sAndCountTV.text=price4S
            val index = position + 1
            val indexStr = if (index < 10) {
                "0$index"
            } else {
                index.handlerNull()
            }
            holder.mIndexTV.text = indexStr

            //选择状态
            if (data.select) {
                holder.mIndexTV.backgroundResource = R.drawable.bg_btn_common
                holder.mIndexTV.textColorResource = R.color.white
                holder.mCheckBox.isChecked = true
                holder.mCheckTV.visibility = View.VISIBLE
            } else {
                holder.mIndexTV.backgroundResource = R.drawable.bg_border_gray_circle
                holder.mIndexTV.textColorResource = R.color.black_text
                holder.mCheckBox.isChecked = false
                holder.mCheckTV.visibility = View.GONE
            }

            holder.mCheckLL.setOnClickListener {
                holder.mCheckBox.performClick()
            }
            holder.mParentLL.setOnClickListener {
                holder.mCheckBox.performClick()
            }
            holder.mCheckBox.setOnClickListener {
                epcDetailCallback.epcDetailClick(position, !data.select)
            }
            //零件详情
//            holder.mImageView.setOnClickListener {
//                epcDetailCallback.partDetail(position)
//            }
//            holder.mTitleLL.setOnClickListener {
//                holder.mImageView.performClick()
//            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mIndexTV: TextView = view.findViewById(R.id.mIndexTV)
//        val mImageView: ImageView = view.findViewById(R.id.mImageView)
        val mNameTV: TextView = view.findViewById(R.id.mNameTV)
//        val mNameDetailTV: TextView = view.findViewById(R.id.mNameDetailTV)
        val mOENumberTV: TextView = view.findViewById(R.id.mOENumberTV)
        val m4sAndCountTV: TextView = view.findViewById(R.id.m4sAndCountTV)
        val mCheckTV: TextView = view.findViewById(R.id.mCheckTV)
        val mCheckLL: LinearLayoutCompat = view.findViewById(R.id.mCheckLL)
        val mParentLL: LinearLayoutCompat = view.findViewById(R.id.mParentLL)
        val mTitleLL: LinearLayoutCompat = view.findViewById(R.id.mTitleLL)
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
    }

    interface EpcDetailCallback {
        fun epcDetailClick(position: Int, select: Boolean)
        fun partDetail(position: Int)
    }
}
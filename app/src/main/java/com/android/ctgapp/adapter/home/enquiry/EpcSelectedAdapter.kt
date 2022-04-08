package com.android.ctgapp.adapter.home.enquiry

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.BatchAddPartChildEntity
import com.android.ctgapp.entity.home.BatchAddPartChildEntityV2
import com.android.ctgapp.entity.home.EpcMenuEntity
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.backgroundResource

class EpcSelectedAdapter(private val context: Context, private var mList: List<BatchAddPartChildEntityV2.DataBean.PartsGroupBean>, private val listener: EpcSelectCallback) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_epc_selected_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            val index = "${position + 1}"
            holder.mIndexTV.text = index
            holder.mPartNameTV.text = data.ctgname.handlerNull()
            val price = if (data.price.handlerNull().handlerNull().isEmpty()) {
                "4S价格:暂无价格"
            } else {
                "4S价格: ${data.price.handlerNull()}"
            }
            holder.mPrice4sTV.text = price

            holder.mDeleteIV.setOnClickListener {
                listener.epcPartDelete(position)
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mDeleteIV: ImageView = view.findViewById(R.id.mDeleteIV)
        val mIndexTV: TextView = view.findViewById(R.id.mIndexTV)
        val mPartNameTV: TextView = view.findViewById(R.id.mPartNameTV)
        val mPrice4sTV: TextView = view.findViewById(R.id.mPrice4sTV)
    }

    interface EpcSelectCallback {
        fun epcPartDelete(position: Int)
    }
}
package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.team.SelectPositionActivity
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.mine.CheckFlowEntity
import com.android.ctgapp.entity.mine.LabelEntity
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

class CheckFlowChildAdapter(private val context: Context, private val mList: List<CheckFlowEntity.DataBean>) : BaseRecyclerViewAdapter(context, mList) {


    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_check_flow_child_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mCompanyNameTV.text = data.childName.handlerNull()


            holder.mLineView.visibility=if (position==mList.size-1)View.GONE else View.VISIBLE

        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mCompanyNameTV: TextView = view.findViewById(R.id.mCompanyNameTV)
        val mPayWayTV: TextView = view.findViewById(R.id.mPayWayTV)
        val mPayMoneyTV: TextView = view.findViewById(R.id.mPayMoneyTV)
        val mNumberTV: TextView = view.findViewById(R.id.mNumberTV)
        val mPayTimeTV: TextView = view.findViewById(R.id.mPayTimeTV)
        val mLineView: View = view.findViewById(R.id.mLineView)
    }
}
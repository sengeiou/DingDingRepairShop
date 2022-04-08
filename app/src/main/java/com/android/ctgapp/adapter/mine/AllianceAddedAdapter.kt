package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.alliance.AllianceChildCompanyActivity
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.AllianceEntity
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.startActivity

class AllianceAddedAdapter(private val context: Context, private val mList: List<AllianceEntity.DataBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_alliance_added_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mAllianceNameTV.text=data.orgname.handlerNull()
            holder.mAllianceNameTV.setOnClickListener {
                context.startActivity<AllianceChildCompanyActivity>(MyConstants.ALLIANCE_ID to data.allianceId)
            }
        }
    }


    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mAllianceNameTV: TextView = view.findViewById(R.id.mAllianceNameTV)
    }
}
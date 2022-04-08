package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.company.CompanyDetailActivity
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.mine.AllianceChildCompanyEntity
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.startActivity

class AllianceChildCompanyAdapter(private val context: Context, private val mList: List<AllianceChildCompanyEntity.DataBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_alliance_child_company_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mCompanyNameTV.text=data.orgname.handlerNull()
            "创建人: ${data.createUserName.handlerNull()}".also { holder.mCreateNameTV.text = it }
            val address="公司地址: ${data.province.handlerNull()} ${data.city.handlerNull()} ${data.district.handlerNull()} ${data.address.handlerNull()}"
            holder.mAddressTV.text = address

            holder.mParentLL.setOnClickListener {
                data.id?.let {
                    context.startActivity<CompanyDetailActivity>(MyConstants.COMPANY_ID to data.id)
                }
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mParentLL: LinearLayoutCompat = view.findViewById(R.id.mParentLL)
        val mCompanyNameTV: TextView = view.findViewById(R.id.mCompanyNameTV)
        val mCreateNameTV: TextView = view.findViewById(R.id.mCreateNameTV)
        val mAddressTV: TextView = view.findViewById(R.id.mAddressTV)
    }
}
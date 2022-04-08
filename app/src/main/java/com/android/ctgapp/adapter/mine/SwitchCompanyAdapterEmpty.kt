package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.company.SwitchCompanyActivity
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.CompanyChangeEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull

class SwitchCompanyAdapterEmpty(private val context: Context, private val mList: List<CompanyChangeEntity.DataBean>, private val companyChangeListener: CompanyChangeListener) : BaseEmptyRecyclerViewAdapter(context, mList) {
    private var preSelectId = -1

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val mActivity = context as SwitchCompanyActivity
            val data = mList[position]
            // 当前是否为默认企业
            holder.mDefaultCompanyTV.visibility = if (data.defaultCompany) View.VISIBLE else View.GONE

            if (mActivity.currentCompanyId == data.id) {
                data.selected = true
                preSelectId = data.id
            }
            holder.mCompanyCB.isChecked = data.selected
            holder.mCompanyNameTV.text = data.orgname.handlerNull()
            holder.mCompanyLL.setOnClickListener {
                holder.mCompanyCB.performClick()
            }
            holder.mCompanyCB.setOnClickListener {
                //选中变为未选中
                if (data.selected) {
                    data.selected = false
                    preSelectId = -1
                    mActivity.currentCompanyId = -1
                } else {
                    //切换公司
                    companyChangeListener.onCompanyChange(data.id)
                    //未选中变为选中
                    mActivity.currentCompanyId = data.id
                    data.selected = true
                    if (preSelectId != -1) {
                        //恢复上一个id的选中状态
                        mList.forEach {
                            if (it.id == preSelectId) {
                                it.selected = false
                            }
                        }
                    }
                    preSelectId = data.id
                }
                notifyDataSetChanged()
                mList.forEach {
                    MyLog.d("${it.id} 状态:${it.selected}")
                }
            }
        }
    }


    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mCompanyCB: CheckBox = view.findViewById(R.id.mCompanyCB)
        val mCompanyNameTV: TextView = view.findViewById(R.id.mCompanyNameTV)
        val mCompanyLL: LinearLayout = view.findViewById(R.id.mCompanyLL)
        val mDefaultCompanyTV: TextView = view.findViewById(R.id.mDefaultCompanyTV)
    }

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_company_switch_list, parent, false)
        return MyViewHolder(view)
    }

    interface CompanyChangeListener {
        fun onCompanyChange(companyId: Int)
    }

}
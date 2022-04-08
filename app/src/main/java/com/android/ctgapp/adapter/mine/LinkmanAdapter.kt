package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.bumptech.glide.Glide
import com.android.ctgapp.activity.mine.company.CompanyDetailActivity
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.LinkmanEntity
import com.android.ctgapp.entity.LinkmanUseEntity
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.widget.dialog.LinkmanEditAddDialog

class LinkmanAdapter(private var canEdit: Boolean = true, private val context: Context, private val list: List<LinkmanEntity.DataBean>, private val listener: RefreshListener) : BaseEmptyRecyclerViewAdapter(context, list), LinkmanEditAddDialog.AddOverListener {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_external_contact_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
//            val mActivity = context as CompanyDetailActivity
            val data = list[position]
            val imageUrl = ossHeader + data.imageUrl.handlerNull()
            Glide.with(context).load(imageUrl)
                .placeholder(R.drawable.defaulthead)
                .error(R.drawable.defaulthead)
                .into(holder.mHeaderIV)


            holder.mNameTV.text = data.linkmanName.handlerNull()
            holder.mPhoneTV.text = data.linkmanTel.handlerNull()
            if (data.editModel) {
                holder.mEditIV.visibility = View.VISIBLE
                holder.mCardParent.isEnabled = true
                //编辑按钮
                holder.mCardParent.setOnClickListener {
                    val linkman = LinkmanUseEntity()
                    linkman.name = data.linkmanName.handlerNull()
                    linkman.id = data.id
                    linkman.remark = data.linkmanRemark.handlerNull()
                    if (canEdit) {
                        LinkmanEditAddDialog(this, linkman).show((context as CompanyDetailActivity).supportFragmentManager, "")
                    }
                }
            } else {
                holder.mEditIV.visibility = View.GONE
                holder.mCardParent.isEnabled = false
            }
            //备注
            holder.mRemarkTV.text = data.linkmanRemark.handlerNull()
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mHeaderIV: ImageView = view.findViewById(R.id.mHeaderIV)
        val mEditIV: ImageView = view.findViewById(R.id.mEditIV)
        val mNameTV: TextView = view.findViewById(R.id.mNameTV)
        val mPhoneTV: TextView = view.findViewById(R.id.mCompanyTV)
        val mRemarkTV: TextView = view.findViewById(R.id.mRemarkTV)
        val mCardParent: LinearLayout = view.findViewById(R.id.mCardParent)
    }

    interface RefreshListener {
        fun goRefresh()
    }

    //修改完毕去刷新
    override fun addOver() {
        listener.goRefresh()
    }
}
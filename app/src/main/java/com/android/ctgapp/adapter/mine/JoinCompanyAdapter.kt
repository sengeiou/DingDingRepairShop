package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.CompanyCanJoinEntity
import com.android.ctgapp.enum.IndustryEnum
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.OssImageHandler
//import com.android.ctgapp.util.handlerViewByTheme
import com.bumptech.glide.Glide
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 2020/9/30
 *描述:加入企业 列表 adapter
 */
class JoinCompanyAdapter(private val context: Context, private val mList: List<CompanyCanJoinEntity.DataBean.RecordsBean>, private val listener: JoinCompanyListener) : BaseEmptyRecyclerViewAdapter(context, mList) {

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
//            holder.mAddressIV.handlerViewByTheme(context,R.drawable.address_s)
//            holder.mPhoneIV.handlerViewByTheme(context,R.drawable.phone)

            val data = mList[position]
            //是否已经申请
            if (data.hasApply) {
                holder.mJoinBTN.background = null
                holder.mJoinBTN.text = "审核中"
                holder.mJoinBTN.textColorResource = R.color.red_start
                holder.mJoinBTN.isEnabled = false
            } else {
                holder.mJoinBTN.textColorResource = R.color.colorAccent
                holder.mJoinBTN.backgroundResource = R.drawable.bg_radius_blue_border
                holder.mJoinBTN.text = "加入"
                holder.mJoinBTN.isEnabled = true
            }
            Glide.with(context).load(OssImageHandler(data.logo.handlerNull()))
                .placeholder(R.drawable.logo_app_gray)
                .error(R.drawable.logo_app_gray)
                .into(holder.mCompanyPhotoIV)
            holder.mCompanyNameTV.text = data.orgname.handlerNull()
            holder.mCompanyTypeTV.text = IndustryEnum.getShowName(data.industry.handlerNull())
            val address = "${data.province.handlerNull()} ${data.city.handlerNull()} ${data.district.handlerNull()} ${data.address.handlerNull()}"
            holder.mCompanyAddressTV.text = address
            holder.mCompanyPhoneTV.text = data.phone.handlerNull()

            holder.mJoinBTN.setOnClickListener {
                listener.onJoinButtonClickListener(data.id)
            }
        }
    }

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_join_company_list, parent, false)
        return MyViewHolder(view)
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mCompanyPhotoIV: ImageView = view.findViewById(R.id.mCompanyPhotoIV)
        val mCompanyNameTV: TextView = view.findViewById(R.id.mCompanyNameTV)
        val mCompanyTypeTV: TextView = view.findViewById(R.id.mCompanyTypeTV)
        val mCompanyAddressTV: TextView = view.findViewById(R.id.mCompanyAddressTV)
        val mCompanyPhoneTV: TextView = view.findViewById(R.id.mCompanyPhoneTV)
        val mJoinBTN: TextView = view.findViewById(R.id.mJoinBTN)
        val mAddressIV: ImageView = view.findViewById(R.id.mAddressIV)
        val mPhoneIV: ImageView = view.findViewById(R.id.mPhoneIV)
    }

    interface JoinCompanyListener {
        fun onJoinButtonClickListener(companyId: Int)
    }

}
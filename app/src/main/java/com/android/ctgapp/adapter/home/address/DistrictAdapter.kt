package com.android.ctgapp.adapter.home.address

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.address.AddressEditActivity
import com.android.ctgapp.callback.CitySelectManager
import com.android.ctgapp.entity.CityEntity
import com.android.ctgapp.util.ContactUtil
import com.android.ctgapp.util.handlerNull

/**
 *作者:LiBW
 *创建日期: 2020/11/11
 *描述: 区选择器
 */
class DistrictAdapter(private val context: Context, private val mList: CityEntity.ProvinceBean.CityBean,private var district:String) : RecyclerView.Adapter<DistrictAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_city_select_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.area!!.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = mList.area!![position]
        val english = ContactUtil.getFirstLetter(data)
        holder.mNameTitleTV.text = english
        holder.mNameTV.text = data
        holder.mSelectIV.visibility = if (data == district) View.VISIBLE else View.GONE
        holder.mParentLL.setOnClickListener {
            district = data.handlerNull()
            CitySelectManager.districtOver(data.handlerNull())
        }
        //处理首字母
        if (position != 0) {
            if (ContactUtil.getFirstLetter(data)==ContactUtil.getFirstLetter(mList.area!![position-1])) {
                holder.mNameTitleTV.visibility = View.INVISIBLE
            }else{
                holder.mNameTitleTV.visibility = View.VISIBLE
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mNameTitleTV: TextView = view.findViewById(R.id.mNameTitleTV)
        val mNameTV: TextView = view.findViewById(R.id.mNameTV)
        val mSelectIV: ImageView = view.findViewById(R.id.mSelectIV)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
    }
}
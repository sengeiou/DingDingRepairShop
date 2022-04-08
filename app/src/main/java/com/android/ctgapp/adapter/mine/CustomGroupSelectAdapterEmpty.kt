package com.android.ctgapp.adapter.mine

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.friend.BusinessFriendActivity
import com.android.ctgapp.entity.BusinessFriendGroupEntity
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColor
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 2020/10/12
 *描述: 自定义商友分组选择 页面
 */
class CustomGroupSelectAdapterEmpty(private val isFix: Boolean, private val context: Context, private val mList: List<BusinessFriendGroupEntity.DataBean>) : RecyclerView.Adapter<CustomGroupSelectAdapterEmpty.MyViewHolder>() {

    private var copyList = ArrayList<BusinessFriendGroupEntity.DataBean>()

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mGroupNameTV: TextView = view.findViewById(R.id.mGroupNameTV)
        val mSettingIV: ImageView = view.findViewById(R.id.mSettingIV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_custom_group_select_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size + 1
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val activity = context as BusinessFriendActivity
        //最后一个
        if (position == mList.size) {
           if (!isFix){
               holder.mSettingIV.visibility=View.VISIBLE
               holder.mGroupNameTV.visibility=View.GONE
               holder.mSettingIV.setOnClickListener {
                   activity.settingCustomGroup()
               }
           }else{
               holder.mSettingIV.visibility=View.GONE
               holder.mGroupNameTV.visibility=View.GONE
           }
        } else {
            holder.mSettingIV.visibility=View.GONE
            holder.mGroupNameTV.visibility=View.VISIBLE
            copyList.clear()
            copyList.addAll(mList)
            val data = mList[position]
            holder.mGroupNameTV.text = data.groupName
            //选中的状态
            if (data.isDisplay) {
                holder.mGroupNameTV.textColorResource = R.color.colorAccent
                holder.mGroupNameTV.backgroundResource = R.drawable.bg_company_icon
            } else {
                holder.mGroupNameTV.textColor = Color.parseColor("#737475")
                holder.mGroupNameTV.backgroundResource = R.drawable.bg_btn_gray_circle
            }
            holder.mGroupNameTV.setOnClickListener {
                if (data.isDisplay) {
                    holder.mGroupNameTV.textColor = Color.parseColor("#737475")
                    holder.mGroupNameTV.backgroundResource = R.drawable.bg_btn_gray_circle
                    copyList[position].isDisplay = false
                } else {
                    holder.mGroupNameTV.textColorResource = R.color.colorAccent
                    holder.mGroupNameTV.backgroundResource = R.drawable.bg_company_icon
                    copyList[position].isDisplay = true
                }
                if (isFix) {
                    activity.setFixGroup(copyList)
                } else {
                    activity.setCustomGroup(copyList)
                }
            }
        }
    }
}
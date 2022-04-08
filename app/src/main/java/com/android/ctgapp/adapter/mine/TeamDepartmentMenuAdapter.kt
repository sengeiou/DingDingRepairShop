package com.android.ctgapp.adapter.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.team.MyTeamActivity
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.DepartmentMenusEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

class TeamDepartmentMenuAdapter(private val context: Context, private val mList: ArrayList<DepartmentMenusEntity.DataBean>) : BaseRecyclerViewAdapter(context, mList) {
    private var preSelect = -1

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_team_department_menu_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val mActivity = context as MyTeamActivity
            val data = mList[position]
            holder.mDepartmentNameTV.text = data.name.handlerNull()
            if (data.isSelect) {
                holder.mDepartmentNameTV.backgroundResource = R.drawable.bg_btn_blue_light
                holder.mDepartmentNameTV.textColorResource = R.color.colorAccent
            } else {
                holder.mDepartmentNameTV.backgroundResource = R.drawable.bg_btn_gray_circle
                holder.mDepartmentNameTV.textColorResource = R.color.gray_text
            }

            holder.mDepartmentNameLL.setOnClickListener {
                //当前选中状态
                if (data.isSelect) {
                    MyLog.d("点击取消")
                    //取消选中
                    //恢复
                    if (preSelect != -1) {
                        mList[position].isSelect = false
                        mActivity.departmentSelectId = -1
                        mActivity.departmentSelectName = ""
                        notifyDataSetChanged()
                    }
                } else {
                    MyLog.d("点击选中")
                    //选中
                    //恢复上次选中
                    if (preSelect!=-1){
                        mList[preSelect].isSelect=false
                    }
                    mList[position].isSelect=true
                    mActivity.departmentSelectId = data.id
                    mActivity.departmentSelectName = data.name.handlerNull()
                    preSelect=position
                    notifyDataSetChanged()
                }
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mDepartmentNameTV: TextView = view.findViewById(R.id.mDepartmentNameTV)
        val mDepartmentNameLL: LinearLayout = view.findViewById(R.id.mDepartmentNameLL)
    }
}
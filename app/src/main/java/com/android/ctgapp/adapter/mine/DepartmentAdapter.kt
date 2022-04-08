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
import com.android.ctgapp.activity.mine.team.DepartmentSelectActivity
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.DepartmentListEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull

class DepartmentAdapter(private val context: Context, private val mList: List<DepartmentListEntity.DataBean>) : BaseRecyclerViewAdapter(context, mList) {

//    private var preSelect = -1

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_department_verticle_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val mActivity = context as DepartmentSelectActivity
            val data = mList[position]
            if (data.isSelect) {
                mActivity.preSelectId = position
            }

            holder.mCheckBox.isChecked = data.isSelect
            holder.mDepartmentNameTV.text = data.name.handlerNull()
            holder.mDepartmentNameTV.setOnClickListener {
                holder.mCheckBox.performClick()
            }
            //下级
            holder.mSubordinateLL.setOnClickListener {
                MyLog.d("选择的:${data.id}")
                mActivity.verticalItem(data.id, data.name.handlerNull())
            }

            holder.mCheckBox.setOnClickListener {
                //判断当前选中状态
                val select = data.isSelect
                //点击后切换选中状态
                if (select) {
                    //取消选中
                    if (mActivity.preSelectId != -1) {
                        //取消
//                        holder.mCheckBox.isChecked = false
                        mList[position].isSelect = false
                        mActivity.itemSelectResult(-1, "")
                        //取消删除上次选中状态
                        mActivity.preSelectId = -1
                        notifyDataSetChanged()
                    }
                } else {
                    //选中
                    mList[position].isSelect = true
                    //此次选中非上次选中

                    //恢复上一个选项
                    MyLog.d("出错的地方:${mActivity.preSelectId} ******** ${mList.size}")
                    if (mActivity.preSelectId != -1) {
                        mList.forEach {
                            if (it.id==mActivity.preSelectId){
                                it.isDeleted=false
                            }
                        }

//                        mList[mActivity.preSelectId].isSelect = false
                    }
                    mActivity.itemSelectResult(data.id, data.name.handlerNull())
                    mActivity.preSelectId = position
                    notifyDataSetChanged()
                }
            }

        }
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
        val mDepartmentNameTV: TextView = view.findViewById(R.id.mDepartmentNameTV)
        val mSubordinateLL: LinearLayout = view.findViewById(R.id.mSubordinateLL)
    }
}
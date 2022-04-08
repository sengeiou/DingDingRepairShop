package com.android.ctgapp.adapter.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.GoodsByVinEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
//import com.android.ctgapp.util.handlerViewByTheme
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

class BranderSelectAdapter(private val context: Context, private val mList: List<GoodsByVinEntity.DataBean.BrandVOSListBean>, private val branderSelectCallback: BranderSelectCallback) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_brander_select_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mGroupNameTV.text = data.brandName.handlerNull()
            if (data.select) {
//                holder.mSelectIV.handlerViewByTheme(context,R.drawable.icon_select)
                holder.mGroupNameTV.textColorResource = R.color.colorAccent
                holder.mSelectIV.visibility = View.VISIBLE
            } else {
                holder.mGroupNameTV.textColorResource = R.color.gray_text
                holder.mSelectIV.visibility = View.GONE
            }

            holder.mParentLL.setOnClickListener {
                branderSelectCallback.onBrandClick(!data.select, position)
            }
        }
    }

    interface BranderSelectCallback {
        fun onBrandClick(select: Boolean, position: Int)
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mGroupNameTV: TextView = view.findViewById(R.id.mGroupNameTV)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
        val mSelectIV: ImageView = view.findViewById(R.id.mSelectIV)
    }
}
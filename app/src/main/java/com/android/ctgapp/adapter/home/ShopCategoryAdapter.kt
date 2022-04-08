package com.android.ctgapp.adapter.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.entity.home.GoodsByFCodeEntity
import com.android.ctgapp.entity.home.GoodsByVinEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
//import com.android.ctgapp.util.handlerViewByTheme
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

class ShopCategoryAdapter(private val context: Context, private val mList: List<GoodsByFCodeEntity.DataBean.CategoryVosBean>, private val branderSelectCallback: LinShiAdapterListener) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_shop_vertical_menu_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mNameTV.text = data.fname.handlerNull()
            if (data.select) {
//                holder.mSelectIV.handlerViewByTheme(context,R.drawable.icon_select)
                holder.mNameTV.textColorResource = R.color.colorAccent
                holder.mLine.backgroundResource = R.color.colorAccent
                holder.mSelectIV.visibility = View.VISIBLE

            } else {
                holder.mNameTV.textColorResource = R.color.gray_text
                holder.mLine.backgroundResource = R.color.gray_page
                holder.mSelectIV.visibility = View.GONE
            }

            holder.mParentLL.setOnClickListener {
                branderSelectCallback.linshiClick(!data.select, position)
            }
        }
    }

    interface LinShiAdapterListener {
        fun linshiClick(select: Boolean, position: Int)
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mNameTV: TextView = view.findViewById(R.id.mNameTV)
        val mParentLL: RelativeLayout = view.findViewById(R.id.mParentLL)
        val mSelectIV: ImageView = view.findViewById(R.id.mSelectIV)
        val mLine: View = view.findViewById(R.id.mLine)
    }
}
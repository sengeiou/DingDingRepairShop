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

class FenLeiAdapter(private val context: Context, private val mList: List<GoodsByFCodeEntity.DataBean.CategoryVosBean>, private val branderSelectCallback: FenLeiListener) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_attr_horizontal_list_wrap, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            holder.mTextView.text = data.fname.handlerNull()
            if (data.select) {
                holder.mTextView.backgroundResource = R.drawable.bg_border_acc_circle

            } else {
                holder.mTextView.backgroundResource = R.drawable.bg_solid_gary_light_100dp
            }
            holder.mParentRL.setOnClickListener {
                branderSelectCallback.fenleiClick(!data.select, position)
            }
        }
    }

    interface FenLeiListener {
        fun fenleiClick(select: Boolean, position: Int)
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mTextView: TextView = view.findViewById(R.id.mTextView)
        val mParentRL: RelativeLayout = view.findViewById(R.id.mParentRL)
    }
}
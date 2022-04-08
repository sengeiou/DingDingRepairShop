package com.android.ctgapp.adapter.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.home.shop.PartShopActivity
import com.android.ctgapp.activity.home.shop.SearchGoodsActivity
import com.android.ctgapp.entity.home.OtherAttrEntity
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

class AttrHorizontalSearchAdapter(private val context: Context, private val mList: List<OtherAttrEntity.DataBean>, private val listener: AttrHorizontalSearchAdapterListener) : RecyclerView.Adapter<AttrHorizontalSearchAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mTextView: TextView = view.findViewById(R.id.mTextView)
        val mParentRL: RelativeLayout = view.findViewById(R.id.mParentRL)
    }

    interface AttrHorizontalSearchAdapterListener {
        fun onAttrHorizontalItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_attr_horizontal_list, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = mList[position]
        if (data.select) {
            holder.mTextView.backgroundResource = R.drawable.bg_solid_acc_light_100dp
            holder.mTextView.textColorResource = R.color.colorAccent
        } else {
            holder.mTextView.backgroundResource = R.drawable.bg_solid_gary_light_100dp
            holder.mTextView.textColorResource = R.color.black_text
        }

        holder.mTextView.text = data.name
        holder.mParentRL.setOnClickListener {
            listener.onAttrHorizontalItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        val ac = context as SearchGoodsActivity
        return if (mList.size > ac.maxSize) {
            ac.maxSize
        } else {
            mList.size
        }
    }
}
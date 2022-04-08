package com.android.ctgapp.adapter.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.databinding.ItemGoodsSortListBinding
import com.android.ctgapp.entity.home.GoodsDetailBean
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.showToast
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColorResource

class GoodsSortAdapter(private val context: Context, private val mList: List<GoodsDetailBean>, private val listener: GoodsSortAdapterListener) : RecyclerView.Adapter<GoodsSortAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = ItemGoodsSortListBinding.inflate(LayoutInflater.from(context), parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = mList[position]
        if (data.isSelect) {
            holder.mNameTV.backgroundResource = R.drawable.bg_solid_acc_light_100dp
            holder.mNameTV.textColorResource = R.color.colorAccent
        } else {
            holder.mNameTV.backgroundResource = R.drawable.bg_solid_gary_light_100dp
            holder.mNameTV.textColorResource = R.color.black_text
        }

        if (data.stock == null && data.stock == 0) {
            holder.mNameTV.backgroundResource = R.drawable.bg_solid_gary_light_100dp
            holder.mNameTV.textColorResource = R.color.gray_text
        }

        holder.mNameTV.text = data.nname.handlerNull()
        holder.mParentLL.setOnClickListener {
            if (data.stock == null && data.stock == 0) {
                context.showToast("抱歉该商品已经没有库存了")
            } else {
                mList.forEach {
                    it.isSelect = false
                }
                data.isSelect = true
                notifyDataSetChanged()
                listener.onItemSelect(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    interface GoodsSortAdapterListener {
        fun onItemSelect(position: Int)
    }

    inner class MyViewHolder(view: ItemGoodsSortListBinding) : RecyclerView.ViewHolder(view.root) {
        val mParentLL = view.mParentLL
        val mNameTV = view.mNameTV
    }
}
package com.android.ctgapp.adapter.home

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.callback.TrolleyManager
import com.android.ctgapp.entity.home.TrolleyEntity
import com.android.ctgapp.util.THE_FALSE
import com.android.ctgapp.util.THE_TRUE
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.toPx
import com.yanzhenjie.recyclerview.SwipeMenuCreator
import com.yanzhenjie.recyclerview.SwipeMenuItem
import com.yanzhenjie.recyclerview.SwipeRecyclerView

/**
 *作者:LiBW
 *创建日期: 2020/11/6
 *描述: 购物车
 */
class TrolleyAdapter(private val context: Context, private var mList: List<TrolleyEntity.DataBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_trolley_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            val list = ArrayList<TrolleyEntity.DataBean.DetailsBean>()
            //二级列表适配器
            val mAdapter = TrolleyItemAdapter(context, list)
            holder.mItemRV.adapter = null
            //为list添加侧滑菜单
            val mSwipeMenuCreator = SwipeMenuCreator { _, rightMenu, _ ->
                val deleteItem = SwipeMenuItem(context)
                deleteItem.text = "删除"
                deleteItem.setTextColorResource(R.color.white)
                deleteItem.setBackgroundColorResource(R.color.red_start)
                deleteItem.height = LinearLayout.LayoutParams.MATCH_PARENT
                deleteItem.width = 80f.toPx(context)
                rightMenu.addMenuItem(deleteItem)
            }
            //侧滑监听 删除功能
            holder.mItemRV.setOnItemMenuClickListener { menuBridge, adapterPosition ->
                menuBridge.closeMenu()
                val entity = data.details!![adapterPosition]
                //如果是已失效或者已删除的商品提示删除
                if (entity.isDeleted == 1 || entity.isOnsale == 0) {
                    AlertDialog.Builder(context).setTitle("确认删除该商品么")
                        .setPositiveButton("确认") { _, _ ->
                            TrolleyManager.goodDelete(arrayListOf(entity.shoppingId))
                        }.setNegativeButton("返回") { _, _ ->
                        }.show()
                } else {
                    TrolleyManager.goodDelete(arrayListOf(entity.shoppingId))
                }
            }
            holder.mItemRV.setSwipeMenuCreator(mSwipeMenuCreator)
            holder.mItemRV.adapter = mAdapter
            holder.mItemRV.layoutManager = LinearLayoutManager(context)
            holder.mTitleTV.text = data.companyName.handlerNull()
            holder.mTitleCB.isChecked = data.titleSelect
            data.details?.let {
                list.clear()
                list.addAll(it)
                mAdapter.notifyDataSetChanged()
            }
            //有效商品数量
            var goodsCount = 0
            data.details?.forEach {
                if (it.isDeleted == 0 && it.isOnsale == 1) {
                    goodsCount++
                }
            }
            if (goodsCount == 0) {
                holder.mTitleCB.isEnabled = false
                holder.mTitleCB.isChecked = false
            }
            //子菜单修改状态
            holder.mTitleCB.setOnClickListener {
                val shoppingIds = ArrayList<Int>()
                data.details?.forEach { item ->
                    //全选之对上架商品和有效商品生效 //isDeleted 0：数据有效，1：数据已删除 //isOnsale 上架下架 ，0：未上架，1：已上架
                    if (item.isOnsale == 1 && item.isDeleted == 0) {
                        shoppingIds.add(item.shoppingId)
                    }
                }
                if (data.titleSelect) {
                    //全选状态变为全不选
                    TrolleyManager.changesSelect(shoppingIds, THE_FALSE)
                } else {
                    TrolleyManager.changesSelect(shoppingIds, THE_TRUE)
                }
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mItemRV: SwipeRecyclerView = view.findViewById(R.id.mItemRV)
        val mTitleCB: CheckBox = view.findViewById(R.id.mTitleCB)
        val mTitleTV: TextView = view.findViewById(R.id.mTitleTV)
    }


}
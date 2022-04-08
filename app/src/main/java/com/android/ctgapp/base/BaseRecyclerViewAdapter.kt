package com.android.ctgapp.base

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 *作者:LiBW
 *创建日期: 2020/9/30
 *描述: 统一处理List数据的RecyclerView适配器
 */
abstract class BaseRecyclerViewAdapter(private val context: Context, private val mList: List<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return createViewHolder(parent)
    }

    /***创建ViewHolder*/
    abstract fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    override fun getItemCount(): Int {
        return mList.size
    }




    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        handlerData(holder, position)
    }

    /***处理数据*/
    abstract fun handlerData(holder: RecyclerView.ViewHolder, position: Int)


}
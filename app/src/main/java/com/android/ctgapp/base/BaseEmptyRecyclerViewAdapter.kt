package com.android.ctgapp.base

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R

/**
 *作者:LiBW
 *创建日期: 2020/9/30
 *描述: 统一处理List空数据的RecyclerView适配器
 */
abstract class BaseEmptyRecyclerViewAdapter(private val context: Context, private val mList: List<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private val viewTypeItem: Int = 1
    private val viewTypeEmpty: Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        //如果是空数据则展示空数据布局 否则创建响应布局
        if (viewType == viewTypeEmpty) {
            val view = LayoutInflater.from(context).inflate(R.layout.empty_layout, parent, false)
            return EmptyViewHolder(view)
        }
        return createViewHolder(parent)
    }

    /***创建ViewHolder*/
    abstract fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    override fun getItemCount(): Int {
        if (mList.isEmpty()) {
            return 1
        }
        return mList.size
    }

    override fun getItemViewType(position: Int): Int {
        //如果数据为空则展示空数据列表
        if (mList.isEmpty()) {
            return viewTypeEmpty
        }
        return viewTypeItem
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        handlerData(holder, position)
    }

    /***处理数据*/
    abstract fun handlerData(holder: RecyclerView.ViewHolder, position: Int)

    //空ViewHolder
    inner class EmptyViewHolder(view: View) : RecyclerView.ViewHolder(view)
}
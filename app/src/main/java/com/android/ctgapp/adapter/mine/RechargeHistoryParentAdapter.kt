package com.android.ctgapp.adapter.mine

import android.app.DatePickerDialog
import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.databinding.ItemRechargeHistoryParentListBinding
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.setArrow

class RechargeHistoryParentAdapter (private val context: Context, private val mList: List<String>) : RecyclerView.Adapter<RechargeHistoryParentAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = ItemRechargeHistoryParentListBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(view)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var data = mList[position]
        reshow(holder,data)
        holder.mParentLL.setOnClickListener {
            data = if (data=="开") "关" else "开"
            //notifyItemChanged(position)
            reshow(holder,data)
            MyLog.d("点击事件触发")

        }
        //holder.mRecyclerView.adapter=RechargeHistoryChildAdapter(context, arrayListOf("有点东西","但是东西不多"))
        holder.mRecyclerView.layoutManager=LinearLayoutManager(context)
    }
    private fun reshow(holder: MyViewHolder, data: String){
        if (data=="开"){
            holder.mRecyclerView.visibility= View.VISIBLE
            holder.mArrow.setArrow(true)
        }else{
            holder.mRecyclerView.visibility= View.GONE
            holder.mArrow.setArrow(false)
        }
    }
    override fun getItemCount(): Int {
        return mList.size
    }

    inner class MyViewHolder(view: ItemRechargeHistoryParentListBinding) : RecyclerView.ViewHolder(view.root) {
        val mRecyclerView=view.mRecyclerView
        val mTime=view.mTime
        val mArrow=view.mArrow
        val mParentLL=view.mParentLL
    }
}

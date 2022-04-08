package com.android.ctgapp.adapter.deal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.deal.ReturnGoodsDetailActivity
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.deal.ReturnGoodsDetailEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.showToast
import com.bumptech.glide.Glide

/**
 * 作者:LiBW
 * 创建日期: 12/11/20
 * 描述: 退货详情 修改
 */
class ReturnDetailEditAdapter(private val context: Context, private val mList: List<ReturnGoodsDetailEntity.DataBean.ReturnOrderDetailsBean>) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_launch_after_sale_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]

            //最大可退数量
            val maxCount = data.goodsAmount.handlerNull().toInt()
            val activity = context as ReturnGoodsDetailActivity

            if (data.returnNum > 0) {
                holder.mCheckBox.isChecked = true
                activity.changeList[position].afterSaleSelect = true
            }
            Glide.with(context).load(data.goodsImg).
                error(R.drawable.logo_app_gray)
                .placeholder(R.drawable.logo_app_gray)
            .into(holder.mImageView)
            holder.mPartNameTV.text = data.goodsName.handlerNull()
            holder.mPartTypeTV.text = data.goodsNo.handlerNull()
            holder.mPartPriceTV.text = data.goodsPrice.handlerNull()
            //切换选中状态
            holder.mCheckBox.setOnCheckedChangeListener { _, isChecked ->
                activity.changeList[position].afterSaleSelect = isChecked
            }

            //退货处展示当前退货数量 如果是没有退货过的商品此处展示为1
            val number = data.returnNum.handlerNull()
            holder.mGoodsCountTV.text = if (number == "0") "1" else number

            activity.changeList[position].editGoodsReturn=data.returnNum

            //添加
            holder.mAddBTN.setOnClickListener {
                MyLog.d("当前数量:${holder.mGoodsCountTV.text.toString().toInt()}")
                MyLog.d("最大值:${data.goodsAmount.handlerNull().toInt()}")

                when {
                    holder.mGoodsCountTV.text.toString().toInt() >= maxCount -> context.showToast("已到达上限")
                    else -> {
                        val count = holder.mGoodsCountTV.text.toString().toInt() + 1
                        holder.mGoodsCountTV.text = count.toString()
//                        activity.changeList[position].goodsAmount = count
                        activity.changeList[position].editGoodsReturn = count
                    }
                }
            }
            //减少
            holder.mMinusBTN.setOnClickListener {
                when {
                    holder.mGoodsCountTV.text.toString().toInt() <= 1 -> context.showToast("至少选择一个")
                    else -> {
                        holder.mGoodsCountTV.text = (holder.mGoodsCountTV.text.toString().toInt() - 1).toString()
                        //修改退货列表 中退货的商品数量
//                        activity.changeList[position].goodsAmount =holder.mGoodsCountTV.text.toString().toInt()
                        activity.changeList[position].editGoodsReturn =holder.mGoodsCountTV.text.toString().toInt()
                    }
                }
            }
        }
    }


    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mCheckBox: CheckBox = view.findViewById(R.id.mCheckBox)
        val mImageView: ImageView = view.findViewById(R.id.mImageView)
        val mPartNameTV: TextView = view.findViewById(R.id.mPartNameTV)
        val mPartTypeTV: TextView = view.findViewById(R.id.mPartTypeTV)
        val mPartPriceTV: TextView = view.findViewById(R.id.mPartPriceTV)
        val mGoodsCountTV: TextView = view.findViewById(R.id.mGoodsCountsTV)
        val mMinusBTN: RelativeLayout = view.findViewById(R.id.mMinusBTN)
        val mAddBTN: RelativeLayout = view.findViewById(R.id.mAddBTN)
    }
}
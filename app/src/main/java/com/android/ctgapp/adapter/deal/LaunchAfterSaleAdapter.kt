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
import com.android.ctgapp.activity.deal.LaunchAfterSaleActivity
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.deal.CanRefundEntity
import com.android.ctgapp.entity.deal.OrderDetailEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.showToast
import com.bumptech.glide.Glide

class LaunchAfterSaleAdapter(private val context: Context, private val mList: List<CanRefundEntity.DataBean>,val hasUseCoupon:Boolean) : BaseEmptyRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_launch_after_sale_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            //最大可退数量
            val maxCount=data.goodsAmount.handlerNull().toInt()
            val activity = context as LaunchAfterSaleActivity
            Glide.with(context).load(data.goodsImg).
                error(R.drawable.logo_app_gray)
                . placeholder(R.drawable.logo_app_gray)
            .into(holder.mImageView)
            holder.mPartNameTV.text = data.goodsName.handlerNull()
            holder.mPartTypeTV.text = data.goodsNo.handlerNull()
            holder.mPartPriceTV.text = data.goodsPrice.handlerNull()

            //切换选中状态
            holder.mCheckBox.setOnCheckedChangeListener { _, isChecked ->
                activity.mList[position].afterSaleSelect = isChecked
            }
            //根据优惠券状态判断是否可选
            if(hasUseCoupon){
                holder.mCheckBox.setChecked(true)
                holder.mCheckBox.setEnabled(false)
                holder.mMinusBTN.setEnabled(false)
                holder.mAddBTN.setEnabled(false)
            }else{
                holder.mCheckBox.setChecked(false)
                holder.mCheckBox.setEnabled(true)
                holder.mMinusBTN.setEnabled(true)
                holder.mAddBTN.setEnabled(true)
            }
            holder.mGoodsCountTV.text=maxCount.handlerNull()
            //添加
            holder.mAddBTN.setOnClickListener {
                MyLog.d("当前数量:${ holder.mGoodsCountTV.text.toString().toInt()}")
                MyLog.d("最大值:${ data.goodsAmount.handlerNull().toInt()}")

                when {
                    holder.mGoodsCountTV.text.toString().toInt() >= maxCount -> context.showToast("已到达上限")
                    else -> {
                        holder.mGoodsCountTV.text = (holder.mGoodsCountTV.text.toString().toInt() + 1).toString()
                        activity.mList[position].goodsAmount = +1
                    }
                }
            }
            //减少
            holder.mMinusBTN.setOnClickListener {
                when {
                    holder.mGoodsCountTV.text.toString().toInt() <= 1 -> context.showToast("至少选择一个")
                    else -> {
                        holder.mGoodsCountTV.text = (holder.mGoodsCountTV.text.toString().toInt() - 1).toString()
                        activity.mList[position].goodsAmount -= 1
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
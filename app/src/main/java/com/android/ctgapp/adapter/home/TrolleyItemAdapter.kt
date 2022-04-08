package com.android.ctgapp.adapter.home

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.bumptech.glide.Glide
import com.android.ctgapp.activity.home.shop.GoodsDetailActivity
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.callback.TrolleyManager
import com.android.ctgapp.entity.home.TrolleyEntity
import com.android.ctgapp.util.*
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 2020/11/6
 *描述: 购物车
 */
class TrolleyItemAdapter(private val context: Context, private val mList: List<TrolleyEntity.DataBean.DetailsBean>) : BaseRecyclerViewAdapter(context, mList) {
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_trolley_item_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            //设置选中数量
            holder.mGoodsCountTV.text = data.num.handlerNull()
            //有效并且上架的商品可以点击 //isDeleted 0：数据有效，1：数据已删除   //isOnsale上架下架 ，0：未上架，1：已上架
            if (data.isDeleted == 0 && data.isOnsale == 1) {
                holder.mItemCB.isChecked = data.isSelected == THE_TRUE
                holder.mItemCB.isEnabled = true
            } else {
                holder.mItemCB.isChecked = false
                holder.mItemCB.isEnabled = false
            }
            //设置图片
            Glide.with(context).load(data.imgName).
                placeholder(R.drawable.logo_app_gray)
                .error(R.drawable.logo_app_gray)
            .into(holder.mItemImageIV)
//            val name="${data.nname.handlerNull()} ${data.brandName.handlerNull()} ${data.specStyle.handlerNull()}"
            //商品名称
            holder.mPartNameTV.text =data.goodsName.handlerNull()

            //商品编码
            "编码: ${data.factoryid.handlerNull()}".also { holder.mPartCodeTV.text = it }
            //商品价格
            "¥${data.price.handlerNull()}".also { holder.mPartPriceTV.text = it }
            //增加
            holder.mAddBTN.setOnClickListener {
                //限购
                if (data.isSet==1){
                    data.buyLimit?.let {limit->
                        if ( holder.mGoodsCountTV.text.handlerNull().toInt()>=limit){
                            context.showToast("该商品限购:${limit}件")
                            return@setOnClickListener
                        }
                    }
                }

                if (holder.mGoodsCountTV.text.handlerNull().isEmpty()) {
                    context.showToast("商品异常,请稍后再试")
                    return@setOnClickListener
                }
                var currentCount = holder.mGoodsCountTV.text.toString().toInt()
                val stock = data.stock.handlerNull()
                if (stock.isEmpty()) {
                   context. showToast("商品库存异常,请稍后再试")
                    return@setOnClickListener
                }

                if (currentCount >= stock.toInt()) {
                    context.showToast("超过最大库存")
                } else {
                    currentCount++
                    holder.mGoodsCountTV.text = currentCount.toString()
                    TrolleyManager.goodCountChange(data.shoppingId, currentCount)
                }
            }
            //减少
            holder.mMinusBTN.setOnClickListener {
                if (holder.mGoodsCountTV.text.handlerNull().isEmpty()) {
                    context.showToast("商品异常,请稍后再试")
                    return@setOnClickListener
                }
                var currentCount = holder.mGoodsCountTV.text.toString().toInt()
                if (currentCount <= 1) {
                    AlertDialog.Builder(context).setTitle("确认删除该商品么")
                        .setPositiveButton("确认") { _, _ ->

                            TrolleyManager.goodDelete(arrayListOf(data.shoppingId))
                        }.setNegativeButton("返回") { _, _ ->
                        }.show()
                } else {
                    currentCount--
                    holder.mGoodsCountTV.text = currentCount.toString()
                    TrolleyManager.goodCountChange(data.shoppingId, currentCount)
                }
            }
            //保存选中状态
            holder.mItemCB.setOnClickListener {
                MyLog.d("子Item点击,商品id:${data.shoppingId} 选中状态 ${holder.mItemCB.isChecked}")
                if (data.isSelected == THE_TRUE) {
                    //从选中状态变为未选中状态
                    TrolleyManager.goodChildItemCheckChange(data.shoppingId, THE_FALSE)
                } else {
                    TrolleyManager.goodChildItemCheckChange(data.shoppingId, THE_TRUE)
                }
            }
            //判断商品状态 是否失效 0：数据有效，1：数据已删除
            when {
                data.isDeleted == 1 -> {
                    holder.mExceptionGoods.visibility = View.VISIBLE
                    holder.mChangeCountLL.visibility = View.GONE
                    holder.mExceptionGoods.text = "已失效"
                    holder.mExceptionGoods.backgroundResource = R.drawable.bg_lost_efficacy
                    holder.mExceptionGoods.textColorResource = R.color.lost_efficacy
                }
                data.isOnsale == 0 -> {
                    holder.mExceptionGoods.visibility = View.VISIBLE
                    holder.mChangeCountLL.visibility = View.GONE
                    holder.mExceptionGoods.text = "已下架"
                    holder.mExceptionGoods.backgroundResource = R.drawable.bg_sold_out
                    holder.mExceptionGoods.textColorResource = R.color.sold_out
                }
                else -> {
                    holder.mExceptionGoods.visibility = View.GONE
                    holder.mChangeCountLL.visibility = View.VISIBLE
                }
            }
            holder.mParentLL.setOnClickListener {
                //如果是已失效或者已删除的商品提示删除
                if (data.isDeleted == 1 || data.isOnsale == 0) {
                    AlertDialog.Builder(context).setTitle("确认删除该商品么")
                        .setPositiveButton("确认") { _, _ ->
                            TrolleyManager.goodDelete(arrayListOf(data.shoppingId))
                        }.setNegativeButton("返回") { _, _ ->
                        }.show()
                } else {
                    //点击商品跳转到详情页
                    context.startActivity<GoodsDetailActivity>(MyConstants.PART_ID to data.goodId)
                }
            }

            holder.mParentLL.setOnLongClickListener {
                AlertDialog.Builder(context).setTitle("确认删除该商品么")
                    .setPositiveButton("确认") { _, _ ->
                        TrolleyManager.goodDelete(arrayListOf(data.shoppingId))
                    }.setNegativeButton("返回") { _, _ ->
                    }.show()
                true
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mItemCB: CheckBox = view.findViewById(R.id.mItemCB)
        val mItemImageIV: ImageView = view.findViewById(R.id.mItemImageIV)
        val mPartNameTV: TextView = view.findViewById(R.id.mPartNamesTV)
        val mPartCodeTV: TextView = view.findViewById(R.id.mPartCodeTV)
        val mPartPriceTV: TextView = view.findViewById(R.id.mPartPriceTV)
        val mGoodsCountTV: TextView = view.findViewById(R.id.mGoodsCountTV)
        val mMinusBTN: RelativeLayout = view.findViewById(R.id.mMinusBTN)
        val mAddBTN: RelativeLayout = view.findViewById(R.id.mAddBTN)
        val mChangeCountLL: LinearLayout = view.findViewById(R.id.mChangeCountLL)
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
        val mExceptionGoods: TextView = view.findViewById(R.id.mExceptionGoods)
    }

}
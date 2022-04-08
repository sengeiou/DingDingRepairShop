package com.android.ctgapp.adapter.home

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.home.shop.CouponActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.CouponAllEntity
import com.android.ctgapp.entity.deal.CouponBean
import com.android.ctgapp.util.handlerDoubleNull
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.noDataHandler
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.textColor
import org.jetbrains.anko.textColorResource

class CouponAdapter(private val context: Context, private val mList: List<CouponAllEntity.Data>, private val click:Click,voucherClientId: String) : BaseEmptyRecyclerViewAdapter(context, mList) {
    var voucherClientId=voucherClientId
    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_coupon_list, parent, false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val activity = context as CouponActivity
            val data = mList[position]
            if(data.ctgnum.handlerNull().equals("")){
                holder.mCtgnumTV.text="适用品类: 所有品类"
            }else{
                holder.mCtgnumTV.text="适用品类: ${data.ctgnum.handlerNull()}"
            }
            if(data.brands.handlerNull().equals("")){
                holder.mCouponBrandTV.text="适用品牌: 所有品牌"
            }else{
                holder.mCouponBrandTV.text="适用品牌: ${data.brands.handlerNull()}"
            }
            if(data.goods.handlerNull().equals("")){
                holder.mCouponWayTV.text="适用商品: 所有商品"
            }else{
                holder.mCouponWayTV.text="适用商品: ${data.goods.handlerNull()}"
            }

            if(data.thresholdPrice.handlerDoubleNull()==0.0){
                holder.mRuleTV.text="无门槛"
            }else{
                holder.mRuleTV.text="满${data.thresholdPrice.handlerNull()}适用"
            }
            if(data.voucherClientId==voucherClientId){
                holder.mCheak.setChecked(true)
            }else{
                holder.mCheak.setChecked(false)
            }
            holder.mCouponNameTV.text = data.vname.handlerNull()
            holder.mMoneyTV.text = data.remissionPrice.handlerNull()
            val time = "${data.startDate} - ${data.endDate}"
            holder.mUseTimeTV.text = time
            val leftAmountTV="剩余金额:${data.leftAmount.handlerDoubleNull()}"
            holder.mLeftAmountTV.text=leftAmountTV
            holder.mParentLL.setOnClickListener{
//                click.onItemSelect(position)
                if(holder.mCheak.isChecked){
                    holder.mCheak.setChecked(false)
                    voucherClientId=""
                }
                else
                {
                    holder.mCheak.setChecked(true)
                    voucherClientId=data.voucherClientId
                }
                click.onItemSelect(voucherClientId)
                notifyDataSetChanged()
            }


//            when (data.applyWay.handlerNull()) {
//                "0" -> {
//                    holder.mCouponWayTV.text = "适用全部商品"
//                }
//                "1" -> {
//                    holder.mCouponWayTV.text = "适用于指定的商品"
//                }
//                else -> {
//                    holder.mCouponWayTV.text = "适用于指定的商品"
//                }
//            }
//
//            holder.mMoneyTV.text = data.deduction.handlerNull()
//            val rule = "满${data.threshold}可用"
//            holder.mRuleTV.text = rule
//            val time = "${data.validPeriodStart} - ${data.validPeriodEnd}"
//            holder.mUseTimeTV.text = time
//            //区分可用优惠券和不可用优惠券
//            if (activity.currentCanUseType) {
//                holder.mHeadLL.backgroundResource= R.drawable.img_coupon_right
//                holder.mCouponNameHeadTV.backgroundResource= R.drawable.bg_btn_common
//                holder.mCouponNameTV.textColor= Color.parseColor("#444444")
//                holder.mUseTimeTV.textColor= Color.parseColor("#444444")
//                holder.mCouponWayTV.textColor= Color.parseColor("#444444")
//                holder.mButtonTV.textColorResource=R.color.blue_common
//                holder.mButtonTV.text="立即使用"
//                holder.mParentLL.isEnabled=true
//                holder.mButtonRL.isEnabled=true
//            } else {
//                holder.mHeadLL.backgroundResource= R.drawable.img_coupon_right_gray
//                holder.mCouponNameHeadTV.backgroundResource= R.drawable.bg_btn_common_gray
//                holder.mCouponNameTV.textColor= Color.parseColor("#E3E3E3")
//                holder.mUseTimeTV.textColor= Color.parseColor("#E3E3E3")
//                holder.mCouponWayTV.textColor= Color.parseColor("#E3E3E3")
//                holder.mButtonTV.textColor= Color.parseColor("#E3E3E3")
//                holder.mButtonTV.text="无法使用"
//                holder.mParentLL.isEnabled=false
//                holder.mButtonRL.isEnabled=false
//                holder.mCouponWayTV.text=data.notAvailableReason.handlerNull()
//            }
//            holder.mParentLL.setOnClickListener {
//                click.onItemSelect(data)
//            }
//            holder.mButtonRL.setOnClickListener {
//                click.onItemSelect(data)
//            }

        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mParentLL: LinearLayout = view.findViewById(R.id.mParentLL)
        val mMoneyTV: TextView = view.findViewById(R.id.mMoneyUsedTV)
        val mCouponNameTV: TextView = view.findViewById(R.id.mCouponNameTV)
        val mUseTimeTV: TextView = view.findViewById(R.id.mUseTimeTV)
        val mCouponWayTV: TextView = view.findViewById(R.id.mCouponWayTV)
        val mRuleTV: TextView = view.findViewById(R.id.mRuleTV)
        val mCouponNameHeadTV: TextView = view.findViewById(R.id.mCouponNameHeadTV)
        val mButtonTV: TextView = view.findViewById(R.id.mButtonTV)
        val mButtonRL: RelativeLayout = view.findViewById(R.id.mButtonRL)
        val mHeadLL: LinearLayout = view.findViewById(R.id.mHeadLL)
        val mCheak: CheckBox =view.findViewById(R.id.mCheak)
        val mCouponBrandTV:TextView=view.findViewById(R.id.mCouponBrandTV)
        val mLeftAmountTV:TextView=view.findViewById(R.id.mLeftAmountTV)
        val mCtgnumTV:TextView=view.findViewById(R.id.mCtgnumTV)
    }
    interface Click{
        fun onItemSelect(voucherClientId: String)
    }
}
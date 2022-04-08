package com.android.ctgapp.adapter.home

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.mine.ALLCouponsActivity
import com.android.ctgapp.adapter.mine.RechargeHistoryParentAdapter
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.CouponAllEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_coupons.*
import org.jetbrains.anko.*

/**
 *作者:LiBW
 *创建日期: 12/30/20
 *描述: 全部优惠券页面使用的适配器
 */
class AllCouponAdapter(private val context: Context, private val mList: List<CouponAllEntity.Data>) : BaseEmptyRecyclerViewAdapter(context, mList) {

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_all_coupon_list, parent, false)
        return MyViewHolder(view)
    }
    private fun reshow(holder:MyViewHolder, data: Boolean){
        if (data){
            holder.mDetails.visibility= View.VISIBLE

        }else{
            holder.mDetails.visibility= View.GONE
        }
    }
    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {

        if (holder is MyViewHolder) {
            val activity = context as ALLCouponsActivity
            val data = mList[position]
            var isShow=false
            holder.mCouponNameTV.text = data.vname.handlerNull()
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




            holder.mMoneyTV.text = data.remissionPrice.handlerNull()

            val time = "${data.startDate} - ${data.endDate}"
            holder.mUseTimeTV.text = time
            val leftAmountTV="剩余金额:${data.leftAmount}"
            holder.mLeftAmountTV.text=leftAmountTV
            //区分可用优惠券和不可用优惠券
            when (activity.currentCanUseType) {
                1,
                2 ->
                {
                    holder.mHeadLL.backgroundResource= R.drawable.img_coupon_right
                    holder.mCouponNameHeadTV.backgroundResource = R.drawable.bg_btn_common
                    holder.mCouponNameTV.textColor = Color.parseColor("#444444")
                    holder.mUseTimeTV.textColor = Color.parseColor("#444444")
                    holder.mCouponBrandTV.textColor = Color.parseColor("#444444")
                    holder.mCouponWayTV.textColor = Color.parseColor("#444444")
                    holder.mButtonTV.textColor = Color.parseColor("#444444")
                    holder.mCtgnumTV.textColor= Color.parseColor("#444444")
                    holder.mButtonTV.textColorResource = R.color.blue_common
                    holder.mButtonTV.text = "立即使用"
                    holder.mButtonRL.isEnabled = true
                    holder.mButtonTV.isEnabled = true
                }
//                2 -> {
//                    holder.mHeadLL.backgroundResource= R.drawable.img_coupon_right_gray
//                    holder.mCouponNameHeadTV.backgroundResource = R.drawable.bg_btn_common_gray
//                    holder.mCouponNameTV.textColor = Color.parseColor("#E3E3E3")
//                    holder.mUseTimeTV.textColor = Color.parseColor("#E3E3E3")
//                    holder.mCouponWayTV.textColor = Color.parseColor("#E3E3E3")
//                    holder.mCouponBrandTV.textColor = Color.parseColor("#E3E3E3")
//                    holder.mCtgnumTV.textColor= Color.parseColor("#E3E3E3")
//                    holder.mButtonTV.textColor = Color.parseColor("#E3E3E3")
//                    holder.mButtonTV.text = "已使用"
//                    holder.mButtonRL.isEnabled = false
//                    holder.mButtonTV.isEnabled = false
//                    //holder.mCouponWayTV.text = data.goods.handlerNull()
//                }
                3 -> {
                    holder.mHeadLL.backgroundResource= R.drawable.img_coupon_right_gray
                    holder.mCouponNameHeadTV.backgroundResource = R.drawable.bg_btn_common_gray
                    holder.mCouponNameTV.textColor = Color.parseColor("#444444")
                    holder.mUseTimeTV.textColor = Color.parseColor("#444444")
                    holder.mCouponBrandTV.textColor = Color.parseColor("#444444")
                    holder.mCouponWayTV.textColor = Color.parseColor("#444444")
                    holder.mButtonTV.textColor = Color.parseColor("#444444")
                    holder.mCtgnumTV.textColor= Color.parseColor("#444444")
                    holder.mButtonTV.text = "已用完"
                    holder.mButtonRL.isEnabled = false
                    holder.mButtonTV.isEnabled = false
                    //holder.mCouponWayTV.text = data.goods.handlerNull()
                }
                4 -> {
                    holder.mHeadLL.backgroundResource= R.drawable.img_coupon_right_gray
                    holder.mCouponNameTV.textColor = Color.parseColor("#444444")
                    holder.mUseTimeTV.textColor = Color.parseColor("#444444")
                    holder.mCouponBrandTV.textColor = Color.parseColor("#444444")
                    holder.mCouponWayTV.textColor = Color.parseColor("#444444")
                    holder.mButtonTV.textColor = Color.parseColor("#444444")
                    holder.mCtgnumTV.textColor= Color.parseColor("#444444")
                    holder.mButtonTV.text = "已过期"
                    holder.mButtonRL.isEnabled = false
                    holder.mButtonTV.isEnabled = false
                    //holder.mCouponWayTV.text = data.goods.handlerNull()
                }
                5 -> {
                    holder.mHeadLL.backgroundResource= R.drawable.img_coupon_right_gray
                    holder.mCouponNameHeadTV.backgroundResource = R.drawable.bg_btn_common_gray
                    holder.mCouponNameTV.textColor = Color.parseColor("#444444")
                    holder.mUseTimeTV.textColor = Color.parseColor("#444444")
                    holder.mCouponBrandTV.textColor = Color.parseColor("#444444")
                    holder.mCouponWayTV.textColor = Color.parseColor("#444444")
                    holder.mButtonTV.textColor = Color.parseColor("#444444")
                    holder.mCtgnumTV.textColor= Color.parseColor("#444444")
                    holder.mButtonTV.text = "已终止"
                    holder.mButtonRL.isEnabled = false
                    holder.mButtonTV.isEnabled = false
                    //holder.mCouponWayTV.text = data.goods.handlerNull()
                }
                else -> {
                    holder.mHeadLL.backgroundResource= R.drawable.img_coupon_right_gray
                    holder.mCouponNameHeadTV.backgroundResource = R.drawable.bg_btn_common_gray
                    holder.mCouponNameTV.textColor = Color.parseColor("#E3E3E3")
                    holder.mUseTimeTV.textColor = Color.parseColor("#E3E3E3")
                    holder.mCouponBrandTV.textColor = Color.parseColor("#E3E3E3")
                    holder.mCouponWayTV.textColor = Color.parseColor("#E3E3E3")
                    holder.mButtonTV.textColor = Color.parseColor("#E3E3E3")
                    holder.mCtgnumTV.textColor=Color.parseColor("#E3E3E3")
                    holder.mButtonTV.text = "已过期"
                    holder.mButtonRL.isEnabled = false
                    holder.mButtonTV.isEnabled = false
                    //holder.mCouponWayTV.text = data.goods.handlerNull()
                }
            }
            holder.mButtonTV.setOnClickListener {
                context.startActivity<MainActivity>(MyConstants.GO_JUMP to 0)
                context.finish()
            }
            holder.mButtonRL.setOnClickListener {
                context.startActivity<MainActivity>(MyConstants.GO_JUMP to 0)
                context.finish()
            }
            data.useRecords?.let {
                //处理详情子列表
                holder.mChildCouponRV.layoutManager = LinearLayoutManager(context)
                holder.mChildCouponRV.adapter=AllChildCouponAdapter(context, it)

            }
            holder.mParentLL.setOnClickListener {
                isShow= if (isShow) false else true
                //isshow=if(isshow) false else true
                println("hasClicked"+isShow)
                //notifyItemChanged(position)
                //notifyDataSetChanged()
                reshow(holder,isShow&&(data.useRecords.size>0))
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mMoneyTV: TextView = view.findViewById(R.id.mMoneyUsedTV)
        val mCouponNameTV: TextView = view.findViewById(R.id.mCouponNameTV)
        val mUseTimeTV: TextView = view.findViewById(R.id.mUseTimeTV)
        val mCouponWayTV: TextView = view.findViewById(R.id.mCouponWayTV)
        val mRuleTV: TextView = view.findViewById(R.id.mRuleTV)
        val mCouponNameHeadTV: TextView = view.findViewById(R.id.mCouponNameHeadTV)
        val mButtonTV: TextView = view.findViewById(R.id.mButtonTV)
        val mButtonRL: RelativeLayout = view.findViewById(R.id.mButtonRL)
        val mHeadLL: LinearLayout = view.findViewById(R.id.mHeadLL)
        val mLeftAmountTV:TextView=view.findViewById(R.id.mLeftAmountTV)
        val mChildCouponRV:RecyclerView=view.findViewById(R.id.mChildCouponRV)
        val mDetails:LinearLayout=view.findViewById(R.id.mDetails)
        val mParentLL:LinearLayout=view.findViewById(R.id.mParentLL)
        val mCouponBrandTV:TextView=view.findViewById(R.id.mCouponBrandTV)
        val mCtgnumTV:TextView=view.findViewById(R.id.mCtgnumTV)
    }


}
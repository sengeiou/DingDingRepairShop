package com.android.ctgapp.adapter.mine

import com.android.ctgapp.R
import com.android.ctgapp.databinding.ItemRechargeHistoryChildListBinding
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.entity.RechargeHistoryEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.ossUrlHandler
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_other_detail.*
import org.jetbrains.anko.textColor
import org.jetbrains.anko.textColorResource
import java.math.BigDecimal
import java.text.DecimalFormat

class RechargeHistoryChildAdapter (private val context: Context, private val mList: List<RechargeHistoryEntity.Data.Detail>) : RecyclerView.Adapter<RechargeHistoryChildAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = ItemRechargeHistoryChildListBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = mList[position]
        val df = DecimalFormat("######0.00")

        Glide.with(context).load(data.imageUrl)
            .error(R.drawable.df)
            .into(holder.mImageView)
        holder.mTime.text=data.createTime.replace("T"," ")
        holder.mEvent.text=data.userName
        val payWay=when(data.payWay){
            2->"微信支付"
            1->"支付宝支付"
            3-> "储值卡支付"
            4->"代金券支付"
            5->"商家发放"
            else ->"其他方式"
        }
//        when(data.changeType){
//            0->{
//                holder.mRemark.text="备注:${payWay}"
//                holder.mMoney.setTextColor(Color.GREEN)
//                //显示时加上+
//                holder.mMoney.text= "+${df.format(BigDecimal(data.useAmount.handlerNull()).abs())}"
//            }
//            1,3->{
//                holder.mRemark.text="备注:${data.remark}"
//                holder.mMoney.setTextColor(Color.RED)
//                holder.mMoney.text= "${df.format(BigDecimal(data.useAmount.handlerNull()))}"
//            }
//            2,4->{
//                holder.mRemark.text="备注:${data.remark}"
//                holder.mMoney.setTextColor(Color.GREEN)
//                holder.mMoney.text= "+${df.format(BigDecimal(data.useAmount.handlerNull()))}"
//            }
//            else->{}
//        }
            holder.mRemark.text=if(data.changeType==0)"备注:${payWay}" else "备注:${data.remark}"
            val useAmount=BigDecimal(data.useAmount.handlerNull())
            if (useAmount>BigDecimal("0")){
                holder.mMoney.setTextColor(Color.GREEN)
                holder.mMoney.text= "+${useAmount}"
            }else{
                holder.mMoney.setTextColor(Color.RED)
                holder.mMoney.text= "${useAmount}"
            }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    inner class MyViewHolder(view: ItemRechargeHistoryChildListBinding) : RecyclerView.ViewHolder(view.root) {
        val mImageView=view.mImageView
        val mMoney=view.mMoney
        val mEvent=view.mEvent
        val mTime=view.mTime
        val mRemark=view.mRemark
    }
}

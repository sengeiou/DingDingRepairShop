package com.android.ctgapp.activity.mine.money
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.activity.deal.CommonPaySuccessActivity
import com.android.ctgapp.adapter.mine.BusinessFriendAdapter
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.databinding.ItemMoneyPackageRechargeListBinding
import com.android.ctgapp.entity.mine.RechargeActivityEntity
import com.android.ctgapp.entity.mine.company.RechargeEntity
import com.android.ctgapp.util.handlerNull
import com.blankj.utilcode.util.ActivityUtils.startActivity
import org.jetbrains.anko.startActivity

class MoneyPackageRechargeAdapter (private val context: Context, private val mList: List<RechargeActivityEntity.DataBean.activityListBean>) : BaseEmptyRecyclerViewAdapter(context, mList)  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = ItemMoneyPackageRechargeListBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(view)
    }

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return mList.size+1
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {

        if (holder is MyViewHolder) {
            var money:String=""//充值金额
            var activityId:Int?=null
            if(position==mList.size){
                holder.mAmount.text="自定义面额"
                holder.mBonusAmount.visibility=View.GONE
                holder.mAmountU.visibility=View.GONE

            }else{
                holder.mBonusAmount.visibility=View.VISIBLE
                holder.mAmountU.visibility=View.VISIBLE
                val data = mList[position]
                activityId=data.id
                holder.mAmount.text=data.amount.handlerNull()
                var bonusAmount=data.bonusAmount


//                if(bonusAmount!!.toFloat()==0.0F){
//                    holder.mBonusAmount.visibility=View.GONE
//                }else{
//                    holder.mBonusAmount.visibility=View.VISIBLE
//                    holder.mBonusAmount.text="送"+bonusAmount.handlerNull()+"元"
//                }
                if(data.activityName.handlerNull().equals("")){
                    holder.mBonusAmount.visibility=View.GONE
                }
                else{
                    holder.mBonusAmount.visibility=View.VISIBLE
                    holder.mBonusAmount.text=data.activityName.handlerNull()
                }
                money=data.amount.handlerNull()
            }
            holder.mParentLL.setOnClickListener {
                context.startActivity<RechargeCommitActivity>(
                    "Money" to money,
                    "ActivityId" to activityId
                )
            }
        }

    }

    inner class MyViewHolder(view: ItemMoneyPackageRechargeListBinding) : RecyclerView.ViewHolder(view.root) {
        val mAmount:TextView=view.mAmount
        val mBonusAmount:TextView=view.mBonusAmount
        val mAmountU:TextView=view.mAmountU
        val mParentLL=view.mParentLL
    }

}

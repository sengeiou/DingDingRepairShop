package com.android.ctgapp.adapter.mine

import com.android.ctgapp.databinding.ItemMoneyPackageCompanyListBinding
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.money.MoneyPackageRechargeActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseEmptyRecyclerViewAdapter
import com.android.ctgapp.entity.mine.company.RechargeEntity
import com.android.ctgapp.util.handlerNull
import com.bumptech.glide.Glide
import org.jetbrains.anko.startActivity

class MoneyPackageCompanyAdapter (private val context: Context, private val mList: List<RechargeEntity.DataBean>) : BaseEmptyRecyclerViewAdapter(context,mList) {

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val view = ItemMoneyPackageCompanyListBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(view)
    }

    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
       if (holder is MyViewHolder){
           val data=mList[position]
           val voucherNum=data.voucherNum
           if(voucherNum>0){
               holder.mVoucherLL.visibility= View.VISIBLE
               holder.mIsActivityIm.visibility= View.VISIBLE
           }else{
               holder.mVoucherLL.visibility= View.INVISIBLE
               holder.mIsActivityIm.visibility= View.INVISIBLE
           }
           Glide.with(context).load(R.drawable.logo_app)
                .error(R.drawable.logo_app)
                .into(holder.mImageView)
           holder.mCompanyName.text= data.fromCompanyName.toString()
           "${data.total}".also { holder.mMoney.text = it }
           "${voucherNum}".also { holder.mVoucherNum.text = it }
           holder.mParentLL.setOnClickListener {
                context.startActivity<MoneyPackageRechargeActivity>(
                    "platformClientId" to data.platformClientId,
                    "fromCompanyId" to data.fromCompanyId,
                )
               BaseApplication.clientCompanyId = data.platformClientId.handlerNull()
               BaseApplication.supplyCompanyId = data.fromCompanyId.handlerNull()
           }

       }
    }

    inner class MyViewHolder(view: ItemMoneyPackageCompanyListBinding) : RecyclerView.ViewHolder(view.root) {
        val mCompanyName=view.mCompanyName
        val mMoney=view.mMoney
        val mParentLL=view.mParentLL
        val mImageView=view.mImageView
        val mVoucherNum=view.mVoucherNum
        val mIsActivityIm=view.mIsActivityIm
        val mVoucherLL=view.mVoucherLL
    }
}

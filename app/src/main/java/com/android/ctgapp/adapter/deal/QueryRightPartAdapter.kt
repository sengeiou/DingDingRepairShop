package com.android.ctgapp.adapter.deal

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.activity.deal.QueryRecordActivity
import com.android.ctgapp.activity.message.chart.CurrentChartActivity
import com.android.ctgapp.activity.message.chart.jumpToChart
import com.android.ctgapp.base.BaseRecyclerViewAdapter
import com.android.ctgapp.databinding.ItemQueryRecordListBinding
import com.android.ctgapp.databinding.ItemQueryRecordParentListBinding
import com.android.ctgapp.databinding.ItemQueryRightPartListBinding
import com.android.ctgapp.entity.home.enquire.EnquireDetailByCompanyEntityV2
import com.android.ctgapp.entity.home.enquire.RightBean
import com.android.ctgapp.util.handlerNull

class QueryRightPartAdapter(private val context: Context, private val mList: List<EnquireDetailByCompanyEntityV2.DataBean.ImmutablePairsBean.ItemsBean>, private val listener: RightCallback) : BaseRecyclerViewAdapter(context, mList) {

    override fun createViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val mBinding = ItemQueryRightPartListBinding.inflate(LayoutInflater.from(context), parent, false)
        return MyViewHolder(mBinding)
    }

    @SuppressLint("SetTextI18n")
    override fun handlerData(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            val data = mList[position]
            //显示模式1按照公司2按照零件
            if (data.displayModel==1){
                holder.mPartLL.visibility=View.GONE
                holder.mCompanyLL.visibility=View.VISIBLE
            }else if (data.displayModel==2){
                holder.mPartLL.visibility=View.VISIBLE
                holder.mCompanyLL.visibility=View.GONE

            }
            //配件名称
            holder.mPartNameTV.text=data.partName.handlerNull()
            holder.mOeTV.text=data.oe.handlerNull()

            //名称
            holder.mPersonTV.text=data.brand.handlerNull()

            //选中状态
            holder.mCheckBox.isChecked=data.select
            holder.mParentLL.setOnClickListener {
                holder.mCheckBox.performClick()
            }
            holder.mCheckBox.setOnClickListener {
                data.select=holder.mCheckBox.isChecked
                notifyItemChanged(position)
            }


            //数量
            holder.mGoodsCountTV.text = data.num.handlerNull()
            //加数量
            holder.mAddBTN.setOnClickListener {
                data.num += 1
                notifyItemChanged(position)
            }
            //减数量
            holder.mMinusBTN.setOnClickListener {
                if (data.num>1){
                    data.num -= 1
                    notifyItemChanged(position)
                }
            }
            //公司名
            holder.mCompanyNameTV.text = data.quotationCompanyName.handlerNull()
            //聊天
            holder.mChatIV.setOnClickListener {
                context.jumpToChart(data.quotationUserId, data.quotationUserName.handlerNull(), "", data.quotationCompanyName.handlerNull())
            }
            holder.mOeTV.text = data.oe.handlerNull()
            holder.mTimeTV.text = data.aogTime.handlerNull()
            holder.mPriceTV.text = "¥${data.price.handlerNull()}"
        }
    }

    inner class MyViewHolder(view: ItemQueryRightPartListBinding) : RecyclerView.ViewHolder(view.root) {
        val mParentLL: LinearLayoutCompat = view.mParentLL
        val mCheckBox: CheckBox = view.mCheckBox

        val mCompanyNameTV: TextView = view.mCompanyNameTV
        val mPartNameTV: TextView = view.mPartNameTV
        val mBrandNameTV: TextView = view.mBrandNameTV
        val mOeTV: TextView = view.mOeTV
        val mPersonTV: TextView = view.mPersonTV
        val mTimeTV: TextView = view.mTimeTV
        val mChatIV: ImageView = view.mChatIV
        val mPriceTV: TextView = view.mPriceTV
        val mMinusBTN: RelativeLayout = view.mMinusBTN
        val mAddBTN: RelativeLayout = view.mAddBTN
        val mGoodsCountTV: TextView = view.mGoodsCountTV
        val mPartLL: LinearLayoutCompat = view.mPartLL
        val mCompanyLL: LinearLayoutCompat = view.mCompanyLL


//        val mBrandTV: TextView = view.mBrandTV
//        val mPriceTV: TextView = view.mPriceTV
//        val mArrivalTimeTV: TextView = view.mArrivalTimeTV
//        val mCheckBox: CheckBox = view.mCheckBox
//        val mParentLL: LinearLayout = view.mParentLL
//        val mUnderLine: View = view.mUnderLine
//        val mTalkToCompanyIV: ImageView = view.mTalkToCompanyIV
    }

    interface RightCallback {
        fun onRightItemClick(position: Int, select: Boolean)
    }

}
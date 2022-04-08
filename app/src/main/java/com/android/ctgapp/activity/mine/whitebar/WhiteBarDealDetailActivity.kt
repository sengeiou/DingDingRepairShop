package com.android.ctgapp.activity.mine.whitebar

import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.deal.OrderDetailAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityWhiteBarDealDetailBinding
import com.android.ctgapp.entity.deal.OrderDetailEntity
import com.android.ctgapp.entity.mine.WhiteBarDealDetail4Entity
import com.android.ctgapp.util.*
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 2021/5/28
 *描述:白条 交易详情 页面 4级
 */
class WhiteBarDealDetailActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityWhiteBarDealDetailBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private val mViewModel by lazy { ViewModelProvider(this)[WhiteBarDealDetailViewModel::class.java] }
    private val mCompanyId by lazy { intent.getIntExtra(MyConstants.COMPANY_ID, -1) }
    private val mBillNo by lazy { intent.getStringExtra(MyConstants.BILL_NO).handlerNull() }
    private val mOrderNo by lazy { intent.getStringExtra(MyConstants.ORDER_NO).handlerNull() }

    override fun event() {
        if (intent.getBooleanExtra(MyConstants.NO_TITLE,false)){
            mBinding.mTitleLL.visibility= View.GONE
        }else{
            mViewModel.getData(mBillNo, mOrderNo, mCompanyId)
        }
        mBinding.mCompanyNameTV.text = intent.getStringExtra(MyConstants.COMPANY_NAME).handlerNull()
        mViewModel.getOrderDetail(mOrderNo)
        mViewModel.error.observe(this, {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, { result ->
            dismissLoading()
            MyLog.d("账单详情:$result")
            handlerHttpResult(result) {
                val data = getGson().fromJson(result, WhiteBarDealDetail4Entity::class.java).data


                data?.let { _ ->
                    "订单编号:${data.billnum.handlerNull()}".also { mBinding.mOrderNumberTV.text = it }
                    "¥${data.orderMoney.handlerNull()}".also { mBinding.mOrderPriceTV.text = it }
                    "¥${data.billMoney.handlerNull()}".also { mBinding.mAccountPriceTV.text = it }
                    "(最迟还款时间:${data.lastDay.handlerNull()})".also { mBinding.mLastTimeTV.text = it }
                    mBinding.mRefundTimeTV.text = data.payTime.handlerNull()
                    when (data.retrunType) {
                        0 -> {
                            //未还款展示对账按钮 隐藏立即还款按钮
                            val text = "对账中"
                            mBinding.mOrderStatueTV.text = text
                            mBinding.mOrderStatueTV.textColorResource = R.color.blue_light
                        }
                        6 -> {
                            //未还款展示对账按钮 隐藏立即还款按钮
                            val text = "等待对方确认对账"
                            mBinding.mOrderStatueTV.text = text
                            mBinding.mOrderStatueTV.textColorResource = R.color.x_recycler_color_text_gray
                        }
                        1 -> {
                            val text = "未还款"
                            mBinding.mOrderStatueTV.text = text
                            mBinding.mOrderStatueTV.textColorResource = R.color.red_start
                        }
                        2 -> {
                            val text = "已还款"
                            mBinding.mOrderStatueTV.text = text
                            mBinding.mOrderStatueTV.textColorResource = R.color.green_color
                        }

                        else -> {
                            mBinding.mOrderStatueTV.text = ""
                        }
                    }
                }
            }
        })
        mViewModel.orderDetailResult.observe(this, {
            dismissLoading()
            MyLog.d("订单详情列表:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, OrderDetailEntity::class.java).data
                data?.let {
                    "采购订单:${data.orderNo.handlerNull()}".also { mBinding.mBuyNumberTV.text = it }
                    "交易时间:${data.createTime.handlerNull()}".also { mBinding.mBuyTimeTV.text = it }
                    "¥${data.totalPrice.handlerNull()}".also { mBinding.mRealPriceTV.text = it }
                    "¥${data.totalPrice.handlerNull()}".also { mBinding.mGoodsPriceTV.text = it }
                }
                data?.ctgOrderPay?.let {bean->
                    "¥${bean.totalReturnCash.handlerNull()}".also { mBinding.mReturnPriceTV.text = it }

                }

                data?.orderDetailS?.let { list ->
                    val mAdapter = OrderDetailAdapter(this, list)
                    mBinding.mGoodsRV.adapter = mAdapter
                    mBinding.mGoodsRV.layoutManager = LinearLayoutManager(this)
                }
            }
        })
    }

    override fun click() {

    }
}
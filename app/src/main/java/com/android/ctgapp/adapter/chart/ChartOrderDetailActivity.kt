package com.android.ctgapp.adapter.chart

import android.view.View
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.deal.OrderDetailViewModel
import com.android.ctgapp.adapter.deal.OrderDetailAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.deal.OrderDetailEntity
import com.android.ctgapp.enum.getOrderStatusName
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.OrderProgressView
import kotlinx.android.synthetic.main.activity_chart_order_detail.*

/**
 *作者:LiBW
 *创建日期: 11/16/20
 *描述: 订单详情 页面 聊天用
 */
class ChartOrderDetailActivity : BaseActivity() {
    private val mViewModel: OrderDetailViewModel by lazy { ViewModelProvider(this)[OrderDetailViewModel::class.java] }

    //1:继续支付  3:确认收货 4:发起售后
    var type = -1
    private var entityStr = ""
    var mOrderId = ""
    override fun event() {
        val mType = intent.getIntExtra(MyConstants.TYPE, 0)
        type = mType
        val orderId = intent.getStringExtra(MyConstants.ORDER_ID)
        orderId?.let {
            showLoading()
            mOrderId = it
            mViewModel.getOrderDetail(it)
        }

        //1待付款  2待发货 3待收货 4已完成  7已取消 9退货中 //已取消放在全部里
        mOrderStatusTV.text = getOrderStatusName(type)
        MyLog.d("过来的type:$type")
        when (type) {
            7 -> {
                type = 5
                mRefundTV.visibility = View.VISIBLE
                mRefundTV.text = "已取消"
            }
            9 -> {
                type = 5
                mRefundTV.visibility = View.VISIBLE
                mRefundTV.text = "退货中"
            }
        }


        val count = if (type == 5) 5 else 4
        var flag = true
        var isLast = false
        repeat(count) {
            if (it == type - 1) flag = false
            if (it == count - 1) isLast = true
            MyLog.d("flag:$flag")
            val view: OrderProgressView = if (it == type - 1) {
                OrderProgressView(flag, this, isLast, true)
            } else {
                OrderProgressView(flag, this, isLast)
            }
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            params.weight = 1f
            view.layoutParams = params
            mProgressLL.addView(view)
        }

        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, Observer {
            loading.dismiss()
            MyLog.d("订单详情:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, OrderDetailEntity::class.java).data
                entityStr = it
                data?.let { item ->

                    //商品金额
                    mTotalPriceTV.text = item.totalPrice.handlerNull()
                    //优惠金额
                    mCouponPriceTV.text = item.discountPrice.handlerNull()
                    //实付金额
                    mRealPriceTV.text = item.actuallyPrice.handlerNull()
                    val address = "${item.province} ${item.city} ${item.district} ${item.address}"
                    mAddressTV.text = address
                    val orderID = "订单号: ${item.orderNo}"
                    mOrderIdTV.text = orderID
                    mOrderCreateTimeTV.text = item.ctgOrderPay?.createTime.handlerNull()
                }
                data?.orderDetailS?.let { list ->
                    val mAdapter = OrderDetailAdapter(this, list)
                    mGoodsRV.adapter = mAdapter
                    mGoodsRV.layoutManager = LinearLayoutManager(this)

                    var canReturnGoodsCount = 0
                    list.forEach { item ->
                        canReturnGoodsCount += item.unRefundGoodsAmount!!
                    }
                }
            }
        })
    }

    override fun click() {
        mBackIv.setOnClickListener {
            finish()
        }
    }

    override fun getLayout() = R.layout.activity_chart_order_detail
}
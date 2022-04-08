package com.android.ctgapp.activity.message.chart

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.deal.OrderDetailViewModel
import com.android.ctgapp.adapter.deal.ChartOrderAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.entity.OrderEntity
import com.android.ctgapp.entity.chart.ChartOrderEntity
import com.android.ctgapp.fragment.deal.DealOrderViewModel
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_chart_order.*

/**
 *作者:LiBW
 *创建日期: 1/26/21
 *描述: 聊天 订单 页面
 */
class ChartOrderActivity : BaseActivity(), ChartOrderAdapter.ItemClickCallback {
    override fun getLayout() = R.layout.activity_chart_order
    private val mViewModel: DealOrderViewModel by lazy { ViewModelProvider(this)[DealOrderViewModel::class.java] }
    private val mOrderDetailViewModel: OrderDetailViewModel by lazy { ViewModelProvider(this)[OrderDetailViewModel::class.java] }
    private var page = 1
    private val size = 20
    private val mList = ArrayList<OrderEntity.DataBean.RecordsBean>()
    private val mAdapter: ChartOrderAdapter by lazy { ChartOrderAdapter(this, mList, this) }
    private var mBuyerName=""
    override fun event() {
        mCompanyNameTV.text = BaseApplication.companyName.handlerNull()
        mOrderRV.adapter = mAdapter
        mOrderRV.layoutManager = LinearLayoutManager(this)
        getData()
        mViewModel.error.observe(this, {
            mRefresh.over()
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mOrderDetailViewModel.error.observe(this, {
            mRefresh.over()
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.orderResult.observe(this, {
            mRefresh.over()
            loading.dismiss()
            MyLog.d("订单列表:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, OrderEntity::class.java).data
                data?.records?.let { list ->
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
        })

        mOrderDetailViewModel.result.observe(this, {
            loading.dismiss()
            MyLog.d("订单详情:$it")
            handlerData(it) { _ ->
                val  data= getGson().fromJson(it,ChartOrderEntity::class.java)
                data.data?.buyerUserName=mBuyerName
                val intent = Intent()
                val str=getGson().toJson(data.data)
                MyLog.d("发送给你的订单详情数据:$str")
                intent.putExtra(MyConstants.ORDER,str )
                setResult(10002, intent)
                finish()
            }


//            handlerHttpResult(it) {
//                val data = getGson().fromJson(it, OrderDetailEntity::class.java).data
//                data?.let { item ->
//                    //商品金额
//                    mTotalPriceTV.text = item.totalPrice.handlerNull()
//                    //优惠金额
//                    mCouponPriceTV.text = item.discountPrice.handlerNull()
//                    //实付金额
//                    mRealPriceTV.text = item.actuallyPrice.handlerNull()
//                    val address = "${item.province} ${item.city} ${item.district} ${item.address}"
//                    mAddressTV.text = address
//                    val orderID = "订单号: ${item.orderNo}"
//                    mOrderIdTV.text = orderID
//                    mOrderCreateTimeTV.text = item.ctgOrderPay?.createTime.handlerNull()
//                }
//                data?.orderDetailS?.let { list ->
//                    val mAdapter = OrderDetailAdapter(this, list)
//                    mGoodsRV.adapter = mAdapter
//                    mGoodsRV.layoutManager = LinearLayoutManager(this)
//
//                    var canReturnGoodsCount = 0
//                    list.forEach { item ->
//                        canReturnGoodsCount += item.unRefundGoodsAmount
//                    }
//                    //如果有没有可退货的 就不展示发起退货按钮
//                    if (canReturnGoodsCount == 0) {
//                        //隐藏按钮
//                        mBottomBTN.visibility = View.GONE
//                    } else {
//                        mBottomBTN.visibility = View.VISIBLE
//                    }
//                }
//            }
        })

    }

    private fun getData() {
        showLoading()
        mViewModel.getOrder(page, size, null)
    }

    override fun click() {
        mRefresh.setOnLoadMoreListener {
            page++
            getData()
        }
        mRefresh.setOnRefreshListener {
            page = 1
            mList.clear()
            getData()
        }
        mBackIv.setOnClickListener {
            finish()
        }
    }


    //点击了相应的订单
    override fun onItemClick(bean: OrderEntity.DataBean.RecordsBean) {
        bean.orderId?.let {
            mBuyerName=bean.buyerUserName.handlerNull()
            mOrderDetailViewModel.getOrderDetail(it)
        }
    }
}
package com.android.ctgapp.activity.deal

import android.view.View
import android.widget.LinearLayout
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.home.shop.CheckoutActivity
import com.android.ctgapp.activity.home.shop.WhiteBarReturnActivity
import com.android.ctgapp.activity.message.chart.jumpToChart
import com.android.ctgapp.adapter.deal.OrderDetailAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityOrderDetailBinding
import com.android.ctgapp.entity.deal.ChatersBean
import com.android.ctgapp.entity.deal.OrderDetailEntity
import com.android.ctgapp.entity.home.ShoppingSupportWithCreditEntity
import com.android.ctgapp.event.OrderRefresh
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.OrderProgressView
import com.android.ctgapp.widget.dialog.company.OrderDetailCanChartDialog
import org.greenrobot.eventbus.EventBus
import org.jetbrains.anko.startActivity
import java.math.BigDecimal

/**`
 *作者:LiBW
 *创建日期: 11/16/20
 *描述: 订单详情 页面
 */
class OrderDetailActivity : BaseActivityV2() {
    val binding by lazy { ActivityOrderDetailBinding.inflate(layoutInflater) }
    override fun getLayout() = binding.root
    private val mViewModel: OrderDetailViewModel by lazy { ViewModelProvider(this)[OrderDetailViewModel::class.java] }
    private var supportWithCredit: Boolean=true
    //1:继续支付  3:确认收货 4:发起售后
    var type = -1
    private var entityStr = ""
    private var mOrderId = ""
    private var payMoney = ""
    private var needReturnMoney = ""
    private var sellerCompanyId = -1
    //可供聊天的客服
    private var chartList=ArrayList<ChatersBean>()
    //聊天时展示的对方公司名称
    private var sellerCompanyName=""
    private var hasUseCoupon=false
    private var companyid:String?=null
    override fun event() {
        binding.mBottomBTN.visibility=View.GONE
        binding.mCancelBTN.visibility=View.GONE
        binding.mPayMoneyBTN.visibility=View.GONE

        //    //1待付款  2待发货 3待收货 4已完成  7已取消 9退款中

        MyLog.d("我这个Type是啥:$type")
        val orderId = intent.getStringExtra(MyConstants.ORDER_ID)
        val orderNo=intent.getStringExtra(MyConstants.ORDER_NO)
        orderId?.let {
            showLoading()
            mOrderId = it
            BaseApplication.orderId = it
            mViewModel.getOrderDetail(orderId=it)
        }
        orderNo?.let {
            mViewModel.getOrderDetailByOrderNo(orderNo=it)
        }



        mViewModel.confirmResult.observe(this, {
            loading.dismiss()
            MyLog.d("确认收货:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("确认收货成功")
                startActivity<MainActivity>(MyConstants.GO_JUMP to 3)
            } else {
                showToast(
                    data.msg
                )
            }
        })

        mViewModel.error.observe(this, {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, {
            loading.dismiss()
            MyLog.d("订单详情:$it")
            handlerHttpResult(it)
            {

                val data = getGson().fromJson(it, OrderDetailEntity::class.java).data
                entityStr = it
                var totalMoney = BigDecimal(0)
                var showReturnBTN = false
                data?.let {
                        item ->
                    val mType = item.state
                    val t = when (mType) {
                        1 -> "待付款"
                        2 -> "待发货"
                        3 -> "待收货"
                        4 -> "已完成"
                        else -> ""
                    }
                    binding.mTitleStatueTV.text = t
                    mOrderId=item.orderId.handlerNull()//避免复用时为空
                    BaseApplication.orderPay = mType
                    type = mType
                    when (type) {
                        1 -> {
                            //binding.mPayWayLL.visibility = View.GONE
                        }
                        7 -> {
                            type = 5
                            binding.mRefundTV.visibility = View.VISIBLE
                            binding.mRefundTV.text = "已取消"
                            binding.mTitleStatueTV.text = "已取消"
                            //binding.mPayWayLL.visibility = View.GONE
                        }
                        9 -> {
                            type = 5
                            binding.mRefundTV.visibility = View.VISIBLE
                            binding.mRefundTV.text = "退货中"
                            binding.mTitleStatueTV.text = "退货中"
                        }
                    }
                    //修改按钮
                    when (type) {
                        1 -> {
                            binding.mBottomBTN.text = "继续付款"
                            binding.mBottomBTN.visibility = View.VISIBLE
                            binding.mCancelBTN.visibility = View.VISIBLE
                        }
                        3 -> {
                            binding.mBottomBTN.text = "确认收货"
                            binding.mBottomBTN.visibility = View.VISIBLE
                            binding.mCancelBTN.visibility = View.GONE
                        }
                        4 -> {
                            binding.mBottomBTN.text = "发起售后"
                            binding.mCancelBTN.visibility = View.GONE
                            //此处按钮展示交给服务器返回的数据 如果有可以退货的商品则展示按钮
//                mBottomBTN.visibility = View.VISIBLE
                        }

                        2->{
                            binding.mCancelBTN.visibility = View.VISIBLE
                        }
                        else -> {
                            binding.mBottomBTN.visibility = View.GONE
                            binding.mCancelBTN.visibility = View.GONE
                        }
                    }
                    //处理顶部进度条
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
                        binding.mProgressLL.addView(view)
                    }

                    companyid=item.sellerCompanyId.handlerNull()
                    hasUseCoupon=if(item.ctgOrderPay?.voucherId.handlerNull().equals(""))false else true//是否使用优惠券
                    sellerCompanyName=item.sellerCompanyName.handlerNull()
                    //是否使用优惠券
                    if(item.ctgOrderPay!!.voucherCash.handlerDoubleNull()!=0.0){
                        supportWithCredit=false
                    }
                    //客服
                    item.chaters?.let { list->
                        chartList.addAll(list)
                    }
                    item.sellerCompanyId?.let { id ->
                        sellerCompanyId = id
                    }
                    //支付方式
                    if ("挂账" in item.payWayString.handlerNull()) {
                        val pay = item.payWayString + "(已还完)"
                        binding.mOrderStatusTV.text = pay
                    } else {
                        binding.mOrderStatusTV.text = item.payWayString
                    }
                    //白条账单未结清 展示立即还款按钮
                    if (item.isSettled == 0) {
                        showReturnBTN = true
                    }
                    //商品金额
//                    binding.mTotalPriceTV.text = item.totalPrice.handlerNull()
                    binding.mTotalPriceTV.text = item.originalTotalPrice.handlerNull()
                    //优惠金额
                    //binding.mCouponPriceTV.text = item.discountPrice.handlerNull()

                    if(item.actuallyPrice.handlerNull().equals("")){
                        totalMoney= BigDecimal(0.0)
                    }else{
                        totalMoney= BigDecimal(item.actuallyPrice.handlerNull())
                    }


//实付金额
                    binding.mRealPriceTV.text = totalMoney.toDouble().handlerNull()
                    payMoney = item.actuallyPrice.handlerNull()
                    val address = "${item.province} ${item.city} ${item.district} ${item.address}"
                    binding.mAddressTV.text = address
                    val orderID = "订单号: ${item.orderNo}"
                    //将当前的订单号放入全局
                    BaseApplication.orderNum = item.orderNo.handlerNull()
                    binding.mOrderIdTV.text = orderID
                    "下单时间: ${item.ctgOrderPay?.createTime.handlerNull()}".also { binding.mOrderCreateTimeTV.text = it }
                    val remark = "备注: ${item.remark.handlerNull()}"
                    binding.mRemarkTV.text = remark
                }
                data?.ctgOrderPay?.storeCash?.let {
                    binding.mStoreCashLL.visibility=View.VISIBLE
                    binding.mStoreCashTV.text=it.handlerNull()
                }
                data?.ctgOrderPay?.voucherCash?.let {
                    binding.mCouponPriceLL.visibility=View.VISIBLE
                    binding.mCouponPriceTV.text=it.handlerNull()
                }
                //处理立即还款按钮
                data?.ctgOrderPay?.totalReturnCash?.let { money ->
                    //退货金额
                    if(money==0F){
                        binding.mReturnMoneyLL.visibility= View.INVISIBLE
                    }else{
                        binding.mReturnMoneyLL.visibility= View.VISIBLE
                        binding.mReturnMoneyTV.text = money.handlerNull()
                    }

                    //已退金额
                    totalMoney = totalMoney.subtract(BigDecimal(money.handlerNull()))
                    BaseApplication.price = totalMoney.handlerNull()
                    if (totalMoney > BigDecimal.ZERO && showReturnBTN) {
                        binding.mPayMoneyBTN.visibility = View.VISIBLE
                        //支付方式
                        binding.mOrderStatusTV.text = "挂账(未还款)"
                    } else {
                        binding.mPayMoneyBTN.visibility = View.GONE
                    }
                    //需要还款的金额
                    needReturnMoney = totalMoney.handlerNull()
                }
                //处理可退货数量
                data?.orderDetailS?.let { list ->
                    val mAdapter = OrderDetailAdapter(this, list)
                    binding.mGoodsRV.adapter = mAdapter
                    binding.mGoodsRV.layoutManager = LinearLayoutManager(this)
                    var canReturnGoodsCount = 0
                    list.forEach { item ->
                        item.unRefundGoodsAmount?.let {
                            canReturnGoodsCount += item.unRefundGoodsAmount!!
                        }
                    }
                    MyLog.d("可以退货的数量:$canReturnGoodsCount")
                    //如果有没有可退货的 就不展示发起退货按钮
                    if (canReturnGoodsCount == 0) {
                        //隐藏按钮
                        binding.mBottomBTN.visibility = View.GONE
                    } else {
                        if (type == 4) binding.mBottomBTN.visibility = View.VISIBLE
                    }
                }



            }
        })
        //取消订单回调
        mViewModel.cancelResult.observe(this, {
            dismissLoading()
            MyLog.d("取消订单回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("取消订单成功")
                finish()
            } else {
                showToast(data.msg)
            }
        })
        mViewModel.creditConfirmResult.observe(this, {
            MyLog.d("是否可以挂账:${it}")
            val data = getGson().fromJson(it, ShoppingSupportWithCreditEntity::class.java)
            data.data.let { list ->

                var whiteBarMoney = ""
                if (list.isNotEmpty()) {
                    //supportWithCredit = true
                    whiteBarMoney = if (list[0].flag) {
                        list[0].amount.handlerNull()
                    } else {
                        "-1"
                    }
                } else {
                    supportWithCredit = false
                }
                startActivity<CheckoutActivity>(
                    MyConstants.SUPPORT_CREDIT to supportWithCredit,
                    MyConstants.CONTINUE_TO_PAY to entityStr,
                    MyConstants.White_Money to whiteBarMoney,
                    MyConstants.COMPANY_ID to companyid
                )
            }


//            val result = getGson().fromJson(it, ResultEntity::class.java)
//            if (result.status == 0) {
//                val supportWithCredit = result.data.handlerNull() == "true"
//                startActivity<CheckoutActivity>(
//                    MyConstants.SUPPORT_CREDIT to supportWithCredit,
//                    MyConstants.CONTINUE_TO_PAY to entityStr
//                )
//            }
        })
    }

    override fun click() {
        //聊天 按钮
        binding.mChartLL.setOnClickListener {
            when(chartList.size){
                0->{
                    showToast("抱歉,该供应商暂无客服")
                }
                1->{
                    val bean=chartList[0]
                    if (bean.id==BaseApplication.userId){
                        showToast("抱歉无法和自己聊天")
                    }else{
                        jumpToChart(bean.id,bean.name,"",sellerCompanyName)
                    }
                }
                else->{
                    OrderDetailCanChartDialog(chartList,sellerCompanyName).show(supportFragmentManager,"")

                }
            }
        }

        binding.mBackIv.setOnClickListener {
            onBackPressed()

        }
        binding.mBottomBTN.setOnClickListener {
            MyLog.d("我这个Type是啥按钮:${type}")
            when (type) {
                //继续支付
                1 -> {
                    //先调用检测是否支持白条支付
                    mViewModel.findOrderSupportWithCredit(mOrderId)
                }
                //确认收货
                3 -> {
                    showLoading()
                    mViewModel.confirmGetGoods(mOrderId)
                }
                //发起售后
                4 -> {
                    startActivity<LaunchAfterSaleActivity>(MyConstants.ORDER_ID to mOrderId,
                        "hasUseCoupon" to hasUseCoupon
                    )
                }
            }
        }
        //取消订单
        binding.mCancelBTN.setOnClickListener {
            showLoading()
            mViewModel.cancelOrder(mOrderId)
        }
        //立即还款
        binding.mPayMoneyBTN.setOnClickListener {
            startActivity<WhiteBarReturnActivity>(
                MyConstants.ORDER_ID to mOrderId,
                MyConstants.TOTAL_MONEY to needReturnMoney
            )
        }
    }

    override fun onDestroy() {
        EventBus.getDefault().post(OrderRefresh(2))
        super.onDestroy()
    }

//    override fun onBackPressed() {
//        //跳转到订单页面
//        startActivity<MainActivity>(MyConstants.GO_JUMP to 3)
//    }
}
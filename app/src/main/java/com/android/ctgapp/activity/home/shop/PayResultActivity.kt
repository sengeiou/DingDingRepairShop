package com.android.ctgapp.activity.home.shop

import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.deal.OrderDetailActivity
import com.android.ctgapp.activity.mine.balance.CompanyBalanceActivity
import com.android.ctgapp.activity.mine.money.RechargeMoneyHistoryActivity
import com.android.ctgapp.activity.mine.whitebar.WhiteBarV2Activity
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.enum.OrderStatusEnum
import com.android.ctgapp.enum.PayFromEnum
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_pay_result.*
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 11/17/20
 *描述: 支付成功回调 页面
 */
class PayResultActivity : BaseActivity() {
    private val mViewModel: PayResultViewModel by lazy { ViewModelProvider(this)[PayResultViewModel::class.java] }

    //支付来源
    private var way = -1
    override fun event() {
        val price = "¥ ${BaseApplication.price}"
        val payWay = BaseApplication.payWay
        mPayPriceTV.text = price
        mOrderNumberTV.text = BaseApplication.orderNum
        mOrderTimeTV.text = BaseApplication.orderTime
        mPayWayTV.text = BaseApplication.payWay
        mPayPrice.text = price
        //判断付款来源 以发送给后端检测是否充值成功
        BaseApplication.currentPayFrom?.let { enum ->
            when (enum.name) {
                //来自订单
                PayFromEnum.ORDER.name -> {
                    //1挂账 2 微信+(代金券) 3支付宝+(代金券)   4 余额 +(代金券)
                    when (payWay) {
                        "微信" -> {
                            way = 2
                            mViewModel.afterPay(BaseApplication.orderId, way)
                        }
                        "支付宝" -> {
                            way = 3
                            mViewModel.afterPay(BaseApplication.orderId, way)
                        }
                    }
                }
                //来自个人充值
                PayFromEnum.TOP_UP_COMPANY.name -> {
                    mViewModel.checkResult()
                }
                //来自企业充值
                PayFromEnum.TOP_UP_COMPANY.name -> {
                    mViewModel.checkResult()
                }
                //来自联盟充值
                PayFromEnum.TOP_UP_COMPANY.name -> {
                    mViewModel.checkResult()
                }
                //来自订单中白条单独还款 确认还款成功
                PayFromEnum.WAIT_BAR_SINGLE.name -> {
                    mViewModel.whiteBarPayFinish(BaseApplication.orderId)
                }
                //来自白条批量还款 确认还款成功
                PayFromEnum.WAIT_BAR_MORE.name->{
                    //批量还款使用的是通用还款页面
//                    CommonPaySuccessActivity
                }
                PayFromEnum.TOP_UP_RECHARGE.name->{
                    mOrderNumberLL.visibility= View.INVISIBLE
                    mOrderTimeLL.visibility= View.INVISIBLE
                }
            }
        }

        mViewModel.whiteBarResult.observe(this, {
            val data = initData(it)
            if (data.status != 0) {
                mViewModel.whiteBarPayFinish(BaseApplication.orderId)
            }
        })


        mViewModel.afterPayResult.observe(this, {
            val data = initData(it)
            if (data.status != 0) {
                mViewModel.afterPay(BaseApplication.orderId, way)
            }
        })

        mViewModel.checkPayResult.observe(this, {
            val data = initData(it)
            if (data.status != 0) {
                mViewModel.checkResult()
            }
        })


    }

    override fun click() {
        mCheckOrderBTN.setOnClickListener {
            BaseApplication.currentPayFrom?.let { enum ->
                when (enum) {
                    //来自订单
                    PayFromEnum.ORDER -> {
//                        startActivity<OrderDetailActivity>(
//                            MyConstants.TYPE to OrderStatusEnum.WAIT_SEND.statusCode,
//                            MyConstants.ORDER_ID to BaseApplication.orderId
//                        )
                        startActivity<MainActivity>(MyConstants.GO_JUMP to 3)
                    }
                    //来自订单单独还款
                    PayFromEnum.WAIT_BAR_SINGLE -> {
                        startActivity<OrderDetailActivity>(
                            MyConstants.TYPE to BaseApplication.orderPay,
                            MyConstants.ORDER_ID to BaseApplication.orderId
                        )
                    }
                    //来自白条批量还款
                   PayFromEnum.WAIT_BAR_MORE->{
                       startActivity<WhiteBarV2Activity>()
                   }

                    //来自个人充值
                    PayFromEnum.TOP_UP_PERSON -> {

                    }
                    //来自企业充值
                    PayFromEnum.TOP_UP_COMPANY -> {
                        startActivity<CompanyBalanceActivity>()
                    }
                    //来自联盟充值
                    PayFromEnum.TOP_UP_UNION -> {

                    }
                    //充值储值卡
                    PayFromEnum.TOP_UP_RECHARGE->{
                        startActivity<RechargeMoneyHistoryActivity>()
                    }
                    else -> {

                    }
                }
                finish()
            }
        }
    }


    override fun getLayout() = R.layout.activity_pay_result


    override fun onBackPressed() {

    }

}
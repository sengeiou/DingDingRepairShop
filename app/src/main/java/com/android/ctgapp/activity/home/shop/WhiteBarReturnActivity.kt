package com.android.ctgapp.activity.home.shop

import android.os.Handler
import android.os.Message
import android.text.TextUtils
import androidx.lifecycle.ViewModelProvider
import com.alipay.sdk.app.PayTask
import com.android.ctgapp.activity.deal.CommonPaySuccessActivity
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityWhiteBarReturnBinding
import com.android.ctgapp.entity.ResultEntity
import com.android.ctgapp.entity.deal.WxPayEntity
import com.android.ctgapp.entity.mine.WhiteBarMorePayBean
import com.android.ctgapp.entity.mine.WhitePayResultEntity
import com.android.ctgapp.enum.PayFromEnum
import com.android.ctgapp.util.*
import com.android.ctgapp.util.pay.PayResult
import com.tencent.mm.opensdk.modelpay.PayReq
import com.tencent.mm.opensdk.openapi.IWXAPI
import com.tencent.mm.opensdk.openapi.WXAPIFactory
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2021/6/3
 *描述:白条还款支付 页面 收银台 页面
 */
class WhiteBarReturnActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityWhiteBarReturnBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private val mViewModel by lazy { ViewModelProvider(this)[WhiteBarReturnViewModel::class.java] }
    private var wxApi: IWXAPI? = null
    private val sdkPayFlag = 1

    //2微信  3支付宝
    private var currentPayType = -1
    override fun event() {
        //支付总金额
        val payMoney = intent.getStringExtra(MyConstants.TOTAL_MONEY)
        mBinding.mTotalPriceTV.text = payMoney

        mViewModel.error.observe(this, {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        //单独还款的回调 多个白条还款的在下面 单独还款是从订单页面进来的 多条还款是从白条页面提前还款进来的
        mViewModel.result.observe(this, {
            dismissLoading()
            MyLog.d("支付回调:$it")
            //单独还款
            BaseApplication.currentPayFrom = PayFromEnum.WAIT_BAR_SINGLE
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, ResultEntity::class.java)
                when (currentPayType) {
                    2 -> {
                        //微信
                        wxChatFrom = 3
                        BaseApplication.payWay = "微信"
                        MyLog.d("看看是你需要的么${data.data}")
                        val wxPayEntity = getGson().fromJson(data.data.handlerNull(), WxPayEntity::class.java)
                        //微信
                        wxApi = WXAPIFactory.createWXAPI(this, null)
                        wxApi?.registerApp(wxPayEntity.appid)
                        val request = PayReq()
                        request.appId = wxPayEntity.appid
                        globalWxAppId = wxPayEntity.appid.handlerNull()
                        request.partnerId = wxPayEntity.partnerid
                        request.prepayId = wxPayEntity.prepayid
                        request.packageValue = wxPayEntity.packageX
                        request.nonceStr = wxPayEntity.noncestr
                        request.timeStamp = wxPayEntity.timestamp
                        request.sign = wxPayEntity.sign
                        MyLog.d("吊起微信支付")
                        wxApi?.sendReq(request)
                    }
                    3 -> {
                        BaseApplication.payWay = "支付宝"
                        //吊起支付宝付款
                        val payRunnable = Runnable {
                            val aliPay = PayTask(this)
                            val result = aliPay.payV2(data.data.handlerNull().handlerNull(), true)
                            MyLog.d(result.toString())
                            val msg = Message()
                            msg.what = sdkPayFlag
                            msg.obj = result
                            mHandler.sendMessage(msg)
                        }
                        // 必须异步调用
                        val payThread = Thread(payRunnable)
                        payThread.start()
                    }
                }
            }
        })
        //多白条支付回调 单独还款是从订单页面进来的 多条还款是从白条页面提前还款进来的
        mViewModel.moreResult.observe(this, {
            dismissLoading()
            MyLog.d("多白条支付回调:$it")
            BaseApplication.currentPayFrom = PayFromEnum.WAIT_BAR_MORE
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, WhitePayResultEntity::class.java)
                when (currentPayType) {
                    2 -> {
                        //微信
                        wxChatFrom = 3
                        BaseApplication.payWay = "微信"
                        MyLog.d("看看是你需要的么${data.data}")
                        val wxPayEntity = getGson().fromJson(data.data?.orderInfo.handlerNull(), WxPayEntity::class.java)
                        //微信
                        wxApi = WXAPIFactory.createWXAPI(this, null)
                        wxApi?.registerApp(wxPayEntity.appid)
                        val request = PayReq()
                        request.appId = wxPayEntity.appid
                        globalWxAppId = wxPayEntity.appid.handlerNull()
                        request.partnerId = wxPayEntity.partnerid
                        request.prepayId = wxPayEntity.prepayid
                        request.packageValue = wxPayEntity.packageX
                        request.nonceStr = wxPayEntity.noncestr
                        request.timeStamp = wxPayEntity.timestamp
                        request.sign = wxPayEntity.sign
                        MyLog.d("吊起微信支付")
                        wxApi?.sendReq(request)
                    }
                    3 -> {
                        BaseApplication.payWay = "支付宝"
                        //吊起支付宝付款
                        val payRunnable = Runnable {
                            val aliPay = PayTask(this)
                            val result = aliPay.payV2(data.data?.orderInfo.handlerNull().handlerNull(), true)
                            MyLog.d(result.toString())
                            val msg = Message()
                            msg.what = sdkPayFlag
                            msg.obj = result
                            mHandler.sendMessage(msg)
                        }
                        // 必须异步调用
                        val payThread = Thread(payRunnable)
                        payThread.start()
                    }
                }
            }
        })
    }

    @Suppress("UNCHECKED_CAST")
    private val mHandler = Handler {
        if (it.what == sdkPayFlag) {
            val payResult = PayResult(it.obj as Map<String?, String?>)

            /**
             * 对于支付结果，请商户依赖服务端的异步通知结果。同步通知结果，仅作为支付结束的通知。
             */
            /**
             * 对于支付结果，请商户依赖服务端的异步通知结果。同步通知结果，仅作为支付结束的通知。
             */

//            val resultInfo: String = payResult.result // 同步返回需要验证的信息

            val resultStatus: String = payResult.resultStatus
            // 判断resultStatus 为9000则代表支付成功
            if (TextUtils.equals(resultStatus, "9000")) {
                // 该笔订单是否真实支付成功，需要依赖服务端的异步通知。
                MyLog.d("支付成功:${payResult}")
                //这里使用通用还款成功页面 内涵批量还款成功后的校验接口
                if (BaseApplication.currentPayFrom == PayFromEnum.WAIT_BAR_MORE) {
                    startActivity<CommonPaySuccessActivity>()
                } else {
                    startActivity<PayResultActivity>()
                }
            } else {
                // 该笔订单真实的支付结果，需要依赖服务端的异步通知。
                MyLog.d("支付失败:${payResult}")
            }
        }
        true
    }

    override fun click() {
        val orderId = intent.getStringExtra(MyConstants.ORDER_ID).handlerNull()

        //微信支付
        mBinding.mWeChatLL.setOnClickListener {
            mBinding.mWeChatCB.performClick()
        }
        mBinding.mWeChatCB.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                currentPayType = 2
                mBinding.mAliPayCB.isChecked = false
            }
        }

        //支付宝
        mBinding.mAliPayLL.setOnClickListener {
            mBinding.mAliPayCB.performClick()
        }
        mBinding.mAliPayCB.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                currentPayType = 3
                mBinding.mWeChatCB.isChecked = false
            }
        }
        //确认支付
        mBinding.mConfirmPayBTN.setOnClickListener {
            if (!mBinding.mWeChatCB.isChecked && !mBinding.mAliPayCB.isChecked) {
                showToast("请至少选择一种支付方式")
            } else {
                //有orderID则为单独支付没有OrderId则为批量支付
                if (orderId.isNotEmpty()) {
                    mViewModel.whiteBarReturnSingle(orderId, currentPayType)
                } else {
                    val bean = WhiteBarMorePayBean()
                    bean.repayWay = currentPayType
                    val beanList = ArrayList<WhiteBarMorePayBean.Data>()
                    BaseApplication.mWhiteBarAllBean.forEach { parentBean ->
                        BaseApplication.mWhiteBarSelectOrderNO.forEach { childBean ->
                            if (parentBean.orderNo == childBean) {
                                beanList.add(parentBean)
                            }
                        }
                    }
                    bean.data = beanList
                    MyLog.d("秀秀秀:${getGson().toJson(bean)}")
                    mViewModel.whiteBarReturnMore(bean)
                }
            }
        }
    }
}
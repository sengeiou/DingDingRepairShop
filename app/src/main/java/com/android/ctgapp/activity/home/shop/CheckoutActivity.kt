package com.android.ctgapp.activity.home.shop

import android.os.CountDownTimer
import android.os.Handler
import android.os.Message
import android.text.TextUtils
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.alipay.sdk.app.PayTask
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.mine.money.MyMoneyPackageViewModel
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityCheckFlowBinding
import com.android.ctgapp.databinding.ActivityCheckstandBinding
import com.android.ctgapp.entity.CouponAllEntity
import com.android.ctgapp.entity.deal.ContinueToPayBean
import com.android.ctgapp.entity.deal.OrderDetailEntity
import com.android.ctgapp.entity.deal.WxPayEntity
import com.android.ctgapp.entity.home.CreateOrderBean
import com.android.ctgapp.entity.home.CreateOrderResultEntity
import com.android.ctgapp.entity.mine.StoredCardEntity
import com.android.ctgapp.enum.PayFromEnum
import com.android.ctgapp.event.HomeFragmentRefresh
import com.android.ctgapp.util.*
import com.android.ctgapp.util.pay.PayResult
import com.tencent.mm.opensdk.modelpay.PayReq
import com.tencent.mm.opensdk.openapi.IWXAPI
import com.tencent.mm.opensdk.openapi.WXAPIFactory
import kotlinx.android.synthetic.main.activity_checkstand.*
import org.greenrobot.eventbus.EventBus
import org.jetbrains.anko.isSelectable
import org.jetbrains.anko.startActivity
import java.math.BigDecimal

/**
 *作者:LiBW
 *创建日期: 2020/11/10
 *描述: 收银台 页面
 */
class CheckoutActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityCheckstandBinding.inflate(layoutInflater) }
    private val mStoredCardViewModel: MyMoneyPackageViewModel by lazy { ViewModelProvider(this)[MyMoneyPackageViewModel::class.java] }
    override fun getLayout() = mBinding.root
    private val counponBean: String by lazy { intent.getStringExtra(MyConstants.COUPON_ENTITY) }
    private var entity: CreateOrderBean? = null

    private val sdkPayFlag = 1

    //1挂账 2 微信+(代金券) 3支付宝+(代金券)   4 余额 +(代金券)
    private var currentPayType = -1
    private var timer: CountDownTimer? = null
    private var storedCardLeft=BigDecimal("0")//储值卡剩余金额
    //继续支付实体类
    private var continuePayEntity: OrderDetailEntity.DataBean? = null

    private val mViewModel: CheckoutViewModel by lazy { ViewModelProvider(this)[CheckoutViewModel::class.java] }
    private var wxApi: IWXAPI? = null
    private var needPayTotal=BigDecimal("0")
    private var storeCash=BigDecimal("0")
    override fun event() {
        //mCardPaySW.setClickable(false)
        val  money=intent.getStringExtra(MyConstants.White_Money).handlerNull()
        val companyid=intent.getStringExtra(MyConstants.COMPANY_ID).handlerNull()
        mStoredCardViewModel.getStoredCardAmount(companyId = companyid,clientId = BaseApplication.companyId.handlerNull())
        //-1位标志位 上层表示ERP下单不允许使用白条
        val bar=if (money=="-1"){
            "白条支付"
        }else{
            "白条支付(可用额度${money}元)"
        }
//        val bar="白条支付"
        mWhiteBarTV.text=bar
        //是否支持挂账 展示挂账菜单
        mCreditPayLL.visibility = if (intent.getBooleanExtra(MyConstants.SUPPORT_CREDIT, false)) View.VISIBLE else View.GONE
        val entityString = intent.getStringExtra(MyConstants.ENTITY)

        entityString?.let {
            MyLog.d("确认订单过来的bean:$it")
            entity = getGson().fromJson(it, CreateOrderBean::class.java)
        }

        MyLog.d("过来的价格:${intent.getStringExtra(MyConstants.PRICE)}")
        mTotalPriceTV.text = intent.getStringExtra(MyConstants.PRICE)
        if(mTotalPriceTV.text.handlerNull().equals("")){

        }else{
            needPayTotal= BigDecimal(mTotalPriceTV.text.handlerNull())
        }
        mStoredCardViewModel.getStoredCardAmountResult.observe(this,{
            MyLog.d("储值卡返回:$it")
            val storedCardEntity= getGson().fromJson(it, StoredCardEntity::class.java).data
            if(storedCardEntity.id.handlerNull().equals("")){
                mCardPayLL.visibility=View.INVISIBLE
            }
            storedCardLeft= BigDecimal(storedCardEntity.totalAmount.handlerNull()).plus(storeCash)//从订单过来的加上订单里的余额
            mCardPayTV.text="(余额:￥${storedCardLeft})"
            if(storedCardLeft== BigDecimal("0")){
                mCardPaySW.setClickable(false)
            }
        })
        //是否为继续支付订单
        val continueToPay = intent.getStringExtra(MyConstants.CONTINUE_TO_PAY)
        continueToPay?.let {
            //继续支付
            continuePayEntity = getGson().fromJson(it, OrderDetailEntity::class.java).data
            //继续支付展示倒计时
            MyLog.d("继续支付实体类:$it")
            continuePayEntity!!.ctgOrderPay!!.storeCash.handlerDoubleNull()
//            if(continuePayEntity!!.ctgOrderPay!!.storeCash==null){
//                storeCash= 0.0
//            }else{
//                storeCash= continuePayEntity!!.ctgOrderPay!!.storeCash!!
//            }

            mTimeCountLL.visibility = View.VISIBLE
            val time = continuePayEntity!!.expirationTime!!
            showTime(time)
            needPayTotal= BigDecimal(continuePayEntity!!.actuallyPrice.handlerNull())
            mTotalPriceTV.text = needPayTotal.handlerNull()
            BaseApplication.orderId = continuePayEntity!!.orderId.handlerNull()
            BaseApplication.orderNum = continuePayEntity!!.orderNo.handlerNull()
            BaseApplication.orderTime = continuePayEntity!!.createTime.handlerNull()
            BaseApplication.price = continuePayEntity!!.actuallyPrice.handlerNull()
        }

        mViewModel.error.observe(this, {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.createOrderResult.observe(this, {
            loading.dismiss()
            MyLog.d("创建订单回调:$it")
            //计算实际支付总金额
            var realPay: BigDecimal
            when {
                entity!=null->{
                    realPay= BigDecimal(entity!!.totalPrice.handlerNull())
                    realPay=realPay.subtract(BigDecimal(entity!!.orders?.get(0)?.storeCash.handlerNull())).subtract(BigDecimal(entity!!.orders?.get(0)?.voucherCash.handlerNull()))
                    BaseApplication.price=realPay.handlerNull()
                }

                continuePayEntity!=null->{
                    realPay= BigDecimal(continuePayEntity!!.totalPrice.handlerNull())
                    realPay=realPay.subtract(BigDecimal(continuePayEntity!!.ctgOrderPay?.storeCash.handlerNull())).subtract(BigDecimal(continuePayEntity!!.ctgOrderPay?.voucherCash.handlerNull()))
                    BaseApplication.price=realPay.handlerNull()
                }
            }
            //订单创建成功了 通知首页刷新热销商品
            EventBus.getDefault().post(HomeFragmentRefresh(1))

            //支付来源设置为订单
            BaseApplication.currentPayFrom = PayFromEnum.ORDER
            val data = getGson().fromJson(it, CreateOrderResultEntity::class.java)

            if (data.status == 0) {
//

                data?.data?.orders?.forEach { order ->
                    BaseApplication.orderId = order.orderId.handlerNull()
                    BaseApplication.orderNum = order.orderNo.handlerNull()
                    BaseApplication.orderTime = order.ctgOrderPay?.createTime.handlerNull()
                }

                when (currentPayType) {
                    1 -> {
                        showToast("挂账成功")
                        startActivity<MainActivity>(MyConstants.GO_JUMP to 3)
                    }
                    2 -> {
                        wxChatFrom = 1
                        BaseApplication.payWay = "微信"
                        //开始微发起微信支付
                        val wxPayEntity = getGson().fromJson(data.data?.orderInfo, WxPayEntity::class.java)
                        //微信
                        wxApi = WXAPIFactory.createWXAPI(this, null)
                        wxApi?.registerApp(wxPayEntity.appid)
                        MyLog.d("appid是啥:${wxPayEntity.appid}")
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
                        MyLog.d("是空的么:${wxApi == null}")
                        wxApi?.sendReq(request)
                    }
                    3 -> {
                        BaseApplication.payWay = "支付宝"
                        //吊起支付宝付款
                        val payRunnable = Runnable {
                            val aliPay = PayTask(this)
                            val result = aliPay.payV2(data.data?.orderInfo.handlerNull(), true)
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
                    7 ->{
                        BaseApplication.payWay = "储值卡"
                        showToast(data.msg)
                        startActivity<PayResultActivity>()
                    }
                }

            } else {
                showToast(data.msg)
                data.data?.let {
                   if ( it.submit==true){
                       startActivity<MainActivity>(MyConstants.GO_JUMP to 3)
                   }
                }
            }
        })
        mViewModel.currentPayResult.observe(this, {
            dismissLoading()
            MyLog.d("继续支付重新付款:$it")
            //TODO
            //支付来源设置为订单
            BaseApplication.currentPayFrom = PayFromEnum.ORDER
            handlerHttpResult(it) {
                if (currentPayType == 1) {
                    showToast("挂账成功")
                    startActivity<MainActivity>(MyConstants.GO_JUMP to 3)
                }


                val data = getGson().fromJson(it, CreateOrderResultEntity::class.java)
                data?.data?.orders?.forEach { order ->
                    BaseApplication.orderId = order.orderId.handlerNull()
                    BaseApplication.orderNum = order.orderNo.handlerNull()
                    BaseApplication.orderTime = order.ctgOrderPay?.createTime.handlerNull()
                }

                when (currentPayType) {
                    2 -> {
                        //微信
                        wxChatFrom = 1
                        BaseApplication.payWay = "微信"
                        val wxPayEntity = getGson().fromJson(data.data?.orderInfo, WxPayEntity::class.java)
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
                            val result = aliPay.payV2(data.data?.orderInfo.handlerNull(), true)
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
                    7 ->{
                        showToast(data.msg)
                        startActivity<PayResultActivity>()
                    }
                }
            }
        })
    }

    private fun showTime(time: Int) {
        MyLog.d("时间:$time")
        if (time < 0) {
            mTimeCountTV.text = "已超时"
            mPayButtonRL.visibility = View.GONE
        } else {
            timer = object : CountDownTimer(time * 1000L, 1000) {
                override fun onFinish() {
                    mTimeCountTV.text = "已超时"
                }

                override fun onTick(millisUntilFinished: Long) {
                    val mTime = millisUntilFinished / 1000
                    val second = mTime % 60
                    val minute = mTime / 60
                    val minuteShow = if (minute < 10) "0$minute" else "$minute"
                    val secondShow = if (second < 10) "0$second" else "$second"
                    val showTime = "00:$minuteShow:$secondShow"
                    mTimeCountTV.text = showTime
                }
            }.start()

        }
    }

    @Suppress("UNCHECKED_CAST")
    private val mHandler = Handler {
        if (it.what == sdkPayFlag) {
            val payResult = PayResult(it.obj as Map<String?, String?>)

            /**
             * 对于支付结果，请商户依赖服务端的异步通知结果。同步通知结果，仅作为支付结束的通知。
             */
//            val resultInfo: String = payResult.result // 同步返回需要验证的信息

            val resultStatus: String = payResult.resultStatus
            // 判断resultStatus 为9000则代表支付成功
            if (TextUtils.equals(resultStatus, "9000")) {
                // 该笔订单是否真实支付成功，需要依赖服务端的异步通知。
                MyLog.d("支付成功:${payResult}")
                startActivity<PayResultActivity>()
            } else {
                // 该笔订单真实的支付结果，需要依赖服务端的异步通知。
                MyLog.d("支付失败:${payResult}")
            }
        }
        true
    }

    override fun click() {
        mCardPaySW.setOnCheckedChangeListener { button, b ->
            if(b){
                currentPayType=7
                mCreditPayCB.setChecked(false)
                mCreditPayCB.setEnabled(false)
                if(needPayTotal!!<storedCardLeft){
                    mAliPayCB.setChecked(false)
                    mWeChatCB.setChecked(false)
                    mTotalPriceTV.text=0.00.handlerNull()
                }else{
                    mTotalPriceTV.text=(needPayTotal-storedCardLeft).handlerNull()
                }
            }else{
                mTotalPriceTV.text=needPayTotal.handlerNull()
                mCreditPayCB.setEnabled(true)
            }

        }

//        mCreditPayCB.setOnCheckedChangeListener { button, b ->
//            if(b){
//                mCardPaySW.setChecked(false)
//                mCardPaySW.setEnabled(false)
//            }else{
//                mCardPaySW.setEnabled(true)
//            }
//        }

        //确认支付
        mConfirmPayBTN.setOnClickListener {
            if (mTimeCountTV.text.handlerNull() == "已超时") {
                showToast("该笔订单已经超时,请重新下单")
                return@setOnClickListener
            }
            if (!mWeChatCB.isChecked && !mAliPayCB.isChecked && !mCreditPayCB.isChecked&& !mCardPaySW.isChecked) {
                showToast("请至少选择一种支付方式")
            }
            else if(mCardPaySW.isChecked){
                if(needPayTotal!!<=storedCardLeft){
                   startpay()
                }
                //需要组合支付
                else{
                    if(mWeChatCB.isChecked){
                        startpay()
                    }else if(mAliPayCB.isChecked){
                        startpay()
                    }else{
                        showToast("储值卡余额不足，请再选择一种支付方式")
                    }
                }
            }
            else {
                startpay()
            }
        }
        //微信支付
        mWeChatLL.setOnClickListener {
            mWeChatCB.performClick()
        }
        mWeChatCB.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                currentPayType = 2
                mAliPayCB.isChecked = false
                mCreditPayCB.isChecked = false
                if(needPayTotal!!<storedCardLeft){
                    mCardPaySW.setChecked(false)
                }
//                if(mCardPaySW.isChecked){
//                   //组合支付
//
//                }else{
//                    currentPayType = 2
//                }
            }
        }


        //支付宝
        mAliPayLL.setOnClickListener {
            mAliPayCB.performClick()

        }

        mAliPayCB.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                currentPayType = 3
                mWeChatCB.isChecked = false
                mCreditPayCB.isChecked = false
                if(needPayTotal!!<storedCardLeft){
                    mCardPaySW.setChecked(false)
                }
            }
        }
        //挂账
        mCreditPayLL.setOnClickListener {
            mCreditPayCB.performClick()
        }
        mCreditPayCB.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                currentPayType = 1
                mWeChatCB.isChecked = false
                mAliPayCB.isChecked = false
            }
        }
    }

    private fun startpay(){
        when {

            entity != null -> {
                entity!!.payWay = currentPayType
                loading.show()
                if(mCardPaySW.isChecked){
                    if(needPayTotal!!<storedCardLeft){
                        entity!!.orders?.get(0)?.storeCash=needPayTotal.handlerNull()
                    }
                    //需要组合支付
                    else{
                        entity!!.orders?.get(0)?.storeCash=storedCardLeft.handlerNull()
                    }
                }
                //voucherId 代金券id    voucherCash代金券金额  storeCash 存值卡金额
                mViewModel.createOrder(entity!!)
            }
            continuePayEntity != null -> {
                val bean = ContinueToPayBean()
                MyLog.d("orderID:${continuePayEntity!!.orderId}")
                MyLog.d("orderNo:${continuePayEntity!!.orderNo}")
                bean.orderId = continuePayEntity!!.orderId.handlerNull()
                bean.orderNo = continuePayEntity!!.orderNo.handlerNull()
                bean.indentFrom = 1
                bean.payWay = currentPayType
                bean.isNeedChangeReceiverInfo = 0
                bean.province = continuePayEntity!!.province.handlerNull()
                bean.city = continuePayEntity!!.city.handlerNull()
                bean.district = continuePayEntity!!.district.handlerNull()
                bean.address = continuePayEntity!!.address.handlerNull()
                bean.telephone = continuePayEntity!!.telephone.handlerNull()
                bean.receiverName = continuePayEntity!!.receiverName.handlerNull()
                bean.isNeedChangeRemark = 0
                bean.remark = continuePayEntity!!.remark.handlerNull()
                if(mCardPaySW.isChecked){
                    if(needPayTotal!!<storedCardLeft){
                        bean!!.storeCash=needPayTotal.toDouble()
                    }
                    //需要组合支付
                    else{
                        bean!!.storeCash=storedCardLeft.toDouble()
                    }
                }

                loading.show()
                showLoading()
                mViewModel.continueToPay(bean)
            }
            else -> {
                showToast("支付异常,请稍后再试")
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        timer?.cancel()
        mHandler.removeCallbacksAndMessages(null)
    }


}
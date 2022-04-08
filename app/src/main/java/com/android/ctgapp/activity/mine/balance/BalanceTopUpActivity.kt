package com.android.ctgapp.activity.mine.balance

import android.os.Handler
import android.os.Message
import android.text.TextUtils
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.alipay.sdk.app.PayTask
import com.android.ctgapp.R
import com.android.ctgapp.activity.home.shop.PayResultActivity
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.entity.deal.WxPayEntity
import com.android.ctgapp.entity.home.TopUpBalanceApplyEntity
import com.android.ctgapp.enum.PayFromEnum
import com.android.ctgapp.util.*
import com.android.ctgapp.util.pay.PayResult
import com.tencent.mm.opensdk.modelpay.PayReq
import com.tencent.mm.opensdk.openapi.IWXAPI
import com.tencent.mm.opensdk.openapi.WXAPIFactory
import kotlinx.android.synthetic.main.activity_balance_top_up.*
import okhttp3.MediaType
import okhttp3.RequestBody
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 12/28/20
 *描述: 余额充值 页面
 */
class BalanceTopUpActivity : BaseActivity() {
    private val mViewModel: BalanceTopUpViewModel by lazy { ViewModelProvider(this)[BalanceTopUpViewModel::class.java] }
    private var preMoney = ""
    private val sdkPayFlag = 1
    private var preEdit = ""
    private var wxApi: IWXAPI? = null
    // 1为微信支付 2为阿里支付
    private var currentPayType = -1


    override fun event() {
        mViewModel.error.observe(this, Observer {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.applyResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("提交申请:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, TopUpBalanceApplyEntity::class.java).data
                data?.let { item ->
                    //支付来源设置为企业充值
                    BaseApplication.currentPayFrom= PayFromEnum.TOP_UP_COMPANY
                    //充值订单号 充值回调后需要调用 薛亮的接口
                    globalCashChangeNo = data.cashChangeNo.handlerNull()
                    val info = item.orderInfo.handlerNull()
                    when (currentPayType) {
                        //微信支付
                        1 -> {
                            wxChatFrom = 2
                            BaseApplication.payWay = "微信"
                            BaseApplication.orderNum = item.cashChangeNo.handlerNull()
                            BaseApplication.price = item.cashChange.handlerNull()
                            BaseApplication.orderTime = item.changeTime.handlerNull()
                            val wxPayEntity = getGson().fromJson(item.orderInfo, WxPayEntity::class.java)
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
                        //支付宝支付
                        2 -> {
                            BaseApplication.orderNum = item.cashChangeNo.handlerNull()
                            BaseApplication.price = item.cashChange.handlerNull()
                            BaseApplication.payWay = "支付宝"
                            BaseApplication.orderTime = item.changeTime.handlerNull()
                            //吊起支付宝付款
                            val payRunnable = Runnable {
                                val aliPay = PayTask(this)
                                val result = aliPay.payV2(info, true)
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
                        else->{

                        }
                    }
                }
            }
        })

    }

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
                showToast("充值成功")
                startActivity<PayResultActivity>()
                finish()

            } else {
                // 该笔订单真实的支付结果，需要依赖服务端的异步通知。
                MyLog.d("支付失败:${payResult}")
                showToast("支付失败,请稍后再试")
            }
        }
        true
    }

    override fun click() {
        mMoney1.setOnClickListener {
            handlerClick("1000")
        }
        mMoney2.setOnClickListener {
            handlerClick("2000")
        }
        mMoney3.setOnClickListener {
            handlerClick("3000")
        }
        mMoney5.setOnClickListener {
            handlerClick("5000")
        }
        mMoney8.setOnClickListener {
            handlerClick("8000")
        }
        mMoney10.setOnClickListener {
            handlerClick("10000")
        }
        //手动输入
        mCurrentMoneyET.handlerText {
            //.后只保留两位
            //判断是否包含.
            if ("." in it) {
                //只保留后两位
                val strEnd = it.split(".")[1]
                if (strEnd.length == 3) {
                    mCurrentMoneyET.textSet(preEdit)
                    mCurrentMoneyET.setSelection(preEdit.length)
                    return@handlerText
                }
                //限制指针到.前方继续输入0
                val strStart = it.split(".")[0]
                if (strStart.startsWith("0") && strStart.length >= 2) {
                    mCurrentMoneyET.textSet(preEdit)
                    mCurrentMoneyET.setSelection(1)
                    return@handlerText
                }
            }


            //限制直接输入.
            when {
                it.startsWith(".") -> mCurrentMoneyET.textSet(preEdit)
                //禁止两位数都是0
                it.length == 2 && it == "00" -> {
                    mCurrentMoneyET.textSet("0")
                    mCurrentMoneyET.setSelection(1)
                }


                else -> {
                    preEdit = it
                    handlerClick(it, false)
                }
            }
        }

        //微信支付
        mWeChatLL.setOnClickListener {
            MyLog.d("点击微信")
            mWeChatCB.performClick()
        }

        mWeChatCB.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                currentPayType = 1
                mAliPayCB.isChecked = false
            }
        }

        //支付宝
        mAliPayLL.setOnClickListener {
            MyLog.d("点击支付宝")
            mAliPayCB.performClick()
        }
        mAliPayCB.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                currentPayType = 2
                mWeChatCB.isChecked = false
            }
        }
        //确认充值
        mConfirmBTN.setOnClickListener {
            val mMoney = mCurrentMoneyET.text.handlerNull()
            when {
                !mAliPayCB.isChecked && !mWeChatCB.isChecked -> showToast("请至少选择一种支付方式")
                mMoney.isEmpty() || mMoney == "0" -> showToast("请输入充值金额")
                mMoney.endsWith(".") -> showToast("请输入完成金额")
                mMoney.endsWith(".00") -> showToast("输入的格式有误")
                mMoney.endsWith(".0") -> showToast("输入的格式有误")
                else -> {
                    val map = HashMap<String, Any>()
                    map["myCompanyId"] = BaseApplication.companyId

                    map["allianceId"] = BaseApplication.allianceId


                    map["type"] = 3
                    map["cashChange"] = mMoney.toDouble()
                    map["rechargeType"] = currentPayType
                    map["changgePersonId"] = BaseApplication.userId
                    map["cashChangeCategory"] = 1
                    val body = RequestBody.create(
                        MediaType.parse("application/json; charset=utf-8"),
                        getGson().toJson(map)
                    )
                    mViewModel.applyPay(body)
                }
            }
        }
    }

    private fun handlerClick(money: String, fromButton: Boolean = true) {
        when (preMoney) {
            "1000" -> {
                mMoney1.backgroundResource = R.drawable.bg_btn_gray_border_3
                mMoney1.textColorResource = R.color.black_text
            }
            "2000" -> {
                mMoney2.backgroundResource = R.drawable.bg_btn_gray_border_3
                mMoney2.textColorResource = R.color.black_text
            }
            "3000" -> {
                mMoney3.backgroundResource = R.drawable.bg_btn_gray_border_3
                mMoney3.textColorResource = R.color.black_text

            }
            "5000" -> {
                mMoney5.backgroundResource = R.drawable.bg_btn_gray_border_3
                mMoney5.textColorResource = R.color.black_text
            }
            "8000" -> {
                mMoney8.backgroundResource = R.drawable.bg_btn_gray_border_3
                mMoney8.textColorResource = R.color.black_text
            }
            "10000" -> {
                mMoney10.backgroundResource = R.drawable.bg_btn_gray_border_3
                mMoney10.textColorResource = R.color.black_text
            }
        }
        when (money) {
            "1000" -> {
                mMoney1.backgroundResource = R.drawable.bg_btn_red_border_3
                mMoney1.textColorResource = R.color.red_start
                preMoney = money
            }
            "2000" -> {
                mMoney2.backgroundResource = R.drawable.bg_btn_red_border_3
                mMoney2.textColorResource = R.color.red_start
                preMoney = money
            }
            "3000" -> {
                mMoney3.backgroundResource = R.drawable.bg_btn_red_border_3
                mMoney3.textColorResource = R.color.red_start
                preMoney = money
            }
            "5000" -> {
                mMoney5.backgroundResource = R.drawable.bg_btn_red_border_3
                mMoney5.textColorResource = R.color.red_start
                preMoney = money
            }
            "8000" -> {
                mMoney8.backgroundResource = R.drawable.bg_btn_red_border_3
                mMoney8.textColorResource = R.color.red_start
                preMoney = money
            }
            "10000" -> {
                mMoney10.backgroundResource = R.drawable.bg_btn_red_border_3
                mMoney10.textColorResource = R.color.red_start
                preMoney = money
            }
        }
        if (fromButton) {
            mCurrentMoneyET.textSet(money)
            mCurrentMoneyET.setSelection(mCurrentMoneyET.text.handlerNull().length)
        }
    }



    override fun onDestroy() {
        super.onDestroy()
        mHandler.removeCallbacksAndMessages(null)
    }

    override fun getLayout() = R.layout.activity_balance_top_up

}
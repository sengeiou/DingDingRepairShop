package com.android.ctgapp.activity.mine.money

import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.text.InputType
import android.text.TextUtils
import android.view.View
import androidx.core.text.set
import androidx.lifecycle.ViewModelProvider
import com.alipay.sdk.app.PayTask
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.home.shop.PayResultActivity
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityMyMoneyPackgeBinding
import com.android.ctgapp.databinding.ActivityRechargeCommitBinding
import com.android.ctgapp.entity.ResultEntity
import com.android.ctgapp.entity.deal.WxPayEntity
import com.android.ctgapp.entity.mine.JiaoYiLiuShuiEntity
import com.android.ctgapp.entity.mine.WhiteBarMorePayBean
import com.android.ctgapp.enum.PayFromEnum
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.util.*
import com.android.ctgapp.util.pay.PayResult
import com.tencent.mm.opensdk.modelpay.PayReq
import com.tencent.mm.opensdk.openapi.IWXAPI
import com.tencent.mm.opensdk.openapi.WXAPIFactory
import okhttp3.MediaType
import okhttp3.RequestBody
import okhttp3.ResponseBody
import org.jetbrains.anko.startActivity
import java.util.HashMap

class RechargeCommitActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityRechargeCommitBinding.inflate(layoutInflater) }
    private val money: String by lazy { intent.getStringExtra("Money")}
    private val activityid: Int by lazy { intent.getIntExtra("ActivityId",-1)}
    private var wxApi: IWXAPI? = null
    private val sdkPayFlag = 1
    var count:Int=0//确认回复次数
    private val mViewModel: MyMoneyPackageViewModel by lazy { ViewModelProvider(this)[MyMoneyPackageViewModel::class.java] }
    //2微信  3支付宝
    private var currentPayType = -1
    override fun getLayout() = mBinding.root
    val map=HashMap<String,Any>()
    private var myReceiver:MyReceiver?=null
    private var intentFilter:IntentFilter?=null
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
                    val body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), getGson().toJson(map))
                    mViewModel.RechargeConfirm(body)
                //startActivity<PayResultActivity>()
            } else {
                // 该笔订单真实的支付结果，需要依赖服务端的异步通知。
                MyLog.d("支付失败:${payResult}")
            }
        }
        true
    }
    override fun event() {
        myReceiver = MyReceiver()
        intentFilter = IntentFilter()
        intentFilter!!.addAction(MyConstants.WXPAY_RESULT)
        registerReceiver(myReceiver, intentFilter)

        //设置输入金额两位小数
        mBinding.mTotalPriceTV.filters = arrayOf(MoneyInputFilter())
        if(money.isEmpty()||money.equals("")){
            mBinding.mTotalPriceTV.setEnabled(true)
        }else{
            mBinding.mTotalPriceTV.setText(money.handlerNull())
        }
        mViewModel.result.observe(this,{
            MyLog.d("流水回调:$it")
            val data = getGson().fromJson(it, ResultEntity::class.java)

            data.data.let {

                map["outTradeNo"]=it.handlerNull()
                val totalFees=mBinding.mTotalPriceTV.text.handlerNull().split(".")
//                if(totalFees.size>1){
//                    if(totalFees[1].isEmpty()){
//                        map["totalFee"]=totalFees[0].toDouble()
//                    }else{
//                        map["totalFee"]= totalFees[0].toDouble()+totalFees[1].handlerNull().toDouble()*0.1
//                    }
//                }else{
//                    map["totalFee"]=mBinding.mTotalPriceTV.text.handlerNull().toDouble()
//                }
                map["totalFee"]=if(totalFees.size>1&&totalFees[1].isEmpty()){totalFees[0].toDouble()}else{mBinding.mTotalPriceTV.text.handlerNull().toDouble()}
                //map["totalFee"]=mBinding.mTotalPriceTV.text.handlerNull()
                //"payWay": "3",
                //	"allianceId": "",
                //	"companyId": "888897291"
                map["payWay"]=currentPayType
                //map["allianceId"]=currentPayType
                map["companyId"]=BaseApplication.supplyCompanyId
                val body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), getGson().toJson(map))
                mViewModel.RechargeSerial(body)
            }
        })
        mViewModel.orderResult.observe(this,{
            MyLog.d("充值回调:$it")
            BaseApplication.price = mBinding.mTotalPriceTV.text.handlerNull()
            BaseApplication.payWay=currentPayType.handlerNull()
            BaseApplication.currentPayFrom = PayFromEnum.TOP_UP_RECHARGE
            val data = getGson().fromJson(it, ResultEntity::class.java)
            data.data.let {
                when (currentPayType) {
                    1 -> {
                        showToast("挂账成功")
                        startActivity<MainActivity>(MyConstants.GO_JUMP to 3)
                    }
                    2 -> {
                        wxChatFrom = 4//储值卡充值
                        BaseApplication.payWay = "微信"
                        //开始微发起微信支付
                        val wxPayEntity = getGson().fromJson(data.data.handlerNull(), WxPayEntity::class.java)
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
                            val result = aliPay.payV2(data.data?.handlerNull(), true)
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
        mViewModel.rechargeConfirmResult.observe(this,{
            val data = getGson().fromJson(it, ResultEntity::class.java)
            if(data.data == true){
                count=0
                showToast("支付成功")
                finish()
            }else{
                count++
                if(count==5){
                    showToast("支付错误")
                }else{
                    val body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), getGson().toJson(map))
                    mViewModel.RechargeConfirm(body)
                }
            }

        })
    }
    val liushuiListener = object : ObserverListener {
        override fun onNext(t: ResponseBody) {
//            binding.mRefresh.over()
//            loading.dismiss()
            val str = t.string().handlerNull()
            MyLog.d("交易流水回调:$str")
//            handlerHttpResult(str) {
//                val data = getGson().fromJson(str, JiaoYiLiuShuiEntity::class.java).data
//                data?.records?.let { list ->
//                    if (page == 1) mList.clear()
//                    mList.addAll(list)
//                    mAdapter.notifyDataSetChanged()
//                }
//            }
        }

        override fun onError(error: String) {
           // binding.mRefresh.over()
            loading.dismiss()
            showToast(error)
        }
    }

    override fun onDestroy() {
        unregisterReceiver(myReceiver)
        super.onDestroy()
    }

    override fun click() {
        //val orderId = intent.getStringExtra(MyConstants.ORDER_ID).handlerNull()

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

            if(mBinding.mTotalPriceTV.text.isEmpty()){
                showToast("请输入充值金额")
            }
            else if (!mBinding.mWeChatCB.isChecked && !mBinding.mAliPayCB.isChecked) {
                showToast("请至少选择一种支付方式")
            } else {
//                val map: MutableMap<String, Any> = HashMap()
//                val body = RequestBody.create(
//                    MediaType.parse("application/json; charset=utf-8"),
//                    getGson().toJson(map)
//                )

//                ApiMethods.MakeRechargeSerial(MyObserver(liushuiListener), handlerBody(
//                    "supplyCompanyId" to BaseApplication.clientCompanyId,
//                    "clientCompanyId" to BaseApplication.supplyCompanyId,
//                    "activityId" to BaseApplication.activityId,
//                    "amount" to mBinding.mTotalPriceTV.text.handlerNull(),
//                    "userId" to BaseApplication.userId,
//                    "payWay" to if(currentPayType==3)1 else currentPayType,
//                    "remark" to ""
//                ))
                val map=HashMap<String,Any>()
                map["supplyCompanyId"]=BaseApplication.supplyCompanyId
                map["clientCompanyId"]=BaseApplication.clientCompanyId
                map["activityId"]=if(activityid==-1)"" else activityid
                val amounts=mBinding.mTotalPriceTV.text.handlerNull().split(".")

                if(amounts.size>1){
                    if(amounts[1].isEmpty()){
                        map["amount"]=amounts[0].toDouble()
                    }else{
                        map["amount"]= amounts[0].toDouble()+amounts[1].toDouble()*0.01
                    }
                }else{
                    map["amount"]=mBinding.mTotalPriceTV.text.handlerNull().toDouble()
                }
                map["userId"]=BaseApplication.userId
                map["payWay"]=if(currentPayType==3)1 else currentPayType
                map["remark"]=""

                val body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), getGson().toJson(map))
                mViewModel.MakeRechargeSerial(body)
                //有orderID则为单独支付没有OrderId则为批量支付

            }
        }
    }
    private inner class MyReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            if (intent.action == MyConstants.WXPAY_RESULT) {
                var value = intent.getIntExtra("VALUE",-1)  //收到的消息。
                if(value==0){
                    MyLog.d("微信支付成功")
                        val body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), getGson().toJson(map))
                        mViewModel.RechargeConfirm(body)
                }
            }
        }
    }

}
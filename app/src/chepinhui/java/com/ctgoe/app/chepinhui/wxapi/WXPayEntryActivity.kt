package com.ctgoe.app.chepinhui.wxapi

import android.content.Intent
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.deal.CommonPaySuccessActivity
import com.android.ctgapp.activity.home.shop.PayResultActivity
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.enum.PayFromEnum
import com.android.ctgapp.util.*
import com.tencent.mm.opensdk.constants.ConstantsAPI
import com.tencent.mm.opensdk.modelbase.BaseReq
import com.tencent.mm.opensdk.modelbase.BaseResp
import com.tencent.mm.opensdk.openapi.IWXAPI
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
import com.tencent.mm.opensdk.openapi.WXAPIFactory
import org.jetbrains.anko.startActivity

/**
 * 微信支付回调页面
 */
class WXPayEntryActivity : BaseActivity(), IWXAPIEventHandler {
    private var api: IWXAPI? = null


    override fun event() {
        MyLog.d("来了了大分包")
        api = WXAPIFactory.createWXAPI(this, globalWxAppId)
        api?.handleIntent(intent, this)
    }

    override fun click() {

    }

    override fun getLayout() = R.layout.activity_wxpay_entry

    override fun onResp(resp: BaseResp?) {
        MyLog.d("支付回调:${resp.toString()}")
        if (resp?.type == ConstantsAPI.COMMAND_PAY_BY_WX) {
            MyLog.d("发生错误:${resp.errCode}")
            MyLog.d("发生错误:${resp.errStr}")
            when (resp.errCode) {
                0 -> {
                    //支付成功
                    if (BaseApplication.currentPayFrom== PayFromEnum.WAIT_BAR_MORE){
                        startActivity<CommonPaySuccessActivity>()
                    }else{
                        startActivity<PayResultActivity>()
                    }
                }
                -2 -> {
                    showToast("取消支付")
                    if (wxChatFrom == 1) {
                        //如果订单是来自订单支付 则取消后直接进入订单列表页面
                        startActivity<MainActivity>(Constants.GO_JUMP to 3)
                    }
                }
                else -> {
                    showToast("支付失败请稍后再试")
                }
            }
            finish()
        }
    }

    override fun onReq(p0: BaseReq?) {
        MyLog.d("有点意思:${p0}")
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        api?.handleIntent(intent, this)
    }
}

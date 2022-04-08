package com.ctgoe.app.xingda.wxapi

import android.content.Intent
import android.view.View
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityWxentryBinding
import com.android.ctgapp.util.*
import com.bumptech.glide.Glide
import com.tencent.mm.opensdk.constants.ConstantsAPI
import com.tencent.mm.opensdk.modelbase.BaseReq
import com.tencent.mm.opensdk.modelbase.BaseResp
import com.tencent.mm.opensdk.openapi.IWXAPI
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
import com.tencent.mm.opensdk.openapi.WXAPIFactory
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

/**
 * 公众号回调
 */
class WXEntryActivity : BaseActivityV2(), IWXAPIEventHandler {
    private val mBinding by lazy { ActivityWxentryBinding.inflate(layoutInflater) }
    private var api: IWXAPI? = null
    override fun event() {
        api = WXAPIFactory.createWXAPI(this, BuildConfig.WX_APP_ID)
        api?.handleIntent(intent, this)
    }

    override fun click() {

    }

    override fun getLayout() = mBinding.root

    override fun onResp(resp: BaseResp) {
        Glide.with(this).load(R.drawable.gif_loading).into(mBinding.mImageView)
        mBinding.mCheckBox.isEnabled=false
        val openId = resp.openId
        MyLog.d("关注公众号回调:${resp.toString()}")
        if (resp.type == ConstantsAPI.COMMAND_SUBSCRIBE_MESSAGE) {
            MyLog.d("关注公众号成功了")
            val client = OkHttpClient()
            val getRequest = Request.Builder().url("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=${BuildConfig.WX_APP_ID}&secret=b180d434b710e6578828c4027cc7ca4f")
            client.newCall(getRequest.build()).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    MyLog.d("报错:${e.message}")
                    error()
                }

                override fun onResponse(call: Call, response: Response) {
                    val str = response.body()!!.string()
                    MyLog.d("回调:$str")
                    val json = JSONObject(str)
                    val token = json.getString("access_token")
                    val map=HashMap<String,Any>()
                    map["touser"]=openId
                    map["template_id"]="Tl6Yxt3To0mTIGWk5MLRLNdAnOQJywov5zPAtjhDneU"
                    map["url"]="https://ctgdev.oss-cn-shanghai.aliyuncs.com/qpdd/%E6%B1%BD%E9%85%8D%E9%92%89%E9%92%89"
                    map["scene"]=189
                    map["title"]="点击关注车同轨运营中心公众号"
                    val dataMap=HashMap<String,Any>()
                    val contentMap=HashMap<String,String>()
                    contentMap["value"]="关注微信公众号，第一时间收到询报价信息"
                    contentMap["color"]="#333333"
                    dataMap["content"]=contentMap
                    map["data"]=dataMap
                    val body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), getGson().toJson(map))
                    val request = Request.Builder()//创建Request 对象。
                        .url("https://api.weixin.qq.com/cgi-bin/message/template/subscribe?access_token=${token}")
                        .post(body)
                        .build()
                    client.newCall(request).enqueue(object : Callback {
                        override fun onFailure(call: Call, e: IOException) {
                            MyLog.d("错误:${e.message}")
                            error()
                        }

                        override fun onResponse(call: Call, response: Response) {
                            val str1 = response.body()!!.string()
                            MyLog.d("成功:$str1")
                            val json1=JSONObject(str1)
                            val errorCode=json1.getInt("errcode")
                            val errmsg=json1.getString("errmsg")
                            if (errorCode==0 && errmsg=="ok"){
                                runOnUiThread {
                                    mBinding.mImageView.visibility= View.GONE
                                    mBinding.mCheckBox.visibility=View.VISIBLE
                                    mBinding.mCheckBox.performClick()
                                    mBinding.mTextView.text="关注公众号服务通知已发送请查收"
                                }
                            }else{
                                error()
                            }
                        }
                    })

                }
            })


        }
    }

    private fun error(){
        runOnUiThread {
            Glide.with(this@WXEntryActivity).load(R.drawable.icon_resend).into(mBinding.mImageView)
            mBinding.mTextView.text="关注失败请稍后再试"
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

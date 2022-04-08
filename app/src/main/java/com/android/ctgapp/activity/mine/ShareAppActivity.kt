package com.android.ctgapp.activity.mine

import com.android.ctgapp.BuildConfig
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.PlatformUtil
import com.android.ctgapp.util.QRUtil
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_share_app.*

/**
 *作者:LiBW
 *创建日期: 12/31/20
 *描述: 分享 页面
 */
class ShareAppActivity : BaseActivity() {

    var url = ""

    override fun event() {
       url= when (BuildConfig.APPLICATION_ID) {
            "com.ctgoe.app.dingding"->"https://ctgdev.oss-cn-shanghai.aliyuncs.com/apk/dingding/qxdd-latest.apk"
            "com.ctgoe.app.hqp"->""
            "com.ctgoe.app.xingda"->""
            "com.ctgoe.app.chepinhui"->""
            "com.ctgoe.app.wl"->"https://ctgdev.oss-cn-shanghai.aliyuncs.com/apk/wl/wl-latest.apk"
            "com.ctgoe.app.lanjing"->"https://ctgdev.oss-cn-shanghai.aliyuncs.com/apk/lanjing/lanjing-latest.apk"
            else->""
        }



        Glide.with(this).load(QRUtil.create2DCode(url)).into(mQrIV)
        val title = "分享${resources.getString(R.string.app_name)}"
        customTitleBar.setTitle(title)
    }

    override fun click() {
        //分享给朋友
        mShareToFriendBTN.setOnClickListener {
            QRUtil.shareWeChatFriend(this, PlatformUtil.getFile(this, QRUtil.create2DCode(url)))
        }
    }

    override fun getLayout() = R.layout.activity_share_app

}
package com.android.ctgapp.activity.other

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.os.Handler
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.login.LoginActivity
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.sharedGet
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 4/30/21
 *描述:闪屏页 启动页
 */
class SplashPageActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val data = sharedGet(MyConstants.TOKEN, "").handlerNull()
        val sp= getSharedPreferences(MyConstants.IS_FIRST_IN, Context.MODE_PRIVATE)
        val isFirst=sp.getBoolean(MyConstants.IS_FIRST_IN,true)

        Handler().postDelayed({
            when{
                isFirst->{
                    //第一次进入引导页
                    startActivity<GuidePageActivity>()
                    finish()
                }
                data.isEmpty()->{
                    startActivity<LoginActivity>()
                }
                data.isNotEmpty()->{
                    startActivity<MainActivity>()
                }
            }
            finish()
        }, 1000)
    }
}
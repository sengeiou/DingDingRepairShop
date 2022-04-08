package com.android.ctgapp.boradcast

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import cn.jpush.android.api.JPushInterface
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.other.SystemNoticeDialogActivity
import com.android.ctgapp.event.NotifySystemRefresh
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.showToast
import org.greenrobot.eventbus.EventBus

class MyBroadcastReceiver : BroadcastReceiver() {
    private val tag = "有点东西"
    private var nm: NotificationManager? = null

    override fun onReceive(context: Context, intent: Intent) {
        if (null == nm) {
            nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        }
        val bundle = intent.extras
        Log.d(tag, intent.action.toString())
        //        Log.d(TAG, "onReceive - " + intent.getAction() + ", extras: " + AndroidUtil.printBundle(bundle));
        when {
            JPushInterface.ACTION_REGISTRATION_ID == intent.action -> {
                Log.d(tag, "JPush 用户注册成功")
            }
            JPushInterface.ACTION_MESSAGE_RECEIVED == intent.action -> {
                Log.d(tag, "接受到推送下来的自定义消息")

            }
            JPushInterface.ACTION_NOTIFICATION_RECEIVED == intent.action -> {
                Log.d(tag, "接受到推送下来的通知")
                receivingNotification(context, bundle)
            }
            JPushInterface.ACTION_NOTIFICATION_OPENED == intent.action -> {
                Log.d(tag, "用户点击打开了通知?")
//                MusicUtil.stop()
                openNotification(context, bundle)
            }
//            CommonConstants.NOTIFICATION_CLICKED == intent.action -> {
//                //启动应用
//                val launchIntent: Intent = context.packageManager.getLaunchIntentForPackage("com.c.ctgproject")!!
//                launchIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED
//                context.startActivity(launchIntent)
//                Log.d(tag, "从广播点击进入APP")
////                context.stopService(Intent(context, ResidentService::class.java))
//            }

            else -> {
                Log.d(tag, "Unhandled intent - " + intent.action)
            }
        }
    }

    private fun receivingNotification(context: Context, bundle: Bundle?) {
        val title = bundle!!.getString(JPushInterface.EXTRA_NOTIFICATION_TITLE)
        Log.d(tag, " title : $title")
        val message = bundle.getString(JPushInterface.EXTRA_ALERT)
        Log.d(tag, "message : $message")
//        context.showToast("收到一条系统消息,请查收")
        EventBus.getDefault().post(NotifySystemRefresh())
//        val intent=Intent(context,SystemNoticeDialogActivity::class.java)
//        intent.flags=Intent.FLAG_ACTIVITY_NEW_TASK
//        intent.putExtra(MyConstants.TITLE , title)
//        intent.putExtra(MyConstants.CONTENT , message)
//        context.startActivity(intent)


//        context.startActivity<SystemNoticeDialogActivity>(
//            MyConstants.TITLE to title,
//            MyConstants.CONTENT to message
//        )



//        val mCookieView= TopNotificationView(context)
//        val decorView = context.window.decorView as ViewGroup
//        decorView.addView(mCookieView)


//        val extras = bundle.getString(JPushInterface.EXTRA_EXTRA)
//        Log.d(tag, "extras传输的键值对 : $extras")


//        extras?.let {
//            try {
//                val json = JSONObject(extras)
//                when (json.getString("CODE")) {
////                    "1" -> MusicUtil.play(R.raw.one)
////                    "2" -> MusicUtil.play(R.raw.two)
////                    "3" -> MusicUtil.play(R.raw.three)
////                    "4" -> MusicUtil.play(R.raw.four)
//                }
//            } catch (e: java.lang.Exception) {
//
//            }
//        }
    }

    private fun openNotification(context: Context, bundle: Bundle?) {
        val intent=Intent(context,MainActivity::class.java)
        intent.flags=Intent.FLAG_ACTIVITY_NEW_TASK
        intent.putExtra(MyConstants.GO_JUMP , 1)
        context.startActivity(intent)


//        val extras = bundle!!.getString(JPushInterface.EXTRA_EXTRA)
//        MyLog.d(bundle.getInt("CODE"))
//        var myValue = ""
//        myValue = try {
//            val extrasJson = JSONObject(extras)
//            extrasJson.optString("myKey")
//        } catch (e: Exception) {
//            return
//        }


    }
}
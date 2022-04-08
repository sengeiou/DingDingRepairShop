package com.android.ctgapp.base

import android.app.Activity
import android.app.ActivityManager
import android.content.Context
import java.util.*
import kotlin.system.exitProcess

/**
 *作者:LiBW
 *创建日期: 2020/8/15
 *描述: Activity管理类
 */
class AppManager private constructor() {
    companion object {
        val instance: AppManager by lazy { AppManager() }

    }

    private val activityStack: Stack<Activity> = Stack()

    /**入栈*/
    fun addActivity(activity: Activity) {
        activityStack.add(activity)
    }
    /**出栈*/
    fun finishActivity(activity: Activity) {
        activityStack.remove(activity)
    }
    /**当前Activity*/
    fun currentActivity(): Activity {
        return activityStack.lastElement()
    }

    /**清理栈*/
    fun finishAllActivity(){
        activityStack.forEach {
            it.finish()
        }
        activityStack.clear()
    }

    /**关闭APP*/
    fun exitApp(context: Context){
        finishAllActivity()
        val activityManager=context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        activityManager.killBackgroundProcesses(context.packageName)
        exitProcess(0)
    }


}
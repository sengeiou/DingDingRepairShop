package com.android.ctgapp.util

import android.content.Context
import cn.jpush.android.api.JPushInterface

object JPushUtil {
    /**设置标签*/
    fun setTag(context: Context,companyIdSet:HashSet<String>) {
        companyIdSet.forEach {
            MyLog.d("JPush:$it")
        }
        JPushInterface.setTags(context,1001,companyIdSet)
    }

    /**设置别名*/
    fun setAlias(context: Context, userId: Int) {
        JPushInterface.setAlias(context, 100, userId.handlerNull())
    }

}
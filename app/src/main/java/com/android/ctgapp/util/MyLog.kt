package com.android.ctgapp.util

import android.util.Log


/**
 * 日志工具类
 * 只有debug模式下回打印
 */
object MyLog {
    private const val TAG = "日志"
    fun d(msg: Any?) {
            Log.d(TAG, "" + msg)
    }

    fun e(msg: Any?) {
        Log.d("有点东西", "" + msg)
    }
}

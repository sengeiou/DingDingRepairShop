package com.android.ctgapp.widget

import android.view.Gravity

import android.widget.TextView
import android.view.LayoutInflater
import android.content.Context
import android.widget.Toast
import com.android.ctgapp.R


/**
 * 创建时间:2019/6/21
 * @author LiBW
 * 描述:自定义Toast
 */
class CustomToast(context: Context) : Toast(context) {
    companion object {

        private var mToast: CustomToast? = null

        fun showToast(context: Context, msg: String) {
            //每次弹出新Toast的时候隐藏掉旧的Toast
            if (mToast != null) {
                mToast?.cancel()
            }
            mToast = CustomToast(context)
            val view = LayoutInflater.from(context).inflate(R.layout.item_custom_toast_layout, null)
            val mToastShowTV = view.findViewById<TextView>(R.id.mToastShowTV)
            //展示的Toast内容
            mToastShowTV.text = msg
            mToast?.view = view
            //获取屏幕高度
            val metrics = context.resources.displayMetrics
            val height = metrics.heightPixels
            //设置Toast展示的位置
            mToast?.setGravity(Gravity.CENTER, 0, height / 2 - 200)
            mToast?.show()
        }
    }
}
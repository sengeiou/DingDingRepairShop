package com.android.ctgapp.widget

import android.content.Context
import android.graphics.Rect
import android.text.TextUtils
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

/**
 *作者:LiBW
 *描述: 滚动
 */
class MarqueeTextView(context: Context, attr: AttributeSet? = null) : AppCompatTextView(context, attr) {

    init {
        setSingleLine()
        ellipsize = TextUtils.TruncateAt.MARQUEE
        isFocusable = true
        //无限循环
        marqueeRepeatLimit = -1
        //强制获取焦点
        isFocusableInTouchMode = true
    }

    override fun isFocused(): Boolean {
        return true
    }

    override fun onFocusChanged(focused: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        if (focused){
            super.onFocusChanged(focused, direction, previouslyFocusedRect)
        }
    }

    override fun onWindowFocusChanged(hasWindowFocus: Boolean) {
        if (hasWindowFocus){
            super.onWindowFocusChanged(hasWindowFocus)
        }
    }
}
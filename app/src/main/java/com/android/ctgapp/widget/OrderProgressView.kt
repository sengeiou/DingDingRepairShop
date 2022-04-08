package com.android.ctgapp.widget

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import com.android.ctgapp.R
import kotlinx.android.synthetic.main.item_progress_view.view.*
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.imageResource

/**
 *作者:LiBW
 *描述: 订单页面的进度控件
 * 第一个布尔用来判断是否到达次节点  isLast:是否为最后一个(仅占位) isTarget:到此结束后面画虚线
 */
@SuppressLint("ViewConstructor")
class OrderProgressView(boolean: Boolean, context: Context, isLast: Boolean,isTarget:Boolean = false, attr: AttributeSet? = null) : LinearLayout(context, attr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.item_progress_view, this)
        if (boolean) {
            mCircleIV.imageResource = R.drawable.icon_white_right
            mLineIV.backgroundResource = R.drawable.icon_white_line
        } else {
            mCircleIV.imageResource = R.drawable.icon_gray_right
            mLineIV.backgroundResource = R.drawable.icon_gray_line
        }
        if (isLast) {
            mLineIV.visibility = View.INVISIBLE
        } else {
            mLineIV.visibility = View.VISIBLE
        }
        if (isTarget){
            mCircleIV.imageResource = R.drawable.icon_white_right
            mLineIV.backgroundResource = R.drawable.icon_gray_line
        }
    }
}
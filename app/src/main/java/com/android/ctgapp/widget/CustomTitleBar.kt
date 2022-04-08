package com.android.ctgapp.widget

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.android.ctgapp.R
import kotlinx.android.synthetic.main.item_title_bar.view.*
import org.jetbrains.anko.backgroundColorResource
import org.jetbrains.anko.image
import org.jetbrains.anko.textColor

/**
 *作者:LiBW
 *创建日期: 2020/8/17
 *描述:自定义 TitleBar
 */
class CustomTitleBar(context: Context, attrs: AttributeSet? = null) : RelativeLayout(context, attrs) {
    private var mTitleBarBackIv: ImageView?=null
    private  var mTitleTv: TextView?=null
    init {
//        //加载布局
        val view=    LayoutInflater.from(context).inflate(R.layout.item_title_bar, this)
        mTitleBarBackIv=view.findViewById(R.id.mTitleBarBackIv)
        mTitleTv=view.findViewById(R.id.mTitleTv)
//        //设置点击事件 返回上一页(删除本页)
        mTitleBarBackIv?.setOnClickListener {
            (getContext() as Activity).finish()
        }
        if (attrs != null) {
            val a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomTitleBar)
            val title = a.getString(R.styleable.CustomTitleBar_mTitle)
            val mWhiteStyle = a.getBoolean(R.styleable.CustomTitleBar_mWhiteStyle, false)
            if (title != null) {
                setTitle(title)
            }
            if (mWhiteStyle) {
                whiteStyle()
            }
            a.recycle()
        }
    }

    fun setTitle(str: String) {
        mTitleTv?.text = str
    }

    private fun whiteStyle() {
//        mTitleBarBackIv.textColor = ContextCompat.getColor(context, R.color.black)
//        mBackground.backgroundColorResource = R.color.white
//        mBackIv.image = ContextCompat.getDrawable(context, R.drawable.icon_back_black)
    }
}

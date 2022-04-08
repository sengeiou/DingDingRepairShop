package com.android.ctgapp.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import com.android.ctgapp.R
import kotlinx.android.synthetic.main.item_button_selectm.view.*
import org.jetbrains.anko.textColor
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 2020/11/13
 *描述:带下划线的button 包含select和unSelect设置 选中状态 (用户横向列表的单选)
 */
class SelectButton(context: Context, attr: AttributeSet? = null) : LinearLayout(context, attr) {
    var color: Int? = null
    var click: ButtonClick? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.item_button_selectm, this)

        attr?.let {
            val a = context.obtainStyledAttributes(attr, R.styleable.SelectButton)
            color = a.getColor(R.styleable.SelectButton_mColor, context.getColor(R.color.blue_common))
            if (a.getBoolean(R.styleable.SelectButton_mSelect, false)) {
                select()
            }
            val text = a.getString(R.styleable.SelectButton_mText)
            text?.let { setText(it) }
            a.recycle()
        }
        mButton.setOnClickListener {
            click?.onClickListener()
        }
    }

    fun setOnButtonClick(buttonClick: ButtonClick) {
        click = buttonClick
    }


    fun select() {
        mButton.textColor = color!!
        mBottomLine.visibility = View.VISIBLE
    }

    fun unSelect() {
        mButton.textColorResource = R.color.gray_text
        mBottomLine.visibility = View.INVISIBLE
    }

    private fun setText(str: String) {
        mButton.text = str
    }

    interface ButtonClick {
        fun onClickListener()
    }

}
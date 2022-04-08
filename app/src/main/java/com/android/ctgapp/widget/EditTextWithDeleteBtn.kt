package com.android.ctgapp.widget

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.res.ResourcesCompat
import com.android.ctgapp.R

class EditTextWithDeleteBtn(context: Context, attrs: AttributeSet?) : AppCompatEditText(context, attrs) {
    private val mClearDrawable = ResourcesCompat.getDrawable(resources, R.drawable.edit_delete, null)
    private var hasFocus = false

    init {
        mClearDrawable?.setBounds(
            0, 0, mClearDrawable.intrinsicWidth,
            mClearDrawable.intrinsicHeight
        )
        // 默认设置隐藏图标
        setClearIconVisible(false)
        // 设置焦点改变的监听
        setOnFocusChangeListener { _, hasFocus ->
            this.hasFocus = hasFocus
            if (hasFocus) {
                setClearIconVisible(text!!.isNotEmpty())
            } else {
                setClearIconVisible(false)
            }
        }
        // 设置输入框里面内容发生改变的监听
        addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (hasFocus) {
                    setClearIconVisible(s!!.isNotEmpty())
                }
            }

        })

    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (event.action == MotionEvent.ACTION_UP) {
            if (compoundDrawables[2] != null) {
                val x = event.x.toInt()
                val y = event.y.toInt()
                val rect = compoundDrawables[2].bounds
                val height = rect.height()
                val distance = (getHeight() - height) / 2
                val isInnerWidth = x > width - totalPaddingRight && x < width - paddingRight
                val isInnerHeight = y > distance && y < distance + height
                if (isInnerWidth && isInnerHeight) {
                    this.setText("")
                }
            }
        }
        return super.onTouchEvent(event)
    }

    private fun setClearIconVisible(visible: Boolean) {
        val right = if (visible) mClearDrawable else null
        setCompoundDrawables(
            compoundDrawables[0],
            compoundDrawables[1], right, compoundDrawables[3]
        )
    }
}
package com.android.ctgapp.widget

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.inputmethodservice.KeyboardView
import android.util.AttributeSet
import android.view.View
import com.android.ctgapp.R
import com.android.ctgapp.util.MyLog
import com.utils.ScreenUtils


@SuppressLint("DrawAllocation")
class VinKeyboardView(context: Context, attributeSet: AttributeSet? = null) : KeyboardView(context, attributeSet) {
    private val paint by lazy { Paint() }

    init {
        paint.isAntiAlias = true
    }

    val move = 14
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        keyboard.keys.forEach { key ->
            when (key.codes[0]) {
                -1 -> {
                    val dr: Drawable = context.resources.getDrawable(R.drawable.bg_btn_common_3dp, context.theme)
                    dr.setBounds(key.x, key.y + move, key.x + key.width, key.y + key.height + move + 2)
                    dr.draw(canvas)
                    paint.textSize = ScreenUtils.sp2px(context, 14f).toFloat()
                    paint.color = context.resources.getColor(R.color.white, context.theme)
                    val rect = Rect(key.x, key.y + move, key.x + key.width, key.y + key.height + move)
                    val fontMetrics: Paint.FontMetricsInt = paint.fontMetricsInt
                    val baseline = (rect.bottom + rect.top - fontMetrics.bottom - fontMetrics.top) / 2
                    paint.textAlign = Paint.Align.CENTER
                    canvas.drawText(key.label.toString(), rect.centerX().toFloat(), baseline.toFloat(), paint)
                }
                81, 73, 79 -> {
                    val dr = context.resources.getDrawable(R.drawable.bg_solid_gary_3dp, context.theme) as Drawable
                    dr.setBounds(key.x, key.y + move, key.x + key.width, key.y + key.height + move + 2)
                    dr.draw(canvas)
                    if (key.label != null) {
                        paint.textSize = ScreenUtils.sp2px(context, 18f).toFloat()
                        paint.color = context.resources.getColor(R.color.black_text, context.theme)
                        // 注意： 这个方法不支持硬件加速，所以我们要测试时必须先关闭硬件加速。加上这一句
                        val rect = Rect(key.x, key.y + move, key.x + key.width, key.y + key.height + move)
                        val fontMetrics: Paint.FontMetricsInt = paint.fontMetricsInt
                        val baseline = (rect.bottom + rect.top - fontMetrics.bottom - fontMetrics.top) / 2
                        paint.textAlign = Paint.Align.CENTER
                        canvas.drawText(key.label.toString(), rect.centerX().toFloat(), baseline.toFloat(), paint)
                    }
                }
            }
        }
    }

    override fun onClick(v: View?) {
        super.onClick(v)
        MyLog.d("点击了")
    }
}
package com.android.ctgapp.widget.chart

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.text.style.ImageSpan

/**
 *作者:LiBW
 *描述: 聊天表情处理
 */
class CenteredImageSpan(context: Context?, drawableRes: Bitmap?) : ImageSpan(context!!, drawableRes!!) {
    override fun draw(canvas: Canvas, text: CharSequence, start: Int, end: Int, x: Float, top: Int, y: Int, bottom: Int, paint: Paint) {
        val b = drawable
        val fm = paint.fontMetricsInt
        val transY = ((y + fm.descent + y + fm.ascent) / 2
                - b.bounds.bottom / 2)
        canvas.save()
        canvas.translate(x, transY.toFloat())
        b.draw(canvas)
        canvas.restore()
    }
}
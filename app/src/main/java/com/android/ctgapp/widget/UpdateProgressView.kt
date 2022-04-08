package com.android.ctgapp.widget

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import com.android.ctgapp.R
import com.android.ctgapp.util.ColorUtil


class UpdateProgressView(context: Context, attributeSet: AttributeSet? = null) : View(context, attributeSet) {
    private var progress = 1.0f
    private var pan = Paint()
    private var textPan = Paint()

    //颜色渐变器
    private var sg: SweepGradient? = null

    init {
        //画笔抗锯齿
        textPan.isAntiAlias = true
        pan.isAntiAlias = true
        //圆弧两端是圆弧状
        pan.strokeCap = Paint.Cap.ROUND
        //画笔样式为线
        pan.style=Paint.Style.STROKE
        //文字居中
        textPan.textAlign = Paint.Align.CENTER
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        pan.strokeWidth=width/27f
        //文字大小为宽度的1/6
        textPan.textSize = width / 6f
        //将角度换算为百分比
        val percent = (progress * 100 / 360f).toInt()
        val w = width + 0f
        //旋转-90度让圆弧起点从右侧变为正上方
        canvas.rotate(-90f, w / 2, w / 2)
        //渐变颜色实时获取以实时改变文字颜色
        val color = ColorUtil.getCurrentColor(progress / 360f, Color.parseColor("#16B1FF"), Color.parseColor("#405CFD"))
        //设置文字颜色(渐变)
        textPan.color = color
        //设置渐变色的起始和终止颜色集合
        val colors = intArrayOf(Color.parseColor("#16B1FF"), Color.parseColor("#405CFD"))
        //将渐变色赋值给颜色渲染器
        if (sg == null) {
            sg = SweepGradient(w / 2, w / 2, colors, null)
            pan.shader = sg
        }
        //绘制圆弧
        canvas.drawArc(20f, 20f, w-20f, w-20f, 6f, progress, false, pan)
        //回转90度 让文字正过来(因为刚刚旋转了-90度)
        canvas.rotate(90f, w / 2, w / 2)
        //绘制文字
        canvas.drawText("${percent}%", width / 2f, width / 18f * 10f, textPan)
    }

    /**根据百分比处理圆弧*/
    fun handlerPercent(percent: Int) {
        progress = percent * 3.6f
        invalidate()
    }

    /**根据角度处理圆弧*/
//    fun handlerAngle(angle: Float) {
//        progress = angle
//        invalidate()
//    }

}
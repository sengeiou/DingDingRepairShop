package com.android.ctgapp.widget

import android.annotation.SuppressLint
import android.content.Context
import android.widget.TextView
import com.android.ctgapp.R
import com.android.ctgapp.entity.mine.DescribeLineBean
import com.github.mikephil.charting.components.MarkerView
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.highlight.Highlight
import com.github.mikephil.charting.utils.MPPointF

/**
 *作者:LiBW
 *创建日期: 3/26/21
 *描述:折线图描述
 */
@SuppressLint("ViewConstructor")
class ChartDetailDescribe(context: Context?, layoutResource: Int, private val mList: List<DescribeLineBean>) : MarkerView(context, layoutResource) {
    private val mTitleTV: TextView = findViewById(R.id.mTitleTV)
    private val mDayTV: TextView = findViewById(R.id.mDayTV)

    override fun refreshContent(e: Entry, highlight: Highlight) {
        val position = e.x.toInt()
        if (mList.isEmpty()) {
            return
        }
        mTitleTV.text = mList[position].count
        mDayTV.text = mList[position].time
        super.refreshContent(e, highlight)
    }

    override fun getOffset(): MPPointF {
        return MPPointF(-100f, -height - 20f)
    }
}
package com.android.ctgapp.common

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.RecyclerView
class CommonRecyclerView(context: Context, attributeSet: AttributeSet?) : RecyclerView(context, attributeSet) {

    init {
        overScrollMode=OVER_SCROLL_NEVER
//        overScrollMode=SCROLL_AXIS_NONE
    }
}
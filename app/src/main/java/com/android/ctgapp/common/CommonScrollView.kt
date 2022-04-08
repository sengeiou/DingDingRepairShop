package com.android.ctgapp.common

import android.content.Context
import android.util.AttributeSet
import android.widget.ScrollView

class CommonScrollView(context: Context,attributeSet: AttributeSet?) :ScrollView(context,attributeSet){
    init {
        overScrollMode= OVER_SCROLL_NEVER
        isVerticalScrollBarEnabled=false
    }
}
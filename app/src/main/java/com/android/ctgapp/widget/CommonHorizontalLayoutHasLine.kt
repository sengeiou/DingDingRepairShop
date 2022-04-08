package com.android.ctgapp.widget

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import com.android.ctgapp.R
import org.jetbrains.anko.singleLine

/**
 *作者:LiBW
 *创建日期: 2021/5/12
 *描述: 自定义横向 双TetxView 带有一个MarginBottom
 */
class CommonHorizontalLayoutHasLine(context: Context, attributeSet: AttributeSet?) : RelativeLayout(context, attributeSet) {
    var mStartTV: TextView? = null
    var mEndTV: TextView? = null

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.view_common_horizontal_margin_bottom_layout, this)
        mStartTV = view.findViewById(R.id.mStartTV)
        mEndTV = view.findViewById(R.id.mEndTV)
        attributeSet?.let {
            val a = getContext().obtainStyledAttributes(attributeSet, R.styleable.CommonHorizontalLayout)
            mStartTV?.setTextSize(TypedValue.COMPLEX_UNIT_SP,a.getFloat(R.styleable.CommonHorizontalLayout_mTextSize, 14f))
            mEndTV?.setTextSize(TypedValue.COMPLEX_UNIT_SP,a.getFloat(R.styleable.CommonHorizontalLayout_mTextSize, 14f))
            mStartTV?.text = a.getString(R.styleable.CommonHorizontalLayout_mStartTV)
            mEndTV?.text = a.getString(R.styleable.CommonHorizontalLayout_mEndTV)
            val mMaxLines=a.getInteger(R.styleable.CommonHorizontalLayout_mMaxLines,1)
            if (mMaxLines==1){
                mEndTV?.singleLine=true
            }else{
                mEndTV?.maxLines=mMaxLines
            }
            a.recycle()
        }
    }

    fun setEndTV(str:String){
        mEndTV?.text=str
    }
    fun setStartTV(str:String){
        mStartTV?.text=str
    }
}
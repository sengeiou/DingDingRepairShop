package com.android.ctgapp.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.android.ctgapp.R
import com.android.ctgapp.util.handlerNull

class SelectPartWidget(context: Context, attr: AttributeSet? = null) : LinearLayout(context, attr) {
    var mTextView: TextView? = null
    var mDeleteBTN: ImageView? = null
    var listener: SelectPartCallBack? = null

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.item_select_part_widget, this)
        mTextView = view.findViewById(R.id.mTextView)
        mDeleteBTN = view.findViewById(R.id.mDeleteBTN)
        mDeleteBTN?.setOnClickListener {
            listener?.removeView(this.tag as String,mTextView?.text.handlerNull())
        }
    }

    fun textSet(str: String) {
        mTextView?.text = str
    }

    fun setOnClick(listener: SelectPartCallBack) {
        this.listener = listener
    }

    interface SelectPartCallBack {
        fun removeView(tag: String,partName:String)
    }

}
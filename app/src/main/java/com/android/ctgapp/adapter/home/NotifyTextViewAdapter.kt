package com.android.ctgapp.adapter.home

import android.content.Context
import android.view.View
import android.widget.TextView
import com.android.ctgapp.R
import me.bakumon.library.adapter.BulletinAdapter

class NotifyTextViewAdapter(context: Context, private val mList: List<String>) : BulletinAdapter<String>(context, mList) {
    override fun getView(position: Int): View {
        val view = getRootView(R.layout.item_only_text)
        val tVSaleTitle: TextView = view.findViewById(R.id.tVSaleTitle)
        tVSaleTitle.text = mList[position]
        return view
    }
}
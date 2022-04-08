package com.android.ctgapp.adapter.home

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter

/**
 * 创建时间:2018/12/12
 * 作者:LiBW
 * 描述:公共全屏ViewpagerAdapter
 */
class CommonViewpagerAdapter(private val mList: List<ImageView>) : PagerAdapter() {

    override fun isViewFromObject(p0: View, p1: Any): Boolean {
        return p0 == p1
    }

    override fun getCount(): Int {
        return mList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        container.addView(mList[position])
        return mList[position]
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(mList[position])
    }

}

package com.android.ctgapp.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class BaseFragmentStatePagerAdapter(private val pageTitle: Array<String>, private val mList: List<Fragment>, fm: FragmentManager, behavior: Int) : FragmentStatePagerAdapter(fm, behavior) {
    override fun getItem(position: Int): Fragment {
        return mList[position]
    }

    override fun getCount(): Int {
        return mList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return pageTitle[position]
    }

}
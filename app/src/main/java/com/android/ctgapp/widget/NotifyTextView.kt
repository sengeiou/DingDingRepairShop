package com.android.ctgapp.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ViewFlipper
import com.android.ctgapp.R
import me.bakumon.library.adapter.BulletinAdapter
import me.bakumon.library.view.BulletinView

/**
 * 作者:LiBW
 * 描述: 通知滚动器
 */
class NotifyTextView(context: Context, attrs: AttributeSet? = null) : ViewFlipper(context, attrs), View.OnClickListener {

    private var mBulletinInterval = 3000
    private var mBulletinEnterAnim = R.anim.bulletin_item_enter
    private var mBulletinLeaveAnim = R.anim.bulletin_item_leave


    init {
        val a = context.obtainStyledAttributes(attrs, R.styleable.BulletinView)
        mBulletinInterval = a.getInt(R.styleable.BulletinView_bulletinInterval, 3000)
        mBulletinEnterAnim = a.getResourceId(R.styleable.BulletinView_bulletinEnterAnim, R.anim.bulletin_item_enter)
        mBulletinLeaveAnim = a.getResourceId(R.styleable.BulletinView_bulletinLeaveAnim, R.anim.bulletin_item_leave)
        a.recycle()
        // 设置公告轮播间隔时间
        flipInterval = mBulletinInterval
        // 设置进入和离开动画
        inAnimation = AnimationUtils.loadAnimation(context, mBulletinEnterAnim)
        outAnimation = AnimationUtils.loadAnimation(context, mBulletinLeaveAnim)
    }

    fun setAdapter(adapter: BulletinAdapter<*>?) {
        if (adapter == null) {
            return
        }
        for (i in 0 until adapter.count) {
            val view = adapter.getView(i)
            view.tag = i
            addView(view)
            view.setOnClickListener(this)
        }
        startFlipping()
    }

    override fun onClick(view: View) {
        val position = view.tag as Int
        if (mOnBulletinItemClickListener != null) {
            mOnBulletinItemClickListener!!.onBulletinItemClick(position)
        }
    }

    /**
     * 公告条目点击监听接口
     */
    interface OnBulletinItemClickListener {
        fun onBulletinItemClick(position: Int)
    }

    private var mOnBulletinItemClickListener: BulletinView.OnBulletinItemClickListener? = null

    /**
     * 设置公告条目点击监听器
     *
     * @param onBulletinItemClickListener 公告条目点击监听器
     */
    fun setOnBulletinItemClickListener(onBulletinItemClickListener: BulletinView.OnBulletinItemClickListener?) {
        mOnBulletinItemClickListener = onBulletinItemClickListener
    }
}
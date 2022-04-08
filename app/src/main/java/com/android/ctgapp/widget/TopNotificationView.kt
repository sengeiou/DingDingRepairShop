package com.android.ctgapp.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.TextView
import com.android.ctgapp.R
import com.android.ctgapp.databinding.TopNotifycationViewBinding

class TopNotificationView(context: Context, attributeSet: AttributeSet? = null) : LinearLayout(context, attributeSet) {
    //默认存在2秒
    private var mDuration = 2000L
    private var mOutAnim: Animation? = null

    init {
        val view = inflate(context, R.layout.top_notifycation_view, this)
        val text = view.findViewById<TextView>(R.id.mBTN)
        text.setOnClickListener {
            dismiss()
        }
        mOutAnim = AnimationUtils.loadAnimation(context, R.anim.anim_leave_from_top)
        createInAnim()

    }

    private fun createInAnim() {
        val mInAnim = AnimationUtils.loadAnimation(context, R.anim.anim_in_from_top)
        mInAnim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {}
            override fun onAnimationEnd(animation: Animation) {
                //配置隐藏时间
                postDelayed({ dismiss() }, mDuration)
            }
            override fun onAnimationRepeat(animation: Animation) {}
        })
        animation = mInAnim
    }


    /**
     * 消失
     */
    fun dismiss() {
        mOutAnim?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {}
            override fun onAnimationEnd(animation: Animation) {
                destroy()
            }

            override fun onAnimationRepeat(animation: Animation) {}
        })
        startAnimation(mOutAnim)
    }


    /**
     * 销毁
     */
    private fun destroy() {
        postDelayed({
            val parent = parent
            if (parent != null) {
                clearAnimation()
                (parent as ViewGroup).removeView(this)
            }
        }, 0)
    }
}
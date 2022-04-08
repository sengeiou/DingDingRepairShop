package com.android.ctgapp.widget.dialog

import android.os.Bundle
import android.view.*
import androidx.fragment.app.DialogFragment

abstract class BaseTopDialogFragment : DialogFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //        setStyle(DialogFragment.STYLE_NORMAL, R.style.TitleDialogStyle);
        initEventAndData()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(layoutId, container)
        val window = dialog!!.window
        if (window != null) {
            // window.setBackgroundDrawableResource(android.R.color.transparent);
            window.decorView.setPadding(0, 0, 0, 0)
            val layoutParams = window.attributes
            layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT
            layoutParams.height = height
            layoutParams.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
            if (isTranslucentDecor) {
                layoutParams.flags = layoutParams.flags or WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION
            }
            layoutParams.gravity = Gravity.TOP // 必须为 TOP，否则定位不准确
            //            layoutParams.windowAnimations = R.style.TopDialogAnimation;
            layoutParams.y = topYPosition // 配合 Gravity.TOP 才能准确定位
            window.attributes = layoutParams
            //            window.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.alpha_black_50)));
        }
        return view
    }

    protected fun initEventAndData() {}
    protected abstract val layoutId: Int
    protected abstract val topYPosition: Int
    protected abstract val isTranslucentDecor: Boolean
    protected val height: Int
        protected get() = WindowManager.LayoutParams.WRAP_CONTENT
}
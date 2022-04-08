package com.android.ctgapp.base

import android.os.Bundle
import android.print.PrintAttributes
import android.util.DisplayMetrics
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.fragment.app.DialogFragment
import com.android.ctgapp.R
import com.android.ctgapp.util.toPx


/**
 *作者:LiBW
 *创建日期: 2020/10/10
 *描述:FragmentDialog基础类 从下方弹出
 */
abstract class BaseDialogFromBottomFragment : DialogFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayout(), container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.CommonCompanyDialog)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        dialog?.window?.attributes?.windowAnimations = R.style.fromBottomAnimation
    }

    override fun onStart() {
        super.onStart()
        val display=DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(display)
//
//        //设置宽高占比
        val params = dialog!!.window!!.attributes
//        //此处占满屏幕宽度
        params.width = display.widthPixels
        params.height = RelativeLayout.LayoutParams.WRAP_CONTENT
        params.gravity = Gravity.BOTTOM
        params.horizontalMargin=100f


//        高度自己定义
//        dialog!!.window!!.setLayout(RelativeLayout.LayoutParams.MATCH_PARENT, 492f.toPx(requireContext()))
        dialog!!.window!!.setLayout(RelativeLayout.LayoutParams.MATCH_PARENT, 333F.toPx(requireContext()))


    }

    /***布局加载完毕*/
    abstract fun viewIsCreated(view: View, savedInstanceState: Bundle?)

    /***设置布局*/
    abstract fun getLayout(): Int

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewIsCreated(view, savedInstanceState)
    }
}
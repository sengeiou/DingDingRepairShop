package com.android.ctgapp.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.widget.dialog.LoadingDialog
import org.greenrobot.eventbus.EventBus

/**
 *作者:LiBW
 *创建日期: 2020/9/29
 *描述: Fragment基础类
 */
abstract class BaseFragment(private val needEventBus: Boolean=false) : Fragment() {
    val loading: LoadingDialog by lazy { LoadingDialog(requireContext()) }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayout(), null, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (needEventBus)EventBus.getDefault().register(this)
        event()
        click()
    }


    abstract fun event()

    abstract fun click()


    /**
     * 获取布局
     */
    abstract fun getLayout(): Int
    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }
}
package com.android.ctgapp.fragment.work

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseFragment
import com.android.ctgapp.util.showToast

/**
 *作者:LiBW
 *创建日期: 2020/9/29
 *描述: 工作Fragment
 */
class WorkFragment : BaseFragment() {
    private val mViewModel: WorkFragmentViewModel by lazy { ViewModelProvider(requireActivity())[WorkFragmentViewModel::class.java] }

    override fun event() {

        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            requireActivity().showToast(it)
        })
    }

    override fun click() {
    }

    override fun getLayout() = R.layout.fragment_work

}
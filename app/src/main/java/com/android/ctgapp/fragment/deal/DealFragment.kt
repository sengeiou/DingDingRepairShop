package com.android.ctgapp.fragment.deal

import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.activity.deal.AfterSaleActivity
import com.android.ctgapp.base.BaseFragment
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.fragment_deal.*
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 2020/9/29
 *描述: 交易 Fragment 询价记录/成交订单
 */
class DealFragment : BaseFragment() {
    private val mViewModel: DealFragmentViewModel by lazy { ViewModelProvider(requireActivity())[DealFragmentViewModel::class.java] }

    //询价记录
    private val queryLogFragment: QueryLogFragment by lazy { QueryLogFragment() }

    //成交订单 订单
    private val dealOrderFragment: DealOrderFragment by lazy { DealOrderFragment() }

    //售后
    private val afterSaleFragment: AfterSaleFragment by lazy { AfterSaleFragment() }


    private var toQueryOrders = false
    override fun event() {
        requireActivity().showFragment(dealOrderFragment, R.id.mFragmentContainerFL)

    }

    /**展示询价记录*/
    fun showQuery() {
        MyLog.d("aaa跳询价吧")
        if (mQueryLogTV != null) {
            MyLog.d("aaaccc跳询价吧")
            mQueryLogTV.performClick()
        }
        toQueryOrders = true
    }

    //展示订单
    fun showOrder() {
        if (mDealOrderTV != null)
            mDealOrderTV.performClick()
    }

    private fun refreshBtn() {
        mQueryLogTV.backgroundResource = R.drawable.bg_btn_gray_border_left
        mQueryLogTV.textColorResource = R.color.gray_text
        mDealOrderTV.backgroundResource = R.drawable.bg_btn_gray_border_center
        mDealOrderTV.textColorResource = R.color.gray_text
        mAfterSaleTV.backgroundResource = R.drawable.bg_btn_gray_border_right
        mAfterSaleTV.textColorResource = R.color.gray_text
        requireActivity().hideFragment(queryLogFragment)
        requireActivity().hideFragment(dealOrderFragment)
        requireActivity().hideFragment(afterSaleFragment)
    }

    override fun click() {
        if (toQueryOrders) mQueryLogTV.performClick()
        //询价记录
        mQueryLogTV.setOnClickListener {
            refreshBtn()
            mQueryLogTV.backgroundResource = R.drawable.bg_btn_blue_radius_left
            mQueryLogTV.textColorResource = R.color.white
            requireActivity().showFragment(queryLogFragment, R.id.mFragmentContainerFL)
        }
        //成交订单
        mDealOrderTV.setOnClickListener {
            refreshBtn()
            mDealOrderTV.backgroundResource = R.drawable.bg_btn_blue_radius_center
            mDealOrderTV.textColorResource = R.color.white
            requireActivity().showFragment(dealOrderFragment, R.id.mFragmentContainerFL)
        }

        //售后
        mAfterSaleTV.setOnClickListener {
            refreshBtn()
            mAfterSaleTV.backgroundResource = R.drawable.bg_btn_blue_radius_right
            mAfterSaleTV.textColorResource = R.color.white
            requireActivity().showFragment(afterSaleFragment, R.id.mFragmentContainerFL)
//            requireActivity().startActivity<AfterSaleActivity>()
        }
    }

    override fun getLayout() = R.layout.fragment_deal

}
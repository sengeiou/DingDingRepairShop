package com.android.ctgapp.fragment.deal

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.deal.OrderAdapter
import com.android.ctgapp.base.BaseFragment
import com.android.ctgapp.entity.OrderEntity
import com.android.ctgapp.event.OrderRefresh
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.SelectButton
import kotlinx.android.synthetic.main.fragment_deal_order_layout.*
import org.greenrobot.eventbus.Subscribe

/**
 *作者:LiBW
 *创建日期: 11/14/20
 *描述: 成交订单 页面 Fragment
 */
class DealOrderFragment : BaseFragment(true), OrderAdapter.OrderListener {
    override fun getLayout() = R.layout.fragment_deal_order_layout
    //1待付款  2待发货 3待收货 4已完成  7已取消 9退款中 //已取消放在全部里
    private var preSelect: Int? = null
    private val mViewModel: DealOrderViewModel by lazy { ViewModelProvider(requireActivity())[DealOrderViewModel::class.java] }
    private val mList = ArrayList<OrderEntity.DataBean.RecordsBean>()
    private val mAdapter: OrderAdapter by lazy { OrderAdapter(requireActivity(), mList,this) }

    private var page = 1
    private var size = 20
    private var needInit=false

    override fun event() {
        initOrder()
        mOrderRV.adapter = mAdapter
        mOrderRV.layoutManager = LinearLayoutManager(requireContext())
        mViewModel.error.observe(this, Observer {
            mRefresh.over()
            loading.dismiss()

            MyLog.d("错误:$it")
            requireActivity().showToast(it)
        })

        mViewModel.orderResult.observe(this, Observer {
            loading.dismiss()
            mRefresh.over()
            MyLog.d("订单列表:$it")
            requireActivity().handlerHttpResult(it) {
                val data = getGson().fromJson(it, OrderEntity::class.java).data
                data?.records?.let { list ->
                    if (needInit){
                        needInit=false
                        mList.clear()
                    }
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
        })
    }


    @Subscribe
    fun eventBus(type: OrderRefresh) {
        MyLog.d("刷新订单了")
        if (type.type == 2) {
            initOrder()
        }
    }


    private fun initOrder() {
        needInit=true
        page = 1
        getOrder()
    }

    private fun getOrder() {
        loading.show()
        mViewModel.getOrder(page, size, preSelect)
    }

    override fun click() {
        //全部
        mAllBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(null)
            }
        })

        //待付款
        mWaitPayBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                MyLog.d("点击待付款")
                buttonClick(1)
            }
        })
        //待发货
        mWaitSendBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(2)
            }
        })
        //待收货
        mWaitGetBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(3)
            }
        })

        //已完成
        mFinishedBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(4)
            }
        })
        //退货中
        mSalesReturnBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(9)
            }
        })
        //上拉加载
        mRefresh.setOnLoadMoreListener {
            page++
            getOrder()
        }
        //下拉刷新
        mRefresh.setOnRefreshListener {
            initOrder()
        }
    }

    private fun buttonClick(type: Int?) {
        if (preSelect == type) {
            return
        }
        //恢复之前的按钮
        when (preSelect) {
            null -> mAllBTN.unSelect()
            1 -> mWaitPayBTN.unSelect()
            2 -> {
                mWaitSendBTN.unSelect()
            }
            3 -> {
                mWaitGetBTN.unSelect()
            }
            4 -> {
                mFinishedBTN.unSelect()
            }
            7 -> {
                //已取消放在全部里
            }
            9 -> {
                mSalesReturnBTN.unSelect()
            }
        }
        when (type) {
            null -> mAllBTN.select()
            1 -> mWaitPayBTN.select()
            2 -> {
                mWaitSendBTN.select()
            }
            3 -> {
                mWaitGetBTN.select()
            }
            4 -> {
                mFinishedBTN.select()
            }
            7 -> {
                //已取消放在全部里
            }
            9 -> {
                mSalesReturnBTN.select()
            }
        }
        preSelect = type
        initOrder()
    }

    override fun onReturnCallback() {
        initOrder()
    }
}
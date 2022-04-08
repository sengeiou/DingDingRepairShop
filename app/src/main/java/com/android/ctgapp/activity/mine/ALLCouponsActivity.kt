package com.android.ctgapp.activity.mine

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.home.AllCouponAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.CouponAllEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.SelectButton
import kotlinx.android.synthetic.main.activity_coupons.*

/**
 *作者:LiBW
 *创建日期: 12/30/20
 *描述: 所有优惠券 页面
 */
class ALLCouponsActivity : BaseActivity() {
    private val mViewModel: ALLCouponsViewModel by lazy { ViewModelProvider(this)[ALLCouponsViewModel::class.java] }
    private val mList = ArrayList<CouponAllEntity.Data>()
    private val mAdapter = AllCouponAdapter(this, mList)
    val platformClientId by lazy{ intent.getStringExtra("platformClientId")}
    val fromCompanyId by lazy{ intent.getStringExtra("fromCompanyId")}
    //当前优惠券状态是否为可使用
    //1.未使用2 已使用3 已用完 4已过期 5已终止
    var currentCanUseType = -1

    //上次选择的页面
    private var preSelectPosition = -1

    //是否已使用。0：未使用。 1：已使用。
    private var isUsed: Int? = 1

    //是否已过期。1：未。 2：已。
    private var isOverdue: Int? = 1
    private var pageNum = 1
    override fun event() {
        //进入页面获取未使用的优惠券
        currentCanUseType = 1
        isUsed = 0
        isOverdue = 1
        handlerPosition(0)



        mCouponsRV.adapter = mAdapter
        mCouponsRV.layoutManager = LinearLayoutManager(this)

        mViewModel.error.observe(this, Observer {
            mRefresh.over()
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, Observer {
            mRefresh.over()
            dismissLoading()
            MyLog.d("优惠券列表:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, CouponAllEntity::class.java).data
                data?.let { list ->
                    mList.clear()
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
        })
    }

    private fun initData(status: Int) {
        pageNum = 1
        mList.clear()
        getData(status)
    }

    private fun getData(status:Int) {
        showLoading()
        mViewModel.getCoupons(clientId = platformClientId,companyId = fromCompanyId,status = status)
    }

    override fun click() {
        //未使用
        mUnUseBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                currentCanUseType = 1
                isUsed = 0
                isOverdue = 1
                handlerPosition(0)
            }
        })
        //已经使用的
        mUsedBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                currentCanUseType = 2
                isUsed = 1
                isOverdue = null
                handlerPosition(1)
            }
        })
        //已用完的
        mHasUsedBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                currentCanUseType = 3

                handlerPosition(2)
            }
        })
        //已过期
        mOutOfDateBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                currentCanUseType = 4
                isUsed = null
                isOverdue = 2
                handlerPosition(3)
            }
        })
        //已终止
        mFinishBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                currentCanUseType = 5
                handlerPosition(4)
            }
        })
        mRefresh.setOnLoadMoreListener {
            pageNum++
            getData(currentCanUseType)
        }
        mRefresh.setOnRefreshListener {
            initData(currentCanUseType)
        }
    }

    private fun handlerPosition(position: Int) {
        if (position != preSelectPosition) {
            when (position) {
                0 -> mUnUseBTN.select()
                1 -> mUsedBTN.select()
                2 -> mHasUsedBTN.select()
                3 -> mOutOfDateBTN.select()
                4 -> mFinishBTN.select()
            }
            when (preSelectPosition) {
                0 -> mUnUseBTN.unSelect()
                1 -> mUsedBTN.unSelect()
                2 -> mHasUsedBTN.unSelect()
                3 -> mOutOfDateBTN.unSelect()
                4 -> mFinishBTN.unSelect()
            }
            initData(currentCanUseType)
            preSelectPosition = position
        }
    }

    override fun getLayout() = R.layout.activity_coupons
}
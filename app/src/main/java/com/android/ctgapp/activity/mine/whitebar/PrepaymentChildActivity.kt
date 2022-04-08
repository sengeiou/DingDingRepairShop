package com.android.ctgapp.activity.mine.whitebar

import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.home.shop.WhiteBarReturnActivity
import com.android.ctgapp.adapter.mine.whitebar.PrepaymentChildAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityPrepaymentChildBinding
import com.android.ctgapp.entity.mine.PrepaymentChildEntity
import com.android.ctgapp.util.*
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.startActivity
import java.math.BigDecimal

/**
 *作者:LiBW
 *创建日期: 2021/6/10
 *描述:账单详情 页面(提前还款 二级)
 */
class PrepaymentChildActivity : BaseActivityV2(), PrepaymentChildAdapter.PrepaymentChildCallback {
    private val mBinding by lazy { ActivityPrepaymentChildBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private val mViewModel by lazy { ViewModelProvider(this)[PrepaymentChildViewModel::class.java] }
    private var page = 1
    private var size = 20
    private var mList = ArrayList<PrepaymentChildEntity.DataBean.PageBean.RecordsBean>()
    private val mAdapter by lazy { PrepaymentChildAdapter(this, mList, this) }
    private val companyId by lazy { intent.getIntExtra(MyConstants.COMPANY_ID, -1) }

    override fun onResume() {
        super.onResume()
        if (mList.isNotEmpty()) refreshData()
    }

    fun getData() {
        mViewModel.getNoBillList(companyId, page, size)
    }

    override fun event() {
        mBinding.mCompanyNameTV.text = intent.getStringExtra(MyConstants.COMPANY_NAME).handlerNull()
        mBinding.mNoPayMoneyTV.text = intent.getStringExtra(MyConstants.TOTAL_MONEY).handlerNull()

        mBinding.mOrderRV.adapter = mAdapter
        mBinding.mOrderRV.layoutManager = LinearLayoutManager(this)
        getData()
        mViewModel.error.observe(this, {
            mBinding.mRefresh.over()
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, { result ->
            mBinding.mRefresh.over()
            dismissLoading()
            MyLog.d("提前还款列表详情:$result")
            handlerHttpResult(result) {
                val data = getGson().fromJson(result, PrepaymentChildEntity::class.java).data
                data?.page?.let { bean ->
                    "共${bean.total.handlerNull()}笔".also { mBinding.mCountTV.text = it }
                    bean.records?.let {
                        mList.addAll(it)
                        mAdapter.notifyDataSetChanged()
                        refreshData()
                    }
                }

            }
        })
    }

    override fun click() {
        mBinding.mRefresh.setOnLoadMoreListener {
            page++
            getData()
        }
        mBinding.mRefresh.setOnRefreshListener {
            page = 1
            mList.clear()
            getData()
        }
        //立即还款
        mBinding.mBottomLayout.mPayBTN.setOnClickListener {
            startActivity<WhiteBarReturnActivity>(MyConstants.TOTAL_MONEY to BaseApplication.mWhiteBarSelectMoney.handlerNull())
        }
        mBinding.mBackIv.setOnClickListener {
            finish()
        }
    }

    override fun onItemSelect(position: Int) {
        val data=mList[position]
        startActivity<WhiteBarDealDetailActivity>(
            MyConstants.BILL_NO to data.billCycleNum.handlerNull(),
            MyConstants.COMPANY_ID to data.clientCompanyId,
            MyConstants.ORDER_NO to data.orderId.handlerNull(),
            MyConstants.COMPANY_NAME to  intent.getStringExtra(MyConstants.COMPANY_NAME).handlerNull(),
            MyConstants.NO_TITLE to true
        )
    }

    override fun onCheckBoxCheck(position: Int, select: Boolean) {
        MyLog.d("来来来 点击了按钮2")
        val data = mList[position]
        //选中
        if (select) {
            BaseApplication.mWhiteBarSelectOrderNO.add(data.orderId.handlerNull())
            BaseApplication.mWhiteBarSelectMoney = BaseApplication.mWhiteBarSelectMoney.add(BigDecimal(data.amount.handlerNull()))
        } else {
            if (data.orderId in BaseApplication.mWhiteBarSelectOrderNO) {
                BaseApplication.mWhiteBarSelectOrderNO.remove(data.orderId)
                BaseApplication.mWhiteBarSelectMoney = BaseApplication.mWhiteBarSelectMoney.subtract(BigDecimal(data.amount.handlerNull()))
            }
        }
        handlerCountAndButton()
    }

    //处理按钮和选中数量
    private fun handlerCountAndButton() {
        MyLog.d("来来来 有点东西的触发了呀")
        val selectCount = "已选${BaseApplication.mWhiteBarSelectOrderNO.size.handlerNull()}笔"
        mBinding.mBottomLayout.mSelectCountTV.text = selectCount
        if (BaseApplication.mWhiteBarSelectOrderNO.isNotEmpty()) {
            mBinding.mBottomLayout.mPayBTN.isEnabled = true
            mBinding.mBottomLayout.mPayBTN.backgroundResource = R.drawable.bg_btn_common
        } else {
            mBinding.mBottomLayout.mPayBTN.isEnabled = false
            mBinding.mBottomLayout.mPayBTN.backgroundResource = R.drawable.bg_btn_gray_circle
        }
        //总价
        mBinding.mBottomLayout.mSelectMoneyTV.text = BaseApplication.mWhiteBarSelectMoney.handlerNull()
    }

    private fun refreshData() {
        MyLog.d("来来来:${BaseApplication.mWhiteBarSelectOrderNO}")
        if (mList.isEmpty()) return
        //处理选中状态
        mList.forEach { a ->
            BaseApplication.mWhiteBarSelectOrderNO.forEach abc@{ bean ->
                if (a.orderId == bean) {
                    a.selected = true
                    return@abc
                }
            }
        }
        mAdapter.notifyDataSetChanged()
        handlerCountAndButton()
    }
}
package com.android.ctgapp.activity.mine.whitebar

import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.home.shop.WhiteBarReturnActivity
import com.android.ctgapp.adapter.mine.whitebar.PrepaymentAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityPrepaymentBinding
import com.android.ctgapp.entity.mine.PrepaymentEntity
import com.android.ctgapp.entity.mine.WhiteBarMorePayBean
import com.android.ctgapp.util.*
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.startActivity
import java.math.BigDecimal

/**
 *作者:LiBW
 *创建日期: 2021/6/7
 *描述:账单详情 页面 (提前还款 一级)
 */
class PrepaymentActivity : BaseActivityV2(), PrepaymentAdapter.PrepaymentCallback {
    private val mBinding by lazy { ActivityPrepaymentBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private val mViewModel by lazy { ViewModelProvider(this)[PrepaymentViewModel::class.java] }
    private val mList = ArrayList<PrepaymentEntity.DataBean.ListBean>()
    private val mAdapter by lazy { PrepaymentAdapter(this, mList, this) }
    override fun onResume() {
        super.onResume()
        if (mList.isNotEmpty()) refreshData()
    }

    override fun event() {
        mBinding.mPrepaymentRV.adapter = mAdapter
        mBinding.mPrepaymentRV.layoutManager = LinearLayoutManager(this)
        mViewModel.getNoBillList()
        mViewModel.error.observe(this, {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, {
            dismissLoading()
            MyLog.d("账单详情:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, PrepaymentEntity::class.java).data
                mBinding.mAllMoneyTV.text = data?.allMoney.handlerNull()
                data?.list?.let { list ->
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                    refreshData()
                    BaseApplication.mWhiteBarAllBean.clear()
                    list.forEach { array ->
                        array.orderList?.forEach { allOrder ->
                            val bean = WhiteBarMorePayBean.Data()
                            bean.orderNo = allOrder.orderNo.handlerNull()
                            bean.totalPrice = allOrder.noPayMoney.handlerNull()
                            BaseApplication.mWhiteBarAllBean.add(bean)
                        }
                    }


                }
            }
        })
    }

    override fun click() {
        mBinding.mBackIv.setOnClickListener {
            MyLog.d("点击点击")
            finish()
        }

        mBinding.mBottomLayout.mPayBTN.setOnClickListener {
            if (mBinding.mBottomLayout.mSelectCountTV.text == "0") {
                showToast("请至少选择一笔交易进行还款")
            } else {
                startActivity<WhiteBarReturnActivity>(MyConstants.TOTAL_MONEY to BaseApplication.mWhiteBarSelectMoney.handlerNull())
            }
        }
    }

    override fun onItemSelect(position: Int) {
        val data = mList[position]
        startActivity<PrepaymentChildActivity>(
            MyConstants.COMPANY_ID to data.clientCompanyId,
            MyConstants.COMPANY_NAME to data.companyName,
            MyConstants.TOTAL_MONEY to data.noPayMoney.handlerNull()
        )
    }

    override fun onCheckBoxCheck(position: Int, select: Boolean) {
        val data = mList[position]
        //选中
        if (select) {
            MyLog.d("有点东西数量:${data.orderList?.size}")
            data.orderList?.forEach {
                val money = it.noPayMoney.handlerNull()
                if (money != "0" && money != "0.0" && money != "0.00" && money.isNotEmpty()) {
                    BaseApplication.mWhiteBarSelectOrderNO.add(it.orderNo)
                    BaseApplication.mWhiteBarSelectMoney = BaseApplication.mWhiteBarSelectMoney.add(BigDecimal(it.noPayMoney.handlerNull()))
                }
            }
        } else {
            data.orderList?.forEach {
                if (it.orderNo in BaseApplication.mWhiteBarSelectOrderNO) {
                    BaseApplication.mWhiteBarSelectOrderNO.remove(it.orderNo)
                    BaseApplication.mWhiteBarSelectMoney = BaseApplication.mWhiteBarSelectMoney.subtract(BigDecimal(it.noPayMoney.handlerNull()))
                }
            }
        }
        handlerCountAndButton()
    }

    private fun refreshData() {
        if (mList.isEmpty()) return
        //处理选中状态
        mList.forEach { a ->
            a.orderList?.forEach abc@{ b ->
                BaseApplication.mWhiteBarSelectOrderNO.forEach { bean ->
                    if (b.orderNo == bean) {
                        a.selected = true
                        return@abc
                    }
                }
            }
        }
        mAdapter.notifyDataSetChanged()
        handlerCountAndButton()
    }


    //处理按钮和选中数量
    private fun handlerCountAndButton() {
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

    override fun onDestroy() {
        super.onDestroy()
        BaseApplication.clearWhiteBarData()
    }
}
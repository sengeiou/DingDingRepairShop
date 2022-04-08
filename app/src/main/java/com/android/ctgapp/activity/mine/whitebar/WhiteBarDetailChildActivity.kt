package com.android.ctgapp.activity.mine.whitebar

import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.home.shop.WhiteBarReturnActivity
import com.android.ctgapp.adapter.mine.whitebar.WhiteBarDetailChildAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityWhiteBarDetailChildBinding
import com.android.ctgapp.entity.mine.WhiteBarDetailChildEntity
import com.android.ctgapp.util.*
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource
import java.math.BigDecimal

/**
 *作者:LiBW
 *创建日期: 2021/5/27
 *描述:白条 账单详情 页面 (还款 二级页面) 可以进行对账
 */
class WhiteBarDetailChildActivity : BaseActivityV2(), WhiteBarDetailChildAdapter.WhiteBarDetailChildCallback {
    private val mViewModel by lazy { ViewModelProvider(this)[WhiteBarDetailChildViewModel::class.java] }
    private val mBinding by lazy { ActivityWhiteBarDetailChildBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private val mList = ArrayList<WhiteBarDetailChildEntity.DataBean.ListBean>()
    private val mAdapter by lazy { WhiteBarDetailChildAdapter(this, mList, this) }
    private val companyId by lazy { intent.getIntExtra(MyConstants.COMPANY_ID, 0) }
    private val billNo by lazy { intent.getStringExtra(MyConstants.BILL_NO) }
    private val billNoForConfirm by lazy { intent.getStringExtra(MyConstants.BILL_NO_FOR_CONFIRM) }
    private val needInvoice by lazy { intent.getBooleanExtra(MyConstants.NEED_INVOICE, false) }
    private val totalMoney by lazy { intent.getStringExtra(MyConstants.TOTAL_MONEY) }
    private val companyName by lazy { intent.getStringExtra(MyConstants.COMPANY_NAME).handlerNull() }
    override fun onResume() {
        super.onResume()
        if (mList.isNotEmpty()) {
            refreshData()
        }
    }

    override fun event() {
        mBinding.mCompanyNameTV.text = companyName
        mBinding.mRecyclerView.adapter = mAdapter
        mBinding.mRecyclerView.layoutManager = LinearLayoutManager(this)
        mViewModel.getList(billNo, companyId)
        mViewModel.result.observe(this, {
            MyLog.d("账单详情子页面:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, WhiteBarDetailChildEntity::class.java).data
                var canClick = false
                val text=if(needInvoice) "开票" else "不开票"
                mBinding.mIsNeedInvoice.text=text
                data?.let { bean ->
                    //0.对账中 1.未还款 2.已还款 6.等待对方确认对账
                    when (bean.retrunType) {
                        0 -> {
                            val text = if (needInvoice) "对账中(发票信息)" else "对账中"
                            mBinding.mOrderStatueTV.text = text
                            mBinding.mOrderStatueTV.textColorResource = R.color.blue_light
                        }
                        6 -> {
                            val text = if (needInvoice) "等待对方确认对账(发票信息)" else "等待对方确认对账"
                            mBinding.mOrderStatueTV.text = text
                            mBinding.mOrderStatueTV.textColorResource = R.color.blue_light
                        }
                        1 -> {
                            canClick = true
                            val text = if (needInvoice) "未还款(发票信息)" else "未还款"
                            mBinding.mOrderStatueTV.text = text
                            mBinding.mOrderStatueTV.textColorResource = R.color.red_start
                        }
                        2 -> {
                            val text = if (needInvoice) "已还款(发票信息)" else "已还款"
                            mBinding.mOrderStatueTV.text = text
                            mBinding.mOrderStatueTV.textColorResource = R.color.green_color
                        }
                    }
                    mBinding.mConfirmRL.visibility = View.GONE
                    mBinding.mPayRl.visibility = View.GONE

                    //0:app未对账 1:app已经对过账了
                    if (data.receiverConfirm==1){
                        if (data.type==1){
                            //展示立即还款按钮
                            mBinding.mPayRl.visibility = View.VISIBLE
                        }
                    }else{
                        //为0时候可以对账
                        mBinding.mConfirmRL.visibility = View.VISIBLE
                    }

                    val money = "¥$totalMoney"
                    mBinding.mTotalMoneyTV.text = money
                    "共${bean.list?.size}笔".also { c -> mBinding.mCountTV.text = c }
                }
                //处理列表
                data?.list?.let { list ->
                    mList.clear()
                    list.forEach { bean ->
                        bean.canSelect = canClick
                    }

                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
            refreshData()
        })
        mViewModel.confirmResult.observe(this, {
            MyLog.d("确认对账回调:$it")
            handlerHttpResult(it) {
                showToast("确认对账成功")
                startActivity<WhiteBarV2Activity>(MyConstants.REFRESH_DATA to true)
//                mViewModel.getList(billNo, companyId)
            }
        })
    }

    private fun refreshData() {
        if (mList.isEmpty()) return
        mList.forEach abc@{ a ->
            BaseApplication.mWhiteBarSelectOrderNO.forEach { bean ->
                if (a.orderNo == bean) {
                    a.selected = true
                    return@abc
                }
            }
        }
        mAdapter.notifyDataSetChanged()
        handlerCountAndButton()
    }

    //处理按钮和选中数量
    private fun handlerCountAndButton() {
        val selectCount = "已选${BaseApplication.mWhiteBarSelectOrderNO.size.handlerNull()}笔"
        mBinding.mSelectCountTV.text = selectCount
        if (BaseApplication.mWhiteBarSelectOrderNO.isNotEmpty()) {
            mBinding.mPayBTN.isEnabled = true
            mBinding.mPayBTN.backgroundResource = R.drawable.bg_btn_common
        } else {
            mBinding.mPayBTN.isEnabled = false
            mBinding.mPayBTN.backgroundResource = R.drawable.bg_btn_gray_circle
        }
        //总价
        mBinding.mSelectMoneyTV.text = BaseApplication.mWhiteBarSelectMoney.handlerNull()
    }


    override fun click() {
        mBinding.mBackIv.setOnClickListener {
            MyLog.d("点击了关闭")
            finish()
        }
        //确认对账 按钮
        mBinding.mConfirmBTN.setOnClickListener {
            mViewModel.whiteBarConfirm(billNoForConfirm)
        }
        //立即还款
        mBinding.mPayBTN.setOnClickListener {
            if (BaseApplication.mWhiteBarSelectMoney.handlerNull() == "0") {
                showToast("请对账后再进行还款")
            } else {
                startActivity<WhiteBarReturnActivity>(
                    MyConstants.TOTAL_MONEY to BaseApplication.mWhiteBarSelectMoney.handlerNull()
                )
            }
        }
    }

    override fun onCheckBoxClick(position: Int, select: Boolean) {
        val data = mList[position]
        //选中
        if (select) {
            BaseApplication.mWhiteBarSelectOrderNO.add(data.orderNo.handlerNull())
            BaseApplication.mWhiteBarSelectMoney = BaseApplication.mWhiteBarSelectMoney.add(BigDecimal((data.billMoney-data.orderMoney).handlerNull()))

        } else {
            if (data.orderNo in BaseApplication.mWhiteBarSelectOrderNO) {
                BaseApplication.mWhiteBarSelectOrderNO.remove(data.orderNo.handlerNull())
                BaseApplication.mWhiteBarSelectMoney = BaseApplication.mWhiteBarSelectMoney.subtract(BigDecimal((data.billMoney-data.orderMoney).handlerNull()))
            }
        }
        handlerCountAndButton()
    }

    override fun onItemClick(position: Int) {
        val data = mList[position]

        startActivity<WhiteBarDealDetailActivity>(
            MyConstants.BILL_NO to intent.getStringExtra(MyConstants.BILL_NO).handlerNull(),
            MyConstants.COMPANY_ID to intent.getIntExtra(MyConstants.COMPANY_ID, -1),
            MyConstants.ORDER_NO to data.orderNo.handlerNull(),
            MyConstants.COMPANY_NAME to companyName
        )
    }
}
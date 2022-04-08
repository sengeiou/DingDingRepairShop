package com.android.ctgapp.activity.mine.whitebar

import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.home.shop.WhiteBarReturnActivity
import com.android.ctgapp.adapter.mine.whitebar.WhitBarDetailAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityWhiteBarDetailBinding
import com.android.ctgapp.entity.mine.WhiteBarDetailEntity
import com.android.ctgapp.util.*
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.startActivity
import java.math.BigDecimal

/**
 *作者:LiBW
 *创建日期: 2021/5/27
 *描述:白条 账单详情 页面 (还款 一级页面)
 */
class WhiteBarDetailActivity : BaseActivityV2(), WhitBarDetailAdapter.WhitBarDetailCallback {

    private val mBinding by lazy { ActivityWhiteBarDetailBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    val mViewModel by lazy { ViewModelProvider(this)[WhiteBarDetailViewModel::class.java] }
    private val billNo by lazy { intent.getStringExtra(MyConstants.BILL_NO) }
    private val mList = ArrayList<WhiteBarDetailEntity.DataBean.ListBean>()
    private val mAdapter by lazy { WhitBarDetailAdapter(this, mList, this) }

    //是否需要开发票
    private var needInvoice = false

    //对账总额
    private var allMoney = ""
    override fun onResume() {
        super.onResume()
        refreshData()
    }

    private fun refreshData() {
        if (mList.isEmpty()) return
        mList.forEach { a ->
            a.list?.forEach abc@{ b ->
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

    override fun event() {
        mBinding.mWhiteBarDetailRV.adapter = mAdapter
        mBinding.mWhiteBarDetailRV.layoutManager = LinearLayoutManager(this)

        mViewModel.getList(billNo)
        mViewModel.result.observe(this, {
            MyLog.d("账单详情:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, WhiteBarDetailEntity::class.java).data
                data?.let {
                    mBinding.mPayMoneyTV.text = data.returnMoney.handlerNull()
                    val time = "最迟还款日:${data.lastDay.handlerNull()}"
                    mBinding.mLastTimeTV.text = time
                    mBinding.mOrderNumberTV.text = data.billNo.handlerNull()
                    mBinding.mOrderCycleTV.text = data.billCycle.handlerNull()
                    val money = "¥${data.totalMoney.handlerNull()}"
                    mBinding.mAllMoneyTV.text = money
                    val invoice = if (data.invoiceType == 1) "开票" else "不开票"
                    needInvoice = data.invoiceType == 1
                    mBinding.mNeedInvoiceTV.text = invoice
                    allMoney = data.totalMoney.handlerNull()
                }

                data?.list?.let { list ->
                    mList.clear()
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
                refreshData()
            }
        })


    }

    override fun click() {
        mBinding.mBackIv.setOnClickListener {
            MyLog.d("点击结束了")
            finish()
        }
        //客服
        mBinding.mCustomerTV.setOnClickListener {
            showToast(MyConstants.FUNCTION_NOT_OPEN)
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
        mBinding.mCopyTV.setOnClickListener {
            copyTextToPhone(this,mBinding.mOrderNumberTV.text.toString())
            showToast("账单号已复制到剪切板")
        }
    }

    override fun onItemSelect(position: Int) {
        val data=mList[position]
        startActivity<WhiteBarDetailChildActivity>(
            MyConstants.BILL_NO to billNo,
            MyConstants.COMPANY_ID to data.companyId,
            MyConstants.NEED_INVOICE to needInvoice,
            MyConstants.TOTAL_MONEY to allMoney,
            MyConstants.BILL_NO_FOR_CONFIRM to data.billNum,
            MyConstants.COMPANY_NAME to data.orgName.handlerNull()
        )
    }

    override fun onCheckBoxSelect(position: Int, select: Boolean) {
        val data = mList[position]
        //选中
        if (select) {
            MyLog.d("有点东西数量:${data.list?.size}")
            data.list?.forEach {
                BaseApplication.mWhiteBarSelectOrderNO.add(it.orderNo)
                BaseApplication.mWhiteBarSelectMoney = BaseApplication.mWhiteBarSelectMoney.add(BigDecimal(it.noPayMoney))
            }
        } else {
            data.list?.forEach {
                if (it.orderNo in BaseApplication.mWhiteBarSelectOrderNO) {
                    BaseApplication.mWhiteBarSelectOrderNO.remove(it.orderNo)
                    BaseApplication.mWhiteBarSelectMoney = BaseApplication.mWhiteBarSelectMoney.subtract(BigDecimal(it.noPayMoney))
                }
            }
        }
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
        mBinding.mSelectMoneyTV.text = BaseApplication.mWhiteBarSelectMoney.handlerNull()
    }
}
package com.android.ctgapp.activity.mine.whitebar

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.home.shop.WhiteBarReturnActivity
import com.android.ctgapp.activity.mine.ShouXinCompanyctivity
import com.android.ctgapp.adapter.mine.whitebar.WhiteBarAdapterV2
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityWhiteBarV2Binding
import com.android.ctgapp.entity.WhiteBarEntityV2
import com.android.ctgapp.entity.mine.WhiteBarMorePayBean
import com.android.ctgapp.util.*
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.startActivity
import java.math.BigDecimal

/**
 *作者:LiBW
 *创建日期: 2021/5/26
 *描述: 白条 页面 白条账单 挂账账单 页面 我的白条 页面
 */
class WhiteBarV2Activity : BaseActivityV2(), WhiteBarAdapterV2.WhiteBarAdapterV2CallBack {
    private val mBinding by lazy { ActivityWhiteBarV2Binding.inflate(layoutInflater) }
    private val mViewModel: WhiteBarViewModel by lazy { ViewModelProvider(this)[WhiteBarViewModel::class.java] }
    private val mList = ArrayList<WhiteBarEntityV2.DataBean.ListBeanX>()
    private val mAdapter by lazy { WhiteBarAdapterV2(this, mList, this) }
    private var mAllUnPayMoney = "0"

    //所有可以选中的项目数量
    private var mAllCanSelect = 0

    //已选中数量
    private var mCurrentSelect = 0
    override fun getLayout() = mBinding.root


    override fun onResume() {
        super.onResume()
        mViewModel.getWhiteBar()
        refreshData()
    }

    private fun refreshData() {
        if (mList.isEmpty()) return
        //处理选中状态
        mList.forEach { a ->
            a.list?.forEach { b ->
                b.list?.forEach abc@{ c ->
                    BaseApplication.mWhiteBarSelectOrderNO.forEach { bean ->
                        if (c.orderNo == bean) {
                            b.selected = true
                            return@abc
                        }
                    }
                }
            }
        }
        mAdapter.notifyDataSetChanged()
        handlerCountAndButton()
    }


    override fun event() {
        mBinding.mWhiteBarRV.adapter = mAdapter
        mBinding.mWhiteBarRV.layoutManager = LinearLayoutManager(this)

        mViewModel.whiteBarResult.observe(this, {
            MyLog.d("挂账账单:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, WhiteBarEntityV2::class.java).data
                data?.let {
                    mBinding.mWaitPayTV.text = data.noPayMoney.handlerNull()
                    mAllUnPayMoney = data.noPayMoney.handlerNull()
                    //未出账
                    mBinding.mUnAccountMoneyTV.text = data.nobillMoney.handlerNull()
                }

                data?.list?.let { list ->
                    mList.clear()
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }

                val beanList = ArrayList<WhiteBarMorePayBean.Data>()
                mAllCanSelect = 0
                data?.list?.forEach { list1 ->
                    list1.list?.forEach { bean ->
                        bean.list?.forEach { chile ->
                            val b = WhiteBarMorePayBean.Data()
                            b.orderNo = chile.orderNo
                            b.totalPrice = chile.noPayMoney
                            beanList.add(b)
                        }
                        if (bean.returnType == 0) {
                            mAllCanSelect++
                        }
                    }
                }
                BaseApplication.mWhiteBarAllBean = beanList
            }
        })
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        intent?.let {
            when {
                intent.getBooleanExtra(MyConstants.REFRESH_DATA, false) -> {
                    mViewModel.getWhiteBar()
                }
                intent.getBooleanExtra(MyConstants.INIT_DATA, false) -> {
                    BaseApplication.clearWhiteBarData()
                    mViewModel.getWhiteBar()
                }
            }


        }
    }

    override fun click() {
        //返回
        mBinding.mBackIv.setOnClickListener {
            finish()
        }
        //授信企业
        mBinding.mCreditCompanyIV.setOnClickListener {
            startActivity<ShouXinCompanyctivity>(MyConstants.TOTAL_MONEY to mAllUnPayMoney)
        }
        //交易流水
        mBinding.mDealFlowIV.setOnClickListener {
            startActivity<CheckFlowActivity>()
        }
        //提前还款
        mBinding.mPrepaymentBTN.setOnClickListener {
            BaseApplication.clearWhiteBarData()
            startActivity<PrepaymentActivity>()
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
        //全选
//        binding.mCheckBox.setOnClickListener {
//            val select = binding.mCheckBox.isChecked
//            MyLog.d("选中状态:$select")
//            mList.forEach {
//                it.list?.forEach { bean ->
//                    bean.selected = select
//                }
//            }
//            val selectCount: String
//            if (select) {
//                selectMoney = BigDecimal(allUnPayMoney)
//                selectCount = "已选${allCanSelect.handlerNull()}笔"
//                currentSelect = allCanSelect
//            } else {
//                currentSelect = 0
//                selectMoney = BigDecimal("0")
//                selectCount = "已选0笔"
//            }
//            binding.mSelectCountTV.text = selectCount
//            binding.mSelectMoneyTV.text = selectMoney.handlerNull()
//            mAdapter.notifyDataSetChanged()
//        }
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

    //项目点击
    override fun onItemClick(positionParent: Int, positionChild: Int, select: Boolean) {
        val data = mList[positionParent].list!![positionChild]
        //选中
        if (select) {
            MyLog.d("有点东西数量:${data.list?.size}")
            data.list?.forEach {
                BaseApplication.mWhiteBarSelectOrderNO.add(it.orderNo)
                BaseApplication.mWhiteBarSelectMoney = BaseApplication.mWhiteBarSelectMoney.add(BigDecimal(it.noPayMoney.handlerNull()))
            }
        } else {
            data.list?.forEach {
                if (it.orderNo in BaseApplication.mWhiteBarSelectOrderNO) {
                    BaseApplication.mWhiteBarSelectOrderNO.remove(it.orderNo)
                    BaseApplication.mWhiteBarSelectMoney = BaseApplication.mWhiteBarSelectMoney.subtract(BigDecimal(it.noPayMoney.handlerNull()))
                }
            }
        }
        handlerCountAndButton()
//        MyLog.d("点击状态:$select")
//        val money = mList[positionParent].list?.get(positionChild)?.noPayMoney.handlerNull()
//        val selectCount: String
//        if (select) {
//            selectCount = "已选${++currentSelect}笔"
//            selectMoney = selectMoney.add(BigDecimal(money))
//        } else {
//            selectCount = "已选${--currentSelect}笔"
//            selectMoney = selectMoney.subtract(BigDecimal(money))
//        }
//        binding.mSelectMoneyTV.text = selectMoney.handlerNull()
//        binding.mSelectCountTV.text = selectCount
//        mList[positionParent].list?.get(positionChild)?.selected = select
//        mAdapter.notifyDataSetChanged()
//        var allSelect = true
//        //判断是否为全选中
//        mList.forEach {
//            it.list?.forEach { bean ->
//                //需还款的item
//                if (bean.returnType == 0 && !bean.selected) {
//                    allSelect = false
//                }
//            }
//        }
//        binding.mCheckBox.isChecked = allSelect
    }

    override fun onDestroy() {
       BaseApplication.clearWhiteBarData()
        super.onDestroy()
    }
}
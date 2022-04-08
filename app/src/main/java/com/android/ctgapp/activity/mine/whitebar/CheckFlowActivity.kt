package com.android.ctgapp.activity.mine.whitebar

import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import cn.jpush.android.service.DaemonService
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.CheckFlowAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityCheckFlowBinding
import com.android.ctgapp.entity.mine.JiaoYiLiuShuiEntity
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.util.*
import okhttp3.ResponseBody
import org.jetbrains.anko.backgroundResource
import kotlin.math.absoluteValue

/**
 *作者:LiBW
 *创建日期: 2021/5/26
 *描述:查看流水 页面 交易流水 页面
 */
class CheckFlowActivity : BaseActivityV2() {
    override fun getLayout() = binding.root
    val binding by lazy { ActivityCheckFlowBinding.inflate(layoutInflater) }
    private val mList = ArrayList<JiaoYiLiuShuiEntity.DataBean.RecordsBean>()
    private val mAdapter by lazy { CheckFlowAdapter(this, mList) }
    private var mMap = HashMap<Int, Int>(3)
    private val mPreMap = HashMap<Int, Int>(3)
    private var search = ""
    private var page = 1

    //1：挂账  2：微信  3：支付宝   4：余额 5:erp支付 6：线下支付 7储值卡 8代金券
    private var payWay = ""

    //1开票 2 不开票
    private var invoiceType = ""

    //1：采购  2：销售  3：销售订单退货（客户向我退货） 4.采购订单退货（我向供应商退货） 5.销售订单
    private var actionType = ""
    val liushuiListener = object : ObserverListener {
        override fun onNext(t: ResponseBody) {
            binding.mRefresh.over()
            loading.dismiss()
            val str = t.string().handlerNull()
            MyLog.d("交易流水回调:$str")
            handlerHttpResult(str) {
                val data = getGson().fromJson(str, JiaoYiLiuShuiEntity::class.java).data
                data?.records?.let { list ->
                    if (page == 1) mList.clear()
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
        }

        override fun onError(error: String) {
            binding.mRefresh.over()
            loading.dismiss()
            showToast(error)
        }
    }

    private fun initData() {
        page = 1
        getData()
    }

    private fun getData() {
        ApiMethods.jiaoyiliushui(
            MyObserver(liushuiListener),
            BaseApplication.companyId.handlerNull(),
            search,
            page,
            20,
            payWay,
            invoiceType,
            actionType,
        )
    }


    override fun event() {


        initData()
        //抽屉打开后底层页面禁止点击
        binding.mDrawerLayout.bottomCannotClick()
        binding.mCheckFlowRV.adapter = mAdapter
        binding.mCheckFlowRV.layoutManager = LinearLayoutManager(this)
    }

    override fun click() {
        binding.mSearchET.handlerEditTextSearch(this) {
            search = it
            initData()
        }
        binding.mSearchET.handlerText {
            if (it.isEmpty()) {
                search = ""
                initData()
            }
        }


        binding.mRefresh.setOnLoadMoreListener {
            page++
            getData()
        }
        binding.mRefresh.setOnRefreshListener {
            initData()
        }

        binding.mBackIv.setOnClickListener {
            finish()
        }
        //打开抽屉
        binding.mDrawerIV.setOnClickListener {
            mMap.forEach {
                refreshDraw(it.key, it.value)
            }
            binding.mDrawerLayout.openDrawer(GravityCompat.END)
        }
        //确认
        binding.mConfirmBTN.setOnClickListener {
            mMap.clear()
            mPreMap.forEach {
                mMap[it.key] = it.value
            }
            when (mMap[0]) {
                0 -> invoiceType = ""
                1 -> invoiceType = "1"
                2 -> invoiceType = "2"
            }
            //1：挂账  2：微信  3：支付宝   4：余额 5:erp支付 6：线下支付 7储值卡 8代金券
            when (mMap[1]) {
                0 -> {
                    payWay = ""
                    binding.mTabLayout.getTabAt(0)?.select()
//                    binding.mTabLayout.setScrollPosition(0,0f,false)
                }
                1 -> {
                    binding.mTabLayout.getTabAt(3)?.select()

                    payWay = "1"
//                    binding.mTabLayout.setScrollPosition(3,0f,false)
                }
                2 -> {
                    payWay = "2"
                    binding.mTabLayout.getTabAt(1)?.select()

//                    binding.mTabLayout.setScrollPosition(1,0f,false)
                }
                3 -> {
                    binding.mTabLayout.getTabAt(2)?.select()

                    payWay = "3"
//                    binding.mTabLayout.setScrollPosition(2,0f,false)
                }
                4 -> {
                    binding.mTabLayout.getTabAt(4)?.select()

                    payWay = "7"
//                    binding.mTabLayout.setScrollPosition(2,0f,false)
                }
                5 -> {
                    binding.mTabLayout.getTabAt(5)?.select()

                    payWay = "8"
//                    binding.mTabLayout.setScrollPosition(2,0f,false)
                }
            }
            //1：采购  2：销售  3：销售订单退货（客户向我退货） 4.采购订单退货（我向供应商退货） 5.销售订单
            when (mMap[2]) {
                0 -> payWay = ""
                1 -> payWay = "1"
                2 -> payWay = "4"
            }
            initData()
            binding.mDrawerLayout.closeDrawer(GravityCompat.END)
        }

        binding.mInvoice1.setOnClickListener {
            refreshDraw(0, 0)
            mPreMap[0] = 0
        }
        binding.mInvoice2.setOnClickListener {
            refreshDraw(0, 1)
            mPreMap[0] = 1
        }
        binding.mInvoice3.setOnClickListener {
            refreshDraw(0, 2)
            mPreMap[0] = 2
        }
        //1：挂账  2：微信  3：支付宝   4：余额 5:erp支付 6：线下支付
        binding.mPayWay1.setOnClickListener {
            refreshDraw(1, 0)
            mPreMap[1] = 0
        }
        binding.mPayWay2.setOnClickListener {
            refreshDraw(1, 1)
            mPreMap[1] = 1
        }
        binding.mPayWay3.setOnClickListener {
            refreshDraw(1, 2)
            mPreMap[1] = 2
        }
        binding.mPayWay4.setOnClickListener {
            refreshDraw(1, 3)
            mPreMap[1] = 3
        }
        binding.mPayWay7.setOnClickListener {
            refreshDraw(1, 4)
            mPreMap[1] = 4
        }
        binding.mPayWay8.setOnClickListener {
            refreshDraw(1, 5)
            mPreMap[1] = 5
        }
        //1：采购  2：销售  3：销售订单退货（客户向我退货） 4.采购订单退货（我向供应商退货） 5.销售订单
        actionType = ""
        binding.mDealType1.setOnClickListener {
            refreshDraw(2, 0)
            mPreMap[2] = 0
        }
        binding.mDealType2.setOnClickListener {
            refreshDraw(2, 1)
            mPreMap[2] = 1

        }
        binding.mDealType3.setOnClickListener {
            refreshDraw(2, 2)
            mPreMap[2] = 2
        }
        //重置
        binding.mResetBTN.setOnClickListener {
            refreshDraw(0, 0)
            refreshDraw(1, 0)
            refreshDraw(2, 0)
            mPreMap[0] = 0
            mPreMap[1] = 0
            mPreMap[2] = 0
        }
        //1：挂账  2：微信  3：支付宝   4：余额 5:erp支付 6：线下支付 7储值卡 8代金券
        binding.mTabLayout.handlerSelectReturnText { tab ->
            when (tab) {
                "全部" -> {
                    mMap[1]=0
                    payWay = ""
                    initData()
                }
                "微信" -> {
                    mMap[1]=2
                    payWay = "2"
                    initData()
                }
                "支付宝" -> {
                    mMap[1]=3
                    payWay = "3"
                    initData()
                }
                "白条" -> {
                    mMap[1]=1
                    payWay = "1"
                    initData()
                }
                "钱包" -> {
                    mMap[1]=0
                    payWay = "4"
                    initData()
                }
                "储值卡" -> {
                    mMap[1]=4
                    payWay = "7"
                    initData()
                }
                "代金券" -> {
                    mMap[1]=5
                    payWay = "8"
                    initData()
                }
            }
        }
    }

    private fun refreshDraw(position: Int, position2: Int) {
        when (position) {
            0 -> {
                binding.mInvoice1.backgroundResource = R.drawable.bg_edit_gray_circle
                binding.mInvoice2.backgroundResource = R.drawable.bg_edit_gray_circle
                binding.mInvoice3.backgroundResource = R.drawable.bg_edit_gray_circle
                when (position2) {
                    0 -> binding.mInvoice1.backgroundResource = R.drawable.bg_border_acc_circle
                    1 -> binding.mInvoice2.backgroundResource = R.drawable.bg_border_acc_circle
                    2 -> binding.mInvoice3.backgroundResource = R.drawable.bg_border_acc_circle
                }
            }
            1 -> {
                binding.mPayWay1.backgroundResource = R.drawable.bg_edit_gray_circle
                binding.mPayWay2.backgroundResource = R.drawable.bg_edit_gray_circle
                binding.mPayWay3.backgroundResource = R.drawable.bg_edit_gray_circle
                binding.mPayWay4.backgroundResource = R.drawable.bg_edit_gray_circle
                binding.mPayWay7.backgroundResource = R.drawable.bg_edit_gray_circle
                binding.mPayWay8.backgroundResource = R.drawable.bg_edit_gray_circle
                when (position2) {
                    0 -> binding.mPayWay1.backgroundResource = R.drawable.bg_border_acc_circle
                    1 -> binding.mPayWay2.backgroundResource = R.drawable.bg_border_acc_circle
                    2 -> binding.mPayWay3.backgroundResource = R.drawable.bg_border_acc_circle
                    3 -> binding.mPayWay4.backgroundResource = R.drawable.bg_border_acc_circle
                    4 -> binding.mPayWay7.backgroundResource = R.drawable.bg_border_acc_circle
                    5 -> binding.mPayWay8.backgroundResource = R.drawable.bg_border_acc_circle
                }
            }
            2 -> {
                binding.mDealType1.backgroundResource = R.drawable.bg_edit_gray_circle
                binding.mDealType2.backgroundResource = R.drawable.bg_edit_gray_circle
                binding.mDealType3.backgroundResource = R.drawable.bg_edit_gray_circle
                when (position2) {
                    0 -> binding.mDealType1.backgroundResource = R.drawable.bg_border_acc_circle
                    1 -> binding.mDealType2.backgroundResource = R.drawable.bg_border_acc_circle
                    2 -> binding.mDealType3.backgroundResource = R.drawable.bg_border_acc_circle
                }
            }
        }
    }

}
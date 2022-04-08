package com.android.ctgapp.activity.deal

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.deal.AfterSaleAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityAfterSaleBinding
import com.android.ctgapp.entity.deal.AfterSaleListEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.SelectButton
import kotlinx.android.synthetic.main.activity_after_sale.*

/**
 *作者:LiBW
 *创建日期: 11/25/20
 *描述: 售后/退货 退款 页面
 */
class AfterSaleActivity : BaseActivityV2() {

    val binding by lazy { ActivityAfterSaleBinding.inflate(layoutInflater) }
    override fun getLayout() = binding.root

    private val mViewModel: AfterSaleViewModel by lazy { ViewModelProvider(this)[AfterSaleViewModel::class.java] }

    private val pageSize = 20
    private var pageNum = 1

    //1-已申请  审核中  //2-同意退货 待发货 //5-已收货  验货中  //8-退款中  //6-已完成(拒绝退货  验货不通过 退款完成  已取消)
    private var statueCode: Int? = null
    private var isFinished: Boolean? = null
    private var preSelect: Int? = null
    private var mList = ArrayList<AfterSaleListEntity.DataBean.RecordsBean>()
    private val mAdapter: AfterSaleAdapter by lazy { AfterSaleAdapter(this, mList) }

    override fun event() {
        binding.mAfterSaleRV.adapter = mAdapter
        binding.mAfterSaleRV.layoutManager = LinearLayoutManager(this)

        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            mRefresh.over()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.listResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("售后列表回调:$it")
            mRefresh.over()
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, AfterSaleListEntity::class.java).data
                data?.records?.let { list ->
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
        })
    }

    override fun onResume() {
        super.onResume()
        initData()
    }

    private fun initData() {
        mList.clear()
        pageNum = 1
        getData()
    }

    private fun getData() {
        loading.show()
        mViewModel.getList(pageNum, pageSize, statueCode, isFinished)
    }


    override fun click() {
        //全部
        binding.mAllBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(null)
            }
        })


        //1-已申请  审核中  //2-同意退货 待发货 //5-已收货  验货中  //8-退款中  //6-已完成(拒绝退货  验货不通过 退款完成  已取消)

        //审核中
        binding.mReviewingBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(1)
            }
        })
        //待发货
        binding.mSendGoodsBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(2)
            }
        })

        //验货中
        binding.mInspectionBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(5)
            }
        })
        //退款中
        binding.mRefundBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(8)
            }
        })
        //已完成
        binding.mFinishBTN.setOnButtonClick(object : SelectButton.ButtonClick {
            override fun onClickListener() {
                buttonClick(6)
            }
        })
        //下拉刷新
        binding.mRefresh.setOnRefreshListener {
            initData()
        }
        //上拉加载
        binding.mRefresh.setOnLoadMoreListener {
            pageNum++
            getData()
        }
    }


    private fun buttonClick(type: Int?) {
        MyLog.d("selectType:${type}")
        if (preSelect == type) {
            return
        }
        //恢复之前的按钮
        when (preSelect) {
            null -> binding.mAllBTN.unSelect()
            1 -> binding.mReviewingBTN.unSelect()
            2 -> binding.mSendGoodsBTN.unSelect()
            5 -> binding.mInspectionBTN.unSelect()
            8 -> binding.mRefundBTN.unSelect()
            6 -> binding.mFinishBTN.unSelect()
        }
        when (type) {
            null -> binding.mAllBTN.select()
            1 -> binding.mReviewingBTN.select()
            2 -> binding.mSendGoodsBTN.select()
            5 -> binding.mInspectionBTN.select()
            8 -> binding.mRefundBTN.select()
            6 -> binding.mFinishBTN.select()
        }
        //查看已完成
        when (type) {
            6 -> {
                isFinished = true
                statueCode = null
            }
            //搜索全部
            null -> {
                isFinished = null
                statueCode = null
            }
            else -> {
                isFinished = false
                statueCode = type
            }
        }

        preSelect = type
        initData()
    }

}
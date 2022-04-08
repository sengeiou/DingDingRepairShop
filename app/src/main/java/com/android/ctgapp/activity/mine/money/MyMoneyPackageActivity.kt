package com.android.ctgapp.activity.mine.money

import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.adapter.mine.MoneyPackageCompanyAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityMyMoneyPackgeBinding
import com.android.ctgapp.entity.mine.company.RechargeEntity
import com.android.ctgapp.util.*


/**
 *作者:LiBW
 *创建日期: 2021/12/23
 *描述: 我的储值卡/代金券 页面
 */
class MyMoneyPackageActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityMyMoneyPackgeBinding.inflate(layoutInflater) }

    override fun getLayout() = mBinding.root
    private val mViewModel: MyMoneyPackageViewModel by lazy { ViewModelProvider(this)[MyMoneyPackageViewModel::class.java] }
    private var mList = ArrayList<RechargeEntity.DataBean>()
    private val mAdapter by lazy { MoneyPackageCompanyAdapter(this,mList) }
    //private val companyId by lazy { intent.getIntExtra(MyConstants.COMPANY_ID, 0) }
    override fun event() {
        //println("厂家id"+companyId)

        mBinding.recyclerView.adapter= mAdapter
        mBinding.recyclerView.layoutManager=LinearLayoutManager(this)
        getData()
        mViewModel.error.observe(this, {
            //mBinding.mRefresh.over()
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, { result ->
            //mBinding.mRefresh.over()
            dismissLoading()
            handlerHttpResult(result) {
                val data = getGson().fromJson(result, RechargeEntity::class.java).data
                //BaseApplication.supplyCompanyId=data.
                data?.let { bean ->

                    mList.clear()
                    mList.addAll(bean)
                }
                mAdapter.notifyDataSetChanged()
            }
        })
    }
    override fun onRestart() {
        super.onRestart()
        getData()
    }
    override fun click() {

    }

    private fun getData() {
        loading.show()
        mViewModel.getList()
    }
}
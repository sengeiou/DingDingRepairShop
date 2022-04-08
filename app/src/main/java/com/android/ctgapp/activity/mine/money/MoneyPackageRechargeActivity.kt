package com.android.ctgapp.activity.mine.money

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.activity.mine.ALLCouponsActivity
import com.android.ctgapp.activity.mine.whitebar.CheckFlowActivity
import com.android.ctgapp.adapter.mine.MoneyPackageCompanyAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityMoneyPackageRechargeBinding
import com.android.ctgapp.entity.mine.RechargeActivityEntity
import com.android.ctgapp.entity.mine.company.RechargeEntity
import com.android.ctgapp.util.*
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2021/12/23
 *描述: 钱包充值 页面
 */
class MoneyPackageRechargeActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityMoneyPackageRechargeBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    val platformClientId by lazy{intent.getStringExtra("platformClientId")}
    var fromCompanyId =""

    private var mList = ArrayList<RechargeActivityEntity.DataBean.activityListBean>()
    private val mViewModel: MyMoneyPackageViewModel by lazy { ViewModelProvider(this)[MyMoneyPackageViewModel::class.java] }
    private val mAdapter by lazy { MoneyPackageRechargeAdapter(this,mList) }
    override fun event() {

        fromCompanyId=intent.getStringExtra("fromCompanyId")
        mBinding.mRecyclerView.adapter = mAdapter
        mBinding.mRecyclerView.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
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
                val data = getGson().fromJson(result, RechargeActivityEntity::class.java).data

                data?.let {
                    dataBean ->
                    dataBean.activityList?.let {

                        fromCompanyId= dataBean.fromCompanyId.handlerNull()
                        mList.clear()
                        mList.addAll(it)
                    }
                    mBinding.mCompanyName.text = data.fromCompanyName.handlerNull()
                    val total=data.total.handlerNull()
                    mBinding.mMoney.text = "$total"
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
        //充值记录
        mBinding.mHistory.setOnClickListener {
            startActivity<RechargeMoneyHistoryActivity>(
                "platformClientId" to platformClientId,
                "fromCompanyId" to fromCompanyId,

            )

        }
        //交易明细
        mBinding.mTransactionDetail.setOnClickListener{
            startActivity<CheckFlowActivity>()
        }
        mBinding.mBackground.setOnClickListener{
            this.finish()
        }
        mBinding.mALLCoupons.setOnClickListener {
            startActivity<ALLCouponsActivity>(
                "platformClientId" to platformClientId,
                "fromCompanyId" to fromCompanyId
            )
        }
    }
    private fun getData(){
        mViewModel.getRechargeList(clentid = platformClientId,companyId = fromCompanyId)
    }
}
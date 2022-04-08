package com.android.ctgapp.activity.mine.balance

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.adapter.mine.CompanyBalanceDetailAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.CurrentBalanceDetailEntity
import com.android.ctgapp.entity.CurrentBalanceEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_company_balance.*
import okhttp3.MediaType
import okhttp3.RequestBody
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 12/28/20
 *描述: 企业余额 页面 企业账户和联盟账户暂时用一个
 */
class CompanyBalanceActivity : BaseActivity() {

    private val mViewModel: CompanyBalanceViewModel by lazy { ViewModelProvider(this)[CompanyBalanceViewModel::class.java] }

    private var page = 1
    private val mList = ArrayList<CurrentBalanceDetailEntity.DataBean.RecordsBean>()
    private val mAdapter: CompanyBalanceDetailAdapter by lazy { CompanyBalanceDetailAdapter(this, mList) }
    override fun onResume() {
        super.onResume()
        val body = RequestBody.create(
            MediaType.parse("application/json; charset=utf-8"),
            getGson().toJson(arrayOf(0))
        )
        showLoading()
        mViewModel.getCompanyBalance(body)
        initData()
    }

    private fun initData() {
        mList.clear()
        page = 1
        getData()
    }

    private fun getData() {
        mViewModel.getCompanyBalanceDetail(page)
    }

    override fun event() {
        mBalanceRV.adapter = mAdapter
        mBalanceRV.layoutManager = LinearLayoutManager(this)

        mViewModel.error.observe(this, Observer {
            dismissLoading()
            mRefresh.over()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.companyResult.observe(this, Observer {
            dismissLoading()
            mRefresh.over()
            MyLog.d("余额回调:$it")
            handlerHttpResult(it) {
                val entity = getGson().fromJson(it, CurrentBalanceEntity::class.java).data
                entity?.forEach { item ->
                    //企业ID不为-1则为企业余额
                    if (item.companyId != -1) {
                        val money = if (item.amount.handlerNull().isEmpty()) "0.00" else item.amount.handlerNull()
                        mBalanceValueTV.text = money
                    }
                }
            }
        })

        mViewModel.companyDetailResult.observe(this, Observer {
            dismissLoading()
            mRefresh.over()

            MyLog.d("提现充值记录回调:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, CurrentBalanceDetailEntity::class.java).data
                data?.records?.let { list ->
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
        })
    }

    override fun click() {
        //充值
        mTopUpTV.setOnClickListener {
            startActivity<BalanceTopUpActivity>()
        }
        mRefresh.setOnLoadMoreListener {
            page++
            getData()
        }
        mRefresh.setOnRefreshListener {
            page = 1
            mList.clear()
            getData()
        }
    }

    override fun getLayout() = R.layout.activity_company_balance

    override fun onBackPressed() {
        startActivity<MainActivity>(MyConstants.GO_JUMP to 4)
        finish()
    }
}
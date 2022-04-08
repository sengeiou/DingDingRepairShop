package com.android.ctgapp.activity.company

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.android.ctgapp.activity.mine.company.JoinCompanyByCodeActivity
import com.android.ctgapp.adapter.mine.JoinCompanyAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityJoinCompanyBinding
import com.android.ctgapp.entity.CompanyCanJoinEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_join_company.*
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2020/9/30
 *描述:加入企业 加入公司 页面
 */
class JoinCompanyActivity : BaseActivityV2(), JoinCompanyAdapter.JoinCompanyListener {
    val binding by lazy { ActivityJoinCompanyBinding.inflate(layoutInflater) }
    override fun getLayout() = binding.root
    private val mList = ArrayList<CompanyCanJoinEntity.DataBean.RecordsBean>()
    private val mAdapter: JoinCompanyAdapter by lazy { JoinCompanyAdapter(this, mList, this) }
    private val mViewModel: JoinCompanyViewModel by lazy { ViewModelProvider(this)[JoinCompanyViewModel::class.java] }
    private var pageNum: Int = 1
    private var pageSize: Int = 20
    private var search = ""
    private var clearList = false

    private fun initData() {
        clearList = true
        pageNum = 1
        search = ""
        getData()
    }

    private fun getData() {
        mViewModel.getCompanyList(search, pageNum, pageSize)
    }

    override fun onResume() {
        super.onResume()
        initData()
    }

    override fun event() {
        binding.mCompanyRV.adapter = mAdapter
        binding.mCompanyRV.layoutManager = GridLayoutManager(this, 1)

        mViewModel.error.observe(this, Observer {
            mRefresh.over()
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.companyListResult.observe(this, Observer {
            mRefresh.over()
            dismissLoading()
            MyLog.d("可加入公司列表:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, CompanyCanJoinEntity::class.java).data
                data?.total?.let { number ->
                    val total = "共${number}家企业"
                    binding.mCompanyCountTV.text = total
                }
                data?.records?.let { list ->
                    if (clearList) mList.clear()
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
            clearList = false
        })

        mViewModel.companyJoinResult.observe(this, Observer {
            mRefresh.over()
            dismissLoading()
            MyLog.d("加入公司回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("申请已提交")
                initData()
            } else {
                showToast(data.msg)
            }
        })
    }

    override fun click() {
        binding.mSearchET.handlerText {
            if (it.isEmpty()) initData()
        }
        binding.mSearchET.handlerEditTextSearch(this) {
            search = it
            pageNum = 1
            clearList = true
            getData()
        }

        //邀请码
        binding.mInvitationCodeTV.setOnClickListener {
            startActivity<JoinCompanyByCodeActivity>()
        }
        //上拉加载
        binding.mRefresh.setOnLoadMoreListener {
            pageNum++
            getData()
        }
        //下拉刷新
        binding.mRefresh.setOnRefreshListener {
            mSearchET.textSet("")
        }
    }

    override fun onJoinButtonClickListener(companyId: Int) {
        mViewModel.applyJoinCompany(companyId)
    }


}
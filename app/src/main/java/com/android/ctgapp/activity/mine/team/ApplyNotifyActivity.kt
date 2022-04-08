package com.android.ctgapp.activity.mine.team

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.TeamApplyNotifyAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.ApplyTeamEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_apply_notify.*

/**
 *作者:LiBW
 *创建日期: 1/3/21
 *描述: 申请通知 页面
 */
class ApplyNotifyActivity : BaseActivity(), TeamApplyNotifyAdapter.ApplyNotifyCallback {
    private val mViewModel: ApplyNotifyViewModel by lazy { ViewModelProvider(this)[ApplyNotifyViewModel::class.java] }
    private var page = 1
    private val mList = ArrayList<ApplyTeamEntity.DataBean.RecordsBean>()
    private val mAdapter: TeamApplyNotifyAdapter by lazy { TeamApplyNotifyAdapter(this, mList, this) }

    fun initData() {
        mList.clear()
        page = 1
        getData()
    }

    fun getData() {
        showLoading()
        mViewModel.getList(page)
    }

    override fun event() {
        getData()
        mApplyNotifyRV.adapter = mAdapter
        mApplyNotifyRV.layoutManager = LinearLayoutManager(this)
        mViewModel.error.observe(this, Observer {
            mRefresh.over()
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, Observer {
            dismissLoading()
            mRefresh.over()
            MyLog.d("团队申请列表:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, ApplyTeamEntity::class.java).data
                data?.records?.let { list ->
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
        })

        mViewModel.applyResult.observe(this, Observer {
            dismissLoading()
            mRefresh.over()
            MyLog.d("审核回调:$it")
            handlerData(it) {
                initData()
            }
        })
    }

    override fun click() {
        mRefresh.setOnLoadMoreListener {
            page++
            getData()
        }
        mRefresh.setOnRefreshListener {
            initData()
        }
    }

    override fun getLayout() = R.layout.activity_apply_notify

    override fun agreeClick(id: Int) {
        mViewModel.handlerApply(id, true)
    }

    override fun rejectClick(id: Int) {
        mViewModel.handlerApply(id, false)
    }
}
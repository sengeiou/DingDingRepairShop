package com.android.ctgapp.activity.mine.alliance

import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.adapter.mine.AllianceChildCompanyAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityAlliancesCompanyBinding
import com.android.ctgapp.entity.mine.AllianceChildCompanyEntity
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.util.*
import okhttp3.ResponseBody

/**
 *作者:LiBW
 *创建日期: 2021/8/10
 *描述:联盟成员 页面
 */
class AllianceChildCompanyActivity : BaseActivityV2(){
    private val mBinding by lazy { ActivityAlliancesCompanyBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private val mAllianceId by lazy { intent.getIntExtra(MyConstants.ALLIANCE_ID, -1) }
    private val mList = ArrayList<AllianceChildCompanyEntity.DataBean>()
    private val mAdapter by lazy { AllianceChildCompanyAdapter(this, mList) }
    private var page = 1
    override fun event() {
        mBinding.mRecyclerView.adapter = mAdapter
        mBinding.mRecyclerView.layoutManager = LinearLayoutManager(this)
        getData()
    }

    private val companyListener = object : ObserverListener {
        override fun onNext(t: ResponseBody) {
            loading.dismiss()
            mBinding.mRefresh.over()
            val str = t.string().handlerNull()
            MyLog.d("联盟成员回调:$str")
            handlerHttpResult(str) {
                val data = getGson().fromJson(str, AllianceChildCompanyEntity::class.java).data
                data?.let {
                    mList.addAll(it)
                    mAdapter.notifyDataSetChanged()
                }
            }
        }

        override fun onError(error: String) {
            loading.dismiss()
            mBinding.mRefresh.over()
            showToast(error)
        }
    }

    fun getData() {
        showLoading()
        ApiMethods.getAllAllianceCompany(MyObserver(companyListener), mAllianceId)
    }

    override fun click() {
        mBinding.mRefresh.setOnLoadMoreListener {
            page++
            getData()
        }
        mBinding.mRefresh.setOnRefreshListener {
            page = 1
            getData()
        }
    }


}
package com.android.ctgapp.activity.mine.whitebar

import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.adapter.mine.whitebar.WhiteBarAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityIousBinding
import com.android.ctgapp.entity.WhiteBarEntityV1
import com.android.ctgapp.util.*

/**
 *作者:LiBW
 *创建日期: 12/31/20
 *描述: 白条 页面
 */
class WhiteBarActivity : BaseActivityV2() {
    private val binding by lazy { ActivityIousBinding.inflate(layoutInflater) }
    override fun getLayout() = binding.root
    private var page = 1
    private var size = 5
    private val mViewModel: WhiteBarViewModel by lazy { ViewModelProvider(this)[WhiteBarViewModel::class.java] }
    private val mList = ArrayList<WhiteBarEntityV1.DataBean.PageBean.RecordsBean>()
    private val mAdapter: WhiteBarAdapter by lazy { WhiteBarAdapter(this, mList) }

//    //总待还款金额
//    private var allMoney = BigDecimal(0.0)

    private fun getData() {
        showLoading()
        mViewModel.getWhiteBarList(page, size)
    }

    override fun event() {
        binding.mWhiteBarRV.adapter = mAdapter
        binding.mWhiteBarRV.layoutManager = LinearLayoutManager(this)
        getData()
        mViewModel.error.observe(this, {
            dismissLoading()
            binding.mRefresh.over()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, {
            binding.mRefresh.over()
            dismissLoading()
            MyLog.d("白条列表:$it")
            handlerHttpResult(it) {
                val entity = getGson().fromJson(it, WhiteBarEntityV1::class.java)
                entity?.data?.page?.records?.let { list ->
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
                entity?.data?.let { bean ->
                    binding.mAllReturnTV.text = bean.allMoney.handlerNull()
                }
            }
        })
    }

    override fun click() {
        binding.mBackIv.setOnClickListener {
            finish()
        }
        binding.mRefresh.setOnRefreshListener {
            mList.clear()
            page = 1
            getData()
        }
        binding.mRefresh.setOnLoadMoreListener {
            page++
            getData()
        }
    }
}
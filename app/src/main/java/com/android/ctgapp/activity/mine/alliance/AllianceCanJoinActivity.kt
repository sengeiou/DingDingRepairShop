package com.android.ctgapp.activity.mine.alliance

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.AllianceUnAddedAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.AllianceEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_alliance_un_join.*

/**
 *作者:LiBW
 *创建日期: 12/29/20
 *描述:加入联盟 页面 列表
 */
class AllianceCanJoinActivity : BaseActivity(), AllianceUnAddedAdapter.ListListener {

    private val mViewModel: AllianceCanJoinViewModel by lazy { ViewModelProvider(this)[AllianceCanJoinViewModel::class.java] }
    private var search = ""
    private val mList = ArrayList<AllianceEntity.DataBean>()
    private val mAdapter: AllianceUnAddedAdapter by lazy { AllianceUnAddedAdapter(this, mList, this) }


    override fun event() {
        mAllianceRV.adapter = mAdapter
        mAllianceRV.layoutManager = LinearLayoutManager(this)
        mViewModel.getAllianceUnJoin(search)
        mViewModel.error.observe(this, Observer {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.unJoinResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("未加入的联盟列表:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, AllianceEntity::class.java).data
                data?.let { list ->
                    mList.clear()
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
        })

        mViewModel.joinResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("申请回调:$it")
            handlerData(it) {
                showToast("申请已经提交")
                mViewModel.getAllianceUnJoin(search)
            }
        })
        mSearchET.handlerEditTextSearch(this) {
            search = it
            mViewModel.getAllianceUnJoin(search)
        }
        mSearchET.handlerText {
            if (it.isEmpty() && search.isNotEmpty()) {
                search = ""
                mViewModel.getAllianceUnJoin(search)
            }
        }
    }

    override fun click() {

    }

    override fun getLayout() = R.layout.activity_alliance_un_join

    override fun onItemClickListener(id: Int) {
        mViewModel.applyJoinAlliance(handlerBody("destCompanyId" to id))
    }

}
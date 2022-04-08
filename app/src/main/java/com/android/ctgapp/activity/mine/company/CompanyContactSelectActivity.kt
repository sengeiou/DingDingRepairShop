package com.android.ctgapp.activity.mine.company

import android.view.inputmethod.EditorInfo
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.UnAddedContactsAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.callback.ContactSelectManager
import com.android.ctgapp.entity.ContactUnAddEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_company_contact_select.*

/**
 *作者:LiBW
 *创建日期: 2020/10/28
 *描述: 选择联系人 对外联系人 未添加的对外联系人
 */
class CompanyContactSelectActivity : BaseActivity(), UnAddedContactsAdapter.Listener {
    private val mViewModel: CompanyContactSelectViewModel by lazy { ViewModelProvider(this)[CompanyContactSelectViewModel::class.java] }
    private val mList = ArrayList<ContactUnAddEntity.DataBean.RecordsBean>()
    private var mAdapter: UnAddedContactsAdapter? = null
    private var mSearchText = ""
    private var pageSize = 20
    private var pageNum = 1


    override fun event() {
        //成员
        mTeamRV.adapter = mAdapter
        mTeamRV.layoutManager = LinearLayoutManager(this)
        initData()
        mViewModel.result.observe(this, Observer { result ->
            mRefresh.over()
            loading.dismiss()
            MyLog.d("未添加的对外联系人:$result")
            val data = initData(result)
            if (data.status == 0) {
                val entity = getGson().fromJson(result, ContactUnAddEntity::class.java).data

                entity?.records?.let {list->
                    mList.addAll(list)
                    mAdapter = UnAddedContactsAdapter(this, mList, this)
                    mTeamRV.adapter = mAdapter
                    mTeamRV.layoutManager = LinearLayoutManager(this)
                }
            } else {
                showToast(data.msg)
            }
        })
        mViewModel.error.observe(this, Observer {
            mRefresh.over()
            MyLog.d("错误:$it")
            showToast(it)
        })

    }

    override fun click() {
        //搜索框
        mSearchET.handlerText {
            mSearchText = it
            if (it.isEmpty()) {
                getData()
            }
        }
        //搜索框的搜索按钮
        mSearchET.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                //收起键盘
                hideEditTextView()
                initData()
            }
            false
        }



        mRefresh.setOnLoadMoreListener {
            pageNum++
            getData()
        }
        mRefresh.setOnRefreshListener {
            initData()
        }

    }

    private fun initData() {
        pageNum = 1
        mList.clear()
        getData()
    }

    private fun getData() {
        loading.show()
        mViewModel.getTeamList(mSearchText, pageSize, pageNum)
    }

    override fun getLayout() = R.layout.activity_company_contact_select


    override fun onItemSelectListener(data: ContactUnAddEntity.DataBean.RecordsBean) {
        ContactSelectManager.whenItemSelect(data)
        finish()
    }
}
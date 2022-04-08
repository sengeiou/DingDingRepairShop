package com.android.ctgapp.activity.mine.client

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.AddClientAdapter
import com.android.ctgapp.adapter.mine.AddClientHorizontalMenuAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.AddClientHorizontalItemEntity
import com.android.ctgapp.entity.ClientCanJoinEntity
import com.android.ctgapp.enum.IndustryForAddEnum
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_add_client.*
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2020/10/23
 *描述: 添加供应商 页面
 */
class AddClientActivity : BaseActivity(), AddClientHorizontalMenuAdapter.SelectCallback, AddClientAdapter.AddClientListener {
    private val mViewModel: AddClientViewModel by lazy { ViewModelProvider(this)[AddClientViewModel::class.java] }
    private val mHorizontalMenuList = ArrayList<AddClientHorizontalItemEntity>()
    private val mHorizontalMenuAdapter: AddClientHorizontalMenuAdapter by lazy { AddClientHorizontalMenuAdapter(this, mHorizontalMenuList, this) }
    private val mList = ArrayList<ClientCanJoinEntity.DataBean.RecordsBean>()
    private val mAdapter: AddClientAdapter by lazy { AddClientAdapter(this, mList, this) }

    private var search = ""
    private var searchCode = ""
    private var page = 1
    private var size = 20

    override fun event() {
        //横向菜单列表
        mHorizontalMenuRV.adapter = mHorizontalMenuAdapter
        mHorizontalMenuRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        //经销商
        mHorizontalMenuList.add(AddClientHorizontalItemEntity(IndustryForAddEnum.AGENCY.industryName, IndustryForAddEnum.AGENCY.industryCode, true))
        //拆车厂
        mHorizontalMenuList.add(AddClientHorizontalItemEntity(IndustryForAddEnum.CAR_DISMANTLING.industryName, IndustryForAddEnum.CAR_DISMANTLING.industryCode, false))
        //联盟
        mHorizontalMenuList.add(AddClientHorizontalItemEntity(IndustryForAddEnum.ALLIANCE.industryName, IndustryForAddEnum.ALLIANCE.industryCode, false))


//        IndustryForAddEnum.values().forEach { item ->
//            if (item.industryName == "经销商") {
//                mHorizontalMenuList.add(AddClientHorizontalItemEntity(item.industryName, item.industryCode, true))
//            }
//            if (item.industryName == "拆车厂") {
//                mHorizontalMenuList.add(AddClientHorizontalItemEntity(item.industryName, item.industryCode, false))
//            }
//        }
        searchCode = "AGENCY"
        mHorizontalMenuAdapter.notifyDataSetChanged()
        //数据列表
        mClientRV.adapter = mAdapter
        mClientRV.layoutManager = LinearLayoutManager(this)
        mViewModel.listResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("客户列表:$it")
            mRefresh.over()
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, ClientCanJoinEntity::class.java).data
                data?.let { item ->
                    val total = "共${item.total.handlerNull()}位客户"
                    mTotalClientTV.text = total
                }
                data?.records?.let { list ->
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
        })

        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            mRefresh.over()
            MyLog.d("错误:$it")
            showToast(it)
        })
        //加入回调
        mViewModel.addResult.observe(this, Observer {
            loading.dismiss()
            mRefresh.over()
            MyLog.d("加入回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("操作成功")
                initData()
            } else {
                showToast(data.msg)
            }
        })
    }

    override fun onResume() {
        super.onResume()
        getData()
    }

    fun initData() {
        page = 1
        mList.clear()
        getData()
    }

    fun getData() {
        loading.show()
        mViewModel.getList(page, size, search, searchCode)
    }

    override fun click() {
        mRefresh.setOnLoadMoreListener {
            page++
            getData()
        }
        mRefresh.setOnRefreshListener {
            initData()
        }

        //搜索客户
        mSearchET.handlerEditTextSearch(this) {
            search = it
            initData()
        }
        mSearchET.handlerText {
            if (it.isEmpty()) {
                search = ""
                initData()
            }
        }
        //邀请码
        mAuthCodeTV.setOnClickListener {
            startActivity<AuthInviteActivity>()
        }
    }


    override fun getLayout() = R.layout.activity_add_client

    override fun findByIndustryCode(industryCode: String) {
        searchCode = industryCode
        initData()
    }
    override fun onItemClick(companyId: Int) {
        showLoading()
        mViewModel.addClient(companyId)
    }
}
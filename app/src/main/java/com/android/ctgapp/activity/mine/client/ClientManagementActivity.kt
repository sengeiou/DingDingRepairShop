package com.android.ctgapp.activity.mine.client

import android.content.Intent
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.company.ClientManagerSetActivity
import com.android.ctgapp.adapter.mine.ClientAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.entity.ClientEntity
import com.android.ctgapp.util.*
import com.yanzhenjie.recyclerview.SwipeMenuCreator
import com.yanzhenjie.recyclerview.SwipeMenuItem
import kotlinx.android.synthetic.main.activity_client_management.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.startActivityForResult

/**
 *作者:LiBW
 *创建日期: 2020/10/23
 *描述:供应商管理 页面
 */
class ClientManagementActivity : BaseActivity(), ClientAdapter.ClientCallback {
    override fun getLayout() = R.layout.activity_client_management

    //上下游顾客切换 upstream(“上游供货商”),downstream(“下游客户”) 目前只有上游
    private var clientType = "upstream"
    private var searchText = ""
    private var page = 1
    private val size = 20
    private val mList = ArrayList<ClientEntity.DataBean.RecordsBean>()
    private val mAdapter: ClientAdapter by lazy { ClientAdapter(this, mList, this) }
    private val mViewModel: ClientManagementViewModel by lazy { ViewModelProvider(this)[ClientManagementViewModel::class.java] }
    private val mManagerCode = 100

    override fun onResume() {
        super.onResume()
        initData()
    }

    private fun getData() {
        loading.show()
        mViewModel.getClientList(clientType, searchText, size, page)
    }

    private fun initData() {
        mList.clear()
        page = 1
        getData()
    }

    private var removePosition = 0

    override fun event() {


        //为list添加侧滑菜单
        val mSwipeMenuCreator = SwipeMenuCreator { _, rightMenu, _ ->
//            val editItem = SwipeMenuItem(this)
//            editItem.text = "设置负责人"
//            editItem.setTextColorResource(R.color.white)
//            editItem.setBackgroundColorResource(R.color.blue_common)
//            editItem.height = LinearLayout.LayoutParams.MATCH_PARENT
//            editItem.width = 80f.toPx(this)
//            rightMenu.addMenuItem(editItem)
            val deleteItem = SwipeMenuItem(this)
            deleteItem.text = "移除"
            deleteItem.setTextColorResource(R.color.white)
            deleteItem.setBackgroundColorResource(R.color.red_start)
            deleteItem.height = LinearLayout.LayoutParams.MATCH_PARENT
            deleteItem.width = 80f.toPx(this)
            rightMenu.addMenuItem(deleteItem)
        }
        //侧滑按钮监听
        mClientRV.setOnItemMenuClickListener { menuBridge, adapterPosition ->
            menuBridge.closeMenu()
            //数据类型所在位置
            val data = mList[adapterPosition]
            //菜单位置 0为编辑 1为删除
            when (menuBridge.position) {
                0 -> {
                    commonDialog("确认移除该企业么") {
                        removePosition = adapterPosition
                        mViewModel.removeClient(clientType, data.companyId.handlerNull())
                    }
//                    if (BaseApplication.isCompanyAdmin || BaseApplication.isCompanyCreator){
//                        //选择负责人
//                        startActivityForResult<ClientManagerSetActivity>(
//                            mManagerCode, MyConstants.RESULT_CODE to mManagerCode,
//                            MyConstants.COMPANY_ID to mList[adapterPosition].companyId,
//                            MyConstants.ID to arrayListOf(mList[adapterPosition].companyId),
//                            MyConstants.NAME to mList[adapterPosition].responsiblePerson.handlerNull()
//                        )
//                    }else{
//                        showToast("只有管理员可以进行此操作")
//                    }
                }
                1 -> {
                    commonDialog("确认移除该企业么") {
                        removePosition = adapterPosition
                        mViewModel.removeClient(clientType, data.companyId.handlerNull())
                    }
                }
            }
        }


        mClientRV.setSwipeMenuCreator(mSwipeMenuCreator)
        mClientRV.adapter = mAdapter
        mClientRV.layoutManager = LinearLayoutManager(this)
        mViewModel.clientResult.observe(this, Observer {
            loading.dismiss()
            mRefresh.over()
            MyLog.d("客户列表:$it")
            val data = initData(it)
            if (data.status == 0) {
                val entity = getGson().fromJson(it, ClientEntity::class.java).data
                entity?.let { bean ->
                    val count = "共${bean.total.handlerNull()}个"
                    mContentTV.text = count
                }

                entity?.records?.let { list ->
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            } else {
                showToast(data.msg)
            }
        })

        mViewModel.removeResult.observe(this, {
            MyLog.d("移除回调")
            handlerHttpResult(it) {
                showToast("移除成功")
                mList.removeAt(removePosition)
                mAdapter.notifyItemRemoved(removePosition)
            }
        })
        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            mRefresh.over()
            MyLog.d("错误:$it")
            showToast(it)
        })
    }

    override fun click() {
        val ac = if (BuildConfig.APPLICATION_ID == MyConstants.APPLICATION_ID_LANJING || BuildConfig.APPLICATION_ID == MyConstants.APPLICATION_ID_CTG) {
            //蓝鲸和汽修钉钉 直接用邀请码
            mAddClientTV.text = "邀请码"
            AuthInviteActivity::class.java
        } else {
            mAddClientTV.text = "添加供应商"
            AddClientActivity::class.java
        }

        //突然不要列表添加供应商了 直接用邀请码
        mAddClientTV.text = "邀请码"
        //添加供应商
        mAddClientTV.setOnClickListener {
            startActivity(Intent(this, ac))
        }


        mSearchET.handlerText {
            searchText = it
            if (it.isEmpty()) {
                initData()
            }
        }
        //搜索框 键盘搜索按钮
        mSearchET.handlerEditTextSearch(this) {
            MyLog.d("点击了搜索按钮:$it")
            initData()
        }
        //上拉加载
        mRefresh.setOnLoadMoreListener {
            page++
            getData()
        }
        //下拉刷新
        mRefresh.setOnRefreshListener {
            page = 1
            mList.clear()
            getData()
        }
    }


    //列表点击
    override fun onClientItemClick(data: ClientEntity.DataBean.RecordsBean) {

//        //联盟详情
//        startActivity<AllianceDetailActivity>()
//
//        //公司详情
//        startActivity<CompanyDetailActivity>()
    }
}
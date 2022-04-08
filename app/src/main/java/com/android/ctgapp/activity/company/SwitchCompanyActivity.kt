package com.android.ctgapp.activity.company

import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.login.CreateOrJoinCompanyActivity
import com.android.ctgapp.adapter.mine.SwitchCompanyAdapterEmpty
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivitySwicthCompanyBinding
import com.android.ctgapp.entity.CompanyChangeEntity
import com.android.ctgapp.entity.LoginEntity
import com.android.ctgapp.event.HomeFragmentRefresh
import com.android.ctgapp.event.MineFragmentRefresh
import com.android.ctgapp.event.OrderRefresh
import com.android.ctgapp.util.*
import com.yanzhenjie.recyclerview.SwipeMenuCreator
import com.yanzhenjie.recyclerview.SwipeMenuItem
import org.greenrobot.eventbus.EventBus
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2020/9/29
 *描述:切换企业 页面 切换公司
 */
class SwitchCompanyActivity : BaseActivityV2(), SwitchCompanyAdapterEmpty.CompanyChangeListener {

    val binding by lazy { ActivitySwicthCompanyBinding.inflate(layoutInflater) }
    override fun getLayout() = binding.root
    private val mViewModel: SwitchCompanyViewModel by lazy { ViewModelProvider(this)[SwitchCompanyViewModel::class.java] }

    private val mList = ArrayList<CompanyChangeEntity.DataBean>()
    private val mAdapter = SwitchCompanyAdapterEmpty(this, mList, this)
    var currentCompanyId = BaseApplication.companyId
    var defaultCompanyId = -1
    override fun onResume() {
        super.onResume()
        //获取公司列表
        showLoading()
        mViewModel.getCompanyListCanChange()
    }

    override fun event() {

        //为list添加侧滑菜单
        val mSwipeMenuCreator = SwipeMenuCreator { _, rightMenu, _ ->
            val editItem = SwipeMenuItem(this)
            editItem.text = "设为默认"
            editItem.setTextColorResource(R.color.white)
            editItem.setBackgroundColorResource(R.color.blue_common)
            editItem.height = LinearLayout.LayoutParams.MATCH_PARENT
            editItem.width = 80f.toPx(this)
            rightMenu.addMenuItem(editItem)
            val deleteItem = SwipeMenuItem(this)
            deleteItem.text = "退出"
            deleteItem.setTextColorResource(R.color.white)
            deleteItem.setBackgroundColorResource(R.color.red_start)
            deleteItem.height = LinearLayout.LayoutParams.MATCH_PARENT
            deleteItem.width = 80f.toPx(this)
            rightMenu.addMenuItem(deleteItem)
        }


        //侧滑监听 删除功能
        binding.mCompanyRV.setOnItemMenuClickListener { menuBridge, adapterPosition ->
            menuBridge.closeMenu()
            when (menuBridge.position) {
                0 -> {
                    MyLog.d("设为默认")
                    showLoading()
                    mViewModel.setDefault(mList[adapterPosition].id)
                }
                1 -> {
                    //删除了当前的公司 清空数据
                    if (BaseApplication.companyId == mList[adapterPosition].id) {
                        MyLog.d("用户退出了当前所在公司清除数据")
                        DataUtil.deleteAllData()
                    }

                    MyLog.d("退出")
                    val str = if (mList[adapterPosition].createUserid == BaseApplication.userId) "您是公司创建者,确认解散该公司么" else "请确认退出该公司"
                    commonDialog(str) {
                        showLoading()
                        mViewModel.leaveCompany(mList[adapterPosition].id)
                    }
                }
            }
        }

        binding.mCompanyRV.setSwipeMenuCreator(mSwipeMenuCreator)
        binding.mCompanyRV.adapter = mAdapter
        binding.mCompanyRV.layoutManager = GridLayoutManager(this, 1)


        mViewModel.error.observe(this, Observer {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.setDefaultResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("设置默认企业回调:$it")
            handlerData(it) {
                mViewModel.getCompanyListCanChange()
            }
        })

        mViewModel.companyListResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("可切换公司列表:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, CompanyChangeEntity::class.java).data
                if (data == null) {
                    mList.clear()
                    mAdapter.notifyDataSetChanged()
                }

                data?.let { list ->
                    mList.forEach { company ->
                        if (company.defaultCompany) {
                            defaultCompanyId = company.id
                        }
                    }
                    mList.clear()
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
        })

        mViewModel.companyChangeResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("公司切换回调:$it")
            handlerHttpResult(it) {
                val entity = getGson().fromJson(it, LoginEntity::class.java)
                entity?.data?.let { loginEntity ->
                    //配置只有修理厂可以登录app
                    if (loginEntity.industryCode.handlerNull() == "REPAIRSHOP" || loginEntity.industry.handlerNull() == "修理厂") {
                        DataUtil.handlerLoginData(it)
                        showToast("切换成功")
                        //切换公司后刷新一下首页的品牌分类
                        EventBus.getDefault().post(HomeFragmentRefresh(3))
                        EventBus.getDefault().post(HomeFragmentRefresh(1))
                        //切换公司后要刷新企业信息
                        EventBus.getDefault().post(MineFragmentRefresh())
                        //订单信息也要刷新
                        EventBus.getDefault().post(OrderRefresh(1))
                        EventBus.getDefault().post(OrderRefresh(2))
                        EventBus.getDefault().post(OrderRefresh(3))
                        //系统信息也要刷新


                        startActivity<MainActivity>(MyConstants.REFRESH_DATA to true)
                        finish()
                    } else {
                        showToast("目前仅支持修理厂登录")
                    }
                }
            }
        })
        mViewModel.leaveResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("切换公司回调:$it")
            handlerData(it) {
                mViewModel.getCompanyListCanChange()
            }
        })
    }

    override fun click() {
        binding.mBackIv.setOnClickListener {
            onBackPressed()
        }

        //创建公司
        binding.mCreateCompanyBTN.setOnClickListener {
            startActivity<CreateCompanyActivity>()
        }
        //加入公司
        binding.mJoinCompanyBTN.setOnClickListener {
            startActivity<JoinCompanyActivity>()
        }
    }
    //列表选中了公司 进行切换
    override fun onCompanyChange(companyId: Int) {
        mViewModel.changeCompany(companyId)
    }

    override fun onBackPressed() {
        when {
            //列表被清空了 没有公司了
            mList.isEmpty() -> {
                startActivity<CreateOrJoinCompanyActivity>()
                finish()
            }
            //当用户退出了当前公司则用户退出时自动切换为默认公司
            BaseApplication.companyId == 0 -> mViewModel.changeCompany(defaultCompanyId)
            else -> {
                super.onBackPressed()
            }
        }
    }
}
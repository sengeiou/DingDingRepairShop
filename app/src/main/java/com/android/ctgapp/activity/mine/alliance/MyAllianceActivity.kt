package com.android.ctgapp.activity.mine.alliance

import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.AllianceAddedAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityMyAllianceBinding
import com.android.ctgapp.entity.AllianceEntity
import com.android.ctgapp.util.*
import com.yanzhenjie.recyclerview.SwipeMenuCreator
import com.yanzhenjie.recyclerview.SwipeMenuItem
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 12/28/20
 *描述: 我的联盟 页面
 */
class MyAllianceActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityMyAllianceBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root

    private val mViewModel: MyAllianceViewModel by lazy { ViewModelProvider(this)[MyAllianceViewModel::class.java] }
    private val mList = ArrayList<AllianceEntity.DataBean>()
    private val mAdapter: AllianceAddedAdapter by lazy { AllianceAddedAdapter(this, mList) }

    override fun onResume() {
        super.onResume()
        mViewModel.getAlliance()
    }

    override fun event() {
        //为list添加侧滑菜单
        val mSwipeMenuCreator = SwipeMenuCreator { _, rightMenu, _ ->
            val editItem = SwipeMenuItem(this)
            editItem.text = "退出联盟"
            editItem.setTextColorResource(R.color.white)
            editItem.setBackgroundColorResource(R.color.red_start)
            editItem.height = LinearLayout.LayoutParams.MATCH_PARENT
            editItem.width = 80f.toPx(this)
            rightMenu.addMenuItem(editItem)
        }
        //侧滑按钮监听
        mBinding.mAllianceRV.setOnItemMenuClickListener { menuBridge, adapterPosition ->
            menuBridge.closeMenu()
            val data = mList[adapterPosition]
            //菜单位置
            when (menuBridge.position) {
                0 -> {
                    commonDialog("确认退出该联盟么") {
                        mViewModel.quiteAlliance(data.allianceId)
                    }
                }
            }
        }

        mBinding.mAllianceRV.setSwipeMenuCreator(mSwipeMenuCreator)
        mBinding.mAllianceRV.adapter = mAdapter
        mBinding.mAllianceRV.layoutManager = LinearLayoutManager(this)


        mViewModel.error.observe(this, Observer {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })
        //底部小提示
        val footView = LayoutInflater.from(this).inflate(R.layout.item_exit_allient_tip, null, false)
        val param = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        footView.layoutParams = param
        footView.alpha = 0.5f

        mViewModel.result.observe(this, Observer {
            dismissLoading()
            MyLog.d("联盟列表:$it")
            handlerHttpResult(it) {
                val entity = getGson().fromJson(it, AllianceEntity::class.java).data
                entity?.let { list ->
                    mBinding.mAllianceRV.removeFooterView(footView)
                    if (list.isEmpty()) {
                        mBinding.mAllianceRV.isSwipeItemMenuEnabled = false
                        mBinding.mAllianceRV.removeFooterView(footView)
                    } else {
                        mBinding.mAllianceRV.isSwipeItemMenuEnabled = true
                        mBinding.mAllianceRV.addFooterView(footView)
                    }
                    mList.clear()
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
        })

        mViewModel.quiteResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("退出联盟回调:$it")
            handlerData(it) {
                showToast("退出联盟成功")
                mViewModel.getAlliance()
            }
        })
    }

    override fun click() {
        //创建联盟
        mBinding.mCreateAllianceBTN.setOnClickListener {
            startActivity<CreateAllianceActivity>()
        }
        //加入联盟
        mBinding. mJoinAllianceBTN.setOnClickListener {
            startActivity<AllianceCanJoinActivity>()
        }
    }


}
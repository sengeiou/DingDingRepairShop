package com.android.ctgapp.activity.message.chart.card

import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.DingDingTeamAdapter
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseFragment
import com.android.ctgapp.entity.chart.AllTeamEntity
import com.android.ctgapp.event.OnLineRefresh
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.getGson
import com.android.ctgapp.util.handlerHttpResult
import com.android.ctgapp.util.showToast
import kotlinx.android.synthetic.main.fragment_chart_team.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

/**
 *作者:LiBW
 *创建日期: 2/25/21
 *描述:聊天选择同事
 */
class ChartTeamFragment(private var isLinkman: Boolean) : BaseFragment(true), DingDingTeamAdapter.Callback {
    private val mActivity by lazy { requireActivity() as DingDingContactShareActivity }
    private val mViewModel by lazy { ViewModelProvider(this)[AllTeamViewModel::class.java] }
    val mList = ArrayList<AllTeamEntity.DataBean>()
    private val mSearchList = ArrayList<AllTeamEntity.DataBean>()
    var mAdapter: DingDingTeamAdapter? = null


    override fun onResume() {
        super.onResume()
        mActivity.mSelectList.forEach { item ->
            mList.forEach { parent ->
                parent.users?.forEach { child ->
                    child.selected = item == child.id
                }
            }
            mSearchList.forEach { parent ->
                parent.users?.forEach { child ->
                    child.selected = item == child.id
                }
            }
        }
        mAdapter?.notifyDataSetChanged()
    }

    @Subscribe
    fun event(o: OnLineRefresh) {
        MyLog.d("同事在线状态更新了来看看吧")
        mList.forEach { parent ->
            parent.users?.forEach {
                it.onLine = it.id in BaseApplication.onLineFriendIds
            }
        }
        mAdapter?.notifyDataSetChanged()
    }

    @Suppress("DEPRECATION")
    override fun event() {
        mAdapter = DingDingTeamAdapter(requireContext(), mList, this, isLinkman)
        val width = requireActivity().windowManager.defaultDisplay.width
        mAllTeam.setIndicatorBounds(width - 80, width - 20)
        mAllTeam.setAdapter(mAdapter)
        mViewModel.allTeam()
        mViewModel.allTeamResult.observe(this, {
            MyLog.d("所有同事回调:$it")
            requireContext().handlerHttpResult(it) {
                val data = getGson().fromJson(it, AllTeamEntity::class.java).data
                data?.let { list ->
                    list.forEach { parent ->
                        //将所有商友加入到需要获取在线的列表里
                        parent.users?.forEach { child ->
                            BaseApplication.allFriendIds.add(child.id)
                        }
                    }

                    mList.clear()
                    mList.addAll(handlerOnline(list))
                    mAdapter?.notifyDataSetChanged()
                    //默认展开全部
                    repeat(list.size) { index ->
                        mAllTeam.expandGroup(index)
                    }
                    mEmptyLayout.visibility = if (mList.isEmpty()) View.VISIBLE else View.GONE
                    mAllTeam.visibility = if (mList.isEmpty()) View.GONE else View.VISIBLE
                }
            }
        })


        mViewModel.error.observe(this, {
            MyLog.d("错误:$it")
            requireActivity().showToast(it)
        })
    }

    private fun handlerOnline(list: ArrayList<AllTeamEntity.DataBean>): ArrayList<AllTeamEntity.DataBean> {
        list.forEach { parent ->
            parent.users?.forEach {
                it.onLine = it.id in BaseApplication.onLineFriendIds
            }
        }
        return list
    }

    override fun click() {

    }

    fun search(str: String) {
        mViewModel.findSomeOne(str)
        mViewModel.searchResult.observe(this, {
            MyLog.d("查询同事回调:$it")
            val data = getGson().fromJson(it, AllTeamEntity::class.java).data
            data?.let { list ->
                mSearchList.clear()
                mSearchList.addAll(list)
                mAdapter = DingDingTeamAdapter(requireContext(), mSearchList, this, isLinkman)
                mAllTeam.setAdapter(mAdapter)
                //默认展开全部
                repeat(mSearchList.size) { index ->
                    mAllTeam.expandGroup(index)
                }
                mEmptyLayout.visibility = if (mSearchList.isEmpty()) View.VISIBLE else View.GONE
                mAllTeam.visibility = if (mSearchList.isEmpty()) View.GONE else View.VISIBLE
            }
        })
    }

    fun refresh() {
        mAdapter = DingDingTeamAdapter(requireContext(), mList, this, isLinkman)
        mAllTeam.setAdapter(mAdapter)
        //默认展开全部
        repeat(mList.size) { index ->
            mAllTeam.expandGroup(index)
        }
    }

    override fun getLayout() = R.layout.fragment_chart_team

    override fun onItemClick(data: AllTeamEntity.DataBean.UsersBean, parentPosition: Int, childPosition: Int) {
        MyLog.d("同事这边有选项了")
//        if (mActivity.otherID == data.id) {
//            showToast("不可以发送对方名片给对方")
//            return
//        }

        //单选
        if (mActivity.returnToChart) {
            //恢复商友页面的选项
            mActivity.friendFragment.mList.forEach {
                it.selected = false
            }
            if (mActivity.friendFragment.mList.isNotEmpty()) {
                mActivity.friendFragment.mAdapter?.notifyDataSetChanged()
            }
        }
    }

    //多选
    override fun onItemClickForMore(data: AllTeamEntity.DataBean.UsersBean, select: Boolean, parentPosition: Int, childPosition: Int) {
        MyLog.d("触发了多选模式你看看")
        if (select) {
            mActivity.mSelectList.add(data.id)
        } else {
            mActivity.mSelectList.remove(data.id)
        }
        mActivity.refreshSelectCount()
    }
}
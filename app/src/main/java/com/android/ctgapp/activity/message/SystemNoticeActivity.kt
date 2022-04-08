package com.android.ctgapp.activity.message

import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.chart.SystemNotifyAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivitySystemNoticeBinding
import com.android.ctgapp.entity.chart.SystemNotifyEntity
import com.android.ctgapp.event.NotifySystemRefresh
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.util.*
import com.yanzhenjie.recyclerview.SwipeMenuCreator
import com.yanzhenjie.recyclerview.SwipeMenuItem
import okhttp3.ResponseBody
import org.greenrobot.eventbus.EventBus

/**
 *作者:LiBW
 *创建日期: 2021/7/31
 *描述:系统通知 页面
 */
class SystemNoticeActivity : BaseActivityV2(), SystemNotifyAdapter.SystemNotifyListener {
    private val mBinding by lazy { ActivitySystemNoticeBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private var page = 1
    private val mList = ArrayList<SystemNotifyEntity.DataBean.RecordsBean>()
    private val mAdapter by lazy { SystemNotifyAdapter(this, mList) }

    //已读消息的位置
    private var redPosition = 0
    private fun getData() {
        //获取消息
        loading.show()
        ApiMethods.getSystemNotifyList(MyObserver(listener), page)
    }

    private val listener = object : ObserverListener {
        override fun onNext(t: ResponseBody) {
            removeLoading()
            val str = t.string().handlerNull()
            MyLog.d("系统通知回调:$str")
            handlerHttpResult(str) {
                val data = getGson().fromJson(str, SystemNotifyEntity::class.java).data
                data?.records?.let {
                    if (page == 1) mList.clear()
                    mList.addAll(it)
                    mAdapter.notifyDataSetChanged()
                }
            }
        }

        override fun onError(error: String) {
            removeLoading()
            showToast(error)
        }
    }

    override fun onResume() {
        super.onResume()
        page=1
        getData()
    }

    override fun event() {
        val deleteListener = object : ObserverListener {
            override fun onNext(t: ResponseBody) {
                removeLoading()
                val str = t.string().handlerNull()
                MyLog.d("删除消息回调回调:$str")
                handlerHttpResult(str) {
                    mList.removeAt(deletePosition)
                    mAdapter.notifyDataSetChanged()
                }
            }

            override fun onError(error: String) {
                removeLoading()
                showToast(error)
            }
        }

        //为list添加侧滑菜单
        val mSwipeMenuCreator = SwipeMenuCreator { _, rightMenu, _ ->
            val deleteItem = SwipeMenuItem(this)
            deleteItem.text = "删除消息"
            deleteItem.setTextColorResource(R.color.white)
            deleteItem.setBackgroundColorResource(R.color.red_start)
            deleteItem.height = LinearLayout.LayoutParams.MATCH_PARENT
            deleteItem.width = 80f.toPx(this)
            rightMenu.addMenuItem(deleteItem)
        }
        //侧滑监听 删除功能
        mBinding.mNoticeRV.setOnItemMenuClickListener { menuBridge, adapterPosition ->
            menuBridge.closeMenu()
            when (menuBridge.position) {
                0 -> {
                    MyLog.d("删除消息")
                    showLoading()
                    deletePosition = adapterPosition
                    ApiMethods.deleteSystemNotify(
                        MyObserver(deleteListener),
                        mList[adapterPosition].id.handlerNull()
                    )
                }
            }
        }

        mBinding.mNoticeRV.setSwipeMenuCreator(mSwipeMenuCreator)
        mBinding.mNoticeRV.adapter = mAdapter
        mBinding.mNoticeRV.layoutManager = LinearLayoutManager(this)
        mAdapter.getListener(this)
    }

    private fun removeLoading() {
        loading.dismiss()
        mBinding.mRefresh.over()
    }

    //删除消息的位置
    private var deletePosition = 0

    private val redAllListener = object : ObserverListener {
        override fun onNext(t: ResponseBody) {
            removeLoading()
            val str = t.string().handlerNull()
            MyLog.d("已读消息回调回调:$str")
            handlerHttpResult(str) {
                mList.forEach {
                    it.isRead = 1
                }
                mAdapter.notifyDataSetChanged()
            }
        }

        override fun onError(error: String) {
            removeLoading()
            showToast(error)
        }
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


        //全部设为已读
        mBinding.mAllReadTV.setOnClickListener {
            if (mList.isNotEmpty()) {
                ApiMethods.readSystemNotifyAll(MyObserver(redAllListener))
            }
        }
    }


    private val redListener = object : ObserverListener {
        override fun onNext(t: ResponseBody) {
            removeLoading()
            val str = t.string().handlerNull()
            MyLog.d("已读消息回调回调:$str")
            handlerHttpResult(str) {
                mList[redPosition].isRead = 1
                mAdapter.notifyDataSetChanged()
            }
        }

        override fun onError(error: String) {
            removeLoading()
            showToast(error)
        }
    }

    //点击已读
    override fun onItemClickListener(position: Int) {
        val message = mList[position]
        //对未读消息进行处理
        if (message.isRead == 0) {
            redPosition = position
            loading.show()
            ApiMethods.readSystemNotify(
                MyObserver(redListener),
                message.id.handlerNull()
            )
        }
    }

    override fun onDestroy() {
        EventBus.getDefault().post(NotifySystemRefresh())
        super.onDestroy()
    }
}
package com.android.ctgapp.fragment.message

import android.os.Handler
import android.view.View
import android.widget.LinearLayout
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.message.SystemNoticeActivity
import com.android.ctgapp.activity.message.chart.card.DingDingContactShareActivity
import com.android.ctgapp.activity.message.chart.jumpToChart
import com.android.ctgapp.activity.mine.UserInfoViewModel
import com.android.ctgapp.activity.mine.friend.AddBusinessFriendActivity
import com.android.ctgapp.adapter.chart.ChartListAdapter
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseFragment
import com.android.ctgapp.entity.UserInfoEntity
import com.android.ctgapp.entity.chart.ChartListEntity
import com.android.ctgapp.entity.chart.ChartListEntityCopy
import com.android.ctgapp.entity.chart.GetOnLineEntity
import com.android.ctgapp.entity.chart.SystemNotifyEntity
import com.android.ctgapp.event.NotifySystemRefresh
import com.android.ctgapp.event.OnLineRefresh
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.sql.AppDatabase
import com.android.ctgapp.util.*
import com.android.ctgapp.util.chart.ThreadPoolManager
import com.yanzhenjie.recyclerview.SwipeMenuCreator
import com.yanzhenjie.recyclerview.SwipeMenuItem
import kotlinx.android.synthetic.main.fragment_message.*
import okhttp3.ResponseBody
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2020/9/29
 *描述: 消息 Fragment
 */
class MessageFragment : BaseFragment(true), ChartListAdapter.ChartListListener {
    override fun getLayout() = R.layout.fragment_message
    private val mViewModel: MessageFragmentViewModel by lazy { ViewModelProvider(requireActivity())[MessageFragmentViewModel::class.java] }
    private val mUserInfoViewModel: UserInfoViewModel by lazy { ViewModelProvider(requireActivity())[UserInfoViewModel::class.java] }
    private val mList = ArrayList<ChartListEntity>()
    private val copyList = ArrayList<ChartListEntity>()
    //适配器
    private lateinit var mAdapter: ChartListAdapter
    private val chartListDao by lazy { AppDatabase.getDatabase(requireActivity()).chartListDao() }
    private val currentChartDao by lazy { AppDatabase.getDatabase(requireActivity()).currentChartDao() }
    private val handler by lazy { Handler() }

    //搜索状态
    private var searchModel = false

    override fun onResume() {
        super.onResume()
        MyLog.d("走了走了几遍了~~~~~~~~~~~~~~~")
        refreshMessage()
    }


    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true, priority = 1)
    public fun eventBus(notify: NotifySystemRefresh) {
        MyLog.d("刷新一下数据吧")
        ApiMethods.getSystemNotifyUnread(MyObserver(listener), 1)
    }

    val listener = object : ObserverListener {
        override fun onNext(t: ResponseBody) {
            val str = t.string().handlerNull()
            MyLog.d("系统通知回调:$str")
            val data = getGson().fromJson(str, SystemNotifyEntity::class.java).data
            data?.let {
                if (it.total == 0) {
                    mNoticeContentTV.text = "暂时没有新消息"
                    mMegCountTV.visibility = View.INVISIBLE
                } else {
                    mNoticeContentTV.text = "您有新的系统消息,请查收"
                    val count = if (it.total < 100) {
                        it.total.handlerNull()
                    } else {
                        "99"
                    }
                    mMegCountTV.text = count
                    mMegCountTV.visibility = View.VISIBLE
                }
            }
        }

        override fun onError(error: String) {
            showToast(error)
        }
    }


    @Subscribe
    fun eventBus(type: OnLineRefresh) {
        refreshMessage()
        //在线人员更新
//        mAdapter.notifyDataSetChanged()
    }

    var getHistoryRead = true

    //刷新消息
    fun refreshMessage() {
        //获取数据库中的聊天列表
        ThreadPoolManager.execute {
            val list = chartListDao.loadAllChartList(BaseApplication.userId)
            val otherIds = HashSet<Int>()
            list.forEach {
                it.otherId?.let { id ->
                    if (it.newMsg) {
                        mUserInfoViewModel.findUser(it.otherId!!)
                    }
                    //将最近聊天记录的对方ID加入到列表获取在线信息
                    BaseApplication.allFriendIds.add(id)
                    otherIds.add(id)
                }
            }

            activity?.runOnUiThread {
                if (getHistoryRead) {
                    val bean = GetOnLineEntity()
                    //接收已读回执
                    bean.action = 6
                    val child = GetOnLineEntity.MsgBean()
                    child.linkIdList = otherIds
                    bean.msg = child
                    //延迟1秒后发送给后台获取最近聊天消息的最后一次已读时间
                    handler.postDelayed({
                        (activity as MainActivity).sendMessageBinder?.sendMessage(getGson().toJson(bean))
                    }, 1000)
                    getHistoryRead = false
                }
            }
            //格式化数据
//            val arrayList = ArrayList<ChartListEntityCopy>()
//            list.forEach { bean ->
//                val b = ChartListEntityCopy()
//                b.companyName = bean.companyName
//                b.currentUserId = bean.currentUserId
//                b.groupId = bean.groupId
//                b.lastMsg = bean.lastMsg
//                b.newMsg = bean.newMsg
//                b.otherHeaderImg = bean.otherHeaderImg
//                b.otherId = bean.otherId
//                b.otherName = bean.otherName
//                b.unRedMsg = bean.unRedMsg
//                b.lastMsgTime = bean.lastMsgTime
//                b.online=bean.otherId in BaseApplication.onLineFriendIds
//                arrayList.add(b)
//            }
            list.forEach {
                if (it.otherId in BaseApplication.onLineFriendIds) {
                    it.online=1
                }else{
                    it.online=0
                }
            }


            mList.clear()
            mList.addAll(list)
            requireActivity().runOnUiThread {
                mAdapter.notifyDataSetChanged()
            }
        }
    }

    override fun event() {
        ApiMethods.getSystemNotifyUnread(MyObserver(listener), 1)
        mAdapter = ChartListAdapter(requireActivity(), mList, this)
        mUserInfoViewModel.userInfoResult.observe(this, {
            //用户消息回来了 快去创建一个头像和消息记录
            MyLog.d("用户信息的回调:$it")
            requireActivity().handlerHttpResult(it) {
                //开始创建用户信息了
                val data = getGson().fromJson(it, UserInfoEntity::class.java).data
                data?.let { userInfo ->
                    ThreadPoolManager.execute {
                        val listBean = chartListDao.findChartFromList(userInfo.id, BaseApplication.userId)
                        listBean?.let { bean ->
                            bean.newMsg = false
                            bean.otherName = userInfo.realName.handlerNull()
                            bean.otherHeaderImg = userInfo.imageUrl.handlerNull()
                            bean.companyName = userInfo.defaultCompanyName.handlerNull()
                            chartListDao.updateChartList(bean)
                            refreshMessage()
                        }
                    }
                }
            }
        })

        mViewModel.error.observe(this, {
            requireActivity().showToast(it)
        })
    }

    override fun click() {
        //系统消息
        mNoticeLL.setOnClickListener {
            requireActivity().startActivity<SystemNoticeActivity>()
        }
        //搜索
        mSearchET.handlerEditTextSearch(requireActivity()) {
            searchModel = true
            copyList.clear()
            mList.forEach { msg ->
                if (it in msg.otherName) {
                    copyList.add(msg)
                }
            }
            mAdapter = ChartListAdapter(requireActivity(), copyList, this)
            //重新设置是否会出问题
//            mChartListRV.setSwipeMenuCreator(mSwipeMenuCreator)
            mChartListRV.adapter = mAdapter
            mChartListRV.layoutManager = LinearLayoutManager(requireContext())
        }
        mSearchET.handlerText {
            searchModel = false
            if (it.isEmpty()) {
                mAdapter = ChartListAdapter(requireActivity(), mList, this)
                mChartListRV.adapter = mAdapter
                mChartListRV.layoutManager = LinearLayoutManager(requireContext())
            }
        }

        //联系人 通讯录
        mLinkmanTV.setOnClickListener {
            requireActivity().startActivity<DingDingContactShareActivity>(MyConstants.IS_LINKMAN to true)
        }
        //添加
        mAddTV.setOnClickListener {
            requireActivity().startActivity<AddBusinessFriendActivity>()
        }

        //为聊天增加侧滑删除记录功能
        val mSwipeMenuCreator = SwipeMenuCreator { _, rightMenu, _ ->
            val editItem = SwipeMenuItem(requireContext())
            editItem.text = "删除"
            editItem.setTextColorResource(R.color.white)
            editItem.setBackgroundColorResource(R.color.red_start)
            editItem.height = LinearLayout.LayoutParams.MATCH_PARENT
            editItem.width = 80f.toPx(requireContext())
            rightMenu.addMenuItem(editItem)
        }
        //侧滑按钮监听
        mChartListRV.setOnItemMenuClickListener { menuBridge, adapterPosition ->
            menuBridge.closeMenu()
            //菜单位置
            when (menuBridge.position) {
                0 -> {
                    requireActivity().commonDialog("确认要删除该聊天么") {
                        val time = System.currentTimeMillis()
                        ThreadPoolManager.execute(Runnable {
                            //删除聊天列表
                            val bean = if (searchModel) copyList[adapterPosition] else mList[adapterPosition]
                            chartListDao.deleteChartList(bean)
                            //删除详细聊天信息
                            currentChartDao.deleteChartByOtherId(bean.otherId!!, BaseApplication.userId)
                            requireActivity().runOnUiThread {
                                //如果是搜索模式 删除搜索列表中的数据
                                if (searchModel) copyList.remove(mList[adapterPosition])
                                //删除列表中的数据
                                mList.remove(bean)
                                mAdapter.notifyDataSetChanged()
                                val time2 = System.currentTimeMillis() - time
                                MyLog.d("耗时:$time2")
                            }
                        })
                    }
                }
            }
        }
        mChartListRV.setSwipeMenuCreator(mSwipeMenuCreator)
        mChartListRV.adapter = mAdapter
        mChartListRV.layoutManager = LinearLayoutManager(requireContext())
    }


    //由聊天列表跳转到聊天室
    override fun onItemClick(otherID: Int?, groupID: Int?, otherName: String, otherImage: String, companyName: String) {
        //如果对方发送者不为空则进入单人聊天室
        if (otherID != null) {
            requireActivity().jumpToChart(otherID, otherName, otherImage, companyName)
        }
    }
    //由聊天列表跳转到群聊室
    override fun onItemClickForMore(otherID: Int?, groupID: Int?, otherName: String, otherImage: String, companyName: String) {

    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }
}
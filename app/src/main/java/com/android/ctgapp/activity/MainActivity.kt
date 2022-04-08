package com.android.ctgapp.activity

import android.Manifest
import android.annotation.SuppressLint
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.content.pm.PackageManager
import android.graphics.Color
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.IBinder
import android.provider.Settings
import android.view.MotionEvent
import android.view.View
import android.view.animation.AnimationUtils
import androidx.core.app.NotificationManagerCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import cn.jpush.android.api.JPushInterface
import com.android.ctgapp.R
import com.android.ctgapp.activity.message.chart.jumpToChart
import com.android.ctgapp.activity.mine.UserInfoViewModel
import com.android.ctgapp.activity.mine.friend.BusinessFriendViewModel
import com.android.ctgapp.base.AppManager
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.callback.MessageListener
import com.android.ctgapp.callback.MessageManager
import com.android.ctgapp.databinding.ActivityMainBinding
import com.android.ctgapp.entity.BusinessFriendEntity
import com.android.ctgapp.entity.chart.AllTeamEntity
import com.android.ctgapp.entity.chart.ChartResult
import com.android.ctgapp.entity.home.UpdateAppEntity
import com.android.ctgapp.event.MineFragmentRefresh
import com.android.ctgapp.fragment.deal.DealFragment
import com.android.ctgapp.fragment.home.HomeFragment
import com.android.ctgapp.fragment.message.MessageFragment
import com.android.ctgapp.fragment.mine.MineFragment
import com.android.ctgapp.fragment.work.WorkFragment
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserverHandlerLoading
import com.android.ctgapp.service.AppService
import com.android.ctgapp.sql.AppDatabase
import com.android.ctgapp.util.*
import com.android.ctgapp.util.chart.ThreadPoolManager
import com.android.ctgapp.widget.dialog.UpdateDialog
import com.permissionx.guolindev.PermissionX
import com.tencent.bugly.crashreport.CrashReport
import kotlinx.android.synthetic.main.fragment_chart_team.*
import org.greenrobot.eventbus.EventBus
import org.jetbrains.anko.textColor
import org.jetbrains.anko.textColorResource


/**
 *作者:LiBW
 *创建日期: 2020/9/29
 *描述:首页 Activity
 */
class MainActivity : BaseActivityV2(), MessageListener {
    private val mBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private val mViewModel: UserInfoViewModel by lazy { ViewModelProvider(this)[UserInfoViewModel::class.java] }
    private var prePosition = 5

    //首页
    private val homeFragment: HomeFragment by lazy { HomeFragment() }

    //消息
    private val messageFragment: MessageFragment by lazy { MessageFragment() }

    //工作
    private val workFragment: WorkFragment by lazy { WorkFragment() }

    //交易
    private val dealFragment: DealFragment by lazy { DealFragment() }

    //我的
    private val mineFragment: MineFragment by lazy { MineFragment() }
    private val service by lazy { Intent(this, AppService::class.java) }
    private val chartListDao by lazy { AppDatabase.getDatabase(this).chartListDao() }
    private val animation by lazy { AnimationUtils.loadAnimation(this, R.anim.anim_big_then_small) }
    private val fragmentList = ArrayList<Fragment>()
    val permissions = arrayOf(
        Manifest.permission.READ_CONTACTS,
        Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.WRITE_EXTERNAL_STORAGE
    )

    //解决fragment重叠问题
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable("android:support:fragments", null)
    }

    //权限检查
    private fun permissionCheck() {
        PermissionX.init(this).permissions(*permissions).onExplainRequestReason { scope, deniedList ->
            val msg = "${resources.getString(R.string.app_name)}需要获取以下权限才能良好运行"
            scope.showRequestReasonDialog(deniedList, msg, "确定", "取消")
        }.onForwardToSettings { _, _ ->
            //永久禁用的权限

        }.request { _, _, _ ->

        }
    }


     var sendMessageBinder: AppService.LocalBinder? = null

    private val connect = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            sendMessageBinder = service as AppService.LocalBinder
            MyLog.d("重连一下socket~~~~~~~~~~~~~~~~")
            sendMessageBinder?.initSocket()
        }

        override fun onServiceDisconnected(name: ComponentName?) {

        }
    }

    @SuppressLint("InlinedApi")
    private fun openNotification() {
        val canNotify = NotificationManagerCompat.from(this).areNotificationsEnabled()
        MyLog.d("用户通知权限打开了么:$canNotify")
        //如果用户没有开启通知权限进入设置打开
        if (!canNotify) {
            showToast("请手动打开APP的通知权限")
            val intent = Intent()
            when {
                Build.VERSION.SDK_INT >= 26 -> { // android 8.0引导
                    intent.action = "android.settings.APP_NOTIFICATION_SETTINGS"
                    intent.putExtra("android.provider.extra.APP_PACKAGE", packageName)
                }
//                Build.VERSION.SDK_INT >= 21 -> { // android 5.0-7.0
//                    intent.action = "android.settings.APP_NOTIFICATION_SETTINGS"
//                    intent.putExtra("app_package", packageName)
//                    intent.putExtra("app_uid", applicationInfo.uid)
//                }
                else -> { //其它
                    intent.action = "android.settings.APPLICATION_DETAILS_SETTINGS"
                    intent.data = Uri.fromParts("package", packageName, null)
                }
            }
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }


        //TODO 需要做大量的适配工作
        val level = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationManagerCompat.from(this).getNotificationChannel("message")?.importance ?: 0
        } else {
            0
        }

        MyLog.d("用户数据:$level")
        if (level < 4) {
            commonDialog("请打开消息横幅通知") {
                val intent = Intent()
                when {
                    Build.VERSION.SDK_INT >= 26 -> {
                        intent.action = Settings.ACTION_CHANNEL_NOTIFICATION_SETTINGS
                        intent.putExtra(Settings.EXTRA_APP_PACKAGE, packageName)
                        intent.putExtra(Settings.EXTRA_CHANNEL_ID, "message")
                    }

//                    Build.VERSION.SDK_INT >= 23 -> {
//                        intent.action = Settings.ACTION_CHANNEL_NOTIFICATION_SETTINGS
//                        intent.putExtra("app_package", packageName)
//                        intent.putExtra("app_uid", applicationInfo.uid)
//                    }

                    else -> {
                        intent.action = Settings.ACTION_CHANNEL_NOTIFICATION_SETTINGS
                        intent.data = Uri.fromParts("package", packageName, null)
                    }
                }
                try {
                    startActivity(intent)
                } catch (e: Exception) {
                    false.sharedSave(MyConstants.SHOW_NOTIFICATION_DIALOG)
                    showToast("当前机型需要您手动开启横幅通知权限")
                    MyLog.d("出错了:${e.message}")
                }
            }
        }
    }

    override fun event() {
        //初始化极光推送
        JPushInterface.init(this)
        //设置Alias一直报错6002 开了这个才会消失不知道为什么
        JPushInterface.setDebugMode(true); // 设置开启极光推送（JPush）的日志,发布时请关闭日志

        MyLog.d("哦哦哦哦哦JPush:${BaseApplication.userId} **********${BaseApplication.currentCompanyIdSet}")
        JPushUtil.setAlias(applicationContext, BaseApplication.userId)
//        JPushUtil.setTag(applicationContext, BaseApplication.currentCompanyIdSet)
//        fragmentList.add(homeFragment)
//        fragmentList.add(messageFragment)
//        fragmentList.add(dealFragment)
//        fragmentList.add(mineFragment)
//        mBinding.mFragmentViewPager.adapter = object :FragmentPagerAdapter(supportFragmentManager,0){
//            override fun getCount(): Int {
//                return fragmentList.size
//            }
//
//            override fun getItem(position: Int): Fragment {
//               return fragmentList[position]
//            }
//
//            override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
//                //去掉supper方法 防止删除item
//            }
//        }
//        mBinding.mFragmentViewPager.addOnPageChangeListener(object:ViewPager.OnPageChangeListener{
//            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
//
//            }
//
//            override fun onPageSelected(position: Int) {
//                handlerFootBar(position)
//            }
//
//            override fun onPageScrollStateChanged(state: Int) {
//
//            }
//        })


        //版本检测
        val code = packageManager.getPackageInfo(packageName, PackageManager.GET_CONFIGURATIONS).versionName
        MyLog.d("当前版本更新的版本:$code")
        mViewModel.checkUpdate(code)
        //注册监听者
        MessageManager.setCallback(this)

        permissionCheck()
        //引导用户打开横幅通知
//        if (sharedGet(MyConstants.SHOW_NOTIFICATION_DIALOG, true) as Boolean) {
//            openNotification()
//        }
        //连接聊天用服务
        val bindIntent = Intent(this, AppService::class.java)
        bindService(bindIntent, connect, Context.BIND_AUTO_CREATE)


        val manager = supportFragmentManager.beginTransaction()
        //先判断Fragment是否已经加入Fragment
        if (!messageFragment.isAdded) manager.add(R.id.mFragmentContainer, messageFragment)
        if (!mineFragment.isAdded) manager.add(R.id.mFragmentContainer, mineFragment)



        manager.commit()
        hideFragment(messageFragment)
        hideFragment(mineFragment)
        startService(service)
        mViewModel.error.observe(this, {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })
        //自动更新检查
        mViewModel.updateResult.observe(this, {
            MyLog.d("自动更新回调$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, UpdateAppEntity::class.java).data
                data?.let { bean ->
                    //强制更新
                    if (bean.resultType == 1) {
                        if (!BaseApplication.isDownloadApk) {
                            UpdateDialog(this, R.style.MillionDialogStyle, bean.appUrl, bean.message.handlerNull()).show()
                        }
                    }
                }
            }
        })

        //获取所有商友和好友来获取当前在线的人
        ApiMethods.apiSubscribe(ApiMethods.retrofit.getAllFriendId(), MyObserverHandlerLoading(this) {
            MyLog.d("所有的商友:$it")
            val data = initData(it)
            if (data.status == 0) {
                val entity = getGson().fromJson(it, BusinessFriendEntity::class.java).data
                entity?.let { list ->
                    list.forEach {
                        //将所有商友加入到需要获取在线的列表里
                        BaseApplication.allFriendIds.add(it.uid)
                    }
                }
            } else {
                showToast(data.msg)
            }
        })
        //获取所有公司成员
        ApiMethods.apiSubscribe(ApiMethods.retrofit.getAllComponyUser(), MyObserverHandlerLoading(this) {
            MyLog.d("回调:$it")
            MyLog.d("所有的同事:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, AllTeamEntity::class.java).data
                data?.let { list ->
                    list.forEach { parent ->
                        //将所有商友加入到需要获取在线的列表里
                        parent.users?.forEach { child ->
                            BaseApplication.allFriendIds.add(child.id)
                        }
                    }
                }
            }

        })


//        list.forEach {
//            //将所有商友加入到需要获取在线的列表里
//            BaseApplication.allFriendIds.add(it.uid)
//        }
    }

    override fun click() {
        //首页
        mBinding.mHomeLL.setOnClickListener {
            handlerFootBar(0)
        }
        //消息
        mBinding.mMessageLL.setOnClickListener {
            handlerFootBar(1)
        }
        //工作
        mBinding.mWorkLL.setOnClickListener {
            handlerFootBar(4)
        }
        //交易
        mBinding.mDealLL.setOnClickListener {
            handlerFootBar(2)
        }
        //我的
        mBinding.mMineLL.setOnClickListener {
            handlerFootBar(3)
        }
        //默认进入首页
        mBinding.mHomeLL.performClick()
    }

    private fun handlerFootBar(position: Int, isQuery: Boolean = false) {
        //如果点击位置依然是之前的位置则不作处理
        if (prePosition == position) {
            return
        }
        //恢复之前按钮的状态
        when (prePosition) {
            0 -> {
                hideFragment(homeFragment)
                mBinding.mHomeTV.textColor = Color.BLACK
                mBinding.mHomeIV.isSelected = false
            }
            1 -> {
                hideFragment(messageFragment)
                mBinding.mMessageTV.textColor = Color.BLACK
                mBinding.mMessageIV.isSelected = false
            }
            4 -> {
                hideFragment(workFragment)
                mBinding.mWorkTV.textColor = Color.BLACK
                mBinding.mWorkIV.isSelected = false
            }
            2 -> {
                hideFragment(dealFragment)
                mBinding.mDealTV.textColor = Color.BLACK
                mBinding.mDealIV.isSelected = false
            }
            3 -> {
                hideFragment(mineFragment)
                mBinding.mMineTV.textColor = Color.BLACK
                mBinding.mMineIV.isSelected = false
            }
        }
        when (position) {
            0 -> {
                mBinding.mHomeTV.textColorResource = R.color.colorAccent
                showFragment(homeFragment, R.id.mFragmentContainer)
                mBinding.mHomeIV.startAnimation(animation)
                mBinding.mHomeIV.isSelected = true
            }
            1 -> {
                mBinding.mMessageTV.textColorResource = R.color.colorAccent
                showFragment(messageFragment, R.id.mFragmentContainer)
                mBinding.mMessageIV.startAnimation(animation)
                mBinding.mMessageIV.isSelected = true
            }
            4 -> {
                mBinding.mWorkTV.textColorResource = R.color.colorAccent
                showFragment(workFragment, R.id.mFragmentContainer)
                mBinding.mWorkIV.startAnimation(animation)
                mBinding.mWorkIV.isSelected = true


            }
            2 -> {
                //区分询价记录和成交订单
                mBinding.mDealTV.textColorResource = R.color.colorAccent
                showFragment(dealFragment, R.id.mFragmentContainer)
                mBinding.mDealIV.startAnimation(animation)
                mBinding.mDealIV.isSelected = true
                if (isQuery) {
                    //展示询价记录
                    dealFragment.showQuery()
                } else {
                    dealFragment.showOrder()
                }
            }
            3 -> {
                mBinding.mMineTV.textColorResource = R.color.colorAccent
                EventBus.getDefault().post(MineFragmentRefresh())//展示前重新加载一下数据
                showFragment(mineFragment, R.id.mFragmentContainer)
                mBinding.mMineIV.startAnimation(animation)
                mBinding.mMineIV.isSelected = true
            }
        }
        prePosition = position
//        mBinding.mFragmentViewPager.currentItem = position
    }

    override fun onBackPressed() {
        exitApp(this)
    }


    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        MyLog.d("我来刷新了:${intent?.getBooleanExtra(MyConstants.REFRESH_DATA, false)}")
        intent?.let {
            if (intent.getBooleanExtra(MyConstants.REFRESH_DATA, false)) {
                homeFragment.refreshPage()
            }
            val position = intent.getIntExtra(MyConstants.GO_JUMP, -1)
            //是否要去询价单
            val isQuery = intent.getBooleanExtra(MyConstants.IS_QUERY, false)
            when {
                (position != -1) -> {
                    when (position) {
                        3 -> {
                            //暂时没有工作选单所以临时将3的工作改为2的交易
                            handlerFootBar(2, isQuery)
                        }
                        4 -> {
                            //暂时没有工作选单所以临时将3的工作改为2的交易
                            handlerFootBar(1, isQuery)
                        }
                        else -> {
                            handlerFootBar(position, isQuery)
                        }
                    }
                }
                //来自服务通知有新消息点击了跳转到聊天页面
                intent.getBooleanExtra(MyConstants.FROM_SERVICE, false) -> {
                    MyLog.d("点击了消息准备跳转到聊天页面")
                    ThreadPoolManager.execute {
                        val otherId = intent.getIntExtra(MyConstants.OTHER_ID, -1)
                        if (otherId != -1) {
                            val list = chartListDao.findChartFromList(otherId, BaseApplication.userId)
                            list?.let { bean ->
                                runOnUiThread {
                                    jumpToChart(otherId, bean.otherName, bean.otherHeaderImg, bean.companyName)
                                }
                            }
                        }
                    }
                }
                else -> {

                }
            }
        }
    }

    override fun onDestroy() {
        MessageManager.removeCallback(this)
        sendMessageBinder?.closeSocket()
        sendMessageBinder = null
        MyLog.d("销毁销毁~~~~~~~~~~~~~~")
        unbindService(connect)
        super.onDestroy()
    }

    override fun onResume() {
        super.onResume()
        MyLog.d("目标目标token:${BaseApplication.userToken}")
        MyLog.d("走了走了几遍了走了走了几遍了")
    }

    override fun onPause() {
        super.onPause()
        MyLog.d("走了走了几遍了走了走了几遍了tinglewocao")
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1000) {
            MyLog.d("有没申请的权限${permissions}")
            if (permissions.isNotEmpty()) {
                permissionCheck()
            }
            permissions.forEach {
                MyLog.d("没申请的权限有:$it")
            }
        }
    }

    //新消息来了去刷新页面
    override fun newMsg(msg: ChartResult.MsgBean) {
        messageFragment.refreshMessage()
    }

    //刷新消息列表 消息收到了让消息状态变为发送成功
    override fun msgReceive(msgId: String) {
//        messageFragment.refreshMessage()
    }

    override fun sendMsgError(msgId: String) {
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        listener?.onTouch(event)
        return super.onTouchEvent(event)
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        listener?.onDispatch(ev)
        return super.dispatchTouchEvent(ev)
    }

    private var listener: MyOnTouchListener? = null

    fun setListener(listener: MyOnTouchListener) {
        this.listener = listener
    }

    interface MyOnTouchListener {
        fun onTouch(ev: MotionEvent?)
        fun onDispatch(ev: MotionEvent?)
    }

}



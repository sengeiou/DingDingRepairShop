package com.android.ctgapp.activity.message.chart


import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.content.*
import android.graphics.Color
import android.media.MediaPlayer
import android.net.Uri
import android.os.Handler
import android.os.IBinder
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.activity.message.chart.CurrentChartUtil.defaultSetting
import com.android.ctgapp.activity.message.chart.card.DingDingContactShareActivity
import com.android.ctgapp.activity.mine.UserInfoViewModel
import com.android.ctgapp.adapter.chart.ChartAdapter
import com.android.ctgapp.adapter.chart.ChartOrderDetailActivity
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.callback.MessageListener
import com.android.ctgapp.callback.MessageManager
import com.android.ctgapp.databinding.ActivityCurrentChartBinding
import com.android.ctgapp.entity.chart.CardShareBean
import com.android.ctgapp.entity.chart.*
import com.android.ctgapp.entity.chart.ChartVoiceEntity
import com.android.ctgapp.enum.chart.MsgTypeEnum
import com.android.ctgapp.enum.chart.ReceiverTypeEnum
import com.android.ctgapp.event.MessageIsRead
import com.android.ctgapp.service.AppService
import com.android.ctgapp.sql.AppDatabase
import com.android.ctgapp.util.*
import com.android.ctgapp.util.chart.SoftKeyBoardListener
import com.android.ctgapp.util.chart.ThreadPoolManager
import com.android.ctgapp.util.chart.videocompressor.VideoCompress
import com.android.ctgapp.widget.ShowImgVideoFragment
import com.blankj.utilcode.util.KeyboardUtils
import com.google.gson.Gson
import com.nanchen.compresshelper.CompressHelper
import com.permissionx.guolindev.PermissionX
import com.zhihu.matisse.Matisse
import me.minetsh.imaging.IMGEditActivity
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.startActivityForResult
import java.io.File
import java.lang.Exception
import kotlin.collections.ArrayList

/**
 *作者:LiBW
 *创建日期: 1/3/21
 *描述: 当前聊天 页面(单聊)
 */
class CurrentChartActivity : BaseActivityV2(), ChartAdapter.MassageListClickListener, ServiceConnection, MessageListener {

    private val mBinding by lazy { ActivityCurrentChartBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root

    //聊天信息列表
    private val mList = ArrayList<ChartResult.MsgBean>()
    val mAdapter: ChartAdapter by lazy { ChartAdapter(this, mList, this, otherImage, sharedGet(MyConstants.MY_IMAGE_URL, "").handlerNull()) }

    //重新发送的消息列表
    private var resendFilePathList = ArrayList<ResendFileMessageBean>()

    //发送方ID
    val otherID: Int by lazy { intent.getIntExtra("otherID", -1) }
    val otherName: String by lazy { intent.getStringExtra("otherName") }
    val otherImage: String by lazy { intent.getStringExtra("otherImage").handlerNull() }

    var otherCompanyId = -1
    val mUserInfoViewModel: UserInfoViewModel by lazy { ViewModelProvider(this)[UserInfoViewModel::class.java] }

    /**当前状态  0键盘 1表情 2多功能  3语音  4关闭多功能*/
    private var currentType = 0

    //每次加载30条历史消息
    private val pageSize = 30

    //当前消息类型
    private var currentMessageType: Int = -1

    //动画效果(底部菜单进入效果)
    private val animationIn by lazy { AnimationUtils.loadAnimation(this, R.anim.anim_entry_from_bottom) }
    private val mViewModel: CurrentChartViewModel by lazy { ViewModelProvider(this)[CurrentChartViewModel::class.java] }

    //聊天ID
    private var uuid = ""

    //最后一条消息的时间
    private var lastMsgTime = System.currentTimeMillis()

    //最后上传视频音频的时间
    private var lastOSSTime = ""

    //是否可以获取历史记录(监听滑动到底的标志位)
    private var canGetHistoryMsg = true

    //已经到顶了不需要在加载了
    private var isTop = false

    private val handler by lazy { Handler() }

    private val chartDao: CurrentChartDao by lazy { AppDatabase.getDatabase(this).currentChartDao() }
    val chartListDao: ChartListDao by lazy { AppDatabase.getDatabase(this).chartListDao() }
    private var sendMessageBinder: AppService.LocalBinder? = null

    /**
     * 录音文件路径
     */
    private var mAudioPath = ""

    //与服务通信
    private val connect = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            sendMessageBinder = service as AppService.LocalBinder
        }

        override fun onServiceDisconnected(name: ComponentName?) {}
    }

    override fun event() {
        EventBus.getDefault().register(this)
        //初始化页面
        defaultSetting()
//        //将聊天列表的已读消息设置为0
        ThreadPoolManager.execute {
            val list = chartListDao.findChartFromList(otherID, BaseApplication.userId)
            if (list != null) {
                list.unRedMsg = 0
                chartListDao.updateChartList(list)
            }
        }
        //连接聊天用服务
        val bindIntent = Intent(applicationContext, AppService::class.java)
        bindService(bindIntent, connect, Context.BIND_AUTO_CREATE)
        findChartHistory(true)
        // 将状态栏设置成白色
        window.statusBarColor = Color.WHITE
        changeStatusIconColor(true)
        //上传文件回调
        mViewModel.fileResultWithFileName.observe(this, {
            dismissLoading()
            MyLog.d("文件上传回调:$it")
            handlerData(it) { _ ->
                val data = getGson().fromJson(it, FileResultWithPathEntity::class.java).data
                data?.let { result ->
                    val removeList = ArrayList<ResendFileMessageBean>()
                    resendFilePathList.forEach { resendBean ->
                        if (result.url!! in resendBean.oldFileName) {
                            uuid = resendBean.uuid

                            if (resendBean.fileType == MsgTypeEnum.PIC.type) {
                                handlerMessageToService(ossHeader + result.url.handlerNull(), MsgTypeEnum.PIC.type)
                            } else {
                                val ossEntity = ChartVoiceEntity()
                                ossEntity.url = ossHeader + result.url.handlerNull()
                                ossEntity.length = resendBean.fileLength
                                handlerMessageToService(getGson().toJson(ossEntity), resendBean.fileType)
                                removeList.add(resendBean)
                            }
                        }
                    }
                    //没有需要重新发送的消息
                    if (removeList.isEmpty()) {
                        if (lastOSSTime.isNotEmpty()) {
                            val ossEntity = ChartVoiceEntity()
                            ossEntity.url = ossHeader + result.url.handlerNull()
                            ossEntity.length = lastOSSTime
                            handlerMessageToService(getGson().toJson(ossEntity), currentMessageType)
                            lastOSSTime = ""
                        } else {
                            handlerMessageToService(ossHeader + result.url.handlerNull(), currentMessageType)
                        }
                    } else {
                        removeList.forEach { target ->
                            resendFilePathList.remove(target)
                        }
                    }
                }
            }
        })

        mViewModel.error.observe(this, {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })
    }

    //滑动到底部
    private fun moveToBottom(slow: Boolean = false) {
        if (mList.isNotEmpty()) {
            if (slow) {
                //带过度的移动
                handler.postDelayed({
                    mBinding.mChartRV.smoothScrollToPosition(mList.size - 1)
                }, 50)
            } else {
                //瞬移
                mBinding.mChartRV.scrollToPosition(mList.size - 1)
            }
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun click() {
        handler.postDelayed({
            tellClientMessageIsRead()
        }, 500)
        //测试 进来就都设置成已读
//        ThreadPoolManager.execute {
//            val chartList = chartDao.loadChartByOtherId(otherID, BaseApplication.userId)
//            MyLog.d("目标找到目标找到:${getGson().toJson(chartList)}")
//            chartList.forEach { bean ->
//                if (bean.read == 0) {
//                    bean.read = 1
//                    chartDao.updateChart(bean)
//                } else {
//                    return@forEach
//                }
//            }
//        }


        //监听软键盘的弹出和收起
        SoftKeyBoardListener.setListener(this, object : SoftKeyBoardListener.OnSoftKeyBoardChangeListener {
            override fun keyBoardShow(height: Int) {
                MyLog.d("键盘弹出")
                showLayout(0)
                moveToBottom()
            }

            override fun keyBoardHide(height: Int) {
                MyLog.d("键盘收起")
            }
        })

        //当聊天框内有文字的时候将+转换为发送按钮
        mBinding.mET.handlerText {
            if (it.isEmpty()) {
                mBinding.mSendTV.visibility = View.GONE
                mBinding.mAddIV.visibility = View.VISIBLE
            } else {
                mBinding.mAddIV.visibility = View.GONE
                mBinding.mSendTV.visibility = View.VISIBLE
            }
        }

        //发送按钮 发送消息 发送文字
        mBinding. mSendTV.setOnClickListener {
            val text =  mBinding.mET.text.toString()
            if (text.isEmpty()) {
                showToast("请输入要发送的内容")
            } else {
                uuid = getNewUUid()
                handlerMessageToListAndSave(text, MsgTypeEnum.TEXT.type, true)
                handlerMessageToService(text, MsgTypeEnum.TEXT.type)
            }
        }
        //退出
        mBinding.mBackIV.setOnClickListener {
            onBackPressed()
        }

        //监听list是否滑动到顶部了 如果滑动到顶部了则加载历史聊天记录
        mBinding. mChartRV.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                val manager = recyclerView.layoutManager as LinearLayoutManager
                val lastVisibleItemPosition = manager.findLastVisibleItemPosition()
                val visibleItemCount = recyclerView.childCount
                if (newState == RecyclerView.SCROLL_STATE_IDLE
                    && visibleItemCount > 0
                    && lastVisibleItemPosition == visibleItemCount - 1
                ) {
                    if (!isTop) {
                        findChartHistory(false)
                    }
                }
            }
        })

        //如果用户点击了输入框默认也为弹出键盘
        mBinding.mET.setOnClickListener {
            //键盘弹出时将信息滚动到底部 展示最后一条信息
            moveToBottom()
            showLayout(0)
        }
        //表情按钮
        mBinding.mFaceButton.setOnClickListener {
            if (currentType == 1) {
                showLayout(0)
            } else {
                showLayout(1)
            }
        }

        //展示按钮多功能布局
        mBinding.mAddIV.setOnClickListener {
            currentType = if (currentType == 2) {
                showLayout(4)
                4
            } else {
                showLayout(2)
                2
            }
        }

        //左侧发送语音按钮
        mBinding.mVoiceIconTV.setOnClickListener {
            PermissionX.init(this).permissions(Manifest.permission.RECORD_AUDIO)
                .onExplainRequestReason { scope, deniedList ->
                    val message = "该功能需要录音权限"
                    scope.showRequestReasonDialog(deniedList, message, "确定", "取消")
                }
                //被用户永久拒绝的权限
                .onForwardToSettings { _, deniedList ->
                    MyPermissionUtil.jumpToPermissionDialog(deniedList, this)
                }
                .request { allGranted, _, _ ->
                    if (allGranted) {
                        if (currentType == 3) {
                            showLayout(0)
                        } else {
                            showLayout(3)
                        }
                    } else {
                        showToast("该功能需要使用录音权限,请手动开启")
                    }
                }
        }

        //打开相册功能 相册按钮
        mBinding.mOpenPhotoTV.setOnClickListener {
            val permissions = arrayOf(Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE)
            PermissionX.init(this).permissions(*permissions)
                .onExplainRequestReason { scope, deniedList ->
                    val message = "需要您同意以下权限才能正常使用"
                    scope.showRequestReasonDialog(deniedList, message, "确定", "取消")
                }
                //被用户永久拒绝的权限
                .onForwardToSettings { _, deniedList ->
                    MyPermissionUtil.jumpToPermissionDialog(deniedList, this)
                }
                .request { allGranted, _, _ ->
                    if (allGranted) {
                        CurrentChartUtil.openPhotoAlbum(this)
                    } else {
                        showToast("请打开相机权限")
                    }
                }
        }
        //拍照按钮
        mBinding.mTakePhotoTV.setOnClickListener {
            initTakePhotoPermission()
        }

        mBinding.mVoiceDialog.setShowMoveUpToCancelHint("松开手指，发送语音")
        mBinding.mVoiceDialog.setShowReleaseToCancelHint("手指上滑，取消发送")
        //按住说话
        mBinding.viewRecord.rootView =  mBinding.mVoiceTV

        /**
         * 设置回调
         */
        mBinding. viewRecord.setOnRecordCompleteListener { filePath: String, duration: Int ->
            mAudioPath = filePath
            val str = """
                文件地址：$filePath
                录音时长:${duration / 1000}秒
                """.trimIndent()
            MyLog.d(str)
            sendVoice(duration / 1000, filePath)
        }

        //发送订单
        mBinding.mFunctionOrderBTN.setOnClickListener {
            startActivityForResult<ChartOrderActivity>(orderResultCode)
        }
        //发送商友名片 分享名片
        mBinding.mCardTV.setOnClickListener {
            //附带返回值并表明来自聊天页面 返回单个名片
            startActivityForResult<DingDingContactShareActivity>(MyConstants.BUSINESS_FRIEND_CODE, MyConstants.FROM_CHART to true, MyConstants.OTHER_ID to otherID)
        }
    }

    //处理要发送的音频
    private fun sendVoice(voiceTimeLength: Int, voiceFilePath: String) {
        val bean = ChartVoiceEntity()
        bean.length = voiceTimeLength.toString()
        bean.url = voiceFilePath
        uuid = getNewUUid()
        handlerMessageToListAndSave(getGson().toJson(bean), MsgTypeEnum.VOICE.type)
        currentMessageType = MsgTypeEnum.VOICE.type
        lastOSSTime = bean.length
        handler.postDelayed({
            mViewModel.upLoadFileResultFileName(File(bean.url))
        }, 500)
    }

    private val orderResultCode = 10002

    /**当前状态  0键盘 1表情 2多功能  3语音*/
    private fun showLayout(type: Int) {
        //恢复所有布局
        mBinding.mVoiceIconTV.imageResource = R.drawable.icon_voice_chat
        mBinding.mFaceButton.imageResource = R.drawable.icon_smile_chart
        mBinding.mAddIV.imageResource = R.drawable.add_group

        //隐藏长按说话音频
        mBinding.mVoiceTV.visibility = View.GONE
        //展示输入框
        mBinding.mET.visibility = View.VISIBLE
        //隐藏表情布局
        mBinding.mFaceRV.visibility = View.GONE
        //隐藏多功能布局
        mBinding.mFunctionLL.visibility = View.GONE
        //更新当前模式
        currentType = type
        when (type) {
            //输入模式
            0 -> {
                //展示表情图标
                mBinding.mFaceButton.visibility = View.VISIBLE
                mBinding.mET.requestFocus()
            }
            //表情模式
            1 -> {
                mBinding.mFaceButton.imageResource = R.drawable.keyboard
                KeyboardUtils.hideSoftInput(this)
                handler.postDelayed({
                    mBinding.mFaceRV.visibility = View.VISIBLE
                    mBinding.mFaceRV.startAnimation(animationIn)
                    moveToBottom()
                }, 50)
            }
            //多功能模式
            2 -> {
                //多功能模式打开 将按钮切换为X
                mBinding. mAddIV.imageResource = R.drawable.icon_close_red
                mBinding.mFaceButton.visibility = View.VISIBLE
                KeyboardUtils.hideSoftInput(this)
                handler.postDelayed({
                    mBinding.mFunctionLL.visibility = View.VISIBLE
                    mBinding.mFunctionLL.startAnimation(animationIn)
                    moveToBottom()
                }, 50)
            }
            //语音输入模式
            3 -> {
                mBinding.mFaceButton.visibility = View.GONE
                KeyboardUtils.hideSoftInput(this)
                mBinding.mVoiceIconTV.imageResource = R.drawable.keyboard
                mBinding.mVoiceTV.visibility = View.VISIBLE
                mBinding.mET.visibility = View.GONE
            }
            //关闭多功能
            4 -> {
                mBinding.mFaceButton.visibility = View.VISIBLE
                KeyboardUtils.hideSoftInput(this)
                handler.postDelayed({
                    mBinding.mFunctionLL.visibility = View.GONE
                    moveToBottom()
                }, 50)
            }
        }
    }

    //查找历史聊天记录 toBottom 是否需要滑动到最底部 (第一次获取记录的时候需要)
    private fun findChartHistory(toBottom: Boolean) {
        //查询到的数量
        val list = ArrayList<ChartResult.MsgBean>()
        ThreadPoolManager.execute {
            val chartList = chartDao.loadChartByPage(pageSize, otherID, lastMsgTime, BaseApplication.userId)
            //读取数据库中的信息数量
            val findCount = chartList.size
            chartList.forEach { entity ->
                //当发现有正在发现的消息 改为发送失败 并且更新数据库
                if (entity.msgStatus == 1) {
                    entity.msgStatus = 2
                    chartDao.updateChart(entity)
                }
                val bean = ChartResult.MsgBean()
                bean.id = entity.id
                bean.msgType = entity.msgType
                bean.senderUserId = entity.senderUserId
                bean.receiverType = entity.receiverType
                bean.receiverUserId = entity.receiverUserId
                bean.receiverGroupId = entity.receiverGroupId
                bean.message = entity.message
                bean.createTime = entity.createTime
                bean.sendTime = entity.sendTime
                bean.msgStatus = entity.msgStatus
                //entity.read==1 为已读
                bean.messageRead = entity.read == 1
                //将数据插入到上一条 成为倒叙排序
                list.add(0, bean)
                lastMsgTime = entity.createTime
            }
            if (list.isEmpty()) {
                isTop = true
            }
            mList.addAll(0, list)
            runOnUiThread {
                mAdapter.notifyItemRangeChanged(0, list.size)
                //第一次需要滑动到底部 后面都需要滑动到顶部
                if (mList.size > 1 && toBottom) {
                    moveToBottom()
                } else if (mList.size > pageSize) {
                    if (findCount > 0) {
                        mAdapter.notifyItemRangeInserted(0, list.size)
                    }
                }
                canGetHistoryMsg = true
            }
        }
    }

    //消息已经读过了
    @Subscribe
    fun event(e: MessageIsRead) {
        MyLog.d("现在将所有消息设置为已读")
        mList.forEachIndexed { index, msgBean ->
            if (!msgBean.messageRead) {
                msgBean.messageRead = true
                runOnUiThread {
                    mAdapter.notifyItemChanged(index)
                }
            }
        }
    }

    //重新发送消息
    override fun messageResend(msgId: String, msg: String, msgType: Int) {
        MyLog.d("重发的消息内容:$msg")
        //将需要重发的消息保存到临时目录后统一移除
        val needDelete = ArrayList<ChartResult.MsgBean>()
        mList.forEach {
            if (it.id == msgId) {
                //移除需要重发的信息
                needDelete.add(it)
            }
        }
        //遍历后移除需要重发的消息
        needDelete.forEach {
            mList.remove(it)
        }

        //判断重新发送的消息类型
        when (msgType) {
            //视频
            MsgTypeEnum.VIDEO.type -> {
                val videoBean = getGson().fromJson(msg, ChartVoiceEntity::class.java)
                sendVideo(videoBean)
                val bean = ResendFileMessageBean()
                bean.uuid = uuid
                bean.fileType = MsgTypeEnum.VIDEO.type
                bean.oldFileName = videoBean.url
                bean.fileLength = videoBean.length
                resendFilePathList.add(bean)

            }
            //音频
            MsgTypeEnum.VOICE.type -> {
                val voiceBean = getGson().fromJson(msg, ChartVoiceEntity::class.java)
                sendVoice(voiceBean.length.toInt(), voiceBean.url)
                val bean = ResendFileMessageBean()
                bean.uuid = uuid
                bean.fileType = MsgTypeEnum.VOICE.type
                bean.oldFileName = voiceBean.url
                bean.fileLength = voiceBean.length
                resendFilePathList.add(bean)

            }
            //图片
            MsgTypeEnum.PIC.type -> {
                sendPhoto(msg)
                val bean = ResendFileMessageBean()
                bean.uuid = uuid
                bean.fileType = MsgTypeEnum.PIC.type
                bean.oldFileName = msg
                resendFilePathList.add(bean)

            }
            //非文件类的
            else -> {
                uuid = getNewUUid()
                handlerMessageToListAndSave(msg, msgType)
                handlerMessageToService(msg, msgType)
            }
        }
        ThreadPoolManager.execute {
            //删除库里的数据
            chartDao.deleteChartById(msgId)
        }
    }

    //点击视频 视频播放
    override fun onVideoClick(url: String) {
        ShowImgVideoFragment(url, true).show(supportFragmentManager, "")
    }

    private var preVoicePlayerPosition = -1
    private val mPlayer by lazy { MediaPlayer() }

    //录音播放
    override fun onVoiceClick(url: String, imageView: ImageView?, position: Int) {
        if (mPlayer.isPlaying) {
            mPlayer.stop()
            if (preVoicePlayerPosition != -1) {
                mList[preVoicePlayerPosition].voicePlay = false
            }
        }
        mList[position].voicePlay = true
        preVoicePlayerPosition = position
        mPlayer.reset()
        //刷新列表
        mAdapter.notifyDataSetChanged()
        mPlayer.setDataSource(url)
        mPlayer.prepare()
        mPlayer.start()
        mPlayer.setOnCompletionListener {
            MyLog.d("播放完毕")
            if (preVoicePlayerPosition != -1) {
                mList[preVoicePlayerPosition].voicePlay = false
                mAdapter.notifyDataSetChanged()
            }
            preVoicePlayerPosition = -1
        }
    }

    //点击图片 放大
//    override fun onImageClick(url: String) {
//        ShowImgVideoFragment(url, false).show(supportFragmentManager, "")
//    }

    //点击订单
//    override fun onOrderClick(orderId: String, orderStatus: Int) {
//        startActivity<ChartOrderDetailActivity>(
//            MyConstants.TYPE to orderStatus,
//            MyConstants.ORDER_ID to orderId
//        )
//    }

    //点击名片 详情
//    override fun onCardClick(card: CardShareBean) {
//        startActivity<PersonInfoActivity>(
//            MyConstants.FROM_CHART to true,
//            MyConstants.FRIEND_USER_ID to card.userId,
//            MyConstants.COMPANY_ID to card.companyId,
//            MyConstants.MY_IMAGE_URL to card.imageUrl
//        )
//    }

    //点击对方头像查看详情
    override fun onOtherHeadClick() {
        startActivity<PersonInfoActivity>(
            MyConstants.FRIEND_USER_ID to otherID,
            MyConstants.COMPANY_ID to otherCompanyId,
            MyConstants.MY_IMAGE_URL to otherImage
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val tag = "日日日日"
        if (requestCode == Config.REQUEST_CODE_REQUEST && resultCode == Config.REQUEST_CODE_REQUEST_VIDEO) {
            //返回视频
            val videoPath = data!!.getStringExtra("data")
            MyLog.d(tag + "===============获取视频总时长:" + VideoPathUtils.getLocalVideoDuration(videoPath) + "===================")
            MyLog.d(tag + "===============获取视频转换:" + VideoPathUtils.getLocalVideoMinute(videoPath) + "===================")
            videoPath?.let {
                val bean = ChartVoiceEntity()
                bean.length = (VideoPathUtils.getLocalVideoDuration(videoPath) / 1000).toInt().toString()
                bean.url = videoPath
                sendVideo(bean)
            }

        } else if (requestCode == Config.REQUEST_CODE_REQUEST && resultCode == Config.RESULT_CODE_REQUEST_CAMERA) {
            val string = data!!.getStringExtra("data")
            MyLog.d("选取的图片地址$string")
            string?.let {
                sendPhoto(string)
            }
        } else if (requestCode == 10001 && resultCode == Activity.RESULT_OK && data != null) {
            //选择了照片
            val mSelected = Matisse.obtainResult(data)
            MyLog.d("哦哦哦视频地址uri列表:$mSelected")
            mSelected.forEach {
                if ("video" in it.toString()) {
                    MyLog.d("哦哦哦选择了视频")
                    val path = MyFileUtil.getVideoRealFilePath(this, it)
                    path?.let {
                        val bean = ChartVoiceEntity()
                        bean.length = (VideoPathUtils.getLocalVideoDuration(path) / 1000).toInt().toString()
                        bean.url = path
                        sendVideo(bean)
                    }
                } else {
                    MyLog.d("哦哦哦选择了图片:${getGson().toJson(mSelected)}")
                    var path = MyFileUtil.getImgRealFilePath(this, it)
                    if (path == null) {
                        //如果无法通过uri转文件路径获取到图片则另存一份图片出来转换成路径
                        path = MyFileUtil.changeFile(this, it)?.absolutePath
                    }
                    MyLog.d("哦哦哦获取到的图片地址:${path}")
                    path?.let {
                        sendPhoto(path)
                    }
                }
            }
        }
        if (resultCode == orderResultCode && data != null) {
//            MyLog.d("选择订单回调")
            val orderJson = data.getStringExtra(MyConstants.ORDER)
            if (orderJson != null && orderJson.isNotEmpty()) {
                uuid = getNewUUid()
                handlerMessageToListAndSave(orderJson, MsgTypeEnum.ORDER.type)
                handlerMessageToService(orderJson, MsgTypeEnum.ORDER.type)
            }
        }
        if (resultCode == MyConstants.BUSINESS_FRIEND_CODE && data != null) {
//            MyLog.d("选择名片回调")
            val cardJson = data.getStringExtra(MyConstants.BUSINESS_FRIEND)
//            MyLog.d("名片回来的啥:$cardJson")
            if (cardJson != null && cardJson.isNotEmpty()) {
                uuid = getNewUUid()
                handlerMessageToListAndSave(cardJson, MsgTypeEnum.CARD.type)
                handlerMessageToService(cardJson, MsgTypeEnum.CARD.type)
            }
        }
        if (requestCode==1){
           MyLog.d("编辑完图片后返回")
            //sendPhoto()
            if (resultCode == Activity.RESULT_OK) {
                sendPhoto(data!!.extras!!.getString("path")!!)
            }
        }

    }

    @Suppress("INACCESSIBLE_TYPE")
    private fun handlerVideo(videoBean: ChartVoiceEntity) {
        val newPath = "${externalCacheDir}a.mp4"
        MyLog.d("视频地址缓存地址$newPath")
        MyLog.d("旧视频地址${videoBean.url}")
        VideoCompress.compressVideoLow(videoBean.url, newPath, object : VideoCompress.CompressListener {
            override fun onSuccess() {
                //视频处理完毕上传给服务器
                currentMessageType = MsgTypeEnum.VIDEO.type
                lastOSSTime = videoBean.length
                val file = File(newPath)
                mViewModel.upLoadFileResultFileName(file)
                MyLog.d("成功")
                MyLog.d("文件大小是:${file.length()}")
            }

            override fun onFail() {
                MyLog.d("失败")
            }

            override fun onProgress(percent: Float) {
                MyLog.d("进度$percent")
            }

            override fun onStart() {
                MyLog.d("开始")
            }
        })
    }

    //发送图片
    private fun sendPhoto(imagePath: String) {
        MyLog.d("发送的文件名称:$imagePath")
        val file = File(imagePath)
        val newFile: File = CompressHelper.getDefault(applicationContext).compressToFile(file)
        //当前聊天状态切换为图片
        currentMessageType = MsgTypeEnum.PIC.type
        mViewModel.upLoadFileResultFileName(newFile)
        //将图片放入聊天列表
        uuid = getNewUUid()
        handlerMessageToListAndSave(imagePath, MsgTypeEnum.PIC.type)
    }

    //TODO
    //发送视频
    private fun sendVideo(videoBean: ChartVoiceEntity) {
        //当前聊天状态切换为图片
        currentMessageType = MsgTypeEnum.VIDEO.type
        //将图片放入聊天列表
        uuid = getNewUUid()
        handlerMessageToListAndSave(getGson().toJson(videoBean), MsgTypeEnum.VIDEO.type)
        handlerVideo(videoBean)
    }

    //将聊天信息格式化为服务器能接受的数据格式
    private fun handlerMessage(msgJson: String, msgType: Int, uuid: String): ChartResult {
        val msg = ChartResult()
        msg.id = uuid
        //消息类型  固定1聊天消息
        msg.action = 1
        //消息实体类
        val m = ChartResult.MsgBean()
        m.id = uuid
        //当前用户为发送者
        m.senderUserId = BaseApplication.userId
        //发送的消息内容
        m.message = msgJson
        //消息类型 文字 图片 语音 名片等
        m.msgType = msgType
        //接受者ID
        m.receiverUserId = otherID
        //是单聊还是群聊 当前只有单聊
        m.receiverType = ReceiverTypeEnum.USER.type
        //消息刚发出去都是未收到的状态
        m.msgStatus = 1
        //当前时间戳为发送时间
        val time = handlerCurrentTimeToString(System.currentTimeMillis())
        m.sendTime = time
        msg.msg = m
        return msg
    }

    //处理发送的消息到列表
    private fun handlerMessageToListAndSave(msgJson: String, msgType: Int, clearEdit: Boolean = false) {
        //将消息加入列表 后通知刷新
        val bean = handlerMessage(msgJson, msgType, uuid).msg!!
        MyLog.d("插入列表的ID是:${bean.id}")
        mList.add(bean)
        mAdapter.notifyDataSetChanged()
        ThreadPoolManager.execute {
            //将发送的消息存入数据库 状态为发送中
            val entity = CurrentChartEntity(
                bean.id,
                BaseApplication.userId,
                otherID,
                null,
                msgType,
                ReceiverTypeEnum.USER.type,
                handlerCurrentTimeToString(System.currentTimeMillis()),
                msgJson,
                System.currentTimeMillis(),
                //新发送的消息写死发送中 等socket回调后改为0发送成功
                1,
                BaseApplication.userId,
                0
            )
            chartDao.insertChart(entity)
        }
        //消息发送完毕滚动到底部
        moveToBottom()
        if (clearEdit) {
            //信息发送完毕清空输入框
            mBinding.mET.setText("")
        }
    }

    //处理发送的消息到后台和数据库
    private fun handlerMessageToService(msgJson: String, msgType: Int) {
        val bean: ChartResult = handlerMessage(msgJson, msgType, uuid)
        //将发送的消息存入聊天列表
        sendMessageBinder?.handlerList(bean)
        //连接socket发送消息
        sendMessageBinder?.sendMessage(Gson().toJson(bean))
    }

    //获取相机权限后进入拍照页面
    private fun initTakePhotoPermission() {
        val permissions = arrayOf(Manifest.permission.CAMERA, Manifest.permission.RECORD_AUDIO, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE)
        PermissionX.init(this).permissions(*permissions)
            .onExplainRequestReason { scope, deniedList ->
                val message = "需要您同意以下权限才能正常使用"
                scope.showRequestReasonDialog(deniedList, message, "确定", "取消")
            }
            //被用户永久拒绝的权限
            .onForwardToSettings { _, deniedList ->
                MyPermissionUtil.jumpToPermissionDialog(deniedList, this)
            }
            .request { allGranted, _, _ ->
                if (allGranted) {
                    startActivityForResult<TakePhotoActivity>(Config.REQUEST_CODE_REQUEST)
                } else {
                    showToast("请开启相机/录音等相应权限")
                }
            }
    }

    override fun onDestroy() {
        MessageManager.removeCallback(this)
        if (mPlayer.isPlaying) {
            mPlayer.stop()
        }
        BaseApplication.currentTalkTo = 0
        handler.removeCallbacksAndMessages(null)
        //断开服务连接
        try {
            unbindService(connect)
        } catch (e: Exception) {

        }
        EventBus.getDefault().unregister(this)
//        unregisterReceiver(broadcastReceiver)
        super.onDestroy()
    }


    override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
        MyLog.d("服务连接了连接了")
    }

    override fun onServiceDisconnected(name: ComponentName?) {
        MyLog.d("服务关闭了关闭了")
    }

    //后台有新消息过来了
    override fun newMsg(msg: ChartResult.MsgBean) {
        //如果发来的消息刚好是当前聊天对方就加入列表
        if (msg.senderUserId == otherID) {
            runOnUiThread {
                mList.add(msg)
                mAdapter.notifyDataSetChanged()
                moveToBottom()
            }
            tellClientMessageIsRead()
        } else {
            MyLog.d("我自己发的消息就不用管了")
        }
    }

    private fun tellClientMessageIsRead() {
        //告诉服务器已读了
        val message = MessageIsReadBean()
        val child = MessageIsReadBean.MsgBean()
        child.senderUserId = otherID
        message.msg = child
        //连接socket发送消息
        sendMessageBinder?.sendMessage(Gson().toJson(message))
    }

    //将消息状态改为收到
    override fun msgReceive(msgId: String) {
        chartDao.findChartById(msgId)?.let {
            //刷新列表
            mList.forEach { item ->
                if (msgId == item.id) {
                    item.msgStatus = 0
                }
            }
            runOnUiThread {
                mAdapter.notifyDataSetChanged()
            }
        }
    }

    //消息发送失败了
    override fun sendMsgError(msgId: String) {
        runOnUiThread {
            mList.forEach {
                if (it.id == msgId) {
                    it.msgStatus = 2
                    ThreadPoolManager.execute {
                        val data = chartDao.findChartById(msgId)
                        if (data != null) {
                            MyLog.d("重发失败了找到你这个消息了我现在去改变状态:${data.message}")
                            data.msgStatus = 2
                            chartDao.updateChart(data)
                        }
                    }
                }
            }
            mAdapter.notifyDataSetChanged()
        }
    }
}

fun Context.jumpToChart(otherID: Int, otherName: String, otherImage: String, otherCompanyName: String) {
    val intent = Intent(this, CurrentChartActivity::class.java)
    intent.putExtra("otherID", otherID)
    intent.putExtra("otherName", otherName)
    intent.putExtra("otherImage", otherImage)
    intent.putExtra("companyName", otherCompanyName)
    this.startActivity(intent)
}
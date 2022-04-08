package com.android.ctgapp.activity.message.chart.card

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.IBinder
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.UserInfoViewModel
import com.android.ctgapp.adapter.chart.ChartListForShareAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.entity.UserInfoEntity
import com.android.ctgapp.entity.chart.*
import com.android.ctgapp.enum.chart.MsgTypeEnum
import com.android.ctgapp.enum.chart.ReceiverTypeEnum
import com.android.ctgapp.service.AppService
import com.android.ctgapp.sql.AppDatabase
import com.android.ctgapp.util.*
import com.android.ctgapp.util.chart.ThreadPoolManager
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_card_share_recent_chart.*
import kotlinx.android.synthetic.main.activity_card_share_recent_chart.mChartListRV
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2/25/21
 *描述: 最近聊天 页面 分享名片到最近聊天
 */
class CardShareRecentChartActivity : BaseActivity(), ChartListForShareAdapter.ChartListListener {
    override fun getLayout() = R.layout.activity_card_share_recent_chart
    private val cardInfo by lazy { intent.getStringExtra(MyConstants.CARD_INFO) }

    private val mViewModel: UserInfoViewModel by lazy { ViewModelProvider(this)[UserInfoViewModel::class.java] }
    private val mUserId by lazy { intent.getIntExtra(MyConstants.USER_ID, -1) }
    private val mList = ArrayList<ChartListCopyEntity>()
    private val mAdapter by lazy { ChartListForShareAdapter(this, mList, this) }
    private val chartListDao by lazy { AppDatabase.getDatabase(this).chartListDao() }

    private val chartDao: CurrentChartDao by lazy { AppDatabase.getDatabase(this).currentChartDao() }

    //多选List
    private val mSelectList = ArrayList<Int>()

    //后端无法实现群发接口 此处改为前端遍历单发名片
    private var sendMessageBinder: AppService.LocalBinder? = null

    //与服务通信
    private val connect = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            sendMessageBinder = service as AppService.LocalBinder
        }

        override fun onServiceDisconnected(name: ComponentName?) {}
    }


    override fun event() {
//        mBookIV.handlerViewByTheme(this,R.drawable.icon_contact_book)

        val str = "选择${resources.getString(R.string.app_name)}联系人"
        mContactTV.text = str

        //连接聊天用服务
        val bindIntent = Intent(this, AppService::class.java)
        bindService(bindIntent, connect, Context.BIND_AUTO_CREATE)


        if (mUserId == -1) {
            showToast("用户信息有误,请稍后再试")
            finish()
        }
        mChartListRV.adapter = mAdapter
        mChartListRV.layoutManager = LinearLayoutManager(this)

        //获取数据库中的聊天列表
        ThreadPoolManager.execute {
            val list = chartListDao.loadAllChartList(BaseApplication.userId)
            mList.clear()
            list.forEach {
                val copyEntity = ChartListCopyEntity()
                copyEntity.companyName = it.companyName
                copyEntity.currentUserId = it.currentUserId
                copyEntity.otherHeaderImg = it.otherHeaderImg
                copyEntity.otherId = it.otherId
                copyEntity.otherName = it.otherName
                copyEntity.onLine = it.otherId in BaseApplication.onLineFriendIds
                mList.add(copyEntity)
            }

            runOnUiThread {
                mAdapter.notifyDataSetChanged()
            }
        }
        mViewModel.findUser(mUserId)
        mViewModel.userInfoResult.observe(this, {
            loading.dismiss()
            MyLog.d("用户信息回调:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, UserInfoEntity::class.java).data
                data?.let {


                }
            }
        })


        mViewModel.error.observe(this, {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })
    }

    override fun click() {
        //选择联系人 按钮
        mSelectContactLL.setOnClickListener {
            startActivity<DingDingContactShareActivity>(MyConstants.CARD_INFO to cardInfo)
        }
        //确认
        mConfirmBTN.setOnClickListener {
            ThreadPoolManager.execute {
                mSelectList.forEach {
                    val uuid = getNewUUid()
                    handlerMessageToSave(cardInfo, MsgTypeEnum.CARD.type, uuid, it)
                    handlerMessageToService(cardInfo, MsgTypeEnum.CARD.type, uuid, it)
                }
                mSelectList.clear()
                runOnUiThread {
                    finish()
                }
            }
        }

    }


    //处理发送的消息到列表
    private fun handlerMessageToSave(msgJson: String, msgType: Int, uuid: String, otherID: Int) {
        //将消息加入列表 后通知刷新
        val bean = handlerMessage(msgJson, msgType, uuid, otherID).msg!!
        MyLog.d("插入列表的ID是:${bean.id}")
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
    }

    //处理发送的消息到后台和数据库
    private fun handlerMessageToService(msgJson: String, msgType: Int, uuid: String, receiverId: Int) {
        val bean: ChartResult = handlerMessage(msgJson, msgType, uuid, receiverId)
        //将发送的消息存入聊天列表
        sendMessageBinder?.handlerList(bean)
        //连接socket发送消息
        sendMessageBinder?.sendMessage(Gson().toJson(bean))
    }


    private fun handlerMessage(msgJson: String, msgType: Int, uuid: String, receiverId: Int): ChartResult {
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
        m.receiverUserId = receiverId
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


    override fun onItemClick(otherID: Int?, otherName: String, otherImage: String, companyName: String, isSelect: Boolean, position: Int) {
        MyLog.d("$otherName 选中状态 $isSelect")
        mList[position].selected = isSelect
        mAdapter.notifyDataSetChanged()
        if (isSelect) {
            mSelectList.add(otherID!!)
        } else {
            mSelectList.remove(otherID!!)
        }
        val selectCount = "${mSelectList.size}人"
        mSelectCountTV.text = selectCount
    }
}
package com.android.ctgapp.activity.message.chart.card

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.IBinder
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseFragmentStatePagerAdapter
import com.android.ctgapp.entity.chart.ChartResult
import com.android.ctgapp.entity.chart.CurrentChartDao
import com.android.ctgapp.entity.chart.CurrentChartEntity
import com.android.ctgapp.enum.chart.MsgTypeEnum
import com.android.ctgapp.enum.chart.ReceiverTypeEnum
import com.android.ctgapp.service.AppService
import com.android.ctgapp.sql.AppDatabase
import com.android.ctgapp.util.*
import com.android.ctgapp.util.chart.ThreadPoolManager
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_card_share.*
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2/24/21
 *描述:分享名片页面 钉钉联系人 选择联系人 页面 V2
 */
class DingDingContactShareActivity : BaseActivity() {
    override fun getLayout() = R.layout.activity_card_share

    //商友
    val friendFragment by lazy { ChartFriendFragment(isLineman) }

    //同事
    val teamFragment by lazy { ChartTeamFragment(isLineman) }

    //单聊时不能发送对方的名片
    val otherID: Int by lazy { intent.getIntExtra(MyConstants.OTHER_ID, -1) }

    private val cardInfo by lazy { intent.getStringExtra(MyConstants.CARD_INFO) }

    private val chartDao: CurrentChartDao by lazy { AppDatabase.getDatabase(this).currentChartDao() }

    //是否来自聊天页面 如果是聊天页面就不进入详情而是返回数据
    //来自聊天就是单选 否则为多选
    val returnToChart: Boolean by lazy { intent.getBooleanExtra(MyConstants.FROM_CHART, false) }

    //当前选的商友 多选 多选模式下为发送名片到目标人物ID
    val mSelectList = mutableSetOf<Int>()

    //当前选择 单选 单选模式下选中的内容为名片JSON
    var currentSelect = ""

    var preSelect = -1
    var preSelectId = -1

    //展示联系人 不显示选择CheckBox和底部已选择
    private val isLineman by lazy { intent.getBooleanExtra(MyConstants.IS_LINKMAN, false) }

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


        MyLog.d("名片信息:$cardInfo")
        //连接聊天用服务
        val bindIntent = Intent(this, AppService::class.java)
        bindService(bindIntent, connect, Context.BIND_AUTO_CREATE)
        mSearchET.handlerEditTextSearch(this) {
            friendFragment.search(it)
            teamFragment.search(it)
        }
        mSearchET.handlerText {
            if (it.isEmpty()) {
                friendFragment.refresh()
                teamFragment.refresh()
            }
        }
        when {
            //单聊
            returnToChart -> {
                mSingleLL.visibility = View.VISIBLE
                mMoreRL.visibility = View.GONE
            }
            //联系人
            isLineman -> {
                mTitleBar.setTitle("联系人")
                mMoreRL.visibility = View.GONE
                mSingleLL.visibility = View.GONE
            }
            else -> {
                mSingleLL.visibility = View.GONE
                mMoreRL.visibility = View.VISIBLE
            }
        }


        val titles = arrayOf("商友", "同事")
        val fragmentList = ArrayList<Fragment>()
        fragmentList.add(friendFragment)
        fragmentList.add(teamFragment)
        mContactTL.setupWithViewPager(mContactViewPager)
        mContactViewPager.adapter = BaseFragmentStatePagerAdapter(titles, fragmentList, supportFragmentManager, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
    }

    override fun click() {
        //确定 聊天页面单个发送名片按钮
        mConfirmBTN.setOnClickListener {
            //如果是来自聊天页面则吧数据返回
            if (returnToChart) {
                if (currentSelect.isNotEmpty()) {
                    val intent = Intent()
                    intent.putExtra(MyConstants.BUSINESS_FRIEND, currentSelect)
                    setResult(MyConstants.BUSINESS_FRIEND_CODE, intent)
                    finish()
                } else {
                    showToast("请选择一张名片")
                }
            }
        }

        //确定 群发
        mMoreConfirmBTN.setOnClickListener {
            ThreadPoolManager.execute {
                mSelectList.forEach {
                    val uuid = getNewUUid()
                    handlerMessageToSave(cardInfo, MsgTypeEnum.CARD.type, uuid, it)
                    handlerMessageToService(cardInfo, MsgTypeEnum.CARD.type, uuid, it)
                }
                mSelectList.clear()
                runOnUiThread {
                    onBackPressed()
                }
            }
        }
    }

    override fun onBackPressed() {
        if (returnToChart) {
            finish()
        } else {
            startActivity<MainActivity>(MyConstants.GO_JUMP to 4)
            finish()
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

    fun refreshSelectCount() {
        val count = "${mSelectList.size}人"
        mSelectCountTV.text = count
    }

    override fun onDestroy() {
        super.onDestroy()
        //断开服务连接
        unbindService(connect)
    }


}
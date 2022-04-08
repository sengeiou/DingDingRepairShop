package com.android.ctgapp.adapter.chart

import android.content.Context
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.net.Uri
import android.view.*
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat


import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.activity.home.shop.CouponActivity
import com.android.ctgapp.activity.message.chart.CurrentChartActivity
import com.android.ctgapp.activity.message.chart.PersonInfoActivity
import com.android.ctgapp.activity.mine.friend.PhoneContactActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.entity.chart.CardShareBean
import com.android.ctgapp.entity.chart.ChartResult
import com.android.ctgapp.entity.deal.OrderDetailEntity
import com.android.ctgapp.entity.chart.ChartVoiceEntity
import com.android.ctgapp.entity.deal.OrderDetailTalkUseEntity
import com.android.ctgapp.enum.chart.MsgTypeEnum
import com.android.ctgapp.enum.getOrderStatusName
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.ShowImgVideoFragment

import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView
import me.minetsh.imaging.IMGEditActivity
import me.minetsh.imaging.IMGGalleryActivity
import me.minetsh.imaging.gallery.model.IMGChooseMode
import org.jetbrains.anko.*
import org.json.JSONObject
import java.io.File
import java.lang.Exception
import java.math.BigDecimal
import java.util.*

/**
 *作者:LiBW
 *创建日期: 1/8/21
 *描述: 聊天 适配器
 */
class ChartAdapter(private val context: FragmentActivity, private val mList: List<ChartResult.MsgBean>, private val listener: MassageListClickListener, private val otherImage: String, private val myImage: String) : RecyclerView.Adapter<ChartAdapter.MyViewHolder>() {
    private var headerLeft = ossHeader + otherImage
    private val headerRight = ossHeader + myImage
    private var mImageFile: File? = null
    //const val REQ_IMAGE_EDIT = 1
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //TEXT(0, "文字"), PIC(1, "图片"), VOICE(2, "语音"), VIDEO(3, "图片"),
        //GOODS(4, "商品"), ORDER(5, "订单"), CARD(6, "名片");
        val view = when (viewType) {
            //纯文字
            MsgTypeEnum.TEXT.type -> LayoutInflater.from(context).inflate(R.layout.item_chart_text, parent, false)
            MsgTypeEnum.PIC.type -> LayoutInflater.from(context).inflate(R.layout.item_chart_image, parent, false)
            MsgTypeEnum.VIDEO.type -> LayoutInflater.from(context).inflate(R.layout.item_chart_vedio, parent, false)
            MsgTypeEnum.VOICE.type -> LayoutInflater.from(context).inflate(R.layout.item_chart_voice, parent, false)
//           MsgTypeEnum.GOODS.type -> LayoutInflater.from(context).inflate(R.layout.item_chart_goods, parent, false)
            MsgTypeEnum.ORDER.type -> LayoutInflater.from(context).inflate(R.layout.item_chart_order, parent, false)
            MsgTypeEnum.CARD.type -> LayoutInflater.from(context).inflate(R.layout.item_chart_card, parent, false)
            else -> LayoutInflater.from(context).inflate(R.layout.item_chart_text, parent, false)
        }
        return MyViewHolder(view, viewType)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = mList[position]
        val isLeft = data.senderUserId != BaseApplication.userId
        //2021-01-28 16:45:14.232
        //如果时间间隔大于5分钟就显示时间戳
        try {
            val preTime = mList[position - 1].sendTime.substring(14, 16)
            val chartTime = data.sendTime
            val a = chartTime.substring(14, 16)
            if (position > 0 && preTime.isNotEmpty()) {
                if (a.toInt() - preTime.toInt() > 5) {
                    holder.mChartTimeTV.visibility = View.VISIBLE
                    holder.mChartTimeTV.text = chartTime.substring(5, 16)
                } else {
                    holder.mChartTimeTV.visibility = View.GONE
                }
            }
        } catch (e: Exception) {
            holder.mChartTimeTV.visibility = View.GONE
        }


        //如果发送方ID跟本机ID不吻合则为发信人
        val option: Int
        val options = RequestOptions()
            .placeholder(R.drawable.defaulthead)
            .error(R.drawable.defaulthead)
            .priority(Priority.LOW)
            .dontAnimate()
            .skipMemoryCache(false)//使用内存缓存
            .format(DecodeFormat.PREFER_RGB_565)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)

        //左侧
        if (isLeft) {
            Glide.with(context)
                .load(headerLeft)
                .apply(options)
                .override(100, 100)
                .into(holder.mHeaderLeftIV)

            //显示左侧头像隐藏右侧图像
            holder.mHeaderLeftCV.visibility = View.VISIBLE
            holder.mHeaderRightCV.visibility = View.INVISIBLE
            holder.mChartTextTV?.backgroundResource = R.drawable.chart_left
            //左侧消息不用管信息状态
            holder.mErrorIV.visibility = View.GONE
            option = Gravity.START
            //左侧没有已读未读
            holder.mIsRedTV.visibility = View.GONE
        } else {
            Glide.with(context).load(headerRight)
                .apply(options)
                .override(100, 100)
                .into(holder.mHeaderRightIV)
            //右侧
            holder.mHeaderLeftCV.visibility = View.INVISIBLE
            holder.mHeaderRightCV.visibility = View.VISIBLE
            holder.mIsRedTV.visibility = View.VISIBLE
            holder.mChartTextTV?.backgroundResource = R.drawable.chart_right
            option = Gravity.END
            if (data.messageRead) {
                holder.mIsRedTV.text = "已读"
                holder.mIsRedTV.textColorResource = R.color.gray_text
            } else {
                holder.mIsRedTV.text = "未读"
                holder.mIsRedTV.textColorResource = R.color.colorAccent
            }
        }
        holder.mChartContentLL.gravity = option

        when (data.msgType) {
            //纯文本
            MsgTypeEnum.TEXT.type -> {
                val parser = SmileyParser(context)
                holder.mChartTextTV?.text = parser.replace(context, data.message)
            }
            //图片
            MsgTypeEnum.PIC.type -> {
                val imgOptions = RequestOptions()
                    .error(R.drawable.logo_app_gray)
                    .priority(Priority.LOW)
                    .dontAnimate()
                    .format(DecodeFormat.PREFER_RGB_565)
                    .diskCacheStrategy(DiskCacheStrategy.RESOURCE)

                Glide.with(context).load(data.message)
                    .apply(imgOptions)
                    .into(holder.mChartImage!!)
                holder.mChartImage?.setOnClickListener {
                    //点击放大图片

                    //ShowImgVideoFragment(data.message, false).show(context.supportFragmentManager, "")
                    //listener.onImageClick(data.message)
//                    startActivityForResult(
//                        Intent(context, IMGEditActivity::class.java)
//                            .putExtra(IMGEditActivity.EXTRA_IMAGE_SAVE_PATH, data.message),
//                        REQ_IMAGE_EDIT
//                    )

                    val intent = Intent(context, IMGEditActivity::class.java)
                    val file = File(data.message);
                    val uri = Uri.fromFile(file);
                    mImageFile = File(context.getExternalCacheDir()!!.getPath(), UUID.randomUUID().toString() + ".jpg")
                    intent.putExtra(IMGEditActivity.EXTRA_IMAGE_URI, uri)
                    intent.putExtra(IMGEditActivity.EXTRA_IMAGE_SAVE_PATH, mImageFile?.absolutePath)
                    //val currentChartActivity:CurrentChartActivity=context as CurrentChartActivity
                    //currentChartActivity.test(intent)
                    context.startActivityForResult(
                        intent,
                        1
                    )
                }
            }
            //视频
            MsgTypeEnum.VIDEO.type -> {
                val bean = getGson().fromJson(data.message, ChartVoiceEntity::class.java)
                val second = bean.length.toInt() % 60
                val time = if (second < 10) {
                    val t = bean.length.toInt() % 60
                    if (t == 0) {
                        "${(bean.length.toInt() / 60)}:01"
                    } else {
                        "${(bean.length.toInt() / 60)}:0${bean.length.toInt() % 60}"

                    }
                } else {
                    val t = "${(bean.length.toInt() / 60)}:${bean.length.toInt() % 60}"
                    if (t == "0") "1" else t
//                    "${(bean.length.toInt() / 60)}:${bean.length.toInt() % 60}"
                }
                holder.mVideoTimeTV?.text = time
                Glide.with(context).load(bean.url)
                    .placeholder(R.drawable.logo_app_gray)
                    .error(R.drawable.logo_app_gray)
                    .into(holder.mVideoVV!!)

                //获取视频宽高
                holder.mVideoVV?.setOnClickListener {
                    listener.onVideoClick(bean.url)
                }
            }

            //声音
            MsgTypeEnum.VOICE.type -> {
                val bean = getGson().fromJson(data.message, ChartVoiceEntity::class.java)
                val width = (60f + bean.length.toInt() * 2).toPx(context)
                val params = LinearLayout.LayoutParams(width, 46f.toPx(context))
                holder.mVoiceLL?.layoutParams = params
                holder.mVoiceTimeTV?.text = bean.length
                if (isLeft) {
                    holder.mVoiceLL?.backgroundResource = R.drawable.chart_left
                    holder.mVoiceLeftIV?.visibility = View.VISIBLE
                    holder.mVoiceRightIV?.visibility = View.INVISIBLE
                    if (data.voicePlay) {
                        holder.mVoiceLeftIV?.imageResource = R.drawable.anim_voice_to_icon
                        val anim = holder.mVoiceLeftIV?.drawable as AnimationDrawable
                        anim.start()

                    } else {
                        holder.mVoiceLeftIV?.imageResource = R.drawable.icon_yy03
                    }
                } else {
                    holder.mVoiceLL?.backgroundResource = R.drawable.chart_right
                    holder.mVoiceLeftIV?.visibility = View.INVISIBLE
                    holder.mVoiceRightIV?.visibility = View.VISIBLE
                    if (data.voicePlay) {
                        holder.mVoiceRightIV?.imageResource = R.drawable.anim_voice_to_icon
                        val anim = holder.mVoiceRightIV?.drawable as AnimationDrawable
                        anim.start()

                    } else {
                        holder.mVoiceRightIV?.imageResource = R.drawable.icon_yy03
                    }
                }

                holder.mVoiceLL?.setOnClickListener {
                    listener.onVoiceClick(bean.url, holder.mHeaderRightIV, position)
                }
            }
            //商品
            MsgTypeEnum.GOODS.type -> {

            }
            //订单
            MsgTypeEnum.ORDER.type -> {
                val mData = getGson().fromJson(data.message, OrderDetailTalkUseEntity.DataBean::class.java)


                if (isLeft) {
                    holder.mOrderParentRL?.backgroundResource = R.drawable.chart_left
                } else {
                    holder.mOrderParentRL?.backgroundResource = R.drawable.chart_right
                }
                mData?.let { item ->
                    val orderNum = "订单编号:  ${item.orderNo.handlerNull()}"
                    holder.mOrderNumberTV?.text = orderNum
                    holder.mOrderTimeTV?.text = item.ctgOrderPay?.createTime.handlerNull()
                    val buyer = if (item.buyerUserName.handlerNull().isNotEmpty()) {
                        "下单人:${item.buyerUserName.handlerNull()}"
                    } else {
                        "下单人:${item.buyerCompanyName.handlerNull()}"
                    }
                    holder.mOrderBuyerTV?.text = buyer
                    item.state?.let { s ->
                        holder.mOrderStatusTV?.text = getOrderStatusName(s)

                    }
                    //共15件,实付$450.00
                    val b: BigDecimal = BigDecimal(item.actuallyPrice.handlerNull()).setScale(2, BigDecimal.ROUND_HALF_UP)

                    val allMoney = "共${item.totalNumber.handlerNull()}件,实付¥${b.handlerNull()}"

                    holder.mOrderText?.text = allMoney
                    //处理列表
                    item.orderDetailS?.let { list ->
                        val mAdapter = ChartOrderDetailAdapter(context, list)
                        holder.mOrderDetailRv?.adapter = mAdapter
                        holder.mOrderDetailRv?.layoutManager = LinearLayoutManager(context)
                    }
                    holder.mChartContentLL.setOnClickListener {
//                        MyLog.d("点击了订单列表准备跳转:${item.orderId.handlerNull()}")
//                        listener.onOrderClick(item.orderId.handlerNull(), item.state.handlerNull().toInt())
                        context.startActivity<ChartOrderDetailActivity>(
                            MyConstants.TYPE to item.orderId.handlerNull(),
                            MyConstants.ORDER_ID to item.state.handlerNull().toInt()
                        )
                    }
                    holder.mOrderDetailRv?.addOnItemTouchListener(object : RecyclerView.OnItemTouchListener {
                        override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
//                            listener.onOrderClick(item.orderId.handlerNull(), item.state)
                            holder.mChartContentLL.performClick()
                            return true
                        }

                        override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {
                        }

                        override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {
                        }
                    })
                }
            }
            //名片
            MsgTypeEnum.CARD.type -> {
                holder.mCardParentRl?.backgroundResource = if (isLeft) R.drawable.chart_left else R.drawable.chart_right
                val cardEntity = getGson().fromJson(data.message, CardShareBean::class.java)
                holder.mUserHeaderIV?.let {
                    Glide.with(context)
                        .load(cardEntity.imageUrl.ossUrlHandler())
                        .override(100, 100)
                        .placeholder(R.drawable.defaulthead)
                        .error(R.drawable.defaulthead)
                        .into(it)
                }
                holder.mUserNameTV?.text = cardEntity.userName.handlerNull()
                holder.mPhoneTV?.text = cardEntity.phoneNum.handlerNull()
                holder.mCompanyNameTV?.text = cardEntity.companyName.handlerNull()
                //查看名片详情
                holder.mCardParentRl?.setOnClickListener {
                    context.startActivity<PersonInfoActivity>(
                        MyConstants.FROM_CHART to true,
                        MyConstants.FRIEND_USER_ID to cardEntity.userId,
                        MyConstants.COMPANY_ID to cardEntity.companyId,
                        MyConstants.MY_IMAGE_URL to cardEntity.imageUrl
                    )
//                    listener.onCardClick(cardEntity)
                }
            }
        }
        //判断右侧消息状态
        if (!isLeft) {
            /***消息状态 0 为 没问题 1为正在发送 2为发送失败*/
            when (data.msgStatus) {
                0 -> {
                    holder.mErrorIV.visibility = View.GONE
                    holder.mErrorIV.image = null
                    holder.mErrorIV.isEnabled = false
                }
                1 -> {
                    holder.mErrorIV.visibility = View.VISIBLE
                    Glide.with(context).load(R.drawable.gif_loading).into(holder.mErrorIV)
                    holder.mErrorIV.isEnabled = false
                }
                2 -> {
                    holder.mErrorIV.visibility = View.VISIBLE
                    Glide.with(context).load(R.drawable.icon_resend).into(holder.mErrorIV)
                    holder.mErrorIV.isEnabled = true
                }
            }
        }
        //重新发送
        holder.mErrorIV.setOnClickListener {
            MyLog.d("重发的消息ID:${data.id}  消息内容是:${data.message}")
            listener.messageResend(data.id, data.message, data.msgType)
        }
        //对方头像点击进入个人详情页面
        holder.mHeaderLeftIV.setOnClickListener {

            listener.onOtherHeadClick()
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun getItemViewType(position: Int): Int {
        //根据发送者ID区分type
        return mList[position].msgType
    }

    inner class MyViewHolder(view: View, type: Int) : RecyclerView.ViewHolder(view) {
        //通用
        val mChartContentLL: LinearLayout = view.findViewById(R.id.mChartContentLL)
        val mHeaderLeftIV: ImageView = view.findViewById(R.id.mHeaderLeftIV)
        val mHeaderLeftCV: CardView = view.findViewById(R.id.mHeaderLeftCV)
        val mHeaderRightIV: ImageView = view.findViewById(R.id.mHeaderRightIV)
        val mHeaderRightCV: CardView = view.findViewById(R.id.mHeaderRightCV)
        val mErrorIV: ImageView = view.findViewById(R.id.mErrorIV)
        val mChartTimeTV: TextView = view.findViewById(R.id.mChartTimeTV)

        //已读未读
        val mIsRedTV: TextView = view.findViewById(R.id.mIsRedTV)

        //纯文字
        var mChartTextTV: TextView? = null

        //图片
        var mChartImage: ImageView? = null

        //视频
        var mVideoVV: ImageView? = null
        var mVideoTimeTV: TextView? = null

        //语音
        var mVoiceLL: LinearLayout? = null
        var mVoiceLeftIV: ImageView? = null
        var mVoiceRightIV: ImageView? = null
        var mVoiceTimeTV: TextView? = null

        //订单
        var mOrderNumberTV: TextView? = null
        var mOrderTimeTV: TextView? = null
        var mGoodsNameTV: TextView? = null
        var mGoodsInfoTV: TextView? = null
        var mOrderParentRL: RelativeLayout? = null
        var mOrderBuyerTV: TextView? = null
        var mOrderStatusTV: TextView? = null
        var mOrderText: TextView? = null
        var mOrderDetailRv: RecyclerView? = null

        //名片
        var mUserHeaderIV: CircleImageView? = null
        var mUserNameTV: TextView? = null
        var mPhoneTV: TextView? = null
        var mCompanyNameTV: TextView? = null
        var mCardParentRl: RelativeLayout? = null


        init {
            when (type) {
                MsgTypeEnum.TEXT.type -> mChartTextTV = view.findViewById(R.id.mChartTextTV)
                MsgTypeEnum.PIC.type -> mChartImage = view.findViewById(R.id.mChartImage)
                MsgTypeEnum.VIDEO.type -> {
                    mVideoVV = view.findViewById(R.id.mVideoVV)
                    mVideoTimeTV = view.findViewById(R.id.mVideoTimeTV)
                }
                MsgTypeEnum.VOICE.type -> {
                    mVoiceLL = view.findViewById(R.id.mVoiceLL)
                    mVoiceLeftIV = view.findViewById(R.id.mVoiceLeftIV)
                    mVoiceRightIV = view.findViewById(R.id.mVoiceRightIV)
                    mVoiceTimeTV = view.findViewById(R.id.mVoiceTimeTV)
                }
//           MsgTypeEnum.GOODS.type ->
                MsgTypeEnum.ORDER.type -> {
                    mOrderNumberTV = view.findViewById(R.id.mOrderNumberTV)
                    mOrderTimeTV = view.findViewById(R.id.mOrderTimeTV)
                    mGoodsNameTV = view.findViewById(R.id.mGoodsNameTV)
                    mGoodsInfoTV = view.findViewById(R.id.mGoodsInfoTV)
                    mOrderParentRL = view.findViewById(R.id.mOrderParentRL)
                    mOrderBuyerTV = view.findViewById(R.id.mOrderBuyerTV)
                    mOrderStatusTV = view.findViewById(R.id.mOrderStatusTV)
                    mOrderText = view.findViewById(R.id.mOrderText)
                    mOrderDetailRv = view.findViewById(R.id.mOrderDetailRv)
                }
                MsgTypeEnum.CARD.type -> {
                    mUserHeaderIV = view.findViewById(R.id.mUserHeaderIV)
                    mUserNameTV = view.findViewById(R.id.mUserNameTV)
                    mPhoneTV = view.findViewById(R.id.mCompanyTV)
                    mCompanyNameTV = view.findViewById(R.id.mCompanyNameTV)
                    mCardParentRl = view.findViewById(R.id.mCardParentRl)
                }
                else -> {
                }
            }
        }
    }

    fun setOtherImage(imageUrl: String) {
        headerLeft = ossHeader + imageUrl
        notifyDataSetChanged()
    }

    interface MassageListClickListener {
        fun messageResend(msgId: String, msg: String, msgType: Int)
        fun onVideoClick(url: String)
        fun onVoiceClick(url: String, imageView: ImageView?, position: Int)

        //        fun onImageClick(url: String)
//        fun onOrderClick(orderId: String, orderStatus: Int)
//        fun onCardClick(card: CardShareBean)
        fun onOtherHeadClick()
    }
}

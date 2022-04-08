package com.android.ctgapp.activity.deal

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.message.chart.jumpToChart
import com.android.ctgapp.adapter.deal.ReturnDetailEditAdapter
import com.android.ctgapp.adapter.deal.ReturnDetailImageAdapter
import com.android.ctgapp.adapter.deal.ReturnDetailShowAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityReturnGoodsDetailBinding
import com.android.ctgapp.entity.deal.ChatersBean
import com.android.ctgapp.entity.deal.OrderDetailEntity
import com.android.ctgapp.entity.deal.RefundPartBean
import com.android.ctgapp.entity.deal.ReturnGoodsDetailEntity
import com.android.ctgapp.enum.getShowName
import com.android.ctgapp.event.OrderRefresh
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.OrderProgressView
import com.android.ctgapp.widget.dialog.ReturnGoodsReasonDialog
import com.android.ctgapp.widget.dialog.SendGoodsDialog
import com.android.ctgapp.widget.dialog.company.OrderDetailCanChartDialog
import com.lwkandroid.imagepicker.ImagePicker
import com.lwkandroid.imagepicker.data.ImageBean
import com.lwkandroid.imagepicker.data.ImagePickType
import com.lwkandroid.widget.ninegridview.NineGirdImageContainer
import com.lwkandroid.widget.ninegridview.NineGridBean
import com.lwkandroid.widget.ninegridview.NineGridView
import com.nanchen.compresshelper.CompressHelper
import okhttp3.MultipartBody
import org.greenrobot.eventbus.EventBus
import java.io.File

/**
 *作者:LiBW
 *创建日期: 12/3/20
 *描述:退货详情 页面 (未审核之前可以进行修改)
 */
class ReturnGoodsDetailActivity : BaseActivityV2(), ReturnGoodsReasonDialog.Callback, SendGoodsDialog.Callback {
    private val mBinding by lazy { ActivityReturnGoodsDetailBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private val mViewModel: ReturnGoodsDetailViewModel by lazy { ViewModelProvider(this)[ReturnGoodsDetailViewModel::class.java] }

    //退货订单ID
    private var returnOrderId = ""

    //订单状态     //1-已申请  审核中  //2-同意退货 待发货 //5和9(新加待收货)-已收货  验货中  //8-退款中  //6-已完成(拒绝退货  验货不通过 退款完成  已取消)
    //新增-2:待审核 -1:审核不通过
    private var statueType: Int = -1
    private val mShowList = ArrayList<ReturnGoodsDetailEntity.DataBean.ReturnOrderDetailsBean>()
    private val orderId by lazy { intent.getStringExtra(MyConstants.ORDER_ID) }
    private val orderNo by lazy { intent.getStringExtra(MyConstants.ORDER_NO) }
    //修改后的订单列表
    val changeList = ArrayList<ReturnGoodsDetailEntity.DataBean.ReturnOrderDetailsBean>()

    private var mEntity: ReturnGoodsDetailEntity.DataBean? = null
    private val mShowAdapter: ReturnDetailShowAdapter by lazy { ReturnDetailShowAdapter(this, mShowList) }
    private val mEditList = ArrayList<ReturnGoodsDetailEntity.DataBean.ReturnOrderDetailsBean>()
    private val mEditAdapter: ReturnDetailEditAdapter by lazy { ReturnDetailEditAdapter(this, mEditList) }
    private val imageList = ArrayList<ReturnGoodsDetailEntity.DataBean.ReturnPicsBean>()
    private val mImageAdapter: ReturnDetailImageAdapter by lazy { ReturnDetailImageAdapter(this, imageList) }
    private val requestCodePicker = 1001

    //修改相关
    //退货原因
    private var selectReason = ""

    //退货描述
    private var selectReasonDetail = ""

    //展示的图片地址
    private val imageShowList = ArrayList<String>()
    private val deleteImageIds = ArrayList<String>()

    //已经处理过的图片地址
    private val imageFiles: ArrayList<File> = ArrayList()

    //物流单号
    private var mLogisticsNo = ""

    //当前是否为展示模式(对应修改模式)
    private var showModel = true


    //可供聊天的客服
    private var chartList=ArrayList<ChatersBean>()
    //聊天时展示的对方公司名称
    private var sellerCompanyName=""
    override fun event() {




        if (orderId != null && orderId.handlerNull().isNotEmpty()) {
            showLoading()
            mViewModel.getReturnGoodsDetail(orderId)
        } else if (orderNo!=null){
            showLoading()
            mViewModel.getReturnGoodsDetailV2(orderNo)
        }
        else {
            showToast("订单异常")
            finish()
        }

        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })

        //退货信息回调
        mViewModel.detailResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("售后退货详情:$it")
            handlerHttpResult(it) {
                //实体图片清除
                imageFiles.clear()
                val data = getGson().fromJson(it, ReturnGoodsDetailEntity::class.java).data
                data?.let { entity ->
                    sellerCompanyName=entity.sellerCompanyName.handlerNull()
                    //客服
                    entity.chaters?.let { list->
                        chartList.addAll(list)
                    }
                    MyLog.d("售后退货详情:${entity.returnStatusCode}")
                    showState(entity.returnStatusCode)
                    mEntity = entity
                    returnOrderId = entity.returnOrderId.handlerNull()
                    mBinding.mOrderNumberTV.text = entity.returnNo.handlerNull()
                    mBinding.mReturnTimeTV.text = "下单时间: ${entity.applyTime.handlerNull()}"
                    //退货原因
                    val returnBecause = entity.checkDesc.handlerNull()

                    if (returnBecause.isNotEmpty()) {
                        "拒绝原因:\n $returnBecause".also { mBinding.mReturnBecauseTV.text = it }
                        mBinding.mReturnBecauseTV.visibility = View.VISIBLE
                    } else {
                        mBinding.mReturnBecauseTV.visibility = View.GONE
                    }

//                    val remark = "备注: ${entity.remark.handlerNull()}"
//                    mRemarkTV.text = remark

                    mBinding.mAddressTV.text = entity.sellerCompanyAddress.handlerNull()
                    //退货原因 和描述
                    selectReason = entity.returnReason.handlerNull()
                    mBinding.mReturnReasonTV.text = selectReason
                    if (selectReason.isEmpty()) {
                        mBinding.mSelectReasonTV.text = "请选择"
                    } else {
                        mBinding.mSelectReasonTV.text = selectReason
                    }

                    selectReasonDetail = entity.returnDesc.handlerNull()
                    //退货问题描述
                    mBinding.mReturnReasonDetailTV.text = selectReasonDetail
                    mBinding.mRemarkET.textSet(selectReasonDetail)
                    //物流信息
                    if (data.logisticsName != null || data.logisticsNo != null) {
                        mBinding.mLogisticsLL.visibility = View.VISIBLE
                        val company = "物流公司: ${data.logisticsName.handlerNull()}"
                        mBinding.mLogisticsCompanyTV.text = company
                        val number = "物流单号: ${data.logisticsNo.handlerNull()}"
                        mBinding.mLogisticsNumberTV.text = number
                        mLogisticsNo = data.logisticsNo.handlerNull()
                    } else {
                        mBinding.mLogisticsLL.visibility = View.GONE
                    }

                    entity.returnOrderDetails?.let { list ->
                        mShowList.clear()
                        //仅仅展示有退货的商品
                        list.forEach { item ->
                            if (item.returnNum > 0) {
                                mShowList.add(item)
                            }
                        }
                        mShowAdapter.notifyDataSetChanged()
                    }
                    //退货图片
                    entity.returnPics?.let { list ->
                        imageList.clear()
                        imageList.addAll(list)
                        mImageAdapter.notifyDataSetChanged()
                        val nineList = ArrayList<NineGridBean>()
                        imageShowList.clear()
                        var count = 0
                        //之前上传的图片
                        list.forEach { item ->
                            MyLog.d("出现了${count++}")
                            imageShowList.add(item.picUrl.handlerNull())
                            nineList.add(NineGridBean(item.picUrl.handlerNull()))
                        }
                        mBinding.mPhotoNGV.dataList = nineList
                    }
                    //修改列表
                    //如果是提交审核的状态 则更新编辑列表和图片展示列表
                    if (statueType == 1) {
                        entity.returnOrderDetails?.let { list ->
                            mEditList.clear()
                            changeList.clear()
                            list.forEach { item ->
                                //如果可以退货最大数量为0则表示已经全部退货了 不予展示
                                if (item.goodsAmount > 0) {
                                    changeList.add(item)
                                    mEditList.add(item)
                                }
                            }
                            mEditAdapter.notifyDataSetChanged()
                        }
                    }
                }
            }
        })
        //撤销退货回调
        mViewModel.cancelResult.observe(this, Observer {
            MyLog.d("撤销退货回调:$it")
            loading.dismiss()
            val data = initData(it)
            if (data.status == 0) {
                showToast("撤销退货成功")
                finish()
            } else {
                showToast(data.msg)
            }
        })
        //修改退货单
        mViewModel.changeResult.observe(this, Observer {
            MyLog.d("修改退货单回调:$it")
            loading.dismiss()
            val data = initData(it)
            if (data.status == 0) {
                //清除删除的图片列表
                deleteImageIds.clear()
                showToast("修改退货单成功")
                //恢复按钮 切换为展示模式
                showModel = true
                mBinding.mShowLL.visibility = View.VISIBLE
                mBinding.mEditLL.visibility = View.GONE
                mBinding.mCancelBTN.visibility = View.VISIBLE
                mBinding.mEditBTN.text = "修改"
                mViewModel.getReturnGoodsDetail(orderId)

            } else {
                showToast(data.msg)
            }
        })
    }
    fun showState(type: Int){
        //验货不通过是3 拒绝退货是4
        //当前订单状态
       // statueType = intent.getIntExtra(MyConstants.TYPE, -1)
        statueType = type
        mBinding.mPartsShowRV.adapter = mShowAdapter
        mBinding.mPartsShowRV.layoutManager = LinearLayoutManager(this)
        mBinding.mImageRV.adapter = mImageAdapter
        mBinding.mImageRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        //已申请(审核中)订单可以进行修改

        when (statueType) {
            1 -> {
                mBinding.mEditRL.visibility = View.VISIBLE
                mBinding.mPartsEditRV.adapter = mEditAdapter
                mBinding.mPartsEditRV.layoutManager = LinearLayoutManager(this)
                initImagePicker()
            }
            2 -> {
                MyLog.d("展示待发货按钮")
                //待发货状态展示发货按钮
                mBinding.mSendGoodsRL.visibility = View.VISIBLE
                mBinding.mEditRL.visibility = View.GONE
            }
            else -> {
                mBinding.mEditRL.visibility = View.GONE
            }
        }
        if (statueType == 6 || statueType == 4 || statueType == 7) {
            mBinding.mFinishTV.text = getShowName(statueType)
            mBinding.mTitleStatueTV.text = getShowName(statueType)

        } else {
            mBinding.mFinishTV.text = "已完成"
            mBinding.mTitleStatueTV.text = "已完成"
        }

        mBinding.mShowStatueTV.text = getShowName(statueType)
        if (statueType == 9 || statueType == 5) {
            mBinding.mShowStatueTV.text = "验货中"
        }


        var flag = true
        var isLast = false
        val type = when (statueType) {
            1 -> {
                mBinding.mTitleStatueTV.text = "审核中"
                1
            }
            2 -> {
                mBinding.mTitleStatueTV.text = "待发货"
                2
            }
            5 -> {
                mBinding.mTitleStatueTV.text = "验货中"
                3
            }
            9 -> {
                mBinding.mTitleStatueTV.text = "验货中"
                3
            }
            8 -> {
                mBinding.mTitleStatueTV.text = "退款中"
                4
            }
            6 -> {
                mBinding.mTitleStatueTV.text = "已退款"
                5
            }
            -1->{
                mBinding.mTitleStatueTV.text = "审核不通过"
                1
            }
            -2->{
                mBinding.mTitleStatueTV.text = "待审核"
                1
            }
            else -> -100
        }
        repeat(5) {
            //最后一个
            if (it == 4) isLast = true
            if (it == type - 1) flag = false
            val view: OrderProgressView = if (it == type - 1) {
                OrderProgressView(flag, this, isLast, true)
            } else {
                OrderProgressView(flag, this, isLast)
            }
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            params.weight = 1f
            view.layoutParams = params
            mBinding.mProgressLL.addView(view)
        }
    }
    override fun click() {
        //聊天 按钮
        mBinding.mChartLL.setOnClickListener {
            when(chartList.size){
                0->{
                    showToast("抱歉,该供应商暂无客服")
                }
                1->{
                    val bean=chartList[0]
                    if (bean.id== BaseApplication.userId){
                        showToast("抱歉无法和自己聊天")
                    }else{
                        jumpToChart(bean.id,bean.name,"",sellerCompanyName)
                    }
                }
                else->{
                    OrderDetailCanChartDialog(chartList,sellerCompanyName).show(supportFragmentManager,"")

                }
            }
        }


        //撤销退货
        mBinding.mCancelBTN.setOnClickListener {
            commonDialog("确认撤销退货么") {
                showLoading()
                mViewModel.cancelReturnGoodsOrder(returnOrderId)
            }
        }
        //编辑退货
        mBinding.mEditBTN.setOnClickListener {
            if (showModel) {
                //切换为修改模式
                //编辑模式
                showModel = false
                mBinding.mShowLL.visibility = View.GONE
                mBinding.mEditLL.visibility = View.VISIBLE
                mBinding.mCancelBTN.visibility = View.GONE
                mBinding.mEditBTN.text = "提交"
            } else {
                //编辑模式下按钮为提交
                changeReturnGood()
            }
        }

        //选择退货原因
        mBinding.mSelectReturnReasonLL.setOnClickListener {
            ReturnGoodsReasonDialog(selectReason, this).show(supportFragmentManager, "")
        }
        //发货 按钮
        mBinding.mSendGoodsBTN.setOnClickListener {
            MyLog.d("点击发货")
            SendGoodsDialog(returnOrderId, this).show(supportFragmentManager, "")
        }
        //复制
        mBinding.mCopyTV.setOnClickListener {
            (getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager).setPrimaryClip(ClipData.newPlainText(null, mLogisticsNo))
            showToast("已将运单号复制到剪切板")
        }
    }

    //修改退货按钮事件
    private fun changeReturnGood() {

        val beans = ArrayList<RefundPartBean>()
        changeList.forEach {
            //添加选中的商品
            if (it.afterSaleSelect) {
                MyLog.d("有一个商品 ")
                val item = RefundPartBean()
                MyLog.d("他的ID叫做${item.orderDetailId}")
                item.orderDetailId = it.orderDetailId
//                item.num = it.goodsAmount
                item.num = it.editGoodsReturn
//                item.num = it.returnNum
                beans.add(item)
            }
        }
        //当前没有勾选的商品
        if (beans.isEmpty()) {
            showToast("至少选择一个需要退货的商品")
            return
        }


        //压缩图片
        imageShowList.forEach {
            //压缩文件形式图片
            if (!it.startsWith("http")) {
                val file = File(it)
                val newFile: File = CompressHelper.getDefault(applicationContext).compressToFile(file)
                imageFiles.add(newFile)
            }
        }



        loading.show()
        val parts = ArrayList<MultipartBody.Part>()
        imageFiles.forEach {
            parts.add(fileToMultipartBodyPart("files", it))
        }




        repeat(beans.size) {
            parts.add(textToMultipartBodyPart("ctgOrderDetailNums[${it}].orderDetailId", beans[it].orderDetailId.handlerNull()))
            MyLog.d("退货数量是多少:${beans[it].num}")

            parts.add(textToMultipartBodyPart("ctgOrderDetailNums[${it}].num", beans[it].num.handlerNull()))
        }

        //退货原因
        parts.add(textToMultipartBodyPart("returnReason", selectReason))

        //描述
        parts.add(textToMultipartBodyPart("returnDesc", mBinding.mRemarkET.text.handlerNull()))

        //删除的图片列表
        repeat(deleteImageIds.size) {
            parts.add(textToMultipartBodyPart("deleteReturnPics[${it}]", deleteImageIds[it].handlerNull()))
        }
        showLoading()
        mViewModel.changeForRefund(returnOrderId, parts)
    }

    private fun initImagePicker() {
        //设置图片加载器，这个是必须的，不然图片无法显示
        mBinding.mPhotoNGV.setImageLoader(GlideImageLoader())
        //设置显示列数，默认3列
        mBinding.mPhotoNGV.setColumnCount(3)
        //设置是否为编辑模式，默认为false
        mBinding.mPhotoNGV.setIsEditMode(true)
        //设置单张图片显示时的尺寸，默认100dp
        mBinding.mPhotoNGV.setSingleImageSize(150)
        //设置单张图片显示时的宽高比，默认1.0f
        mBinding.mPhotoNGV.setSingleImageRatio(0.8f)
        //设置最大显示数量，默认9张
        mBinding.mPhotoNGV.setMaxNum(4)
        //设置图片显示间隔大小，默认3dp
        mBinding.mPhotoNGV.setSpcaeSize(4)
        mBinding.mPhotoNGV.setRatioOfDeleteIcon(0.15f)
        //设置“+”号的图片
        mBinding.mPhotoNGV.setIcAddMoreResId(R.drawable.ic_ngv_add_pic)
        //设置各类点击监听
        mBinding.mPhotoNGV.setOnItemClickListener(object : NineGridView.onItemClickListener {
            override fun onNineGirdItemDeleted(position: Int, gridBean: NineGridBean?, imageContainer: NineGirdImageContainer?) {
                if (imageShowList.isNotEmpty()) {
                    imageShowList.removeAt(position)
                }
                //如果移除的url是OSS内的则发送给后端删除
                gridBean?.originUrl?.let {
                    if (it.startsWith("http")) {
                        mEntity?.returnPics?.forEach { item ->
                            if (item.picUrl == it) {
                                deleteImageIds.add(item.id.handlerNull())
                            }
                        }
                    }
                }
            }

            override fun onNineGirdItemClick(position: Int, gridBean: NineGridBean?, imageContainer: NineGirdImageContainer?) {

            }

            override fun onNineGirdAddMoreClick(cha: Int) {
                //编辑模式下，图片展示数量尚未达到最大数量时，会显示一个“+”号，点击后回调这里
                ImagePicker()
//                    .cachePath(Environment.getExternalStorageDirectory().absolutePath)
                    .cachePath(getExternalFilesDir(null)?.absolutePath)
                    .pickType(ImagePickType.MULTI)
                    .displayer(ImagePickerLoader())
                    .maxNum(cha)
                    .start(this@ReturnGoodsDetailActivity, requestCodePicker)
            }
        })

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == requestCodePicker && resultCode == Activity.RESULT_OK && data != null) {
            val list: List<ImageBean> = data.getParcelableArrayListExtra(ImagePicker.INTENT_RESULT_DATA)!!
            val resultList: MutableList<NineGridBean> = java.util.ArrayList()
            for (imageBean in list) {
                val nineGirdData = NineGridBean(imageBean.imagePath)
                imageShowList.add(imageBean.imagePath)
                resultList.add(nineGirdData)
            }
            mBinding.mPhotoNGV.addDataList(resultList)
        }
    }

    override fun onItemSelect(select: String) {
        selectReason = select
        mBinding.mSelectReasonTV.text = select
    }

    //发货完毕
    override fun sendGoodsFinish() {
        mBinding.mSendGoodsBTN.visibility = View.GONE
        if (orderId != null && orderId.handlerNull().isNotEmpty()) {
            showLoading()
            mViewModel.getReturnGoodsDetail(orderId)
        } else {
            showToast("订单异常")
            finish()
        }
        statueType = 9
        mBinding.mShowStatueTV.text = getShowName(statueType)
        //进度条     //1-已申请  审核中  //2-同意退货 待发货 //5和9(新加待收货)已收货  验货中  //8-退款中  //6-已完成(拒绝退货  验货不通过 退款完成  已取消) //
        var flag = true
        var isLast = false
        val type = when (statueType) {
            1 -> 1
            2 -> 2
            5 -> 3
            9 -> 3
            8 -> 4
            6 -> 5
            else -> -1
        }
        mBinding.mProgressLL.removeAllViews()
        repeat(5) {
            //最后一个
            if (it == 4) isLast = true
            if (it == type - 1) flag = false
            val view: OrderProgressView = if (it == type - 1) {
                OrderProgressView(flag, this, isLast, true)
            } else {
                OrderProgressView(flag, this, isLast)
            }
            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            params.weight = 1f
            view.layoutParams = params

            mBinding.mProgressLL.addView(view)
        }
    }

    override fun onDestroy() {
        EventBus.getDefault().post(OrderRefresh(3))
        super.onDestroy()
    }
}
package com.android.ctgapp.activity.deal

import android.app.Activity
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.adapter.deal.LaunchAfterSaleAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityLacunchAfterSaleBinding
import com.android.ctgapp.entity.deal.CanRefundEntity
import com.android.ctgapp.entity.deal.RefundPartBean
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.ReturnGoodsReasonDialog
import com.lwkandroid.imagepicker.ImagePicker
import com.lwkandroid.imagepicker.data.ImageBean
import com.lwkandroid.imagepicker.data.ImagePickType
import com.lwkandroid.widget.ninegridview.NineGirdImageContainer
import com.lwkandroid.widget.ninegridview.NineGridBean
import com.lwkandroid.widget.ninegridview.NineGridView
import com.nanchen.compresshelper.CompressHelper
import kotlinx.android.synthetic.main.activity_lacunch_after_sale.*
import okhttp3.MultipartBody
import org.jetbrains.anko.startActivity
import java.io.File

/**
 *作者:LiBW
 *创建日期: 11/18/20
 *描述: 发起售后 页面
 */
class LaunchAfterSaleActivity : BaseActivityV2(), ReturnGoodsReasonDialog.Callback {
    val binding by lazy { ActivityLacunchAfterSaleBinding.inflate(layoutInflater) }
    override fun getLayout() = binding.root
    private val mViewModel: LaunchAfterSaleViewModel by lazy { ViewModelProvider(this)[LaunchAfterSaleViewModel::class.java] }
    private val hasUseCoupon:Boolean by lazy { intent.getBooleanExtra("hasUseCoupon",false) }
    private val requestCodePicker = 1001
    val mList = ArrayList<CanRefundEntity.DataBean>()
    private val orderId: String by lazy { intent.getStringExtra(MyConstants.ORDER_ID) }

    //退货原因
    private var selectReason = ""

    //展示的图片地址
    private val imageShowList = ArrayList<String>()

    //已经处理过的图片地址
    private val imageFiles: ArrayList<File> = ArrayList()
    override fun event() {
        loading.show()

        //获取可以发起售后的商品列表
        mViewModel.getOrderDetail(orderId)

        initImagePicker()
        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.applyResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("发起售后回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("提交成功")
                startActivity<MainActivity>(MyConstants.GO_JUMP to 3)
            } else {
                showToast(data.msg)
            }
        })

        //订单详情
        mViewModel.orderDetailResult.observe(this, {
            loading.dismiss()
            MyLog.d("待售后订单详情:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, CanRefundEntity::class.java).data
                data?.let { list ->
                    mList.clear()
                    mList.addAll(list)
                    val mAdapter = LaunchAfterSaleAdapter(this, list,hasUseCoupon)
                    binding.mGoodsRV.adapter = mAdapter
                    binding.mGoodsRV.layoutManager = LinearLayoutManager(this)
                }
            }
        })
    }

    override fun click() {
        //选择退货原因
        binding.mSelectReturnReasonLL.setOnClickListener {
            ReturnGoodsReasonDialog(selectReason, this).show(supportFragmentManager, "")
        }

        //确认
        binding.mConfirmBTN.setOnClickListener {
            val beans = ArrayList<RefundPartBean>()
            mList.forEach {
                //添加选中的商品
                if (it.afterSaleSelect) {
                    val item = RefundPartBean()
                    item.orderDetailId = it.orderDetailId
                    item.num = it.goodsAmount
                    beans.add(item)
                }
            }

            if (beans.isEmpty()) {
                showToast("至少选择一个需要退货的商品")
                return@setOnClickListener
            }

            //压缩图片
            imageShowList.forEach {
                val file = File(it)
                val newFile: File = CompressHelper.getDefault(applicationContext).compressToFile(file)
                imageFiles.add(newFile)
            }

            loading.show()
            val parts = ArrayList<MultipartBody.Part>()
            imageFiles.forEach {
                parts.add(fileToMultipartBodyPart("files", it))
            }

            repeat(beans.size) {
                parts.add(textToMultipartBodyPart("ctgOrderDetailNums[${it}].orderDetailId", beans[it].orderDetailId.handlerNull()))
                MyLog.d("我都上传了什么商品Id:${beans[it].orderDetailId.handlerNull()}")
                MyLog.d("我都上传了什么商品数量:${beans[it].num.handlerNull()}")
                parts.add(textToMultipartBodyPart("ctgOrderDetailNums[${it}].num", beans[it].num.handlerNull()))
            }
            //退货原因
            parts.add(textToMultipartBodyPart("returnReason", selectReason))
            //描述
            parts.add(textToMultipartBodyPart("returnDesc", mRemarkET.text.handlerNull()))
            mViewModel.applyForRefund(orderId, parts)
        }

    }

    private fun initImagePicker() {
        binding.mPhotoNGV.apply {
            //设置图片加载器，这个是必须的，不然图片无法显示
            setImageLoader(GlideImageLoader())
            //设置显示列数，默认3列
            setColumnCount(3)
            //设置是否为编辑模式，默认为false
            setIsEditMode(true)
            //设置单张图片显示时的尺寸，默认100dp
            setSingleImageSize(150)
            //设置单张图片显示时的宽高比，默认1.0f
            setSingleImageRatio(0.8f)
            //设置最大显示数量，默认9张
            setMaxNum(4)
            //设置图片显示间隔大小，默认3dp
            setSpcaeSize(4)
            setRatioOfDeleteIcon(0.15f)
            //设置“+”号的图片
            setIcAddMoreResId(R.drawable.ic_ngv_add_pic)
            //设置各类点击监听
            setOnItemClickListener(object : NineGridView.onItemClickListener {
                override fun onNineGirdItemDeleted(position: Int, gridBean: NineGridBean?, imageContainer: NineGirdImageContainer?) {
                    if (imageShowList.isNotEmpty()) {
                        imageShowList.removeAt(position)
                    }
                    //如果移除的url是OSS内的则发送给后端删除
                    gridBean?.originUrl?.let {
//                    if (it.startsWith("http")) {
//                        deleteUrl.add(it)
//                    }
                    }
                }

                override fun onNineGirdItemClick(position: Int, gridBean: NineGridBean?, imageContainer: NineGirdImageContainer?) {

                }

                override fun onNineGirdAddMoreClick(cha: Int) {
                    //编辑模式下，图片展示数量尚未达到最大数量时，会显示一个“+”号，点击后回调这里
                    ImagePicker()
                        .cachePath(getExternalFilesDir(null)?.absolutePath)
                        .pickType(ImagePickType.MULTI)
                        .displayer(ImagePickerLoader())
                        .maxNum(cha)
                        .start(this@LaunchAfterSaleActivity, requestCodePicker)
                }
            })
        }

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
            binding.mPhotoNGV.addDataList(resultList)
        }
    }

    override fun onItemSelect(select: String) {
        selectReason = select
        binding.mSelectReasonTV.text = select
    }
}
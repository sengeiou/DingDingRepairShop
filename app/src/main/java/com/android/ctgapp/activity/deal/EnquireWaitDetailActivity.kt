package com.android.ctgapp.activity.deal

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.activity.home.VinSearchActivity
import com.android.ctgapp.adapter.ImageAdapter
import com.android.ctgapp.adapter.deal.enquire.EnquireHasQueryAdapterParent
import com.android.ctgapp.adapter.home.enquiry.EnquireWaitDetailAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityEnquireWhaitDetailBinding
import com.android.ctgapp.entity.home.EnquireWhiteEntityV3
import com.android.ctgapp.event.OrderRefresh
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.util.*
import okhttp3.ResponseBody
import org.greenrobot.eventbus.EventBus
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2021/7/30
 *描述:询价记录 待报价 详情 页面 询价单详情 页面
 */
class EnquireWaitDetailActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityEnquireWhaitDetailBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    var mVin = ""
    private val enquiryId by lazy { intent.getIntExtra(MyConstants.ENQUIRY_ID, -1) }

    private val listener = object : ObserverListener {
        override fun onNext(t: ResponseBody) {
            val str = t.string().handlerNull()
            MyLog.d("询价成功$str")
            val data = getGson().fromJson(str, EnquireWhiteEntityV3::class.java).data
            data?.let {
                mVin = it.vin.handlerNull()
                mBinding.mOrderNumTV.text = it.enquiryNo.handlerNull()
                mBinding.mCarModelTV.text = it.modelInfo.handlerNull()
                mBinding.mVinTV.text = it.vin.handlerNull()
                mBinding.mTimeTV.text = it.createTime.handlerNull()
                mBinding.mRemarkTV.text = it.remark.handlerNull()
                val invoice = when (data.invoiceType) {
                    0 -> "不开票"
//                    1 -> "普通发票"
//                    2 -> "增值税发票"
                    1 -> "开票"
                    2 -> "开票"
                    else -> ""
                }
                mBinding.mNeedInvoiceTV.text = invoice
                val sellers = ArrayList<String>()

                if (it.flow==2){
                    sellers.add(it.allianceName.handlerNull())
                }else{
                    it.enquiryTargets?.forEach { bean ->
                        sellers.add(bean.targetCompanyName.handlerNull())
                    }
                }
                //供应商列表
                mBinding.mSellerTV.text = sellers.toString()



                "共${data.enquiryDetails?.size}种".also { mBinding.mCountTV.text = it }
                data.enquiryDetails?.let { list ->
                    mBinding.mRecyclerView.adapter = EnquireWaitDetailAdapter(this@EnquireWaitDetailActivity, list)
                    mBinding.mRecyclerView.layoutManager = LinearLayoutManager(this@EnquireWaitDetailActivity)
                }
                //已报价列表(此处按供应商排列)
                data.immutablePairs?.let { list ->
                    val array = ArrayList<EnquireWhiteEntityV3.DataBean.ImmutablePairsBean>()
                    list.forEach { bean ->
                        if (bean.items != null) {
                            array.add(bean)
                        }
                    }
                    if (array.isNotEmpty()) {
                        mBinding.mEnquireRV.adapter = EnquireHasQueryAdapterParent(this@EnquireWaitDetailActivity, array)
                        mBinding.mEnquireRV.layoutManager = LinearLayoutManager(this@EnquireWaitDetailActivity)
                    } else {
                        mBinding.mEnquireLL.visibility = View.GONE
                    }
                }
                if (data.immutablePairs == null) {
                    mBinding.mEnquireLL.visibility = View.GONE
                }
                //新增展示询价图片
                data.imgUrls?.let { list ->
                    if (list.isNotEmpty()) {
                        mBinding.mQueryImageTV.visibility = View.VISIBLE
                        mBinding.mQueryImageRV.adapter = ImageAdapter(this@EnquireWaitDetailActivity, list)
                        mBinding.mQueryImageRV.layoutManager = GridLayoutManager(this@EnquireWaitDetailActivity, 1, GridLayoutManager.HORIZONTAL, false)
                    }
                }
            }
        }

        override fun onError(error: String) {
            showToast(error)
            MyLog.d("询价失败$error")

        }
    }

    override fun event() {
        ApiMethods.getQueryDetail(MyObserver(listener), enquiryId, 1)


    }

    override fun onDestroy() {
        EventBus.getDefault().post(OrderRefresh(1))
        super.onDestroy()
    }

    override fun click() {
        mBinding.mCopyOrderNumberTV.setOnClickListener {
            copyTextToPhone(this, mBinding.mOrderNumTV.text.handlerNull())
            showToast("已将询价单号复制到剪切板")
        }
        mBinding.mCopyVinTV.setOnClickListener {
            copyTextToPhone(this, mBinding.mVinTV.text.handlerNull())
            showToast("已将VIN码复制到剪切板")
        }

        //追加询价
        mBinding.mQueryMoreBTN.setOnClickListener {
            startActivity<VinSearchActivity>(MyConstants.VIN_CODE to mVin)
            finish()
        }

        mBinding.mOrderNumTV.setOnLongClickListener {
            (getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager).setPrimaryClip(ClipData.newPlainText(null, mBinding.mOrderNumTV.text.handlerNull()))
            showToast("已复制询价单号到剪切板")
            true
        }
        mBinding.mVinTV.setOnLongClickListener {
            (getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager).setPrimaryClip(ClipData.newPlainText(null, mBinding.mVinTV.text.handlerNull()))
            showToast("已复车架号到剪切板")
            true
        }
    }
}
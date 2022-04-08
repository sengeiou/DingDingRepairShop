package com.android.ctgapp.activity.deal

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.deal.enquire.EnquireWishListActivity
import com.android.ctgapp.adapter.deal.QueryByPartMenuAdapter
import com.android.ctgapp.adapter.deal.QueryRecordParentAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityQueryRecordBinding
import com.android.ctgapp.entity.home.EnquireWhiteEntityV2
import com.android.ctgapp.entity.home.QuotationDetailEntity
import com.android.ctgapp.entity.home.enquire.EnquireDetailByCompanyEntity
import com.android.ctgapp.entity.home.enquire.LeftMenuBean
import com.android.ctgapp.entity.home.enquire.RightBean
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.util.*
import okhttp3.MediaType
import okhttp3.RequestBody
import okhttp3.ResponseBody
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource
import java.util.HashMap

/**
 *作者:LiBW
 *创建日期: 2021/5/6
 *描述:询价记录 询价详情 页面 按配件/按供应商(废弃)
 */
class QueryRecordActivity : BaseActivityV2(), QueryRecordParentAdapter.RightCallback {
    val mBinding by lazy { ActivityQueryRecordBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    val enquiryId by lazy { intent.getIntExtra(MyConstants.ENQUIRY_ID, -1) }

    private val mListLeftPart = ArrayList<LeftMenuBean>()
    private val mListLeftCompany = ArrayList<LeftMenuBean>()
    private val mListRightPart = ArrayList<RightBean>()
    private val mListRightCompany = ArrayList<RightBean>()
    private val mListRightAll = ArrayList<RightBean>()

    private val mAdapterLeftPart by lazy { QueryByPartMenuAdapter(this, mListLeftPart, listenerLeftPart) }
    private val mAdapterLeftCompany by lazy { QueryByPartMenuAdapter(this, mListLeftCompany, listenerLeftCompany) }
    private val mAdapterRightPart by lazy { QueryRecordParentAdapter(this, mListRightPart, listenerRightPart, true) }
    private val mAdapterRightCompany by lazy { QueryRecordParentAdapter(this, mListRightCompany, listenerRightCompany, false) }

    private var mCurrentLeftPartId = 0

    //    var mCurrentLeftPartName = ""
    private var mCurrentLeftCompanyId = 0
//    var mCurrentLeftCompanyName = ""

    //显示模式1按照公司2按照零件
    private var displayModel = 2

    private val allDataWhitOutHandler = ArrayList<EnquireWhiteEntityV2.DataBean.QuotationDetailsBean>()

    //以此为依据展示 如果是2 新增意向单 查看意向单 否则为重置和确认下单
    var flowFlag = 0

    //新增意向单需要使用
    var mCreateUserid = 0
    var mEnquiryId = 0


    //右侧点击
    fun rightClickHandler(data: RightBean, isCheck: Boolean) {
        mListRightAll.forEach {
            if (it.quotationDetailId == data.quotationDetailId) {
                it.select = isCheck
                MyLog.d("什么情况所有点击修改了:${data.brand} 选中状态:$isCheck")
            }
        }
        mListRightPart.forEach {
            if (it.quotationDetailId == data.quotationDetailId) {
                it.select = isCheck
            }
        }
        mListRightCompany.forEach {
            if (it.quotationDetailId == data.quotationDetailId) {
                it.select = isCheck
            }
        }
        mAdapterRightPart.notifyDataSetChanged()
        mAdapterRightCompany.notifyDataSetChanged()
    }

    private val listenerRightPart = object : QueryRecordParentAdapter.RightCallback {
        override fun onItemClick(data: RightBean, isCheck: Boolean) {
            rightClickHandler(data, isCheck)
        }
    }

    private val listenerRightCompany = object : QueryRecordParentAdapter.RightCallback {
        override fun onItemClick(data: RightBean, isCheck: Boolean) {
            rightClickHandler(data, isCheck)
        }
    }

    //左侧菜单被点击
    private val listenerLeftPart = object : QueryByPartMenuAdapter.MenuListener {
        override fun itemSelect(data: LeftMenuBean) {
            mCurrentLeftPartId = data.id
            handlerRightByPart()
        }
    }

    private val listenerLeftCompany = object : QueryByPartMenuAdapter.MenuListener {
        override fun itemSelect(data: LeftMenuBean) {
            mCurrentLeftCompanyId = data.id
            handlerRightByPart()
        }
    }

    private val listener2 = object : ObserverListener {
        override fun onNext(t: ResponseBody) {
            loading.dismiss()
            val str = t.string().handlerNull()
            MyLog.d("2询价成功$str")


        }

        override fun onError(error: String) {
            loading.dismiss()
            showToast(error)


        }
    }

    fun getData() {
        ApiMethods.getQueryDetail(MyObserver(listener2), enquiryId, displayModel)
    }

    private val listener = object : ObserverListener {
        override fun onNext(t: ResponseBody) {
            val str = t.string().handlerNull()
            MyLog.d("询价成功$str")
            val data = getGson().fromJson(str, EnquireWhiteEntityV2::class.java).data
            data?.let {
//                val statue=data.auditState
                mBinding.mButtonLL.visibility = View.VISIBLE
                if (data.flow == 2) {
                    flowFlag = 2
                    mBinding.mResetBTN.text = "新增意向单"
                    mBinding.mSubmitBTN.text = "查看意向单"
                } else {
                    mBinding.mResetBTN.text = "重置"
                    mBinding.mSubmitBTN.text = "确认下单"
                }
                mCreateUserid = data.createUserId
                mEnquiryId = data.enquiryId



                mBinding.mCarNameTV.text = data.modelInfo.handlerNull()

                //所有待报价的part
                data.enquiryDetails?.forEach {
                    val bean = LeftMenuBean()
                    bean.name = it.partName.handlerNull()
                    bean.id = it.enquiryDetailId
                    mListLeftPart.add(bean)
                }
                //默认第一个被选中
                if (mListLeftPart.isNotEmpty()) {
                    mListLeftPart[0].select = true
                    mCurrentLeftPartId = mListLeftPart[0].id
                }
                mAdapterLeftPart.notifyDataSetChanged()
                data.enquiryTargets?.forEach {
                    val bean = LeftMenuBean()
                    bean.name = it.targetCompanyName.handlerNull()
                    bean.id = it.targetCompanyId
                    mListLeftCompany.add(bean)
                }

                if (mListLeftCompany.isNotEmpty()) {
                    mListLeftCompany[0].select = true
                    mCurrentLeftCompanyId = mListLeftCompany[0].id
                }
                mAdapterLeftCompany.notifyDataSetChanged()
                data.quotationDetails?.let {
                    allDataWhitOutHandler.addAll(it)
                }
                //所有报价出来的商品
                data.quotationDetails?.forEach {
                    val bean = RightBean()
                    bean.companyName = it.quotationCompanyName.handlerNull()
                    bean.partName = it.partName.handlerNull()
                    bean.quotationDetailId = it.quotationDetailId
                    bean.companyId = it.quotationCompanyId
                    bean.partId = it.enquiryDetailId
                    bean.brand = it.brand.handlerNull()
                    bean.ssssPrice = it.ssssPrice.handlerNull()
                    bean.price = it.price.handlerNull()
                    bean.receiveTime = it.aogTime.handlerNull()
                    bean.userId = it.quotationUserId
                    bean.userName = it.quotationUserName.handlerNull()
                    mListRightAll.add(bean)
                }
                handlerRightByPart()
            }
        }

        override fun onError(error: String) {
            showToast(error)
        }
    }

    //处理右侧数据
    private fun handlerRightByPart() {
        mListRightPart.clear()
        mListRightCompany.clear()
        mListRightAll.forEach {
            if (it.partId == mCurrentLeftPartId) {
                mListRightPart.add(it)
            }

            if (it.companyId == mCurrentLeftCompanyId) {
                mListRightCompany.add(it)
            }
        }
        mAdapterRightCompany.notifyDataSetChanged()
        mAdapterRightPart.notifyDataSetChanged()
    }

    override fun event() {
        //获取数据
        ApiMethods.getQueryDetail(MyObserver(listener), enquiryId)
        mBinding.mLeftPartRV.adapter = mAdapterLeftPart
        mBinding.mLeftPartRV.layoutManager = LinearLayoutManager(this)
        mBinding.mLeftCompanyRV.adapter = mAdapterLeftCompany
        mBinding.mLeftCompanyRV.layoutManager = LinearLayoutManager(this)
        mBinding.mRightPartRV.adapter = mAdapterRightPart
        mBinding.mRightPartRV.layoutManager = LinearLayoutManager(this)
        mBinding.mRightCompanyRV.adapter = mAdapterRightCompany
        mBinding.mRightCompanyRV.layoutManager = LinearLayoutManager(this)
//        QueryRecordDetailActivity::class.java
    }

    override fun click() {
        mBinding.mTabLayout.handlerSelectReturnText {
            if (it == "按配件") {
                mBinding.mLeftPartRV.visibility = View.VISIBLE
                mBinding.mLeftCompanyRV.visibility = View.GONE
                mBinding.mRightPartRV.visibility = View.VISIBLE
                mBinding.mRightCompanyRV.visibility = View.GONE
                mBinding.mLeftTopLL.visibility = View.VISIBLE
                mBinding.mRightTopLL.visibility = View.GONE
                displayModel = 2
                getData()
            } else if (it == "按供应商") {
                mBinding.mLeftPartRV.visibility = View.GONE
                mBinding.mLeftCompanyRV.visibility = View.VISIBLE
                mBinding.mRightPartRV.visibility = View.GONE
                mBinding.mRightCompanyRV.visibility = View.VISIBLE
                mBinding.mLeftTopLL.visibility = View.GONE
                mBinding.mRightTopLL.visibility = View.VISIBLE
                displayModel = 1
                getData()
            }
        }

        //返回
        mBinding.mBackIv.setOnClickListener {
            finish()
        }
        //新增意向单回调
        val addWantOrderListener = object : ObserverListener {
            override fun onNext(t: ResponseBody) {
                loading.dismiss()
                val str = t.string().handlerNull()
                MyLog.d("新增意向单回调$str")
                handlerHttpResult(str) {
                    showToast("提交意向单成功")
                    //重置选中状态
                    mListRightAll.forEach { bean ->
                        bean.select = false
                    }
                    handlerRightByPart()
                }
            }

            override fun onError(error: String) {
                loading.dismiss()
                showToast(error)
            }
        }
        //重置 如果 flowFlag为2的是则为新增意向单
        mBinding.mResetBTN.setOnClickListener {
            if (flowFlag == 2) {
                //新增意向单的Map提交
                val map: MutableMap<String, Any> = HashMap()
                //处理选中的数据
                val allSelectIds = ArrayList<Map<String, Int>>()

                mListRightAll.forEach {
                    if (it.select) {
                        val m = HashMap<String, Int>()
                        m["quotationDetailId"] = it.quotationDetailId
                        allSelectIds.add(m)
                    }
                }
                map["enquiryId"] = mEnquiryId
                map["createUserid"] = mCreateUserid
                map["details"] = allSelectIds
                if (allSelectIds.isNotEmpty()) {
                    val body = RequestBody.create(
                        MediaType.parse("application/json; charset=utf-8"),
                        getGson().toJson(map)
                    )
                    showLoading()
                    ApiMethods.enquireAddWishOrder(MyObserver(addWantOrderListener), body)
                } else {
                    showToast("请至少选择一个配件")
                }

            } else {
                //重置选中状态
                mListRightAll.forEach { bean ->
                    bean.select = false
                }
                handlerRightByPart()
            }
        }


        //确认下单 如果 flowFlag为2的是则为查看意向单
        mBinding.mSubmitBTN.setOnClickListener {
            if (flowFlag == 2) {
                startActivity<EnquireWishListActivity>(
                    MyConstants.ENQUIRY_ID to mEnquiryId
                )

            } else {
                //判断是否由一个供应商下单
                var companyID = 0
                var canSubmit = true
                mListRightAll.forEach {
                    if (it.select) {
                        when {
                            companyID == 0 -> {
                                companyID = it.companyId
                            }
                            companyID != it.companyId -> {
                                canSubmit = false
                                showToast("每次只能选择一个供应商的商品")
                            }
                            else -> {

                            }
                        }
                    }
                }

                if (canSubmit) {
                    handlerSubmit(companyID)
                } else {
                    showToast("每次只能选择一个供应商的商品")
                }
            }
        }

        mBinding.mCheckDetailTV.setOnClickListener {
            startActivity<EnquireWaitDetailActivity>(MyConstants.ENQUIRY_ID to enquiryId)
        }
//        var searchPart = true
//        //按配件
//        mBinding.mUsePartTV.setOnClickListener {
//            //禁止重复点击
//            if (searchPart) return@setOnClickListener
//            searchPart = true
//            mBinding.mUsePartTV.backgroundResource = R.drawable.bg_btn_blue_radius_left
//            mBinding.mUseCompany.backgroundResource = R.drawable.bg_btn_white_radius_right
//            mBinding.mUsePartTV.textColorResource = R.color.white
//            mBinding.mUseCompany.textColorResource = R.color.gray_text
//            mBinding.mLeftPartRV.visibility = View.VISIBLE
//            mBinding.mLeftCompanyRV.visibility = View.GONE
//            mBinding.mRightPartRV.visibility = View.VISIBLE
//            mBinding.mRightCompanyRV.visibility = View.GONE
//            displayModel = 2
//            getData()
//        }
//        //按供应商
//        mBinding.mUseCompany.setOnClickListener {
//            if (!searchPart) return@setOnClickListener
//            searchPart = false
//            mBinding.mUsePartTV.backgroundResource = R.drawable.bg_btn_white_radius_left
//            mBinding.mUseCompany.backgroundResource = R.drawable.bg_btn_blue_radius_right
//            mBinding.mUseCompany.textColorResource = R.color.white
//            mBinding.mUsePartTV.textColorResource = R.color.gray_text
//            mBinding.mLeftPartRV.visibility = View.GONE
//            mBinding.mLeftCompanyRV.visibility = View.VISIBLE
//            mBinding.mRightPartRV.visibility = View.GONE
//            mBinding.mRightCompanyRV.visibility = View.VISIBLE
//            displayModel = 1
//            getData()
//        }

    }

    //处理提交
    private fun handlerSubmit(companyID: Int) {
        val allSelectIds = ArrayList<Int>()
        mListRightAll.forEach {
            if (it.select) {
                allSelectIds.add(it.quotationDetailId)
            }
        }
        //最终选中的数据
        val targetList = ArrayList<EnquireWhiteEntityV2.DataBean.QuotationDetailsBean>()

        allSelectIds.forEach { a ->
            allDataWhitOutHandler.forEach { b ->
                if (a == b.quotationDetailId) {
                    targetList.add(b)
                }
            }
        }
        val target = QuotationDetailEntity()
//        target.mList = targetList
        if (allSelectIds.isEmpty()) {
            showToast("请至少选择一个配件进行下单")
        } else {
            startActivity<EnquireOrderConfirmActivity>(
                MyConstants.RESULT_DATA to target,
                MyConstants.COMPANY_ID to companyID,
            )
        }
    }

    //右侧点击
    override fun onItemClick(data: RightBean, isCheck: Boolean) {
        mListRightAll.forEach {
            if (it.partId == data.partId || it.companyId == data.companyId) {
                it.select = isCheck
                MyLog.d("什么情况所有点击修改了:${data.brand} 选中状态:$isCheck")
            }
        }
        mListRightPart.forEach {
            if (it.partId == data.partId) {
                it.select = isCheck
            }
        }
        mListRightCompany.forEach {
            if (it.partId == data.partId) {
                it.select = isCheck
            }
        }
        mAdapterRightPart.notifyDataSetChanged()
        mAdapterRightCompany.notifyDataSetChanged()
    }
}
package com.android.ctgapp.activity.deal

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.activity.deal.enquire.EnquireWishListActivity
import com.android.ctgapp.activity.message.chart.jumpToChart
import com.android.ctgapp.adapter.deal.QueryLeftMenuAdapter
import com.android.ctgapp.adapter.deal.QueryRightPartAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityQueryRecordV2Binding
import com.android.ctgapp.entity.home.QuotationDetailEntity
import com.android.ctgapp.entity.home.enquire.EnquireDetailByCompanyEntityV2
import com.android.ctgapp.event.OrderRefresh
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.util.*
import okhttp3.MediaType
import okhttp3.RequestBody
import okhttp3.ResponseBody
import org.greenrobot.eventbus.EventBus
import org.jetbrains.anko.startActivity
import java.util.HashMap

/**
 *作者:LiBW
 *创建日期: 2021/9/1
 *描述:询价记录 询价详情 页面 按配件/按供应商 新版
 */
class QueryRecordV2Activity : BaseActivityV2(), QueryLeftMenuAdapter.LeftMenuListener, QueryRightPartAdapter.RightCallback {
    private val mBinding by lazy { ActivityQueryRecordV2Binding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    val enquiryId by lazy { intent.getIntExtra(MyConstants.ENQUIRY_ID, -1) }

    //显示模式1按照公司2按照零件
    private var displayModel = 2

    //左侧列表
    private val mLeftList = ArrayList<EnquireDetailByCompanyEntityV2.DataBean.ImmutablePairsBean>()
    private val mLeftAdapter by lazy { QueryLeftMenuAdapter(this, mLeftList, this) }

    //右侧
    private val mRightList = ArrayList<EnquireDetailByCompanyEntityV2.DataBean.ImmutablePairsBean.ItemsBean>()
    private val mRightAdapter by lazy { QueryRightPartAdapter(this, mRightList, this) }

    //当前选中的用户ID
    private var mCurrentSupplierId = -1

    //当前选中的用户名
    private var mCurrentSupplierName = ""


    //新增意向单需要使用
    var mCreateUserid = 0
    var mEnquiryId = 0

    //以此为依据展示 如果是2 新增意向单 查看意向单 否则为重置和确认下单
    var flowFlag = 0

    override fun event() {
        mBinding.mLeftPartRV.adapter = mLeftAdapter
        mBinding.mRightPartRV.adapter = mRightAdapter
        mBinding.mLeftPartRV.layoutManager = LinearLayoutManager(this)
        mBinding.mRightPartRV.layoutManager = LinearLayoutManager(this)
        getData()
    }

    override fun onDestroy() {
        EventBus.getDefault().post(OrderRefresh(1))
        super.onDestroy()
    }

    fun getData() {
        loading.show()
        ApiMethods.getQueryDetail(MyObserver(listener2), enquiryId, displayModel)
    }

    private val listener2 = object : ObserverListener {
        override fun onNext(t: ResponseBody) {
            loading.dismiss()
            val str = t.string().handlerNull()
            val data = getGson().fromJson(str, EnquireDetailByCompanyEntityV2::class.java).data
            data?.let {
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
                //车辆信息
                mBinding.mCarNameTV.text = data.modelInfo.handlerNull()
            }

            data?.immutablePairs?.let { list ->
                //处理左侧菜单
                mLeftList.clear()
                list.forEach { bean ->
                    //左侧按钮只添加包含Items的内容(右侧配件)
                    if (bean.items != null) {
                        mLeftList.add(bean)
                    }
                }


                //设置右侧的list的分类是按配件还是按供应商
                list.forEach { b ->
                    b.items?.forEach { c ->
                        c.displayModel = displayModel
                    }
                }
                //&&mLeftList.isNotEmpty()新增
                if (list.isNotEmpty() && mLeftList.isNotEmpty()) {
                    val d = mLeftList[0]
                    d.select = true
                    //处理按配件顶部的文字
                    val part = if (d.oe == null || d.oe == "") {
                        d.name.handlerNull()
                    } else {
                        "${d.name.handlerNull()} | ${d.oe.handlerNull()}"
                    }
                    val price = if (d.ssssPrice.handlerNull().isEmpty()) {
                        "4S价: 暂无数据"
                    } else {
                        "4S价: ¥${d.ssssPrice.handlerNull()}"
                    }
                    mBinding.mLeftTopSecondTV.text = price
                    //处理按供应商顶部的文字
                    mBinding.mRightTopTV.text = d.name.handlerNull()
                    mBinding.mLeftTopTV.text = part
                    //当前供应商ID
                    mCurrentSupplierId = d.quotationUserId
                    mCurrentSupplierName = d.name.handlerNull()

                    //默认选中第一个
                    d.items?.let { rightList ->
                        mRightList.clear()
                        mRightList.addAll(rightList)
                    }
                } else {
                    mRightList.clear()
                }

                mRightAdapter.notifyDataSetChanged()
                mLeftAdapter.notifyDataSetChanged()
            }
        }

        override fun onError(error: String) {
            loading.dismiss()
            showToast(error)
        }
    }

    override fun click() {
        mBinding.mBackIv.setOnClickListener {
            finish()
        }
        //跳转聊天
        mBinding.mToChatIV.setOnClickListener {
            jumpToChart(mCurrentSupplierId, mCurrentSupplierName, "", mCurrentSupplierName)
        }

        mBinding.mTabLayout.handlerSelectReturnText {
            if (it == "按配件") {
                mBinding.mLeftTopLL.visibility = View.VISIBLE
                mBinding.mRightTopLL.visibility = View.GONE
                displayModel = 2
                getData()
            } else if (it == "按供应商") {
                mBinding.mLeftTopLL.visibility = View.GONE
                mBinding.mRightTopLL.visibility = View.VISIBLE
                displayModel = 1
                getData()
            }
        }
        //询价单详情页
        mBinding.mCheckDetailTV.setOnClickListener {
            startActivity<EnquireWaitDetailActivity>(MyConstants.ENQUIRY_ID to enquiryId)
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
                    mRightList.forEach { bean ->
                        bean.select = false
                    }
                    mRightAdapter.notifyDataSetChanged()
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
                mRightList.forEach {
                    if (it.select) {
                        val m = HashMap<String, Int>()
                        m["quotationDetailId"] = it.quotationDetailId
                        m["num"] = it.num
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
                mRightList.forEach {
                    it.select = false
                    mRightAdapter.notifyDataSetChanged()
                }
            }
        }


        //确认 立即下单
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
                mRightList.forEach {
                    if (it.select) {
                        when {
                            companyID == 0 -> {
                                companyID = it.quotationCompanyId
                            }
                            companyID != it.quotationCompanyId -> {
                                canSubmit = false
                                showToast("每次只能选择一个供应商的商品")
                            }
                            else -> {

                            }
                        }
                    }
                }

                mLeftList.forEach { parentBean ->
                    parentBean.items?.forEach { childBean ->
                        if (childBean.select) {
                            when {
                                companyID == 0 -> {
                                    companyID = childBean.quotationCompanyId
                                }
                                companyID != childBean.quotationCompanyId -> {
                                    canSubmit = false
                                    showToast("每次只能选择一个供应商的商品")
                                }
                                else -> {

                                }
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
    }

    //处理提交
    private fun handlerSubmit(companyID: Int) {
        val allSelectIds = ArrayList<Int>()
//        mRightList.forEach {
//            if (it.select) {
//                allSelectIds.add(it.quotationDetailId)
//            }
//        }

        mLeftList.forEach { parentBean ->
            parentBean.items?.forEach { childBean ->
                if (childBean.select) {
                    allSelectIds.add(childBean.quotationDetailId)
                }
            }
        }

        val targetList = ArrayList<EnquireDetailByCompanyEntityV2.DataBean.ImmutablePairsBean.ItemsBean>()
//        mRightList.forEach {
//            if (it.select) targetList.add(it)
//        }

        mLeftList.forEach { parentBean ->
            parentBean.items?.forEach { childBean ->
                if (childBean.select) {
                    targetList.add(childBean)
                }
            }
        }

        val target = QuotationDetailEntity()
        target.mList = targetList
        if (allSelectIds.isEmpty()) {
            showToast("请至少选择一个配件进行下单")
        } else {
            //询价单的OrderType传1
            startActivity<EnquireOrderConfirmActivity>(
                MyConstants.RESULT_DATA to target,
                MyConstants.COMPANY_ID to companyID,
                MyConstants.ORDER_TYPE to 1
            )
        }
    }

    //左侧菜单选中 左侧按钮点击
    override fun leftItemSelect(position: Int) {
        val d = mLeftList[position]
        //设置左侧选中
        mLeftList.forEach {
            it.select = false
        }
        d.select = true
        mLeftAdapter.notifyDataSetChanged()

        d.items?.let {
            mRightList.clear()
            mRightList.addAll(it)
            mRightAdapter.notifyDataSetChanged()
        }

        //处理按配件顶部的文字
        val part = if (d.oe == null || d.oe == "") {
            d.name.handlerNull()
        } else {
            "${d.name.handlerNull()} | ${d.oe.handlerNull()}"
        }
        val price = if (d.ssssPrice.handlerNull().isEmpty()) {
            "4S价: 暂无数据"
        } else {
            "4S价: ¥${d.ssssPrice.handlerNull()}"
        }
        mBinding.mLeftTopSecondTV.text = price
        //处理按供应商顶部的文字
        mBinding.mRightTopTV.text = d.name.handlerNull()
        mBinding.mLeftTopTV.text = part
        //当前供应商ID
        mCurrentSupplierId = d.quotationUserId
        mCurrentSupplierName = d.name.handlerNull()
    }

    //右侧被点击
    override fun onRightItemClick(position: Int, select: Boolean) {


    }
}
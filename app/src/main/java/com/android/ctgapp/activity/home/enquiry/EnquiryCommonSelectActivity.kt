package com.android.ctgapp.activity.home.enquiry

import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.adapter.home.EnquirySelectAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityEnquiryCommonSelectBinding
import com.android.ctgapp.entity.home.EnquirySelectBean
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.showToast
import java.lang.StringBuilder

class EnquiryCommonSelectActivity : BaseActivityV2(), EnquirySelectAdapter.EnquirySelectCallback {
    private val mBinding by lazy { ActivityEnquiryCommonSelectBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private val qualityCode = 1001
    private val arrivalTimeCode = 1002
    private val needInvoiceCode = 1003
    private val singleModel by lazy { intent.getBooleanExtra(MyConstants.SINGLE_MODEL, false) }

    private val selectName by lazy { intent.getStringExtra(MyConstants.SELECT_NAME).handlerNull() }

    //回调码
    private val resultCode by lazy { intent.getIntExtra(MyConstants.RESULT_CODE, -1) }
    val mList = ArrayList<EnquirySelectBean>()
    var mAdapter: EnquirySelectAdapter? = null
    private var currentSelectId = -1
    private var currentSelectName = ""
    private var selectList = ArrayList<String>()
    override fun event() {
        when (resultCode) {
            //品质
            qualityCode -> {
                mBinding.mAppBar.setTitle("选择品质")
                mList.add(EnquirySelectBean("原厂件", "原厂件" in selectName, 11))
                mList.add(EnquirySelectBean("品牌件", "品牌件" in selectName, 12))
                mList.add(EnquirySelectBean("正厂件", "正厂件" in selectName, 13))
                mList.add(EnquirySelectBean("再制造件", "再制造件" in selectName, 14))
                mList.add(EnquirySelectBean("拆车件", "拆车件" in selectName, 15))
                mList.add(EnquirySelectBean("认证件", "认证件" in selectName, 16))
                mList.add(EnquirySelectBean("其他", "其他" in selectName, 17))
            }
            //到货时间
            arrivalTimeCode -> {
                mBinding.mAppBar.setTitle("期望到货")
                //临时用01234
                mList.add(EnquirySelectBean("今天", selectName == "今天", 0))
                mList.add(EnquirySelectBean("明天", selectName == "明天", 1))
                mList.add(EnquirySelectBean("3-4天", selectName == "3-4天", 2))
                mList.add(EnquirySelectBean("5-7天", selectName == "5-7天", 3))
                mList.add(EnquirySelectBean("7天以上", selectName == "7天以上", 4))
            }
            //发票类型
            needInvoiceCode -> {
                mBinding.mAppBar.setTitle("是否开票")
                mList.add(EnquirySelectBean("普通发票", selectName == "普通发票", 23))
                mList.add(EnquirySelectBean("专用发票", selectName == "专用发票", 24))
                mList.add(EnquirySelectBean("不开发票", selectName == "不开发票", 25))
            }
        }
        mList.forEach {
            if (it.isSelect){
                selectList.add(it.name)
            }
        }
        mAdapter = EnquirySelectAdapter(this, mList, this)
        mBinding.mRecyclerView.adapter = mAdapter
        mBinding.mRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun click() {
        //确认
        mBinding.mConfirmBTN.setOnClickListener {
            val intent = Intent()
            if (singleModel) {
                intent.putExtra(MyConstants.SELECT_NAME, currentSelectName)
                intent.putExtra(MyConstants.SELECT_ID, currentSelectId)
            } else {
                if (selectList.isEmpty()) {
                    showToast("请至少选择一个选项")
                    return@setOnClickListener
                }
                MyLog.d("确认回去吧$resultCode")
                val sb = StringBuilder()
                selectList.forEach {
                    sb.append("$it,")
                }
                //去掉最后的逗号
                val str = sb.substring(0, sb.length - 1)
                intent.putExtra(MyConstants.SELECT_NAME, str)
            }
            setResult(resultCode, intent)
            finish()
        }
    }


    override fun onItemSelect(data: EnquirySelectBean) {
        if (singleModel) {
            mList.forEach {
                it.isSelect = false
                if (it.id == data.id) {
                    it.isSelect = true
                    currentSelectName = it.name
                    currentSelectId = it.id
                }
            }
            mAdapter?.notifyDataSetChanged()
        }
    }

    override fun onItemSelect(select: Boolean, selectName: String) {
        if (select) {
            selectList.add(selectName)
        } else {
            selectList.remove(selectName)
        }
    }
}
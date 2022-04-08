package com.android.ctgapp.activity.home.enquiry

import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.activity.home.VinSearchActivity
import com.android.ctgapp.adapter.home.enquiry.VinSearchHistoryAdapter
import com.android.ctgapp.entity.VinSearchHistoryBean
import com.android.ctgapp.entity.VinSearchHistoryBeanList
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityVinSearchHishoryBinding
import com.android.ctgapp.util.*
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2021/8/6
 *描述:VIN搜索历史 页面  最近用过 页面
 */
class VinSearchHistoryActivity : BaseActivityV2(), VinSearchHistoryAdapter.VinSearchHistoryCallback {
    private val mBinding by lazy { ActivityVinSearchHishoryBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private val mList = ArrayList<VinSearchHistoryBean>()
    private val mAdapter by lazy { VinSearchHistoryAdapter(this, mList, this) }
    override fun event() {
        mBinding.mHistoryRV.adapter = mAdapter
        mBinding.mHistoryRV.layoutManager = LinearLayoutManager(this)
        val vinStr = sharedGetWithApp(MyConstants.VIN_HISTORY, "") as String
        MyLog.d("历史记录:${vinStr}")
        if (vinStr.isEmpty()) return
        val data = getGson().fromJson(vinStr, VinSearchHistoryBeanList::class.java).data
        data?.let { list ->
            mList.addAll(list)
            mAdapter.notifyDataSetChanged()
        }
    }

    override fun click() {
        //体验数据
        mBinding.mTestRL.setOnClickListener {
            startActivity<VinSearchActivity>(MyConstants.VIN_CODE to mBinding.mVinCodeTV.text.handlerNull())
            finish()
        }
    }

    override fun onItemClick(vin: String) {
        startActivity<VinSearchActivity>(MyConstants.VIN_CODE to vin)
        finish()
    }

}
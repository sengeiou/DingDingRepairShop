package com.android.ctgapp.activity.home.enquiry

import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.adapter.home.BatchAddPartSelectMoreAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityBatchAddPartSelectMoreBinding
import com.android.ctgapp.entity.home.BatchAddPartChildEntity
import com.android.ctgapp.entity.home.BatchAddPartChildEntityV2
import com.android.ctgapp.entity.home.enquire.BatchAddPartChildBean
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.getGson

/**
 *作者:LiBW
 *创建日期: 2021/5/7
 *描述:批量添加配件  页面 添加配件 页面(不懂咋选就选我)
 */
class BatchAddPartSelectMoreActivity : BaseActivityV2(), BatchAddPartSelectMoreAdapter.BatchAddPartSelectMoreAdapterCallBack {
    private var mParentPartName = ""
    private var mParentCategoryIdFlag = ""
    private val mBinding by lazy { ActivityBatchAddPartSelectMoreBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private val mList = ArrayList<BatchAddPartChildEntityV2.DataBean.PartsGroupBean>()

    override fun event() {
        //上个页面获取完的数据
        val dataStr = intent.getStringExtra(MyConstants.RESULT_DATA)
        dataStr?.let {
            val data = getGson().fromJson(it, BatchAddPartChildEntityV2::class.java).data
            val targetList=ArrayList<BatchAddPartChildEntityV2.DataBean.PartsGroupBean>()
            data?.forEach {bean->
                bean.partsGroup?.forEach {beanB->
                    targetList.add(beanB)
                }
            }
            mList.addAll(targetList)


            data?.let { list ->
                mList.forEach { bean ->
                    mParentCategoryIdFlag = bean.parentCategoryIdFlag
                    mParentPartName = bean.parentPartName
                }
                val mAdapter = BatchAddPartSelectMoreAdapter(this, mList, this)
                mBinding.mPartRV.adapter = mAdapter
                mBinding.mPartRV.layoutManager = LinearLayoutManager(this)
            }
        }
//        //判断有没有 选中 不知道选啥就选我 OE重复先不要了 先别删万一以后要呢
//        BaseApplication.enquireSelectPartsList.forEach {
//            MyLog.d("选中了:${getGson().toJson(it)}")
//            if (it.unKnowPart && it.parentPartName == mParentPartName) {
//                needEmptyOEPart = true
//                mBinding.mCheckBox.performClick()
//            }
//        }

    }

    var needEmptyOEPart = false
    override fun click() {

        //不知道咋选就选我
        mBinding.mParentRL.setOnClickListener {
            mBinding.mCheckBox.performClick()
        }
        mBinding.mCheckBox.setOnClickListener {
            needEmptyOEPart = mBinding.mCheckBox.isChecked
        }
        //保存
        mBinding.mConfirmBTN.setOnClickListener {
            if (needEmptyOEPart) {
                val data = BatchAddPartChildEntityV2.DataBean.PartsGroupBean()
                data.ctgname = mParentPartName
                data.parentPartName = mParentPartName
                data.parentCategoryIdFlag = mParentCategoryIdFlag
                data.buyCount = 1
                data.oe = ""
                data.unKnowPart = true
                data.select = true
                mList.add(data)
            }

//            val intent = Intent()
//            val entity = BatchAddPartChildBean()
//            entity.status = 0
//            entity.data = mList
            val  entity= BatchAddPartChildBean()
            entity.list=mList

            intent.putExtra(MyConstants.RESULT_DATA, getGson().toJson(entity))
            setResult(100, intent)
            finish()
        }
    }

    //选中的
//    private val selectList = ArrayList<BatchAddPartChildEntity.DataBean>()

    //选中回调
    override fun onItemSelect(data: BatchAddPartChildEntity.DataBean, select: Boolean) {


//        BaseApplication.enquireSelectPartsList.add(data)


//        val intent = Intent()
//        val entity = BatchAddPartChildEntity()
//        entity.status = 0
//        entity.data = arrayListOf(data)
//        intent.putExtra(MyConstants.RESULT_DATA, getGson().toJson(entity))
//        setResult(100, intent)
//        finish()
    }
}
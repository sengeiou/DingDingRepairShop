package com.android.ctgapp.activity.home.enquiry

import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.adapter.home.enquiry.EpcDetailAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityEpcDetailBinding
import com.android.ctgapp.entity.ResultEntity
import com.android.ctgapp.entity.home.BatchAddPartChildEntity
import com.android.ctgapp.entity.home.BatchAddPartChildEntityV2
import com.android.ctgapp.entity.home.enquire.EpcDetailEntity
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.company.EpcPartSelectDialog
import com.bumptech.glide.Glide
import okhttp3.ResponseBody
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2021/5/17
 *描述:Epc详情 页面
 */
class EpcDetailActivity : BaseActivityV2(), EpcDetailAdapter.EpcDetailCallback, EpcPartSelectDialog.EpcPartSelectCallback {
    private val mBinding by lazy { ActivityEpcDetailBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root

    private val mList = ArrayList<EpcDetailEntity.DataBean>()
    private val mAdapter by lazy { EpcDetailAdapter(this, mList, this) }

    //页面传值
    private val carID by lazy { intent.getStringExtra(MyConstants.CAR_ID).handlerNull() }
    private val parentCategoryId by lazy { intent.getStringExtra(MyConstants.PARENT_CATEGORY_ID).handlerNull() }
    private val categoryId by lazy { intent.getStringExtra(MyConstants.CATEGORY_ID).handlerNull() }
    private val partName by lazy { intent.getStringExtra(MyConstants.PARENT_PART_NAME).handlerNull() }
    private val epc by lazy { intent.getStringExtra(MyConstants.EPC).handlerNull() }
    private val img by lazy { intent.getStringExtra(MyConstants.IMAGE).handlerNull() }

    //选中的数据
    private val selectPartsList = ArrayList<BatchAddPartChildEntityV2.DataBean.PartsGroupBean>()
    private var mSelectedDialog: EpcPartSelectDialog? = null
    private val mBannerList = ArrayList<String>()
    override fun event() {
        mBinding.mCarInfoTV.text = intent.getStringExtra(MyConstants.CAR_INTRO).handlerNull()
        handlerSelectHistory()
        mBinding.mEpcDetailRV.adapter = mAdapter
        mBinding.mEpcDetailRV.layoutManager = LinearLayoutManager(this)
        Glide.with(this).load(img).into(mBinding.mIV)
        mBinding.mTitleBar.setTitle(partName)
        val listListener = object : ObserverListener {
            override fun onNext(t: ResponseBody) {
                loading.dismiss()
                val str = t.string().handlerNull()
                val checkData = getGson().fromJson(str, ResultEntity::class.java)
                if (checkData.data.handlerNull().isEmpty()) {
                    return
                }
                MyLog.d("Epc详情回调:$str")
                handlerHttpResult(str) {
                    val data = getGson().fromJson(str, EpcDetailEntity::class.java).data
                    data?.let {

                        mList.addAll(it)
                        handlerSelect()
                    }
                }
            }

            override fun onError(error: String) {
                loading.dismiss()
                showToast(error)
            }
        }
        showLoading()
        val map=HashMap<String,HashMap<String,String>>()
        val map1=HashMap<String,String>()
//        map1["simpleCategoryId"]=categoryId
        map1["categoryId"]=categoryId
        map1["carid"]=carID
        map1["categoryType"]="EPC"
        map["epcBoomData"]=map1

        ApiMethods.getEpcSecondList(
            MyObserver(listListener), handlerBody(map
            )
        )

//        mBannerList.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fi0.hdslb.com%2Fbfs%2Farticle%2F179275df2b6a269d9fa02e11863674cc3ef2bf5e.jpg&refer=http%3A%2F%2Fi0.hdslb.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1623833052&t=65628a1ccb762c83449d51d5287c65c7")
//        mBannerList.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic1.zhimg.com%2F50%2Fv2-71dcef82c8afb85dacd42a995f64f1b5_hd.jpg&refer=http%3A%2F%2Fpic1.zhimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1623827988&t=726bfacefaef0a955f5cdead931c6d62")
//        mBannerList.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fp5.gexing.com%2FGSF%2Ftouxiang%2F20200724%2F23%2F3hd8cz9kdhgtpjkcp0rywwszj.jpg%40%21200x200_3%3Frecache%3D20131108&refer=http%3A%2F%2Fp5.gexing.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1623828005&t=7ed5ff7409a75e706242f0cf495a70f6")
//        mBannerList.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic1.zhimg.com%2F50%2Fv2-71dcef82c8afb85dacd42a995f64f1b5_hd.jpg&refer=http%3A%2F%2Fpic1.zhimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1623827988&t=726bfacefaef0a955f5cdead931c6d62")
//        mBannerList.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fp5.gexing.com%2FGSF%2Ftouxiang%2F20200724%2F23%2F3hd8cz9kdhgtpjkcp0rywwszj.jpg%40%21200x200_3%3Frecache%3D20131108&refer=http%3A%2F%2Fp5.gexing.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1623828005&t=7ed5ff7409a75e706242f0cf495a70f6")
//        initBanner()

//        repeat(12) {
//            val b = EpcMenuEntity()
//            b.name = "啥"
//            b.select = false
//            mList.add(b)
//        }
//        mAdapter.notifyDataSetChanged()
    }

    //第一次进来处理选中的数据
    private fun handlerSelectHistory() {
        selectPartsList.addAll(BaseApplication.enquireSelectPartsList)
        mSelectedDialog = EpcPartSelectDialog(selectPartsList, this)
        mBinding.mSelectCountTV.text = selectPartsList.size.handlerNull()
    }

    override fun onPause() {
        super.onPause()
        BaseApplication.enquireSelectPartsList=selectPartsList
    }


    private fun handlerSelect() {
        mList.forEach {
            it.select = false
        }

        selectPartsList.forEach { bean ->
            mList.forEach { a ->
                if (a.oe == bean.oe) {
                    a.select = true
                }
            }
        }
        mAdapter.notifyDataSetChanged()
    }

    override fun click() {
        //去询价 按钮
        mBinding.mGoEnquireBTN.setOnClickListener {
            BaseApplication.enquireSelectPartsList=selectPartsList
            //页面还没销毁 跳转过去就行了
            startActivity<EnquiryActivity>()
        }
        mBinding.mBackBTN.setOnClickListener {
            finish()
        }

        //已选中
        mBinding.mSelectedLL.setOnClickListener {
            mSelectedDialog?.let { dialog ->
                if (!dialog.isAdded) {
                    dialog.show(supportFragmentManager, "")
                }
            }


//            EpcPartSelectDialog().show(supportFragmentManager, "")
        }
    }

    //配件点击选中
    override fun epcDetailClick(position: Int, select: Boolean) {
        val data = mList[position]
        data.select = select
        mAdapter.notifyDataSetChanged()
        if (select) {
            //选中
            val b = BatchAddPartChildEntityV2.DataBean.PartsGroupBean()
            b.oe = data.oe.handlerNull()
            b.ctgname = data.des.handlerNull()
            b.parentCategoryIdFlag = data.categoryId.handlerNull()
            b.buyCount = 1
            b.price = data.price.handlerNull()
            selectPartsList.add(b)
        } else {
            var remove = BatchAddPartChildEntityV2.DataBean.PartsGroupBean()
            selectPartsList.forEach {
                if (it.oe == data.oe) {
                    remove = it
                }
            }
            selectPartsList.remove(remove)
        }
        mBinding.mSelectCountTV.text = selectPartsList.size.handlerNull()
        MyLog.d("有东西么有东西么${getGson().toJson(selectPartsList)}")
    }

    //进入零件详情
    override fun partDetail(position: Int) {
        startActivity<EpcPartDetailActivity>()
    }

    override fun onItemRemove(position: Int) {
        mBinding.mSelectCountTV.text = selectPartsList.size.handlerNull()
        handlerSelect()
    }
}
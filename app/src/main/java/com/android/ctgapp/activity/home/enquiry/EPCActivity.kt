package com.android.ctgapp.activity.home.enquiry

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.adapter.home.enquiry.EpcAdapter
import com.android.ctgapp.adapter.home.enquiry.EpcMenuAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityEpcactivityBinding
import com.android.ctgapp.entity.ResultEntity
import com.android.ctgapp.entity.home.BatchAddPartChildEntityV2
import com.android.ctgapp.entity.home.enquire.EpcDetailEntityV2
import com.android.ctgapp.entity.home.enquire.EpcLeftMenuEntity
import com.android.ctgapp.entity.home.enquire.EpcRightMenuEntity
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.company.EpcPartSelectDialog
import kotlinx.android.synthetic.main.activity_add_part.*
import kotlinx.android.synthetic.main.item_trolley_list.*
import okhttp3.ResponseBody
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2021/5/17
 *描述:EPC 页面
 */
class EPCActivity : BaseActivityV2(), EpcMenuAdapter.EpcMenuCallback, EpcAdapter.EpcCallback, EpcPartSelectDialog.EpcPartSelectCallback {
    private val mBinding by lazy { ActivityEpcactivityBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root

    //左侧菜单
    private val mMenuList = ArrayList<EpcLeftMenuEntity.DataBean>()
    private val mMenuAdapter by lazy { EpcMenuAdapter(this, mMenuList, this) }

    //右侧商品
    private val mList = ArrayList<EpcRightMenuEntity.DataBean>()
    private val mAdapter by lazy { EpcAdapter(this, mList, this) }
    private var mSelectedDialog: EpcPartSelectDialog? = null

    private val carId by lazy { intent.getStringExtra(MyConstants.CAR_ID) }

    //选中的数据
    private val selectPartsList = ArrayList<BatchAddPartChildEntityV2.DataBean.PartsGroupBean>()

    //车型信息
    private val carIntro by lazy { intent.getStringExtra(MyConstants.CAR_INTRO).handlerNull() }
    private val epc by lazy { intent.getStringExtra(MyConstants.EPC).handlerNull() }
    override fun onResume() {
        super.onResume()
        //第一次进入处理选中的数据
        handlerSelectHistory()
    }

    override fun event() {
        mBinding.mAppBar.setTitle(carIntro)
        mBinding.mEpcMenuRV.adapter = mMenuAdapter
        mBinding.mEpcMenuRV.layoutManager = LinearLayoutManager(this)
        mBinding.mEpcRV.adapter = mAdapter
        mBinding.mEpcRV.layoutManager = GridLayoutManager(this, 2)
        val leftMenuListener = object : ObserverListener {
            override fun onNext(t: ResponseBody) {
                loading.dismiss()
                val str = t.string().handlerNull()
                MyLog.d("左侧菜单回调:$str")
                val checkData = getGson().fromJson(str, ResultEntity::class.java)
                if (checkData.data.handlerNull().isEmpty()) {
                    return
                }
                handlerHttpResult(str) {
                    val data = getGson().fromJson(str, EpcLeftMenuEntity::class.java).data
                    data?.let {
                        if (it.isEmpty()) return@let
                        "1${it[0].des}".also { mBinding.mTitleTV.text = it }
                        mMenuList.addAll(it)
                        mMenuAdapter.notifyDataSetChanged()
                        //默认选中第一个
                        selectWhile(0)
                        val map = HashMap<String, HashMap<String, String>>()
                        val map1 = HashMap<String, String>()
                        map1["carid"] = carId
                        map1["categoryId"] = mMenuList[0].categoryId.handlerNull()
                        map["boomData"] = map1
                        ApiMethods.epcGetRightMenu(
                            MyObserver(rightMenuListener), handlerBody(
                                map
                            )
                        )
                    }
                }
            }

            override fun onError(error: String) {
                loading.dismiss()
                showToast(error)
            }
        }
        val map = HashMap<String, HashMap<String, String>>()
        val map2 = HashMap<String, String>()
        map2["carid"] = carId
        map["carid"] = map2
        ApiMethods.epcGetLeftMenu(MyObserver(leftMenuListener), handlerBody(map))

    }


    private fun selectWhile(position: Int) {
        if (mMenuList.size < position + 1) return
        //恢复状态
        mMenuList.forEach {
            it.select = false
            it.selectDown = false
            it.selectTop = false
        }
        //开始处理 将目标选中状态设置为选中
        mMenuList[position].select = true
        //处理上一个目标
        if (position != 0) {
            mMenuList[position - 1].selectTop = true
        }
        //处理后一个
        if (position + 1 < mMenuList.size) {
            mMenuList[position + 1].selectDown = true
        }
        mMenuAdapter.notifyDataSetChanged()
    }

    //搜索回调
    private val searchListener = object : ObserverListener {
        override fun onNext(t: ResponseBody) {
            loading.dismiss()
            val str = t.string().handlerNull()
            MyLog.d("右侧菜单搜索回调:$str")
            val checkData = getGson().fromJson(str, ResultEntity::class.java)
            if (checkData.data.handlerNull().isEmpty()) {
                mList.clear()
                mAdapter.notifyDataSetChanged()
                return
            }
            handlerHttpResult(str) {
                val data1 = getGson().fromJson(str, EpcDetailEntityV2::class.java).data
                mList.clear()
                data1?.forEach { beanA ->
                    beanA.partsGroup?.forEach { beanB ->
                        val bean = EpcRightMenuEntity.DataBean()
                        bean.categoryId = beanB.categoryId
                        bean.des = beanB.des
                        bean.img = beanB.img
                        mList.add(bean)
                    }
                }
                mAdapter.notifyDataSetChanged()
            }
        }

        override fun onError(error: String) {
            loading.dismiss()
            showToast(error)
        }
    }

    override fun click() {
        //搜索
        mBinding.mSearchET.handlerEditTextSearch(this) {
            if (it.isEmpty()) {
                showToast("请输入搜索内容")
            } else {
                showLoading()
                val map = HashMap<String, HashMap<String, String>>()
                val map1 = HashMap<String, String>()
                map1["oe"] = it
                map1["carid"] = carId
                map1["categoryType"] = "CTG"
                map["epcBoomData"] = map1
                ApiMethods.getEpcSecondList(
                    MyObserver(searchListener), handlerBody(
                        map
                    )
                )
            }
        }

        //去询价 按钮
        mBinding.mGoEnquireBTN.setOnClickListener {
            BaseApplication.enquireSelectPartsList = selectPartsList
            //啥都不用管 因为页面还没有销毁
            startActivity<EnquiryActivity>()
        }

        //已选中
        mBinding.mSelectedLL.setOnClickListener {
            mSelectedDialog?.let { dialog ->
                if (!dialog.isAdded) {
                    dialog.show(supportFragmentManager, "")
                }
            }
        }
    }

    private val rightMenuListener = object : ObserverListener {
        override fun onNext(t: ResponseBody) {
            loading.dismiss()
            val str = t.string().handlerNull()
            val checkData = getGson().fromJson(str, ResultEntity::class.java)
            if (checkData.data.handlerNull().isEmpty()) {
                mList.clear()
                mAdapter.notifyDataSetChanged()
                return
            }

            MyLog.d("右侧菜单回调:$str")
            handlerHttpResult(str) {
                val data = getGson().fromJson(str, EpcRightMenuEntity::class.java).data
                data?.let {
                    mList.clear()
                    mList.addAll(it)
                    mAdapter.notifyDataSetChanged()
                }
            }
        }

        override fun onError(error: String) {
            loading.dismiss()
            showToast(error)
        }
    }

    //左侧菜单点击
    override fun epcMenuClick(position: Int, title: String) {
        mBinding.mTitleTV.text = title
        selectWhile(position)
        //获取右侧数据
        loading.show()
        val map = HashMap<String, HashMap<String, String>>()
        val map1 = HashMap<String, String>()
        map1["carid"] = carId
        map1["categoryId"] = mMenuList[position].categoryId.handlerNull()
        map["boomData"] = map1
        ApiMethods.epcGetRightMenu(
            MyObserver(rightMenuListener), handlerBody(map)
        )
    }

    //主体列表被点击 右侧列表点击
    override fun epcClick(position: Int) {
        BaseApplication.enquireSelectPartsList = selectPartsList
        val data = mList[position]
        startActivity<EpcDetailActivity>(
            MyConstants.CAR_ID to carId,
            MyConstants.PARENT_CATEGORY_ID to data.parentCategoryId.handlerNull(),
            MyConstants.CATEGORY_ID to data.categoryId.handlerNull(),
            MyConstants.PARENT_PART_NAME to data.des.handlerNull(),
            MyConstants.EPC to epc,
            MyConstants.IMAGE to data.img,
            MyConstants.CAR_INTRO to carIntro,
        )
    }

    //第一次进来处理选中的数据
    private fun handlerSelectHistory() {
        selectPartsList.clear()
        selectPartsList.addAll(BaseApplication.enquireSelectPartsList)
        mSelectedDialog = EpcPartSelectDialog(selectPartsList, this)
        mBinding.mSelectCountTV.text = selectPartsList.size.handlerNull()
    }

    //dialog删除数据回调
    override fun onItemRemove(position: Int) {
        mBinding.mSelectCountTV.text = selectPartsList.size.handlerNull()
    }

    override fun finish() {
        BaseApplication.enquireSelectPartsList = selectPartsList
        super.finish()
    }
}
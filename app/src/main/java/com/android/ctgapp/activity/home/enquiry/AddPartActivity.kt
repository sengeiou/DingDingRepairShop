package com.android.ctgapp.activity.home.enquiry

import android.content.Intent
import android.view.View
import androidx.core.view.size
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.home.AddPartAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityAddPartBinding
import com.android.ctgapp.entity.home.AddPartBean
import com.android.ctgapp.entity.home.BatchAddPartChildEntity
import com.android.ctgapp.entity.home.BatchAddPartChildEntityV2
import com.android.ctgapp.entity.home.BatchAddPartEntityV2
import com.android.ctgapp.entity.home.enquire.BatchAddPartChildBean
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.SelectPartWidget
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.startActivityForResult
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 5/4/21
 *描述:选择零件 页面
 */
class AddPartActivity : BaseActivityV2(), SelectPartWidget.SelectPartCallBack, AddPartAdapter.AddPartCallback {
    private val mBinding by lazy { ActivityAddPartBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root

    private val mViewModel by lazy { ViewModelProvider(this)[BatchAddPartViewModel::class.java] }
    private val carId by lazy { intent.getStringExtra(MyConstants.CAR_ID) }
    private val epc by lazy { intent.getStringExtra(MyConstants.EPC) }

    //车型信息
    private val carIntro by lazy { intent.getStringExtra(MyConstants.CAR_INTRO).handlerNull() }

    //当前点击的控件ID(标记子控件的ID)
    private var mParentCategoryId = ""
    private var mParentPartName = ""

    //选中的数据
    private var selectPartsList = ArrayList<BatchAddPartChildEntityV2.DataBean.PartsGroupBean>()
    private val mList = ArrayList<AddPartBean>()

    //    private val mAdapter by lazy { AddPartAdapter(this, mList, this) }
    private val mAdapter by lazy { AddPartAdapter(this, mList, this) }


    //车型信息
    private fun handlerOldData() {
        //选中数据
        selectPartsList.addAll(BaseApplication.enquireSelectPartsList)
        handlerSelectList()
//        val selectStr = intent.getStringExtra(MyConstants.SELECT_PARTS_LIST)
//        val selectData = getGson().fromJson(selectStr, BatchAddPartChildEntity::class.java)
//        selectData?.data?.let { list ->
//            selectPartsList.addAll(list)
//            handlerSelectList()
//        }

        mBinding.mPartRV.adapter = mAdapter
        mBinding.mPartRV.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        refreshDefaultList()
    }

    private fun refreshDefaultList() {
        mList.clear()
        //常用件数据
        mList.add(AddPartBean("雨刮片", "105-01-01", false))
        mList.add(AddPartBean("前刹车片", "105-02-01", false))
        mList.add(AddPartBean("后刹车片", "105-02-02", false))
        mList.add(AddPartBean("空调滤芯", "105-03-01", false))
        mList.add(AddPartBean("机油滤芯", "105-04-01", false))
        mList.add(AddPartBean("空气滤芯", "105-05-01", false))
        mList.add(AddPartBean("汽油滤芯", "105-06-01", false))
        mList.add(AddPartBean("火花塞", "105-07-01", false))
        mList.add(AddPartBean("点火线圈", "105-08-01", false))
        mList.add(AddPartBean("蓄电池", "105-09-01", false))
        mList.forEach { beanA ->
            selectPartsList.forEach { beanB ->
                if (beanA.partCategoryId == beanB.parentCategoryIdFlag) {
                    beanA.select = true
                }
            }
        }
        mAdapter.notifyDataSetChanged()
    }

    override fun onResume() {
        super.onResume()
        MyLog.d("什么时候回过来的:${getGson().toJson(BaseApplication.enquireSelectPartsList)}")
        selectPartsList = BaseApplication.enquireSelectPartsList
        MyLog.d("什么时候回过来的2:${getGson().toJson(selectPartsList)}")
        handlerSelectList()
        refreshDefaultList()
    }

    override fun event() {
        if (carId.isEmpty()) {
            mBinding.mEPC.visibility = View.GONE
        }

        handlerOldData()
        mViewModel.partSearchChildResult.observe(this, {
            MyLog.d("配件搜索查询121:$it")
            dismissLoading()
            handlerHttpResult(it) {
                val bean = getGson().fromJson(it, BatchAddPartChildEntityV2::class.java)
                bean?.data?.let { list ->
                    //将当前父ID和子ID进行绑定 数据部搞事情 自己遍历吧
                    list.forEach { dataBean ->
                        MyLog.d("当前的ID:$mParentCategoryId")
                        dataBean.partsGroup?.forEach { b ->
                            b.parentCategoryIdFlag = mParentCategoryId
                            b.parentPartName = mParentPartName
                            //自己遍历加进去吧哎
                            b.oe = dataBean.oe.handlerNull()
                            b.ctgname = dataBean.ctgname.handlerNull()
                            b.amount = dataBean.amount.handlerNull()
                            b.sign = dataBean.sign.handlerNull()
                            b.ctgnum = dataBean.ctgnum.handlerNull()
                            b.epc = dataBean.epc.handlerNull()
                            b.price = dataBean.price.handlerNull()
                        }
                    }
//                bean?.data?.let { list ->
//                    //将当前父ID和子ID进行绑定
//                    list.forEach { dataBean ->
//
//
//                        MyLog.d("当前的ID:$mParentCategoryId")
//                        dataBean.parentCategoryIdFlag = mParentCategoryId
//                        dataBean.parentPartName = mParentPartName
//                        //初始化选中状态 因为OE可能存在冲突所以不告诉他那些选中了 直接为新增 先别删万一以后要呢
////                        selectPartsList.forEach { b ->
////                            if (b.oe == dataBean.oe) {
////                                dataBean.select = true
////                            }
////                        }
//                    }
                    startActivityForResult<BatchAddPartSelectMoreActivity>(
                        100,
                        MyConstants.RESULT_DATA to getGson().toJson(bean),
//                        MyConstants.PARENT_PART_NAME to mParentPartName
                    )
                }


                //旧的单选不要了
//                val bean = getGson().fromJson(it, BatchAddPartChildEntity::class.java)
//                bean?.data?.let { list ->
//                    //将当前父ID和子ID进行绑定
//                    list.forEach { dataBean ->
//                        MyLog.d("当前的ID:$mParentCategoryId")
//                        dataBean.parentCategoryIdFlag = mParentCategoryId
//                        dataBean.parentPartName = mParentPartName
//                    }
//                    if (list.size == 1) {
//                        //仅有一条数据将数据保存 多条数据则进入下个页面的列表
//                        val b = list[0]
//                        selectPartsList.add(b)
//                        mList.forEach { bean ->
//                            if (bean.partCategoryId == b.parentCategoryIdFlag) {
//                                bean.select = true
//                            }
//                        }
//                        mAdapter.notifyDataSetChanged()
//                        handlerSelectList()
//                    } else {
//                        //进入配件子页面
//                        startActivityForResult<BatchAddPartSelectMoreActivity>(
//                            100,
//                            MyConstants.RESULT_DATA to getGson().toJson(bean),
//                            MyConstants.PARENT_PART_NAME to mParentPartName
//                        )
//                    }
//                }
            }
        })
    }

    override fun finish() {
        BaseApplication.enquireSelectPartsList = selectPartsList
//        val intent = Intent()
//        val data = BatchAddPartChildEntity()
//        data.data = selectPartsList
//        intent.putExtra(MyConstants.RESULT_DATA, getGson().toJson(data))
//        setResult(100, intent)
        super.finish()
    }


    override fun click() {
//        //取消
//        mBackIv.setOnClickListener {
//            finish()
//        }
//        //确定 按钮 确认
//        mConfirmTV.setOnClickListener {
//
//        }

        //整体数据
        val mData = intent.getStringExtra(MyConstants.RESULT_DATA)
        val entity = getGson().fromJson(mData, BatchAddPartEntityV2::class.java).data
        //处理搜索框
        mBinding.mSearchET.handlerEditTextSearch(this) {
            //展示自定义按钮 搜什么展示什么
            mBinding.mCustomTV.visibility = View.VISIBLE
            mBinding.mCustomTitleTV.visibility = View.VISIBLE
            mBinding.mCustomTV.text = it
            mList.clear()
            val arrayList = ArrayList<String>()
            entity?.forEach { item ->
                if (item.categoryId.length > 6 && it in item.des) {
                    MyLog.d("有点东西的进来吧:${item.des}  +++++${item.categoryId}")
                    if (item.des !in arrayList) {
                        mList.add(AddPartBean(item.des, item.categoryId, false))
                        arrayList.add(item.des)
                    }
                }
            }
            //如果没搜到数据就依然使用默认常用件 否则替换成新的
            if (mList.isEmpty()) {
                refreshDefaultList()
            } else {
                mList.forEach { beanA ->
                    selectPartsList.forEach { beanB ->
                        if (beanA.partCategoryId == beanB.parentCategoryIdFlag) {
                            beanA.select = true
                        }
                    }
                }
                mAdapter.notifyDataSetChanged()
            }
            val text = mBinding.mCustomTV.text.handlerNull()
            var flag = false
            selectPartsList.forEach { item ->
                if (item.ctgname.handlerNull() == text) {
                    flag = true
                }
            }
            if (flag) {
                mBinding.mCustomTV.backgroundResource = R.drawable.bg_btn_acc_circel
                mBinding.mCustomTV.textColorResource = R.color.white
            } else {
                mBinding.mCustomTV.backgroundResource = R.drawable.bg_btn_gray_circle
                mBinding.mCustomTV.textColorResource = R.color.gray_text_light
            }
        }
        mBinding.mSearchET.handlerText {
            if (it.isEmpty()) {
                mBinding.mCustomTV.visibility = View.GONE
                mBinding.mCustomTitleTV.visibility = View.GONE
                refreshDefaultList()
            }
        }
        //点击了自定义搜索
        mBinding.mCustomTV.setOnClickListener {
            val text = mBinding.mCustomTV.text.handlerNull()
            var flag = false
            var selectFlag: BatchAddPartChildEntityV2.DataBean.PartsGroupBean? = null
            selectPartsList.forEach {
                if (it.ctgname == text) {
                    selectFlag = it
                    flag = true
                }
            }
            //有选中的 取消选中
            if (flag) {
                selectPartsList.remove(selectFlag)
                mBinding.mCustomTV.backgroundResource = R.drawable.bg_btn_gray_circle
                mBinding.mCustomTV.textColorResource = R.color.gray_text_light

            } else {
                mBinding.mCustomTV.backgroundResource = R.drawable.bg_btn_blue_circel
                mBinding.mCustomTV.textColorResource = R.color.white
                val bean = BatchAddPartChildEntityV2.DataBean.PartsGroupBean()
                bean.ctgname = text
                bean.unKnowPart = true
                selectPartsList.add(bean)
            }
            handlerSelectList()
        }
        //EPC 按钮
        mBinding.mEPC.setOnClickListener {
//            val data = BatchAddPartChildBean()
//            data.list = selectPartsList
            BaseApplication.enquireSelectPartsList = selectPartsList
            startActivityForResult<EPCActivity>(
                101,
                MyConstants.CAR_ID to carId,
                MyConstants.EPC to epc,
                MyConstants.CAR_INTRO to carIntro,
            )
        }
    }


    //添加View
    private fun addView(text: String, tag: String) {
        val view = SelectPartWidget(this)
        view.textSet(text)
        view.tag = tag
        view.setOnClick(this)
        mBinding.mContainerLL.addView(view)
        refreshSelectCount()
    }

    //删除Item
    override fun removeView(tag: String, partName: String) {
        var view: View? = null
        repeat(mBinding.mContainerLL.childCount) {
            val v = mBinding.mContainerLL.getChildAt(it)
            if (v.tag == tag) {
                view = v
            }
        }
        view?.let {
            mBinding.mContainerLL.removeView(view)
        }
        //清除list中数据
        var bean: BatchAddPartChildEntityV2.DataBean.PartsGroupBean? = null
        selectPartsList.forEach {
            if (it.categoryId == tag) {
                bean = it
            }
            if (it.unKnowPart && it.parentPartName == partName) {
                bean = it
            }
        }
        selectPartsList.remove(bean)
        refreshSelectCount()
    }

    //刷新选中数量
    private fun refreshSelectCount() {
        val count = "已选${mBinding.mContainerLL.childCount}个配件"
        mBinding.mCurrentPartCountTV.text = count
        handlerRightSelectStatue()
    }

    //处理左侧配件选中状态
    private fun handlerRightSelectStatue() {
        //先设置为未选中
        mList.forEach {
            it.select = false
        }
        //如果出现类别内的就是选中了
        selectPartsList.forEach { a ->
            mList.forEach { b ->
//                MyLog.d("showTime:${a.parentCategoryIdFlag}  ${b.partCategoryId}")
                if (a.parentCategoryIdFlag == b.partCategoryId) {
                    b.select = true
                }
            }
        }
        mAdapter.notifyDataSetChanged()
    }

    //常用配件点击
    override fun onItemClick(partName: String, categoryId: String, select: Boolean, position: Int) {
        if (carId.isEmpty()) {
            val data = BatchAddPartChildEntityV2.DataBean.PartsGroupBean()
            data.ctgname = partName
            data.categoryId=categoryId
            data.parentPartName = partName
            data.parentCategoryIdFlag = categoryId
            data.buyCount = 1
            data.oe = ""
            data.unKnowPart = true
            data.select = true
            var canAdd = true
            selectPartsList.forEach {
                if (it.ctgname == partName && it.unKnowPart) {
                    //如果是未知配件并且名称和标准名称一样就无法重复添加
                    canAdd = false
                }
            }
            if (canAdd) {
                selectPartsList.add(data)
                handlerSelectList()
//                MyLog.d("有东西么有东西么4:${getGson().toJson(selectPartsList)}")
                showToast("添加成功")
            } else {
                showToast("请勿重复添加")
            }


        } else {
            showLoading()
            mParentCategoryId = categoryId
            mParentPartName = partName
            mViewModel.searchBathAddPartsChild(categoryId, carId, epc)
        }


        //之前的不要了现在直接进去添加
//        if (select) {
//            //进行查询
//            showLoading()
//            mParentCategoryId = categoryId
//            mParentPartName = partName
//            mViewModel.searchBathAddPartsChild(categoryId, carId, epc)
//
//        } else {
//            //移除
//            var flag = BatchAddPartChildEntity.DataBean()
//            selectPartsList.forEach {
//                if (it.parentCategoryIdFlag == categoryId) {
//                    flag = it
//                }
//            }
//            selectPartsList.remove(flag)
//            handlerSelectList()
//            //处理列表点击事件
//            mList[position].select = select
//            mAdapter.notifyDataSetChanged()
//            refreshSelectCount()
//        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        MyLog.d("回来了:$requestCode")
        //页面传值带数据
        if (requestCode == 100 && data != null) {
            val dataStr = data.getStringExtra(MyConstants.RESULT_DATA)
            MyLog.d("回来了么$dataStr")

            val list1 = getGson().fromJson(dataStr, BatchAddPartChildBean::class.java)
            //吧选中的加到列表内去
            list1?.list?.forEach { bean ->
                if (bean.select) {
                    selectPartsList.add(bean)
                }
            }
            handlerSelectList()
        }





        if (requestCode == 101 && data != null) {
//            val dataStr = data.getStringExtra(MyConstants.RESULT_DATA).handlerNull()
//            MyLog.d("EPC带数据回来了:$dataStr")
//            if (dataStr.isNotEmpty()) {
//                val entity = getGson().fromJson(dataStr, BatchAddPartChildEntity::class.java).data
//                entity?.let { list ->
//                    selectPartsList.clear()
//                    selectPartsList.addAll(list)
//                    handlerSelectList()
//                    refreshDefaultList()
//                }
//            }
        }
    }

    //处理选中的列表(常用件和自定义)
    private fun handlerSelectList() {
        mBinding.mContainerLL.removeAllViews()
        selectPartsList.forEach { item ->
            addView(item.ctgname.handlerNull(), item.categoryId.handlerNull())
        }
    }
}
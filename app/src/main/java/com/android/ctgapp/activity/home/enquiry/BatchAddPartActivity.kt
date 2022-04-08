package com.android.ctgapp.activity.home.enquiry

import android.content.Intent
import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.home.BathAddPartChildItemAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityBatchAddPartBinding
import com.android.ctgapp.entity.home.BatchAddPartChildEntity
import com.android.ctgapp.entity.home.BatchAddPartChildEntityV2
import com.android.ctgapp.entity.home.BatchAddPartEntityV2
import com.android.ctgapp.entity.home.enquire.BatchAddPartChildBean
import com.android.ctgapp.util.*
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.startActivityForResult
import kotlin.collections.ArrayList

/**
 *作者:LiBW
 *创建日期: 4/27/21
 *描述:批量添加配件 页面 (外观件.....)
 */
class BatchAddPartActivity : BaseActivityV2(), BathAddPartChildItemAdapter.PartSearchCallback {
    private val mBinding by lazy { ActivityBatchAddPartBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root


    private val mViewModel by lazy { ViewModelProvider(this)[BatchAddPartViewModel::class.java] }
    private val partId by lazy { intent.getIntExtra(MyConstants.PART_ID, -1) }

    //当前分类(前左 前中)
    private var currentPartId = ""

    //蒙版颜色
    private val maskColor = Color.parseColor("#AAFFFFFF")

    //透明色
    private val tranColor = Color.parseColor("#00000000")
    private val windowWidth by lazy { Resources.getSystem().displayMetrics.widthPixels }
    private val carId by lazy { intent.getStringExtra(MyConstants.CAR_ID) }
    private val epc by lazy { intent.getStringExtra(MyConstants.EPC) }

    //上个页面获取的数据List
    private var mPreList = ArrayList<BatchAddPartEntityV2.DataBean>()


    //此页面选中的数据
    private val selectPartsList = ArrayList<BatchAddPartChildEntityV2.DataBean.PartsGroupBean>()

    //本页面底部配件细分所展示的list
    private val mList = ArrayList<BatchAddPartEntityV2.DataBean>()
    private val mAdapter by lazy { BathAddPartChildItemAdapter(this, mList, this) }

    //当前点击的控件ID(标记子控件的ID)
    private var mParentCategoryId = ""
    private var mParentPartName = ""

    //当前ctgname用来区分不知道选啥就选我(左前雾灯)
//    private var currentCTGName = ""

    //上次选择的 配件大分类(防止重复点击)
    private var preParentId = ""

    //当前选择的 配件大分类
    private var currentParentId = ""
    private var preView: View? = null
    private var preChildTag = ""

    //设置
    private var menuPopup: PopupWindow? = null

    override fun event() {

        selectPartsList.addAll(BaseApplication.enquireSelectPartsList)
//        //处理上个页面选中的数据
//        val dataStr = intent.getStringExtra(MyConstants.SELECT_PARTS_LIST)
//        val data = getGson().fromJson(dataStr, BatchAddPartChildEntity::class.java).data
//        data?.let {
//            selectPartsList.addAll(it)
//        }
        //底部配件细分列表
        mBinding.mBottomRV.adapter = mAdapter
        mBinding.mBottomRV.layoutManager = GridLayoutManager(this, 4, GridLayoutManager.VERTICAL, false)
        //加载数据
        partParentSelect(partId.handlerNull())

        //底部列表(左前大灯)选中后获取子数据(不懂咋选就选我)(不知道选啥就选我)
        mViewModel.partSearchChildResult.observe(this, {
            MyLog.d("配件搜索查询:$it")
            dismissLoading()
            handlerHttpResult(it) {
                val bean = getGson().fromJson(it, BatchAddPartChildEntityV2::class.java)
                bean?.data?.let { list ->
                    //将当前父ID和子ID进行绑定 数据部搞事情 自己遍历吧
                    list.forEach { dataBean ->
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


                    //进入配件子页面
                    startActivityForResult<BatchAddPartSelectMoreActivity>(
                        100,
                        MyConstants.RESULT_DATA to getGson().toJson(bean),
//                        MyConstants.PARENT_PART_NAME to mParentPartName
                    )
//                    }
                }
                if (bean?.data == null) {
                    showToast("暂无数据")
                }
            }
        })

        mViewModel.error.observe(this, {
            dismissLoading()
            MyLog.d(it)
        })

    }


    //布局蒙版方块被点击
    private fun onPartParentClick() {
        repeat(mBinding.mLayout1.childCount) {
            mBinding.mLayout1.getChildAt(it).setOnClickListener { view ->
                handlerClick(view)
            }
        }
        repeat(mBinding.mLayout2.childCount) {
            mBinding.mLayout2.getChildAt(it).setOnClickListener { view ->
                handlerClick(view)
            }
        }
        repeat(mBinding.mLayout3.childCount) {
            mBinding.mLayout3.getChildAt(it).setOnClickListener { view ->
                handlerClick(view)
            }
        }
    }

    private fun handlerClick(view: View) {
        //恢复上一个被点击的按钮
        preView?.backgroundColor = maskColor
        preChildTag = view.tag.handlerNull()
        view.backgroundColor = tranColor
        preView = view
        //联动TabLayout 进行点击选择
        repeat(mBinding.mTabLayout.tabCount) {
            val tab = mBinding.mTabLayout.getTabAt(it)
            if (tab?.tag == view.tag) {
                tab?.select()
                //联动底部细分整体
//                handlerBottomRecyclerView(view.tag.handlerNull())
            }
        }
    }

    //处理横向列表
    private fun handlerHorizonRecyclerView(id: String) {
        val mData = intent.getStringExtra(MyConstants.RESULT_DATA).handlerNull()
        if (mPreList.isEmpty()) {
            if (mData.isNotEmpty()) {
                val entity = getGson().fromJson(mData, BatchAddPartEntityV2::class.java)
                if (entity.status == 0) {
                    entity.data?.let {
                        mPreList.clear()
                        mPreList.addAll(it)
                    }
                } else {
                    showToast("服务器异常,请稍后再试")
                    finish()
                }
            }
        }
        //先清除所有横向列表
        mBinding.mTabLayout.removeAllTabs()
        //将对应上的父布局的id加入到横向布局中
        mPreList.forEach {
            if (it.parentCategoryId == id) {
                val tab = mBinding.mTabLayout.newTab()
                tab.text = it.des
                tab.tag = it.categoryId
                mBinding.mTabLayout.addTab(tab)
            }
        }
    }



    //父布局被选择了切换整体
    private fun partParentSelect(id: String) {
        //当前选择的配件ID
        currentParentId = id
        //如果和上次选择的一样就不再往下走
        if (id == preParentId) return
        handlerHorizonRecyclerView(id)
        preView = null
        preChildTag = ""
        mBinding.mLayout1.removeAllViews()
        mBinding.mLayout2.removeAllViews()
        mBinding.mLayout3.removeAllViews()
        when (id) {
            //外观件
            "101" -> {
                mBinding.mTitleTv.text = "外观件"
                mBinding.mTitlePhotoIV.backgroundResource = R.drawable.img_car_outside_horizon
                mBinding.mLayout2.visibility = View.VISIBLE
                mBinding.mLayout3.visibility = View.VISIBLE
                addView(windowWidth / 2 * 106 / 100, "101-03", mBinding.mLayout1, "前右")
                addView(windowWidth / 2 * 94 / 100, "101-06", mBinding.mLayout1, "后右")
                addView(windowWidth / 3 * 12 / 10, "101-02", mBinding.mLayout2, "前中")
                addView(windowWidth / 3 * 10 / 10, "101-07", mBinding.mLayout2, "车顶")
                addView(windowWidth / 3 * 8 / 10, "101-05", mBinding.mLayout2, "后中")
                addView(windowWidth / 2 * 106 / 100, "101-01", mBinding.mLayout3, "前左")
                addView(windowWidth / 2 * 94 / 100, "101-04", mBinding.mLayout3, "后左")
            }
            //底盘件
            "102" -> {

                mBinding.mTitleTv.text = "底盘件"
                mBinding.mTitlePhotoIV.backgroundResource = R.drawable.img_car_underpan_horizon
                mBinding.mLayout2.visibility = View.VISIBLE
                mBinding.mLayout3.visibility = View.VISIBLE
                addView(windowWidth / 2, "102-03", mBinding.mLayout1, "前右")
                addView(windowWidth / 2, "102-07", mBinding.mLayout1, "后右")
                addView(windowWidth / 3, "102-02", mBinding.mLayout2, "前中")
                addView(windowWidth / 3, "102-04", mBinding.mLayout2, "中部")
                addView(windowWidth / 3, "102-06", mBinding.mLayout2, "后中")
                addView(windowWidth / 2, "102-01", mBinding.mLayout3, "钱左")
                addView(windowWidth / 2, "102-05", mBinding.mLayout3, "后左")
            }
            //发动机和变速器
            "103" -> {

                mBinding.mLayout2.visibility = View.GONE
                mBinding.mLayout3.visibility = View.GONE
                mBinding.mTitleTv.text = "发动机和变速器"
                mBinding.mTitlePhotoIV.backgroundResource = R.drawable.img_engine_gearbox_horizon
                addView(windowWidth / 2, "103-01", mBinding.mLayout1, "发动机")
                addView(windowWidth / 2, "103-02", mBinding.mLayout1, "变速器")
            }
            //内饰件
            "104" -> {

                mBinding.mLayout2.visibility = View.VISIBLE
                mBinding.mLayout3.visibility = View.GONE
                mBinding.mTitleTv.text = "内饰件"
                mBinding.mTitlePhotoIV.backgroundResource = R.drawable.img_car_inside_horizon
                addView(windowWidth / 4 * 8 / 10, "", mBinding.mLayout1, "占位", false)
                addView(windowWidth / 4 * 6 / 10, "104-01", mBinding.mLayout1, "前部")
                addView(windowWidth / 4 * 8 / 10, "104-03", mBinding.mLayout1, "前右")
                addView(windowWidth / 4 * 7 / 10, "104-05", mBinding.mLayout1, "后右")
                addView(windowWidth / 3, "", mBinding.mLayout1, "占位", false)
                addView(windowWidth / 4 * 8 / 10, "", mBinding.mLayout2, "占位", false)
                addView(windowWidth / 4 * 6 / 10, "104-01", mBinding.mLayout2, "前部")
                addView(windowWidth / 4 * 8 / 10, "104-02", mBinding.mLayout2, "前左")
                addView(windowWidth / 4 * 7 / 10, "104-04", mBinding.mLayout2, "后左")
                addView(windowWidth / 3, "", mBinding.mLayout2, "占位", false)
            }
            //保养件
            "105" -> {

                mBinding.mLayout2.visibility = View.VISIBLE
                mBinding.mLayout3.visibility = View.VISIBLE
                mBinding.mTitleTv.text = "保养件"
                mBinding.mTitlePhotoIV.backgroundResource = R.drawable.img_maintenance_horizon
                addView(windowWidth / 4, "105-03", mBinding.mLayout1, "空调滤芯")
                addView(windowWidth / 4, "105-07", mBinding.mLayout1, "火花塞")
                addView(windowWidth / 4, "105-0", mBinding.mLayout1, "刹车感应")
                addView(windowWidth / 4, "105-0", mBinding.mLayout1, "柴油滤芯")
                addView(windowWidth / 4, "105-02", mBinding.mLayout2, "刹车片")
                addView(windowWidth / 4, "105-05", mBinding.mLayout2, "空气滤芯")
                addView(windowWidth / 4, "105-06", mBinding.mLayout2, "汽油滤芯")
                addView(windowWidth / 4, "105-", mBinding.mLayout2, "变速箱油滤芯")
                addView(windowWidth / 4, "105-01", mBinding.mLayout3, "雨刮片")
                addView(windowWidth / 4, "105-04", mBinding.mLayout3, "机油滤芯")
                addView(windowWidth / 4, "105-08", mBinding.mLayout3, "点火线圈")
                addView(windowWidth / 4, "105-09", mBinding.mLayout3, "蓄电池")
            }
            //常用件
            "106" -> {
                mBinding.mLayout2.visibility = View.VISIBLE
                mBinding.mLayout3.visibility = View.VISIBLE
                mBinding.mTitleTv.text = "常用件"
                mBinding.mTitlePhotoIV.backgroundResource = R.drawable.img_common_use_horizon
                addView(windowWidth / 4, "106-03", mBinding.mLayout1, "点火系统")
                addView(windowWidth / 4, "106-06", mBinding.mLayout1, "染料系统")
                addView(windowWidth / 4, "106-09", mBinding.mLayout1, "转向系统")
                addView(windowWidth / 4, "106-12", mBinding.mLayout1, "车身")
                addView(windowWidth / 4, "106-02", mBinding.mLayout2, "曲轴凸轮轴")
                addView(windowWidth / 4, "106-05", mBinding.mLayout2, "冷却润滑")
                addView(windowWidth / 4, "106-08", mBinding.mLayout2, "制动系统")
                addView(windowWidth / 4, "106-11", mBinding.mLayout2, "悬架")
                addView(windowWidth / 4, "106-01", mBinding.mLayout3, "配气机构")
                addView(windowWidth / 4, "106-04", mBinding.mLayout3, "启动系统")
                addView(windowWidth / 4, "106-07", mBinding.mLayout3, "发动机机脚")
                addView(windowWidth / 4, "106-10", mBinding.mLayout3, "空调及电器")
            }
            else -> {
            }
        }

        //上次点击的ID
        preParentId = id
        //更新点击事件
        onPartParentClick()
        //切换后选择默认选中的蒙版
        when (id) {
            //发动机和变速器
            "103" -> {
                if (mBinding.mLayout1.childCount > 0) {
                    val view = mBinding.mLayout1.getChildAt(0)
                    view.performClick()
                    view?.tag?.let {
                        handlerBottomRecyclerView(it.handlerNull())
                    }
                }
            }
            //内饰
            "104" -> {
                if (mBinding.mLayout1.childCount > 2) {
                    val view = mBinding.mLayout1.getChildAt(2)
                    view.performClick()

//                    val view1=mLayout1.getChildAt(1)
//                    view1.performClick()
//
                    view?.tag?.let {
                        handlerBottomRecyclerView(it.handlerNull())
                    }
                }
            }


            else -> {
                if (mBinding.mLayout3.childCount > 0) {
                    val view = mBinding.mLayout3.getChildAt(0)
                    view.performClick()
                    view?.tag?.let {
                        handlerBottomRecyclerView(it.handlerNull())
                    }
                }
            }
        }
    }

    //添加蒙版View到
    private fun addView(width: Int, tag: String, container: LinearLayout, name: String, isEnable: Boolean = true) {
        val image = ImageView(this)
        image.contentDescription = name
        image.backgroundColor = maskColor
        val param = LinearLayout.LayoutParams(width, ViewGroup.LayoutParams.MATCH_PARENT)
        image.layoutParams = param
        image.tag = tag
        if (!isEnable) image.isEnabled = false
        container.addView(image)
    }


    override fun click() {
        //后退
        mBinding.mBackIv.setOnClickListener {
            finish()
        }
        //标题切换
        mBinding.mTitleBar.setOnClickListener {
            val menuView = LayoutInflater.from(this).inflate(R.layout.item_batch_add_part_dialog, null, false)
            val layout1: LinearLayout = menuView.findViewById(R.id.mLayout1)
            val layout2: LinearLayout = menuView.findViewById(R.id.mLayout2)

            repeat(layout1.childCount) { index ->
                val view = layout1.getChildAt(index)
                if (currentParentId == view.tag) {
                    view.backgroundResource = R.drawable.bg_part_select
                }
            }

            repeat(layout2.childCount) { index ->
                val view = layout2.getChildAt(index)
                if (currentParentId == view.tag) {
                    view.backgroundResource = R.drawable.bg_part_select
                }
            }


            val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
//            params.marginEnd = 30f.toPx(this)
            menuView.layoutParams = params
            menuPopup = PopupWindow(menuView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, true)
            //设置背景透
            menuPopup?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            menuPopup?.showAsDropDown(it)

            repeat(layout1.childCount) { index ->
                val view = layout1.getChildAt(index)
                view.setOnClickListener {
                    partParentSelect(view.tag.handlerNull())
                    menuPopup?.dismiss()
                }

            }
            repeat(layout2.childCount) { index ->
                val view = layout2.getChildAt(index)
                view.setOnClickListener {
                    partParentSelect(view.tag.handlerNull())
                    menuPopup?.dismiss()
                }
            }
            val mCancelTV: TextView = menuView.findViewById(R.id.mCancelTV)
            mCancelTV.setOnClickListener {
                menuPopup?.dismiss()
            }

        }
        //横向滚动条点击事件
        mBinding.mTabLayout.handlerSelectReturnTag { partId ->
            currentPartId = partId
            //如果没有partId则不会变化下方选项
            repeat(mBinding.mLayout1.childCount) {
                val view = mBinding.mLayout1.getChildAt(it)
                if (view.tag == partId) {
                    view.performClick()
                    handlerBottomRecyclerView(partId)
                }
            }
            repeat(mBinding.mLayout2.childCount) {
                val view = mBinding.mLayout2.getChildAt(it)
                if (view.tag == partId) {
                    view.performClick()
                    handlerBottomRecyclerView(partId)
                }
            }
            repeat(mBinding.mLayout3.childCount) {
                val view = mBinding.mLayout3.getChildAt(it)
                if (view.tag == partId) {
                    view.performClick()
                    handlerBottomRecyclerView(partId)
                }
            }
            //单独处理内饰件里面正前方的中控台
            if (currentParentId == "104") {
                if (partId == "104-01") {
                    repeat(mBinding.mLayout1.childCount) {
                        val targetView = mBinding.mLayout1.getChildAt(it)
                        if (targetView?.tag == "104-01") {
                            targetView.visibility = View.INVISIBLE
                        }
                    }
                    repeat(mBinding.mLayout2.childCount) {
                        val targetView = mBinding.mLayout1.getChildAt(it)
                        if (targetView?.tag == "104-01") {
                            targetView.visibility = View.INVISIBLE
                        }
                    }
                } else {
                    repeat(mBinding.mLayout1.childCount) {
                        val targetView = mBinding.mLayout1.getChildAt(it)
                        if (targetView?.tag == "104-01") {
                            targetView.visibility = View.VISIBLE
                        }
                    }
                    repeat(mBinding.mLayout2.childCount) {
                        val targetView = mBinding.mLayout2.getChildAt(it)
                        if (targetView?.tag == "104-01") {
                            targetView.visibility = View.VISIBLE
                        }
                    }
                }
            }
        }
        //确认添加
        mBinding.mConfirmBTN.setOnClickListener {
//            val intent = Intent()
//            val data = BatchAddPartChildEntity()
//            data.data = selectPartsList
//            intent.putExtra(MyConstants.RESULT_DATA, getGson().toJson(data))
//            setResult(100, intent)
            BaseApplication.enquireSelectPartsList = selectPartsList
            finish()
        }
    }

    //选中回调
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //配件选择完毕 回来加入列表
        if (requestCode == 100 && data != null) {
            val dataStr = data.getStringExtra(MyConstants.RESULT_DATA)

//            val list1 = getGson().fromJson(dataStr, BatchAddPartChildEntity::class.java).data
//            val list1 = getGson().fromJson(dataStr, BatchAddPartChildEntityV2::class.java)
            val list1 = getGson().fromJson(dataStr, BatchAddPartChildBean::class.java)

            //标记要移除的目标 先不要移除了 直接往里加 因为OE可能重复 先别删 万一以后要呢
//            val removeBean = ArrayList<BatchAddPartChildEntity.DataBean>()
//            list1?.forEach { bean ->
//                //先删除所有该列表中应该有的
//                selectPartsList.forEach { s ->
//                    if (s.oe.handlerNull().isNotEmpty()) {
//                        if (bean.oe == s.oe) {
//                            //列表中有这个就删掉
//                            removeBean.add(s)
//                        }
//                    }
//                }
//            }
//            //标记不知道选啥就选我
//            selectPartsList.forEach { bean ->
//                if (bean.unKnowPart && bean.parentPartName == mParentPartName) {
//                    removeBean.add(bean)
//                }
//            }
//
//            //开始移除
//            removeBean.forEach {
//                selectPartsList.remove(it)
//            }


            //吧选中的加到列表内去
            list1.list?.forEach { b ->
                if (b.select) {
                    selectPartsList.add(b)
                }
            }


//            list1?.forEach { bean ->
//                if (bean.select) {
//                    selectPartsList.add(bean)
//                }
//            }

//            list1?.let { list ->
//                //只有一条数据加进去
//                if (list.size == 1) {
//                    selectPartsList.addAll(list)
//                    list.forEach { dataBean ->
//                        mPreList.forEach { dataBean2 ->
//                            MyLog.d("当前:${dataBean.categoryId} 还有  ${dataBean.parentCategoryIdFlag}")
//                            if (dataBean.parentCategoryIdFlag == dataBean2.categoryId) {
//                                dataBean2.selected = true
//                            }
//                        }
//                    }
//                }
//                mAdapter.notifyDataSetChanged()
//            }
            handlerBottomRecyclerView(currentPartId)
//            MyLog.d("有东西么有东西么4:${getGson().toJson(selectPartsList)}")
        }
    }

    //处理底部选中状态
//    private fun handlerBottomSelect() {
//
//    }


    //查询获取更多的自配件列表(4级) 下方列表有Item被点击
    override fun onPartSearchClick(categoryId: String, select: Boolean, partName: String,parentCategoryId:String) {
        if (carId.isEmpty()){
            val data = BatchAddPartChildEntityV2.DataBean.PartsGroupBean()
            data.ctgname = partName
            data.parentPartName = partName
            data.parentCategoryIdFlag = categoryId
            data.buyCount = 1
            data.oe = ""
            data.unKnowPart = true
            data.select = true
            var canAdd=true
            selectPartsList.forEach {
                if (it.ctgname==partName&&it.unKnowPart){
                    //如果是未知配件并且名称和标准名称一样就无法重复添加
                    canAdd=false
                }
            }
            if (canAdd){
                selectPartsList.add(data)
                handlerBottomRecyclerView(parentCategoryId)
//                MyLog.d("有东西么有东西么4:${getGson().toJson(selectPartsList)}")
                showToast("添加成功")
            }else{
                showToast("请勿重复添加")
            }
        }else{
            showLoading()
            mParentCategoryId = categoryId
            //左前大灯
            mParentPartName = partName
            //获取该分类下的配件列表
            mViewModel.searchBathAddPartsChild(categoryId, carId, epc)
        }
    }

    //将上个页面带回来的数据赋值给当前列表使用 处理底部列表选中状态
    private fun handlerBottomRecyclerView(id: String) {
        currentPartId = id
        mList.clear()
        mPreList.forEach {
            if (it.parentCategoryId == id) {
                it.selected = false
                mList.add(it)
            }
        }

        mList.forEach { beanA ->
            selectPartsList.forEach { beanB ->
                if (beanA.categoryId == beanB.parentCategoryIdFlag) {
                    beanA.selected = true
                }
            }
        }
        mAdapter.notifyDataSetChanged()
    }

    override fun onPause() {
        super.onPause()
        BaseApplication.enquireSelectPartsList = selectPartsList
    }


}
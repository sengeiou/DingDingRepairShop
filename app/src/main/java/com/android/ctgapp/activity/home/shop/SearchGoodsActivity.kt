package com.android.ctgapp.activity.home.shop

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.core.view.GravityCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.R
import com.android.ctgapp.activity.home.shop.PartShopActivityUtil.initActivity
import com.android.ctgapp.adapter.home.*
import com.android.ctgapp.adapter.pupupwindow.OtherAttrChildAdapter
import com.android.ctgapp.adapter.pupupwindow.PinPaiAdapter
import com.android.ctgapp.adapter.pupupwindow.ShopBrandAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivitySearchGoodsBinding
import com.android.ctgapp.entity.home.*
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserverHandlerLoading
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.GoodsAddTrolleyDialog
import com.ocrgroup.activity.VinScanActivity
import kotlinx.android.synthetic.main.item_brander_select_popup.view.*
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource
import java.util.HashMap

/**
 *作者:LiBW
 *创建日期: 2021/12/31
 *描述: 商城 页面(搜索)
 */
class SearchGoodsActivity : BaseActivityV2(), GoodsMenuSearchAdapter.GoodsMenuSearchAdapterListener, GoodsByFCodeAdapter.GoodsByFCodeListener, ShopBrandAdapter.BranderListener, PinPaiAdapter.PinPaiListener, ShopCategoryAdapter.LinShiAdapterListener, FenLeiAdapter.FenLeiListener, AttrHorizontalSearchAdapter.AttrHorizontalSearchAdapterListener, OtherAttrChildAdapter.OtherAttrChildListener, AttrDrawAdapter.AttrDrawListener, GoodsAddTrolleyDialog.AddTrolley {
    private val mBinding by lazy { ActivitySearchGoodsBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root


    val mViewModel: PartShopViewModel by lazy { ViewModelProvider(this)[PartShopViewModel::class.java] }


    //轮播图ID 是否是轮播图搜索进来的
    private val bannerId: Int by lazy { intent.getIntExtra(MyConstants.BANNER_ID, -1) }
    var page = 1
    var size = 20
    private val goodsList = ArrayList<GoodsItemEntity>()


    //主体商品适配器
    val mAdapter: GoodsByFCodeAdapter by lazy { GoodsByFCodeAdapter(this, goodsList, this) }

    //销量排序 需要排序则传1 默认销量排序
    var sortSales = ""

    //价格排序 需要排序则传1
    private var sortPrice = ""

    //搜索框
    var query = ""

    //接收识别结果返回码
    private val vinResultCode = 101

    //品牌相关
    var brandPopup: PopupWindow? = null
    var preBrandSelect = ""//预选中的品牌
    var brandSelect = ""//选中的品牌
    val brandList = ArrayList<GoodsByFCodeEntity.DataBean.BrandListBean>()
    private val brandAdapter by lazy { ShopBrandAdapter(this, brandList, this) }
    val pinpaiDrawAdapter by lazy { PinPaiAdapter(this, brandList, this) }

    //分类相关
    var categoryPopup: PopupWindow? = null
    var categorySelect = ""//选中的分类
    var preCategorySelect = ""
    private val categoryList = ArrayList<GoodsByFCodeEntity.DataBean.CategoryVosBean>()
    private val categoryAdapter by lazy { ShopCategoryAdapter(this, categoryList, this) }
    val fenleiDrawAdapter by lazy { FenLeiAdapter(this, categoryList, this) }

    //额外属性相关
    private val mAttrList = ArrayList<OtherAttrEntity.DataBean>()
    private val mAttrListDrw = ArrayList<OtherAttrEntity.DataBean>()

    //额外属性横向列表 品牌分类
    val mAttrHorizontalAdapter by lazy { AttrHorizontalSearchAdapter(this, mAttrList, this) }
    private val mAttrSelectMap = HashMap<String, String>()//选中的规格
    var mAttrPopup: PopupWindow? = null
    var mAttrChildList = ArrayList<OtherAttrEntity.DataBean.SelectBean>()

    //下拉框内的额外属性选择子单
    private val mAttrChildAdapter by lazy { OtherAttrChildAdapter(this, mAttrChildList, this) }

    //抽屉内的额外属性
    val mAttrDrawAdapter by lazy { AttrDrawAdapter(this, mAttrListDrw, this) }


    //当前选中的父Attr的id (map中的key)
    var mCurrentAttrKey = ""
    var maxSize = 3

    var mSeriesName = ""


    private var fCode: String? = null

    override fun event() {
        //先不展示分类
        mBinding.mCategoryBTN.visibility = View.GONE
        val menuBrandId = intent.getIntExtra(MyConstants.BRAND_ID, -1)
        val menuCtgNum = intent.getStringExtra(MyConstants.CTG_NUM).handlerNull()
        //修改后的 首页底部品牌按钮过来后新加的字段 有值就给后台
        mSeriesName = intent.getStringExtra(MyConstants.SERIES_NAME).handlerNull()

        if (menuBrandId != -1) brandSelect = menuBrandId.handlerNull()
        //首页底部按钮点进来的不能切换品牌了
        if (intent.getBooleanExtra(MyConstants.NO_BANNER, false)) {
            //从首页底部点进来的不要展示品牌按钮了
            mBinding.mBrandBTN.visibility = View.GONE
            categorySelect = menuCtgNum
        }
        initActivity(mBinding)
        initDraw()
        categoryPopupInit()
        brandPopupInit()
        attrPopupInit()
        //商品回调
        mViewModel.goodResult.observe(this, {
            maxSize = 3
            mBinding.mConfirmBTN.text = "确定(0件商品)"
            if (page == 1) {//刷新后将数据清除
                goodsList.clear()
                mAdapter.notifyDataSetChanged()
            }
            mBinding.mRefresh.over()
            loading.dismiss()
            MyLog.d("商品列表:$it")
            handlerHttpResult(it) {
                val entity = getGson().fromJson(it, GoodsByFCodeEntity::class.java).data
                entity?.goodsList?.let { data ->
                    val count = "确定(${data.total.handlerNull()}件商品)"
                    mBinding.mConfirmBTN.text = count
                }
                MyLog.d("品牌0:${getGson().toJson(entity?.brandList)}")

                //品牌
                entity?.brandList?.let { list ->
                    MyLog.d("品牌1:${getGson().toJson(list)}")
                    if (list.isNotEmpty()) {
                        MyLog.d("品牌2:${getGson().toJson(list)}")
                        mBinding.mBrandBTN.visibility = View.VISIBLE
                        brandList.clear()
                        brandList.addAll(list)
                        brandAdapter.notifyDataSetChanged()
                        pinpaiDrawAdapter.notifyDataSetChanged()
                    } else {
                        MyLog.d("品牌3:${getGson().toJson(list)}")
                        mBinding.mBrandBTN.visibility = View.GONE
                    }
                }

                //商品菜单
                entity?.goodsList?.records?.let { list ->
                    goodsList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
                //分类
                entity?.categoryVos?.let { list ->
                    if (list.size == 1) {
                        //分类只有一个就隐藏 横向可以多放一个Item
                        maxSize++
                        mBinding.mCategoryBTN.visibility = View.GONE
                        mBinding.mFenLeiTV.visibility = View.GONE
                        mBinding.mFenLeiRV.visibility = View.GONE
                        //将唯一分类设置上去
                        categorySelect = list[0].ctgnum.handlerNull()
                        //按照这个分类去获取后续数据
                        afterCategorySelect()
                    } else {
                        //分类包含多个的处理
                        if (list.isNotEmpty()) {
                            mBinding.mFenLeiTV.visibility = View.VISIBLE
                            mBinding.mFenLeiRV.visibility = View.VISIBLE
                            mBinding.mCategoryBTN.visibility = View.VISIBLE
                            categoryList.clear()
                            categoryList.addAll(list)
                            categoryList.forEach {
                                if (categorySelect == it.ctgnum) {
                                    it.select = true
                                }
                            }
                            categoryAdapter.notifyDataSetChanged()
                            fenleiDrawAdapter.notifyDataSetChanged()
                        } else {
                            mBinding.mCategoryBTN.visibility = View.GONE
                        }
                    }
                }

            }
        })

        mViewModel.attrResult.observe(this, {
            MyLog.d("其他属性回调:$it")
            handlerHttpResult(it) {
                handlerAttrHorizontalAfterHttp(it)
            }
        })

        //banner商品搜索
        mViewModel.goodByBannerResult.observe(this, {
            mBinding.mRefresh.over()
            loading.dismiss()
            MyLog.d("商品列表:$it")
            handlerHttpResult(it) {
                val entity = getGson().fromJson(it, GoodsByFCodeEntity::class.java).data
                entity?.brandList?.let { list ->
                    //初始化左侧菜单
                    if (brandList.isEmpty()) {
                        brandList.clear()
                        val item = GoodsByFCodeEntity.DataBean.BrandListBean()
                        item.select = true
                        item.id = ""
                        item.brandName = "全部"
                        brandList.add(item)
                        brandList.addAll(list)
                    }
                }
                //商品菜单
                entity?.goodsList?.records?.let { list ->
                    goodsList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
        })

        //添加购物车回调
        mViewModel.addTrolleyResult.observe(this, {
            loading.dismiss()
            MyLog.d("添加购物车回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("添加购物车成功")
            } else {
                showToast(data.msg)
            }
        })
    }

    private fun categoryPopupInit() {
        val menuView = LayoutInflater.from(this).inflate(R.layout.item_brander_select_popup, null, false)
        categoryPopup = PopupWindow(menuView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, true)
        //设置背景透
        categoryPopup?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        menuView.mBrandRV.adapter = categoryAdapter
        menuView.mBrandRV.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        //底部半透明蒙版(取消)
        menuView.mBottomRL.setOnClickListener {
            MyLog.d("我点击了一下")
            categoryPopup?.dismiss()
        }
        categoryPopup?.setOnDismissListener {
            mBinding.mArrowIV.imageResource = R.drawable.ic_arrow_grey_down
        }
        //重置
        menuView.mResetBTN.setOnClickListener {
            categoryList.forEach {
                it.select = false
            }
            preCategorySelect = ""
            categoryAdapter.notifyDataSetChanged()
            fenleiDrawAdapter.notifyDataSetChanged()

            categorySelect = preCategorySelect
            initGoods()
            categoryPopup?.dismiss()
            afterCategorySelect()
        }
        //分类 确认按钮
        menuView.mConfirmBTN.setOnClickListener {
            categorySelect = preCategorySelect
            initGoods()
            categoryPopup?.dismiss()
            afterCategorySelect()
        }
        //弹窗消失回调
        categoryPopup?.setOnDismissListener {
            popupDismissHandler()
        }
    }

    //处理其他属性的横向列表
    private fun handlerOtherAttrHorizontalMenu() {
        //根据当前所有选中的属性来恢复选中状态
        mAttrList.forEach { bean ->
            var select = false
            mAttrSelectMap.forEach {
                //全部属性 是空的
                if (bean.id == it.key && it.value.isNotEmpty()) {
                    select = true
                }
            }
            bean.select = select
        }
        mAttrHorizontalAdapter.notifyDataSetChanged()
    }


    //属性接口回调后 处理横向列表
    private fun handlerAttrHorizontalAfterHttp(str: String) {
        //深拷贝
        val data = getGson().fromJson(str, OtherAttrEntity::class.java).data
        data?.let { list ->
            list.forEach { b ->
                val bean = ArrayList<OtherAttrEntity.DataBean.SelectBean>()
                b.list?.forEach {
                    val c = OtherAttrEntity.DataBean.SelectBean()
                    c.name = it
                    bean.add(c)
                }
                b.selectList = bean
            }
            mAttrList.clear()
            mAttrList.addAll(list)
            //恢复选中项
            mAttrList.forEach { listBean ->
                mAttrSelectMap.forEach { map ->
                    if (map.key == listBean.id) {
                        listBean.selectList?.forEach { bean ->
                            if (map.value == bean.name) {
                                bean.select = true
                            }
                        }
                    }
                }
            }
            mAttrHorizontalAdapter.notifyDataSetChanged()
        }
        //深拷贝
        val data2 = getGson().fromJson(str, OtherAttrEntity::class.java).data
        data2?.let { list2 ->
            //单独给Draw内的加入全部
            list2.forEach { b ->
                val bean = ArrayList<OtherAttrEntity.DataBean.SelectBean>()
                val allBean = OtherAttrEntity.DataBean.SelectBean()
                allBean.select = true
                allBean.name = ""
                bean.add(allBean)
                b.list?.forEach {
                    val c = OtherAttrEntity.DataBean.SelectBean()
                    c.name = it
                    bean.add(c)
                }
                b.selectList = bean
            }
            mAttrListDrw.clear()
            mAttrListDrw.addAll(list2)
        }
        //恢复选中项
        mAttrListDrw.forEach { listBean ->
            mAttrSelectMap.forEach { map ->
                if (map.key == listBean.id) {
                    listBean.selectList?.forEach { bean ->
                        if (map.value == bean.name) {
                            //取消"全部"的选中项
                            listBean.selectList!![0].select = false
                            //设置当前为选中
                            bean.select = true
                        }
                    }
                }
            }
        }
        mAttrDrawAdapter.notifyDataSetChanged()
        //处理横向额外属性的选中状态
        handlerOtherAttrHorizontalMenu()
    }

    //选取分类后可以获取其他属性
    private fun afterCategorySelect() {
        if (categorySelect.isNotEmpty()) {
            mViewModel.findAttrAfterCategory(handlerBody("ctgnum" to categorySelect))
        }
    }

    //下拉框消失后处理逻辑
    private fun popupDismissHandler() {
        brandList.forEach {
            it.select = it.id == brandSelect
        }
        brandAdapter.notifyDataSetChanged()
        pinpaiDrawAdapter.notifyDataSetChanged()
        categoryList.forEach {
            it.select = it.ctgnum == categorySelect
        }
        categoryAdapter.notifyDataSetChanged()
        fenleiDrawAdapter.notifyDataSetChanged()
        //处理选中逻辑
        if (brandSelect.isEmpty()) {
            mBinding.mBrandBTN.backgroundResource = R.drawable.bg_solid_gary_light_100dp
            mBinding.mBrandBTN.textColorResource = R.color.black
        } else {
            mBinding.mBrandBTN.backgroundResource = R.drawable.bg_solid_acc_light_100dp
            mBinding.mBrandBTN.textColorResource = R.color.colorAccent
        }
        if (categorySelect.isEmpty()) {
            mBinding.mCategoryBTN.backgroundResource = R.drawable.bg_solid_gary_light_100dp
        } else {
            mBinding.mCategoryBTN.backgroundResource = R.drawable.bg_solid_acc_light_100dp
            mBinding.mCategoryBTN.textColorResource = R.color.colorAccent
        }
    }

    private fun brandPopupInit() {
        val menuView = LayoutInflater.from(this).inflate(R.layout.item_all_soft_popup, null, false)
        brandPopup = PopupWindow(menuView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, true)
        brandPopup?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val mVerticalRv = menuView.findViewById<RecyclerView>(R.id.mBrandRV)
        mVerticalRv.adapter = brandAdapter
        mVerticalRv.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        //重置
        menuView.mResetBTN.setOnClickListener {
            brandList.forEach {
                it.select = false
            }
            brandAdapter.notifyDataSetChanged()
            pinpaiDrawAdapter.notifyDataSetChanged()
            preBrandSelect = ""
            brandSelect = preBrandSelect
            initGoods()
            brandPopup?.dismiss()
        }
        //品牌 确认按钮
        menuView.mConfirmBTN.setOnClickListener {
            brandSelect = preBrandSelect
            initGoods()
            brandPopup?.dismiss()
        }
        brandPopup?.setOnDismissListener {
            popupDismissHandler()
        }
        //底部半透明蒙版(取消)
        menuView.mBottomRL.setOnClickListener {
            MyLog.d("我点击了一下")
            brandPopup?.dismiss()
        }
    }

    //额外属性下拉框
    private fun attrPopupInit() {
        val menuView = LayoutInflater.from(this).inflate(R.layout.item_all_soft_popup, null, false)
        mAttrPopup = PopupWindow(menuView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, true)
        mAttrPopup?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val mVerticalRv = menuView.findViewById<RecyclerView>(R.id.mBrandRV)
        mVerticalRv.adapter = mAttrChildAdapter
        mVerticalRv.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)

        //重置
        menuView.mResetBTN.setOnClickListener {
            actionConfirmFlag = true
            mAttrChildList.forEach {
                if (it.select) {
                    //当前有选中项将其移除 并取消选中
                    mAttrSelectMap.remove(mCurrentAttrKey)
                    it.select = false
                }
            }
            //清除对应横向坐标
            mAttrListDrw[parentPosition].selectList?.forEach {
                it.select = false
            }
            //将全部选中
            mAttrListDrw[parentPosition].selectList!![0].select = true
            mAttrChildAdapter.notifyDataSetChanged()
            mAttrDrawAdapter.notifyDataSetChanged()
            mAttrPopup?.dismiss()
        }
        //确认
        menuView.mConfirmBTN.setOnClickListener {
            //通过确认按钮关闭下拉框
            actionConfirmFlag = true
            //通过确认按钮点击的时候将mAttrSelectMap选中数据加入或者删除
            if (attrChildSelectPosition != -1) {
                if (attrChildSelect) {
                    val data = mAttrChildList[attrChildSelectPosition]
                    mAttrSelectMap[mCurrentAttrKey] = data.name
                } else {
                    mAttrSelectMap.remove(mCurrentAttrKey)
                }
            }
            mAttrPopup?.dismiss()
            initGoods()
        }
        mAttrPopup?.setOnDismissListener {
            //如果不是通过确认按钮关闭的就恢复之前的选项
            if (!actionConfirmFlag) {
                //说明之前有选中
                MyLog.d("选中的位置来清除掉:${attrChildSelectPositionPre}")
                MyLog.d("选中的位置来清除掉:${attrChildSelectPosition}")
                //恢复列表
                mAttrChildList.forEach {
                    it.select = false
                }
                mAttrListDrw[parentPosition].selectList?.forEach {
                    it.select = false
                }
                if (attrChildSelectPositionPre != -1) {
                    //上次有选中的就恢复
                    mAttrChildList[attrChildSelectPositionPre].select = true
                    //抽屉内的有需要恢复
                    mAttrListDrw[parentPosition].selectList!![attrChildSelectPositionPre + 1].select = true
                } else {
                    //上次没有选中说明全空
                    //抽屉内的有需要恢复为全部
                    mAttrListDrw[parentPosition].selectList!![0].select = true
                }
                mAttrChildAdapter.notifyDataSetChanged()
                mAttrDrawAdapter.notifyDataSetChanged()
            }
            MyLog.d("当前选中的东西有么:${getGson().toJson(mAttrSelectMap)}")
            handlerOtherAttrHorizontalMenu()
            initGoods()
        }
        //底部半透明蒙版(取消)
        menuView.mBottomRL.setOnClickListener {
            MyLog.d("我点击了一下")
            mAttrPopup?.dismiss()
        }
    }

    override fun click() {
        //分类
        mBinding.mCategoryBTN.setOnClickListener {
            categoryPopup?.showAsDropDown(mBinding.mCategoryBTN)
        }
        //品牌
        mBinding.mBrandBTN.setOnClickListener {
            brandPopup?.showAsDropDown(mBinding.mBrandBTN)
        }
        //第一版 先做这个 先做成分类
        mBinding.mLinshi.setOnClickListener {
            mBinding.mArrowIV.imageResource = R.drawable.ic_arrow_grey_up
            brandPopup?.showAsDropDown(mBinding.mLinshi)
        }
        //综合排序
        mBinding.mAllSoftBTN.setOnClickListener {
            sortSales = ""
            sortPrice = ""
            initGoods()
            mBinding.mSortPriceTV.textColorResource = R.color.gray_text
            mBinding.mAllSoftBTN.textColorResource = R.color.colorAccent
            mBinding.mSortSalesTV.textColorResource = R.color.gray_text
            //处理箭头
            mBinding.mSaleIV.visibility = View.GONE
            mBinding.mPriceIV.visibility = View.GONE
        }
        //销量排序
        mBinding.mSortSalesRL.setOnClickListener {
            when (sortSales) {
                "1" -> {
                    sortSales = "0"
                    mBinding.mSaleIV.imageResource = R.drawable.icon_sort_down
                }
                "0" -> {
                    sortSales = "1"
                    mBinding.mSaleIV.imageResource = R.drawable.icon_sort_up
                }
                else -> {
                    sortSales = "1"
                    sortPrice = ""
                    mBinding.mSaleIV.imageResource = R.drawable.icon_sort_up
                }
            }
            initGoods()
            //处理文字颜色
            mBinding.mSortPriceTV.textColorResource = R.color.gray_text
            mBinding.mAllSoftBTN.textColorResource = R.color.gray_text
            mBinding.mSortSalesTV.textColorResource = R.color.colorAccent
            //处理箭头
            mBinding.mSaleIV.visibility = View.VISIBLE
            mBinding.mPriceIV.visibility = View.GONE
        }
        //价格排序
        mBinding.mPriceRL.setOnClickListener {
            when (sortPrice) {
                "1" -> {
                    sortPrice = "0"
                    mBinding.mPriceIV.imageResource = R.drawable.icon_sort_down
                }
                "0" -> {
                    sortPrice = "1"
                    mBinding.mPriceIV.imageResource = R.drawable.icon_sort_up
                }
                else -> {
                    sortPrice = "1"
                    sortSales = ""
                    mBinding.mPriceIV.imageResource = R.drawable.icon_sort_up
                }
            }
            initGoods()
            mBinding.mSortPriceTV.textColorResource = R.color.colorAccent
            mBinding.mAllSoftBTN.textColorResource = R.color.gray_text
            mBinding.mSortSalesTV.textColorResource = R.color.gray_text
            //处理箭头
            mBinding.mSaleIV.visibility = View.GONE
            mBinding.mPriceIV.visibility = View.VISIBLE
        }
        //扫描
        mBinding.mScanIV.setOnClickListener {
            getVIN()
        }
        //上拉加载
        mBinding.mRefresh.setOnLoadMoreListener {
            page++
            getGoods()
        }
        //下拉刷新
        mBinding.mRefresh.setOnRefreshListener {
            initGoods()
        }
        mBinding.mBackIV.setOnClickListener {
            finish()
        }
        mBinding.mSearchET.handlerEditTextSearch(this) {
            query = it
            refreshSearch()
            initGoods()

        }
        //重置搜索
        mBinding.mSearchET.handlerText {
            if (it.isEmpty()) {
                query = ""
                refreshSearch()
                initGoods()
            }
        }
        //进入购物车
        mBinding.mTrolleyIV.setOnClickListener {
            startActivity<TrolleyActivity>()
        }
        //筛选 按钮
        mBinding.mShai.setOnClickListener {
            mBinding.mDrawer.openDrawer(GravityCompat.END)

        }
    }

    private fun refreshSearch() {
        fCode = null
        categorySelect = ""
        preCategorySelect = ""
        getMenuFlag = true
        changeFenLeiFlag = true
        brandFlag = true
        mBinding.mSortPriceTV.textColorResource = R.color.gray_text
        mBinding.mAllSoftBTN.textColorResource = R.color.colorAccent
        mBinding.mSortSalesTV.textColorResource = R.color.gray_text
        //处理箭头
        mBinding.mSaleIV.visibility = View.GONE
        mBinding.mPriceIV.visibility = View.GONE
        sortPrice = ""
        sortSales = ""

        //切换左侧菜单的时候 会获取分类 当只有一个分类的时候会赋值给categorySelect 所以切换菜单的时候清空这个值
        mAttrList.forEach {
            it.select = false
        }
        brandSelect = ""
        preBrandSelect = ""
        //清除其他属性(横向和抽屉)
        mAttrList.clear()
        mAttrListDrw.clear()
        mAttrHorizontalAdapter.notifyDataSetChanged()
        mAttrDrawAdapter.notifyDataSetChanged()

        mAttrSelectMap.clear()
        //恢复品牌
        mBinding.mBrandBTN.backgroundResource = R.drawable.bg_solid_gary_light_100dp
        mBinding.mCategoryBTN.backgroundResource = R.drawable.bg_solid_gary_light_100dp
        mBinding.mBrandBTN.textColorResource = R.color.black_color
        mBinding.mCategoryBTN.textColorResource = R.color.black_color
        brandList.forEach {
            it.select = false
        }
        brandAdapter.notifyDataSetChanged()
        pinpaiDrawAdapter.notifyDataSetChanged()
        handlerOtherAttrHorizontalMenu()
        //清除其他属性
        initGoods()
    }

    override fun onResume() {
        super.onResume()
        MyLog.d("刷新了页面数据")
        initGoods()
    }

    private var getMenuFlag = true
    private var changeFenLeiFlag = true


    //获取商品
    private fun getGoods() {
        val map: MutableMap<String, Any?> = HashMap()
        map["brandId"] = brandSelect
        fCode?.let {
            map["fcode"] = fCode
        }
        map["companyId"] = BaseApplication.companyId
        map["query"] = query
        map["sortSales"] = sortSales
        map["sortPrice"] = sortPrice
        map["pageNum"] = page
        map["pageSize"] = 20
        map["ctgnum"] = categorySelect
        map["searchType"] = BuildConfig.GOODS_SEARCH_TYPE
        mAttrSelectMap.forEach {
            map[it.key] = it.value
        }

        ApiMethods.apiSubscribe(ApiMethods.retrofit.getGoodsForSearch(handlerBody(map)), MyObserverHandlerLoading(this, loading) {
            MyLog.d("搜索商品回调回调:$it")
            val entity = getGson().fromJson(it, GoodsByFCodeEntity::class.java).data
            //左侧菜单
            if (getMenuFlag) {
                getMenuFlag = false
                val mMenuList = ArrayList<GoodsByFCodeEntity.DataBean.FcodeVosBean>()

                entity?.fcodeVos?.let { list ->
                    val bean = GoodsByFCodeEntity.DataBean.FcodeVosBean()
                    bean.fcode = ""
                    bean.fname = "全部"
                    bean.select = true
                    mMenuList.add(bean)
                    mMenuList.addAll(list)
                    mBinding.mMenuLeftRV.adapter = GoodsMenuSearchAdapter(this, mMenuList, this)
                    mBinding.mMenuLeftRV.layoutManager = LinearLayoutManager(this)
                }



                if (entity?.brandList == null) {
                    val bean = GoodsByFCodeEntity.DataBean.FcodeVosBean()
                    bean.fcode = ""
                    bean.fname = "全部"
                    bean.select = true
                    mMenuList.add(bean)
                    mBinding.mMenuLeftRV.adapter = GoodsMenuSearchAdapter(this, mMenuList, this)
                    mBinding.mMenuLeftRV.layoutManager = LinearLayoutManager(this)
                }
            }
//            //商品
//            //商品菜单
//            entity?.goodsList?.records?.let { list ->
//                goodsList.addAll(list)
//                mAdapter.notifyDataSetChanged()
//            }


            maxSize = 3
            mBinding.mConfirmBTN.text = "确定(0件商品)"
            if (page == 1) {//刷新后将数据清除
                goodsList.clear()
                mAdapter.notifyDataSetChanged()
            }
            mBinding.mRefresh.over()
            loading.dismiss()
            MyLog.d("商品列表:$it")
            handlerHttpResult(it) {
                val entity = getGson().fromJson(it, GoodsByFCodeEntity::class.java).data
                entity?.goodsList?.let { data ->
                    val count = "确定(${data.total.handlerNull()}件商品)"
                    mBinding.mConfirmBTN.text = count
                }

                if (brandFlag) {
                    brandFlag = false
                    //品牌
                    entity?.brandList?.let { list ->
                        if (list.isNotEmpty()) {
                            //品牌大于一的时候展示品牌按钮
                            mBinding.mBrandBTN.visibility = View.VISIBLE
                            brandList.clear()
                            brandList.addAll(list)
                            brandAdapter.notifyDataSetChanged()
                            pinpaiDrawAdapter.notifyDataSetChanged()
                        } else {
                            brandList.clear()
                            brandAdapter.notifyDataSetChanged()
                            pinpaiDrawAdapter.notifyDataSetChanged()
                            mBinding.mBrandBTN.visibility = View.GONE
                        }
                    }
                }
                //商品菜单
                entity?.goodsList?.records?.let { list ->
                    goodsList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
                if (changeFenLeiFlag) {
                    changeFenLeiFlag = false
                    //分类
                    entity?.categoryVos?.let { list ->
                        if (list.size == 1) {
                            //分类只有一个就隐藏 横向可以多放一个Item
                            maxSize++
                            mBinding.mCategoryBTN.visibility = View.GONE
                            mBinding.mFenLeiTV.visibility = View.GONE
                            mBinding.mFenLeiRV.visibility = View.GONE
                            //将唯一分类设置上去
                            categorySelect = list[0].ctgnum.handlerNull()
                            //按照这个分类去获取后续数据
                            afterCategorySelect()
                        } else {
                            //分类包含多个的处理
                            if (list.isNotEmpty()) {
                                mBinding.mFenLeiTV.visibility = View.VISIBLE
                                mBinding.mFenLeiRV.visibility = View.VISIBLE
                                mBinding.mCategoryBTN.visibility = View.VISIBLE
                                categoryList.clear()
                                categoryList.addAll(list)
                                categoryList.forEach {
                                    if (categorySelect == it.ctgnum) {
                                        it.select = true
                                    }
                                }
                                categoryAdapter.notifyDataSetChanged()
                                fenleiDrawAdapter.notifyDataSetChanged()
                            } else {
                                mBinding.mCategoryBTN.visibility = View.GONE
                            }
                        }
                    }
                }


            }


        })


//        MyLog.d("fcode:${fCode}")
//        loading.show()
//        when {
//            bannerId != -1 -> {
//                mViewModel.getGoodsByBanner(
//                    handlerBody(
//                        "brandId" to brandSelect,
//                        "companyId" to BaseApplication.companyId,
//                        "bannerId" to bannerId,
//                        "query" to query,
//                        "sortSales" to sortSales,
//                        "sortPrice" to sortPrice,
//                        "pageNum" to page,
//                        "pageSize" to size,
//                        "searchType" to BuildConfig.GOODS_SEARCH_TYPE,
//                        "ctgnum" to categorySelect
//                    )
//                )
//            }
//            else -> {
//                val map: MutableMap<String, Any?> = HashMap()
//                map["brandId"] = brandSelect
//                map["companyId"] = BaseApplication.companyId
//                map["fcode"] = fCode
//                map["query"] = query
//                map["sortSales"] = sortSales
//                map["sortPrice"] = sortPrice
//                map["pageNum"] = page
//                map["pageSize"] = size
//                if (mSeriesName.isNotEmpty()){
//                    map["seriesName"] = mSeriesName
//                }
//                map["ctgnum"] = categorySelect
//                map["searchType"] = BuildConfig.GOODS_SEARCH_TYPE
//                mAttrSelectMap.forEach {
//                    map[it.key] = it.value
//                }
//                val body = RequestBody.create(
//                    MediaType.parse("application/json; charset=utf-8"),
//                    getGson().toJson(map)
//                )
//                mViewModel.getGoods(body)
//            }
//
//        }
    }

    //获取商品
    private fun initGoods() {
        page = 1
        getGoods()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null && requestCode == vinResultCode) {
            //接收所有识别结果，图片
            val vinResult = data.getStringExtra("vinResult")
            //接收识别结果的状态码，0表示成功，其他值表示识别失败
            val recogCode = data.getIntExtra("recogCode", -1)
            // 添加结果结合
            val resultListInfo = ResultListInfo()
            if (recogCode == 0) {
                resultListInfo.key = "VIN"
                resultListInfo.value = vinResult
                MyLog.d("扫描出的VIN码:${resultListInfo.value}")
                mBinding.mSearchET.textSet(vinResult.handlerNull())
                query = vinResult.handlerNull()
                initGoods()
            } else {
                resultListInfo.key = "识别失败"
                resultListInfo.value = "图像中未发现VIN码,errorCode:$recogCode"
                MyLog.d("扫描出的VIN码:${resultListInfo.value}")
                showToast("图像中未发现VIN码")
            }
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSION_APPLY_CODE) {
            getVIN()
        }
    }

    private fun getVIN() {
        handlerPermission(TakePhotoPermissions) {
            // 有权限，启动VIN码导入识别页面
            val intent = Intent(this, VinScanActivity::class.java)
            startActivityForResult(intent, vinResultCode)
        }
    }


    override fun onAddTrolleyFCodeListener(goods: GoodsItemEntity) {
        if (goods.stock == "0") {
            showToast("该商品已经没有库存了")
        } else {
            val bean = TrolleyAddGoodsBean(
                goods.stock.handlerNull(),
                goods.images.handlerNull(),
                goods.categoryName.handlerNull(),
                goods.nno.handlerNull(),
                goods.id.handlerNull(),
                goods.nname.handlerNull(),
                goods.salesPrice.handlerNull(),
                BaseApplication.allianceId.handlerNull(),
                goods.description.handlerNull(),
                "0",
                BaseApplication.companyId.handlerNull(),
                BaseApplication.userId,
                goods.specStyle.handlerNull(),
                goods.goodsName.handlerNull(),
                otherSortList = goods.detailVos,
                isSet = goods.isSet,
                buyLimit = goods.buyLimit
            )
            GoodsAddTrolleyDialog(bean, this).show(supportFragmentManager, "")
        }
    }

    override fun addGoodsToTrolley(bean: TrolleyAddGoodsBean) {
        loading.show()
        mViewModel.goodsAddTrolley(bean)
    }

    override fun onPartSortSelect(partId: String) {

    }

    //分类呗点击
    override fun linshiClick(select: Boolean, position: Int) {
        categoryList.forEach {
            it.select = false
        }
        categoryList[position].select = true
        categoryAdapter.notifyDataSetChanged()
        fenleiDrawAdapter.notifyDataSetChanged()
        preCategorySelect = categoryList[position].ctgnum.handlerNull()
    }

    //品牌被点击了
    override fun onBranderClick(select: Boolean, position: Int) {
        MyLog.d("抽屉品牌被点击有选中的了:$position $select")
        brandList.forEach {
            it.select = false
        }
        brandList[position].select = true
        brandAdapter.notifyDataSetChanged()
        pinpaiDrawAdapter.notifyDataSetChanged()
        preBrandSelect = brandList[position].id.handlerNull()
    }

    private var parentPosition = -1

    //其他属性横向列表被点击(主页) 即将弹出下拉框选择胎面宽度等属性 分类点击
    override fun onAttrHorizontalItemClick(position: Int) {
        parentPosition = position
        mCurrentAttrKey = mAttrList[position].id
        val list = mAttrList[position].selectList
        list?.let { l ->
            mAttrChildList.clear()
            mAttrChildList.addAll(l)
            mAttrChildAdapter.notifyDataSetChanged()
            mAttrDrawAdapter.notifyDataSetChanged()
            mAttrPopup?.showAsDropDown(mBinding.mAttrHorizontalRV)
        }
        //记录选中前状态
        actionConfirmFlag = false
        attrChildSelectPositionPre = -1
        attrChildSelectPosition = -1
        for (i in mAttrChildList.indices) {
            if (mAttrChildList[i].select) {
                attrChildSelectPositionPre = i
                MyLog.d("记录上次选中的位置:$attrChildSelectPositionPre")
            }
        }
    }

    //上次选中
    private var attrChildSelectPositionPre = -1

    //本次选中
    private var attrChildSelectPosition = -1
    private var attrChildSelect = true

    //通过确认按钮关闭Popup
    private var actionConfirmFlag = false

    //额外属性列表子单被点击(主页)
    override fun otherAttrChildClick(select: Boolean, position: Int) {
        attrChildSelectPosition = position
        attrChildSelect = select
        MyLog.d("选中的位置2:$attrChildSelectPositionPre")
        val data = mAttrChildList[position]
        mAttrChildList.forEach {
            it.select = false
        }
        data.select = select

        mAttrListDrw[parentPosition].selectList?.forEach {
            it.select = false
        }
        mAttrListDrw[parentPosition].selectList!![position + 1].select = true
        mAttrChildAdapter.notifyDataSetChanged()
        mAttrDrawAdapter.notifyDataSetChanged()
    }

    //抽屉中的分类被点击
    override fun fenleiClick(select: Boolean, position: Int) {
        MyLog.d("有选中的了:$position $select")
        categoryList.forEach {
            it.select = false
        }
        categoryList[position].select = select
        categoryAdapter.notifyDataSetChanged()
        fenleiDrawAdapter.notifyDataSetChanged()
        if (select) {
            categorySelect = categoryList[position].ctgnum.handlerNull()
        } else {
            categorySelect = ""
        }
        initGoods()
        popupDismissHandler()
        preCategorySelect = if (select) {
            categoryList[position].ctgnum.handlerNull()
        } else {
            ""
        }
        afterCategorySelect()
    }

    //抽屉中的品牌
    override fun pinlaiClick(select: Boolean, position: Int) {
        MyLog.d("有选中的了:$position $select")
        brandList.forEach {
            it.select = false
        }
        brandList[position].select = select
        brandAdapter.notifyDataSetChanged()
        pinpaiDrawAdapter.notifyDataSetChanged()
        brandSelect = if (select) {
            brandList[position].id.handlerNull()
        } else {
            ""
        }
        popupDismissHandler()
        preBrandSelect = if (select) {
            brandList[position].id.handlerNull()
        } else {
            ""
        }
        initGoods()
    }

    //抽屉内的其他属性选择了 直接触发搜索
    override fun attrDrawItemCallBack(parentPosition: Int, position: Int, select: Boolean) {
        //清除当前父布局下的所有选中
        mAttrList[parentPosition].selectList?.forEach {
            it.select = false
        }
        mAttrListDrw[parentPosition].selectList?.forEach {
            it.select = false
        }
        //设置选中项
        if (position != 0) {
            //因为没有全部 所以需要-1
            mAttrList[parentPosition].selectList!![position - 1].select = true
        }
        mAttrListDrw[parentPosition].selectList!![position].select = true
        mAttrDrawAdapter.notifyDataSetChanged()
        mAttrChildAdapter.notifyDataSetChanged()
        //根据选中状态修改 选中的map

        //如果是第0个则为全部 则清除选项
        if (position == 0) {
            mAttrSelectMap[mAttrList[parentPosition].id] = ""
        } else {
            mAttrSelectMap[mAttrListDrw[parentPosition].id] = mAttrListDrw[parentPosition].list!![position - 1].handlerNull()
        }
        handlerOtherAttrHorizontalMenu()
        initGoods()
    }

    //抽屉相关 事件
    private fun initDraw() {
        //抽屉确认 按钮 //关闭抽屉
        mBinding.mConfirmBTN.setOnClickListener {
            mBinding.mDrawer.closeDrawer(GravityCompat.END)
        }
        //抽屉 重置 按钮
        mBinding.mResetBTN.setOnClickListener {
            mBinding.mDrawer.closeDrawer(GravityCompat.END)
            Handler().postDelayed({
                //只有一个分类的时候分类不清除
                if (categoryList.size != 1) {
                    categorySelect = ""
                    categoryList.forEach {
                        it.select = false
                    }
                    categoryAdapter.notifyDataSetChanged()
                }
                //恢复所选品牌
                brandSelect = ""
                mAttrList.forEach {
                    it.selectList?.forEach { a ->
                        a.select = false
                    }
                }
                mAttrChildAdapter.notifyDataSetChanged()
                mAttrListDrw.forEach { a ->
                    a.selectList?.forEach { b ->
                        b.select = false
                    }
                    a.selectList!![0].select = true
                }
                mAttrDrawAdapter.notifyDataSetChanged()
                mAttrSelectMap.clear()

                brandList.forEach {
                    it.select = false
                }
                brandAdapter.notifyDataSetChanged()
                popupDismissHandler()
                initGoods()
            }, 200)
        }
    }

    //是否重新获取品牌 当点击右侧分类和顶部搜索的时候重置品牌
    var brandFlag = true
    override fun leftMenuSelect(fcode: String) {
        brandFlag = true
        changeFenLeiFlag = true
        if (fcode == "-1") {
            this.fCode = null
        } else {
            this.fCode = fcode
        }
        //切换左侧菜单的时候 会获取分类 当只有一个分类的时候会赋值给categorySelect 所以切换菜单的时候清空这个值
        categorySelect = ""
        preCategorySelect = ""
        mAttrList.forEach {
            it.select = false
        }
        brandSelect = ""
        preBrandSelect = ""
        //清除其他属性(横向和抽屉)
        mAttrList.clear()
        mAttrListDrw.clear()
        mAttrHorizontalAdapter.notifyDataSetChanged()
        mAttrDrawAdapter.notifyDataSetChanged()

        mAttrSelectMap.clear()
        //恢复品牌
        mBinding.mBrandBTN.backgroundResource = R.drawable.bg_solid_gary_light_100dp
        mBinding.mCategoryBTN.backgroundResource = R.drawable.bg_solid_gary_light_100dp
        mBinding.mBrandBTN.textColorResource = R.color.black_color
        mBinding.mCategoryBTN.textColorResource = R.color.black_color

        brandList.forEach {
            it.select = false
        }
        brandAdapter.notifyDataSetChanged()
        pinpaiDrawAdapter.notifyDataSetChanged()
        handlerOtherAttrHorizontalMenu()
        //清除其他属性
        initGoods()
    }
}
package com.android.ctgapp.activity.home.shop

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.home.BranderSelectAdapter
import com.android.ctgapp.adapter.home.GoodsByVinAdapter
import com.android.ctgapp.adapter.home.GoodsMenuVinAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityVulnerablePartShopBinding
import com.android.ctgapp.entity.home.GoodsByVinEntity
import com.android.ctgapp.entity.home.TrolleyAddGoodsBean
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.GoodsAddTrolleyDialog
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_vulnerable_part_shop.*
import kotlinx.android.synthetic.main.activity_vulnerable_part_shop.mBackIV
import kotlinx.android.synthetic.main.activity_vulnerable_part_shop.mGoodsRV
import kotlinx.android.synthetic.main.activity_vulnerable_part_shop.mMenuRV
import kotlinx.android.synthetic.main.activity_vulnerable_part_shop.mRefresh
import kotlinx.android.synthetic.main.activity_vulnerable_part_shop.mSortPriceTV
import kotlinx.android.synthetic.main.activity_vulnerable_part_shop.mSortSalesTV
import kotlinx.android.synthetic.main.activity_vulnerable_part_shop.mTrolleyIV
import kotlinx.android.synthetic.main.item_brander_select_popup.view.*
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 2020/11/4
 *描述: VIN码商城 页面
 */
class VulnerablePartShopActivity : BaseActivityV2(), GoodsMenuVinAdapter.MenuVinListener, GoodsByVinAdapter.GoodsByVinListener, GoodsAddTrolleyDialog.AddTrolley, BranderSelectAdapter.BranderSelectCallback {
    private val mViewModel: VulnerablePartShopViewModel by lazy { ViewModelProvider(this)[VulnerablePartShopViewModel::class.java] }
    private val mBinding by lazy { ActivityVulnerablePartShopBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    //配件ID
    private val vin: String by lazy { intent.getStringExtra(MyConstants.VIN_CODE) }
    private var page = 1
    private var size = 20
    private val goodsList = ArrayList<GoodsByVinEntity.DataBean.GoodsDetailVoPageBean.RecordsBean>()
    private val menuList = ArrayList<GoodsByVinEntity.DataBean.FcodeVOListBean>()
    private val mGoodsAdapter: GoodsByVinAdapter by lazy { GoodsByVinAdapter(this, goodsList, this) }
    private val mMenuAdapter: GoodsMenuVinAdapter by lazy { GoodsMenuVinAdapter(this, menuList, this) }

    //品牌筛选
    private val mBrandIdList = ArrayList<GoodsByVinEntity.DataBean.BrandVOSListBean>()

    //品牌筛选选中的list
    private val mBrandSelectList = ArrayList<Int>()
    private val mBranderSelectAdapter by lazy { BranderSelectAdapter(this, mBrandIdList, this) }
    //搜索商品 标志位 之前为fcode现替换为ctgnum
    private var ctgnum = ""

    //销量排序 需要排序则传1 默认销量排序
    private var sortSales = ""

    //价格排序 需要排序则传1
    private var sortPrice = ""

    //设置
    private var menuPopup: PopupWindow? = null

    //搜索框
    private var query = ""
    private var canRefresh = true

    //获取商品
    private fun getGoods() {
        loading.show()
        //清空选中列表
        mBrandSelectList.clear()
        //将当前选中的数据加入集合
        mBrandIdList.forEach {
            if (it.select) {
                mBrandSelectList.add(it.brandId)
            }
        }
        //替换掉上次选中的数据
        mViewModel.getGoods(vin, ctgnum, query, sortSales, sortPrice, page, size, mBrandSelectList)
    }

    override fun event() {
        mBinding.mSearchET.textSet(vin)
        mGoodsRV.adapter = mGoodsAdapter
        mGoodsRV.layoutManager = LinearLayoutManager(this)
        mMenuRV.adapter = mMenuAdapter
        mMenuRV.layoutManager = LinearLayoutManager(this)
        mCarIntroTV.text = intent.getStringExtra(MyConstants.CAR_INTRO).handlerNull()
        val carLogo = intent.getStringExtra(MyConstants.CAR_ICON)
        Glide.with(this).load(carLogo).into(mCarIconIV)

        mViewModel.error.observe(this, Observer {
            mRefresh.over()
            loading.dismiss()
            showToast(it)
        })

        mViewModel.goodResult.observe(this, Observer {
            mRefresh.over()
            loading.dismiss()
            handlerHttpResult(it) {
                val entity = getGson().fromJson(it, GoodsByVinEntity::class.java).data
                entity?.fcodeVOList?.let { list ->
                    //初始化左侧菜单
                    if (menuList.isEmpty()) {
                        menuList.clear()
                        val item = GoodsByVinEntity.DataBean.FcodeVOListBean()
                        item.isSelect = true
                        item.ctgnum = ""
                        item.fname = "全部"
                        menuList.add(item)
                        menuList.addAll(list)
                        mMenuAdapter.notifyDataSetChanged()
                    }
                }
                //商品菜单
                entity?.goodsDetailVoPage?.records?.let { list ->
                    goodsList.addAll(list)
                    mGoodsAdapter.notifyDataSetChanged()
                }
                //品牌列表
                entity?.brandVOSList?.let { list ->
                    if (canRefresh) {
                        mBrandIdList.clear()
                        mBrandIdList.addAll(list)
                        mBranderSelectAdapter.notifyDataSetChanged()
                        canRefresh = false
                    }
                }
            }
        })

        mViewModel.addTrolleyResult.observe(this, {
            mRefresh.over()
            loading.dismiss()
            val data = initData(it)
            if (data.status == 0) {
                showToast("添加购物车成功")
            } else {
                showToast(data.msg)
            }
        })
    }

    override fun click() {
        //销量排序
        mSortSalesTV.setOnClickListener {
            if (sortSales == "") {
                sortSales = "1"
                sortPrice = ""
                mSortPriceTV.textColorResource = R.color.gray_text
                mSortSalesTV.textColorResource = R.color.colorAccent
                initGoods()
            }
        }
        //价格排序
        mSortPriceTV.setOnClickListener {
            if (sortPrice == "") {
                sortSales = ""
                sortPrice = "1"
                mSortSalesTV.textColorResource = R.color.gray_text
                mSortPriceTV.textColorResource = R.color.colorAccent
                initGoods()
            }
        }
        //上拉加载
        mRefresh.setOnLoadMoreListener {
            page++
            getGoods()
        }
        //下拉刷新
        mRefresh.setOnRefreshListener {
            initGoods()
        }
        mBackIV.setOnClickListener {
            finish()
        }
        //进入购物车
        mTrolleyIV.setOnClickListener {
            startActivity<TrolleyActivity>()
        }

        val menuView = LayoutInflater.from(this).inflate(R.layout.item_brander_select_popup_old, null, false)
        menuPopup = PopupWindow(menuView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, true)
        //设置背景透
        menuPopup?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        menuView.mBrandRV.adapter = mBranderSelectAdapter
        menuView.mBrandRV.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        //底部半透明蒙版(取消)
        menuView.mBottomRL.setOnClickListener {
            menuPopup?.dismiss()
        }
        menuPopup?.setOnDismissListener {
            mArrowIV.imageResource = R.drawable.ic_arrow_grey_down
        }
        //重置
        menuView.mResetBTN.setOnClickListener {
            mBrandIdList.forEach {
                it.select = false
            }
            mBranderSelectAdapter.notifyDataSetChanged()
        }
        //确认
        menuView.mConfirmBTN.setOnClickListener {
            initGoods()
            menuPopup?.dismiss()
        }

        //点击品牌
        mBrandLL.setOnClickListener {
            mArrowIV.imageResource = R.drawable.ic_arrow_grey_up
            //将选中设置为全部未选中
            mBrandIdList.forEach {
                it.select = false
            }
            //恢复上次的选中状态
            mBrandSelectList.forEach { id ->
                mBrandIdList.forEach { a ->
                    if (a.brandId == id) {
                        a.select = true
                    }
                }
            }
            mBranderSelectAdapter.notifyDataSetChanged()
            if (mBrandIdList.isNotEmpty()) {
                menuPopup?.showAsDropDown(mBrandLL)
            }
        }
        mBinding.mSearchET.handlerEditTextSearch(this) {
            if (it.isNotEmpty()) {
                query = it
                initGoods()
            } else {
                showToast("请输入需要搜索的内容")
            }
        }
        mBinding.mSearchET.handlerText {
            if (it.isEmpty()) {
                query=""
                initGoods()
            }
        }


    }

    override fun onResume() {
        super.onResume()
        initGoods()
    }

    //获取商品
    private fun initGoods() {
        goodsList.clear()
        page = 1
        getGoods()
    }


    override fun onAddTrolleyVinListener(goods: GoodsByVinEntity.DataBean.GoodsDetailVoPageBean.RecordsBean) {
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
                BaseApplication.allianceId.handlerNull(),
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

    override fun onBrandClick(select: Boolean, position: Int) {
        mBrandIdList[position].select = select
        mBranderSelectAdapter.notifyDataSetChanged()
    }

    //侧边目录选择
    override fun itemSelect(ctgnum: String) {
        canRefresh = true
        mBrandSelectList.clear()
        mBrandIdList.clear()
        mBranderSelectAdapter.notifyDataSetChanged()
        this.ctgnum = ctgnum
        initGoods()
    }
}
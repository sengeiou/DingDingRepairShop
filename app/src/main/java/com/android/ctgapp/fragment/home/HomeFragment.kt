package com.android.ctgapp.fragment.home

import android.Manifest
import android.content.Context
import android.content.Intent
import android.graphics.Point
import android.os.Bundle
import android.view.*
import android.view.inputmethod.InputMethodManager
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.home.VinSearchActivity
import com.android.ctgapp.activity.home.enquiry.VinSearchHistoryActivity
import com.android.ctgapp.activity.home.shop.GoodsDetailActivity
import com.android.ctgapp.activity.home.shop.PartShopActivity
import com.android.ctgapp.activity.home.shop.SearchGoodsActivity
import com.android.ctgapp.activity.home.shop.TrolleyActivity
import com.android.ctgapp.adapter.home.HomeBottomMenuAdapter
import com.android.ctgapp.adapter.home.HotGoodsAdapter
import com.android.ctgapp.adapter.home.NotifyTextViewAdapter
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseFragmentV2
import com.android.ctgapp.databinding.FragmentHomeBinding
import com.android.ctgapp.entity.home.*
import com.android.ctgapp.enum.EasilyDamagedPartsEnum
import com.android.ctgapp.event.HomeFragmentRefresh
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserverHandlerLoading
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.GoodsAddTrolleyDialog
import com.android.ctgapp.widget.dialog.SuccessDialog
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.ocrgroup.activity.VinScanActivity
import com.permissionx.guolindev.PermissionX
import com.youth.banner.adapter.BannerImageAdapter
import com.youth.banner.holder.BannerImageHolder
import com.youth.banner.indicator.CircleIndicator
import com.youth.banner.listener.OnBannerListener
import me.bakumon.library.view.BulletinView
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.jetbrains.anko.startActivity


/**
 *作者:LiBW
 *创建日期: 2020/9/29
 *描述: 首页 Fragment
 */
class HomeFragment : BaseFragmentV2(), BulletinView.OnBulletinItemClickListener, OnBannerListener<BannerEntity.DataBean>, HotGoodsAdapter.HotGoodsListener, GoodsAddTrolleyDialog.AddTrolley, MainActivity.MyOnTouchListener, View.OnTouchListener, HomeBottomMenuAdapter.HomeBottomMenuAdapterListener {
    private var _binding: FragmentHomeBinding? = null
    private val mBinding get() = _binding!!

    override fun getLayout(inflater: LayoutInflater, container: ViewGroup?): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    private val mViewModel: HomeFragmentViewModel by lazy { ViewModelProvider(requireActivity())[HomeFragmentViewModel::class.java] }

    //VIN码软键盘
    private val vinKeyboardUtil by lazy { VinKeyboardUtil(requireActivity(), mBinding.mVINSearchET) }

    //接收识别结果返回码
    private val vinResultCode = 101

    //广告轮播
    private val bannerUrlList = ArrayList<BannerEntity.DataBean>()

    //热销图 适配器
    private val mList = ArrayList<GoodsItemEntity>()
    private val mAdapter by lazy { HotGoodsAdapter(requireActivity(), mList, this) }


    //通知轮播
    private val shufflingList = ArrayList<String>()
    private var bannerId = -1
    fun refreshPage() {
        MyLog.d("我来刷新了 通知和banner")
        //获取消息通知
        mViewModel.getNotice()
        //获取轮播图
        mViewModel.getBanner()
    }

    override fun onResume() {
        super.onResume()
        //获取热销商品
        mViewModel.getHotGoods()
        //获取品牌
        getBottomMenu()
    }

    override fun event() {
        //先隐藏商品搜索
        mBinding.mGoodsContainer.visibility=View.GONE

        EventBus.getDefault().register(this)
        //获取消息通知
        mViewModel.getNotice()
        //将缓存的banner用作播放
        val cacheBanners = sharedGet(MyConstants.BANNER, "") as String
        if (cacheBanners.isNotEmpty()) {
            initBanner(cacheBanners)
        }
        //获取轮播图
        mViewModel.getBanner()
        mViewModel.noticeResult.observe(this, {
            MyLog.d("消息的回调:$it")
            requireActivity().handlerHttpResult(it) {
                val data = getGson().fromJson(it, NoticeEntityV2::class.java).data
                shufflingList.clear()
                data?.let { list ->
                    list.forEach { item ->
                        shufflingList.add(item.noticeText.handlerNull())
                    }
                    it.sharedSave(MyConstants.NOTICE)
                }
                if (shufflingList.isNotEmpty()) {
                    mBinding.mNoticeLL.visibility = View.VISIBLE
                    initShuffling()
                } else {
                    mBinding.mNoticeLL.visibility = View.GONE
                }
            }
        })
        //添加购物车回调
        mViewModel.addTrolleyResult.observe(this, {
            loading.dismiss()
            val data = initData(it)
            if (data.status == 0) {
                showToast("添加购物车成功")
            } else {
                showToast(data.msg)
            }
        })

        mViewModel.hotGoodsResult.observe(this, {
            MyLog.d("热销商品回调:$it")
            requireActivity().handlerHttpResult(it) {
                val data = getGson().fromJson(it, HotGoodsEntity::class.java).data
                data?.let { list ->
                    mBinding.mHotGoodsTV.visibility = View.VISIBLE
                    mBinding.mHotGoodsTV.visibility = if (list.isEmpty()) View.GONE else View.VISIBLE
                    mList.clear()
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
        })

        mViewModel.error.observe(this, {
            loading.dismiss()
            requireActivity().showToast(it)
        })

        mViewModel.bannerResult.observe(this, {
            loading.dismiss()
            requireActivity().handlerHttpResult(it) {
                initBanner(it)
            }
        })

        mViewModel.goodByBannerResult.observe(this, {
            loading.dismiss()
            requireActivity().handlerHttpResult(it) {
                val entity = getGson().fromJson(it, GoodsByFCodeEntity::class.java).data
                entity?.let {
                    when (entity.goodsList?.records?.size) {
                        1 -> {
                            //一件商品直接进入详情页
                            requireActivity().startActivity<GoodsDetailActivity>(MyConstants.PART_ID to entity.goodsList!!.records!![0].id)
                        }
                        0 -> {
                            //没有商品不做反应
                        }
                        else -> {
                            //多个商品进入列表
                            requireActivity().startActivity<PartShopActivity>(MyConstants.BANNER_ID to bannerId)
                        }
                    }
                }
            }
        })

        mBinding.mHotGoodsRV.adapter = mAdapter
        mBinding.mHotGoodsRV.layoutManager = GridLayoutManager(requireActivity(), 2, GridLayoutManager.VERTICAL, false)
    }

    private fun initBanner(it: String) {
        val entity = getGson().fromJson(it, BannerEntity::class.java).data
        val array = ArrayList<BannerEntity.DataBean>()
        if (BuildConfig.APPLICATION_ID == MyConstants.APPLICATION_ID_CTG) {
            val bean = BannerEntity.DataBean()
            bean.picLinkUrl = R.drawable.img_banner_dingding
            array.add(bean)
        }
        //如果有图片地址则重新下载图片
        bannerUrlList.clear()
        //汽配钉钉添加固定Banner到第一个
        bannerUrlList.addAll(array)
        entity?.let { list ->
            bannerUrlList.addAll(list)
        }
        if (bannerUrlList.isNotEmpty()) {
            MyLog.d("缓存Banner图")
            //缓存Banner图到本地下次使用
            it.sharedSave(MyConstants.BANNER)
            mBinding.mBanner.visibility = View.VISIBLE
            initBanner()
        } else {
            mBinding.mBanner.visibility = View.GONE
        }
        mBinding.mBanner.setOnBannerListener(this)
    }


    override fun click() {
        mBinding.mGoodsSearchET.handlerEditTextSearch(requireActivity()){
            if (it.isNotEmpty()){
                requireActivity().startActivity<SearchGoodsActivity>(MyConstants.GOODS_NAME to it)
            }else{
                showToast("请输入搜索内容")
                mBinding.mGoodsSearchET.myShake()
            }
        }


        mBinding.mTabLayout.handlerSelectReturnText {
          when(it){
              "VIN"->{
                  mBinding.mGoodsContainer.visibility=View.GONE
                  mBinding.mVinContainer.visibility=View.VISIBLE
                  val imm = requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                  imm.hideSoftInputFromWindow(requireActivity().window.decorView.windowToken, 0)
              }
              "商品"->{
                  mBinding.mGoodsContainer.visibility=View.VISIBLE
                  mBinding.mVinContainer.visibility=View.GONE
              }
          }
        }


        mBinding.mVINSearchET.handlerText {
            if (it.isNotEmpty() && !vinKeyboardUtil.isShow) {
                vinKeyboardUtil.showKeyboard()
            }
            mBinding.mInputCountTV.text = it.length.handlerNull()
        }

        //TODO VIN 测试
        if (BoWenUtils.isDEBUG()) {
//            mBinding.mVINSearchET.textSet("LGBF1CE035R111249")
//            mBinding.mVINSearchET.textSet("LGBF5DE0XDR020410")
//            mBinding.mVINSearchET.textSet("LHGRB3867B8000731")
            mBinding.mVINSearchET.textSet("LHGFS1653L2047826")
        }

        //隐藏系统软键盘
        vinKeyboardUtil.hideSoftInputMethod()
        mBinding.mVINSearchET.setOnClickListener {
            if (!vinKeyboardUtil.isShow) vinKeyboardUtil.showKeyboard()
        }
        //当输入框获得焦点的时候展示自定义软键盘
        mBinding.mVINSearchET.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus && !vinKeyboardUtil.isShow) {
                vinKeyboardUtil.showKeyboard()
            }
        }
        //VIN扫描
        mBinding.mScanVIN.setOnClickListener {
            getVIN()
        }
        //轮胎
        mBinding.mTireIV.setOnClickListener {
            requireActivity().startActivity<PartShopActivity>(MyConstants.PART_ID to EasilyDamagedPartsEnum.TIRE.partId)
        }
        //刹车片
        mBinding.mBrakePadIV.setOnClickListener {
            requireActivity().startActivity<PartShopActivity>(MyConstants.PART_ID to EasilyDamagedPartsEnum.BRAKE_PAD.partId)
        }
        //点火系
        mBinding.mIgnitionIV.setOnClickListener {
            requireActivity().startActivity<PartShopActivity>(MyConstants.PART_ID to EasilyDamagedPartsEnum.IGNITION.partId)
        }
        //电瓶
        mBinding.mBatteryIV.setOnClickListener {
            requireActivity().startActivity<PartShopActivity>(MyConstants.PART_ID to EasilyDamagedPartsEnum.BATTERY.partId)
        }
        //油品
        mBinding.mOilIV.setOnClickListener {
            requireActivity().startActivity<PartShopActivity>(MyConstants.PART_ID to EasilyDamagedPartsEnum.OIL.partId)
        }
        //滤清器
        mBinding.mFilterIV.setOnClickListener {
            requireActivity().startActivity<PartShopActivity>(MyConstants.PART_ID to EasilyDamagedPartsEnum.FILTER.partId)
        }
        //照明系统
        mBinding.mLightIV.setOnClickListener {
            requireActivity().startActivity<PartShopActivity>(MyConstants.PART_ID to EasilyDamagedPartsEnum.LIGHT.partId)
        }
        //更多
        mBinding.mMoreIV.setOnClickListener {
//            requireActivity().showToast("该功能暂未开放")
            requireActivity().startActivity<PartShopActivity>(MyConstants.PART_ID to EasilyDamagedPartsEnum.MORE.partId)
        }
        //VIN历史记录
        mBinding.mSearchHistoryLL.setOnClickListener {
            requireActivity().startActivity<VinSearchHistoryActivity>()
        }

        //自定义键盘确认键 VIN 搜索
        vinKeyboardUtil.setListener(object : VinKeyboardUtil.MyKeyBoardCallback {
            override fun onConfirmClick() {
                val it = mBinding.mVINSearchET.text.handlerNull()
                MyLog.d("点击确认了")
                if (it.isNotEmpty()) {
                    //正则判断VIN码是否符合标准
//                    val regex="/^[A-Z\\d]{17}\$/".toRegex()
//                    val  isOk=regex.containsMatchIn(it)
//                    if (isOk){
                    requireActivity().startActivity<VinSearchActivity>(MyConstants.VIN_CODE to it)
                    vinKeyboardUtil.hideKeyboard()
//                    }else{
//                        showToast("请输入符合要求的VIN码")
//                    }
                } else {
                    showToast("请输入Vin码")
                }
            }
        })
        mBinding.mTrolleyIV.setOnClickListener {
            requireActivity().startActivity<TrolleyActivity>()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (requireActivity() as MainActivity).setListener(this)
    }

    private fun getVIN() {
        val permissions = arrayOf(Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE)
        PermissionX.init(this).permissions(*permissions)
            .onExplainRequestReason { scope, deniedList ->
                val message = "需要您同意以下权限才能正常使用"
                scope.showRequestReasonDialog(deniedList, message, "确定", "取消")
            }
            //被用户永久拒绝的权限
            .onForwardToSettings { _, unSelect ->
                MyPermissionUtil.jumpToPermissionDialog(unSelect, requireActivity())
            }
            .request { allGranted, _, _ ->
                if (allGranted) {
                    // 有权限，启动VIN码导入识别页面
                    val intent = Intent(requireActivity(), VinScanActivity::class.java)
                    startActivityForResult(intent, vinResultCode)
                } else {
                    showToast("请开启相机的相应权限")
                }
            }
    }

    //初始化轮播器
    private fun initBanner() {
        mBinding.mBanner.addBannerLifecycleObserver(this)
            .setAdapter(object : BannerImageAdapter<BannerEntity.DataBean>(bannerUrlList) {
                override fun onBindView(holder: BannerImageHolder?, data: BannerEntity.DataBean?, position: Int, size: Int) {
                    holder?.let {
//                        MyLog.d("出来吧你这个小东西:${getGson().toJson(data)}")
                        Glide.with(holder.itemView).load(data?.picLinkUrl).apply(
                            RequestOptions.bitmapTransform(RoundedCorners(30))
                        ).into(holder.imageView)
                    }
                }
            }).indicator = CircleIndicator(requireContext())
    }

    //初始化轮播器
    private fun initShuffling() {
        mBinding.mBulletinView.setAdapter(NotifyTextViewAdapter(requireContext(), shufflingList))
        mBinding.mBulletinView.setOnBulletinItemClickListener(this)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSION_APPLY_CODE) {
            getVIN()
        }
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
                mBinding.mVINSearchET.textSet(vinResult)
                requireActivity().startActivity<VinSearchActivity>(MyConstants.VIN_CODE to vinResult)
            } else {
                resultListInfo.key = "识别失败"
                resultListInfo.value = "图像中未发现VIN码,errorCode:$recogCode"
                requireActivity().showToast("图像中未发现VIN码")
            }
        }
    }

    //通知条目 点击事件
    override fun onBulletinItemClick(position: Int) {
        MyLog.d("通知点击了:${shufflingList[position]}")
    }

    //轮播图点击事件
    override fun OnBannerClick(data: BannerEntity.DataBean?, position: Int) {
        data?.let {
            mViewModel.getGoodsByBanner(
                handlerBody(
                    "companyId" to data.companyId,
                    "bannerId" to data.id,
                    "query" to "",
//                    "sortSales" to "1",
//                    "sortPrice" to "sortPrice",
                    "pageNum" to 1,
                    "pageSize" to 15,
                    "searchType" to BuildConfig.GOODS_SEARCH_TYPE,
                )
            )
            bannerId = data.id
        }
    }

    //点击购物车
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
            GoodsAddTrolleyDialog(bean, this).show(requireActivity().supportFragmentManager, "")
        }
    }

    override fun addGoodsToTrolley(bean: TrolleyAddGoodsBean) {
        loading.show()
        mViewModel.goodsAddTrolley(bean)
    }

    override fun onPartSortSelect(partId: String) {

    }

    //触摸输入框弹出自定义键盘
    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if (v!!.id == R.id.mSearchET) {
            //触摸弹出软键盘
        } else {
            if (vinKeyboardUtil.isShow) vinKeyboardUtil.hideKeyboard()
        }
        v.performClick()
        return false
    }

    override fun onTouch(ev: MotionEvent?) {
        MyLog.d("确实是传递过来了么")
        if (vinKeyboardUtil.isShow) {
            vinKeyboardUtil.hideKeyboard()
        }
    }

    private var cha = 0


    override fun onDispatch(ev: MotionEvent?) {
        if (cha == 0) {
            //动态计算键盘高度
            val point = Point()
            requireActivity().windowManager.defaultDisplay.getSize(point)
            //TODO 时而能获取到高度时而获取不到 暂时写死
            cha = point.y - 600 - 55f.toPx(requireContext())

            //屏幕高度-键盘高度-底部导航高度 预留5dp误差
//            cha = point.y - vinKeyboardUtil.getKeyBoardHeight() - 55f.toPx(requireContext())
//            MyLog.d("键盘高度:${vinKeyboardUtil.getKeyBoardHeight()}")
//            val  h=mBinding.mVinKeyboardView.measuredHeight
//            MyLog.d("键盘高度h:${h}")


//            mBinding.mVinKeyboardView.viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
//                override fun onGlobalLayout() {
//                    mBinding.mVinKeyboardView.viewTreeObserver.removeOnGlobalLayoutListener(this)
//                    val h1 = mBinding.mVinKeyboardView.measuredHeight
//                    MyLog.d("键盘高度h1:${h1}")
//                    cha = point.y - h1 - 55f.toPx(requireContext())
//                }
//            })
        }
        ev?.y?.let {
            if (it < cha && vinKeyboardUtil.isShow) {
                vinKeyboardUtil.hideKeyboard()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
        _binding = null
    }


    //多余13个的收起状态 展示11个外加展开
    private val menuListLess = ArrayList<BottomBrandMenuEntity.DataBean>()

    //多余13个的展开状态 展示所有外加收起
    private val menuListMore = ArrayList<BottomBrandMenuEntity.DataBean>()

    //展示的List
    private var menuList = ArrayList<BottomBrandMenuEntity.DataBean>()

    //折叠状态
    private var foldStatue = false
    private fun getBottomMenu() {
        ApiMethods.apiSubscribe(ApiMethods.retrofit.homeBrandMenu(), MyObserverHandlerLoading(requireActivity(), loading) {
            MyLog.d("品牌分类回调:$it")
            val data = getGson().fromJson(it, BottomBrandMenuEntity::class.java).data
            if (data == null) {
                mBinding.mBrandTV.visibility = View.GONE
                mBinding.mBrandRV.visibility = View.GONE
            } else {
                mBinding.mBrandTV.visibility = View.VISIBLE
                mBinding.mBrandRV.visibility = View.VISIBLE
            }

            data?.let { list ->
                if (list.isEmpty()) {
                    mBinding.mBrandTV.visibility = View.GONE
                    mBinding.mBrandRV.visibility = View.GONE
                } else {
                    mBinding.mBrandTV.visibility = View.VISIBLE
                    mBinding.mBrandRV.visibility = View.VISIBLE
                }
                menuList.clear()
                menuListLess.clear()
                menuListMore.clear()
                //如果是12个以下就直接放进去
                if (list.size < 13) {
                    menuList.addAll(list)
                } else {
                    //大于12个就先放11个进去后面弄成展开折叠
                    list.forEachIndexed { index, dataBean ->
                        if (index < 11) {
                            //加进去11个
                            menuListLess.add(dataBean)
                        }
                    }
                    menuListMore.addAll(list)

                    //单独添加
                    val needMore = BottomBrandMenuEntity.DataBean()
                    needMore.logo = R.drawable.icon_show_more
                    needMore.fname = "展开更多"
                    menuListLess.add(needMore)

                    val needLess = BottomBrandMenuEntity.DataBean()
                    needLess.fname = "收起"
                    needLess.logo = R.drawable.icon_show_more
                    menuListMore.add(needLess)

                    menuList = if (foldStatue) menuListMore else menuListLess
                }
                mBinding.mBrandRV.adapter = HomeBottomMenuAdapter(requireActivity(), menuList, this)
                mBinding.mBrandRV.layoutManager = GridLayoutManager(requireActivity(), 4, GridLayoutManager.VERTICAL, false)
            }
        })
    }

    override fun showMore() {
        foldStatue = true
        menuList = menuListMore
        mBinding.mBrandRV.adapter = HomeBottomMenuAdapter(requireActivity(), menuList, this)
        mBinding.mBrandRV.layoutManager = GridLayoutManager(requireActivity(), 4, GridLayoutManager.VERTICAL, false)
    }

    override fun showLess() {
        foldStatue = false
        menuList = menuListLess
        mBinding.mBrandRV.adapter = HomeBottomMenuAdapter(requireActivity(), menuList, this)
        mBinding.mBrandRV.layoutManager = GridLayoutManager(requireActivity(), 4, GridLayoutManager.VERTICAL, false)
    }

    @Subscribe
    fun eventBus(refresh: HomeFragmentRefresh) {
        when (refresh.type) {
            1 -> {
//                MyLog.d("刷新热销商品")
//                //创建订单的时候刷新热销商品
//                mViewModel.getHotGoods()
            }

            3 -> {
                //切换公司后刷新通知和品牌
                MyLog.d("刷新品牌分类")
                //获取品牌
                getBottomMenu()
                //获取消息通知
                mViewModel.getNotice()
            }
        }
    }
}
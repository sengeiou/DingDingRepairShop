package com.android.ctgapp.activity.home.shop

import android.app.AlertDialog
import android.app.Dialog
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.view.ViewTreeObserver
import android.view.WindowManager
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.widget.NestedScrollView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.adapter.home.BannerImageAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.entity.home.GoodsDetailBean
import com.android.ctgapp.entity.home.GoodsDetailEntity
import com.android.ctgapp.entity.home.TrolleyAddGoodsBean
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.GoodsAddTrolleyDialog
import com.bumptech.glide.Glide
import com.youth.banner.holder.BannerImageHolder
import com.youth.banner.indicator.CircleIndicator
import kotlinx.android.synthetic.main.activity_goods_detail.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 2020/11/2
 *描述: 商品详情 页面
 */
class GoodsDetailActivity : BaseActivity(), GoodsAddTrolleyDialog.AddTrolley {
    override fun getLayout() = R.layout.activity_goods_detail
    private val mViewModel: GoodsDetailViewModel by lazy { ViewModelProvider(this)[GoodsDetailViewModel::class.java] }

    //配件ID
    private val partId: String by lazy { intent.getStringExtra(MyConstants.PART_ID) }
    private var entity: GoodsDetailBean? = null

    private var detailPosition = 0

    private var canScroll = true
    private val delayTime = 500L
    private val handler = Handler()
    override fun event() {
        mBanner.viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
            override fun onGlobalLayout() {
                mBanner.viewTreeObserver.removeOnGlobalLayoutListener(this)
                val w = mBanner.measuredWidth
                val params=LinearLayout.LayoutParams(w,w)
                mBanner.layoutParams=params
            }
        })


        changeStatusIconColor(false)
        loading.show()
        //获取商品详情
        mViewModel.getGoodsDetail(partId)
        mViewModel.error.observe(this,  {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })
        mViewModel.goodsResult.observe(this,  {
            loading.dismiss()
            handlerHttpResult(it) {
                entity = getGson().fromJson(it, GoodsDetailEntity::class.java).data
                entity?.let { data ->
                    mBanner.addBannerLifecycleObserver(this)
                        .setAdapter(object : BannerImageAdapter<String>(data.imgs) {
                            override fun onBindView(holder: BannerImageHolder?, data: String?, position: Int, size: Int) {
                                holder?.let {
                                    Glide.with(holder.itemView).load(data).into(holder.imageView)
                                }
                            }
                        }).indicator = CircleIndicator(this)
                    mPriceTV.text = data.salesPrice.handlerNull()
                    val stock = "库存${data.stock.handlerNull()}件"
                    mGoodsInventoryTV.text = stock
                    //已选择
                    mSelectTV.text = data.nname.handlerNull()
                    //分类
                    mGoodsClassTV.text = data.categoryName.handlerNull()
                    mBrandNameTV.text = data.brandName.handlerNull()
                    //型号
                    val model = "${data.spec.handlerNull()}  ${data.specStyle.handlerNull()}"
                    mGoodsTypeTV.text = model
                    //旧接口 warehouse 现在跟PC统一加个字段
//                    mGoodsStorageTV.text = data.warehouseName.handlerNull()
//                    mGoodsNameTV.text = data.nname.handlerNull()
                    mGoodsNameTV.text = data.goodsName.handlerNull()
                    mGoodsInfoTV.text = data.nno.handlerNull()
                    if (data.sales.handlerNull().isNotEmpty()) {
                        val sellCount = "已售${data.sales.handlerNull()}件"
                        mSellCountTV.text = sellCount
                    } else {
                        mSellCountTV.text = "已售0件"
                    }

                    data.detailImgs?.let { images ->
                        repeat(images.size) { index ->
                            val image = ImageView(this)
                            val params = LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                            )
                            params.bottomMargin = 10f.toPx(this)
                            image.layoutParams = params
                            val url = images[index]
                            Glide.with(this).load(url.trim()).
                                error(R.drawable.logo_app_gray)
                            .into(image)
                            mImageContainerLL.addView(image)
                        }
                    }
                }
            }
        })

        //添加购物车回调
        mViewModel.addTrolleyResult.observe(this, Observer {
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


    override fun click() {
        handler.postDelayed({
            //延时获取滑到详情的坐标
            val location = IntArray(2)
            mDetailLL.getLocationOnScreen(location)
            detailPosition = location[1] - mTitleBar.height
        }, delayTime)

        val dialog: Dialog = AlertDialog.Builder(applicationContext, R.style.TransparentWindowBg)
            .create()
        val window = dialog.window
        val params: WindowManager.LayoutParams = window!!.attributes
        params.gravity = Gravity.BOTTOM
        params.width = WindowManager.LayoutParams.WRAP_CONTENT
        params.height = WindowManager.LayoutParams.WRAP_CONTENT
        window.attributes = params
        window.setType(WindowManager.LayoutParams.TYPE_SYSTEM_ERROR)
        dialog.setCancelable(false)

        //顶部菜单 商品
        mGoodsLL.setOnClickListener {
            canScroll = false
            handler.removeCallbacksAndMessages(null)
            mGoodsLine.visibility = View.VISIBLE
            mGoodsTV.textColorResource = R.color.white
            mGoodsDetailLine.visibility = View.INVISIBLE
            mGoodsDetailTV.textColorResource = R.color.text_white_light
            //滑动到顶部
            mScrollView.smoothScrollTo(0, 0, delayTime.toInt())
            handler.postDelayed({
                dialog.dismiss()
                canScroll = true
            }, delayTime)
        }
        //顶部菜单 详情
        mGoodsDetailLL.setOnClickListener {
            canScroll = false
            handler.removeCallbacksAndMessages(null)
            mGoodsLine.visibility = View.INVISIBLE
            mGoodsTV.textColorResource = R.color.text_white_light
            mGoodsDetailLine.visibility = View.VISIBLE
            mGoodsDetailTV.textColorResource = R.color.white
            mScrollView.smoothScrollTo(0, detailPosition, delayTime.toInt())
            handler.postDelayed({
                dialog.dismiss()
                canScroll = true
            }, delayTime)
        }
        //滑动监听
        mScrollView.setOnScrollChangeListener { _: NestedScrollView?, _: Int, scrollY: Int, _: Int, _: Int ->
//            MyLog.d("$canScroll")
//            MyLog.d("$scrollY")
//            MyLog.d("$detailPosition")

            if (canScroll) {
                if (scrollY >= detailPosition - 100) {
                    //展示详情
                    mGoodsLine.visibility = View.INVISIBLE
                    mGoodsTV.textColorResource = R.color.text_white_light
                    mGoodsDetailLine.visibility = View.VISIBLE
                    mGoodsDetailTV.textColorResource = R.color.white
                } else {
                    mGoodsLine.visibility = View.VISIBLE
                    mGoodsTV.textColorResource = R.color.white
                    mGoodsDetailLine.visibility = View.INVISIBLE
                    mGoodsDetailTV.textColorResource = R.color.text_white_light
                }
            }
        }

        //进入购物车
        mTrolleyLL.setOnClickListener {
            startActivity<TrolleyActivity>()
        }
        //添加到购物车
        mAddTrolleyBTN.setOnClickListener {
            showTrolleyDialog()
        }
        //立即购买
        mBuyBTN.setOnClickListener {
            showTrolleyDialog()
//            entity?.let {
//                val bean = TrolleyAddGoodsBean(
//                    it.stock.handlerNull(),
//                    it.images.handlerNull(),
//                    it.categoryName.handlerNull(),
//                    it.nno.handlerNull(),
//                    it.id.handlerNull(),
//                    it.nname.handlerNull(),
//                    it.salesPrice.handlerNull(),
//                    BaseApplication.allianceId.handlerNull(),
//                    it.description.handlerNull(),
//                    "1",
//                    BaseApplication.companyId.handlerNull(),
//                    BaseApplication.userId,
//                    it.specStyle.handlerNull(),
//                    it.goodsName,
//                    otherSortList = it.detailVos
//                )
//                GoodsAddTrolleyDialog(bean, this).show(supportFragmentManager, "")
//            }
        }
        mSelectLL.setOnClickListener {
            showTrolleyDialog()
        }
        mBackIV.setOnClickListener {
            finish()
        }
    }
    private fun showTrolleyDialog(){
        entity?.let {
            val bean = TrolleyAddGoodsBean(
                it.stock.handlerNull(),
                it.images.handlerNull(),
                it.categoryName.handlerNull(),
                it.nno.handlerNull(),
                it.id.handlerNull(),
                it.nname.handlerNull(),
                it.salesPrice.handlerNull(),
                BaseApplication.allianceId.handlerNull(),
                it.description.handlerNull(),
                "1",
                BaseApplication.companyId.handlerNull(),
                BaseApplication.userId,
                it.specStyle.handlerNull(),
                it.goodsName,
                otherSortList = it.detailVos,
                isSet = it.isSet,
                buyLimit = it.buyLimit
            )
            GoodsAddTrolleyDialog(bean, this).show(supportFragmentManager, "")
        }
    }

    override fun addGoodsToTrolley(bean: TrolleyAddGoodsBean) {
        loading.show()
        mViewModel.goodsAddTrolley(bean)
    }

    override fun onPartSortSelect(partId: String) {
        //获取商品详情
        mViewModel.getGoodsDetail(partId)
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }
}
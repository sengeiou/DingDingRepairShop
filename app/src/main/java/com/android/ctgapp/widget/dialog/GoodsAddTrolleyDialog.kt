package com.android.ctgapp.widget.dialog

import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.bumptech.glide.Glide
import com.android.ctgapp.activity.home.shop.OrderConfirmSingleActivity
import com.android.ctgapp.adapter.home.GoodsSortAdapter
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseDialogFromBottomFragment
import com.android.ctgapp.entity.home.GoodsDetailBean

import com.android.ctgapp.entity.home.TrolleyAddGoodsBean
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.item_goods_add_trolley_dialog.*
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2020/10/10
 *描述:加入购物车 Dialog 立即购买 Dialog
 */
class GoodsAddTrolleyDialog(private val bean: TrolleyAddGoodsBean, private val listener: AddTrolley) : BaseDialogFromBottomFragment(), GoodsSortAdapter.GoodsSortAdapterListener {
    private var entity = bean
    private var number = 1
    private var selectPartId = ""
    var otherSortList: List<GoodsDetailBean>? = null
    override fun onStart() {
        super.onStart()
        val display = DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(display)
//
//        //设置宽高占比
        val params = dialog!!.window!!.attributes
//        //此处占满屏幕宽度
        params.width = display.widthPixels
        params.height = RelativeLayout.LayoutParams.WRAP_CONTENT
        params.gravity = Gravity.BOTTOM
        params.horizontalMargin = 100f


//        高度自己定义
//        dialog!!.window!!.setLayout(RelativeLayout.LayoutParams.MATCH_PARENT, 492f.toPx(requireContext()))
        dialog!!.window!!.setLayout(RelativeLayout.LayoutParams.MATCH_PARENT, 500F.toPx(requireContext()))
    }

    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        dialog?.setCanceledOnTouchOutside(true)
        selectPartId = bean.partId

        entity.num = mGoodsCountTV.text.handlerNull()
        Glide.with(requireActivity()).load(entity.images).error(R.drawable.logo_app_gray)
            .placeholder(R.drawable.logo_app_gray)
            .into(mImageViewIV)
        val type = if (entity.categoryName.handlerNull().isEmpty()) "" else "分类:${entity.categoryName.handlerNull()}"
        val mNumber = if (entity.nno.handlerNull().isEmpty()) "" else "编号:${entity.nno.handlerNull()}"
        val intro = mNumber + type
//        val intro = "编号:${entity.nno}   分类:${entity.categoryName}"
        mNumberTV.text = intro
        mPriceTV.text = entity.price.handlerNull()
        //商品名称
//        val partName = "${entity.partName} ${entity.specStyle}"
        mPartNameTV.text = entity.goodsName.handlerNull()

        //关闭
        mCancelIV.setOnClickListener {
            dismiss()
        }
        //加1
        mAddBTN.setOnClickListener {
            entity.buyLimit?.let {
                //限购
                if (entity.isSet==1&&entity.buyLimit!=null){
                    if (number>=entity.buyLimit!!){
                        showToast("该商品限购:${entity.buyLimit}件")
                        return@setOnClickListener
                    }
                }
            }

            if (number >= entity.stock.toInt()) {
                requireActivity().showToast("已超过最大库存")
            } else {
                number++
                entity.num = number.handlerNull()
                mGoodsCountTV.text = number.handlerNull()
            }
        }
        //减1
        mMinusBTN.setOnClickListener {
            if (number <= 1) {
                requireActivity().showToast("最少添加一件")
            } else {
                number--
                entity.num = number.toString()
                mGoodsCountTV.text = number.handlerNull()
            }
        }
        //加入购物车
        mAddTrolleyBTN.setOnClickListener {
            when{
                entity.stock.toInt() == 0->{
                    requireActivity().showToast("抱歉该商品已经没有库存了")

                }
                entity.buyLimit==0->{
                    requireActivity().showToast("抱歉该商品限购0件")
                }
                else->{
                    listener.addGoodsToTrolley(entity)
                    dismiss()
                }
            }
        }
        //立即购买
        mBuyBTN.setOnClickListener {
            when{
                entity.stock.toInt() == 0->{
                    requireActivity().showToast("抱歉该商品已经没有库存了")

                }
                entity.buyLimit==0->{
                    requireActivity().showToast("抱歉该商品限购0件")
                }
                else->{
                    requireActivity().startActivity<OrderConfirmSingleActivity>(
                        MyConstants.PART_ID to selectPartId,
                        MyConstants.GOODS_COUNT to number
                    )
                    dismiss()
                }
            }
        }
        val basicHeight = 140f
        val param = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
//            //底部导航高度 像素
        val bottomHeight = MyPermissionUtil.getBottomNavigatorHeight(requireContext())
        param.topMargin = basicHeight.toPx(requireContext()) - bottomHeight
        mBottomButtonLL.layoutParams = param
        //处理分类列表
        MyLog.d("东西东西 处理分类")
        bean.otherSortList?.let {
            MyLog.d("东西东西 进来了${it.size}")
            it.forEach { b ->
                b.isSelect = bean.partId == b.id
            }
            otherSortList = it
            mSortRV.adapter = GoodsSortAdapter(requireContext(), otherSortList!!, this)
            mSortRV.layoutManager = LinearLayoutManager(requireContext())
        }
    }

    override fun getLayout() = R.layout.item_goods_add_trolley_dialog

    interface AddTrolley {
        fun addGoodsToTrolley(bean: TrolleyAddGoodsBean)
        fun onPartSortSelect(partId: String)
    }

    //商品切换
    override fun onItemSelect(position: Int) {
        val data = otherSortList!![position]
        val bean = TrolleyAddGoodsBean(
            data.stock.handlerNull(),
            data.images.handlerNull(),
            data.categoryName.handlerNull(),
            data.nno.handlerNull(),
            data.id.handlerNull(),
            data.nname.handlerNull(),
            data.salesPrice.handlerNull(),
            BaseApplication.allianceId.handlerNull(),
            data.description.handlerNull(),
            "1",
            BaseApplication.companyId.handlerNull(),
            BaseApplication.userId,
            data.specStyle.handlerNull(),
            data.goodsName,
            otherSortList = data.detailVos,
            isSet = data.isSet,
            buyLimit = data.buyLimit
        )

        entity = bean
        //替换商品信息
        Glide.with(requireActivity()).load(data.images).error(R.drawable.logo_app_gray)
            .placeholder(R.drawable.logo_app_gray)
            .into(mImageViewIV)
        val type = if (data.categoryName.handlerNull().isEmpty()) "" else "分类:${data.categoryName.handlerNull()}"
        val mNumber = if (data.nno.handlerNull().isEmpty()) "" else "编号:${data.nno.handlerNull()}"
        val intro = mNumber + type

        mNumberTV.text = intro
        mPriceTV.text = data.salesPrice.handlerNull()
        //商品名称
//        val partName = "${entity.partName} ${entity.specStyle}"
        mPartNameTV.text = data.goodsName.handlerNull()
        listener.onPartSortSelect(data.id.handlerNull())
        selectPartId = data.id.handlerNull()
        mGoodsCountTV.text = "1"
        number = 1
    }
}

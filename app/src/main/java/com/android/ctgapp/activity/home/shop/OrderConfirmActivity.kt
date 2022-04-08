package com.android.ctgapp.activity.home.shop

import android.content.Intent
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.R
import com.android.ctgapp.activity.address.AddressListActivity
import com.android.ctgapp.adapter.home.OrderConfirmAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityOrderConfirmBinding
import com.android.ctgapp.entity.AddressEntity
import com.android.ctgapp.entity.CouponAllEntity
import com.android.ctgapp.entity.home.*
import com.android.ctgapp.enum.PayFromEnum
import com.android.ctgapp.event.HomeFragmentRefresh
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.LoadingDialog
import kotlinx.android.synthetic.main.activity_order_confirm.*
import kotlinx.android.synthetic.main.activity_order_confirm.mAddressRL
import kotlinx.android.synthetic.main.activity_order_confirm.mAddressTV
import kotlinx.android.synthetic.main.activity_order_confirm.mConfirmBTN
import kotlinx.android.synthetic.main.activity_order_confirm.mCouponSelectLL
import kotlinx.android.synthetic.main.activity_order_confirm.mNameTV
import kotlinx.android.synthetic.main.activity_order_confirm.mRemarkET
import kotlinx.android.synthetic.main.activity_order_confirm.mTotalPriceTV
import kotlinx.android.synthetic.main.activity_order_confirm.mRemissionPriceTV
import kotlinx.android.synthetic.main.activity_order_confirm.mTotalRemissionPriceTV
import kotlinx.android.synthetic.main.activity_order_confirm_single.*
import org.greenrobot.eventbus.EventBus
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.startActivityForResult
import java.math.BigDecimal
import java.util.HashMap


/**
 *作者:LiBW
 *创建日期: 2020/11/9
 *描述: 确认订单 页面 购物车下单
 */
class OrderConfirmActivity : BaseActivityV2() {

    private val mViewModel: OrderConfirmViewModel by lazy { ViewModelProvider(this)[OrderConfirmViewModel::class.java] }
    private val mCouponViewModel: CouponViewModel by lazy { ViewModelProvider(this)[CouponViewModel::class.java] }
    private val mBinding by lazy { ActivityOrderConfirmBinding.inflate(layoutInflater) }
    private val mCheckoutView: CheckoutViewModel by lazy { ViewModelProvider(this)[CheckoutViewModel::class.java] }
    override fun getLayout() = mBinding.root
    private var totalPrice = BigDecimal("0")
    private var priceWithCoupon = BigDecimal("0")
    private var totalNumber = 0
    private var realPrice = ""
    private var couponId = -1
    private var supportWithCredit = true
    private var voucherId=""//选中代金券id
    private var voucherClientId=""//选中代金券唯一性标识id
    private var beanStr: String = ""//代金券信息

    //筛选出选中的数据
    private val selectEntity = TrolleyEntity()

    var province = ""
    var city = ""
    var district = ""
    private var addressDetail = ""
    var phone = ""
    var name = ""

    private var currentAddressId = 0
    private var whiteBarMoney = ""

    //卖家ID
    private var sellerCompanyId = -1
    private var entity: TrolleyEntity? = null
    private var companyId = 0
    private var couponParameters: String = ""
    var realremission = BigDecimal("0")

    override fun event() {
        //mCouponSelectLL.handlerVisibility(MyConstants.NEED_COUPON)


        val entityString = intent.getStringExtra(MyConstants.ENTITY)
        entity = getGson().fromJson(entityString, TrolleyEntity::class.java)

        val companyParentList = ArrayList<TrolleyEntity.DataBean>()
        //购物车携带过来的数据
        entity?.data?.let {

            it.forEach { parent ->
                companyId = parent.companyId
                val itemList = ArrayList<TrolleyEntity.DataBean.DetailsBean>()
                parent.details?.forEach { child ->
                    //isDeleted 0：数据有效，1：数据已删除 //isOnsale 上架下架 ，0：未上架，1：已上架
                    if (child.isSelected == THE_TRUE && child.isOnsale == 1 && child.isDeleted == 0) {
                        itemList.add(child)
                    }
                }
                if (itemList.isNotEmpty()) {
                    val item = TrolleyEntity.DataBean()
                    item.companyId = parent.companyId
                    item.companyName = parent.companyName
                    item.companyUuid = parent.companyUuid
                    item.details = itemList
                    companyParentList.add(item)
                }
            }
        }
        selectEntity.data = companyParentList
        var mAdapter: OrderConfirmAdapter?
        selectEntity.data?.let {
            mAdapter = OrderConfirmAdapter(this, it)
            mOrderRV.adapter = mAdapter
            mOrderRV.layoutManager = LinearLayoutManager(this)
        }

        val fCodeList = ArrayList<String>()
        val selectGoods = ArrayList<TrolleyEntity.DataBean.DetailsBean>()

        entity?.data?.let {

            getCounponData(it.get(0))
            it.forEach { parent ->

                parent.details?.forEach { child ->
                    //isOnsale 0：未上架，1：已上架 //isDeleted 0：数据有效，1：数据已删除 //并且已经选中
                    if (child.isDeleted == 0 && child.isOnsale == 1 && child.isSelected == THE_TRUE) {
                        //将价格和数量相乘
                        //数量和价格
                        MyLog.d("数量:${child.num}   价格:${child.price}")
                        MyLog.d("数量:${BigDecimal(child.num.handlerNull())}   价格:${BigDecimal(child.price.handlerNull())}")
                        val price = BigDecimal(child.price.handlerNull()).multiply(BigDecimal(child.num.handlerNull()))
                        MyLog.d("此商品的价格:$price")
                        totalPrice = totalPrice.plus(price)
                        MyLog.d("当前总价格${totalPrice}")
                        totalNumber += child.num
                        selectGoods.add(child)
                        //更新卖家ID以查询是否支持挂账
                        if (sellerCompanyId == -1) {
                            sellerCompanyId = child.companyId.toString().toDouble().toInt()
                        }
                    }
                    println(parent)

                    //如果还是出BUG就将这个添加到上面if语句中
                    if (child.fcode !in fCodeList) {
                        fCodeList.add(child.fcode.handlerNull())
                    }
                }
            }

        }
        //将计算好 扣除优惠券的费用 展示出来
        val price = totalPrice.toString()
        mTotalPriceTV.text = price
        realPrice = price
        val array = ArrayList<ShoppingSupportWithCreditBean.DataBean>()
        array.add(ShoppingSupportWithCreditBean.DataBean(sellerCompanyId, fCodeList))

        val bean = ShoppingSupportWithCreditBean(BaseApplication.companyId, array)
        //查询是否可以挂账
        mViewModel.queryShoppingSupportWithCredit(bean)

        mViewModel.error.observe(this, {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })
        mCheckoutView.error.observe(this, {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })
        mCheckoutView.createOrderResult.observe(this, {
            loading.dismiss()
            MyLog.d("创建订单回调:$it")
            //订单创建成功了 通知首页刷新热销商品
            EventBus.getDefault().post(HomeFragmentRefresh(1))

            //支付来源设置为订单

            val data = getGson().fromJson(it, CreateOrderResultEntity::class.java)
            if (data.status == 0) {

                BaseApplication.currentPayFrom = PayFromEnum.ORDER
                startActivity<PayResultActivity>()
            }
        }
        )
        mCouponViewModel.canUseResult.observe(this, Observer {
            loading.dismiss()
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, CouponAllEntity::class.java).data
                if (data.size == 0) {
                    mRemissionPriceTV.text = "无可用优惠券"
                    mCouponSelectLL.setClickable(false)
                    mTotalRemissionPriceTV.visibility=View.GONE
                } else {

                    mCouponSelectLL.setClickable(true)
                    mRemissionPriceTV.text="未选择代金券"
                    //优惠券金额
                    data.get(0)?.let {
                        supportWithCredit = false
                        voucherClientId=it.voucherClientId
                        voucherId = it.id
                        val remissionPrice = BigDecimal(it.remissionPrice.handlerNull())
                        //可用余额
                        val totalAmount = BigDecimal(it.leftAmount.handlerNull())
                        voucherId = it.id


                        if (totalAmount < totalPrice) {
                            realremission = totalAmount
                        } else {
                            realremission = totalPrice
                        }
                        if (remissionPrice < realremission) {
                            realremission = remissionPrice
                        }
                        mRemissionPriceTV.text = "-￥${realremission}"
                        mTotalPriceTV.text = (totalPrice - realremission).handlerNull()
                        mTotalRemissionPriceTV.visibility=View.VISIBLE
                        mTotalRemissionPriceTV.text="已优惠￥${realremission}"
                    }
//                    couponId = mCouponBean.id
//                    mCouponDetailLL.visibility = View.VISIBLE
//                    val head = "${mCouponBean.voucherName} 满${mCouponBean.threshold}减${mCouponBean.deduction}"
//                    mCouponHeadTV.text = head
//                    val foot = "-${mCouponBean.deduction}"
//                    mCouponFootTV.text = foot


                    ////////////
                }
            }

        })
        mViewModel.result.observe(this, {
            loading.dismiss()
            MyLog.d("是否支持挂账回调:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, ShoppingSupportWithCreditEntity::class.java)
                data.data.let { list ->
                    if (list.isNotEmpty()) {
                        supportWithCredit = true
                        mSupportCreditTV.text = "该企业支持白条支付"
                        whiteBarMoney = if (list[0].flag) {
                            list[0].amount.handlerNull()
                        } else {
                            "-1"
                        }
                    } else {
                        supportWithCredit = false
                        mSupportCreditTV.text = "该企业暂不支持白条支付"
                    }
                }


//                val data = getGson().fromJson(it, ShoppingSupportWithCreditEntity::class.java)
//                data.data.let { list ->
//                    selectEntity.data?.forEach { item ->
//                        item.supportWithCredit = item.companyId in list
//                        supportWithCredit = item.companyId in list
//                    }
//                }
//                mAdapter?.notifyDataSetChanged()
            }
        })


        //获取收货地址
        mViewModel.getAddress()
        mViewModel.addressResult.observe(this, {
            loading.dismiss()
            MyLog.d("收货地址回调:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, AddressEntity::class.java).data
                data?.let { list ->
                    list.forEach { entity ->
                        if (entity.isDefault) {
                            setData(entity)
                        }
                    }
                }
            }
        })
    }


    override fun click() {
        //切换地址
        mAddressRL.setOnClickListener {
            startActivityForResult<AddressListActivity>(1000)
        }


//         地址编辑
//        startActivity<AddressEditActivity>()
        //结算
        mConfirmBTN.setOnClickListener {
            if (province.isEmpty()) {
                showToast("请选择收货地址后下单")
            } else {
                BaseApplication.price = realPrice.handlerNull()

                if (totalPrice.subtract(realremission) > BigDecimal("0")) {
                    startActivity<CheckoutActivity>(
//                    MyConstants.ENTITY to getGson().toJson(getData()),
//                    MyConstants.SUPPORT_CREDIT to supportWithCredit,
//                    MyConstants.PRICE to realPrice,
//                    MyConstants.White_Money to whiteBarMoney
                        MyConstants.ENTITY to getGson().toJson(getData()),
                        MyConstants.SUPPORT_CREDIT to supportWithCredit,//是否支持白条
                        MyConstants.PRICE to (totalPrice - realremission).handlerNull(),//总金额
                        MyConstants.White_Money to whiteBarMoney,//白条额度
                        MyConstants.COMPANY_ID to companyId.handlerNull(),
                        MyConstants.COUPON_ENTITY to beanStr,
                    )
                } else {
                    //当优惠券满足支付
                    val bean = getData()
                    bean.payWay = 8
                    BaseApplication.price = (totalPrice - realremission).handlerNull()
                    bean.totalPrice = (totalPrice - realremission).handlerNull()
                    loading.show()
                    mCheckoutView.createOrder(bean)
                }
            }
//            CheckoutActivity.jumpHere(this, getGson().toJson(bean), supportWithCredit)
        }
        //选择优惠券
        mCouponSelectLL.setOnClickListener {
            startActivityForResult<CouponActivity>(
                1001, MyConstants.ENTITY to getGson().toJson(getData()),
                MyConstants.GOODS_ENTITY to getGson().toJson(entity),
                "totalPrice" to totalPrice.handlerNull(),
                "voucherClientId" to voucherClientId,
                "couponParameters" to couponParameters
            )
        }
    }

    private fun getCounponData(goodsEntity: TrolleyEntity.DataBean) {
//        val goodsEntityString=getGson().toJson(getData())
//        goodsEntityString?.let {
//            val goodsEntity = getGson().fromJson(it, GoodsDetailBean::class.java)

        goodsEntity?.let { e ->
            loading.show()
            val map = HashMap<String, Any>()
            val arrayList: List<TrolleyEntity.DataBean.DetailsBean> = e.details!!
            val voucherCheckList: ArrayList<CouponActivity.Voucher> = ArrayList()

            arrayList.forEach { bean ->
                val voucher: CouponActivity.Voucher = CouponActivity.Voucher()
                voucher.brandId = bean.brandId
                voucher.goodsId = bean.goodId
                voucher.ctgnum = bean.ctgnum.handlerNull()
                voucher.totalPrice = BigDecimal(bean.price.handlerNull()).multiply(BigDecimal(bean.num.handlerNull())).handlerNull()
                voucherCheckList?.add(voucher)
            }
            map["voucherCheckList"] = voucherCheckList
            map["companyId"] = e.companyId.handlerNull()
            map["clientId"] = BaseApplication.companyId
            //查询可用的代金券
            couponParameters = getGson().toJson(map)
            mCouponViewModel.getCouponCanUse(handlerBodyEntity(map))
        }
        //}
    }

    //获取 创建订单和获取优惠券信息的实体类
    private fun getData(): CreateOrderBean {
        val bean = CreateOrderBean()
        bean.totalNumber = totalNumber
        bean.allianceId = BaseApplication.allianceId
        bean.totalPrice = totalPrice.toString()
        bean.buyerCompanyId = BaseApplication.companyId.handlerNull()
        bean.province = province
        bean.city = city
        bean.district = district
        bean.address = addressDetail
        bean.receiverName = name
        bean.telephone = phone
        bean.buyerUserId = BaseApplication.userId
        //来源固定4 订单来源1-APP 2-ERP 3-A车配 4-CTG
        bean.indentFrom = 1

        bean.orderType = BuildConfig.ORDER_TYPE
        val orderBeans = ArrayList<CreateOrderBean.OrdersBean>()
        selectEntity.data?.forEach { seller ->
            //卖家列表
            val orderBean = CreateOrderBean.OrdersBean()
            //如果优惠券ID不是-1则证明使用了优惠券
            if (couponId != -1) {
                orderBean.cashReplaceId = couponId
            }
            orderBean.sellerCompanyId = seller.companyId
            //  0：不开票   1：普通发票   2：增值税发票 暂时没有发票选项
            orderBean.invoiceType = 0
            if (orderBean.invoiceType != 0) {
                orderBean.head = "周星驰"
                orderBean.taxNo = "1233213"
                orderBean.companyAddress = "黑化肥挥发会发灰"
                orderBean.companyPhone = "1333333333"
                orderBean.bank = "无锡银行"
            }
            orderBean.remark = mRemarkET.text.handlerNull()
            orderBean.voucherCash = realremission.handlerNull()
            orderBean.voucherId = voucherClientId
            //选种商品列表
            val goodsList = ArrayList<CreateOrderBean.OrdersBean.OrderDetailSBean>()
            seller.details?.forEach { item ->
                val goods = CreateOrderBean.OrdersBean.OrderDetailSBean()
                goods.goodsAmount = item.num
                goods.goodsPrice = item.price
                goods.goodsNo = item.factoryid
                goods.goodsName = item.nname
                goods.partOe = item.oe
                goods.spec = item.specStyle
                goods.brand = item.brandName
                goods.goodsId = item.goodId
                goods.categoryCode = item.fcode
                goods.shoppingCartId = item.shoppingId
                goods.remark = item.description.handlerNull()
                goods.goodsImg = item.imgName
                goods.brandId = item.brandId
                goodsList.add(goods)
            }
            orderBean.orderDetailS = goodsList
            orderBeans.add(orderBean)
        }
        bean.orders = orderBeans
        return bean
    }


    @Suppress("UNCHECKED_CAST")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1000) {
            if (data != null) {
                val mData = data.getStringExtra(MyConstants.ENTITY).handlerNull()
                if (mData.isNotEmpty()) {
                    val entity = getGson().fromJson(mData, AddressEntity.DataBean::class.java)
                    setData(entity)
                } else {
                    //没有携带地址回来 但是有可能删除了默认地址
                    val deleteAddressList: List<Int> = data.getSerializableExtra(MyConstants.DELETE_ADDRESS_IDS) as List<Int>
                    deleteAddressList.forEach {
                        //如果删除的地址ID和当前页面展示的ID是一致的则删除不显示
                        if (currentAddressId == it) {
                            mNameTV.text = "点击选择地址"
                            mAddressTV.text = ""
                        }
                    }
                }
            }
        }
        //优惠券 回调
        if (requestCode == 1001) {
            data?.let {

                beanStr = data.getStringExtra(MyConstants.ENTITY)
                beanStr?.let { str ->
                    val mCouponBean = getGson().fromJson(str, CouponAllEntity.Data::class.java)
                    if(mCouponBean==null){
                        //重新返回需要置空
                        voucherClientId=""
                        voucherId = ""
                        realremission=BigDecimal("0")
                        supportWithCredit = true
                    }else{
                        supportWithCredit = false
                        voucherClientId=mCouponBean.voucherClientId
                        voucherId = mCouponBean.id
                        val remissionPrice = BigDecimal(mCouponBean.remissionPrice.handlerNull())
                        //可用余额
                        val totalAmount = BigDecimal(mCouponBean.leftAmount.handlerNull())
                        voucherId = mCouponBean.id


                        if (totalAmount < totalPrice) {
                            realremission = totalAmount
                        } else {
                            realremission = totalPrice
                        }
                        if (remissionPrice < realremission) {
                            realremission = remissionPrice
                        }

                    }
                }
            }
            if (realremission == BigDecimal("0")) {
                mRemissionPriceTV.text = "未选代金券"
                mTotalRemissionPriceTV.visibility=View.GONE
            } else {
                mTotalRemissionPriceTV.visibility=View.VISIBLE
                mRemissionPriceTV.text = "-￥${realremission}"
                mTotalRemissionPriceTV.text="已优惠￥${realremission}"
            }
            MyLog.d(totalPrice)
            MyLog.d(realremission)
            MyLog.d(totalPrice - realremission)
            mTotalPriceTV.text = (totalPrice - realremission).handlerNull()
        }
    }

    private fun setData(entity: AddressEntity.DataBean) {
        currentAddressId = entity.id
        mNameTV.text = entity.deliveryName
        val address = "${entity.province.handlerNull()} ${entity.city.handlerNull()} ${entity.district.handlerNull()} ${entity.detailAddress.handlerNull()}"
        mAddressTV.text = address
        province = entity.province.handlerNull()
        city = entity.city.handlerNull()
        district = entity.district.handlerNull()
        addressDetail = entity.detailAddress.handlerNull()
        name = entity.deliveryName.handlerNull()
        phone = entity.deliveryPhone.handlerNull()
    }


}
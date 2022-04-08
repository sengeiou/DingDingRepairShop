package com.android.ctgapp.activity.home.shop

import android.content.Intent
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.R
import com.bumptech.glide.Glide
import com.android.ctgapp.activity.address.AddressListActivity
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityOrderConfirmSingleBinding
import com.android.ctgapp.entity.AddressEntity
import com.android.ctgapp.entity.CouponAllEntity
import com.android.ctgapp.entity.deal.CouponBean
import com.android.ctgapp.entity.home.*
import com.android.ctgapp.enum.PayFromEnum
import com.android.ctgapp.event.HomeFragmentRefresh
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_order_confirm.*
import kotlinx.android.synthetic.main.activity_order_confirm_single.*
import kotlinx.android.synthetic.main.activity_order_confirm_single.mAddressRL
import kotlinx.android.synthetic.main.activity_order_confirm_single.mAddressTV
import kotlinx.android.synthetic.main.activity_order_confirm_single.mConfirmBTN
import kotlinx.android.synthetic.main.activity_order_confirm_single.mCouponSelectLL
import kotlinx.android.synthetic.main.activity_order_confirm_single.mNameTV
import kotlinx.android.synthetic.main.activity_order_confirm_single.mRemarkET
import kotlinx.android.synthetic.main.activity_order_confirm_single.mTotalPriceTV
import kotlinx.android.synthetic.main.activity_order_confirm_single.mTotalRemissionPriceTV
import kotlinx.android.synthetic.main.activity_order_confirm_single.mRemissionPriceTV
import org.greenrobot.eventbus.EventBus
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.startActivityForResult
import java.lang.Exception
import java.math.BigDecimal
import java.util.HashMap


/**
 *作者:LiBW
 *创建日期: 2020/11/9
 *描述: 确认订单 页面 立即下单
 */
class OrderConfirmSingleActivity : BaseActivity() {
    private val mViewModel: OrderConfirmViewModel by lazy { ViewModelProvider(this)[OrderConfirmViewModel::class.java] }
    private val mCouponViewModel: CouponViewModel by lazy { ViewModelProvider(this)[CouponViewModel::class.java] }
    private val mCheckoutView: CheckoutViewModel by lazy { ViewModelProvider(this)[CheckoutViewModel::class.java] }
    private var supportWithCredit = true
    private val mBinding by lazy { ActivityOrderConfirmSingleBinding.inflate(layoutInflater) }
    //private var currentselected=-1
    override fun getLayout() = R.layout.activity_order_confirm_single
    var province = ""
    var city = ""
    var district = ""
    private var addressDetail = ""
    var phone = ""
    var name = ""
    private var couponId = -1
    private var currentAddressId = 0
    private var whiteBarMoney = ""
    private var beanStr: String = ""//代金券信息

    //价格计算
    private var totalPrice = BigDecimal("0")
    private var companyId = 0
    private var entity: GoodsDetailBean? = null
    private val partNum: Int by lazy { intent.getIntExtra(MyConstants.GOODS_COUNT, -1) }
    private var voucherId = ""
    private var voucherClientId=""
    private var couponParameters: String = ""
    private var realremission = BigDecimal("0")
    override fun event() {
        //mCouponSelectLL.handlerVisibility(MyConstants.NEED_COUPON)

        val partId = intent.getStringExtra(MyConstants.PART_ID)
        //getCounponData()
        partId?.let {
            mViewModel.getGoodsDetail(partId)
        }

        mViewModel.goodsResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("商品详情:$it")
            handlerHttpResult(it) {
                entity = getGson().fromJson(it, GoodsDetailEntity::class.java).data
                //查询是否可以挂账
                val array = ArrayList<ShoppingSupportWithCreditBean.DataBean>()
                array.add(ShoppingSupportWithCreditBean.DataBean(entity!!.companyId, arrayListOf(entity!!.fcode.handlerNull())))
                val bean = ShoppingSupportWithCreditBean(BaseApplication.companyId, array)
                mViewModel.queryShoppingSupportWithCredit(bean)
                entity?.let { data ->
                    Glide.with(this).load(data.images).error(R.drawable.logo_app_gray)
                        .placeholder(R.drawable.logo_app_gray)
                        .into(mItemImageIV)
                    val count = "x${partNum}"
                    mContentTV.text = count

                    //卖家公司名
                    mTitleTV.text = data.orgName.handlerNull()
                    companyId = data.companyId
//                    val name = "${data.nname.handlerNull()} ${data.brandName.handlerNull()} ${data.specStyle.handlerNull()}"
                    mPartNamesTV.text = data.goodsName.handlerNull()
                    val code = "编码: ${data.nno.handlerNull()}"
                    mPartCodeTV.text = code
                    //价格计算
                    val price = "¥${data.salesPrice.handlerNull()}"
                    totalPrice = totalPrice.plus(BigDecimal(data.salesPrice.handlerNull())).multiply(BigDecimal(partNum.handlerNull()))

                    mPartPriceTV.text = price
                    mTotalPriceTV.text = totalPrice.handlerNull()
                    getCounponData(entity!!)
                }
            }
        })


        mCouponViewModel.canUseResult.observe(this, Observer {
            loading.dismiss()
            handlerHttpResult(it) {
                MyLog.d("代金券详情:$it")
                val data = getGson().fromJson(it, CouponAllEntity::class.java).data
                if (data.size == 0) {
                    mRemissionPriceTV.text = "无可用代金券"
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
                        mTotalRemissionPriceTV.text="已优惠￥${realremission}"
                        mRemissionPriceTV.text = "-￥${realremission}"
                        mTotalRemissionPriceTV.visibility=View.VISIBLE
                        mTotalPriceTV.text = (totalPrice - realremission).handlerNull()
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
        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, Observer {
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
            }
        })
        mViewModel.getAddress()

        mViewModel.addressResult.observe(this, {
            loading.dismiss()
            MyLog.d("收货地址回调:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, AddressEntity::class.java).data
                mNameTV.text = "点击选择地址"
                mAddressTV.text = ""
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

            if (province.isEmpty() || city.isEmpty()) {
                showToast("请核对地址后下单")
            } else {
                entity?.let {
                    BaseApplication.price = totalPrice.handlerNull()
                    if (totalPrice - realremission > BigDecimal("0")) {
                        startActivity<CheckoutActivity>(
                            MyConstants.ENTITY to getGson().toJson(getData()),
                            MyConstants.SUPPORT_CREDIT to supportWithCredit,//是否支持白条
                            MyConstants.PRICE to (totalPrice - realremission).handlerNull(),//总需要支付金额
                            MyConstants.White_Money to whiteBarMoney,//白条额度
                            MyConstants.COMPANY_ID to companyId.handlerNull(),
                            MyConstants.COUPON_ENTITY to beanStr,
                        )
                    } else {
                        val bean = getData()
                        bean.payWay = 8
                        BaseApplication.price = (totalPrice - realremission).handlerNull()
                        bean.totalPrice = (totalPrice - realremission).handlerNull()
                        loading.show()
                        mCheckoutView.createOrder(bean)
                    }
                }
            }
        }

        //选择优惠券
        mCouponSelectLL.setOnClickListener {
            startActivityForResult<CouponActivity>(
                1001, MyConstants.ENTITY to getGson().toJson(getData()),
                MyConstants.GOODS_ENTITY to getGson().toJson(entity),
                "totalPrice" to totalPrice.handlerNull(),
                //"currentselected" to currentselected,
                "voucherClientId" to voucherClientId,
                "couponParameters" to couponParameters
            )
        }
    }

    /**
     * 获取可用优惠券
     */
    private fun getCounponData(goodsEntity: GoodsDetailBean) {
//        val goodsEntityString=getGson().toJson(getData())
//        goodsEntityString?.let {
//            val goodsEntity = getGson().fromJson(it, GoodsDetailBean::class.java)

        goodsEntity?.let { e ->
            loading.show()
            val map = HashMap<String, Any>()
            val arrayList: List<GoodsDetailBean> = arrayListOf(e)
            val voucherCheckList: ArrayList<CouponActivity.Voucher> = ArrayList()

            arrayList.forEach { bean ->
                val voucher: CouponActivity.Voucher = CouponActivity.Voucher()
                voucher.brandId = bean.brandid
                voucher.goodsId = bean.id
                voucher.ctgnum = bean.ctgnum
                voucher.totalPrice = totalPrice.handlerNull()

                voucherCheckList?.add(voucher)
            }
            map["voucherCheckList"] = voucherCheckList
            map["companyId"] = e.companyId.handlerNull()
            map["clientId"] = BaseApplication.companyId
            //查询可用的代金券
            couponParameters = getGson().toJson(map)
            mCouponViewModel.getCouponCanUse(handlerBodyEntity(map))
            //  }
        }
    }

    //获取创建订单和获取优惠券信息的实体类
    private fun getData(): CreateOrderBean {
        //第一层 收货人信息
        val bean = CreateOrderBean()
        bean.totalNumber = partNum
        bean.allianceId = BaseApplication.allianceId
        entity?.let {
            bean.totalPrice = (partNum * it.salesPrice).handlerNull()
        }
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
        //卖家列表
        val orderBean = CreateOrderBean.OrdersBean()
        //是否包含优惠券信息
        if (couponId != -1) {
            orderBean.cashReplaceId = couponId
        }
        orderBean.sellerCompanyId = entity?.companyId
        //  0：不开票   1：普通发票   2：增值税发票 朱忠强表示暂时不要发票功能
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

        val goods = CreateOrderBean.OrdersBean.OrderDetailSBean()
        goods.goodsAmount = partNum
        goods.goodsPrice = entity?.salesPrice
        goods.goodsNo = entity?.nno
        goods.goodsName = entity?.nname
        goods.goodsId = entity?.id
        goods.categoryCode = entity?.fcode.handlerNull()
        goods.remark = entity?.description
        goods.brandId = entity?.brandid
        goodsList.add(goods)
        orderBean.orderDetailS = goodsList
        orderBeans.add(orderBean)
        bean.orders = orderBeans
        return bean
    }


    @Suppress("UNCHECKED_CAST")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //地址回调
        if (requestCode == 1000) {
            if (data != null) {
                val mData = data.getStringExtra(MyConstants.ENTITY).handlerNull()
                if (mData.isNotEmpty()) {
                    val entity = getGson().fromJson(mData, AddressEntity.DataBean::class.java)
                    setData(entity)
                } else {
                    //没有携带地址回来 但是有可能删除了默认地址
                    try {
                        val deleteAddressList: List<Int> = data.getSerializableExtra(MyConstants.DELETE_ADDRESS_IDS) as List<Int>
                        deleteAddressList.forEach {
                            //如果删除的地址ID和当前页面展示的ID是一致的则删除不显示
                            if (currentAddressId == it) {
                                mNameTV.text = "点击选择地址"
                                mAddressTV.text = ""
                            }
                        }
                    } catch (e: Exception) {

                    }
                }
            }
        }
        //优惠券
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
            mTotalPriceTV.text = (totalPrice - realremission).handlerNull()
        }
    }

    //设置收货地址
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
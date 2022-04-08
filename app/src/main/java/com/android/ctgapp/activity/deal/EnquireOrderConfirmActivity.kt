package com.android.ctgapp.activity.deal

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.activity.address.AddressListActivity
import com.android.ctgapp.activity.home.shop.CheckoutActivity
import com.android.ctgapp.activity.home.shop.OrderConfirmViewModel
import com.android.ctgapp.adapter.home.EnquireOrderConfirmItemAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityEnquireOrderConfirmBinding
import com.android.ctgapp.entity.AddressEntity
import com.android.ctgapp.entity.home.CreateOrderBean
import com.android.ctgapp.entity.home.QuotationDetailEntity
import com.android.ctgapp.entity.home.ShoppingSupportWithCreditBean
import com.android.ctgapp.entity.home.ShoppingSupportWithCreditEntity
import com.android.ctgapp.util.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.startActivityForResult
import java.math.BigDecimal

/**
 *作者:LiBW
 *创建日期: 2021/7/30
 *描述: 询价单 确认订单 页面
 */
class EnquireOrderConfirmActivity : BaseActivityV2() {
    private val mViewModel: OrderConfirmViewModel by lazy { ViewModelProvider(this)[OrderConfirmViewModel::class.java] }
    private val mBinding by lazy { ActivityEnquireOrderConfirmBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private val mDataBean: QuotationDetailEntity by lazy { intent.getSerializableExtra(MyConstants.RESULT_DATA) as QuotationDetailEntity }
    var province = ""
    var city = ""
    var district = ""
    private var addressDetail = ""
    var phone = ""
    var name = ""

    //查询到的白条额度
    var whiteBarMoney = ""

    //是否支持白条
    var supportWithCredit = false
    var totalPrice = ""
    private var currentAddressId = 0
    private val buyerCompanyId by lazy { intent.getIntExtra(MyConstants.COMPANY_ID, -1) }
    override fun event() {
        mBinding.mCouponDetailLL.handlerVisibility(MyConstants.NEED_COUPON)
        mDataBean.mList?.let {
            val adapter = EnquireOrderConfirmItemAdapter(this, it)
            mBinding.mOrderRV.adapter = adapter
            mBinding.mOrderRV.layoutManager = LinearLayoutManager(this)
            //计算总价
            var bigDecimal = BigDecimal("0")
            var companyName = ""
            it.forEach { bean ->
                val big = BigDecimal(bean.num.handlerNull()).multiply(BigDecimal(bean.price.handlerNull()))
                bigDecimal = bigDecimal.add(big)
                companyName = bean.quotationCompanyName.handlerNull()
            }
            mBinding.mCompanyNameTV.text = companyName
            mBinding.mTotalPriceTV.text = bigDecimal.handlerNull()
            totalPrice = bigDecimal.handlerNull()
        }

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

        //查询是否支持挂账
        val array = ArrayList<ShoppingSupportWithCreditBean.DataBean>()
        array.add(ShoppingSupportWithCreditBean.DataBean(buyerCompanyId, arrayListOf()))
        val bean = ShoppingSupportWithCreditBean(BaseApplication.companyId, array)
        //查询是否可以挂账
        mViewModel.queryShoppingSupportWithCredit(bean)
        mViewModel.result.observe(this, {
            loading.dismiss()
            MyLog.d("询价单是否支持挂账回调:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, ShoppingSupportWithCreditEntity::class.java)
                data.data.let { list ->
                    if (list.isNotEmpty()) {
                        supportWithCredit = true
                        mBinding.mSupportCreditTV.text = "该企业支持白条支付"
                        whiteBarMoney = if (list[0].flag){
                            list[0].amount.handlerNull()
                        }else{
                            "-1"
                        }
                    } else {
                        supportWithCredit = false
                        mBinding.mSupportCreditTV.text = "该企业暂不支持白条支付"
                    }
                }
            }
        })
    }

    //询价单的OrderType传1
    private val orderType by lazy { intent.getIntExtra(MyConstants.ORDER_TYPE, BuildConfig.ORDER_TYPE) }
    private fun getData(): CreateOrderBean {
        //总价格
        var totalNumber = 0
        mDataBean.mList?.forEach {
            totalNumber += it.num
        }
        val bean = CreateOrderBean()
        bean.totalNumber = totalNumber
        bean.allianceId = BaseApplication.allianceId
        bean.totalPrice = totalPrice
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
        //TODO 此处如果报错请手动改为2
        bean.orderType = orderType

        //orderBeans里面只有一层
        val orderBeans = ArrayList<CreateOrderBean.OrdersBean>()
        val orderBean = CreateOrderBean.OrdersBean()
        //将地址 发票信息 公司ID加入到列表中
        mDataBean.mList?.forEach { seller ->
            //卖家列表
//            //如果优惠券ID不是-1则证明使用了优惠券
//            if (couponId != -1) {
//                orderBean.cashReplaceId = couponId
//            }
            orderBean.sellerCompanyId = seller.quotationCompanyId
            //  0：不开票   1：普通发票   2：增值税发票 暂时没有发票选项
            orderBean.invoiceType = 0
//            if (orderBean.invoiceType != 0) {
//                orderBean.head = "周星驰"
//                orderBean.taxNo = "1233213"
//                orderBean.companyAddress = "黑化肥挥发会发灰"
//                orderBean.companyPhone = "1333333333"
//                orderBean.bank = "无锡银行"
//            }
            orderBean.remark = mBinding.mRemarkET.text.handlerNull()
        }


        //选中商品列表加入到orderDetailS里面
        val goodsList = ArrayList<CreateOrderBean.OrdersBean.OrderDetailSBean>()
        mDataBean.mList?.forEach { item ->
            val goods = CreateOrderBean.OrdersBean.OrderDetailSBean()
            goods.goodsAmount = item.num
            goods.goodsPrice = item.price
//                goods.goodsNo = item.factoryid
            goods.goodsName = item.partName
            goods.partOe = item.oe
//                goods.spec = item.specStyle
            goods.brand = item.brand
            goods.goodsId = item.enquiryDetailId.handlerNull()
//                goods.categoryCode = item.fcode
            goods.shoppingCartId = item.quotationDetailId
            goods.remark = item.remark.handlerNull()
//                goods.goodsImg = item.imgName
//                goods.brandId = item.brand
            goodsList.add(goods)
        }
        orderBean.orderDetailS = goodsList
        //将商品列表添加到orders中
        orderBeans.add(orderBean)
        bean.orders = orderBeans
        return bean
    }

    override fun click() {
        mBinding.mConfirmBTN.setOnClickListener {
            if (province.isEmpty()) {
                showToast("请选择收货地址后下单")
            } else {
                startActivity<CheckoutActivity>(
                    MyConstants.ENTITY to getGson().toJson(getData()),
                    MyConstants.SUPPORT_CREDIT to supportWithCredit,
                    MyConstants.PRICE to totalPrice,
                    MyConstants.White_Money to whiteBarMoney
                )
            }
        }

        //切换地址
        mBinding.mAddressRL.setOnClickListener {
            startActivityForResult<AddressListActivity>(1000)
        }
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
                            mBinding.mNameTV.text = "点击选择地址"
                            mBinding.mAddressTV.text = ""
                        }
                    }
                }
            }
        }
    }

    private fun setData(entity: AddressEntity.DataBean) {
        currentAddressId = entity.id
        mBinding.mNameTV.text = entity.deliveryName
        val address = "${entity.province.handlerNull()} ${entity.city.handlerNull()} ${entity.district.handlerNull()} ${entity.detailAddress.handlerNull()}"
        mBinding.mAddressTV.text = address
        province = entity.province.handlerNull()
        city = entity.city.handlerNull()
        district = entity.district.handlerNull()
        addressDetail = entity.detailAddress.handlerNull()
        name = entity.deliveryName.handlerNull()
        phone = entity.deliveryPhone.handlerNull()
    }
}
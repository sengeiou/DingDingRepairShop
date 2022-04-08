package com.android.ctgapp.activity.home.shop

import android.content.Intent
import android.graphics.Typeface
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.home.CouponAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityCouponBinding
import com.android.ctgapp.entity.CouponAllEntity
import com.android.ctgapp.entity.deal.CouponBean
import com.android.ctgapp.entity.deal.CouponEntity
import com.android.ctgapp.entity.home.*
import com.android.ctgapp.util.*
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_coupon.*
import okhttp3.MediaType
import okhttp3.RequestBody
import org.json.JSONArray
import org.json.JSONObject
import java.math.BigDecimal
import java.util.HashMap

/**
 *作者:LiBW
 *创建日期: 11/26/20
 *描述: 优惠券 页面
 */
class CouponActivity : BaseActivityV2(), CouponAdapter.Click {
    private val mBinding by lazy { ActivityCouponBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root

    private val mViewModel: CouponViewModel by lazy { ViewModelProvider(this)[CouponViewModel::class.java] }
    private val couponParameters by lazy { intent.getStringExtra("couponParameters") }
    private var entity: CreateOrderBean? = null
    private var goodsEntity: GoodsDetailBean? = null
    private val mList = ArrayList<CouponAllEntity.Data>()
    private var mAdapter: CouponAdapter ?=null
    private var canUseList = ArrayList<CouponAllEntity.Data>()
    private var canNotUseList = ArrayList<CouponAllEntity.Data>()
    var totalPrice:BigDecimal?=null
    var currentCanUseType = true
    var voucherClientId=""//选中代金券id
    override fun event() {
       // ..........单个订单过来也改成这个模式
        voucherClientId=intent.getStringExtra("voucherClientId")
        mAdapter=CouponAdapter(this, mList, this,voucherClientId)
        mCouponRV.adapter = mAdapter
        mCouponRV.layoutManager = LinearLayoutManager(this)
//        val entityString = intent.getStringExtra(MyConstants.ENTITY)
//        entityString?.let {
//            entity = getGson().fromJson(it, CreateOrderBean::class.java)
//            entity?.let { e ->
//                loading.show()
//                //查询可用的代金券
//                mViewModel.getCouponCanUse(handlerBodyEntity(e))
//            }
//        }
//        totalPrice= BigDecimal(intent.getStringExtra("totalPrice"))
//        val goodsEntityString=intent.getStringExtra(MyConstants.GOODS_ENTITY)
//        goodsEntityString?.let {
//            goodsEntity = getGson().fromJson(it, GoodsDetailBean::class.java)
//
//            goodsEntity?.let { e ->
//                loading.show()
//                val map = HashMap<String, Any>()
//                val arrayList:List<GoodsDetailBean> = arrayListOf(e)
//                val voucherCheckList:ArrayList<Voucher> = ArrayList()
//
//                arrayList.forEach {
//                    bean ->
//                    val voucher:Voucher= Voucher()
//                    voucher.brandId=bean.brandid
//                    voucher.goodsId=bean.id
//                    voucher.ctgnum=bean.ctgnum
//                    voucher.totalPrice=totalPrice.handlerNull()
//                    voucherCheckList?.add(voucher)
//                }
//                map["voucherCheckList"]=voucherCheckList
//                map["companyId"]=e.companyId.handlerNull()
//                map["clientId"]=BaseApplication.companyId
//                //查询可用的代金券
//                mViewModel.getCouponCanUse(handlerBodyEntity(map))
//            }
//        }
        //获取可用代金券
        mViewModel.getCouponCanUse(RequestBody.create(MediaType.parse("application/json; charset=utf-8"),couponParameters))
        mViewModel.error.observe(this, Observer {
            loading.dismiss()

            showToast(it)
        })

        mViewModel.canUseResult.observe(this, Observer {
            loading.dismiss()
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, CouponAllEntity::class.java).data
                data?.let { list ->
                    mList.addAll(list)
                    mAdapter!!.notifyDataSetChanged()
                }
//                val jsonParent = JSONObject(it)
//                val jsonChild = jsonParent.getJSONArray("data")
//                val buyerId = entity?.orders?.get(0)?.sellerCompanyId
//                if (buyerId != null && buyerId.handlerNull() in jsonChild.handlerNull()) {
//                    val json = jsonChild.getJSONObject(buyerId.handlerNull())
//
//                    val coupon = getGson().fromJson(json.toString(), CouponEntity::class.java)
//                    canUseList.clear()
//                    canNotUseList.clear()
//                    mList.clear()
//                    coupon.available?.let { list ->
//                        canUseList.addAll(list)
//                        mList.addAll(list)
//                        mAdapter.notifyDataSetChanged()
//
//                    }
//                    coupon.notAvailable?.let { list ->
//                        canNotUseList.addAll(list)
//                    }
//                } else {
//                    showToast("抱歉!没有可用的优惠券。")
//                }
            }
        })
    }
    class Voucher{
        var brandId:Int? = null
        var goodsId:String?=null
        var ctgnum:String?=null
        var totalPrice:String?=null
    }
    override fun click() {
        mBinding.mBackIv.setOnClickListener {
            onBackPressed()
        }
        mBinding.mConfigTV.setOnClickListener {

            val intent = Intent()
            var couponEntity=""
            if(voucherClientId!="") {
                mList.forEach{
                    if(it.voucherClientId==voucherClientId){
                        couponEntity=getGson().toJson(it)
                    }
                }
            }
            intent.putExtra(MyConstants.ENTITY, couponEntity)
            MyLog.d("选中的代金券信息:"+couponEntity)
            intent.putExtra("voucherClientId", voucherClientId)
            setResult(1001, intent)
            finish()
        }
        //可用优惠券
//        mCanUseLL.setOnClickListener {
//            currentCanUseType = true
//            mCanUseTV.setTypeface(null, Typeface.BOLD)
//            mCanNotUseTV.setTypeface(null, Typeface.NORMAL)
//            mCanUseV.visibility = View.VISIBLE
//            mCanNotUseV.visibility = View.INVISIBLE
//            mList.clear()
//            mList.addAll(canUseList)
//            mAdapter.notifyDataSetChanged()
//        }
//        //不可用优惠券
//        mCanNotUseLL.setOnClickListener {
//            currentCanUseType = false
//            mCanNotUseTV.setTypeface(null, Typeface.BOLD)
//            mCanUseTV.setTypeface(null, Typeface.NORMAL)
//            mCanNotUseV.visibility = View.VISIBLE
//            mCanUseV.visibility = View.INVISIBLE
//            mList.clear()
//            mList.addAll(canNotUseList)
//            mAdapter.notifyDataSetChanged()
//        }

    }

    override fun onItemSelect(voucherClientId: String) {
        this.voucherClientId=voucherClientId
    }
}
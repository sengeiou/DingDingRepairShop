package com.android.ctgapp.activity.home.shop

import android.app.AlertDialog
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.home.TrolleyAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.callback.TrolleyGoodsChangeListener
import com.android.ctgapp.callback.TrolleyManager
import com.android.ctgapp.entity.home.TrolleyEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_trolley.*
import org.jetbrains.anko.startActivity
import java.math.BigDecimal
import java.util.ArrayList

/**
 *作者:LiBW
 *创建日期: 2020/11/5
 *描述: 购物车 页面
 */
class TrolleyActivity : BaseActivity(), TrolleyGoodsChangeListener {
    private val mViewModel: TrolleyViewModel by lazy { ViewModelProvider(this)[TrolleyViewModel::class.java] }

    //管理模式(批量删除)
    private var managerType = false
    private var totalPrice = BigDecimal(0)
    private var entity: TrolleyEntity? = null
    private val mList = ArrayList<TrolleyEntity.DataBean>()
    private val mAdapter: TrolleyAdapter by lazy { TrolleyAdapter(this, mList) }


    override fun onResume() {
        super.onResume()
        getTrolley()
    }

    private fun getTrolley() {
        totalPrice = BigDecimal(0)
        loading.show()
        mViewModel.getTrolley()
    }

    override fun event() {
        val drawable = ContextCompat.getDrawable(this, R.drawable.icon_dustbin_red)
        drawable?.let {
            drawable.setBounds(0, 0, 15f.toPx(this), 15f.toPx(this))
            mQuickCleanTV.setCompoundDrawables(drawable, null, null, null)
        }

        mTrolleyRV.adapter = mAdapter
        mTrolleyRV.layoutManager = LinearLayoutManager(this)
        TrolleyManager.setCallback(this)
        mViewModel.error.observe(this,  {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })
        //购物车回调
        mViewModel.result.observe(this,  {
            loading.dismiss()
            MyLog.d("购物车列表:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, TrolleyEntity::class.java)
                entity = data
                //选中商品价格计算
                var total = BigDecimal(0)
                data?.data?.let { list ->
                    val l = ArrayList<TrolleyEntity.DataBean>()
                    l.addAll(list)
                    //判断整体全选
                    var allSelect = true
                    for (index in list.indices) {
                        //判断按店铺全选
                        var itemAllSelect = true
                        //子列表中有一个为未选中 则不是全选状态
                        l[index].details?.forEach { item ->
                            //isDeleted 0：数据有效，1：数据已删除//isOnsale 0：未上架，1：已上架
                            if (item.isDeleted == 0 && item.isOnsale == 1) {
                                if (item.isSelected == THE_TRUE) {
                                    val b = BigDecimal(item.price.handlerNull()).multiply(BigDecimal(item.num.handlerNull()))
                                    total = total.add(b)
                                }
                                if (itemAllSelect) {
                                    if (item.isSelected == THE_FALSE) {
                                        itemAllSelect = false
                                        allSelect = false
                                    }
                                }
                            }
                        }
                        l[index].titleSelect = itemAllSelect
                    }
                    MyLog.d("总价格:$total")
                    mTotalPriceTV.text = total.handlerNull()
                    //全选按钮
                    mAllSelectCB.isChecked = allSelect
                    mList.clear()
                    mList.addAll(l)
                    mAdapter.notifyDataSetChanged()

                }
            }
        })

        mViewModel.trolleyResult.observe(this, Observer {
            MyLog.d("修改购物车结果:$it")
            val data = initData(it)
            if (data.status != 0) {
                showToast(data.msg)
            } else {
                getTrolley()
            }
        })
        mViewModel.trolleyDeleteResult.observe(this, Observer {
            MyLog.d("删除购物车:$it")
            val data = initData(it)
            if (data.status == 0) {
                getTrolley()
            } else {
                showToast(data.msg)
            }
        })
        //批量选中回调
        mViewModel.changesSelectResult.observe(this, Observer {
            MyLog.d("批量选中回调:$it")
            val data = initData(it)
            if (data.status == 0) {
                getTrolley()
            } else {
                showToast(data.msg)
            }
        })
    }

    override fun click() {
        //管理
        mManagerTV.setOnClickListener {
            managerType = !managerType
            if (managerType) {
                //切换为完成模式
                mManagerTV.text = "完成"
                mConfirmBTN.visibility = View.GONE
                mDeleteBTN.visibility = View.VISIBLE
                mQuickCleanTV.visibility = View.VISIBLE
                mTotalPriceLL.visibility = View.INVISIBLE

            } else {
                //切换为管理模式
                mManagerTV.text = "管理"
                mConfirmBTN.visibility = View.VISIBLE
                mDeleteBTN.visibility = View.GONE
                mQuickCleanTV.visibility = View.GONE
                mTotalPriceLL.visibility = View.VISIBLE

            }
        }
        //清理
        mQuickCleanTV.setOnClickListener {
            AlertDialog.Builder(this).setTitle("确认清理已过期商品和已失效商品么")
                .setPositiveButton("确认") { _, _ ->
                    val errorGoodsIds = ArrayList<Int>()
                    mList.forEach { data ->
                        data.details?.forEach {
                            if (it.isOnsale == 0 || it.isDeleted == 1) {
                                errorGoodsIds.add(it.shoppingId)
                            }
                        }
                    }
                    mViewModel.trolleyDelete(errorGoodsIds)
                }.setNegativeButton("返回") { _, _ ->
                }.show()
        }
        //完成 结算
        mConfirmBTN.setOnClickListener {
            //检查限购
            mList.forEach {
                it.details?.forEach {bean->
                    bean.buyLimit?.let {buyLimit->
                        if (bean.isSet==1&&bean.num>buyLimit){
                            showToast("${bean.goodsName.handlerNull()} 限购 ${buyLimit}件")
                            return@setOnClickListener
                        }
                    }
                }
            }
            //目前仅支持单个卖家商品结算
            //购物车内选中了几个商家
            var sellerCount = 0
            mList.forEach {
                run breaking@{
                    it.details?.forEach { item ->
                        //商品选中状态且 已上架 且数据有效
                        if (item.isSelected == THE_TRUE && item.isOnsale == 1 && item.isDeleted == 0) {
                            sellerCount++
                            return@breaking
                        }
                    }
                }
            }
            MyLog.d("选择的商户数量:$sellerCount")
            when (sellerCount) {
                0 -> showToast("请至少选择一件商品")
                1 -> {
                    startActivity<OrderConfirmActivity>(MyConstants.ENTITY to getGson().toJson(entity))
                }
                else -> {
                    showToast("抱歉!单次结算仅可购买一家商户的商品")
                }
            }
        }


        //批量删除
        mDeleteBTN.setOnClickListener {
            val deleteList = ArrayList<Int>()
            mList.forEach { list ->
                list.details?.forEach { item ->
                    if (item.isSelected == THE_TRUE) {
                        //批量删除只对上架商品和有效商品生效 //isDeleted 0：数据有效，1：数据已删除 //isOnsale 上架下架 ，0：未上架，1：已上架
                        if (item.isOnsale == 1 && item.isDeleted == 0) {
                            deleteList.add(item.shoppingId)
                        }
                    }
                }
            }
            mViewModel.trolleyDelete(deleteList)
        }
        //全选
        mAllSelectCB.setOnClickListener {
            mTotalPriceTV.text = "0"
            val selectIds = ArrayList<Int>()
            mList.forEach {
                it.details?.forEach { item ->
                    //全选之对上架商品和有效商品生效 //isDeleted 0：数据有效，1：数据已删除 //isOnsale 上架下架 ，0：未上架，1：已上架
                    if (item.isOnsale == 1 && item.isDeleted == 0) {
                        selectIds.add(item.shoppingId)
                    }
                }
            }
            if (!mAllSelectCB.isChecked) {
                //选中状态则取消全选
                mViewModel.changesSelect(selectIds, THE_FALSE)
            } else {
                mViewModel.changesSelect(selectIds, THE_TRUE)
            }
        }
    }


    override fun goodCountChange(trolleyId: Int, num: Int) {
        mViewModel.trolleyChangeCount(trolleyId, num)
    }

    override fun goodDelete(trolleyIds: List<Int>) {
        mTotalPriceTV.text = totalPrice.handlerNull()
        mViewModel.trolleyDelete(trolleyIds)
    }


    //子菜单按钮状态变更
    override fun goodChildItemCheckChange(shoppingId: Int, select: Int) {
        mViewModel.changesSelect(arrayListOf(shoppingId), select)
    }


    //选择变更
    override fun changesSelect(ids: List<Int>, isSelected: Int) {
        loading.show()
        mViewModel.changesSelect(ids, isSelected)
    }

    override fun onDestroy() {
        //防止内存泄露
        TrolleyManager.listener=null
        super.onDestroy()
    }

    override fun getLayout() = R.layout.activity_trolley
}
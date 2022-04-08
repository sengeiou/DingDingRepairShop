package com.android.ctgapp.activity.home.shop

import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.databinding.ActivityPartShopBinding
import com.android.ctgapp.databinding.ActivitySearchGoodsBinding
import com.android.ctgapp.util.*


object PartShopActivityUtil {

    //初始化一些数据
    fun PartShopActivity.initActivity(mBinding: ActivityPartShopBinding) {
        mBinding.mAttrHorizontalRV.adapter = mAttrHorizontalAdapter
        mBinding.mAttrHorizontalRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        mBinding.mOtherAttrDrawRV.adapter = mAttrDrawAdapter
        mBinding.mOtherAttrDrawRV.layoutManager = LinearLayoutManager(this)
        mBinding.mFenLeiRV.adapter = fenleiDrawAdapter
        mBinding.mFenLeiRV.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
        mBinding.mPinPaiRV.adapter = pinpaiDrawAdapter
        mBinding.mPinPaiRV.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
        mBinding.mGoodsRV.adapter = mAdapter
        mBinding.mGoodsRV.layoutManager = LinearLayoutManager(this)
        //禁止手势滑动
        mBinding.mDrawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
        //通用报错
        mViewModel.error.observe(this, {
            mBinding.mRefresh.over()
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })

    }


    //初始化一些数据
    fun SearchGoodsActivity.initActivity(mBinding: ActivitySearchGoodsBinding) {
        query = intent.getStringExtra(MyConstants.GOODS_NAME).handlerNull()
        mBinding.mSearchET.textSet(query)
        mBinding.mAttrHorizontalRV.adapter = mAttrHorizontalAdapter
        mBinding.mAttrHorizontalRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        mBinding.mOtherAttrDrawRV.adapter = mAttrDrawAdapter
        mBinding.mOtherAttrDrawRV.layoutManager = LinearLayoutManager(this)
        mBinding.mFenLeiRV.adapter = fenleiDrawAdapter
        mBinding.mFenLeiRV.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
        mBinding.mPinPaiRV.adapter = pinpaiDrawAdapter
        mBinding.mPinPaiRV.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
        mBinding.mGoodsRV.adapter = mAdapter
        mBinding.mGoodsRV.layoutManager = LinearLayoutManager(this)
        //禁止手势滑动
        mBinding.mDrawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
        //通用报错
        mViewModel.error.observe(this, {
            mBinding.mRefresh.over()
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })

    }

}
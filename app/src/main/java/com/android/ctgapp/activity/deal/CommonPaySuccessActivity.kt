package com.android.ctgapp.activity.deal

import android.view.MotionEvent
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.activity.mine.whitebar.WhiteBarV2Activity
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityCommonPaySuccessBinding
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.initData
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2021/6/15
 *描述:通用还款成功页面
 */
class CommonPaySuccessActivity : BaseActivityV2() {
    private val mViewModel by lazy { ViewModelProvider(this)[CommonPaySuccessViewModel::class.java] }
    private val mBinding by lazy { ActivityCommonPaySuccessBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root

    override fun event() {
        val money = "¥${BaseApplication.mWhiteBarSelectMoney.handlerNull()}"
        mBinding.mMoneyTV.text = money
        mViewModel.returnMoreSuccessCheck(BaseApplication.mWhiteBarOrderNoSingle)
        mViewModel.result.observe(this, {
            val data = initData(it)
            if (data.status != 0) {
                mViewModel.returnMoreSuccessCheck(BaseApplication.mWhiteBarOrderNoSingle)
            }
        })
    }

    override fun click() {
        mBinding.mFinishBTN.setOnClickListener {
            startActivity<WhiteBarV2Activity>()
            finish()
        }
    }



    override fun onDestroy() {
        BaseApplication.clearWhiteBarData()
        super.onDestroy()
    }
}
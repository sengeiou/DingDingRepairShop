package com.android.ctgapp.activity.message.chart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityCurrentGroupChartBinding

/**
 *作者:LiBW
 *创建日期: 2021/11/9
 *描述: 当前聊天 页面(群组)
 */
class CurrentGroupChartActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityCurrentGroupChartBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    override fun event() {
        handlerBottomKeyboard()

    }

    override fun click() {

    }

    private fun getData() {

    }

    private fun handlerBottomKeyboard(){

    }
}
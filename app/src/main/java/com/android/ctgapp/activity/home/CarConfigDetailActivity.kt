package com.android.ctgapp.activity.home

import android.view.View
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityCarConfigDetailBinding
import com.android.ctgapp.entity.home.VinResultEntityV3
import com.android.ctgapp.util.MyConstants
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.getGson
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.widget.CommonHorizontalLayoutHasLine

/**
 *作者:LiBW
 *创建日期: 2021/8/11
 *描述:车辆详细配置 页面
 */
class CarConfigDetailActivity : BaseActivityV2() {
    private val mBinding by lazy { ActivityCarConfigDetailBinding.inflate(layoutInflater) }
    override fun getLayout()=mBinding.root

    override fun event() {

       val str=intent.getStringExtra(MyConstants.CARD_INFO)
        MyLog.d("过来的是什么:${str}")
        val dataBean = getGson().fromJson(str, VinResultEntityV3::class.java).data
        dataBean?.let { data ->
            handlerCarInfo(data)
        }
    }

    override fun click() {

    }

    private fun handlerCarInfo(data: VinResultEntityV3.DataBean) {
        mBinding.mContainerLL.removeAllViews()
        mBinding.mContainerLL.addView(handlerLayout("品牌", data.brand.handlerNull()))
        mBinding.mContainerLL.addView(handlerLayout("厂牌", data.factory.handlerNull()))
        mBinding.mContainerLL.addView(handlerLayout("车系", data.series.handlerNull()))
        mBinding.mContainerLL.addView(handlerLayout("车组", data.groups.handlerNull()))
        mBinding.mContainerLL.addView(handlerLayout("车型", data.model.handlerNull()))
        mBinding.mContainerLL.addView(handlerLayout("销售版本", data.sales.handlerNull()))
        mBinding.mContainerLL.addView(handlerLayout("年款", data.year.handlerNull()))
        mBinding.mContainerLL.addView(handlerLayout("底盘号/车型代码", data.chassis.handlerNull()))
        mBinding.mContainerLL.addView(handlerLayout("车身类型", data.body.handlerNull()))
        mBinding.mContainerLL.addView(handlerLayout("发动机型号", data.engine.handlerNull()))
        mBinding.mContainerLL.addView(handlerLayout("变速箱类型", data.trans.handlerNull()))
        mBinding.mContainerLL.addView(handlerLayout("变速箱档位数", data.transnum.handlerNull()))
        mBinding.mContainerLL.addView(handlerLayout("排量(L)", data.displacement.handlerNull()))
        mBinding.mContainerLL.addView(handlerLayout("驱动形式", data.drive.handlerNull()))
        mBinding.mContainerLL.addView(handlerLayout("配置选项", data.option.handlerNull()))


    }


    private fun handlerLayout(startTV: String, endTV: String): View {
        val layout = CommonHorizontalLayoutHasLine(this, null)
        layout.setStartTV(startTV)
        layout.setEndTV(endTV)
        return layout
    }
}
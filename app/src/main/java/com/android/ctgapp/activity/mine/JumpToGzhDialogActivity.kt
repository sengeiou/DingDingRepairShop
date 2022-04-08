package com.android.ctgapp.activity.mine

import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.R
import com.android.ctgapp.adapter.home.CommonViewpagerAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityJumpToGzhDialogBinding
import com.android.ctgapp.util.MyLog
import com.tencent.mm.opensdk.modelbiz.SubscribeMessage
import com.tencent.mm.opensdk.modelmsg.SendAuth
import com.tencent.mm.opensdk.openapi.WXAPIFactory
import org.jetbrains.anko.image
import java.util.ArrayList

/**
 *作者:LiBW
 *创建日期: 2021/8/10
 *描述:跳转到微信公众号 页面
 */
class JumpToGzhDialogActivity : BaseActivityV2() {
    private val imageList = ArrayList<ImageView>()
    private val mBinding by lazy { ActivityJumpToGzhDialogBinding.inflate(layoutInflater) }

    override fun getLayout() = mBinding.root
    private var currentPosition=0
    override fun event() {
        //从array文件中读取需要展示的图片放入ViewPage的列表中
        val imageArray = resources.obtainTypedArray(R.array.Guide_GZH_image)
        for (i in 0 until imageArray.length()) {
            val image = ImageView(this)
//            image.scaleType=ImageView.ScaleType.CENTER
            image.image = imageArray.getDrawable(i)
            imageList.add(image)
        }
        //回收资源
        imageArray.recycle()
        val mAdapter = CommonViewpagerAdapter(imageList)
        mBinding.mViewPage.adapter = mAdapter
        //viewPage页面监听
        mBinding.mViewPage.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(p0: Int) {
            }

            override fun onPageScrolled(position: Int, p1: Float, p2: Int) {

            }

            override fun onPageSelected(position: Int) {
                MyLog.d("当前position${position}")
                changePoint(position)
                currentPosition=position
            }
        })
    }

    override fun click() {
        mBinding.mWeChatBTN.setOnClickListener {
            if (currentPosition!=3){
                currentPosition++
                mBinding.mViewPage.arrowScroll(2)
            }else{
                val api = WXAPIFactory.createWXAPI(this, null)
                api.registerApp(BuildConfig.WX_APP_ID)
                val req = SubscribeMessage.Req()
                req.scene = 189
                req.templateID = "Tl6Yxt3To0mTIGWk5MLRLNdAnOQJywov5zPAtjhDneU"
                req.reserved = "Tl6Yxt3To0mTIGWk5MLRLNdAnOQJywov5zPAtjhDneU"
                val sendResult = api.sendReq(req)
                MyLog.d("发送结果:$sendResult")
                val auth = SendAuth.Req()
                auth.extData
                api.sendReq(auth)
                finish()
            }
        }
        mBinding.mCloseIV.setOnClickListener {
            finish()
        }
    }

    //改变下方小圆点
    private fun changePoint(position: Int) {
        when (position) {
            0 -> {
                initPoint()
                mBinding.mPoint1.setImageResource(R.drawable.point2)
                mBinding.mTextView.text = "第一步 点击确认接收"
            }
            1 -> {
                initPoint()
                mBinding.mPoint2.setImageResource(R.drawable.point2)
                mBinding.mTextView.text = "第二步 打开微信 点击服务通知"
            }
            2 -> {
                initPoint()
                mBinding.mPoint3.setImageResource(R.drawable.point2)
                mBinding.mTextView.text = "第三步 点击服务通知里的关注信息"
            }
            3 -> {
                initPoint()
                mBinding.mPoint4.setImageResource(R.drawable.point2)
                mBinding.mTextView.text = "第四部 点击关注公众号 操作完成"
            }
        }
    }

    //初始化小圆点
    private fun initPoint() {
        mBinding.mPoint1.setImageResource(R.drawable.point1)
        mBinding.mPoint2.setImageResource(R.drawable.point1)
        mBinding.mPoint3.setImageResource(R.drawable.point1)
        mBinding.mPoint4.setImageResource(R.drawable.point1)
    }
}
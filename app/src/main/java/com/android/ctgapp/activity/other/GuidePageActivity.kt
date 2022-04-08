package com.android.ctgapp.activity.other

import android.content.Context
import android.view.View
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.android.ctgapp.R
import com.android.ctgapp.activity.login.LoginActivity
import com.android.ctgapp.adapter.home.CommonViewpagerAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityGuidePageBinding
import com.android.ctgapp.util.MyConstants
import org.jetbrains.anko.backgroundDrawable
import org.jetbrains.anko.startActivity
import java.util.ArrayList

/**
 *作者:LiBW
 *创建日期: 2021/7/29
 *描述:引导页 页面
 */
class GuidePageActivity : BaseActivityV2() {
    //引导页展示的图片
    private val imageList = ArrayList<ImageView>()
    private val mBinding by lazy { ActivityGuidePageBinding.inflate(layoutInflater) }
    override fun getLayout()=mBinding.root

    override fun event() {
        //从array文件中读取需要展示的图片放入ViewPage的列表中
        val imageArray=resources.obtainTypedArray(R.array.Guide_image)
        for (i in 0 until  imageArray.length()){
            val image = ImageView(this)
            image.backgroundDrawable=imageArray.getDrawable(i)
            imageList.add(image)
        }
        //回收资源
        imageArray.recycle()
        val mAdapter = CommonViewpagerAdapter(imageList)
        mBinding.mViewPage.adapter = mAdapter
        //viewPage页面监听
        mBinding. mViewPage.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(p0: Int) {

            }

            override fun onPageScrolled(position: Int, p1: Float, p2: Int) {

            }

            override fun onPageSelected(position: Int) {
                changePoint(position)
            }
        })
    }

    override fun click() {
        mBinding.mGoBtn.setOnClickListener {
            //进入后取消引导页
            val sp= getSharedPreferences(MyConstants.IS_FIRST_IN, Context.MODE_PRIVATE)
            sp.edit().putBoolean(MyConstants.IS_FIRST_IN,false).apply()
            startActivity<LoginActivity>()
            finish()
        }
    }
    //改变下方小圆点
    private fun changePoint(position: Int) {
        when (position) {
            0 -> {
                initPoint()
                mBinding.mPoint1.setImageResource(R.drawable.addzz)
                mBinding. mGoBtn.visibility = View.GONE
            }
            1 -> {
                initPoint()
                mBinding.mPoint2.setImageResource(R.drawable.point2)
                mBinding.mGoBtn.visibility = View.GONE
            }
            2 -> {
                initPoint()
                mBinding.mPoint3.setImageResource(R.drawable.point2)
                mBinding.mGoBtn.visibility = View.GONE
            }
            3 -> {
                initPoint()
                mBinding.mPoint4.setImageResource(R.drawable.point2)
                mBinding.mGoBtn.visibility = View.VISIBLE
            }
        }
    }
    //初始化小圆点
    private fun initPoint(){
        mBinding.mPoint1.setImageResource(R.drawable.point1)
        mBinding.mPoint2.setImageResource(R.drawable.point1)
        mBinding.mPoint3.setImageResource(R.drawable.point1)
        mBinding.mPoint4.setImageResource(R.drawable.point1)
    }

}
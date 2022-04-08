package com.android.ctgapp.activity.message.chart

import android.app.Activity
import android.content.pm.ActivityInfo
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.BuildConfig.FILE_PROVIDER
import com.android.ctgapp.R
import com.android.ctgapp.adapter.chart.FaceAdapter
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.callback.MessageManager
import com.android.ctgapp.entity.UserInfoEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.util.chart.ThreadPoolManager
import com.zhihu.matisse.Matisse
import com.zhihu.matisse.MimeType
import com.zhihu.matisse.engine.impl.GlideEngine
import com.zhihu.matisse.internal.entity.CaptureStrategy
import kotlinx.android.synthetic.main.activity_current_chart.*

/**
 * 作者:LiBW
 * 创建日期: 2021/5/8
 * 描述:当前聊天辅助类
 */
object CurrentChartUtil {
    fun openPhotoAlbum(activity: Activity) {
        //编辑模式下，图片展示数量尚未达到最大数量时，会显示一个“+”号，点击后回调这里
        Matisse.from(activity)
            //视频和照片都可以进行选择
            .choose(MimeType.ofAll())
            //是否只显示选择的类型的缩略图，就不会把所有图片视频都放在一起，而是需要什么展示什么
            .showSingleMediaType(true)
            //这两行要连用 是否在选择图片中展示照相 和适配安卓7.0 FileProvider
            .capture(true)
            .captureStrategy(CaptureStrategy(true, FILE_PROVIDER))
            //有序选择图片 123456...
            .countable(true)
            //最大选择数量为9
            .maxSelectable(1)
            //选择方向
            .restrictOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
            //界面中缩略图的质量
            .thumbnailScale(0.8f)
            //蓝色主题
            .theme(R.style.Matisse_Zhihu)
            //黑色主题
            .theme(R.style.Matisse_Dracula)
            //Glide加载方式
            .imageEngine(GlideEngine())
            //请求码
            .forResult(10001)
    }

    /**处理刚进入聊天页面的数据*/
    fun CurrentChartActivity.defaultSetting() {
        val otherCompanyName = intent.getStringExtra("companyName")
        //注册监听者(当新消息过来后监听)
        MessageManager.setCallback(this)
        //查询对方用户的头像等信息是否需要更新
        mUserInfoViewModel.findUser(otherID)
        //标记当前聊天对方ID
        BaseApplication.currentTalkTo = otherID
        mTalkToNameTV.text = otherName.handlerNull()
        mCompanyNameTV.text = otherCompanyName.handlerNull()
        //聊天列表适配器设置
        mChartRV.adapter = mAdapter
        mChartRV.layoutManager = LinearLayoutManager(this)
        //缓存大小设置为500条
        mChartRV.setItemViewCacheSize(500)
        //表情菜单列表
        mFaceRV.layoutManager = GridLayoutManager(this, 8)
        val faceAdapter = FaceAdapter(this, ChartUtil.faceList)
        mFaceRV.adapter = faceAdapter
        //表情点击事件
        faceAdapter.setOnclickListener(object : FaceAdapter.FaceItemCheck {
            override fun onItemClickListener(resourceId: Int, imageName: String) {
                ChartUtil.handlerFaceSelect(this@defaultSetting, resourceId, imageName, mET)
            }
        })

        mUserInfoViewModel.userInfoResult.observe(this, {
            MyLog.d("聊天用户信息回调:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, UserInfoEntity::class.java).data
                data?.let {
                    otherCompanyId = data.defaultCompanyId
                    //个人信息数据
                    val name = data.realName.handlerNull()
                    val image = data.imageUrl.handlerNull()
                    val company = data.defaultCompanyName.handlerNull()
                    //用户信息有变化就进行更新
                    if (otherName != name || otherImage != image || otherCompanyName != company) {
                        ThreadPoolManager.execute {
                            val chartList = chartListDao.findChartFromList(otherID, BaseApplication.userId)
                            chartList?.let { entity ->
                                entity.otherHeaderImg = image.handlerNull()
                                entity.otherName = name.handlerNull()
                                entity.companyName = company.handlerNull()
                                //主线程更新逻辑
                                runOnUiThread {
                                    if (otherCompanyName != BaseApplication.companyName) {
                                        mCompanyNameTV.text = company.handlerNull()
                                    }
                                    if (otherName != name) {
                                        mTalkToNameTV.text = name.handlerNull()
                                    }
                                    if (otherImage != image) {
                                        //头像查询到变化
//                                        MyLog.d("头像有变化快去通知列表修改")
                                        mAdapter.setOtherImage(image)
                                    }
                                }
                                //通知列表更新
                                chartListDao.updateChartList(entity)
                            }
                        }
                    }
                }
            }
        })
    }


}
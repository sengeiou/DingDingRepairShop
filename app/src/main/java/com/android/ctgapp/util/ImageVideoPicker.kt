package com.android.ctgapp.util

import android.app.Activity
import android.content.pm.ActivityInfo
import com.android.ctgapp.BuildConfig.FILE_PROVIDER
import com.android.ctgapp.R
import com.zhihu.matisse.Matisse
import com.zhihu.matisse.MimeType
import com.zhihu.matisse.engine.impl.GlideEngine
import com.zhihu.matisse.internal.entity.CaptureStrategy


fun Activity.initSingleImagePicker(requestCodeChoose:Int){
//编辑模式下，图片展示数量尚未达到最大数量时，会显示一个“+”号，点击后回调这里
    val videoPicker =  //视频选择器
        Matisse.from(this)
            .choose(MimeType.ofImage())
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
            .forResult(requestCodeChoose)
}



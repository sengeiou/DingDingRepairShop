package com.android.ctgapp.util

import android.content.Context
import android.widget.ImageView
import com.lwkandroid.imagepicker.utils.IImagePickerDisplayer
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.load.engine.DiskCacheStrategy

/**
 * 作者:LiBW
 * 创建日期: 11/18/20
 * 描述: 图片九宫格展示
 */
class ImagePickerLoader : IImagePickerDisplayer {
    override fun display(context: Context, url: String, imageView: ImageView, maxWidth: Int, maxHeight: Int) {
        Glide.with(context)
            .asBitmap()
            .load(url)
            .apply(
                RequestOptions()
                    .override(maxWidth, maxHeight)
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            )
            .into(imageView)
    }

    override fun display(context: Context, url: String, imageView: ImageView, placeHolder: Int, errorHolder: Int, maxWidth: Int, maxHeight: Int) {
        Glide.with(context)
            .asBitmap()
            .load(url)
            .apply(
                RequestOptions()
                    .placeholder(placeHolder)
                    .error(errorHolder)
                    .override(maxWidth, maxHeight)
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            )
            .into(imageView)
    }
}
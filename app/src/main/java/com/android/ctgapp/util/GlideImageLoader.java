package com.android.ctgapp.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.lwkandroid.widget.ninegridview.INineGridImageLoader;

/**
 * 作者:LiBW
 * 创建日期: 11/18/20
 * 描述: 图片九宫格展示
 */
public class GlideImageLoader implements INineGridImageLoader {
    @Override
    public void displayNineGridImage(Context context, String url, ImageView imageView) {
        Glide.with(context).load(url).into(imageView);
    }

    @Override
    public void displayNineGridImage(Context context, String url, ImageView imageView, int width, int height) {
        Glide.with(context).load(url)
                .apply(new RequestOptions().override(width, height))
                .into(imageView);
    }
}

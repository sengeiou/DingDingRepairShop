package com.android.ctgapp.widget.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.android.ctgapp.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_dialog_loading.*

/**
*描述:展示加载中的小菊花
*作者:LiBW
*创建日期: 2020/7/1
*/
class LoadingDialog(context: Context, themeResId: Int = R.style.dialog) : Dialog(context, themeResId) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_dialog_loading)
        Glide.with(context).load(R.drawable.gif_loading).into(mLoadGif)
        //设置无法通过点击取消dialog
        this.setCancelable(false)
    }
}

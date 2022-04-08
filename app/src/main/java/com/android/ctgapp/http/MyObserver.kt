package com.android.ctgapp.http

import android.content.Context
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.util.handlerNull

import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import okhttp3.ResponseBody

/**
 * 创建时间:2018/12/4
 * 作者:LiBW
 * 描述:通用Observer需要自己对代码进行try catch处理
 */
open class MyObserver( private val listener: ObserverListener) : Observer<ResponseBody> {

    //加载完成 进度条消失
    override fun onComplete() {
    }

    //加载开始 展示进度条
    override fun onSubscribe(d: Disposable) {
    }

    //加载完成回调
    override fun onNext(t: ResponseBody) {
        listener.onNext(t)
    }

    //出现错误 进度条消失 按需求展示错误页面
    override fun onError(e: Throwable) {
        listener.onError(e.message.handlerNull())
    }
}
interface ObserverListener {
    fun onNext(t: ResponseBody)
    fun onError(error: String)
}
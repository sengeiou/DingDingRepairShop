package com.android.ctgapp.http

import android.content.Context
import com.android.ctgapp.util.handlerData
import com.android.ctgapp.util.handlerNull
import com.android.ctgapp.util.over
import com.android.ctgapp.util.showToast
import com.android.ctgapp.widget.dialog.LoadingDialog
import com.scwang.smartrefresh.layout.SmartRefreshLayout
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import okhttp3.ResponseBody
import java.lang.Exception

open class MyObserverHandlerLoading(private val context: Context,private val loading: LoadingDialog?=null,private val refresh:SmartRefreshLayout?=null ,private val block: (String) -> Unit) : Observer<ResponseBody> {

    //加载完成 进度条消失
    override fun onComplete() {
        refresh?.over()
        loading?.dismiss()
    }

    //加载开始 展示进度条
    override fun onSubscribe(d: Disposable) {
        loading?.show()
    }

    //加载完成回调
    override fun onNext(t: ResponseBody) {
        val str=t.string().handlerNull()
        try {
            context.handlerData(str){
                block(str)
            }
        }catch (e:Exception){
            context.showToast(e.message.handlerNull())
        }
    }

    //出现错误 进度条消失 按需求展示错误页面
    override fun onError(e: Throwable) {
        refresh?.over()
        loading?.dismiss()
        context.showToast(e.message.handlerNull())
    }
}


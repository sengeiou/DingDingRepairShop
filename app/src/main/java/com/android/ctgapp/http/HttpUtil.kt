package com.android.ctgapp.http

import android.content.Context
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.util.showToast
import com.android.ctgapp.widget.dialog.LoadingDialog
import com.google.gson.Gson
import okhttp3.*
import org.jetbrains.anko.runOnUiThread
import java.io.IOException
import java.lang.Exception
import java.util.concurrent.TimeUnit

object HttpUtil {

    private var client: OkHttpClient = OkHttpClient()

    init {
        client.newBuilder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .build()
    }

    fun getHttp(url: String, result: HttpResult) {
        val getRequest = Request.Builder().url(BuildConfig.SERVER_URL + url).build()
        commonResult(getRequest, result)
    }

    fun getHandlerError(context: BaseActivityV2, url: String, block: (String) -> Unit) {
        context.showLoading()
        try {
            val getRequest = Request.Builder().url(BuildConfig.SERVER_URL + url).build()
            client.newCall(getRequest).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    context.runOnUiThread {
                        context.showToast(e.message.toString())
                        context.dismissLoading()
                    }
                }

                override fun onResponse(call: Call, response: Response) {
                    val str = response.body()
                    if (str == null) {
                        context.runOnUiThread {
                            context.showToast("服务器异常,请稍后再试")
                            context.dismissLoading()
                        }

                    } else {
                        context.runOnUiThread {
                            val resultStr = str.string()
                            block(resultStr)
                        }
                    }
                }
            })
        } catch (e: Exception) {
            context.dismissLoading()
            context.showToast("服务器异常,请稍后再试")
        }
    }



    fun postWithBodyHandlerError(context: BaseActivityV2,url: String,any: Any?,block: (String) -> Unit) {
        context.showLoading()
        try {
            val request = Request.Builder()//创建Request 对象。
            request.url(BuildConfig.SERVER_URL + url)
            if (any != null) {
                val body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), Gson().toJson(any))
                request.post(body)
            }
            client.newCall(request.build()).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    context.runOnUiThread {
                        context.showToast(e.message.toString())
                        context.dismissLoading()
                    }
                }
                override fun onResponse(call: Call, response: Response) {
                    val str = response.body()
                    if (str == null) {
                        context.runOnUiThread {
                            context.showToast("服务器异常,请稍后再试")
                            context.dismissLoading()
                        }
                    } else {
                        context.runOnUiThread {
                            val resultStr = str.string()
                            block(resultStr)
                        }
                    }
                }
            })
        }catch (e: Exception) {
            context.dismissLoading()
            context.showToast("服务器异常,请稍后再试")
        }
    }


    fun postHttpWithBody(url: String, result: HttpResult, any: Any?) {
        val request = Request.Builder()//创建Request 对象。
        request.url(BuildConfig.SERVER_URL + url)
        if (any != null) {
            val body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), Gson().toJson(any))
            request.post(body)
        }
        commonResult(request.build(), result)
    }

    private fun commonResult(getRequest: Request, result: HttpResult) {
        client.newCall(getRequest).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                result.error(e.message.toString())
            }

            override fun onResponse(call: Call, response: Response) {
                val str = response.body()
                if (str == null) {
                    result.error("服务器异常,请稍后再试")
                } else {
                    val resultStr = str.string()
                    result.success(resultStr)
                }
            }
        })
    }
}

interface HttpResult {
    fun success(str: String)
    fun error(error: String)
}
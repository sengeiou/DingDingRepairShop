package com.android.ctgapp.http

/**
 * 创建时间:2019/1/10
 * 作者:LiBW
 * 描述:下载监听接口
 */
interface DownloadListener {
    fun onSuccess()
    fun onFailed()
    fun onProgress(progress: Int)
}

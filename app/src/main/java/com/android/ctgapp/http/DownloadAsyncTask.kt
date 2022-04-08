package com.android.ctgapp.http

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.AsyncTask
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.File
import java.io.RandomAccessFile
import android.os.Build
import androidx.core.content.FileProvider
import com.android.ctgapp.BuildConfig.FILE_PROVIDER
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.util.MyLog


/**
 * 创建时间:2019/1/10
 * 作者:LiBW
 * 描述:下载app更新包专用
 */
class DownloadAsyncTask(private val downloadListener: DownloadListener, private val downloadUrl: String, private val context: Context) : AsyncTask<String, Int, Int>() {
    private val typeSuccess = 0//下载成功
    private val typeFailed = 1//下载失败
    private var lastProgress = 0//下载进度

    //文件名称
    private val filename = downloadUrl.substring(downloadUrl.lastIndexOf("/"))

    //下载地址
//    private val directory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).path
    private val directory = context.getExternalFilesDir(null)?.absolutePath

    private val file = File(directory + filename)

    override fun doInBackground(vararg params: String): Int {
        MyLog.d("进入AsyncTask下载APK")
        BaseApplication.isDownloadApk = true
        var currentLength = 0L//下载长度
        val downloadUrl = params[0]//可以使用传入时候execute()方法内传入的下载地址或者构造方法的时候传入的下载地址都可以
        val fileLength = fileLength(downloadUrl)//获取文件总长度
        MyLog.d(file.name)
        if (file.exists()) {
//            currentLength = file.length()//如果文件存在了就将当前文件长度记录下来继续下载
            file.delete()//如果需要重新下载就删除这个文件
        }

        if (fileLength == 0L) {//如果获取的文件长度为0则失败
            return typeFailed
        } else if (currentLength == fileLength) {//如果获取的文件长度和下载的文件长度相等则下载完毕
            return typeSuccess
        }
        //使用OkHttp进行APK下载
        val client = OkHttpClient()
        val request = Request.Builder().addHeader("RANGE", "bytes=$currentLength-")
            .url(downloadUrl).build()
        val response = client.newCall(request).execute()
        if (response != null) {
            val inputStream = response.body()?.byteStream()
            val saverFile = RandomAccessFile(file, "rw")
            saverFile.seek(currentLength)
            val b = ByteArray(1024)
            var total = 0
            var len = inputStream!!.read(b)
            while (len != -1) {
                total += len
                saverFile.write(b, 0, len)
                val progress = ((total + currentLength) * 100 / fileLength).toInt()

                publishProgress(progress)
                len = inputStream.read(b)
            }
            response.body()!!.close()
            inputStream.close()
            saverFile.close()
            return typeSuccess
        }
        return typeFailed
    }

    override fun onProgressUpdate(vararg values: Int?) {
        val progress = values[0]
        if (progress!! > lastProgress) {
            downloadListener.onProgress(progress)
            MyLog.d("下载进度:$progress")
            lastProgress = progress
        }
    }

    override fun onPostExecute(result: Int?) {
        BaseApplication.isDownloadApk = false
        when (result) {
            typeSuccess -> {
                downloadListener.onSuccess()
                installApk()
            }
            typeFailed -> downloadListener.onFailed()
        }
    }

    //安装APK
    private fun installApk() {
        MyLog.d("安装APP")
        val intent = Intent(Intent.ACTION_VIEW)
        intent.setDataAndType(Uri.parse("file://$file"), "application/vnd.android.package-archive")
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            val contentUri = FileProvider.getUriForFile(context, FILE_PROVIDER, file)
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            intent.setDataAndType(contentUri, "application/vnd.android.package-archive")
        } else {
            intent.setDataAndType(Uri.parse("file://$file"), "application/vnd.android.package-archive")
        }
        context.startActivity(intent)
        downloadListener.onSuccess()
        //杀掉APP
        android.os.Process.killProcess(android.os.Process.myPid())
    }

    //获取文件长度
    private fun fileLength(url: String): Long {
        val client = OkHttpClient()
        val request = Request.Builder().url(url).build()
        val response = client.newCall(request).execute()
        return if (response != null && response.isSuccessful) {
            val length = response.body()?.contentLength() as Long
            response.body()!!.close()
            length
        } else {
            0
        }
    }
}
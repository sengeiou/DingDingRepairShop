package com.android.ctgapp.enum.chart

import android.content.Context
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.chart.ThreadPoolManager
import java.io.*
import java.net.HttpURLConnection
import java.net.URL
import kotlin.concurrent.thread

object ChartFileUtil1 {
    /**
     *添加描述时间: 1/19/21
     *描述: 修改用户头像并返回当前头像的缓存地址 如果有OSS地址表示更新头像 没有OSS地址则为获取头像
     */
    fun changeUserHeaderFile(context: Context, userId: Int, ossPath: String? = null): String {
        val fileRootPath = context.getExternalFilesDir(null)?.absolutePath + "user"
        val rootFile = File(fileRootPath)
        //如果文件夹不存在 创建新文件文件夹
        if (!rootFile.exists() && !rootFile.isDirectory) {
            rootFile.mkdir()
        }
        val userPath = "$fileRootPath/$userId"
        MyLog.d("目标文件地址:$userPath")
        val userFile = File(userPath)
        //如果文件夹不存在 创建新文件文件夹
        if (!userFile.exists() && !userFile.isDirectory) {
            userFile.mkdir()
        }
        //如果没有OSS地址则为获取用户头像
        if (ossPath == null && ossPath == "") {
            userFile.list()?.forEach {
                return "$userPath/$it"
            }
            return ""
        }
        MyLog.d("别往下走了奥")
        //获取到的用户头像地址
        val userImagePath = "$userPath/$ossPath"
        val userImageFile = File(userImagePath)

        //判断文件夹是否为空
        if (userFile.list() != null && userFile.list()!!.isNotEmpty()) {
            //文件夹不为空判断文件是否存在  //文件存在不需要更新头像 不存在则清空文件夹后重新创建
            if (!userImageFile.exists()) {
                MyLog.d("用户文件不存在,但是文件夹内有文件表示头像更新了 删除所有后重建")
                val content = userFile.list()
                MyLog.d("文件数量:${content?.size}")
                content?.forEach {
                    MyLog.d("找到的文件名称:$it")
                    val file = File("$userPath/$it")
                    file.delete()
                }
                userImageFile.createNewFile()
                //删除所有文件后新建头像文件
                getFileByUrl1(ossHeader + ossPath, userImagePath)
            }
        } else {
            MyLog.d("文件:走到这里来了?")
//            MyLog.d("文件不存在 创建文件")
            userImageFile.createNewFile()
            //新建头像 文件夹是空的
//            getFileByUrl(imageHeader + ossPath, userImagePath)
            getFileByUrl1(ossHeader + ossPath, userImagePath)
        }
        return userImagePath
    }


    private fun getFileByUrl1(imageUrl: String, newFilePath: String) {
        ThreadPoolManager.execute(Runnable {
           MyLog.d("文件:头像地址是:$imageUrl")
           MyLog.d("文件:头像oss地址是:$newFilePath")

           var conn: HttpURLConnection? = null
           try {
               conn = URL(imageUrl).openConnection() as HttpURLConnection
               conn.connect()
               conn.inputStream.use { input ->
                   BufferedOutputStream(FileOutputStream(newFilePath)).use { output ->
                       input.copyTo(output)
                       MyLog.d("文件:读取完毕")
                   }
               }
           } catch (e: IOException) {
               MyLog.d("文件:错误:${e.message}")
           } finally {
               conn?.disconnect()
           }
       })
    }
}
package com.android.ctgapp.util

import android.content.ContentResolver
import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.provider.MediaStore
import java.io.File
import java.io.FileOutputStream

object MyFileUtil {
    //将uri临时存储一个图片然后转换成文件
    fun changeFile(context: Context, uri: Uri?): File? {
        val imgFile = context.getExternalFilesDir("image")
        var file: File? = null
        if (!imgFile!!.exists()) {
            imgFile.mkdir()
        }
        try {
            file = File(
                imgFile.absolutePath + File.separator +
                        System.currentTimeMillis().toString() + ".jpg"
            )
            // 使用openInputStream(uri)方法获取字节输入流
            val fileInputStream = context.contentResolver.openInputStream((uri)!!)
            val fileOutputStream = FileOutputStream(file)
            val buffer = ByteArray(1024)
            var byteRead: Int
            while (-1 != (fileInputStream!!.read(buffer).also { byteRead = it })) {
                fileOutputStream.write(buffer, 0, byteRead)
            }
            fileInputStream.close()
            fileOutputStream.flush()
            fileOutputStream.close()
            return file
            // 文件可用新路径 file.getAbsolutePath()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return file
    }

    //华为手机失效不好用了
    fun getImgRealFilePath(context: Context, uri: Uri?): String? {
        if (null == uri) return null
        val scheme = uri.scheme
        var data: String? = null
        when {
            scheme == null -> data = uri.path
            ContentResolver.SCHEME_FILE == scheme -> {
                data = uri.path
            }
            ContentResolver.SCHEME_CONTENT == scheme -> {
                val cursor: Cursor = context.contentResolver.query(uri, arrayOf(MediaStore.Images.ImageColumns.DATA), null, null, null)!!
                if (cursor.moveToFirst()) {
                    val index = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA)
                    if (index > -1) {
                        data = cursor.getString(index)
                    }
                }
                cursor.close()
            }
        }
        return data
    }


    fun getVideoRealFilePath(context: Context, uri: Uri?): String? {
        if (null == uri) return null
        val scheme = uri.scheme
        var data: String? = null
        when {
            scheme == null -> data = uri.path
            ContentResolver.SCHEME_FILE == scheme -> {
                data = uri.path
            }
            ContentResolver.SCHEME_CONTENT == scheme -> {
                val cursor: Cursor = context.contentResolver.query(uri, arrayOf(MediaStore.Video.VideoColumns.DATA), null, null, null)!!
                if (cursor.moveToFirst()) {
                    val index = cursor.getColumnIndex(MediaStore.Video.VideoColumns.DATA)
                    if (index > -1) {
                        data = cursor.getString(index)
                    }
                }
                cursor.close()
            }
        }
        return data
    }




}
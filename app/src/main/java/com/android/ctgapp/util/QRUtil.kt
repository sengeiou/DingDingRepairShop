package com.android.ctgapp.util

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.util.Log
import android.widget.Toast
import com.android.ctgapp.BuildConfig.FILE_PROVIDER
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import java.io.File


object QRUtil {
    fun create2DCode(str: String?): Bitmap? {
        //生成二维矩阵,编码时要指定大小,
        //不要生成了图片以后再进行缩放,以防模糊导致识别失败
        try {
            val matrix = MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, 200, 200)
            val width = matrix.width
            val height = matrix.height
            Log.d("WY+", "宽高为：$width|$height")
            //  二维矩阵转为一维像素数组（一直横着排）
            val pixels = IntArray(width * height)
            for (y in 0 until height) {
                for (x in 0 until width) {
                    if (matrix[x, y]) {
                        pixels[y * width + x] = -0x1000000
                    } else {
                        pixels[y * width + x] = -0x1 //新加，不然图片都是黑色的
                    }
                }
            }
            val bitmap: Bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
            // 通过像素数组生成bitmap, 具体参考api
            bitmap.setPixels(pixels, 0, width, 0, 0, width, height)
            return bitmap
        } catch (e: WriterException) {
            e.printStackTrace()
        }
        return null
    }

    fun shareWeChatFriend(context: Context, picFile: File?) {
        if (PlatformUtil.isInstallApp(context, PlatformUtil.PACKAGE_WECHAT)) {
            val intent = Intent()
            val cop = ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareImgUI")
            intent.component = cop
            intent.action = Intent.ACTION_SEND
            intent.type = "image/*"
            if (picFile != null) {
                if (picFile.isFile && picFile.exists()) {
                    val uri: Uri = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        FileProvider.getUriForFile(context, FILE_PROVIDER, picFile)
                    } else {
                        Uri.fromFile(picFile)
                    }
                    intent.putExtra(Intent.EXTRA_STREAM, uri)
                }
            }
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(Intent.createChooser(intent, "Share"))
        } else {
            Toast.makeText(context, "您需要安装微信客户端", Toast.LENGTH_LONG).show()
        }
    }
}

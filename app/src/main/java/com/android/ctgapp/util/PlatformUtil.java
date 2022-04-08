package com.android.ctgapp.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Environment;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

public class PlatformUtil {

    public static final String PACKAGE_WECHAT = "com.tencent.mm";
    public static final String PACKAGE_MOBILE_QQ = "com.tencent.mobileqq";
    public static final String PACKAGE_QZONE = "com.qzone";
    public static final String PACKAGE_SINA = "com.sina.weibo";

    // 判断是否安装指定app
    public static boolean isInstallApp(Context context, String app_package){
        final PackageManager packageManager = context.getPackageManager();
        List<PackageInfo> pInfo = packageManager.getInstalledPackages(0);
        if (pInfo != null) {
            for (int i = 0; i < pInfo.size(); i++) {
                String pn = pInfo.get(i).packageName;
                if (app_package.equals(pn)) {
                    return true;
                }
            }
        }
        return false;
    }


    //将bitmap转为File
    public static File getFile(Context context,Bitmap bitmap) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 50, baos);
//        File file = new File(Environment.getExternalStorageDirectory() + "/temp.jpg");
        File file = new File(context.getExternalFilesDir(null).getAbsolutePath() + "/temp.jpg");
        try {
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            InputStream is = new ByteArrayInputStream(baos.toByteArray());
            int x = 0;
            byte[] b = new byte[1024 * 100];
            while ((x = is.read(b)) != -1) {
                fos.write(b, 0, x);
            }
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }
//    //返回文件地址
//    public static String getFile(Bitmap bitmap) {
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        bitmap.compress(Bitmap.CompressFormat.JPEG, 50, baos);
//        File file = new File(Environment.getExternalStorageDirectory() + "/temp.jpg");
//        try {
//            file.createNewFile();
//            FileOutputStream fos = new FileOutputStream(file);
//            InputStream is = new ByteArrayInputStream(baos.toByteArray());
//            int x = 0;
//            byte[] b = new byte[1024 * 100];
//            while ((x = is.read(b)) != -1) {
//                fos.write(b, 0, x);
//            }
//            fos.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return file;
//    }
}
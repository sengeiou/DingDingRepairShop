package com.android.ctgapp.util

import android.Manifest
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import com.android.ctgapp.BuildConfig
import java.lang.StringBuilder

object MyPermissionUtil {
    fun jumpToPermissionDialog(unSelect:List<String>,context: Context){
        //编写权限提示
        val sb = StringBuilder()
        unSelect.forEach {
            when (it) {
                Manifest.permission.CAMERA -> sb.append("相机,")
                Manifest.permission.READ_EXTERNAL_STORAGE -> sb.append("读取手机存储,")
                Manifest.permission.WRITE_EXTERNAL_STORAGE -> sb.append("写入手机存储,")
                Manifest.permission.READ_CONTACTS -> sb.append("读取联系人,")
                Manifest.permission.WRITE_CONTACTS -> sb.append("写入联系人,")
                else->sb.append("相应,")
            }
        }
        var str = sb.toString().substring(0, sb.toString().length - 1)
        if (unSelect.size > 1) {
            str += "等"
        }
        context.commonDialog("请手动打开${str}权限") {
            jumpToPermissionSetting(context)
        }
    }

    //根据不同手机跳转到权限设置页面
    private fun jumpToPermissionSetting(context: Context) {
        val brand = getPhoneBrand()
        MyLog.d("权限手机品牌:$brand")
        when {
            "HUAWEI" in brand -> {
                try {
                    val intent = Intent()
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    val comp = ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity") //华为权限管理
                    intent.component = comp
                    context.startActivity(intent)
                } catch (e: Exception) {
                    MyLog.d("权限权限2:${e.message}")
                    MyLog.d("权限权限2:${e.printStackTrace()}")
                    e.printStackTrace()
                    context.startActivity(getAppDetailSettingIntent(context))
                }
            }
            "Xiaomi" in brand->{
                MyLog.d("权限进来了么")
                try { // MIUI 8
                    val localIntent = Intent("miui.intent.action.APP_PERM_EDITOR")
                    localIntent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity")
                    localIntent.putExtra("extra_pkgname", context.packageName)
                    context.startActivity(localIntent)
                } catch (e: java.lang.Exception) {
                    try { // MIUI 5/6/7
                        val localIntent = Intent("miui.intent.action.APP_PERM_EDITOR")
                        localIntent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity")
                        localIntent.putExtra("extra_pkgname", context.packageName)
                        context.startActivity(localIntent)
                    } catch (e1: java.lang.Exception) { // 否则跳转到应用详情
                        context.startActivity(getAppDetailSettingIntent(context))
                    }
                }
            }
            "MeiZu" in brand->{
                try {
                    val intent = Intent("com.meizu.safe.security.SHOW_APPSEC")
                    intent.addCategory(Intent.CATEGORY_DEFAULT)
                    intent.putExtra("packageName", BuildConfig.APPLICATION_ID)
                    context.startActivity(intent)
                } catch (e: java.lang.Exception) {
                    e.printStackTrace()
                    context.startActivity(getAppDetailSettingIntent(context))
                }
            }
            else->{
                context.startActivity(getAppDetailSettingIntent(context))
            }
        }
    }

    private fun getAppDetailSettingIntent(context: Context): Intent {
        val localIntent = Intent()
        localIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        localIntent.action = "android.settings.APPLICATION_DETAILS_SETTINGS"
        localIntent.data = Uri.fromParts("package", context.packageName, null)
        return localIntent
    }


    /**获取手机品牌 */
    private fun getPhoneBrand(): String {
        val brand = Build.BRAND
        val brand1 = Build.MANUFACTURER
        return brand + "和" + brand1
    }


    /**如果有底部导航栏 获取底部导航栏高度 */
    fun getBottomNavigatorHeight(context: Context): Int {
        val rid = context.resources.getIdentifier("config_showNavigationBar", "bool", "android")
        if (0 != rid) {
            val resourceId = context.resources.getIdentifier("navigation_bar_height", "dimen", "android")
            return context.resources.getDimensionPixelSize(resourceId)
        }
        return 0
    }
}
package com.android.ctgapp.base

import android.content.pm.ActivityInfo
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.ctgapp.widget.dialog.LoadingDialog

/**
 *作者:LiBW
 *创建日期: 2020/8/15
 *描述:Activity基类
 */
abstract class BaseActivity : AppCompatActivity() {
    val loading: LoadingDialog by lazy { LoadingDialog(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        //将activity入栈
        AppManager.instance.addActivity(this)
        //保持APP竖屏
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        changeTransparentStatusBar()
        changeStatusIconColor(true)
        event()
        click()
    }

    fun showLoading() {
        loading.show()
    }

    fun dismissLoading() {
        loading.dismiss()
    }
    /**获取布局*/
    abstract fun getLayout(): Int

    /**布局加载完毕处理操作*/
    abstract fun event()

    /**点击事件*/
    abstract fun click()



    override fun onDestroy() {
        super.onDestroy()
        loading.dismiss()
        //将Activity出栈
        AppManager.instance.finishActivity(this)
    }

    /**
     * 切换为透明状态栏
     */
    private fun changeTransparentStatusBar() {
        //沉浸状态栏
        val decorView = window.decorView
        val option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        decorView.systemUiVisibility = option
        // 将状态栏设置成透明色
        window.statusBarColor = Color.TRANSPARENT
    }


    /**
     * 切换状态栏图标颜色
     * @param isDark true为黑色 false为白色
     */
    protected fun changeStatusIconColor(isDark: Boolean) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val decorView = window.decorView
            var vis = decorView.systemUiVisibility
            vis = if (isDark) {
                vis or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            } else {
                vis and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv()
            }
            decorView.systemUiVisibility = vis
        }
    }
}
package com.android.ctgapp.util

import android.app.Activity
import android.app.AlertDialog
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.SharedPreferences
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Build
import android.text.Editable
import android.text.TextWatcher
import android.util.Base64
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.viewModelScope
import com.android.ctgapp.BuildConfig.ossHeader
import com.android.ctgapp.R
import com.android.ctgapp.activity.login.LoginActivity
import com.android.ctgapp.base.AppManager
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.base.BaseViewModel
import com.android.ctgapp.entity.ResultEntity
import com.android.ctgapp.widget.CustomToast
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.google.android.material.tabs.TabLayout
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.scwang.smartrefresh.layout.SmartRefreshLayout
import kotlinx.coroutines.launch
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.startActivity
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File
import java.io.FileOutputStream
import java.math.BigDecimal
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.set
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine


object BoWenUtils {
    /**
     * 判断是否为DEBUG模式
     * @return true即为DEBUG模式
     */
    fun isDEBUG(): Boolean {
        val info = BaseApplication.getContext().applicationInfo
        return (info.flags and ApplicationInfo.FLAG_DEBUGGABLE != 0)
    }
}


fun FragmentActivity.showFragment(fragment: Fragment, layout: Int) {
    val manager = supportFragmentManager.beginTransaction()
    //先判断Fragment是否已经加入Fragment
    if (!fragment.isAdded) manager.add(layout, fragment)
    manager.show(fragment).commit()
}

fun String?.ossUrlHandler(): String {
    return if (handlerNull().startsWith("http")) {
        handlerNull()
    } else {
        ossHeader + handlerNull()
    }
}


fun FragmentActivity.hideFragment(fragment: Fragment) {
    if (!fragment.isHidden) supportFragmentManager.beginTransaction().hide(fragment).commit()
}

/**
 * dp转PX
 */
fun Float.toPx(context: Context): Int {
    val scale = context.resources.displayMetrics.density
    return (this * scale + 0.5f).toInt()
}


const val sharedName = "ShareData"

val appSharedPreference: SharedPreferences by lazy {
    BaseApplication.getContext().getSharedPreferences(sharedName, Context.MODE_PRIVATE)
}

val appSharedPreferenceWithApp: SharedPreferences by lazy {
    BaseApplication.getContext().getSharedPreferences("app", Context.MODE_PRIVATE)
}

/**
 * 将数据保存到SharedPreference
 */
fun Any.sharedSave(key: String) {
    when (this.javaClass.simpleName) {
        "String" -> appSharedPreference.edit().putString(key, this as String).apply()
        "Integer" -> appSharedPreference.edit().putInt(key, this as Int).apply()
        "Boolean" -> appSharedPreference.edit().putBoolean(key, this as Boolean).apply()
        "Float" -> appSharedPreference.edit().putFloat(key, this as Float).apply()
        "Long" -> appSharedPreference.edit().putLong(key, this as Long).apply()
        else -> appSharedPreference.edit().putString(key, this.toString()).apply()
    }
}

fun Any.sharedSaveWithApp(key: String) {
    when (this.javaClass.simpleName) {
        "String" -> appSharedPreferenceWithApp.edit().putString(key, this as String).apply()
        "Integer" -> appSharedPreferenceWithApp.edit().putInt(key, this as Int).apply()
        "Boolean" -> appSharedPreferenceWithApp.edit().putBoolean(key, this as Boolean).apply()
        "Float" -> appSharedPreferenceWithApp.edit().putFloat(key, this as Float).apply()
        "Long" -> appSharedPreferenceWithApp.edit().putLong(key, this as Long).apply()
        else -> appSharedPreferenceWithApp.edit().putString(key, this.toString()).apply()
    }
}


/**
 * 从SharedPreference中取值
 */
fun sharedGet(key: String, def: Any): Any {
    return when (def.javaClass.simpleName) {
        "String" -> appSharedPreference.getString(key, def as String)!!
        "Integer" -> appSharedPreference.getInt(key, def as Int)
        "Boolean" -> appSharedPreference.getBoolean(key, def as Boolean)
        "Long" -> appSharedPreference.getLong(key, def as Long)
        "Float" -> appSharedPreference.getFloat(key, def as Float)
        else -> appSharedPreference.getString(key, "")!!
    }
}

fun sharedGetWithApp(key: String, def: Any): Any {
    return when (def.javaClass.simpleName) {
        "String" -> appSharedPreferenceWithApp.getString(key, def as String)!!
        "Integer" -> appSharedPreferenceWithApp.getInt(key, def as Int)
        "Boolean" -> appSharedPreferenceWithApp.getBoolean(key, def as Boolean)
        "Long" -> appSharedPreferenceWithApp.getLong(key, def as Long)
        "Float" -> appSharedPreferenceWithApp.getFloat(key, def as Float)
        else -> appSharedPreferenceWithApp.getString(key, "")!!
    }
}

/**
 * 保存数据到SharedPreference
 */
fun sharedSave(save: SharedPreferences.Editor.() -> Unit) {
    val editor = appSharedPreference.edit()
    editor.save()
    editor.apply()
}

fun sharedSaveWithApp(save: SharedPreferences.Editor.() -> Unit) {
    val editor = appSharedPreferenceWithApp.edit()
    editor.save()
    editor.apply()
}


/*** 监听EditText输入框变化*/
fun EditText.handlerText(handlerText: (String) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) {
            handlerText.invoke(p0.toString())
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }
    })
}


/**
 * key和value 封装到RequestBody中
 */
fun handlerBody(vararg pair: Pair<String, Any?>): RequestBody {
    val map: MutableMap<String, Any?> = HashMap()
    pair.forEach {
        map[it.first] = it.second
    }
    return RequestBody.create(
        MediaType.parse("application/json; charset=utf-8"),
        getGson().toJson(map)
    )
}


fun handlerBody(map: Map<String, Any?>): RequestBody {

    return RequestBody.create(
        MediaType.parse("application/json; charset=utf-8"),
        getGson().toJson(map)
    )
}

/**手机号码检测*/
fun phoneNumCheck(phoneNum: String): Boolean {
    //定义手机号码的规则
    val regex = "1[3456789]\\d{9}"
    //调用功能，判断即可
    return phoneNum.matches(Regex(regex))
}


/***将实体类封装到body中*/
fun handlerBodyEntity(any: Any): RequestBody {
    return RequestBody.create(
        MediaType.parse("application/json; charset=utf-8"),
        getGson().toJson(any)
    )
}

var nowTime = 0L

fun exitApp(activity: Activity) {
    val currentTime = System.currentTimeMillis()
    MyLog.d("时间戳:$currentTime")
    //两次点击间隔小于2秒可以退出
    if (currentTime - nowTime < 2000) {
        AppManager.instance.exitApp(activity)
    } else {
        activity.showToast("再次点击退出")
    }
    nowTime = currentTime
}

/**
 * 设置EditText编辑框内容
 */
fun setEditText(msg: String): Editable {
    return Editable.Factory.getInstance().newEditable(msg)
}

fun EditText.textSet(msg: Any?) {
    this.text = Editable.Factory.getInstance().newEditable(msg.handlerNull())
}


fun getGson(): Gson {
    return GsonBuilder().serializeNulls().create()
}

fun copyTextToPhone(context: Context, string: String) {
    (context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager).setPrimaryClip(ClipData.newPlainText(null, string))
}

/**
 * 处理null字符串
 */
fun Any?.handlerNull(): String {
    val data = this.toString()
    return if (data == "null" || data.isEmpty()) {
        ""
    } else {
        data.trim()
    }
}
/**
 * 处理null字符串
 */
fun Any?.handlerDoubleNull(): Double {
    val data = this.toString()
    return if (data == "null" || data.isEmpty()) {
        0.0
    } else {
        data.toDouble()
    }
}
fun Any?.noDataHandler(): String {
    val data = this.toString()
    return if (data == "null" || data.isEmpty()) {
        "暂无数据"
    } else {
        data
    }
}
fun View.myShake() {
    YoYo.with(Techniques.Shake).duration(300)
        .repeat(0).playOn(this)
}

fun String.removeTheEndStr(): String {
    return if (isEmpty()) "" else substring(0, length - 1)

}

/***拼接OSS中的图片*/
fun OssImageHandler(url: String): String {
    return ossHeader + url
}

/***结束上啦加载和下拉刷新*/
fun SmartRefreshLayout.over() {
    finishRefresh()
    finishLoadMore()
}

/*** 格式化网络请求数据 返回通用ResultEntity*/
fun initData(data: String): ResultEntity<*> {
    return getGson().fromJson(data, ResultEntity::class.java)
}

/***封装处理回调 将data内容带回*/
fun Context.handlerData(data: String, block: (data: Any?) -> Unit) {
    val result = getGson().fromJson(data, ResultEntity::class.java)
    if (result.status == 0) {
        block(result.data)
    } else {
        showToast(result.msg)
    }
}


/**根据换皮颜色更换默认图标颜色*/
//fun ImageView.handlerViewByTheme(context: Context, drawable: Int) {
//    val svg = VectorDrawableCompat.create(context.resources, drawable, context.theme)
//    svg?.setTint(resources.getColor(R.color.colorAccent, context.theme))
//}
//
//fun Context.handlerDrawableByTheme(drawable: Int): Drawable? {
//    val svg = VectorDrawableCompat.create(resources, drawable, theme)
//    svg?.setTint(resources.getColor(R.color.colorAccent, theme))
//    return svg
//}


/***获取颜色*/
fun Context.colorGet(color: Int): Int {
    return resources.getColor(color, theme)
}


/***处理网络请求回调*/
fun Context.handlerHttpResult(data: String, block: () -> Unit) {
    if (data.isEmpty()) {
        showToast("服务器异常,请稍后再试")
    } else {
        val entity = getGson().fromJson(data, ResultEntity::class.java)
        if (entity.status == 0) {
            block()
        } else {
            showToast(entity.msg)
        }
    }
}

fun Fragment.showToast(msg: Any?) {
    catchError(requireActivity(), msg)
}

fun Context.showToast(msg: Any?) {
    catchError(this, msg)
}


fun getNewUUid(): String {
    return UUID.randomUUID().toString().replace("-", "")
}

private fun catchError(context: Context, msg: Any?) {
    val c = BaseApplication.getContext()
    when {
        "Internal Server Error" in msg.handlerNull() -> CustomToast.showToast(c, "服务器异常,请稍后再试")
        "Failed to connect" in msg.handlerNull() -> CustomToast.showToast(c, "服务器异常,请稍后再试")
        "time out" in msg.handlerNull() -> CustomToast.showToast(c, "连接服务器超时,请稍后再试")
        "timed out" in msg.handlerNull() -> CustomToast.showToast(c, "连接服务器超时,请稍后再试")
        "Timeout" in msg.handlerNull() -> CustomToast.showToast(c, "连接服务器超时,请稍后再试")
        "Unavailable" in msg.handlerNull() -> CustomToast.showToast(c, "服务器异常,请稍后再试")
        "failed to connect" in msg.handlerNull() -> CustomToast.showToast(c, "服务器异常,请稍后再试")
        "NOT FUND" in msg.handlerNull() -> CustomToast.showToast(c, "服务器异常,请稍后再试")
        "重新登录" in msg.handlerNull() || "身份校验失败" in msg.handlerNull() -> {
            appSharedPreference.edit().clear().apply()
            MyLog.d("重新登录123")
            //CustomToast.showToast(context, msg.handlerNull()) 该方法会内存泄露
            CustomToast.showToast(c, msg.handlerNull())
            try {
                context.startActivity<LoginActivity>()
            } catch (e: java.lang.Exception) {
                c.showToast("请重新登录")
            }
            MyLog.d("去登录页面了么")
        }
        else -> CustomToast.showToast(c, msg.handlerNull())
    }
}


/***ViewModel携程 处理错误*/
fun BaseViewModel.launch(block: suspend () -> Unit) = viewModelScope.launch {
    try {
        block()
    } catch (e: Throwable) {
        MyLog.d("携程出现问题:${e.message.handlerNull()}")
        setError(e.message.handlerNull())
    }
}

/***处理双击 (延迟500毫秒触发下一次点击)*/
var clickTime = System.currentTimeMillis()
fun handlerClick(doSomething: () -> Unit) {
    if (System.currentTimeMillis() - clickTime > 1000) {
        clickTime = System.currentTimeMillis()
        doSomething()
    }
}

/**
 * 将接口回调信息格式化为字符串
 */
suspend fun Call<ResponseBody>.awaitSync(): String {
    return suspendCoroutine {
        enqueue(object : Callback<ResponseBody> {

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                MyLog.d("携程onFailure:$t")
                if (t.message.toString() == "timeout") {
                    it.resumeWithException(RuntimeException("连接服务器超时,请稍后再试"))
                } else {
                    MyLog.d("服务器直接错误了:${t.message.handlerNull()}")
                    it.resumeWithException(RuntimeException(t.message.handlerNull()))
                }
            }

            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                try {
                    val error = response.errorBody()
                    if (error != null) {
                        val msg: String
                        val errorMsg = error.string()
                        val json = JSONObject(errorMsg)
                        msg = when {
                            "msg" in errorMsg -> json.getString("msg")
                            "error" in errorMsg -> json.getString("error")
                            "message" in errorMsg -> json.getString("message")
                            else -> "发生错误,请稍后再试"
                        }
                        it.resumeWithException(RuntimeException(msg.handlerNull()))
                        return
                    }

                    val body = response.body()
                    body?.let { b ->
                        it.resume(b.string())
                    }
                    if (body == null) {
                        it.resumeWithException(java.lang.RuntimeException("出错啦,请稍后再试"))
                    }
                } catch (e: Exception) {
                    it.resumeWithException(RuntimeException(e.message.handlerNull()))
                    MyLog.d("携程Exception:${e.message.handlerNull()}")
                }
            }
        })
    }
}

fun handlerPassword(password: String): String {
    return Base64.encodeToString(password.toByteArray(), Base64.DEFAULT)
}

private val permissionList = ArrayList<String>()//未申请的权限

/**切换item隐藏展示状态*/
fun ImageView.setArrow(show: Boolean, view: View? = null) {
    imageResource = if (show) R.drawable.ic_arrow_grey_up else R.drawable.ic_arrow_grey_down
    view?.let {
        it.visibility = if (show) View.VISIBLE else View.GONE
    }
}


/***权限检测*/
fun Activity.handlerPermission(permissions: Array<String>, doSomething: () -> Unit) {
    permissionList.clear()
    //对权限进行排查将未申请的权限放入List
    for (i in permissions.indices) {
        if (ContextCompat.checkSelfPermission(this, permissions[i]) != PackageManager.PERMISSION_GRANTED) {
            permissionList.add(permissions[i])
        }
    }
    if (permissionList.size > 0) {//有权限为通过需要申请
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(permissions, PERMISSION_APPLY_CODE)
        }
    } else {
        doSomething()
    }
}

/***收回软键盘*/
fun Activity.hideEditTextView() {
    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(window.decorView.windowToken, 0)
}

//搜索框 处理附带隐藏软键盘
inline fun EditText.handlerEditTextSearch(activity: Activity, crossinline block: (msg: String) -> Unit) {
    //搜索框的搜索按钮
    this.setOnEditorActionListener { _, actionId, _ ->
        if (actionId == EditorInfo.IME_ACTION_SEARCH) {
            //收起键盘
            activity.hideEditTextView()
            block(this.text.toString())
        }
        false
    }
}

/**处理横向选择器*/
fun TabLayout.handleSelect(block: (String) -> Unit) {
    addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
        override fun onTabSelected(tab: TabLayout.Tab) {
            block.invoke(tab.text.handlerNull())
        }

        override fun onTabUnselected(tab: TabLayout.Tab?) {

        }

        override fun onTabReselected(tab: TabLayout.Tab?) {

        }
    })
}


fun DrawerLayout.bottomCannotClick() {
    this.addDrawerListener(object : DrawerLayout.DrawerListener {
        override fun onDrawerSlide(drawerView: View, slideOffset: Float) {

        }

        override fun onDrawerOpened(drawerView: View) {
            drawerView.isClickable = true
        }

        override fun onDrawerClosed(drawerView: View) {

        }

        override fun onDrawerStateChanged(newState: Int) {

        }
    })
}

/**返回设置的TAG*/
fun TabLayout.handlerSelectReturnTag(block: (String) -> Unit) {
    this.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
        override fun onTabSelected(tab: TabLayout.Tab) {
            block(tab.tag.handlerNull())
        }

        override fun onTabUnselected(tab: TabLayout.Tab?) {

        }

        override fun onTabReselected(tab: TabLayout.Tab?) {

        }

    })
}

fun TabLayout.handlerSelectReturnText(block: (String) -> Unit) {
    this.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
        override fun onTabSelected(tab: TabLayout.Tab) {
            block(tab.text.handlerNull())
        }

        override fun onTabUnselected(tab: TabLayout.Tab?) {

        }

        override fun onTabReselected(tab: TabLayout.Tab?) {

        }

    })
}


/***文件转换为MultipartBody.Part*/
fun fileToMultipartBodyPart(ketStr: String, file: File): MultipartBody.Part {
    val requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file)
    return MultipartBody.Part.createFormData(ketStr, file.name, requestBody)
}

/***文字转换为MultipartBody.Part*/
fun textToMultipartBodyPart(keyStr: String, value: String): MultipartBody.Part {
    return MultipartBody.Part.createFormData(keyStr, value)
}

/***通用Dialog*/
fun Context.commonDialog(msg: String, block: () -> Unit) {
    AlertDialog.Builder(this).setTitle(msg)
        .setPositiveButton("确认") { _, _ ->
            block()
        }.setNegativeButton("返回") { _, _ ->
        }.show()
}


fun changeFile(context: Context, uri: Uri?): File? {
    //创建image文件夹
    val imgFile = context.getExternalFilesDir("image")
    var file: File? = null
    if (!imgFile!!.exists()) {
        imgFile.mkdir()
    }
    try {
        //创建按时间戳生成的图片文件
        file = File(imgFile.absolutePath + File.separator + System.currentTimeMillis() + ".jpg")
        // 使用openInputStream(uri)方法获取字节输入流
        val fileInputStream = context.contentResolver.openInputStream(uri!!)
        val fileOutputStream = FileOutputStream(file)
        val buffer = ByteArray(1024)
        var byteRead: Int
        while (-1 != fileInputStream!!.read(buffer).also { byteRead = it }) {
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

/**截取小数点后两位*/
fun handlerDecimalsForTwo(bigDecimal: BigDecimal): String {
    val fm = DecimalFormat("#.##")
    val money = StringBuilder(fm.format(bigDecimal))

    if ("." !in money) {
        money.append(".00")
    } else {
        val str = money.substring(money.indexOf("."), money.length)
        if (str.length == 1) {
            money.append("0")
        }
    }
    return money.toString()
}

fun handlerDecimalsForTwo(money: String): String {
    return try {
        handlerDecimalsForTwo(BigDecimal(money))
    } catch (e: Exception) {
        "0"
    }
}

/*
     * 将时间戳转换为时间
     */
fun handlerCurrentTimeToString(s: Long): String {
    val res: String
    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.CHINA)
    val lt: Long = s
    val date = Date(lt)
    res = simpleDateFormat.format(date)
    return res
}

/**检查网络状态*/
fun checkNetwork(context: Context, block: () -> Unit) {
    val manager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val network = manager.getNetworkCapabilities(manager.activeNetwork)
    if (network == null) {
        context.showToast("请查看网络连接")
    } else {
        block()
    }
}


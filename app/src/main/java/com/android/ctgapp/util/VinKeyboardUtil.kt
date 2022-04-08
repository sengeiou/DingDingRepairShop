package com.android.ctgapp.util

import android.app.Activity
import android.content.Context
import android.inputmethodservice.Keyboard
import android.inputmethodservice.KeyboardView
import android.os.Build
import android.text.InputType
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.EditText
import com.android.ctgapp.R
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method

class VinKeyboardUtil(private val mActivity: Activity, edit: EditText) {
    private var confirmListener: MyKeyBoardCallback? = null
    private val mContext: Context
    private val mKeyboardView: KeyboardView
    private val mEdit: EditText

    /**
     * VIN码键盘
     */
    private val vin_keyboard: Keyboard

    fun setListener(confirmListener: MyKeyBoardCallback?) {
        this.confirmListener = confirmListener
    }


    /**
     * 判定是否是中文的正则表达式 [\\u4e00-\\u9fa5]判断一个中文 [\\u4e00-\\u9fa5]+多个中文
     */
    private val listener: KeyboardView.OnKeyboardActionListener = object : KeyboardView.OnKeyboardActionListener {
        override fun swipeUp() {}
        override fun swipeRight() {}
        override fun swipeLeft() {}
        override fun swipeDown() {}
        override fun onText(text: CharSequence) {}
        override fun onRelease(primaryCode: Int) {}
        override fun onPress(primaryCode: Int) {}
        override fun onKey(primaryCode: Int, keyCodes: IntArray) {
            val editable = edit.text
            val start = edit.selectionStart
            if (primaryCode == -3) { // 回退
                if (editable != null && editable.isNotEmpty()) {
                    //没有输入内容时软键盘重置为省份简称软键盘
                    if (start > 0) {
                        editable.delete(start - 1, start)
                    }
                }
            } else {
                //禁止输入QIO
                if (primaryCode == 81 || primaryCode == 73 || primaryCode == 79) {
                    return
                }
                //点击确认
                if (primaryCode == -1) {
                    confirmListener!!.onConfirmClick()
                    return
                }
                editable!!.insert(start, primaryCode.toChar().toString()) //输入内容
            }
        }
    }

    /**
     * 软键盘展示状态
     */
    val isShow: Boolean
        get() = mKeyboardView.visibility == View.VISIBLE

    /**
     * 软键盘展示
     */
    fun showKeyboard() {
        mKeyboardView.visibility = View.VISIBLE
        startAnimation()
    }

    /**
     * 软键盘隐藏
     */
    fun hideKeyboard() {
        stopAnimation()
        mKeyboardView.visibility = View.GONE
    }

    //获取键盘高度
    fun getKeyBoardHeight():Int{
      return mKeyboardView.height
    }

    /**
     * 禁掉系统软键盘
     */
    fun hideSoftInputMethod() {
        mActivity.window.setSoftInputMode(
            WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        )
        val currentVersion = Build.VERSION.SDK_INT
        var methodName: String? = null
        if (currentVersion >= 16) {
            // 4.2
            methodName = "setShowSoftInputOnFocus"
        } else if (currentVersion >= 14) {
            // 4.0
            methodName = "setSoftInputShownOnFocus"
        }
        if (methodName == null) {
            mEdit.inputType = InputType.TYPE_NULL
        } else {
            val cls = EditText::class.java
            val setShowSoftInputOnFocus: Method
            try {
                setShowSoftInputOnFocus = cls.getMethod(
                    methodName,
                    Boolean::class.javaPrimitiveType
                )
                setShowSoftInputOnFocus.isAccessible = true
                setShowSoftInputOnFocus.invoke(mEdit, false)
            } catch (e: NoSuchMethodException) {
                mEdit.inputType = InputType.TYPE_NULL
                e.printStackTrace()
            } catch (e: IllegalAccessException) {
                e.printStackTrace()
            } catch (e: IllegalArgumentException) {
                e.printStackTrace()
            } catch (e: InvocationTargetException) {
                e.printStackTrace()
            }
        }
    }



    private var openAnimation: Animation? = null
    private var closeAnimation: Animation? = null
    private fun init() {
        openAnimation = AnimationUtils.loadAnimation(mActivity, R.anim.anim_entry_from_bottom)
        closeAnimation = AnimationUtils.loadAnimation(mActivity, R.anim.anim_leave_from_bottom)
        closeAnimation?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(arg0: Animation) {}
            override fun onAnimationRepeat(arg0: Animation) {}
            override fun onAnimationEnd(arg0: Animation) {}
        })
    }

    private fun startAnimation() {
        if (openAnimation != null) {
            mKeyboardView.startAnimation(openAnimation)
        }
    }

    private fun stopAnimation() {
        if (closeAnimation != null) {
            mKeyboardView.startAnimation(closeAnimation)
        }
    }

    init {
        mContext = mActivity
        mEdit = edit
        init()
        vin_keyboard = Keyboard(mContext, R.xml.customer_vin_key_boardv2)
        mKeyboardView = mActivity
            .findViewById(R.id.mVinKeyboardView)
        mKeyboardView.keyboard = vin_keyboard
        mKeyboardView.isEnabled = true
        mKeyboardView.isPreviewEnabled = false
        mKeyboardView.setOnKeyboardActionListener(listener)
    }

    interface MyKeyBoardCallback {
        fun onConfirmClick()
    }
}


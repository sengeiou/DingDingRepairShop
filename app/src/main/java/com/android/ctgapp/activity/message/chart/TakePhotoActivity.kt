package com.android.ctgapp.activity.message.chart

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.ctgapp.R
import com.hbzhou.open.flowcamera.CaptureImageButton.Companion.BUTTON_STATE_BOTH
import com.otaliastudios.cameraview.controls.Hdr
import com.otaliastudios.cameraview.controls.WhiteBalance
import com.ys.camera.CustomCameraView
import com.ys.camera.listener.FlowCameraListener
import com.ys.camera.util.LogUtil
import java.io.File


/**
 *作者:LiBW
 *创建日期: 1/19/21
 *描述: 短按拍照长按拍视频
 */
class TakePhotoActivity : AppCompatActivity() {

    private var context: Context? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_take_phtot)
        context = this
        val flowCamera = findViewById<CustomCameraView>(R.id.flowCamera)
        // 绑定生命周期  不绑定无法预览
        flowCamera.setBindToLifecycle(this)
        // 设置白平衡模式
        flowCamera.setWhiteBalance(WhiteBalance.AUTO)
        // 设置只支持单独拍照拍视频还是都支持
        // BUTTON_STATE_ONLY_CAPTURE  BUTTON_STATE_ONLY_RECORDER  BUTTON_STATE_BOTH
        flowCamera.setCaptureMode(BUTTON_STATE_BOTH)
        // 开启HDR
        flowCamera.setHdrEnable(Hdr.ON)
        // 设置最大可拍摄小视频时长 S
        flowCamera.setRecordVideoMaxTime(10)
        // 设置拍照或拍视频回调监听
        flowCamera.setFlowCameraListener(object : FlowCameraListener {
            // 录制完成视频文件返回
            override fun recordSuccess(file: File) {
//                showToast(file.absolutePath)
                val intent = Intent()
                intent.putExtra("data", file.absolutePath)
                setResult(Config.REQUEST_CODE_REQUEST_VIDEO, intent)
                finish()
            }

            // 操作拍照或录视频出错
            override fun onError(videoCaptureError: Int, message: String, cause: Throwable?) {
                LogUtil.e(
                    videoCaptureError.toString().plus("----").plus(message).plus("---").plus(
                        cause.toString()
                    )
                )
            }

            // 拍照返回
            override fun captureSuccess(file: File) {
                val intent = Intent()
                intent.putExtra("data", file.absolutePath)
                setResult(Config.RESULT_CODE_REQUEST_CAMERA, intent)
                finish()
            }
        })
        //左边按钮点击事件
        flowCamera.setLeftClickListener {
            finish()
        }

    }


}
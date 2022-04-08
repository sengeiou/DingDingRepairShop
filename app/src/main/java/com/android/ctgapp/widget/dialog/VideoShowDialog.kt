package com.android.ctgapp.widget.dialog

import android.net.Uri
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import androidx.fragment.app.DialogFragment
import com.android.ctgapp.R
import kotlinx.android.synthetic.main.layout_video_show.*

/**
 *作者:LiBW
 *创建日期: 2020/9/23
 *描述: 视频播放Dialog
 */
class VideoShowDialog(private val url: String) : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.layout_video_show, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.videoDialog)
        dialog?.setCancelable(true)
        dialog?.setCanceledOnTouchOutside(true)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        dialog?.window?.attributes?.windowAnimations = R.style.dialogAnimation
    }

    override fun onStart() {
        super.onStart()
        dialog?.let {
            val display = DisplayMetrics()
            requireActivity().windowManager.defaultDisplay.getMetrics(display)
            it.window?.setLayout(display.widthPixels / 4 * 3, display.heightPixels / 4 * 3)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val uri = Uri.parse(url)
        mVideoVV.setMediaController(MediaController(requireContext()))
        //播放完成
        mVideoVV.setOnCompletionListener {
            dismiss()
        }
        mVideoVV.setVideoURI(uri)
        mVideoVV.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (mVideoVV != null && mVideoVV.isPlaying) {
            mVideoVV.stopPlayback()
        }
    }
}
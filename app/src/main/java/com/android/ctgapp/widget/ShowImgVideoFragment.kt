package com.android.ctgapp.widget

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.fragment.app.DialogFragment
import cn.jzvd.Jzvd
import com.android.ctgapp.R
import com.android.ctgapp.databinding.ItemImageVideoBinding
import com.bumptech.glide.Glide

/**
 *作者:LiBW
 *创建日期: 2021/7/7
 *描述:视频图片 框架
 */
class ShowImgVideoFragment(private val url: String, private val isVideo: Boolean = false) : DialogFragment() {
    private var _binding: ItemImageVideoBinding? = null
    private val binding get() = _binding!!
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = ItemImageVideoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mBackIv.setOnClickListener {
            dismiss()
        }
        if (isVideo) {
            binding.mTitleTv.text = "视频"
            binding.mPhotoImageIV.visibility = View.GONE
            binding.mVideoRV.visibility = View.VISIBLE
            init(url)

        } else {
            binding.mTitleTv.text = "图片"
            binding.mPhotoImageIV.visibility = View.VISIBLE
            binding.mVideoRV.visibility = View.GONE
            Glide.with(requireActivity()).load(url).into(binding.mPhotoImageIV)
        }

    }

    override fun onPause() {
        super.onPause()
        Jzvd.releaseAllVideos()
    }


    private fun init(url: String) {
        //聊天点击图片
        binding.mVideoView.setUp(url, "")
        Glide.with(this).load(url).into( binding.mVideoView.posterImageView)

    }


    override fun onStart() {
        super.onStart()
        //进入动画
        dialog?.window?.attributes?.windowAnimations = R.style.fromBottomAnimation
        //沉浸状态栏
        val decorView = dialog?.window?.decorView
        val option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        decorView?.systemUiVisibility = option
        // 将状态栏设置成透明色
        dialog?.window?.statusBarColor = Color.TRANSPARENT
        //全屏
        dialog?.window?.setLayout(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //占全屏没有Margin
        setStyle(STYLE_NORMAL, R.style.CommonCompanyDialog)

    }

}
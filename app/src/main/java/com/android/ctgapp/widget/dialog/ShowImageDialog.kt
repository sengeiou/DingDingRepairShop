package com.android.ctgapp.widget.dialog

import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.android.ctgapp.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_image_dialog.*

class ShowImageDialog(private val url: String) : DialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.CommonDialog)
        dialog?.setCancelable(true)
        dialog?.setCanceledOnTouchOutside(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.item_image_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(requireActivity()).load(url)
            .
                error(R.drawable.icon_image_faild)

            .into(mShowImageIV)
    }

    override fun onStart() {
        super.onStart()
        dialog?.let {
            val display= DisplayMetrics()
            requireActivity().windowManager.defaultDisplay.getMetrics(display)
            it.window?.setLayout(display.widthPixels/4*3, display.heightPixels/4*3)
        }
    }
}
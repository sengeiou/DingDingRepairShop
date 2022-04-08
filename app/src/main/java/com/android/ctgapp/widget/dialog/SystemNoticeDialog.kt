package com.android.ctgapp.widget.dialog

import android.os.Bundle
import android.view.View
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseDialogFragment

class SystemNoticeDialog :BaseDialogFragment(){
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {

    }

    override fun getLayout()= R.layout.dialog_system_notice

}
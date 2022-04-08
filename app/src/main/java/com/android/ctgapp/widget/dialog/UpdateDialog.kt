package com.android.ctgapp.widget.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.android.ctgapp.R
import com.android.ctgapp.http.DownloadAsyncTask
import com.android.ctgapp.http.DownloadListener
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.handlerNull
import kotlinx.android.synthetic.main.layout_update_dialog.*


/**
 *作者:LiBW
 *创建日期: 2020/8/22
 *描述:App更新 Dialog
 */
class UpdateDialog(context: Context, themeResId: Int, private val downloadUrl: String, private val because: String) : Dialog(context, themeResId) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_update_dialog)
//        mBecauseTV.text = because.handlerNull()
        mProgressTV.text = because.handlerNull()
        val download = DownloadAsyncTask(object : DownloadListener {
            override fun onSuccess() {

            }

            override fun onFailed() {
                dismiss()
                MyLog.d("升级升级失败了")
            }

            override fun onProgress(progress: Int) {
                mUpdateViw.handlerPercent(progress)
                MyLog.d("升级升级百分比:$progress")
//                val progressStr = "正在升级中...$progress%"
//                mProgressTV.text = progressStr
            }
        }, downloadUrl, context)
        download.execute(downloadUrl)
    }

    override fun onBackPressed() {

    }
}

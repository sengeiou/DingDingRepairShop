package com.android.ctgapp.activity.mine.team

import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.LabelsAdapter
import com.android.ctgapp.base.BaseActivity
import com.android.ctgapp.entity.mine.LabelEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.activity_select_position.*

/**
 *作者:LiBW
 *创建日期: 2020/10/16
 *描述:选择职位 页面
 */
class SelectPositionActivity : BaseActivity() {
    private val mViewModel: SelectPositionViewMode by lazy { ViewModelProvider(this)[SelectPositionViewMode::class.java] }


    private var isManager = false
    var currentLabelId = -1
    var currentLabelName = ""

    private var labelCreate = ""

    override fun event() {
        //上个页面带过来的id
        currentLabelId = intent.getIntExtra(MyConstants.POSITION, -1)
        showLoading()
        mViewModel.getLabels()
        mViewModel.error.observe(this, Observer {
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.getLabelResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("获取标签回调:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, LabelEntity::class.java).data
                data?.let { list ->
                    list.forEach { item ->
                        if (item.id == currentLabelId) {
                            item.isSelected = true
                        }
                    }
                    val mAdapter = LabelsAdapter(this, list)
                    mLabelRV.adapter = mAdapter
                    mLabelRV.layoutManager = GridLayoutManager(this, 4, RecyclerView.VERTICAL, false)
                }
            }
        })
        mViewModel.addLabelResult.observe(this, Observer {
            dismissLoading()
            MyLog.d("添加标签回调:$it")
            handlerData(it) {
                showToast("新建标签成功")
                mLabelCreateET.textSet("")
                mViewModel.getLabels()
            }
        })


    }

    override fun click() {
        //确认职位和添加职位按钮
        mConfirmBTN.setOnClickListener {
            if (labelCreate.isEmpty()) {
                val intent = Intent()
                intent.putExtra(MyConstants.LABEL_NAME, currentLabelName)
                intent.putExtra(MyConstants.LABEL_ID, currentLabelId)
                setResult(1000, intent)
                finish()
            } else {
                mViewModel.addLabel(labelCreate)
            }
        }

        //职位编辑框 焦点监听
        mPositionET.setOnFocusChangeListener { _, hasFocus ->
            MyLog.d("有焦点么:$hasFocus")

        }

        //添加职位输入框
        mLabelCreateET.handlerText {
            labelCreate = it
            if (it.isNotEmpty()) {
                mConfirmBTN.text = "添加职位"
            } else {
                mConfirmBTN.text = "确认"
            }
        }
    }

    override fun getLayout() = R.layout.activity_select_position

}
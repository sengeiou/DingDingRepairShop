package com.android.ctgapp.widget.dialog

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.R
import com.android.ctgapp.activity.mine.company.CompanyContactSelectActivity
import com.android.ctgapp.activity.mine.company.CompanyDetailActivity
import com.android.ctgapp.base.BaseDialogFragment
import com.android.ctgapp.callback.ContactSelectListener
import com.android.ctgapp.callback.ContactSelectManager
import com.android.ctgapp.entity.ContactUnAddEntity
import com.android.ctgapp.entity.LinkmanUseEntity
import com.android.ctgapp.util.*
import kotlinx.android.synthetic.main.item_link_man_edit_add_dialog.*
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textColorResource

/**
 *作者:LiBW
 *创建日期: 2020/10/11
 *描述: 编辑和添加联系人 传入entity则为编辑模式 Dialog
 */
class LinkmanEditAddDialog(private val listener: AddOverListener, private val entity: LinkmanUseEntity? = null) : BaseDialogFragment(), ContactSelectListener {
    override fun getLayout() = R.layout.item_link_man_edit_add_dialog
    //每次进入都让viewModel重新获取
    private val mViewModel: LinkmanEditAddViewModel by lazy { ViewModelProvider(this)[LinkmanEditAddViewModel::class.java] }

    private var linkmanId = -1
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        ContactSelectManager.setCallback(this)
        val activity = requireActivity() as CompanyDetailActivity

        MyLog.d("新建了")

        mViewModel.mResult.observe(this, Observer {
            activity.loading.dismiss()
            MyLog.d("增删改查结果:$it")
            val data = initData(it)
            if (data.status == 0) {
                listener.addOver()
                requireActivity().showToast("操作成功")
                dismiss()
            } else {
                requireActivity().showToast(data.msg)
            }
        })


        mViewModel.error.observe(this, Observer {
            activity.loading.dismiss()
            MyLog.d("错误:$it")
            requireActivity(). showToast(it)
        })

        //编辑模式下变为修改和删除
        if (entity != null) {
            linkmanId = entity.id
            //编辑模式无法修改联系人
            mSelectContactLL.isEnabled = false
            mConfirmBTN.text = "修改"
            mCancelBTN.text = "删除"
            mCancelBTN.backgroundResource = R.drawable.bg_btn_red_circel
            mCancelBTN.textColorResource = R.color.white
            mContactNameTV.text = entity.name.handlerNull()
            mRemarkET.textSet(entity.remark.handlerNull())
            //修改
            mConfirmBTN.setOnClickListener {
                MyLog.d("点击了修改")
                if (linkmanId != -1) {
                    mViewModel.updateLinkman(linkmanId, mRemarkET.text.handlerNull())
                } else {
                    requireActivity().showToast("出现错误,请稍后再试")
                }
            }
            //删除
            mCancelBTN.setOnClickListener {
                MyLog.d("点击了删除")
                AlertDialog.Builder(requireActivity()).setTitle("提示！")
                    .setMessage("确定要删除吗？").setPositiveButton("确定") { _, _ ->
                        if (linkmanId != -1) {
                            mViewModel.deleteLinkman(linkmanId)
                        } else {
                            requireActivity().showToast("出现错误,请稍后再试")
                        }
                    }.setNegativeButton("取消") { dialogInterface, _ ->
                        dialogInterface.dismiss()
                    }.create().show()
            }
        } else {
            mSelectContactLL.isEnabled = true
            mConfirmBTN.text = "添加"
            mCancelBTN.text = "取消"
            mCancelBTN.backgroundResource = R.drawable.bg_btn_blue_light
            mCancelBTN.textColorResource = R.color.colorAccent
            //确认
            mConfirmBTN.setOnClickListener {
                MyLog.d("点击了添加")
                if (linkmanId != -1) {
                    mViewModel.addLinkman(linkmanId, mRemarkET.text.handlerNull())
                } else {
                    requireActivity().showToast("请选择一个联系人进行添加")
                }
            }
            //取消
            mCancelBTN.setOnClickListener {
                dismiss()
            }
        }
        //选择联系人
        mSelectContactLL.setOnClickListener {
            requireActivity().startActivity<CompanyContactSelectActivity>()
        }

        //X按钮
        mCancelIV.setOnClickListener {
            dismiss()
        }

    }



    //选择添加的联系人
    override fun onContactSelected(data: ContactUnAddEntity.DataBean.RecordsBean) {
        mContactNameTV.text = data.linkmanName.handlerNull()
        linkmanId = data.userId
    }

    interface AddOverListener {
        fun addOver()
    }
}
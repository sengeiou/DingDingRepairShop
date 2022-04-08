package com.android.ctgapp.widget.dialog.company

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.LinkmanAdapter
import com.android.ctgapp.base.BaseCompanyDialogFragment
import com.android.ctgapp.entity.LinkmanEntity
import com.android.ctgapp.util.MyLog
import com.android.ctgapp.util.getGson
import com.android.ctgapp.util.handlerHttpResult
import com.android.ctgapp.widget.dialog.LinkmanEditAddDialog
import kotlinx.android.synthetic.main.item_external_contacts.*
import java.util.ArrayList

/**
 *作者:LiBW
 *创建日期: 2020/10/10
 *描述:对外联系人 Dialog
 */
class ExternalContactsCompanyDialog(private val mCompanyId: Int, private var canEdit: Boolean = true) : BaseCompanyDialogFragment(), LinkmanEditAddDialog.AddOverListener, LinkmanAdapter.RefreshListener {
    val mViewModel: ExternalContactsCompanyViewModel by lazy { ViewModelProvider(requireActivity())[ExternalContactsCompanyViewModel::class.java] }
    val list: ArrayList<LinkmanEntity.DataBean> = ArrayList()
    val mAdapter: LinkmanAdapter by lazy { LinkmanAdapter(canEdit,requireActivity(), list, this) }
    override fun viewIsCreated(view: View, savedInstanceState: Bundle?) {
        mContactsRV.adapter = mAdapter
        mContactsRV.layoutManager = LinearLayoutManager(requireContext())
        mViewModel.getExternalContact(mCompanyId)
        //获取对外联系人回调
        mViewModel.linkmanResult.observe(this, Observer {
            requireActivity().handlerHttpResult(it) {
                MyLog.d("Fragment中的对外联系人:$it")
                val entity = getGson().fromJson(it, LinkmanEntity::class.java).data
                list.clear()
                entity?.let {
                    list.addAll(entity)
                    mAdapter.notifyDataSetChanged()
                }
            }
        })
        if (!canEdit) {
            mEditIV.visibility = View.GONE
        }


        //编辑
        mEditIV.setOnClickListener {
            it.visibility = View.GONE
            mAddTV.visibility = View.VISIBLE
            repeat(list.size) { index ->
                list[index].editModel = true
                mAdapter.notifyDataSetChanged()
            }
        }
        //添加
        mAddTV.setOnClickListener {
            it.visibility = View.GONE
            mEditIV.visibility = View.VISIBLE
            repeat(list.size) { index ->
                list[index].editModel = false
                mAdapter.notifyDataSetChanged()
            }
            LinkmanEditAddDialog(this).show(requireActivity().supportFragmentManager, "")
        }
        //关闭
        mDeleteIV.setOnClickListener {
            dismiss()
        }
    }


    override fun getLayout() = R.layout.item_external_contacts
    override fun addOver() {
        mViewModel.getExternalContact(mCompanyId)
    }

    override fun goRefresh() {
        mViewModel.getExternalContact(mCompanyId)
    }
}
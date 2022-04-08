package com.android.ctgapp.activity.address

import android.app.AlertDialog
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.adapter.home.address.AddressAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityAddressListBinding
import com.android.ctgapp.entity.AddressEntity
import com.android.ctgapp.util.*
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 11/20/20
 *描述:收货地址列表 页面
 */
class AddressListActivity : BaseActivityV2(), AddressAdapter.ChangeAddress {
    val binding by lazy { ActivityAddressListBinding.inflate(layoutInflater) }
    override fun getLayout() = binding.root
    private val mViewModel: AddressListViewModel by lazy { ViewModelProvider(this)[AddressListViewModel::class.java] }
    private val mList = ArrayList<AddressEntity.DataBean>()
    val mAdapter: AddressAdapter by lazy { AddressAdapter(this, mList, this) }

    //删除的ID列表
    private val deleteAddressIds = ArrayList<Int>()

    //是否可以退出本页面
    private val canExit: Boolean by lazy { intent.getBooleanExtra(MyConstants.CAN_EXIT, true) }

    override fun event() {
        binding.mAddressRV.adapter = mAdapter
        binding.mAddressRV.layoutManager = LinearLayoutManager(this)

        mViewModel.error.observe(this, Observer {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, Observer {
            loading.dismiss()
            MyLog.d("地址列表:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, AddressEntity::class.java).data
                data?.let { list ->
                    mList.clear()
                    mList.addAll(list)
                    mAdapter.notifyDataSetChanged()
                }
            }
        })

        mViewModel.defaultResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("设置默认选项:$it")
            val data = initData(it)
            if (data.status == 0) {
                getData()
            } else {
                showToast(data.msg)
            }
        })

        mViewModel.deleteResult.observe(this, Observer {
            loading.dismiss()
            MyLog.d("删除地址:$it")
            val data = initData(it)
            if (data.status == 0) {
                showToast("地址删除成功")
                getData()
            } else {
                showToast(
                    data.msg
                )
            }
        })
    }

    private fun getData() {
        loading.show()
        mViewModel.getAddress()
    }

    override fun onResume() {
        super.onResume()
        getData()
    }

    override fun click() {
        //添加收货地址
        binding.mAddAddressBTN.setOnClickListener {
            startActivity<AddressEditActivity>()
        }
    }


    override fun deleteAddress(addressId: Int) {
        AlertDialog.Builder(this).setTitle("确认删除该地址么")
            .setPositiveButton("确认") { _, _ ->
                loading.show()
                deleteAddressIds.add(addressId)
                if (canExit) {
                    MyLog.d("发出去了1")
                    val intent = Intent()
                    intent.putExtra(MyConstants.DELETE_ADDRESS_IDS, deleteAddressIds)
                    setResult(1000, intent)
                    MyLog.d("发出去了2")
                }
                mViewModel.deleteAddress(addressId.handlerNull())
            }.setNegativeButton("返回") { _, _ ->
            }.show()
    }

    override fun updateAddress(bean: AddressEntity.DataBean) {
        startActivity<AddressEditActivity>(MyConstants.ENTITY to getGson().toJson(bean))
    }

    override fun setDefault(bean: AddressEntity.DataBean) {
        MyLog.d("修改默认选项:${bean.isDefault}")
        loading.show()
        mViewModel.setDefault(bean)
    }

    override fun addressSelect(bean: AddressEntity.DataBean) {
        if (canExit) {
            val intent = Intent()
            intent.putExtra(MyConstants.ENTITY, getGson().toJson(bean))
            setResult(1000, intent)
            finish()
        }
    }
}
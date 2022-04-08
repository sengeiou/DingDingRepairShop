package com.android.ctgapp.activity.mine.company

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.adapter.mine.company.CompanyManagerShareAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityClientManagerSetBinding
import com.android.ctgapp.entity.mine.company.CompanyAllUserEntity
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserver
import com.android.ctgapp.http.ObserverListener
import com.android.ctgapp.util.*
import okhttp3.ResponseBody
import java.lang.StringBuilder

class ClientManagerSetActivity : BaseActivityV2() {
    //选择负责人(单选)
    private val mManagerCode = 100

    //选择共享人(多选)
    private val mShareCode = 101

    private val mResultCode by lazy { intent.getIntExtra(MyConstants.RESULT_CODE, -1) }
    private val mCompanyId by lazy { intent.getIntExtra(MyConstants.COMPANY_ID, -1) }

    //列表
    private val mList = ArrayList<CompanyAllUserEntity.DataBean>()
    private var mAdapter: CompanyManagerShareAdapter? = null
    private val mBinding by lazy { ActivityClientManagerSetBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    //当前负责人
    private val selectIds by lazy { intent.getIntegerArrayListExtra(MyConstants.ID) }
    private val selectName by lazy { intent.getStringExtra(MyConstants.NAME).handlerNull() }

    override fun event() {
        mAdapter = if (mResultCode == mManagerCode) {
            CompanyManagerShareAdapter(this, mList, true)
        } else {
            CompanyManagerShareAdapter(this, mList, false)
        }
        mBinding.mPersonRV.adapter = mAdapter
        mBinding.mPersonRV.layoutManager = LinearLayoutManager(this)

        val resultListener = object : ObserverListener {
            override fun onNext(t: ResponseBody) {
                loading.dismiss()
                val str = t.string().handlerNull()
                MyLog.d("公司所有用户回调:$str")
                handlerHttpResult(str) {
                    val data = getGson().fromJson(str, CompanyAllUserEntity::class.java).data
                    data?.let {
                        it.forEach { a ->
                            selectIds.forEach { b ->
                                if (a.id == b||a.name==selectName) {
                                    a.select = true
                                }
                            }
                        }
                        mList.addAll(it)
                        mAdapter?.notifyDataSetChanged()
                    }
                }
            }

            override fun onError(error: String) {
                loading.dismiss()
                showToast(error)
            }
        }
        ApiMethods.apiSubscribe(ApiMethods.retrofit.getCompanyAllUser(), MyObserver(resultListener))
    }

    private val saveListener = object : ObserverListener {
        override fun onNext(t: ResponseBody) {
            loading.dismiss()
            val str = t.string().handlerNull()
            MyLog.d("保存回调:$str")
            handlerHttpResult(str) {
                showToast("操作成功")
                finish()
            }
        }

        override fun onError(error: String) {
            loading.dismiss()
            showToast(error)
        }
    }


    override fun click() {
        //保存
        mBinding.mSaveBTN.setOnClickListener {
            if (mResultCode==mManagerCode){
                saveManager()
            }else{
                saveShare()
            }
        }
    }

    fun saveManager() {
        var id: Int? = null
        mList.forEach {
            if (it.select) id = it.id
        }
        ApiMethods.apiSubscribe(
            ApiMethods.retrofit.saveTagManagerShare(
                mCompanyId, responsiblePersonFlag = true, responsiblePersonId = id.handlerNull()
            ), MyObserver(saveListener)
        )
    }

    fun saveShare() {
        val sb= StringBuilder()
        mList.forEach {
            if (it.select) sb.append(it.id.handlerNull()+",")
        }
        val str= sb.handlerNull().removeTheEndStr()
        ApiMethods.apiSubscribe(
            ApiMethods.retrofit.saveTagManagerShare(
                mCompanyId, toUserIdFlag = true,  toUserIds= str
            ), MyObserver(saveListener)
        )
    }

}
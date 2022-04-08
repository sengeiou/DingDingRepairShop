package com.android.ctgapp.activity.mine.money

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.constraintlayout.utils.widget.ImageFilterView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.adapter.mine.RechargeHistoryChildAdapter
import com.android.ctgapp.adapter.mine.RechargeHistoryParentAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityRechargeMoneyHistoryBinding
import com.android.ctgapp.entity.RechargeHistoryEntity
import com.android.ctgapp.entity.mine.RechargeActivityEntity
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.MyDatePickerDialog
import kotlinx.android.synthetic.main.activity_company_balance.*
import java.util.*

/**
 *作者:LiBW
 *创建日期: 2021/12/23
 *描述: 充值记录 页面
 */
//class RechargeMoneyHistoryActivity : AppCompatActivity() ,MyDatePickerDialog.Callback{
//    var myDatePickerDialog:MyDatePickerDialog?=null
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_recharge_money_history)
//        if(myDatePickerDialog==null){
//            myDatePickerDialog= MyDatePickerDialog(this)
//        }
//        val mArrow: ImageFilterView =findViewById(R.id.mArrow)
//        mArrow.setOnClickListener{
//            myDatePickerDialog?.show(supportFragmentManager,"")
//        }
//    }
//
//    override fun getTime(year: Int, month: Int) {
//        myDatePickerDialog?.dismiss()
//    }
//}
class RechargeMoneyHistoryActivity : BaseActivityV2() ,MyDatePickerDialog.Callback{
    //val platformClientId by lazy{intent.getStringExtra("platformClientId")}
    //val fromCompanyId by lazy{intent.getStringExtra("fromCompanyId")}
    private val mBinding by lazy { ActivityRechargeMoneyHistoryBinding.inflate(layoutInflater) }
    private var mList = ArrayList<RechargeHistoryEntity.Data.Detail>()
    private val mAdapter by lazy { RechargeHistoryChildAdapter(this,mList) }
    //private val myDatePickerDialog:MyDatePickerDialog()
    private var page = 1
    private val mViewModel: MyMoneyPackageViewModel by lazy { ViewModelProvider(this)[MyMoneyPackageViewModel::class.java] }
    var year:String="1999"
    var month:String="1"
    override fun getLayout() = mBinding.root
    override fun event() {
       // mBinding.mRecyclerView.adapter=RechargeHistoryParentAdapter(this, arrayListOf("开","关","关","关"))
        mBinding.mRecyclerView.adapter = mAdapter
        mBinding.mRecyclerView.layoutManager=LinearLayoutManager(this)
        //MyDatePickerDialog(this).show(supportFragmentManager,"")

        //获取当前月份充值记录
        var tms = Calendar.getInstance()
       year=tms.get(Calendar.YEAR).handlerNull()
       month=savetwo(tms.get(Calendar.MONTH)+1).handlerNull()
        mBinding.mTime.text=year+"年"+month+"月"
        getData(year+"-"+month)
        mViewModel.error.observe(this, {
            //mBinding.mRefresh.over()
            dismissLoading()
            MyLog.d("错误:$it")
            showToast(it)
        })

        mViewModel.result.observe(this, { result ->
            //mBinding.mRefresh.over()
            dismissLoading()
            mRefresh.over()
            handlerHttpResult(result) {
                val data = getGson().fromJson(result, RechargeHistoryEntity::class.java).data

                data?.let {
                        dataBean ->
                    dataBean?.let{
                        mList.addAll(it.list)
                    }
                }
                mAdapter.notifyDataSetChanged()
            }
        })
    }

    override fun click() {
        mBinding.mArrow.setOnClickListener{
            var myDialog:MyDatePickerDialog= MyDatePickerDialog(this,year,month)
            myDialog?.show(supportFragmentManager, "")
        }
        mRefresh.setOnLoadMoreListener {
            page++
            getData("$year-$month")
        }
        mRefresh.setOnRefreshListener {
            page = 1
            mList.clear()
            getData("$year-$month")
        }
    }

    private fun getData(time:String) {
        MyLog.d("执行了没？")
        mViewModel.getRechargeRecordList(companyId = BaseApplication.supplyCompanyId,clientId = BaseApplication.clientCompanyId,search = time,page = page)
    }
    private  fun savetwo(data:Int):String{
        if(data<10){
            return "0"+data
        }else{
            return data.handlerNull()
        }

    }
    override fun getTime(year_p: Int, month_p: Int) {
        if(year!=year_p.handlerNull()||month!=savetwo(month_p).handlerNull()){
            year=year_p.handlerNull()
            month=savetwo(month_p).handlerNull()
            mList.clear()
            page=1
            getData(year+"-"+month)
            mBinding.mTime.text=year+"年"+month+"月"
        }
    }

    override fun onDestroy() {

        super.onDestroy()
    }
}
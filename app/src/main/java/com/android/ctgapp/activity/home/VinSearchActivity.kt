package com.android.ctgapp.activity.home

import android.Manifest
import android.content.Intent
import android.view.MotionEvent
import androidx.lifecycle.ViewModelProvider
import com.android.ctgapp.activity.home.enquiry.EnquiryActivity
import com.android.ctgapp.activity.home.shop.VulnerablePartShopActivity
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.databinding.ActivityVinSearchBinding
import com.android.ctgapp.entity.ResultEntity
import com.android.ctgapp.entity.VinSearchHistoryBean
import com.android.ctgapp.entity.VinSearchHistoryBeanList
import com.android.ctgapp.entity.home.CarConfigSelectBean
import com.android.ctgapp.entity.home.ResultListInfo
import com.android.ctgapp.entity.home.VinResultEntityV3
import com.android.ctgapp.util.*
import com.android.ctgapp.widget.dialog.CarInfoSelectDialog
import com.bumptech.glide.Glide
import com.ocrgroup.activity.VinScanActivity
import com.permissionx.guolindev.PermissionX
import org.jetbrains.anko.startActivity

/**
 *作者:LiBW
 *创建日期: 2020/11/3
 *描述: 车架号查询 页面 VIN 车辆信息 页面 VIN查询 页面
 */
class VinSearchActivity : BaseActivityV2(), CarInfoSelectDialog.CarInfoSelectCallBack {
    private val mBinding by lazy { ActivityVinSearchBinding.inflate(layoutInflater) }
    override fun getLayout() = mBinding.root
    private val mViewModel: VinSearchViewModel by lazy { ViewModelProvider(this)[VinSearchViewModel::class.java] }
    private var vinCode: String = ""
    private var carIntro = ""
    private var carIcon = ""
    private var carIntroDetail = ""
    private var epc = ""

    //VIN码软键盘
    private val vinKeyboardUtil by lazy { VinKeyboardUtil(this, mBinding.mSearchET) }

    //接收识别结果返回码
    private val vinResultCode = 101

    //用于询报价页面查询子配件详情
    private var mCarId = ""

    private var carBrand = ""
    private var carFactory = ""

    //车辆厂牌 查询匹配供应商使用 本田-广汽本田 组合
    private var carRange = ""
    private var mData = ""
    override fun event() {
        vinCode = intent.getStringExtra(MyConstants.VIN_CODE).handlerNull()
        mBinding.mSearchET.textSet(vinCode)
        loading.show()
        mViewModel.getCarInfo(vinCode)
        mViewModel.error.observe(this) {
            loading.dismiss()
            MyLog.d("错误:$it")
            showToast(it)
            finish()
        }

        mViewModel.result.observe(this) {
            loading.dismiss()
            MyLog.d("vin识别结果:$it")
            mData = it
            val entity = getGson().fromJson(it, ResultEntity::class.java)
            if (entity.data.handlerNull().isEmpty()) {
                showToast("未查询到相关车辆")
                finish()
                return@observe
            }
            handlerHttpResult(it) {
                val dataBean = getGson().fromJson(it, VinResultEntityV3::class.java).data
                //多个配置手动解析
                val mList = ArrayList<CarConfigSelectBean>()

                dataBean?.let { data ->
                    if (data.option != null) {
                        if (data.option!!.isNotEmpty()) {
                            data.option?.let { list ->
                                list.forEach { childBean ->
                                    var value = ""
                                    var name = ""
                                    val carId = childBean.carid.handlerNull()
                                    childBean.attributeList?.forEach {
                                        if (it.attributeName == "等级") {
                                            value = it.attributeValue.handlerNull()
                                        }
                                        if (it.attributeName == "配置") {
                                            name = it.attributeValue.handlerNull()
                                        }
                                    }
                                    val c = CarConfigSelectBean(carId, value, name)
                                    mList.add(c)
                                }
                            }
                            //选择车型配置
                            CarInfoSelectDialog(mList, this).show(supportFragmentManager, "")
                        } else {
                            mCarId = data.carid.handlerNull()
                        }
                    } else {
                        mCarId = data.carid.handlerNull()
                    }
                    Glide.with(this).load(data.logo.handlerNull()).into(mBinding.mLogoIV)
                    carIntroDetail = "${data.brand.handlerNull()} ${data.factory.handlerNull()} ${data.year.handlerNull()}款 ${data.series.handlerNull()}  ${data.sales.handlerNull()} ${data.displacement.handlerNull()}"
                    carIntro = carIntroDetail
                    mBinding.mCarTitleTV.text = carIntroDetail
                    carIcon = data.logo.handlerNull()
                    carBrand = data.brand.handlerNull()
                    carFactory = data.factory.handlerNull()
                    Glide.with(this).asBitmap().load(data.img).into(mBinding.mCarImage)
                    mCarId = data.carid.handlerNull()
                    epc = data.epc.handlerNull()
                    carRange = data.brand.handlerNull() + "-" + data.factory.handlerNull()
                    //将数据缓存到本地
                    handlerVinHistory(data)

                }
            }
        }
    }


    //将搜索记录存到本地
    private fun handlerVinHistory(vinData: VinResultEntityV3.DataBean) {
        //数据JSON
        val beanParent = VinSearchHistoryBeanList()
        //本条数据
        val bean = VinSearchHistoryBean()
        bean.time = System.currentTimeMillis()
        bean.brandImage = vinData.logo.handlerNull()
        bean.carInfo = carIntroDetail
        bean.vinCode = vinCode

        //历史数据
        val vinStr = sharedGetWithApp(MyConstants.VIN_HISTORY, "") as String
        if (vinStr.isNotEmpty()) {
            //如果有历史记录就进行处理
            val data = getGson().fromJson(vinStr, VinSearchHistoryBeanList::class.java).data
            data?.let { list ->
                //有重复的VIN码则删除该数据
                var removeBean: VinSearchHistoryBean? = null
                list.forEach {
                    if (vinCode == it.vinCode) {
                        removeBean = it
                    }
                }
                //找到存在的VIN码就删除掉
                if (removeBean != null) list.remove(removeBean)
                //只保存10条 达到10条则删掉最后一条
                if (list.size > 9) {
                    list.removeAt(list.size - 1)
                }
                //插入在第一条
                list.add(0, bean)
                beanParent.data = list
            }
        } else {
            //没有历史记录就创造一条
            beanParent.data = arrayListOf(bean)
        }
        sharedSaveWithApp {
            putString(MyConstants.VIN_HISTORY, getGson().toJson(beanParent))
        }
    }

    override fun click() {
        //配置详情
        mBinding.mCarInfoTV.setOnClickListener {
//            mBinding.mCarInfoTV.textColorResource= R.color.colorAccent
//            mBinding.mPartPhotoTV.textColorResource= R.color.text_gray_light


            startActivity<CarConfigDetailActivity>(MyConstants.CARD_INFO to mData)
        }
        //EPC配件图
        mBinding.mPartPhotoTV.setOnClickListener {
            if (mCarId.isEmpty()) {
                showToast("该车型暂不支持EPC配件图解析")
                return@setOnClickListener
            }
            startActivity<EnquiryActivity>(
                MyConstants.CAR_INTRO to carIntroDetail,
                MyConstants.CAR_BRAND to carBrand,
                MyConstants.CAR_FACTORY to carFactory,
                MyConstants.VIN_CODE to vinCode,
                MyConstants.EPC to epc,
                MyConstants.CAR_ID to mCarId,
                MyConstants.CAR_RANGE to carRange,
                MyConstants.GO_EPC to true

            )
        }

        //易损件
        mBinding.mVulnerablePartLL.setOnClickListener {
            startActivity<VulnerablePartShopActivity>(
                MyConstants.CAR_INTRO to carIntro,
                MyConstants.CAR_ICON to carIcon,
                MyConstants.VIN_CODE to vinCode
            )
        }
        //询报价
        mBinding.mOfferConsultingLL.setOnClickListener {
            startActivity<EnquiryActivity>(
                MyConstants.CAR_BRAND to carBrand,
                MyConstants.CAR_FACTORY to carFactory,
                MyConstants.CAR_INTRO to carIntroDetail,
                MyConstants.VIN_CODE to vinCode,
                MyConstants.EPC to epc,
                MyConstants.CAR_ID to mCarId,
                MyConstants.CAR_RANGE to carRange
            )
        }
        //现货
        mBinding.mSpotLL.setOnClickListener {
            showToast(MyConstants.FUNCTION_NOT_OPEN)
        }
        //VIN扫描
        mBinding.mScanVIN.setOnClickListener {
            mCarId = ""
            getVIN()
        }

        mBinding.mSearchET.handlerEditTextSearch(this) {
            if (it.isNotEmpty()) {
                startActivity<VinSearchActivity>(MyConstants.VIN_CODE to it)
            } else {
                showToast("请输入Vin码")
            }
        }
        //处理自定义键盘
        //隐藏系统软键盘
        vinKeyboardUtil.hideSoftInputMethod()
        mBinding.mSearchET.setOnClickListener {
            if (!vinKeyboardUtil.isShow) vinKeyboardUtil.showKeyboard()
        }
        mBinding.mSearchET.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus && !vinKeyboardUtil.isShow) {
                vinKeyboardUtil.showKeyboard()
            }
        }
        //自定义键盘确认键
        vinKeyboardUtil.setListener(object : VinKeyboardUtil.MyKeyBoardCallback {
            override fun onConfirmClick() {
                val it = mBinding.mSearchET.text.handlerNull()
                MyLog.d("点击确认了")
                if (it.isNotEmpty()) {
                    mViewModel.getCarInfo(it)
                    vinCode = it
                    vinKeyboardUtil.hideKeyboard()
                } else {
                    showToast("请输入Vin码")
                }
            }
        })
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        ev?.y?.let {
            if (it < 1486 && vinKeyboardUtil.isShow) {
                vinKeyboardUtil.hideKeyboard()
            }
        }
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (vinKeyboardUtil.isShow) {
            vinKeyboardUtil.hideKeyboard()
        }
        return super.onTouchEvent(event)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null && requestCode == vinResultCode) {
            //接收所有识别结果，图片
            val vinResult = data.getStringExtra("vinResult")
            //接收识别结果的状态码，0表示成功，其他值表示识别失败
            val rsCode = data.getIntExtra("recogCode", -1)
            // 添加结果结合
            val resultListInfo = ResultListInfo()
            if (rsCode == 0) {
                resultListInfo.key = "VIN"
                resultListInfo.value = vinResult
                vinResult?.let {
                    mViewModel.getCarInfo(it)
                    vinCode = it
                    mBinding.mSearchET.textSet(vinCode)
                }
            } else {
                resultListInfo.key = "识别失败"
                resultListInfo.value = "图像中未发现VIN码,errorCode:$rsCode"
                showToast("图像中未发现VIN码")
            }
        }
    }

    private fun getVIN() {
        val permissions = arrayOf(Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE)
        PermissionX.init(this).permissions(*permissions)
            .onExplainRequestReason { scope, deniedList ->
                val message = "Vin码扫描需要您同意以下权限才能正常使用"
                scope.showRequestReasonDialog(deniedList, message, "确定", "取消")
            }
            //被用户永久拒绝的权限
            .onForwardToSettings { _, deniedList ->
                MyPermissionUtil.jumpToPermissionDialog(deniedList, this)
            }
            .request { allGranted, _, _ ->
                if (allGranted) {
                    // 有权限，启动VIN码导入识别页面
                    val intent = Intent(this, VinScanActivity::class.java)
                    startActivityForResult(intent, vinResultCode)
                } else {
                    showToast("请开启相机的相应权限")
                }
            }
    }

    override fun onCarIdSelect(carID: String) {
        MyLog.d("出来了::$carID")
        mCarId = carID
    }


}
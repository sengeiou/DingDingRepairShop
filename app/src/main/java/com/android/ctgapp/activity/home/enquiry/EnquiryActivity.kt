package com.android.ctgapp.activity.home.enquiry


import android.app.Activity
import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.ctgapp.R
import com.android.ctgapp.activity.MainActivity
import com.android.ctgapp.activity.address.AddressListActivity
import com.android.ctgapp.activity.home.shop.EnquiryViewModel
import com.android.ctgapp.activity.home.shop.OrderConfirmViewModel
import com.android.ctgapp.adapter.home.BatchAddPartAdapter
import com.android.ctgapp.adapter.home.PurchaseAdapter
import com.android.ctgapp.adapter.home.enquiry.EnquiryQueryCompanyAdapterAdapter
import com.android.ctgapp.base.BaseActivityV2
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.databinding.ActivityEnquiryBinding
import com.android.ctgapp.entity.AddressEntity
import com.android.ctgapp.entity.CityEntity
import com.android.ctgapp.entity.deal.enquire.EnquireCheckEntity
import com.android.ctgapp.entity.home.BatchAddPartBean
import com.android.ctgapp.entity.home.BatchAddPartChildEntityV2
import com.android.ctgapp.entity.home.EnquiryQueryCompanyEntity
import com.android.ctgapp.entity.home.EnquiryQueryCompanyEntityChild
import com.android.ctgapp.entity.home.enquire.AllFileUploadEntity
import com.android.ctgapp.entity.home.enquire.BatchAddPartChildBean
import com.android.ctgapp.entity.home.enquire.SubmitQueryOrderBean
import com.android.ctgapp.http.ApiMethods
import com.android.ctgapp.http.MyObserverHandlerLoading
import com.android.ctgapp.util.*
import com.lwkandroid.imagepicker.ImagePicker
import com.lwkandroid.imagepicker.data.ImageBean
import com.lwkandroid.imagepicker.data.ImagePickType
import com.lwkandroid.widget.ninegridview.NineGirdImageContainer
import com.lwkandroid.widget.ninegridview.NineGridBean
import com.lwkandroid.widget.ninegridview.NineGridView
import com.nanchen.compresshelper.CompressHelper
import kotlinx.android.synthetic.main.activity_order_confirm_single.*
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.startActivityForResult
import org.json.JSONObject
import java.io.File

/**
 *作者:LiBW
 *创建日期: 4/21/21
 *描述:询价 页面 询报价 页面
 */
class EnquiryActivity : BaseActivityV2(), BatchAddPartAdapter.AddPartCallback, PurchaseAdapter.PurchaseCallback, EnquiryQueryCompanyAdapterAdapter.EnquiryQueryCompanyAdapterCallback {
    private val mBinding by lazy { ActivityEnquiryBinding.inflate(layoutInflater) }
    private val mAddressViewModel: OrderConfirmViewModel by lazy { ViewModelProvider(this)[OrderConfirmViewModel::class.java] }
    override fun getLayout() = mBinding.root

    //期待品质
    private val qualityCode = 1001

    //到货时间
    private val arrivalTimeCode = 1002

    //是否需要发票
    private val needInvoiceCode = 1003

    //选择的回调
    private val requestCodePicker = 1004

    //批量添加的采购单
    private var mList = ArrayList<BatchAddPartChildEntityV2.DataBean.PartsGroupBean>()
    private var mAdapter: PurchaseAdapter? = null

    //展示的图片地址
    private val imageShowList = ArrayList<String>()

    //已经处理过的图片地址
    private val imageFiles: ArrayList<File> = ArrayList()

    private val mViewModel by lazy { ViewModelProvider(this)[EnquiryViewModel::class.java] }

    //配件子分类详情(提前获取到下个页面直接使用)
    private var addPartsData = ""
    private val carId by lazy { intent.getStringExtra(MyConstants.CAR_ID).handlerNull() }
    private val epc by lazy { intent.getStringExtra(MyConstants.EPC) }
    private val carRange by lazy { intent.getStringExtra(MyConstants.CAR_RANGE) }
    private val mVin by lazy { intent.getStringExtra(MyConstants.VIN_CODE).handlerNull() }
    private val carBrand by lazy { intent.getStringExtra(MyConstants.CAR_BRAND).handlerNull() }
    private val carFactory by lazy { intent.getStringExtra(MyConstants.VIN_HISTORY).handlerNull() }

    //车型信息
    private val carIntro by lazy { intent.getStringExtra(MyConstants.CAR_INTRO).handlerNull() }

    //已匹配的供应商
    private val mQueryCompanyList = ArrayList<EnquiryQueryCompanyEntityChild>()
    private val mQueryCompanyListCopy = ArrayList<EnquiryQueryCompanyEntityChild>()
    private val mQueryCompanyAdapter by lazy { EnquiryQueryCompanyAdapterAdapter(this, mQueryCompanyList, this) }

    //地址选择器
    private var province = ""
    private var city = ""
    private var district = ""
    private var addressDetail = ""
    private var name = ""
    private var phone = ""
    private var currentAddressId = 0
    private lateinit var cityEntity: CityEntity

    //处理地址
    private fun handlerAddress() {
        mAddressViewModel.getAddress()
        mAddressViewModel.error.observe(this) {
            showToast(it)
            loading.dismiss()
        }

        mAddressViewModel.addressResult.observe(this) {
            loading.dismiss()
            MyLog.d("收货地址回调:$it")
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, AddressEntity::class.java).data
                mBinding.mNameTV.text = "点击选择地址"
                data?.let { list ->
                    list.forEach { entity ->
                        if (entity.isDefault) {
                            setData(entity)
                        }
                    }
                }
            }
        }
    }

    val goEPC by lazy { intent.getBooleanExtra(MyConstants.GO_EPC, false) }
    override fun event() {

        //第一次进入清空选择器
        BaseApplication.enquireSelectPartsList.clear()
        handlerAddress()
        //有采购单的时候展示
//        mPurchaseLL.visibility= View.INVISIBLE

        //采购单
        mAdapter = PurchaseAdapter(this, mList, this)
        mBinding.mPurchaseRV.adapter = mAdapter
        mBinding.mPurchaseRV.layoutManager = LinearLayoutManager(this)
        mBinding.mVinCodeTV.text = mVin
        mBinding.mCarIntroTV.text = carIntro
        //匹配到的供应商
        mBinding.mQueryCompanyRV.adapter = mQueryCompanyAdapter
        mBinding.mQueryCompanyRV.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        //描述文字数量监听
        mBinding.mPartDescribeET.handlerText {
            val count = "${it.length}/200"
            mBinding.mDescribeCountTV.text = count
        }
        initImagePicker()
        val batchAddPartList = ArrayList<BatchAddPartBean>()
        batchAddPartList.add(BatchAddPartBean(101, "外观件", R.drawable.img_car_outside))
        batchAddPartList.add(BatchAddPartBean(102, "底盘件", R.drawable.img_car_underpan))
        batchAddPartList.add(BatchAddPartBean(103, "发动机和变速器", R.drawable.img_engine_gearbox))
        batchAddPartList.add(BatchAddPartBean(104, "内饰件", R.drawable.img_car_inside))
        batchAddPartList.add(BatchAddPartBean(105, "保养件", R.drawable.img_maintenance_vertical))
        batchAddPartList.add(BatchAddPartBean(106, "常用件", R.drawable.img_common_use_vertical))

        //批量添加零件
        mBinding.mBatchAddPartRV.adapter = BatchAddPartAdapter(this, batchAddPartList, this)
        mBinding.mBatchAddPartRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        //获取各个配件子分类(为下一个页面服务)
        mViewModel.getBatchAddPatch()
        mViewModel.addPartResult.observe(this) {
            MyLog.d("配件子分类:$it")
            loading.dismiss()
            handlerHttpResult(it) {
                addPartsData = it
            }
        }
        //匹配的供应商
        mViewModel.companyResult.observe(this) {
            MyLog.d("匹配的供应商:$it")
            loading.dismiss()
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, EnquiryQueryCompanyEntity::class.java).data
                data?.let { list ->
                    mQueryCompanyList.addAll(list)
                    mQueryCompanyListCopy.addAll(list)
                    mQueryCompanyAdapter.notifyDataSetChanged()
                }
            }
        }

        ApiMethods.apiSubscribe(ApiMethods.retrofit.enquireCheckCompany(mVin, carBrand, carFactory), MyObserverHandlerLoading(this, loading) {
            MyLog.d("新增回调:$it")
            val json = JSONObject(it)
            if (json.getInt("status") == 0) {
                val data = getGson().fromJson(it, EnquireCheckEntity::class.java).data
                if (data == null) {
                    //如果data是空的就走供应商接口
                    mViewModel.queryGetCompany(carRange)
                } else {
                    if (data.flow == 2) {
                        mViewModel.queryGetCompany(carRange)
                    } else {
                        val list = ArrayList<EnquiryQueryCompanyEntityChild>()
                        val bean = EnquiryQueryCompanyEntityChild()
                        bean.id = data.allianceId
                        bean.name = data.allianceName
                        bean.canDelete = false
                        list.add(bean)
                        mQueryCompanyList.addAll(list)
                        mQueryCompanyListCopy.addAll(list)
                        mQueryCompanyAdapter.notifyDataSetChanged()
                    }
                }
            } else {
                //如果data是空的就走供应商接口
                mViewModel.queryGetCompany(carRange)
            }
        })


        mViewModel.submitResult.observe(this) {
            MyLog.d("提交报价单回调:$it")
            loading.dismiss()
            handlerHttpResult(it) {
                showToast("提交报价成功")
                startActivity<MainActivity>(MyConstants.GO_JUMP to 3, MyConstants.IS_QUERY to true)
            }
        }
        mViewModel.error.observe(this) {
            loading.dismiss()
            showToast(it)
        }

        //初始化地址信息
        cityEntity = getGson().fromJson(getParentMenuCode(), CityEntity::class.java)


    }

    override fun click() {
        //选择地址
        mAddressRL.setOnClickListener {
            handlerClick {
                startActivityForResult<AddressListActivity>(1000)
            }
        }

        //期待品质
        mBinding.mQualityLL.setOnClickListener {
            handlerClick {
                startActivityForResult<EnquiryCommonSelectActivity>(
                    qualityCode,
                    MyConstants.RESULT_CODE to qualityCode,
                    MyConstants.SELECT_NAME to mBinding.mQualityTV.text.handlerNull()
                )
            }

        }
        //期待到货时间
        mBinding.mArrivalTimeLL.setOnClickListener {
            handlerClick {
                startActivityForResult<EnquiryCommonSelectActivity>(
                    arrivalTimeCode,
                    MyConstants.RESULT_CODE to arrivalTimeCode, MyConstants.SINGLE_MODEL to true,
                    MyConstants.SELECT_NAME to mBinding.mArrivalTimeTV.text.handlerNull()
                )
            }
        }
        //是否需要发票
        mBinding.mNeedInvoiceLL.setOnClickListener {
            handlerClick {
                startActivityForResult<EnquiryCommonSelectActivity>(
                    needInvoiceCode,
                    MyConstants.RESULT_CODE to needInvoiceCode, MyConstants.SINGLE_MODEL to true,
                    MyConstants.SELECT_NAME to mBinding.mNeedInvoiceTV.text.handlerNull()
                )
            }
        }
        //添加配件 按钮
        mBinding.mAddPartTV.setOnClickListener {
            handlerClick {
                val data = BatchAddPartChildBean()
                data.list = mList
                startActivityForResult<AddPartActivity>(
                    100,
                    MyConstants.RESULT_DATA to addPartsData,
                    MyConstants.CAR_ID to carId,
                    MyConstants.EPC to epc,
                    MyConstants.CAR_INTRO to carIntro,
                    MyConstants.SELECT_PARTS_LIST to getGson().toJson(data),
                )
            }
        }
        mBinding.mBackIv.setOnClickListener {
            finish()
        }
        //确认报价 按钮
        mBinding.mConfirmBTN.setOnClickListener {
            //配件为空则为图片报价
//            val justImage = mList.isEmpty()
            when {
                province.isEmpty() -> showToast("请选择省市区")
                city.isEmpty() -> showToast("请选择省市区")
                district.isEmpty() -> showToast("请选择省市区")
                mList.isEmpty() && imageShowList.isEmpty() -> showToast("配件和图片请至少选择一个")
                imageShowList.isNotEmpty() -> {
                    showLoading()
                    //包含图片先处理图片后进行提交
                    //压缩图片
                    imageShowList.forEach {
                        val file = File(it)
                        val newFile: File = CompressHelper.getDefault(applicationContext).compressToFile(file)
                        imageFiles.add(newFile)
                    }
                    val parts = ArrayList<MultipartBody.Part>()
                    for (i in imageFiles.indices) {
                        parts.add(fileToMultipartBodyPart("file$i", imageFiles[i]))
                    }
                    mViewModel.uploadImage(parts)
                }
                else -> {
                    confirmOrder()
                }
            }
        }
        mViewModel.imagesResult.observe(this) {
            loading.dismiss()
            handlerHttpResult(it) {
                val data = getGson().fromJson(it, AllFileUploadEntity::class.java).data
                data?.let { list ->
                    confirmOrder(list)
                }
            }
        }

        if (goEPC && carId.isNotEmpty()) {
            startActivityForResult<EPCActivity>(
                101,
                MyConstants.CAR_ID to carId,
                MyConstants.EPC to epc,
                MyConstants.CAR_INTRO to carIntro,
            )
        }
    }

    override fun onResume() {
        super.onResume()
        mList = BaseApplication.enquireSelectPartsList
        mAdapter = PurchaseAdapter(this, mList, this)
        mBinding.mPurchaseRV.adapter = mAdapter
        mBinding.mPurchaseRV.layoutManager = LinearLayoutManager(this)
        mBinding.mPurchaseLL.visibility = if (mList.isNotEmpty()) View.VISIBLE else View.GONE
    }

    override fun onPause() {
        super.onPause()
        BaseApplication.enquireSelectPartsList = mList
    }

    //期望到货时间
    var receiveTimeID = 0

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.let {
            val name = data.getStringExtra(MyConstants.SELECT_NAME)
            val id = data.getIntExtra(MyConstants.SELECT_ID, 0)
            when (requestCode) {
                qualityCode -> {
                    mBinding.mQualityTV.text = name
                }
                arrivalTimeCode -> {
                    mBinding.mArrivalTimeTV.text = name
                    receiveTimeID = id
                }
                needInvoiceCode -> {
                    mBinding.mNeedInvoiceTV.text = name
                }
                100 -> {

                }
            }

            //图片选择器返回
            if (requestCode == requestCodePicker && resultCode == Activity.RESULT_OK) {
                val list: List<ImageBean> = data.getParcelableArrayListExtra(ImagePicker.INTENT_RESULT_DATA)!!
                val resultList: MutableList<NineGridBean> = java.util.ArrayList()
                for (imageBean in list) {
                    val nineGirdData = NineGridBean(imageBean.imagePath)
                    imageShowList.add(imageBean.imagePath)
                    resultList.add(nineGirdData)
                }
                mBinding.mPhotoNGV.addDataList(resultList)
            }
            //地址回调
            if (requestCode == 1000) {

                val mData = data.getStringExtra(MyConstants.ENTITY).handlerNull()
                if (mData.isNotEmpty()) {
                    val entity = getGson().fromJson(mData, AddressEntity.DataBean::class.java)
                    setData(entity)
                } else {
                    //没有携带地址回来 但是有可能删除了默认地址
                    try {
                        val deleteAddressList: List<Int> = data.getSerializableExtra(MyConstants.DELETE_ADDRESS_IDS) as List<Int>
                        deleteAddressList.forEach {
                            //如果删除的地址ID和当前页面展示的ID是一致的则删除不显示
                            if (currentAddressId == it) {
                                mBinding.mNameTV.text = "点击选择地址"
                                mBinding.mAddressTV.text = ""
                            }
                        }
                    } catch (e: Exception) {
                    }
                }
            }

        }
    }

    //设置收货地址
    private fun setData(entity: AddressEntity.DataBean) {
        currentAddressId = entity.id
        mBinding.mNameTV.text = entity.deliveryName
        mBinding.mPhoneTV.text = entity.deliveryPhone
        val address = "${entity.province.handlerNull()} ${entity.city.handlerNull()} ${entity.district.handlerNull()} ${entity.detailAddress.handlerNull()}"
        mAddressTV.text = address
        province = entity.province.handlerNull()
        city = entity.city.handlerNull()
        district = entity.district.handlerNull()
        addressDetail = entity.detailAddress.handlerNull()
        name = entity.deliveryName.handlerNull()
        phone = entity.deliveryPhone.handlerNull()
    }

    private fun initImagePicker() {
        //设置图片加载器，这个是必须的，不然图片无法显示
        mBinding.mPhotoNGV.setImageLoader(GlideImageLoader())
        //设置显示列数，默认3列
        mBinding.mPhotoNGV.setColumnCount(3)
        //设置是否为编辑模式，默认为false
        mBinding.mPhotoNGV.setIsEditMode(true)
        //设置单张图片显示时的尺寸，默认100dp
        mBinding.mPhotoNGV.setSingleImageSize(150)
        //设置单张图片显示时的宽高比，默认1.0f
        mBinding.mPhotoNGV.setSingleImageRatio(0.8f)
        //设置最大显示数量，默认9张
        mBinding.mPhotoNGV.setMaxNum(10)
        //设置图片显示间隔大小，默认3dp
        mBinding.mPhotoNGV.setSpcaeSize(4)
        mBinding.mPhotoNGV.setRatioOfDeleteIcon(0.15f)
        //设置“+”号的图片
        mBinding.mPhotoNGV.setIcAddMoreResId(R.drawable.ic_ngv_add_pic)
        //设置各类点击监听
        mBinding.mPhotoNGV.setOnItemClickListener(object : NineGridView.onItemClickListener {
            override fun onNineGirdItemDeleted(position: Int, gridBean: NineGridBean?, imageContainer: NineGirdImageContainer?) {
                if (imageShowList.isNotEmpty()) {
                    imageShowList.removeAt(position)
                }
            }

            override fun onNineGirdItemClick(position: Int, gridBean: NineGridBean?, imageContainer: NineGirdImageContainer?) {

            }

            override fun onNineGirdAddMoreClick(cha: Int) {
                //编辑模式下，图片展示数量尚未达到最大数量时，会显示一个“+”号，点击后回调这里
                ImagePicker()
                    .cachePath(getExternalFilesDir(null)?.absolutePath)
                    .pickType(ImagePickType.MULTI)
                    .displayer(ImagePickerLoader())
                    .maxNum(cha)
                    .start(this@EnquiryActivity, requestCodePicker)
            }
        })

    }

    //提交询价单
    private fun confirmOrder(list: List<String>? = null) {
        val map: MutableMap<String, Any> = HashMap()
        //上传图片
        if (list != null) {
            map["imgUrls"] = list
        }
        //询价方式 0/1  全网/指定供应商
        map["enquiryWay"] = "1"
        //发票类型 0/1/2   不开票/普票/增票
        map["invoiceType"] = "1"
        map["linkman"] = name
        map["linkmanPhone"] = phone
        //省市区 地址
        map["province"] = province
        map["city"] = city
        map["district"] = district
        map["toAddress"] = addressDetail
        map["vin"] = mVin
        //查询车型信息 本田 东风本田 2013款 杰德 1.8 无级 VTi 4+α座豪华版1.8
        map["modelInfo"] = carIntro
        map["createUserId"] = BaseApplication.userId
        map["createCompanyId"] = BaseApplication.companyId
        //询价单状态 0草稿单 1待报价 2已失效 3已报价 4已完成
        map["enquiryStatus"] = "1"
        //期望到货天数
        map["expectType"] = 1//期望到货类型 0 显示到货日期 1到货时间段(1天,3-4天)
        map["expectPeriod"] = receiveTimeID
        //图片询价时文字阐述备注信息
        map["remark"] = mBinding.mPartDescribeET.text.handlerNull()
        //整单期望品质
        map["quality"] = mBinding.mQualityTV.text.handlerNull()
        //询价单来源1pc端2小程序3公众号4安卓app  5iosAPP
        map["enquirySource"] = "4"
        //0.零件询价 1.图片询价
        val enquiryType = if (mList.isEmpty()) "1" else "0"
        map["enquiryType"] = enquiryType
        //平台合作经销商
        val targetList = ArrayList<Int>()
        mQueryCompanyList.forEach { bean ->
            targetList.add(bean.id)
        }
        map["targetCompanyIds"] = targetList
        //添加商品
        val queryList = ArrayList<SubmitQueryOrderBean>()
        mList.forEach { bean ->
            val queryBean = SubmitQueryOrderBean()
            queryBean.num = bean.buyCount
            queryBean.oe = bean.oe.handlerNull()
            queryBean.partName = bean.ctgname
            queryBean.fname = bean.ctgname
            queryBean.ssssPrice = bean.price.handlerNull()

            //零件上传的时候要传ctgnum、epcImage可以为空 (新增)
            queryBean.ctgnum = bean.ctgnum.handlerNull()
            queryBean.epcImage = bean.img.handlerNull()


            queryList.add(queryBean)
        }
        map["enquiryDetails"] = queryList
        val body = RequestBody.create(
            MediaType.parse("application/json; charset=utf-8"),
            getGson().toJson(map)
        )
        loading.show()
        mViewModel.submitOrder(body)

    }


    //批量添加零件 列表 选中 (进入点击车辆选择配件页面)
    override fun onAddPartClick(id: Int) {
        val data = BatchAddPartChildBean()
        data.list = mList
        if (addPartsData.isNotEmpty()) {
//            MyLog.d("过去的配件子分类:$addPartsData")
            startActivityForResult<BatchAddPartActivity>(
                100, MyConstants.PART_ID to id,
                MyConstants.RESULT_DATA to addPartsData,
                MyConstants.CAR_ID to carId,
                MyConstants.EPC to epc,
                MyConstants.SELECT_PARTS_LIST to getGson().toJson(data)
            )
        } else {
            showToast("服务器异常请稍后再试")
        }
    }

    //刷新数量
    override fun refreshCount(number: Int, position: Int) {
        mList[position].buyCount = number
        mAdapter?.notifyDataSetChanged()

    }

    //删除配件
    override fun deleteItem(position: Int) {
        mList.removeAt(position)
        mAdapter?.notifyDataSetChanged()
        if (mList.isEmpty()) mBinding.mPurchaseLL.visibility = View.GONE
    }

    //选择未知配件
    override fun unKnowOeEdit(oe: String, position: Int) {
        mList[position].oe = oe
    }

    //处理匹配的供应商
    override fun onItemDelete(position: Int) {
        mQueryCompanyList.removeAt(position)
        //匹配的供应商至少有一个
        if (mQueryCompanyList.isEmpty()) {
            showToast("请至少保留一个匹配到的供应商")
            mQueryCompanyList.addAll(mQueryCompanyListCopy)
        }
        mQueryCompanyAdapter.notifyDataSetChanged()
    }

    override fun onDestroy() {
        BaseApplication.enquireSelectPartsList.clear()
        super.onDestroy()
    }
}
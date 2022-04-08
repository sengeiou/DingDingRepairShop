package com.android.ctgapp.util

import android.Manifest
import android.view.View
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.enum.PayFromEnum

/**
 *作者:LiBW
 *创建日期: 2020/10/9
 *描述: 常量类
 */
//修理厂参数固定
//var key = handlerPassword("ctgStw_seabird237ownice65123")

//const val platform = "CTG_APP_ANDROID_REPAIRSHOP"

const val PERMISSION_APPLY_CODE = 100
const val THE_TRUE = 1
const val THE_FALSE = 0

//相机权限
val TakePhotoPermissions = arrayOf(Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE)


var globalWxAppId = ""

//充值订单号
var globalCashChangeNo = ""


/***微信支付来自哪里1 订单支付 2余额充值 3白条还款(订单页面单笔还款)*/
var wxChatFrom = 0

fun initLogin() {
    BaseApplication.userToken = ""
    BaseApplication.userId = 0
    BaseApplication.allianceId = 0
    BaseApplication.companyId = 0
    globalWxAppId = ""
    BaseApplication.orderId = ""
    BaseApplication.orderNum = ""
    BaseApplication.payWay = ""
    BaseApplication.price = ""
    BaseApplication.orderTime = ""
    wxChatFrom = 0
}

fun View.handlerVisibility(visibility: Boolean) {
    this.visibility = if (visibility) View.VISIBLE else View.GONE
}

object MyConstants {
    /**********switch***********/
    //优惠券开关
    const val NEED_COUPON = false


    const val RMB = "¥"

    /**********Shared***********/
    const val SHOW_NOTIFICATION_DIALOG = "show_notification_dialog"


    /**********传值***********/
    const val FUNCTION_NOT_OPEN = "该功能暂未开放"
    const val TOKEN_TIME = "token_time"
    const val REAL_NAME = "real_name"
    const val USER_ID = "user_id"
    const val CTG_ID = "ctg_id"
    const val BRAND_ID = "brand_id"
    const val COMPANY_NAME = "company_name"
    const val COMPANY_ID = "company_id"
    const val ORDER_ACTIVITY_ID = "order_activity_id"//订单中的优惠券id
    const val ORDER_TYPE = "order_type"
    const val COMPANY_ENTITY = "company_entity"
    const val ALLIANCE_ID = "alliance_id"
    const val ID = "id"
    const val TOKEN = "token"

    //当前登录用户头像
    const val MY_IMAGE_URL = "IMAGE_URL"

    //名片JSON
    const val CARD_INFO = "card_info"

    //是否需要发票
    const val NEED_INVOICE = "need_invoice"
    const val TOTAL_MONEY = "total_money"

    const val IS_FIRST_IN = "IS_FIRST_IN"

    //隐私
    const val PRIVACY = "privacy"

    //返回码
    const val RESULT_CODE = "result_code"

    //返回数据
    const val RESULT_DATA = "result_data"
    const val REFRESH_DATA = "refresh_data"
    const val INIT_DATA = "init_data"
    const val ENQUIRE_DATA = "enquire_data"
    const val CTG_NUM = "ctg_num"
    const val SERIES_NAME = "seriesName"
    const val CTG_NAME = "ctg_name"


    const val PHONE = "phone"
    const val NAME = "name"
    const val GOODS_NAME = "goods_name"

    const val LABEL_NAME = "label_name"
    const val LABEL_ID = "label_id"
    const val OTHER_ID = "other_id"


    //状态
    const val STATUE = "statue"

    //选择的名称
    const val SELECT_NAME = "select_name"
    const val SELECT_ID = "select_id"


    const val FIX_GROUP_LIST = "fix_group_list"

    const val GROUP_ID = "group_id"
    const val GROUP_NAME = "group_name"
    const val GROUP_PHONE_NUMBERS = "group_phone_numbers"

    //商友ID
    const val FRIEND_USER_ID = "friend_user_id"

    //职位
    const val POSITION = "POSITION"

    //部门
    const val DEPARTMENT = "department"
    const val DEPARTMENT_ID = "department_id"

    //是否为主管
    const val IS_MANAGER = "is_manager"

    //是否为公司创建者
    const val IS_CREATOR = "is_creator"

    //实体类
    const val ITEM_ENTITY = "item_entity"
    const val ENTITY = "entity"
    const val COUPON_ENTITY = "coupon_entity"
    const val GOODS_ENTITY = "goodsentity"//商品详情
    //删除的地址
    const val DELETE_ADDRESS_IDS = "delete_address_ids"

    //标题和内容
    const val TITLE = "title"
    const val CONTENT = "content"
    const val NO_TITLE = "no_title"

    //继续支付
    const val CONTINUE_TO_PAY = "continue_to_pay"

    //是否支持挂账
    const val SUPPORT_CREDIT = "support_credit"


    //轮播图和通知
    const val BANNER = "banner"
    const val BANNER_ID = "banner_id"
    const val NOTICE = "notice"


    //配件ID
    const val ORDER = "ORDER"
    const val ORDER_NUM = "order_num"
    const val ORDER_NO = "order_no"
    const val PART_ID = "part_id"
    const val F_CODE = "f_code"

    const val ORDER_ID = "order_id"
    const val AGENT_ID = "agentId"
    const val NO_BANNER = "no_banner"
    const val BILL_NO = "bill_no"
    const val BILL_NO_FOR_CONFIRM = "bill_no_for_confirm"
    const val SELECT_PARTS_LIST = "select_parts_list"
    const val PARENT_PART_NAME = "parent_part_name"
    const val PARENT_CATEGORY_ID = "parent_category_id"

    const val GO_EPC = "go_epc"

    //商品数量
    const val GOODS_COUNT = "goods_count"
    const val VIN_CODE = "vin_code"
    const val CAR_BRAND = "car_brand"
    const val CAR_FACTORY = "car_factory"
    const val VIN_HISTORY = "vin_history"
    const val CAR_INTRO = "car_intro"
    const val CAR_ICON = "car_icon"
    const val TYPE = "type"
    const val PRICE = "price"
    const val White_Money = "white_money"
    const val CAR_ID = "car_id"
    const val CATEGORY_ID = "category_id"
    const val EPC = "epc"
    const val IMAGE = "IMAGE"
    const val CAR_RANGE = "car_range"

    //企业简介
    const val COMPANY_INTRO = "company_intro"

    //跳转到主页的哪里 1234
    const val GO_JUMP = "go_jump"

    const val FLAG = "FLAG"


    //可以退出
    const val CAN_EXIT = "can_exit"

    //新建
    const val IS_CERTIFICATION = "is_certification"

    //是否认证
    const val IS_ATTESTATION = "is_attestation"
    const val SINGLE_MODEL = "single_model"

    //是否是询价记录
    const val IS_QUERY = "is_query"

    //来自聊天
    const val FROM_CHART = "from_chart"

    const val ENQUIRY_ID = "enquiry_id"

    //是否展示为通讯录
    const val IS_LINKMAN = "IS_LINKMAN"


    //来自服务
    const val FROM_SERVICE = "from_service"

    //来自登录
    const val FROM_LOGIN = "from_login"

    //获取商友信息
    const val BUSINESS_FRIEND = "business_friend"
    const val BUSINESS_FRIEND_CODE = 10003


    /**ApplicationId*/
    const val APPLICATION_ID_LANJING = "com.ctgoe.app.lanjing"
    const val APPLICATION_ID_CTG = "com.ctgoe.app.dingding"
    const val APPLICATION_ID_XINGDA = "com.ctgoe.app.xingda"
    const val APPLICATION_ID_CHEPINHUI = "com.ctgoe.app.chepinhui"
    const val APPLICATION_ID_WL = "com.ctgoe.app.wl"
    const val APPLICATION_ID_HQP = "com.ctgoe.app.hqp"
    //广播微信支付结果
    const val WXPAY_RESULT="wxpay_result"
}


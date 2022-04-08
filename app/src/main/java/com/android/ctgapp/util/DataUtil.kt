package com.android.ctgapp.util

import cn.jpush.android.api.JPushInterface
import com.android.ctgapp.BuildConfig
import com.android.ctgapp.base.BaseApplication
import com.android.ctgapp.entity.LoginEntity

object DataUtil {
    /**储存登录过后的信息*/
    fun handlerLoginData(data: String) {
        val entity = getGson().fromJson(data, LoginEntity::class.java)
        entity?.data?.let { loginEntity ->
            BaseApplication.userToken = loginEntity.token.handlerNull()
            BaseApplication.companyName = loginEntity.companyName.handlerNull()
            //如果是汽配钉钉则使用默认登录获取的AllianceID否则使用地址的allianceID
            MyLog.d("东西不多1${BuildConfig.CUSTOM_ALLIANCE_ID}")
            if (BuildConfig.CUSTOM_ALLIANCE_ID != -1) {
                BaseApplication.allianceId = BuildConfig.CUSTOM_ALLIANCE_ID
                sharedSave {
                    putInt(MyConstants.ALLIANCE_ID, BuildConfig.CUSTOM_ALLIANCE_ID)
                }
            } else {
                sharedSave {
                    putInt(MyConstants.ALLIANCE_ID, loginEntity.allianceId)
                }
                BaseApplication.allianceId = loginEntity.allianceId
            }
            BaseApplication.userId = loginEntity.userId
            BaseApplication.companyId = loginEntity.companyId
            BaseApplication.isCompanyAdmin = loginEntity.isCompanyAdmin
            BaseApplication.isCompanyCreator = loginEntity.isCompanyCreator
            //极光推送注册
//            JPushUtil.setAlias(BaseApplication.getContext(),loginEntity.userId)
            BaseApplication.currentCompanyIdSet.clear()
            BaseApplication.currentCompanyIdSet.add(loginEntity.companyId.handlerNull())
            JPushUtil.setTag(BaseApplication.getContext(),BaseApplication.currentCompanyIdSet)
            sharedSave {
                putString(MyConstants.TOKEN_TIME, System.currentTimeMillis().toString())
                putString(MyConstants.REAL_NAME, loginEntity.realName.handlerNull())
                putInt(MyConstants.USER_ID, loginEntity.userId)
                putString(MyConstants.CTG_ID, loginEntity.ctgid.handlerNull())
                putString(MyConstants.COMPANY_NAME, loginEntity.companyName.handlerNull())
                putInt(MyConstants.COMPANY_ID, loginEntity.companyId)
                putString(MyConstants.PHONE, loginEntity.telephone.handlerNull())
                putString(MyConstants.TOKEN, loginEntity.token)
                putString(MyConstants.MY_IMAGE_URL, loginEntity.imageUrl)
                putBoolean(MyConstants.IS_MANAGER, loginEntity.isCompanyAdmin)
                putBoolean(MyConstants.IS_CREATOR, loginEntity.isCompanyCreator)
            }
        }

    }

    /**删除所有缓存信息*/
    fun deleteAllData() {
        //清除极光推送相关
        JPushInterface.deleteTags(BaseApplication.getContext(),1000,BaseApplication.currentCompanyIdSet)
        JPushInterface.deleteAlias(BaseApplication.getContext(),BaseApplication.userId)
        BaseApplication.currentCompanyIdSet.clear()
        appSharedPreference.edit().clear().apply()
        BaseApplication.companyName = ""
        BaseApplication.companyId = 0
        BaseApplication.isCompanyAdmin = false
        BaseApplication.isCompanyCreator = false

    }
}
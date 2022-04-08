package com.android.ctgapp.callback

import com.android.ctgapp.entity.CompanyDetailEntity

/**
 *作者:LiBW
 *创建日期: 2020/10/10
 *描述: 修改公司信息
 */
interface CompanyCallback {
    //保存公司简介
    fun saveIntro(companyIntro: String)
    //修改公司信息
    fun changeCompanyInfo(data: CompanyDetailEntity.DataBean)

}
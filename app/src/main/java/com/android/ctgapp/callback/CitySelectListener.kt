package com.android.ctgapp.callback

interface CitySelectListener {
    /***点击省份选择*/
    fun provinceSelectOver(province:String)
    /***点击城市选择*/
    fun citySelectOver(city:String)
    /***点击区选择*/
    fun districtOver(district:String)
}
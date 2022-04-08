package com.android.ctgapp.callback

object CitySelectManager {
    private var listener: CitySelectListener? = null

    fun setCallback(listener: CitySelectListener?) {
        this.listener = listener
    }

    /***点击省份选择*/
    fun provinceSelectOver(province:String){
        listener!!.provinceSelectOver(province)
    }
    /***点击城市选择*/
    fun citySelectOver(city:String){
        listener!!.citySelectOver(city)
    }
    /***点击区选择*/
    fun districtOver(district:String){
        listener!!.districtOver(district)
    }
}
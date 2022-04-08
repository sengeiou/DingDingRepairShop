package com.android.ctgapp.entity.home

/**
 *作者:LiBW
 *创建日期: 2020/11/7
 *描述: 批量修改选中状态实体类
 */
data class ChangesSelectBean (
    val ids:List<Int>,
    //0 取消 1选中
    val isSelected:Int
)
package com.android.ctgapp.callback

/**
 *作者:LiBW
 *创建日期: 2020/11/7
 *描述: 购物车管理类
 */
interface TrolleyGoodsChangeListener  {
    /***商品选中数量变更*/
    fun goodCountChange(trolleyId: Int, num: Int)

    /***删除商品*/
    fun goodDelete(trolleyIds: List<Int>)

    /***商品子菜单选中状态变更*/
    fun goodChildItemCheckChange(shoppingId: Int, select: Int)

    /***批量修改选中状态*/
    fun changesSelect(ids: List<Int>, isSelected: Int)
}
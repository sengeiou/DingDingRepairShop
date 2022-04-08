package com.android.ctgapp.callback

object TrolleyManager {
    var listener: TrolleyGoodsChangeListener? = null

    fun setCallback(listener: TrolleyGoodsChangeListener) {
        this.listener = listener
    }

    fun goodCountChange(trolleyId: Int, num: Int) {
        listener?.goodCountChange(trolleyId, num)
    }


    fun goodDelete(trolleyIds: List<Int>) {
        listener?.goodDelete(trolleyIds)
    }

    fun goodChildItemCheckChange(shoppingId: Int, select: Int) {
        listener?.goodChildItemCheckChange(shoppingId, select)
    }

    fun changesSelect(ids: List<Int>, isSelected: Int) {
        listener?.changesSelect(ids, isSelected)
    }
}
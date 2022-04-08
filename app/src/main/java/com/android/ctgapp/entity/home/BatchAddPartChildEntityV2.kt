package com.android.ctgapp.entity.home

import lombok.Data
import lombok.NoArgsConstructor


class BatchAddPartChildEntityV2 {
    var status = 0

    var msg: Any? = null
    var data: List<DataBean>? = null
    var success = false


    class DataBean {
        var oe: String? = null
        var des: String? = null
        var ctgname: String? = null
        var amount: String? = null
        var sign: String? = null
        var remark: String? = null
        var ctgnum: String? = null
        var partsGroup: List<PartsGroupBean>? = null
        var epc: String? = null
        var applicable = false
        var begin: String? = null
        var end: String? = null
        var model: String? = null
        var price: String? = null


        class PartsGroupBean {
            var labelId: String? = null
            var categoryId: String? = null
            var groupId: String? = null
            var parentCategoryId: String? = null
            var des: String? = null
            var remark: String? = null
            var img: String? = null
            var applicable = false
            var modelcode: String? = null
            var model: String? = null
            var begin: String? = null
            var end: String? = null

            //自定义 用来判定选中状态 如果是 不知道选啥就选我就传 当前categoryId
            var parentCategoryIdFlag = ""
            var parentPartName = ""

            //数据部搞事情 自己遍历塞进去吧
            var oe = ""
            var ctgname = ""
            var amount = ""
            var sign = ""
            var ctgnum = ""
            var epc = ""
            var price = ""

            //选中状态
            var select = false
            //购买数量
            var buyCount=1
            //没有OE的配件
            var unKnowPart=false
        }
    }
}
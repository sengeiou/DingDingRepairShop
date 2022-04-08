package com.android.ctgapp.entity.home.enquire

import lombok.Data
import lombok.NoArgsConstructor


class EpcDetailEntityV2 {
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
        }
    }
}
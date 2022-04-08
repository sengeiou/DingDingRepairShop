package com.android.ctgapp.entity.home.enquire

import java.io.Serializable

class EpcLeftMenuEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"img":"","des":"发动机","groupId":"","parentCategoryId":"","remark":"","id":"1","categoryId":"1"},{"img":"","des":"传动装置","groupId":"","parentCategoryId":"","remark":"","id":"2","categoryId":"2"},{"img":"","des":"电气设备|废气|加热器","groupId":"","parentCategoryId":"","remark":"","id":"3","categoryId":"3"},{"img":"","des":"转向|制动器|悬架","groupId":"","parentCategoryId":"","remark":"","id":"4","categoryId":"4"},{"img":"","des":"内饰","groupId":"","parentCategoryId":"","remark":"","id":"5","categoryId":"5"},{"img":"","des":"车身","groupId":"","parentCategoryId":"","remark":"","id":"6","categoryId":"6"},{"img":"","des":"附件","groupId":"","parentCategoryId":"","remark":"","id":"7","categoryId":"7"}]
     * success : true
     */
    var status: Int? = null
    var msg: Any? = null
    var isSuccess: Boolean? = null
    var data: List<DataBean>? = null

    class DataBean : Serializable {
        /**
         * img :
         * des : 发动机
         * groupId :
         * parentCategoryId :
         * remark :
         * id : 1
         * categoryId : 1
         */
        var img: String? = null
        var des: String? = null
        var groupId: String? = null
        var parentCategoryId: String? = null
        var remark: String? = null
        var id: String? = null
        var categoryId: String? = null
        var select = false
        var selectTop= false
        var selectDown= false
    }
}
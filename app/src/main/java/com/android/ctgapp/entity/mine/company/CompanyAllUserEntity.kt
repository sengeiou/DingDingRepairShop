package com.android.ctgapp.entity.mine.company

import java.io.Serializable

class CompanyAllUserEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"id":593,"name":"黄方健三号"},{"id":1414,"name":"张三"},{"id":1415,"name":null},{"id":1416,"name":"李项"},{"id":1418,"name":"徐"},{"id":1420,"name":null},{"id":1421,"name":"abc"},{"id":1425,"name":"夏"},{"id":1426,"name":"中华"},{"id":1427,"name":"王二"},{"id":1429,"name":"收车业务员"},{"id":1430,"name":"多角色"},{"id":1432,"name":"花枝乱颤"},{"id":1435,"name":"huangfangjian"},{"id":1436,"name":"李四"},{"id":1437,"name":"赵六"},{"id":1664,"name":"18561988803"},{"id":1670,"name":"花花草草"},{"id":1674,"name":"啦啦啦"},{"id":1675,"name":"小姐姐"}]
     */
    var status: Int? = null
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean : Serializable {
        /**
         * id : 593
         * name : 黄方健三号
         */
        var id=-1
        var name: String? = null
        var select=false
    }
}
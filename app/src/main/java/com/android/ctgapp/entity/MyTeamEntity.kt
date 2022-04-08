package com.android.ctgapp.entity

import java.io.Serializable

class MyTeamEntity :Serializable{
    /**
     * status : 0
     * msg : null
     * data : [{"userId":null,"realName":"吴家宝","telephone":"18755180000","departmentName":"开发部","imageUrl":"03a7047f-fc33-47eb-814f-31043c78d478.png","status":1},{"userId":null,"realName":"薛晨","telephone":"15906195614","departmentName":"开发部","imageUrl":"03a7047f-fc33-47eb-814f-31043c78d478.png","status":1}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean :Serializable{
        /**
         * userId : null
         * realName : 吴家宝
         * telephone : 18755180000
         * departmentName : 开发部
         * imageUrl : 03a7047f-fc33-47eb-814f-31043c78d478.png
         * status : 1
         */
        var userId: Int = -1
        var realName: String? = null
        var labelName: String? = null
        var positionLabelId=-1
        var telephone: String? = null
        var departmentName: String? = null
        var departmentId: Int? = null
        var imageUrl: String? = null
        var userNo: String? = null
        var status = 0
        //是否为管理员
        var isCompanyAdmin=false
        //是否为公司创建者
        var isCompanyCreator=false
    }
}
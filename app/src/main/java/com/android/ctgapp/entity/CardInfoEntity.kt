package com.android.ctgapp.entity

/**
 * 作者:LiBW
 * 创建日期: 3/31/21
 * 描述: 名片详情 商友和团队成员页面通用
 */
class CardInfoEntity {
    /**
     * status : 0
     * msg : null
     * data : {"userName":"项一磊","userId":56,"avatarUrl":"03a7047f-fc33-47eb-814f-31043c78d478.png","companyName":"hfj的联盟啊","companyId":88889571,"industry":"制造商","position":null,"telephone":"13306195736","companyAddress":"上海市市辖区徐汇区创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里","relation":"同事","groupName":null,"groupId":null,"remark":null,"labelName":null,"departmentName":null}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * userName : 项一磊
         * userId : 56
         * avatarUrl : 03a7047f-fc33-47eb-814f-31043c78d478.png
         * companyName : hfj的联盟啊
         * companyId : 88889571
         * industry : 制造商
         * position : null
         * telephone : 13306195736
         * companyAddress : 上海市市辖区徐汇区创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里有什么区别（地址是选择省市区）创建/加入企业，请输入地址和详细地址，这里
         * relation : 同事
         * groupName : null
         * groupId : null
         * remark : null
         * labelName : null
         * departmentName : null
         */
        var userName: String? = null
        var userId = 0
        var avatarUrl: String? = null
        var companyName: String? = null
        var companyId = 0
        var industry: String? = null
        var position: Any? = null
        var telephone: String? = null
        var companyAddress: String? = null
        var relation: String? = null
        var groupName: Any? = null
        var groupId = -1
        var remark: Any? = null
        var labelName: Any? = null
        var departmentName: Any? = null

        //是否认证
        var doCertified = false
    }
}
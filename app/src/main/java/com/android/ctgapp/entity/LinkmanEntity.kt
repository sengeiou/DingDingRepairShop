package com.android.ctgapp.entity

class LinkmanEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"id":1,"companyId":2222,"userId":1413,"linkmanName":"一号子客服","linkmanTel":"13621161596","createTime":null,"updateTime":null},{"id":2,"companyId":2222,"userId":1414,"linkmanName":"送送","linkmanTel":"19900000001","createTime":null,"updateTime":null},{"id":3,"companyId":2222,"userId":1415,"linkmanName":"张三","linkmanTel":"13721141577","createTime":null,"updateTime":null},{"id":4,"companyId":2222,"userId":1416,"linkmanName":null,"linkmanTel":"18206197788","createTime":null,"updateTime":null},{"id":5,"companyId":2222,"userId":1417,"linkmanName":"李项","linkmanTel":"13621141602","createTime":null,"updateTime":null},{"id":6,"companyId":2222,"userId":1418,"linkmanName":"娟儿","linkmanTel":"19912346777","createTime":null,"updateTime":null},{"id":7,"companyId":2222,"userId":1420,"linkmanName":"徐","linkmanTel":"18206195678","createTime":null,"updateTime":null},{"id":8,"companyId":2222,"userId":1421,"linkmanName":null,"linkmanTel":"17712345678","createTime":null,"updateTime":null},{"id":9,"companyId":2222,"userId":1425,"linkmanName":"abc","linkmanTel":"15100000001","createTime":null,"updateTime":null},{"id":10,"companyId":2222,"userId":1426,"linkmanName":"夏","linkmanTel":"18206669999","createTime":null,"updateTime":null},{"id":11,"companyId":2222,"userId":1427,"linkmanName":"中华","linkmanTel":"15612345678","createTime":null,"updateTime":null},{"id":12,"companyId":2222,"userId":1429,"linkmanName":"王二","linkmanTel":"13621171596","createTime":null,"updateTime":null},{"id":13,"companyId":2222,"userId":1430,"linkmanName":"收车业务员","linkmanTel":"13621181596","createTime":null,"updateTime":null},{"id":14,"companyId":2222,"userId":1432,"linkmanName":"多角色","linkmanTel":"15966668888","createTime":null,"updateTime":null},{"id":15,"companyId":2222,"userId":1435,"linkmanName":"花枝乱颤","linkmanTel":"13333333333","createTime":null,"updateTime":null},{"id":16,"companyId":2222,"userId":1436,"linkmanName":"huangfangjian","linkmanTel":"13584188391","createTime":null,"updateTime":null},{"id":17,"companyId":2222,"userId":1437,"linkmanName":"李四","linkmanTel":"13584188555","createTime":null,"updateTime":null},{"id":18,"companyId":2222,"userId":1438,"linkmanName":"赵六","linkmanTel":"13584188666","createTime":null,"updateTime":null},{"id":19,"companyId":2222,"userId":1439,"linkmanName":"薛才","linkmanTel":"17701546493","createTime":null,"updateTime":null},{"id":20,"companyId":2222,"userId":1440,"linkmanName":null,"linkmanTel":"18200000009","createTime":null,"updateTime":null},{"id":21,"companyId":2222,"userId":1441,"linkmanName":null,"linkmanTel":"18200000088","createTime":null,"updateTime":null},{"id":22,"companyId":2222,"userId":1442,"linkmanName":"小猪","linkmanTel":"18802052580","createTime":null,"updateTime":null},{"id":23,"companyId":2222,"userId":1443,"linkmanName":null,"linkmanTel":"18200000077","createTime":null,"updateTime":null},{"id":24,"companyId":2222,"userId":1444,"linkmanName":null,"linkmanTel":"18200000099","createTime":null,"updateTime":null},{"id":25,"companyId":2222,"userId":1445,"linkmanName":null,"linkmanTel":"12222222222","createTime":null,"updateTime":null},{"id":26,"companyId":2222,"userId":1412,"linkmanName":null,"linkmanTel":null,"createTime":null,"updateTime":null}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * id : 1
         * companyId : 2222
         * userId : 1413
         * linkmanName : 一号子客服
         * linkmanTel : 13621161596
         * createTime : null
         * updateTime : null
         */
        var id = 0
        var companyId = 0
        var userId = 0
        var linkmanName: String? = null
        var linkmanTel: String? = null
        var imageUrl: String? = null
        var linkmanRemark: String? = null
        var createTime: Any? = null
        var updateTime: Any? = null
        var editModel: Boolean = false
    }
}
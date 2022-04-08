package com.android.ctgapp.entity

class ClientCanJoinEntity {
    /**
     * status : 0
     * msg : null
     * data : {"records":[{"companyId":6681,"orgname":"常州市文涛汽车配件厂","phone":"0510-68895220","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","isAdd":false},{"companyId":12345,"orgname":"无锡畅通汽配公司","phone":"051082756645","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","isAdd":false}],"total":303,"size":2,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":152}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * records : [{"companyId":6681,"orgname":"常州市文涛汽车配件厂","phone":"0510-68895220","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","isAdd":false},{"companyId":12345,"orgname":"无锡畅通汽配公司","phone":"051082756645","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","isAdd":false}]
         * total : 303
         * size : 2
         * current : 1
         * orders : []
         * optimizeCountSql : true
         * hitCount : false
         * countId : null
         * maxLimit : null
         * searchCount : true
         * pages : 152
         */
        var total = 0
        var size = 0
        var current = 0
        var isOptimizeCountSql = false
        var isHitCount = false
        var countId: Any? = null
        var maxLimit: Any? = null
        var isSearchCount = false
        var pages = 0
        var records: List<RecordsBean>? = null
        var orders: List<*>? = null

        class RecordsBean {
            /**
             * companyId : 6681
             * orgname : 常州市文涛汽车配件厂
             * phone : 0510-68895220
             * logo : fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg
             * isAdd : false
             */
            var companyId = 0
            var orgname: String? = null
            var phone: String? = null
            var logo: String? = null
            var isAdd = false
        }
    }
}
package com.android.ctgapp.entity

class ClientEntity {
    /**
     * status : 0
     * msg : null
     * data : {"records":[{"companyId":12345,"orgname":"无锡畅通汽配公司","phone":"051082756645","industry":"经销商","logo":"672bce99-ad6f-41c3-830e-054f3dae68eb.gif","responsiblePerson":null}],"total":1,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":1}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * records : [{"companyId":12345,"orgname":"无锡畅通汽配公司","phone":"051082756645","industry":"经销商","logo":"672bce99-ad6f-41c3-830e-054f3dae68eb.gif","responsiblePerson":null}]
         * total : 1
         * size : 20
         * current : 1
         * orders : []
         * optimizeCountSql : true
         * hitCount : false
         * countId : null
         * maxLimit : null
         * searchCount : true
         * pages : 1
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
             * companyId : 12345
             * orgname : 无锡畅通汽配公司
             * phone : 051082756645
             * industry : 经销商
             * logo : 672bce99-ad6f-41c3-830e-054f3dae68eb.gif
             * responsiblePerson : null
             */
            var companyId = 0
            var orgname: String? = null
            var createUser: String? = null
            var phone: String? = null
            var industry: String? = null
            var logo: String? = null
            var responsiblePerson: String? = null

        }
    }
}
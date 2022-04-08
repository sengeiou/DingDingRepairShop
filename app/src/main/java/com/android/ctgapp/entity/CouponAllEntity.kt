package com.android.ctgapp.entity
data class CouponAllEntity(
    val `data`: List<Data>,
    val msg: Any,
    val status: Int,
    val success: Boolean
) {
    data class Data(
        val brandIds: List<Int>,
        val brands: String,
        val companyId: Int,
        val createTime: String,
        val createUserId: Any,
        val createUserName: Any,
        val ctgnum: String,
        val ctgnums: List<String>,
        val endDate: String,
        val goods: String,
        val goodsIds: List<Int>,
        val grantAmount: Double,
        val id: String,
        val isDeleted: Any,
        val leftAmount: Double,
        val remark: Any,
        val remissionPrice: Double,
        val startDate: String,
        val thresholdPrice: String,
        val totalAmount: Double,
        val useRecords: List<UseRecord>,
        val usedAmount: Double,
        val vname: String,
        val voucherClientId: String,
        val vstatus: Int
    ) {
        data class UseRecord(
            val billNo: String,
            val createTime: String,
            val id: Int,
            val isDeleted: Int,
            val leftAmount: String,
            val remark: String,
            val updateTime: String,
            val useAmount: Double,
            val userId: Int,
            val userName: String,
            val voucherClientId: Int,
            val changeType:Int
        )
    }
}
//class CouponAllEntity {
//    /**
//     * status : 0
//     * msg : null
//     * data : {"records":[{"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"id":102,"voucherId":33,"companyId":65551,"isUsed":1,"createUserId":1162,"createTime":"2020-12-30 14:19:52","updateTime":null,"usedTime":"2020-12-30 14:37:54","orderId":"ea7eb3f74b1345de8fe02d4d4c04a89d","applyWay":1,"voucherName":"韩泰玛吉斯","threshold":0.05,"deduction":0.03,"createUserName":null,"companyName":"小黄维修","companyAddress":"江苏无锡南长区中国 回归热","companyIndustryDescription":"修理厂","companyIndustry":"REPAIRSHOP","sellerCompanyId":888897987,"sellerCompanyName":"测试一夏经销","validPeriodStart":"2020-12-30 00:00:00","validPeriodEnd":"2020-12-31 23:59:59","orderNo":"DD20201230143743356T0CP019","totalPrice":0.11,"payPrice":0.08,"isTraded":null,"isOverdue":null,"voucherCategoryList":null,"voucherCategoryString":"轮胎","voucherBrandList":null,"voucherBrandString":"韩泰,玛吉斯","notAvailableReason":null},{"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"id":101,"voucherId":32,"companyId":65551,"isUsed":1,"createUserId":1162,"createTime":"2020-12-29 16:48:03","updateTime":null,"usedTime":"2020-12-29 16:48:45","orderId":"0cdc31d3c40146ed9980ee7190e7176f","applyWay":0,"voucherName":"米其林","threshold":0.05,"deduction":0.02,"createUserName":null,"companyName":"小黄维修","companyAddress":"江苏无锡南长区中国 回归热","companyIndustryDescription":"修理厂","companyIndustry":"REPAIRSHOP","sellerCompanyId":888897987,"sellerCompanyName":"测试一夏经销","validPeriodStart":"2020-12-29 00:00:00","validPeriodEnd":"2020-12-30 23:59:59","orderNo":"DD20201229164839183KQHR007","totalPrice":0.05,"payPrice":0.03,"isTraded":null,"isOverdue":null,"voucherCategoryList":null,"voucherCategoryString":null,"voucherBrandList":null,"voucherBrandString":null,"notAvailableReason":null}],"total":10,"size":2,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"countId":null,"maxLimit":null,"searchCount":true,"pages":5}
//     * success : true
//     */
//    var status = 0
//    var msg: Any? = null
//    var data: DataBean? = null
//    var isSuccess = false
//
//    class DataBean {
//        /**
//         * records : [{"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"id":102,"voucherId":33,"companyId":65551,"isUsed":1,"createUserId":1162,"createTime":"2020-12-30 14:19:52","updateTime":null,"usedTime":"2020-12-30 14:37:54","orderId":"ea7eb3f74b1345de8fe02d4d4c04a89d","applyWay":1,"voucherName":"韩泰玛吉斯","threshold":0.05,"deduction":0.03,"createUserName":null,"companyName":"小黄维修","companyAddress":"江苏无锡南长区中国 回归热","companyIndustryDescription":"修理厂","companyIndustry":"REPAIRSHOP","sellerCompanyId":888897987,"sellerCompanyName":"测试一夏经销","validPeriodStart":"2020-12-30 00:00:00","validPeriodEnd":"2020-12-31 23:59:59","orderNo":"DD20201230143743356T0CP019","totalPrice":0.11,"payPrice":0.08,"isTraded":null,"isOverdue":null,"voucherCategoryList":null,"voucherCategoryString":"轮胎","voucherBrandList":null,"voucherBrandString":"韩泰,玛吉斯","notAvailableReason":null},{"startDate":null,"endDate":null,"pageNum":1,"pageSize":20,"id":101,"voucherId":32,"companyId":65551,"isUsed":1,"createUserId":1162,"createTime":"2020-12-29 16:48:03","updateTime":null,"usedTime":"2020-12-29 16:48:45","orderId":"0cdc31d3c40146ed9980ee7190e7176f","applyWay":0,"voucherName":"米其林","threshold":0.05,"deduction":0.02,"createUserName":null,"companyName":"小黄维修","companyAddress":"江苏无锡南长区中国 回归热","companyIndustryDescription":"修理厂","companyIndustry":"REPAIRSHOP","sellerCompanyId":888897987,"sellerCompanyName":"测试一夏经销","validPeriodStart":"2020-12-29 00:00:00","validPeriodEnd":"2020-12-30 23:59:59","orderNo":"DD20201229164839183KQHR007","totalPrice":0.05,"payPrice":0.03,"isTraded":null,"isOverdue":null,"voucherCategoryList":null,"voucherCategoryString":null,"voucherBrandList":null,"voucherBrandString":null,"notAvailableReason":null}]
//         * total : 10
//         * size : 2
//         * current : 1
//         * orders : []
//         * optimizeCountSql : true
//         * hitCount : false
//         * countId : null
//         * maxLimit : null
//         * searchCount : true
//         * pages : 5
//         */
//        var total = 0
//        var size = 0
//        var current = 0
//        var isOptimizeCountSql = false
//        var isHitCount = false
//        var countId: Any? = null
//        var maxLimit: Any? = null
//        var isSearchCount = false
//        var pages = 0
//        var records: List<RecordsBean>? = null
//        var orders: List<*>? = null
//
//        class RecordsBean {
//            /**
//             * startDate : null
//             * endDate : null
//             * pageNum : 1
//             * pageSize : 20
//             * id : 102
//             * voucherId : 33
//             * companyId : 65551
//             * isUsed : 1
//             * createUserId : 1162
//             * createTime : 2020-12-30 14:19:52
//             * updateTime : null
//             * usedTime : 2020-12-30 14:37:54
//             * orderId : ea7eb3f74b1345de8fe02d4d4c04a89d
//             * applyWay : 1
//             * voucherName : 韩泰玛吉斯
//             * threshold : 0.05
//             * deduction : 0.03
//             * createUserName : null
//             * companyName : 小黄维修
//             * companyAddress : 江苏无锡南长区中国 回归热
//             * companyIndustryDescription : 修理厂
//             * companyIndustry : REPAIRSHOP
//             * sellerCompanyId : 888897987
//             * sellerCompanyName : 测试一夏经销
//             * validPeriodStart : 2020-12-30 00:00:00
//             * validPeriodEnd : 2020-12-31 23:59:59
//             * orderNo : DD20201230143743356T0CP019
//             * totalPrice : 0.11
//             * payPrice : 0.08
//             * isTraded : null
//             * isOverdue : null
//             * voucherCategoryList : null
//             * voucherCategoryString : 轮胎
//             * voucherBrandList : null
//             * voucherBrandString : 韩泰,玛吉斯
//             * notAvailableReason : null
//             */
//            var startDate: Any? = null
//            var endDate: Any? = null
//            var pageNum = 0
//            var pageSize = 0
//            var id = 0
//            var voucherId = 0
//            var companyId = 0
//            var isUsed = 0
//            var createUserId = 0
//            var createTime: String? = null
//            var updateTime: Any? = null
//            var usedTime: String? = null
//            var orderId: String? = null
//            var applyWay = 0
//            var voucherName: String? = null
//            var threshold = 0.0
//            var deduction = 0.0
//            var createUserName: Any? = null
//            var companyName: String? = null
//            var companyAddress: String? = null
//            var companyIndustryDescription: String? = null
//            var companyIndustry: String? = null
//            var sellerCompanyId = 0
//            var sellerCompanyName: String? = null
//            var validPeriodStart: String? = null
//            var validPeriodEnd: String? = null
//            var orderNo: String? = null
//            var totalPrice = 0.0
//            var payPrice = 0.0
//            var isTraded: Any? = null
//            var isOverdue: Any? = null
//            var voucherCategoryList: Any? = null
//            var voucherCategoryString: String? = null
//            var voucherBrandList: Any? = null
//            var voucherBrandString: String? = null
//            var notAvailableReason: Any? = null
//        }
//    }
//}
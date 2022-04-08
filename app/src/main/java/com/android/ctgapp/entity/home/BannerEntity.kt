package com.android.ctgapp.entity.home

class BannerEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"id":1,"companyId":2222,"picUrl":"https://ctgdev.oss-cn-shanghai.aliyuncs.com/acdBannerPic/414d6b054472425ebf8b0340acc6e113.png","picLinkUrl":"https://ctgdev.oss-cn-shanghai.aliyuncs.com/acdBannerPic/414d6b054472425ebf8b0340acc6e113.png","picName":"414d6b054472425ebf8b0340acc6e113.png","createPersonId":672,"createTime":"2020-10-29T14:02:56","updateTime":null}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * id : 1
         * companyId : 2222
         * picUrl : https://ctgdev.oss-cn-shanghai.aliyuncs.com/acdBannerPic/414d6b054472425ebf8b0340acc6e113.png
         * picLinkUrl : https://ctgdev.oss-cn-shanghai.aliyuncs.com/acdBannerPic/414d6b054472425ebf8b0340acc6e113.png
         * picName : 414d6b054472425ebf8b0340acc6e113.png
         * createPersonId : 672
         * createTime : 2020-10-29T14:02:56
         * updateTime : null
         */
        var id = 0
        var companyId = 0
        var picUrl: Any? = null
        var picLinkUrl: Any? = null
        var picName: String? = null
        var createPersonId = 0
        var createTime: String? = null
        var updateTime: Any? = null

    }
}
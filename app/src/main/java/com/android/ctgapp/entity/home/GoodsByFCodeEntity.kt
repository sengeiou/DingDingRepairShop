package com.android.ctgapp.entity.home

class GoodsByFCodeEntity {
    /**
     * status : 0
     * msg : null
     * data : {"goodsList":{"records":[{"salesPrice":14,"unit":"付","id":"73","imgs":null,"detailImgs":["http://image.ctgoe.com/brandpart/578db83f-5beb-49a8-8cb1-342a18084ea4.png","http://image.ctgoe.com/brandpart/a3ac5f4c-eeec-470e-936b-b6f67dd8650a.jpeg"],"stock":"1","nname":"05款骊威倒车镜(5线)（左）","nno":"HC-NS-003","categoryName":"轮胎","companyId":12345,"companyUuid":null,"brandid":"361","fcode":"106-10","sales":0,"keyName":null,"images":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png","brandName":"欧睿特","shopId":"SHOP_ID_0002","specStyle":null,"orgBrandName":null,"buyLimit":null,"showZero":null,"costPrice":null,"noTaxPrice":null,"retailPrice":null,"wholesalePrice":null,"allocatePrice":null,"minPrice":null,"defaultPrice":null,"defaultOperator":null,"orgName":null,"defaultAutio":null,"tagCode":null,"mbid":"361","description":"","ownSa":0,"im":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png","do_show_zero":null,"ctgcoding":""}],"total":1,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"searchCount":true,"pages":1},"brandList":[{"id":"361","brandName":"欧睿特","fcode":null,"num":null,"fname":null,"logo":null,"pinyin":null,"quanpin":null}]}
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null
    var isSuccess = false

    class DataBean {
        /**
         * goodsList : {"records":[{"salesPrice":14,"unit":"付","id":"73","imgs":null,"detailImgs":["http://image.ctgoe.com/brandpart/578db83f-5beb-49a8-8cb1-342a18084ea4.png","http://image.ctgoe.com/brandpart/a3ac5f4c-eeec-470e-936b-b6f67dd8650a.jpeg"],"stock":"1","nname":"05款骊威倒车镜(5线)（左）","nno":"HC-NS-003","categoryName":"轮胎","companyId":12345,"companyUuid":null,"brandid":"361","fcode":"106-10","sales":0,"keyName":null,"images":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png","brandName":"欧睿特","shopId":"SHOP_ID_0002","specStyle":null,"orgBrandName":null,"buyLimit":null,"showZero":null,"costPrice":null,"noTaxPrice":null,"retailPrice":null,"wholesalePrice":null,"allocatePrice":null,"minPrice":null,"defaultPrice":null,"defaultOperator":null,"orgName":null,"defaultAutio":null,"tagCode":null,"mbid":"361","description":"","ownSa":0,"im":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png","do_show_zero":null,"ctgcoding":""}],"total":1,"size":20,"current":1,"orders":[],"optimizeCountSql":true,"hitCount":false,"searchCount":true,"pages":1}
         * brandList : [{"id":"361","brandName":"欧睿特","fcode":null,"num":null,"fname":null,"logo":null,"pinyin":null,"quanpin":null}]
         */
        var goodsList: GoodsListBean? = null
        var brandList: List<BrandListBean>? = null
        var categoryVos: List<CategoryVosBean>? = null
        var fcodeVos: List<FcodeVosBean>? = null



        class FcodeVosBean{
            var fcode:String?=null
            var fname:String?=null
            var select=false
        }
        class GoodsListBean {
            /**
             * records : [{"salesPrice":14,"unit":"付","id":"73","imgs":null,"detailImgs":["http://image.ctgoe.com/brandpart/578db83f-5beb-49a8-8cb1-342a18084ea4.png","http://image.ctgoe.com/brandpart/a3ac5f4c-eeec-470e-936b-b6f67dd8650a.jpeg"],"stock":"1","nname":"05款骊威倒车镜(5线)（左）","nno":"HC-NS-003","categoryName":"轮胎","companyId":12345,"companyUuid":null,"brandid":"361","fcode":"106-10","sales":0,"keyName":null,"images":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png","brandName":"欧睿特","shopId":"SHOP_ID_0002","specStyle":null,"orgBrandName":null,"buyLimit":null,"showZero":null,"costPrice":null,"noTaxPrice":null,"retailPrice":null,"wholesalePrice":null,"allocatePrice":null,"minPrice":null,"defaultPrice":null,"defaultOperator":null,"orgName":null,"defaultAutio":null,"tagCode":null,"mbid":"361","description":"","ownSa":0,"im":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/goods/f5a54d5d-7fa7-44b7-9140-e085206a4ced.png","do_show_zero":null,"ctgcoding":""}]
             * total : 1
             * size : 20
             * current : 1
             * orders : []
             * optimizeCountSql : true
             * hitCount : false
             * searchCount : true
             * pages : 1
             */
            var total = 0
            var size = 0
            var current = 0
            var isOptimizeCountSql = false
            var isHitCount = false
            var isSearchCount = false
            var pages = 0
            var records: List<GoodsItemEntity>? = null
            var orders: List<*>? = null
        }

        class BrandListBean {
            /**
             * id : 361
             * brandName : 欧睿特
             * fcode : null
             * num : null
             * fname : null
             * logo : null
             * pinyin : null
             * quanpin : null
             */
            var id: String? = null
            var brandName: String? = null
            var fcode: Any? = null
            var num: Any? = null
            var fname: Any? = null
            var logo: Any? = null
            var pinyin: Any? = null
            var quanpin: Any? = null
            var select = false

        }

        class CategoryVosBean {
            /**
             * ctgnum : 3707201
             * fname : 火花塞
             */
            var ctgnum: String? = null
            var fname: String? = null
            var select=false
        }
    }
}
package com.android.ctgapp.entity.deal

class ReturnGoodsDetailEntity {
    /**
     * status : 0
     * msg : null
     * data : {"sellerCompanyAddress":"日本省东京市九龙坡区红东小街","sellerCompanyName":"测试一夏经销","sellerCompanyId":888897987,"buyerCompanyName":"小黄维修","buyerCompanyId":65551,"applyPersonId":"1309","applyPerson":" 小黄","telephone":"18312345678","applyTime":"2020-12-16 12:46:04","recieveGoodsTime":null,"returnReason":"","returnDesc":"质量不行","returnNo":"TH20201216124604011VGE6022","returnStatus":"待收货/已发货","returnStatusCode":9,"checkDesc":"","orderId":"5aec3b9ffd4f40979fdbf82725a8c102","orderNo":"DD20201211134344134QNNY020","payWayString":"挂账","returnOrderId":"7c107b4f58de4ec2ba28c8b14fd498bc","returnNum":2,"returnPrice":0.04,"returnOrderDetails":[{"orderDetailId":"2e55203370024ff793bdce2695ad1d0d","returnNum":2,"goodsAmount":2,"goodsPrice":0.02,"goodsName":"轮胎","goodsNo":"20201204002","partName":null,"partOe":null,"goodsImg":null,"spec":null,"brand":null}],"returnPics":[{"id":"018808b8bfbe4917b70749d1bd602572","returnOrderId":"7c107b4f58de4ec2ba28c8b14fd498bc","picName":"4bfe0963bfa74345acaec3a36b9c2ac4.jpeg","picUrl":"https://ctgdev.oss-cn-shanghai.aliyuncs.com/returnOrderPic/4bfe0963bfa74345acaec3a36b9c2ac4.jpeg"},{"id":"6e1e038d5d9c444da8d41da06da7d85c","returnOrderId":"7c107b4f58de4ec2ba28c8b14fd498bc","picName":"bb264c797ad44f0c9cc1e54ddb3aa174.jpeg","picUrl":"https://ctgdev.oss-cn-shanghai.aliyuncs.com/returnOrderPic/bb264c797ad44f0c9cc1e54ddb3aa174.jpeg"},{"id":"ec90d3c5175046e8afcf815dc1d7d2c8","returnOrderId":"7c107b4f58de4ec2ba28c8b14fd498bc","picName":"51e8996e44524bfb85b9bdec67435a5f.jpeg","picUrl":"https://ctgdev.oss-cn-shanghai.aliyuncs.com/returnOrderPic/51e8996e44524bfb85b9bdec67435a5f.jpeg"}],"orderWay":null,"returnOrderWay":0,"logisticsNo":null,"doLogistics":null,"logisticsName":null}
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null
    var isSuccess = false

    class DataBean {
        /**
         * sellerCompanyAddress : 日本省东京市九龙坡区红东小街
         * sellerCompanyName : 测试一夏经销
         * sellerCompanyId : 888897987
         * buyerCompanyName : 小黄维修
         * buyerCompanyId : 65551
         * applyPersonId : 1309
         * applyPerson :  小黄
         * telephone : 18312345678
         * applyTime : 2020-12-16 12:46:04
         * recieveGoodsTime : null
         * returnReason :
         * returnDesc : 质量不行
         * returnNo : TH20201216124604011VGE6022
         * returnStatus : 待收货/已发货
         * returnStatusCode : 9
         * checkDesc :
         * orderId : 5aec3b9ffd4f40979fdbf82725a8c102
         * orderNo : DD20201211134344134QNNY020
         * payWayString : 挂账
         * returnOrderId : 7c107b4f58de4ec2ba28c8b14fd498bc
         * returnNum : 2
         * returnPrice : 0.04
         * returnOrderDetails : [{"orderDetailId":"2e55203370024ff793bdce2695ad1d0d","returnNum":2,"goodsAmount":2,"goodsPrice":0.02,"goodsName":"轮胎","goodsNo":"20201204002","partName":null,"partOe":null,"goodsImg":null,"spec":null,"brand":null}]
         * returnPics : [{"id":"018808b8bfbe4917b70749d1bd602572","returnOrderId":"7c107b4f58de4ec2ba28c8b14fd498bc","picName":"4bfe0963bfa74345acaec3a36b9c2ac4.jpeg","picUrl":"https://ctgdev.oss-cn-shanghai.aliyuncs.com/returnOrderPic/4bfe0963bfa74345acaec3a36b9c2ac4.jpeg"},{"id":"6e1e038d5d9c444da8d41da06da7d85c","returnOrderId":"7c107b4f58de4ec2ba28c8b14fd498bc","picName":"bb264c797ad44f0c9cc1e54ddb3aa174.jpeg","picUrl":"https://ctgdev.oss-cn-shanghai.aliyuncs.com/returnOrderPic/bb264c797ad44f0c9cc1e54ddb3aa174.jpeg"},{"id":"ec90d3c5175046e8afcf815dc1d7d2c8","returnOrderId":"7c107b4f58de4ec2ba28c8b14fd498bc","picName":"51e8996e44524bfb85b9bdec67435a5f.jpeg","picUrl":"https://ctgdev.oss-cn-shanghai.aliyuncs.com/returnOrderPic/51e8996e44524bfb85b9bdec67435a5f.jpeg"}]
         * orderWay : null
         * returnOrderWay : 0
         * logisticsNo : null
         * doLogistics : null
         * logisticsName : null
         */
        var sellerCompanyAddress: String? = null
        var sellerCompanyName: String? = null
        var sellerCompanyId = 0
        var buyerCompanyName: String? = null
        var buyerCompanyId = 0
        var applyPersonId: String? = null
        var applyPerson: String? = null
        var telephone: String? = null
        var applyTime: String? = null
        var recieveGoodsTime: Any? = null
        var returnReason: String? = null
        var returnDesc: String? = null
        var returnNo: String? = null
        var returnStatus: String? = null
        var returnStatusCode = 0
        var checkDesc: String? = null
        var orderId: String? = null
        var orderNo: String? = null
        var payWayString: String? = null
        var returnOrderId: String? = null
        var returnNum = 0
        var returnPrice = 0.0
        var orderWay: Any? = null
        var returnOrderWay = 0
        var logisticsNo: Any? = null
        var doLogistics: Any? = null
        var logisticsName: Any? = null
        var returnOrderDetails: List<ReturnOrderDetailsBean>? = null
        var returnPics: List<ReturnPicsBean>? = null
        var chaters: List<ChatersBean>? = null


        class ReturnOrderDetailsBean {
            /**
             * orderDetailId : 2e55203370024ff793bdce2695ad1d0d
             * returnNum : 2
             * goodsAmount : 2
             * goodsPrice : 0.02
             * goodsName : 轮胎
             * goodsNo : 20201204002
             * partName : null
             * partOe : null
             * goodsImg : null
             * spec : null
             * brand : null
             */
            var orderDetailId: String? = null
            var returnNum = 0
            var goodsAmount = 0
            var goodsPrice = 0.0
            var goodsName: String? = null
            var goodsNo: String? = null
            var partName: Any? = null
            var partOe: Any? = null
            var goodsImg: Any? = null
            var spec: Any? = null
            var brand: Any? = null

            //是否选中可退货的商品
            var afterSaleSelect: Boolean = false
            //修改后的退货商品数量
            var editGoodsReturn = 0
            var remark = ""


        }

        class ReturnPicsBean {
            /**
             * id : 018808b8bfbe4917b70749d1bd602572
             * returnOrderId : 7c107b4f58de4ec2ba28c8b14fd498bc
             * picName : 4bfe0963bfa74345acaec3a36b9c2ac4.jpeg
             * picUrl : https://ctgdev.oss-cn-shanghai.aliyuncs.com/returnOrderPic/4bfe0963bfa74345acaec3a36b9c2ac4.jpeg
             */
            var id: String? = null
            var returnOrderId: String? = null
            var picName: String? = null
            var picUrl: String? = null
        }
    }
}
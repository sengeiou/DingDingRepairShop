package com.android.ctgapp.entity.home

import java.io.Serializable

class BottomBrandMenuEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"brandId":4999,"ctgnum":"3106001","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/293ecbf0-b8f5-45e2-88e7-f93a4c325851.png","fname":"轮胎"},{"brandId":17589,"ctgnum":"3707201","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/e1eb17cd-0925-4646-abd0-52e1c0e6327b.jpg","fname":"火花塞"},{"brandId":17594,"ctgnum":"3703100","logo":null,"fname":"蓄电池"},{"brandId":19677,"ctgnum":"3106001","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/109fd658-069e-4338-97d7-9e0cab175691.jpg","fname":"轮胎"},{"brandId":19677,"ctgnum":"3106001","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/109fd658-069e-4338-97d7-9e0cab175691.jpg","fname":"轮胎"},{"brandId":19678,"ctgnum":"3106001","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/2e2dc4a7-d46f-47e8-abb9-5547da14d1f3.png","fname":"轮胎"},{"brandId":19679,"ctgnum":"3106001","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/2265b1ca-1e22-4bf3-a990-a1b8c4685554.png","fname":"轮胎"},{"brandId":19679,"ctgnum":"3106001","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/2265b1ca-1e22-4bf3-a990-a1b8c4685554.png","fname":"轮胎"},{"brandId":19680,"ctgnum":"3707201","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/null","fname":"火花塞"},{"brandId":19680,"ctgnum":"3707201","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/null","fname":"火花塞"},{"brandId":19680,"ctgnum":"3707201","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/null","fname":"火花塞"},{"brandId":19690,"ctgnum":"3106001","logo":null,"fname":"轮胎"},{"brandId":19713,"ctgnum":"3106001","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/8dc0db40-615b-4873-b874-3f04cee9967a.png","fname":"轮胎"},{"brandId":19717,"ctgnum":"3501101","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/8963e541-87c9-4817-8aa2-79fdff697cfc.jpg","fname":"前刹车片"},{"brandId":20757,"ctgnum":"3707201","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/ef351895-878b-477f-9fa5-d73acaedc1a6.png","fname":"火花塞"},{"brandId":20761,"ctgnum":"3707201","logo":null,"fname":"火花塞"},{"brandId":20761,"ctgnum":"3707201","logo":null,"fname":"火花塞"},{"brandId":20765,"ctgnum":"3707201","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/d19f736a-3642-43d7-97e5-cf969e296ea0.jpg","fname":"火花塞"},{"brandId":20778,"ctgnum":"1025100","logo":null,"fname":"风扇皮带"},{"brandId":20779,"ctgnum":"3501101","logo":null,"fname":"前刹车片"},{"brandId":20780,"ctgnum":"1301100","logo":null,"fname":"散热器"}]
     * success : true
     */
    var status: Int? = null
    var msg: Any? = null
    var isSuccess: Boolean? = null
    var data: List<DataBean>? = null

    class DataBean : Serializable {
        /**
         * brandId : 4999
         * ctgnum : 3106001
         * logo : http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/293ecbf0-b8f5-45e2-88e7-f93a4c325851.png
         * fname : 轮胎
         */
        var brandId: Int? = null
        var ctgnum: String? = null
        var logo: Any? = null
        var fname: String? = null
        var seriesName: String? = null
        var brandName: String? = null

    }
}
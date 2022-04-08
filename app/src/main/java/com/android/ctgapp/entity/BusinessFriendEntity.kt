package com.android.ctgapp.entity

import java.io.Serializable

class BusinessFriendEntity : Serializable {
    /**
     * status : 0
     * msg : null
     * data : [{"uid":709,"realName":"风","orgname":"享汽配","companyId":888897021,"imageUrl":null,"telephone":"15189519049","friendRemark":null,"status":1},{"uid":710,"realName":"范冬冬","orgname":"车仕客汽车服务","companyId":888897022,"imageUrl":null,"telephone":"15056149269","friendRemark":"我啊","status":1},{"uid":711,"realName":"彭升平","orgname":"南京新汽业汽配有限公司","companyId":888897024,"imageUrl":null,"telephone":"18297962559","friendRemark":null,"status":1},{"uid":715,"realName":"顾晓妍","orgname":"无锡市君德汽车维修有限公司","companyId":888897028,"imageUrl":null,"telephone":"18915279762","friendRemark":null,"status":1},{"uid":716,"realName":"周海亚","orgname":"神州名车专修","companyId":888897029,"imageUrl":null,"telephone":"15061841310","friendRemark":null,"status":1},{"uid":790,"realName":"小Q","orgname":"小Q制造商","companyId":888897135,"imageUrl":"6b0474d0-84a7-4eb6-86b5-607122f119ea.jpg","telephone":"13771511355","friendRemark":null,"status":1},{"uid":718,"realName":"汤本利","orgname":"浩坤汽修","companyId":888897031,"imageUrl":null,"telephone":"13921398372","friendRemark":null,"status":1},{"uid":719,"realName":"祁德健","orgname":"小祁","companyId":888897032,"imageUrl":null,"telephone":"15050670862","friendRemark":null,"status":1}]
     * success : true
     */
    var status = 0
    var msg: Any? = null
    var isSuccess = false
    var data: List<DataBean>? = null

    class DataBean : Serializable {
        /**
         * uid : 709
         * realName : 风
         * orgname : 享汽配
         * companyId : 888897021
         * imageUrl : null
         * telephone : 15189519049
         * friendRemark : null
         * status : 1
         */
        var uid = 0
        var realName: String? = null
        var orgname: String? = null
        var companyId = 0
        var imageUrl: Any? = null
        var telephone: String? = null
        var friendRemark: Any? = null
        var status = 0
        var selected = false
        var isOnline = false

    }
}
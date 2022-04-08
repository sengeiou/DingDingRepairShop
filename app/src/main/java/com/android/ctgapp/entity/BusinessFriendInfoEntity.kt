package com.android.ctgapp.entity

class BusinessFriendInfoEntity {
    /**
     * status : 0
     * msg : null
     * data : {"groupName":null,"friendRemark":"我啊","userinfo":{"id":710,"realName":"范冬冬","orgname":"车仕客汽车服务","telephone":"15056149269","address":"江苏省无锡市新吴区梅育路63号","departmentName":null,"industry":"修理厂"}}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * groupName : null
         * friendRemark : 我啊
         * userinfo : {"id":710,"realName":"范冬冬","orgname":"车仕客汽车服务","telephone":"15056149269","address":"江苏省无锡市新吴区梅育路63号","departmentName":null,"industry":"修理厂"}
         */
        var groupName: Any? = null
        var friendRemark: String? = null
        var userinfo: UserinfoBean? = null

        class UserinfoBean {
            /**
             * id : 710
             * realName : 范冬冬
             * orgname : 车仕客汽车服务
             * telephone : 15056149269
             * address : 江苏省无锡市新吴区梅育路63号
             * departmentName : null
             * industry : 修理厂
             */
            var id = 0
            var realName: String? = null
            var orgname: String? = null
            var telephone: String? = null
            var address: String? = null
            var departmentName: Any? = null
            var industry: String? = null
            var isAdded: Boolean = true
        }
    }
}
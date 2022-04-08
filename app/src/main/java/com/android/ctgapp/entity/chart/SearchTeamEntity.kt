package com.android.ctgapp.entity.chart

class SearchTeamEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"companyId":888897686,"orgname":"郑州报废机动车回收中心","logo":"fc8ef8a8","users":[{"id":1260,"realName":"朱佳","companyId":888897686,"orgname":"郑州报废机动车回收中心","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","telephone":"18552026537","address":"河南省郑州市中原区河南郑州","departmentName":null,"industry":null,"imageUrl":"1ab211ee-677e-4fae-9a3a-aab8c2303c51.jpeg"},{"id":1365,"realName":"朱佳","companyId":888897686,"orgname":"郑州报废机动车回收中心","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","telephone":"13921131566","address":"河南省郑州市中原区河南郑州","departmentName":null,"industry":null,"imageUrl":"@_@.jpg"},{"id":1382,"realName":"朱佳佳","companyId":888897686,"orgname":"郑州报废机动车回收中心","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","telephone":"13821131593","address":"河南省郑州市中原区河南郑州","departmentName":null,"industry":null,"imageUrl":"@_@.jpg"}]}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * companyId : 888897686
         * orgname : 郑州报废机动车回收中心
         * logo : fc8ef8a8
         * users : [{"id":1260,"realName":"朱佳","companyId":888897686,"orgname":"郑州报废机动车回收中心","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","telephone":"18552026537","address":"河南省郑州市中原区河南郑州","departmentName":null,"industry":null,"imageUrl":"1ab211ee-677e-4fae-9a3a-aab8c2303c51.jpeg"},{"id":1365,"realName":"朱佳","companyId":888897686,"orgname":"郑州报废机动车回收中心","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","telephone":"13921131566","address":"河南省郑州市中原区河南郑州","departmentName":null,"industry":null,"imageUrl":"@_@.jpg"},{"id":1382,"realName":"朱佳佳","companyId":888897686,"orgname":"郑州报废机动车回收中心","logo":"fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg","telephone":"13821131593","address":"河南省郑州市中原区河南郑州","departmentName":null,"industry":null,"imageUrl":"@_@.jpg"}]
         */
        var companyId = 0
        var orgname: String? = null
        var logo: String? = null
        var users: List<UsersBean>? = null

        class UsersBean {
            /**
             * id : 1260
             * realName : 朱佳
             * companyId : 888897686
             * orgname : 郑州报废机动车回收中心
             * logo : fc8ef8a8-17f3-447c-b427-affc84575be8.jpeg
             * telephone : 18552026537
             * address : 河南省郑州市中原区河南郑州
             * departmentName : null
             * industry : null
             * imageUrl : 1ab211ee-677e-4fae-9a3a-aab8c2303c51.jpeg
             */
            var id = 0
            var realName: String? = null
            var companyId = 0
            var orgname: String? = null
            var logo: String? = null
            var telephone: String? = null
            var address: String? = null
            var departmentName: Any? = null
            var industry: Any? = null
            var imageUrl: String? = null
        }
    }
}
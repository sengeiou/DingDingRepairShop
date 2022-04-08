package com.android.ctgapp.entity.home

class EnquiryQueryCompanyEntity {
    /**
     * status : 0
     * msg : null
     * data : [{"id":65546,"name":"小丫经销店"},{"id":88889529,"name":"TY汽配经销商"}]
     */
    var status = 0
    var msg: Any? = null
    var data: List<EnquiryQueryCompanyEntityChild>? = null


}

class EnquiryQueryCompanyEntityChild {
    /**
     * id : 65546
     * name : 小丫经销店
     */
    var id = 0
    var name: String? = null
    var canDelete = true

}
package com.android.ctgapp.entity.chart

class FileResultWithPathEntity {
    /**
     * status : 0
     * msg : null
     * data : {"filename":"magazine-unlock-05-2.3.7012-EEBDFB1175C5C5B1D0099E8641504969.jpeg","a":"/storage/emulated/0/MagazineUnlock/magazine-unlock-05-2.3.7012-EEBDFB1175C5C5B1D0099E8641504969.jpg","url":"90e17e61-6161-4c4e-bc83-4863802cc1fa.jpeg"}
     */
    var status = 0
    var msg: Any? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * filename : magazine-unlock-05-2.3.7012-EEBDFB1175C5C5B1D0099E8641504969.jpeg
         * url : 90e17e61-6161-4c4e-bc83-4863802cc1fa.jpeg
         */
        var filename: String? = null
        var url: String? = null
    }
}
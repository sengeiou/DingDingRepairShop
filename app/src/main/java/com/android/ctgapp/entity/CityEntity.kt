package com.android.ctgapp.entity


class CityEntity {
    var province: List<ProvinceBean>? = null

    class ProvinceBean {
        /**
         * name : 北京
         * city : [{"name":"北京","area":["东城区","西城区","崇文区","宣武区","朝阳区","丰台区","石景山区","海淀区","门头沟区","房山区","通州区","顺义区","昌平区","大兴区","平谷区","怀柔区","密云县","延庆县"]}]
         */
        var name: String? = null
        var city: List<CityBean>? = null

        class CityBean {
            /**
             * name : 北京
             * area : ["东城区","西城区","崇文区","宣武区","朝阳区","丰台区","石景山区","海淀区","门头沟区","房山区","通州区","顺义区","昌平区","大兴区","平谷区","怀柔区","密云县","延庆县"]
             */
            var name: String? = null
            var area: List<String>? = null
        }
    }
}
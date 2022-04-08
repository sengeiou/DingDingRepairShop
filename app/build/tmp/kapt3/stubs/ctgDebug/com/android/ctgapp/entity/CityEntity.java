package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lcom/android/ctgapp/entity/CityEntity;", "", "()V", "province", "", "Lcom/android/ctgapp/entity/CityEntity$ProvinceBean;", "getProvince", "()Ljava/util/List;", "setProvince", "(Ljava/util/List;)V", "ProvinceBean", "app_ctgDebug"})
public final class CityEntity {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.CityEntity.ProvinceBean> province;
    
    public CityEntity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.android.ctgapp.entity.CityEntity.ProvinceBean> getProvince() {
        return null;
    }
    
    public final void setProvince(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.CityEntity.ProvinceBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/android/ctgapp/entity/CityEntity$ProvinceBean;", "", "()V", "city", "", "Lcom/android/ctgapp/entity/CityEntity$ProvinceBean$CityBean;", "getCity", "()Ljava/util/List;", "setCity", "(Ljava/util/List;)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "CityBean", "app_ctgDebug"})
    public static final class ProvinceBean {
        
        /**
         * name : 北京
         * city : [{"name":"北京","area":["东城区","西城区","崇文区","宣武区","朝阳区","丰台区","石景山区","海淀区","门头沟区","房山区","通州区","顺义区","昌平区","大兴区","平谷区","怀柔区","密云县","延庆县"]}]
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.CityEntity.ProvinceBean.CityBean> city;
        
        public ProvinceBean() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.CityEntity.ProvinceBean.CityBean> getCity() {
            return null;
        }
        
        public final void setCity(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.CityEntity.ProvinceBean.CityBean> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/android/ctgapp/entity/CityEntity$ProvinceBean$CityBean;", "", "()V", "area", "", "", "getArea", "()Ljava/util/List;", "setArea", "(Ljava/util/List;)V", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "app_ctgDebug"})
        public static final class CityBean {
            
            /**
             * name : 北京
             * area : ["东城区","西城区","崇文区","宣武区","朝阳区","丰台区","石景山区","海淀区","门头沟区","房山区","通州区","顺义区","昌平区","大兴区","平谷区","怀柔区","密云县","延庆县"]
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String name;
            @org.jetbrains.annotations.Nullable()
            private java.util.List<java.lang.String> area;
            
            public CityBean() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getName() {
                return null;
            }
            
            public final void setName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<java.lang.String> getArea() {
                return null;
            }
            
            public final void setArea(@org.jetbrains.annotations.Nullable()
            java.util.List<java.lang.String> p0) {
            }
        }
    }
}
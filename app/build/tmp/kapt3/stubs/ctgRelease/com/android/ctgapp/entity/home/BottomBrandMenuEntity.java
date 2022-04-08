package com.android.ctgapp.entity.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001d"}, d2 = {"Lcom/android/ctgapp/entity/home/BottomBrandMenuEntity;", "", "()V", "data", "", "Lcom/android/ctgapp/entity/home/BottomBrandMenuEntity$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "isSuccess", "", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "DataBean", "app_ctgRelease"})
public final class BottomBrandMenuEntity {
    
    /**
     * status : 0
     * msg : null
     * data : [{"brandId":4999,"ctgnum":"3106001","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/293ecbf0-b8f5-45e2-88e7-f93a4c325851.png","fname":"轮胎"},{"brandId":17589,"ctgnum":"3707201","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/e1eb17cd-0925-4646-abd0-52e1c0e6327b.jpg","fname":"火花塞"},{"brandId":17594,"ctgnum":"3703100","logo":null,"fname":"蓄电池"},{"brandId":19677,"ctgnum":"3106001","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/109fd658-069e-4338-97d7-9e0cab175691.jpg","fname":"轮胎"},{"brandId":19677,"ctgnum":"3106001","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/109fd658-069e-4338-97d7-9e0cab175691.jpg","fname":"轮胎"},{"brandId":19678,"ctgnum":"3106001","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/2e2dc4a7-d46f-47e8-abb9-5547da14d1f3.png","fname":"轮胎"},{"brandId":19679,"ctgnum":"3106001","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/2265b1ca-1e22-4bf3-a990-a1b8c4685554.png","fname":"轮胎"},{"brandId":19679,"ctgnum":"3106001","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/2265b1ca-1e22-4bf3-a990-a1b8c4685554.png","fname":"轮胎"},{"brandId":19680,"ctgnum":"3707201","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/null","fname":"火花塞"},{"brandId":19680,"ctgnum":"3707201","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/null","fname":"火花塞"},{"brandId":19680,"ctgnum":"3707201","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/null","fname":"火花塞"},{"brandId":19690,"ctgnum":"3106001","logo":null,"fname":"轮胎"},{"brandId":19713,"ctgnum":"3106001","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/8dc0db40-615b-4873-b874-3f04cee9967a.png","fname":"轮胎"},{"brandId":19717,"ctgnum":"3501101","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/8963e541-87c9-4817-8aa2-79fdff697cfc.jpg","fname":"前刹车片"},{"brandId":20757,"ctgnum":"3707201","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/ef351895-878b-477f-9fa5-d73acaedc1a6.png","fname":"火花塞"},{"brandId":20761,"ctgnum":"3707201","logo":null,"fname":"火花塞"},{"brandId":20761,"ctgnum":"3707201","logo":null,"fname":"火花塞"},{"brandId":20765,"ctgnum":"3707201","logo":"http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/d19f736a-3642-43d7-97e5-cf969e296ea0.jpg","fname":"火花塞"},{"brandId":20778,"ctgnum":"1025100","logo":null,"fname":"风扇皮带"},{"brandId":20779,"ctgnum":"3501101","logo":null,"fname":"前刹车片"},{"brandId":20780,"ctgnum":"1301100","logo":null,"fname":"散热器"}]
     * success : true
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isSuccess;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.home.BottomBrandMenuEntity.DataBean> data;
    
    public BottomBrandMenuEntity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMsg() {
        return null;
    }
    
    public final void setMsg(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isSuccess() {
        return null;
    }
    
    public final void setSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.android.ctgapp.entity.home.BottomBrandMenuEntity.DataBean> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.home.BottomBrandMenuEntity.DataBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f\u00a8\u0006\u001f"}, d2 = {"Lcom/android/ctgapp/entity/home/BottomBrandMenuEntity$DataBean;", "Ljava/io/Serializable;", "()V", "brandId", "", "getBrandId", "()Ljava/lang/Integer;", "setBrandId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "brandName", "", "getBrandName", "()Ljava/lang/String;", "setBrandName", "(Ljava/lang/String;)V", "ctgnum", "getCtgnum", "setCtgnum", "fname", "getFname", "setFname", "logo", "", "getLogo", "()Ljava/lang/Object;", "setLogo", "(Ljava/lang/Object;)V", "seriesName", "getSeriesName", "setSeriesName", "app_ctgRelease"})
    public static final class DataBean implements java.io.Serializable {
        
        /**
         * brandId : 4999
         * ctgnum : 3106001
         * logo : http://ctgdev.oss-cn-shanghai.aliyuncs.com/urm/personal/293ecbf0-b8f5-45e2-88e7-f93a4c325851.png
         * fname : 轮胎
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer brandId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String ctgnum;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object logo;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String fname;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String seriesName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String brandName;
        
        public DataBean() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getBrandId() {
            return null;
        }
        
        public final void setBrandId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCtgnum() {
            return null;
        }
        
        public final void setCtgnum(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getLogo() {
            return null;
        }
        
        public final void setLogo(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFname() {
            return null;
        }
        
        public final void setFname(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSeriesName() {
            return null;
        }
        
        public final void setSeriesName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBrandName() {
            return null;
        }
        
        public final void setBrandName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
    }
}
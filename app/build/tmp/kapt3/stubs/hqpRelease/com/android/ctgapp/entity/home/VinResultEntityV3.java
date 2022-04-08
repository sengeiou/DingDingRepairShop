package com.android.ctgapp.entity.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001b"}, d2 = {"Lcom/android/ctgapp/entity/home/VinResultEntityV3;", "", "()V", "data", "Lcom/android/ctgapp/entity/home/VinResultEntityV3$DataBean;", "getData", "()Lcom/android/ctgapp/entity/home/VinResultEntityV3$DataBean;", "setData", "(Lcom/android/ctgapp/entity/home/VinResultEntityV3$DataBean;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "OptionEntity", "app_hqpRelease"})
public final class VinResultEntityV3 {
    
    /**
     * status : 0
     * msg : null
     * data : {"brand":"本田","factory":"东风本田","series":"CR-V","groups":"","model":"CR-V","sales":"2.4 自动 VTi 豪华版","year":"2007","chassis":"RE4","body":"SUV","engine":"K24Z1","trans":"自动变速器(AT)","transnum":"5","displacement":"2.4","drive":"前置四驱","logo":"http://image.ctgoe.com/stw/epcbrandlogo/honda.png","img":"http://image.ctgoe.com/stw/carimg/dongfengbentiancrv_2007.jpg","carid":"9bd11509-282c-4ada-9b56-187def9480e7","option":"","epc":"HONDA","ctggroupSupport":true,"selection":"","expensive":0}
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.home.VinResultEntityV3.DataBean data;
    private boolean isSuccess = false;
    
    public VinResultEntityV3() {
        super();
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMsg() {
        return null;
    }
    
    public final void setMsg(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.ctgapp.entity.home.VinResultEntityV3.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.home.VinResultEntityV3.DataBean p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010\'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\"\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR\u001c\u00107\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR\u001c\u0010:\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001c\u0010=\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR\u001c\u0010@\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\b\u00a8\u0006C"}, d2 = {"Lcom/android/ctgapp/entity/home/VinResultEntityV3$DataBean;", "", "()V", "body", "", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "brand", "getBrand", "setBrand", "carid", "getCarid", "setCarid", "chassis", "getChassis", "setChassis", "displacement", "getDisplacement", "setDisplacement", "drive", "getDrive", "setDrive", "engine", "getEngine", "setEngine", "epc", "getEpc", "setEpc", "factory", "getFactory", "setFactory", "groups", "getGroups", "setGroups", "img", "getImg", "setImg", "logo", "getLogo", "setLogo", "model", "getModel", "setModel", "option", "", "Lcom/android/ctgapp/entity/home/VinResultEntityV3$OptionEntity;", "getOption", "()Ljava/util/List;", "setOption", "(Ljava/util/List;)V", "sales", "getSales", "setSales", "series", "getSeries", "setSeries", "trans", "getTrans", "setTrans", "transnum", "getTransnum", "setTransnum", "year", "getYear", "setYear", "app_hqpRelease"})
    public static final class DataBean {
        
        /**
         * brand : 本田
         * factory : 东风本田
         * series : CR-V
         * groups :
         * model : CR-V
         * sales : 2.4 自动 VTi 豪华版
         * year : 2007
         * chassis : RE4
         * body : SUV
         * engine : K24Z1
         * trans : 自动变速器(AT)
         * transnum : 5
         * displacement : 2.4
         * drive : 前置四驱
         * logo : http://image.ctgoe.com/stw/epcbrandlogo/honda.png
         * img : http://image.ctgoe.com/stw/carimg/dongfengbentiancrv_2007.jpg
         * carid : 9bd11509-282c-4ada-9b56-187def9480e7
         * option :
         * epc : HONDA
         * ctggroupSupport : true
         * selection :
         * expensive : 0
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.String brand;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String factory;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String series;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String groups;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String model;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String sales;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String year;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String chassis;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String body;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String engine;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String trans;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String transnum;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String displacement;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String drive;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String logo;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String img;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String carid;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.home.VinResultEntityV3.OptionEntity> option;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String epc;
        
        public DataBean() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBrand() {
            return null;
        }
        
        public final void setBrand(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFactory() {
            return null;
        }
        
        public final void setFactory(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSeries() {
            return null;
        }
        
        public final void setSeries(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGroups() {
            return null;
        }
        
        public final void setGroups(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getModel() {
            return null;
        }
        
        public final void setModel(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSales() {
            return null;
        }
        
        public final void setSales(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getYear() {
            return null;
        }
        
        public final void setYear(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getChassis() {
            return null;
        }
        
        public final void setChassis(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBody() {
            return null;
        }
        
        public final void setBody(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEngine() {
            return null;
        }
        
        public final void setEngine(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTrans() {
            return null;
        }
        
        public final void setTrans(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTransnum() {
            return null;
        }
        
        public final void setTransnum(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDisplacement() {
            return null;
        }
        
        public final void setDisplacement(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDrive() {
            return null;
        }
        
        public final void setDrive(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLogo() {
            return null;
        }
        
        public final void setLogo(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImg() {
            return null;
        }
        
        public final void setImg(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCarid() {
            return null;
        }
        
        public final void setCarid(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.home.VinResultEntityV3.OptionEntity> getOption() {
            return null;
        }
        
        public final void setOption(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.home.VinResultEntityV3.OptionEntity> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEpc() {
            return null;
        }
        
        public final void setEpc(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014\u00a8\u0006\u0018"}, d2 = {"Lcom/android/ctgapp/entity/home/VinResultEntityV3$OptionEntity;", "", "()V", "attributeList", "", "Lcom/android/ctgapp/entity/home/VinResultEntityV3$OptionEntity$AttributeListBean;", "getAttributeList", "()Ljava/util/List;", "setAttributeList", "(Ljava/util/List;)V", "carid", "", "getCarid", "()Ljava/lang/String;", "setCarid", "(Ljava/lang/String;)V", "isCtggroupSupport", "", "()Z", "setCtggroupSupport", "(Z)V", "isEpcgroupSupport", "setEpcgroupSupport", "AttributeListBean", "app_hqpRelease"})
    public static final class OptionEntity {
        
        /**
         * attributeList : [{"attributeValue":"THIS       CHINA-6(发动机型号P10A3)","show":true,"attributeName":"等级"},{"attributeValue":"左舵,真皮座椅","show":true,"attributeName":"配置"}]
         * ctggroupSupport : true
         * epcgroupSupport : true
         * carid : 999d183e-5d2c-4026-bcb5-23aae30243b1
         */
        private boolean isCtggroupSupport = false;
        private boolean isEpcgroupSupport = false;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String carid;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.home.VinResultEntityV3.OptionEntity.AttributeListBean> attributeList;
        
        public OptionEntity() {
            super();
        }
        
        public final boolean isCtggroupSupport() {
            return false;
        }
        
        public final void setCtggroupSupport(boolean p0) {
        }
        
        public final boolean isEpcgroupSupport() {
            return false;
        }
        
        public final void setEpcgroupSupport(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCarid() {
            return null;
        }
        
        public final void setCarid(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.home.VinResultEntityV3.OptionEntity.AttributeListBean> getAttributeList() {
            return null;
        }
        
        public final void setAttributeList(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.home.VinResultEntityV3.OptionEntity.AttributeListBean> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/android/ctgapp/entity/home/VinResultEntityV3$OptionEntity$AttributeListBean;", "Ljava/io/Serializable;", "()V", "attributeName", "", "getAttributeName", "()Ljava/lang/String;", "setAttributeName", "(Ljava/lang/String;)V", "attributeValue", "getAttributeValue", "setAttributeValue", "isShow", "", "()Z", "setShow", "(Z)V", "app_hqpRelease"})
        public static final class AttributeListBean implements java.io.Serializable {
            
            /**
             * attributeValue : THIS       CHINA-6(发动机型号P10A3)
             * show : true
             * attributeName : 等级
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String attributeValue;
            private boolean isShow = false;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String attributeName;
            
            public AttributeListBean() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getAttributeValue() {
                return null;
            }
            
            public final void setAttributeValue(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final boolean isShow() {
                return false;
            }
            
            public final void setShow(boolean p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getAttributeName() {
                return null;
            }
            
            public final void setAttributeName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
        }
    }
}
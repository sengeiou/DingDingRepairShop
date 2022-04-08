package com.android.ctgapp.entity.home.enquire;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001d"}, d2 = {"Lcom/android/ctgapp/entity/home/enquire/EpcDetailEntity;", "", "()V", "data", "", "Lcom/android/ctgapp/entity/home/enquire/EpcDetailEntity$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "isSuccess", "", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "DataBean", "app_ctgRelease"})
public final class EpcDetailEntity {
    
    /**
     * status : 0
     * msg : null
     * data : [{"amount":"001","sign":"1","orderStatus":"1","remark":"","ctgnum":"1107200","oe":"16400RLHH01","oenamecn":"电子控制单元 ","ctgname":"节气门总成","categoryId":"E__0100","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG","model":"","price":null},{"amount":"001","sign":"2","orderStatus":"1","remark":"","ctgnum":"","oe":"16430RTAJ01","oenamecn":"节气门下壳体 ","ctgname":"","categoryId":"E__0100","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG","model":"","price":null},{"amount":"001","sign":"3","orderStatus":"1","remark":"","ctgnum":"","oe":"16431RTAJ01","oenamecn":"下壳体垫片 ","ctgname":"","categoryId":"E__0100","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG","model":"","price":null},{"amount":"001","sign":"4","orderStatus":"1","remark":"","ctgnum":"","oe":"32745R40A00","oenamecn":"发动机线束支架","ctgname":"","categoryId":"E__0100","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG","model":"","price":null},{"amount":"004","sign":"5","orderStatus":"1","remark":"","ctgnum":"","oe":"934010806508","oenamecn":"螺栓垫圈","ctgname":"","categoryId":"E__0100","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG","model":"","price":null},{"amount":"004","sign":"6","orderStatus":"1","remark":"","ctgnum":"","oe":"938920401208","oenamecn":"螺钉 ","ctgname":"","categoryId":"E__0100","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG","model":"","price":null},{"amount":"001","sign":"7","orderStatus":"1","remark":"","ctgnum":"","oe":"957010601408","oenamecn":"法兰螺栓 6X14","ctgname":"","categoryId":"E__0100","image":"http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG","model":"","price":null}]
     * success : true
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isSuccess;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.home.enquire.EpcDetailEntity.DataBean> data;
    
    public EpcDetailEntity() {
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
    public final java.util.List<com.android.ctgapp.entity.home.enquire.EpcDetailEntity.DataBean> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.home.enquire.EpcDetailEntity.DataBean> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\b\u00a8\u00063"}, d2 = {"Lcom/android/ctgapp/entity/home/enquire/EpcDetailEntity$DataBean;", "Ljava/io/Serializable;", "()V", "amount", "", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "categoryId", "getCategoryId", "setCategoryId", "ctgname", "getCtgname", "setCtgname", "ctgnum", "getCtgnum", "setCtgnum", "des", "getDes", "setDes", "image", "getImage", "setImage", "model", "getModel", "setModel", "oe", "getOe", "setOe", "orderStatus", "getOrderStatus", "setOrderStatus", "price", "", "getPrice", "()Ljava/lang/Object;", "setPrice", "(Ljava/lang/Object;)V", "remark", "getRemark", "setRemark", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", "sign", "getSign", "setSign", "app_ctgRelease"})
    public static final class DataBean implements java.io.Serializable {
        
        /**
         * amount : 001
         * sign : 1
         * orderStatus : 1
         * remark :
         * ctgnum : 1107200
         * oe : 16400RLHH01
         * oenamecn : 电子控制单元
         * ctgname : 节气门总成
         * categoryId : E__0100
         * image : http://image.ctgoe.com/stw/epc/honda/2007/19SLE9G1/E__0100.PNG
         * model :
         * price : null
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.String amount;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String sign;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String orderStatus;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String remark;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String ctgnum;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String oe;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String des;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String ctgname;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String categoryId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String image;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String model;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object price;
        private boolean select = false;
        
        public DataBean() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAmount() {
            return null;
        }
        
        public final void setAmount(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSign() {
            return null;
        }
        
        public final void setSign(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOrderStatus() {
            return null;
        }
        
        public final void setOrderStatus(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRemark() {
            return null;
        }
        
        public final void setRemark(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCtgnum() {
            return null;
        }
        
        public final void setCtgnum(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOe() {
            return null;
        }
        
        public final void setOe(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDes() {
            return null;
        }
        
        public final void setDes(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCtgname() {
            return null;
        }
        
        public final void setCtgname(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCategoryId() {
            return null;
        }
        
        public final void setCategoryId(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImage() {
            return null;
        }
        
        public final void setImage(@org.jetbrains.annotations.Nullable()
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
        public final java.lang.Object getPrice() {
            return null;
        }
        
        public final void setPrice(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final boolean getSelect() {
            return false;
        }
        
        public final void setSelect(boolean p0) {
        }
    }
}
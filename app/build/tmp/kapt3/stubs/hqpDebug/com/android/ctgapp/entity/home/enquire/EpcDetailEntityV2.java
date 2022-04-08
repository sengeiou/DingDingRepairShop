package com.android.ctgapp.entity.home.enquire;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001c"}, d2 = {"Lcom/android/ctgapp/entity/home/enquire/EpcDetailEntityV2;", "", "()V", "data", "", "Lcom/android/ctgapp/entity/home/enquire/EpcDetailEntityV2$DataBean;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "success", "", "getSuccess", "()Z", "setSuccess", "(Z)V", "DataBean", "app_hqpDebug"})
public final class EpcDetailEntityV2 {
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.android.ctgapp.entity.home.enquire.EpcDetailEntityV2.DataBean> data;
    private boolean success = false;
    
    public EpcDetailEntityV2() {
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
    public final java.util.List<com.android.ctgapp.entity.home.enquire.EpcDetailEntityV2.DataBean> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.android.ctgapp.entity.home.enquire.EpcDetailEntityV2.DataBean> p0) {
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u00017B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\"\u0010\'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001c\u00101\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001c\u00104\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\b\u00a8\u00068"}, d2 = {"Lcom/android/ctgapp/entity/home/enquire/EpcDetailEntityV2$DataBean;", "", "()V", "amount", "", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "applicable", "", "getApplicable", "()Z", "setApplicable", "(Z)V", "begin", "getBegin", "setBegin", "ctgname", "getCtgname", "setCtgname", "ctgnum", "getCtgnum", "setCtgnum", "des", "getDes", "setDes", "end", "getEnd", "setEnd", "epc", "getEpc", "setEpc", "model", "getModel", "setModel", "oe", "getOe", "setOe", "partsGroup", "", "Lcom/android/ctgapp/entity/home/enquire/EpcDetailEntityV2$DataBean$PartsGroupBean;", "getPartsGroup", "()Ljava/util/List;", "setPartsGroup", "(Ljava/util/List;)V", "price", "getPrice", "setPrice", "remark", "getRemark", "setRemark", "sign", "getSign", "setSign", "PartsGroupBean", "app_hqpDebug"})
    public static final class DataBean {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String oe;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String des;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String ctgname;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String amount;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String sign;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String remark;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String ctgnum;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.home.enquire.EpcDetailEntityV2.DataBean.PartsGroupBean> partsGroup;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String epc;
        private boolean applicable = false;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String begin;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String end;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String model;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String price;
        
        public DataBean() {
            super();
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
        public final java.util.List<com.android.ctgapp.entity.home.enquire.EpcDetailEntityV2.DataBean.PartsGroupBean> getPartsGroup() {
            return null;
        }
        
        public final void setPartsGroup(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.home.enquire.EpcDetailEntityV2.DataBean.PartsGroupBean> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEpc() {
            return null;
        }
        
        public final void setEpc(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final boolean getApplicable() {
            return false;
        }
        
        public final void setApplicable(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBegin() {
            return null;
        }
        
        public final void setBegin(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEnd() {
            return null;
        }
        
        public final void setEnd(@org.jetbrains.annotations.Nullable()
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
        public final java.lang.String getPrice() {
            return null;
        }
        
        public final void setPrice(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001c\u0010\'\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000e\u00a8\u0006-"}, d2 = {"Lcom/android/ctgapp/entity/home/enquire/EpcDetailEntityV2$DataBean$PartsGroupBean;", "", "()V", "applicable", "", "getApplicable", "()Z", "setApplicable", "(Z)V", "begin", "", "getBegin", "()Ljava/lang/String;", "setBegin", "(Ljava/lang/String;)V", "categoryId", "getCategoryId", "setCategoryId", "des", "getDes", "setDes", "end", "getEnd", "setEnd", "groupId", "getGroupId", "setGroupId", "img", "getImg", "setImg", "labelId", "getLabelId", "setLabelId", "model", "getModel", "setModel", "modelcode", "getModelcode", "setModelcode", "parentCategoryId", "getParentCategoryId", "setParentCategoryId", "remark", "getRemark", "setRemark", "app_hqpDebug"})
        public static final class PartsGroupBean {
            @org.jetbrains.annotations.Nullable()
            private java.lang.String labelId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String categoryId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String groupId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String parentCategoryId;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String des;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String remark;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String img;
            private boolean applicable = false;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String modelcode;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String model;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String begin;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String end;
            
            public PartsGroupBean() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLabelId() {
                return null;
            }
            
            public final void setLabelId(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.String getGroupId() {
                return null;
            }
            
            public final void setGroupId(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getParentCategoryId() {
                return null;
            }
            
            public final void setParentCategoryId(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.String getRemark() {
                return null;
            }
            
            public final void setRemark(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getImg() {
                return null;
            }
            
            public final void setImg(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final boolean getApplicable() {
                return false;
            }
            
            public final void setApplicable(boolean p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getModelcode() {
                return null;
            }
            
            public final void setModelcode(@org.jetbrains.annotations.Nullable()
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
            public final java.lang.String getBegin() {
                return null;
            }
            
            public final void setBegin(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getEnd() {
                return null;
            }
            
            public final void setEnd(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
        }
    }
}
package com.android.ctgapp.entity.deal.enquire;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/android/ctgapp/entity/deal/enquire/EnquireWishDetailEntity;", "", "()V", "data", "Lcom/android/ctgapp/entity/deal/enquire/EnquireWishDetailEntity$DataBean;", "getData", "()Lcom/android/ctgapp/entity/deal/enquire/EnquireWishDetailEntity$DataBean;", "setData", "(Lcom/android/ctgapp/entity/deal/enquire/EnquireWishDetailEntity$DataBean;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_WLDebug"})
public final class EnquireWishDetailEntity {
    
    /**
     * status : 0
     * msg : null
     * data : {"wishListId":39,"enquiryId":290,"wishListStatus":1,"createUserid":1,"createTime":"2021-08-03 13:44:03","updateTime":"2021-08-03 13:44:03","updateUserid":null,"isDeleted":0,"remark":null,"totalNumber":0,"totalPrice":0,"details":[{"wishListDetailId":72,"wishListId":39,"quotationDetailId":22927,"oe":"04711SWAE00ZZ","partName":"前保险杠皮(前保险杠皮)","brand":"原厂","quality":"","price":1200,"createTime":"2021-08-03 13:44:03","updateTime":"2021-08-03 13:44:02","remark":null,"num":null},{"wishListDetailId":73,"wishListId":39,"quotationDetailId":22928,"oe":"04711SWAE00ZZ","partName":"前保险杠皮(前保险杠皮)","brand":"副厂","quality":"","price":600,"createTime":"2021-08-03 13:44:03","updateTime":"2021-08-03 13:44:02","remark":null,"num":null}],"partNames":null}
     * success : true
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.deal.enquire.EnquireWishDetailEntity.DataBean data;
    private boolean isSuccess = false;
    
    public EnquireWishDetailEntity() {
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
    public final com.android.ctgapp.entity.deal.enquire.EnquireWishDetailEntity.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.deal.enquire.EnquireWishDetailEntity.DataBean p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0006\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001c\u0010/\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR\u001a\u00102\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\f\"\u0004\b4\u0010\u000eR\u001a\u00105\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000e\u00a8\u00069"}, d2 = {"Lcom/android/ctgapp/entity/deal/enquire/EnquireWishDetailEntity$DataBean;", "", "()V", "createTime", "", "getCreateTime", "()Ljava/lang/String;", "setCreateTime", "(Ljava/lang/String;)V", "createUserid", "", "getCreateUserid", "()I", "setCreateUserid", "(I)V", "details", "", "Lcom/android/ctgapp/entity/deal/enquire/EnquireWishDetailEntity$DataBean$DetailsBean;", "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "enquiryId", "getEnquiryId", "setEnquiryId", "isDeleted", "setDeleted", "partNames", "getPartNames", "()Ljava/lang/Object;", "setPartNames", "(Ljava/lang/Object;)V", "remark", "getRemark", "setRemark", "totalNumber", "getTotalNumber", "setTotalNumber", "totalPrice", "", "getTotalPrice", "()D", "setTotalPrice", "(D)V", "updateTime", "getUpdateTime", "setUpdateTime", "updateUserid", "getUpdateUserid", "setUpdateUserid", "wishListId", "getWishListId", "setWishListId", "wishListStatus", "getWishListStatus", "setWishListStatus", "DetailsBean", "app_WLDebug"})
    public static final class DataBean {
        
        /**
         * wishListId : 39
         * enquiryId : 290
         * wishListStatus : 1
         * createUserid : 1
         * createTime : 2021-08-03 13:44:03
         * updateTime : 2021-08-03 13:44:03
         * updateUserid : null
         * isDeleted : 0
         * remark : null
         * totalNumber : 0
         * totalPrice : 0.0
         * details : [{"wishListDetailId":72,"wishListId":39,"quotationDetailId":22927,"oe":"04711SWAE00ZZ","partName":"前保险杠皮(前保险杠皮)","brand":"原厂","quality":"","price":1200,"createTime":"2021-08-03 13:44:03","updateTime":"2021-08-03 13:44:02","remark":null,"num":null},{"wishListDetailId":73,"wishListId":39,"quotationDetailId":22928,"oe":"04711SWAE00ZZ","partName":"前保险杠皮(前保险杠皮)","brand":"副厂","quality":"","price":600,"createTime":"2021-08-03 13:44:03","updateTime":"2021-08-03 13:44:02","remark":null,"num":null}]
         * partNames : null
         */
        private int wishListId = 0;
        private int enquiryId = 0;
        private int wishListStatus = 0;
        private int createUserid = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String createTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String updateTime;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object updateUserid;
        private int isDeleted = 0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object remark;
        private int totalNumber = 0;
        private double totalPrice = 0.0;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object partNames;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.deal.enquire.EnquireWishDetailEntity.DataBean.DetailsBean> details;
        
        public DataBean() {
            super();
        }
        
        public final int getWishListId() {
            return 0;
        }
        
        public final void setWishListId(int p0) {
        }
        
        public final int getEnquiryId() {
            return 0;
        }
        
        public final void setEnquiryId(int p0) {
        }
        
        public final int getWishListStatus() {
            return 0;
        }
        
        public final void setWishListStatus(int p0) {
        }
        
        public final int getCreateUserid() {
            return 0;
        }
        
        public final void setCreateUserid(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCreateTime() {
            return null;
        }
        
        public final void setCreateTime(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUpdateTime() {
            return null;
        }
        
        public final void setUpdateTime(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getUpdateUserid() {
            return null;
        }
        
        public final void setUpdateUserid(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final int isDeleted() {
            return 0;
        }
        
        public final void setDeleted(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getRemark() {
            return null;
        }
        
        public final void setRemark(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        public final int getTotalNumber() {
            return 0;
        }
        
        public final void setTotalNumber(int p0) {
        }
        
        public final double getTotalPrice() {
            return 0.0;
        }
        
        public final void setTotalPrice(double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getPartNames() {
            return null;
        }
        
        public final void setPartNames(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.deal.enquire.EnquireWishDetailEntity.DataBean.DetailsBean> getDetails() {
            return null;
        }
        
        public final void setDetails(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.deal.enquire.EnquireWishDetailEntity.DataBean.DetailsBean> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000e\"\u0004\b(\u0010\u0010R\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001a\u0010,\u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R\u001a\u0010/\u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%\u00a8\u00062"}, d2 = {"Lcom/android/ctgapp/entity/deal/enquire/EnquireWishDetailEntity$DataBean$DetailsBean;", "", "()V", "brand", "", "getBrand", "()Ljava/lang/String;", "setBrand", "(Ljava/lang/String;)V", "createTime", "getCreateTime", "setCreateTime", "num", "getNum", "()Ljava/lang/Object;", "setNum", "(Ljava/lang/Object;)V", "oe", "getOe", "setOe", "partName", "getPartName", "setPartName", "price", "", "getPrice", "()D", "setPrice", "(D)V", "quality", "getQuality", "setQuality", "quotationDetailId", "", "getQuotationDetailId", "()I", "setQuotationDetailId", "(I)V", "remark", "getRemark", "setRemark", "updateTime", "getUpdateTime", "setUpdateTime", "wishListDetailId", "getWishListDetailId", "setWishListDetailId", "wishListId", "getWishListId", "setWishListId", "app_WLDebug"})
        public static final class DetailsBean {
            
            /**
             * wishListDetailId : 72
             * wishListId : 39
             * quotationDetailId : 22927
             * oe : 04711SWAE00ZZ
             * partName : 前保险杠皮(前保险杠皮)
             * brand : 原厂
             * quality :
             * price : 1200.0
             * createTime : 2021-08-03 13:44:03
             * updateTime : 2021-08-03 13:44:02
             * remark : null
             * num : null
             */
            private int wishListDetailId = 0;
            private int wishListId = 0;
            private int quotationDetailId = 0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String oe;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String partName;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String brand;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String quality;
            private double price = 0.0;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String createTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.String updateTime;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object remark;
            @org.jetbrains.annotations.Nullable()
            private java.lang.Object num;
            
            public DetailsBean() {
                super();
            }
            
            public final int getWishListDetailId() {
                return 0;
            }
            
            public final void setWishListDetailId(int p0) {
            }
            
            public final int getWishListId() {
                return 0;
            }
            
            public final void setWishListId(int p0) {
            }
            
            public final int getQuotationDetailId() {
                return 0;
            }
            
            public final void setQuotationDetailId(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getOe() {
                return null;
            }
            
            public final void setOe(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPartName() {
                return null;
            }
            
            public final void setPartName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getBrand() {
                return null;
            }
            
            public final void setBrand(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getQuality() {
                return null;
            }
            
            public final void setQuality(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            public final double getPrice() {
                return 0.0;
            }
            
            public final void setPrice(double p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCreateTime() {
                return null;
            }
            
            public final void setCreateTime(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getUpdateTime() {
                return null;
            }
            
            public final void setUpdateTime(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getRemark() {
                return null;
            }
            
            public final void setRemark(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getNum() {
                return null;
            }
            
            public final void setNum(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
        }
    }
}
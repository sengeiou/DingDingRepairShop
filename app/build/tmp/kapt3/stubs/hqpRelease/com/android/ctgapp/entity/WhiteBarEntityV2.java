package com.android.ctgapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/android/ctgapp/entity/WhiteBarEntityV2;", "", "()V", "data", "Lcom/android/ctgapp/entity/WhiteBarEntityV2$DataBean;", "getData", "()Lcom/android/ctgapp/entity/WhiteBarEntityV2$DataBean;", "setData", "(Lcom/android/ctgapp/entity/WhiteBarEntityV2$DataBean;)V", "msg", "getMsg", "()Ljava/lang/Object;", "setMsg", "(Ljava/lang/Object;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "DataBean", "app_hqpRelease"})
public final class WhiteBarEntityV2 {
    
    /**
     * status : 0
     * msg : null
     * data : {"noPayMoney":2050,"list":[{"time":"2021-04","list":[{"ctgBillId":null,"returnType":0,"totalMoney":2050,"noPayMoney":2050,"returnMoney":0,"billNo":"TZD123","invoiceType":0,"lastDay":"2021-04-20"}]}]}
     */
    private int status = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object msg;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.WhiteBarEntityV2.DataBean data;
    
    public WhiteBarEntityV2() {
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
    public final com.android.ctgapp.entity.WhiteBarEntityV2.DataBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.WhiteBarEntityV2.DataBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0017"}, d2 = {"Lcom/android/ctgapp/entity/WhiteBarEntityV2$DataBean;", "", "()V", "list", "", "Lcom/android/ctgapp/entity/WhiteBarEntityV2$DataBean$ListBeanX;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "noPayMoney", "", "getNoPayMoney", "()D", "setNoPayMoney", "(D)V", "nobillMoney", "", "getNobillMoney", "()Ljava/lang/String;", "setNobillMoney", "(Ljava/lang/String;)V", "ListBeanX", "app_hqpRelease"})
    public static final class DataBean {
        
        /**
         * noPayMoney : 2050.0
         * list : [{"time":"2021-04","list":[{"ctgBillId":null,"returnType":0,"totalMoney":2050,"noPayMoney":2050,"returnMoney":0,"billNo":"TZD123","invoiceType":0,"lastDay":"2021-04-20"}]}]
         */
        private double noPayMoney = 0.0;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String nobillMoney = "";
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.android.ctgapp.entity.WhiteBarEntityV2.DataBean.ListBeanX> list;
        
        public DataBean() {
            super();
        }
        
        public final double getNoPayMoney() {
            return 0.0;
        }
        
        public final void setNoPayMoney(double p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNobillMoney() {
            return null;
        }
        
        public final void setNobillMoney(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.android.ctgapp.entity.WhiteBarEntityV2.DataBean.ListBeanX> getList() {
            return null;
        }
        
        public final void setList(@org.jetbrains.annotations.Nullable()
        java.util.List<com.android.ctgapp.entity.WhiteBarEntityV2.DataBean.ListBeanX> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/android/ctgapp/entity/WhiteBarEntityV2$DataBean$ListBeanX;", "", "()V", "list", "", "Lcom/android/ctgapp/entity/WhiteBarEntityV2$DataBean$ListBeanX$ListBean;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "time", "", "getTime", "()Ljava/lang/String;", "setTime", "(Ljava/lang/String;)V", "ListBean", "app_hqpRelease"})
        public static final class ListBeanX {
            
            /**
             * time : 2021-04
             * list : [{"ctgBillId":null,"returnType":0,"totalMoney":2050,"noPayMoney":2050,"returnMoney":0,"billNo":"TZD123","invoiceType":0,"lastDay":"2021-04-20"}]
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String time;
            @org.jetbrains.annotations.Nullable()
            private java.util.List<com.android.ctgapp.entity.WhiteBarEntityV2.DataBean.ListBeanX.ListBean> list;
            
            public ListBeanX() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTime() {
                return null;
            }
            
            public final void setTime(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.android.ctgapp.entity.WhiteBarEntityV2.DataBean.ListBeanX.ListBean> getList() {
                return null;
            }
            
            public final void setList(@org.jetbrains.annotations.Nullable()
            java.util.List<com.android.ctgapp.entity.WhiteBarEntityV2.DataBean.ListBeanX.ListBean> p0) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR.\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b\'\u0010$R\u001a\u0010(\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R\u001a\u0010+\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$\u00a8\u00064"}, d2 = {"Lcom/android/ctgapp/entity/WhiteBarEntityV2$DataBean$ListBeanX$ListBean;", "", "()V", "billNo", "", "getBillNo", "()Ljava/lang/String;", "setBillNo", "(Ljava/lang/String;)V", "ctgBillId", "getCtgBillId", "()Ljava/lang/Object;", "setCtgBillId", "(Ljava/lang/Object;)V", "invoiceType", "", "getInvoiceType", "()I", "setInvoiceType", "(I)V", "lastDay", "getLastDay", "setLastDay", "list", "Ljava/util/ArrayList;", "Lcom/android/ctgapp/entity/ListChildBean;", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "noPayMoney", "", "getNoPayMoney", "()D", "setNoPayMoney", "(D)V", "returnMoney", "getReturnMoney", "setReturnMoney", "returnType", "getReturnType", "setReturnType", "selected", "", "getSelected", "()Z", "setSelected", "(Z)V", "totalMoney", "getTotalMoney", "setTotalMoney", "app_hqpRelease"})
            public static final class ListBean {
                private boolean selected = false;
                
                /**
                 * ctgBillId : null
                 * returnType : 0
                 * totalMoney : 2050.0
                 * noPayMoney : 2050.0
                 * returnMoney : 0.0
                 * billNo : TZD123
                 * invoiceType : 0
                 * lastDay : 2021-04-20
                 */
                @org.jetbrains.annotations.Nullable()
                private java.lang.Object ctgBillId;
                private int returnType = 0;
                private double totalMoney = 0.0;
                private double noPayMoney = 0.0;
                private double returnMoney = 0.0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String billNo;
                private int invoiceType = 0;
                @org.jetbrains.annotations.Nullable()
                private java.lang.String lastDay;
                @org.jetbrains.annotations.Nullable()
                private java.util.ArrayList<com.android.ctgapp.entity.ListChildBean> list;
                
                public ListBean() {
                    super();
                }
                
                public final boolean getSelected() {
                    return false;
                }
                
                public final void setSelected(boolean p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getCtgBillId() {
                    return null;
                }
                
                public final void setCtgBillId(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                }
                
                public final int getReturnType() {
                    return 0;
                }
                
                public final void setReturnType(int p0) {
                }
                
                public final double getTotalMoney() {
                    return 0.0;
                }
                
                public final void setTotalMoney(double p0) {
                }
                
                public final double getNoPayMoney() {
                    return 0.0;
                }
                
                public final void setNoPayMoney(double p0) {
                }
                
                public final double getReturnMoney() {
                    return 0.0;
                }
                
                public final void setReturnMoney(double p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getBillNo() {
                    return null;
                }
                
                public final void setBillNo(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                public final int getInvoiceType() {
                    return 0;
                }
                
                public final void setInvoiceType(int p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getLastDay() {
                    return null;
                }
                
                public final void setLastDay(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.util.ArrayList<com.android.ctgapp.entity.ListChildBean> getList() {
                    return null;
                }
                
                public final void setList(@org.jetbrains.annotations.Nullable()
                java.util.ArrayList<com.android.ctgapp.entity.ListChildBean> p0) {
                }
            }
        }
    }
}
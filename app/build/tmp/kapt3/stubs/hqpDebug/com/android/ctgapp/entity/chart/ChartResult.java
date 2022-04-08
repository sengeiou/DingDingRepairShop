package com.android.ctgapp.entity.chart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/android/ctgapp/entity/chart/ChartResult;", "Ljava/io/Serializable;", "()V", "action", "", "getAction", "()I", "setAction", "(I)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "msg", "Lcom/android/ctgapp/entity/chart/ChartResult$MsgBean;", "getMsg", "()Lcom/android/ctgapp/entity/chart/ChartResult$MsgBean;", "setMsg", "(Lcom/android/ctgapp/entity/chart/ChartResult$MsgBean;)V", "MsgBean", "ReadTimesBean", "app_hqpDebug"})
public final class ChartResult implements java.io.Serializable {
    
    /**
     * id : 839e0ac0b22a4f0ba47f6a30a636e1b2
     * action : 1
     * msg : {"id":"5594be867ae04ccfb9cddf525f5558da","msgType":0,"senderUserId":1309,"receiverType":1,"receiverUserId":1457,"receiverGroupId":null,"message":"饿的啊啊啊","createTime":null,"sendTime":"2021-01-11 10:20:03"}
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id = "";
    private int action = -1;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.chart.ChartResult.MsgBean msg;
    
    public ChartResult() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getAction() {
        return 0;
    }
    
    public final void setAction(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.android.ctgapp.entity.chart.ChartResult.MsgBean getMsg() {
        return null;
    }
    
    public final void setMsg(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.chart.ChartResult.MsgBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b\'\u0010$R.\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R.\u0010+\u001a\u0016\u0012\u0004\u0012\u00020,\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020,\u0018\u0001`\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\u001e\u0010/\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00105\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\"\"\u0004\b7\u0010$R\u001e\u00108\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b9\u00101\"\u0004\b:\u00103R\u001a\u0010;\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010\u000eR\u001a\u0010>\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\f\"\u0004\b@\u0010\u000eR\u001a\u0010A\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\"\"\u0004\bC\u0010$R\u001a\u0010D\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001d\"\u0004\bF\u0010\u001f\u00a8\u0006G"}, d2 = {"Lcom/android/ctgapp/entity/chart/ChartResult$MsgBean;", "Ljava/io/Serializable;", "()V", "createTime", "", "getCreateTime", "()Ljava/lang/Object;", "setCreateTime", "(Ljava/lang/Object;)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "linkIdList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getLinkIdList", "()Ljava/util/ArrayList;", "setLinkIdList", "(Ljava/util/ArrayList;)V", "message", "getMessage", "setMessage", "messageRead", "", "getMessageRead", "()Z", "setMessageRead", "(Z)V", "msgStatus", "getMsgStatus", "()I", "setMsgStatus", "(I)V", "msgType", "getMsgType", "setMsgType", "onLineList", "getOnLineList", "setOnLineList", "readTimes", "Lcom/android/ctgapp/entity/chart/ChartResult$ReadTimesBean;", "getReadTimes", "setReadTimes", "receiverGroupId", "getReceiverGroupId", "()Ljava/lang/Integer;", "setReceiverGroupId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "receiverType", "getReceiverType", "setReceiverType", "receiverUserId", "getReceiverUserId", "setReceiverUserId", "sendName", "getSendName", "setSendName", "sendTime", "getSendTime", "setSendTime", "senderUserId", "getSenderUserId", "setSenderUserId", "voicePlay", "getVoicePlay", "setVoicePlay", "app_hqpDebug"})
    public static final class MsgBean implements java.io.Serializable {
        
        /**
         * id : 5594be867ae04ccfb9cddf525f5558da
         * msgType : 0
         * senderUserId : 1309
         * receiverType : 1
         * receiverUserId : 1457
         * receiverGroupId : null
         * message : 饿的啊啊啊
         * createTime : null
         * sendTime : 2021-01-11 10:20:03
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.String id = "";
        private int msgType = -1;
        private int senderUserId = -1;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String sendName = "";
        private int receiverType = -1;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer receiverUserId;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer receiverGroupId;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String message = "";
        @org.jetbrains.annotations.Nullable()
        private java.lang.Object createTime;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String sendTime = "";
        
        /**
         * *消息状态 0 为 没问题 1为正在发送 2为发送失败
         */
        private int msgStatus = 0;
        private boolean voicePlay = false;
        private boolean messageRead = false;
        @org.jetbrains.annotations.Nullable()
        private java.util.ArrayList<java.lang.Integer> linkIdList;
        @org.jetbrains.annotations.Nullable()
        private java.util.ArrayList<java.lang.Integer> onLineList;
        @org.jetbrains.annotations.Nullable()
        private java.util.ArrayList<com.android.ctgapp.entity.chart.ChartResult.ReadTimesBean> readTimes;
        
        public MsgBean() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getMsgType() {
            return 0;
        }
        
        public final void setMsgType(int p0) {
        }
        
        public final int getSenderUserId() {
            return 0;
        }
        
        public final void setSenderUserId(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSendName() {
            return null;
        }
        
        public final void setSendName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getReceiverType() {
            return 0;
        }
        
        public final void setReceiverType(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getReceiverUserId() {
            return null;
        }
        
        public final void setReceiverUserId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getReceiverGroupId() {
            return null;
        }
        
        public final void setReceiverGroupId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        public final void setMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getCreateTime() {
            return null;
        }
        
        public final void setCreateTime(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSendTime() {
            return null;
        }
        
        public final void setSendTime(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getMsgStatus() {
            return 0;
        }
        
        public final void setMsgStatus(int p0) {
        }
        
        public final boolean getVoicePlay() {
            return false;
        }
        
        public final void setVoicePlay(boolean p0) {
        }
        
        public final boolean getMessageRead() {
            return false;
        }
        
        public final void setMessageRead(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<java.lang.Integer> getLinkIdList() {
            return null;
        }
        
        public final void setLinkIdList(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<java.lang.Integer> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<java.lang.Integer> getOnLineList() {
            return null;
        }
        
        public final void setOnLineList(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<java.lang.Integer> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<com.android.ctgapp.entity.chart.ChartResult.ReadTimesBean> getReadTimes() {
            return null;
        }
        
        public final void setReadTimes(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<com.android.ctgapp.entity.chart.ChartResult.ReadTimesBean> p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/android/ctgapp/entity/chart/ChartResult$ReadTimesBean;", "", "()V", "readTime", "", "getReadTime", "()J", "setReadTime", "(J)V", "userId", "", "getUserId", "()I", "setUserId", "(I)V", "app_hqpDebug"})
    public static final class ReadTimesBean {
        private int userId = 0;
        private long readTime = 0L;
        
        public ReadTimesBean() {
            super();
        }
        
        public final int getUserId() {
            return 0;
        }
        
        public final void setUserId(int p0) {
        }
        
        public final long getReadTime() {
            return 0L;
        }
        
        public final void setReadTime(long p0) {
        }
    }
}
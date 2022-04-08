package com.android.ctgapp.entity.chart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/android/ctgapp/entity/chart/ChartResultEntity;", "Ljava/io/Serializable;", "()V", "action", "", "getAction", "()I", "setAction", "(I)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "msg", "Lcom/android/ctgapp/entity/chart/ChartResultEntity$MsgBean;", "getMsg", "()Lcom/android/ctgapp/entity/chart/ChartResultEntity$MsgBean;", "setMsg", "(Lcom/android/ctgapp/entity/chart/ChartResultEntity$MsgBean;)V", "MsgBean", "app_ctgDebug"})
public final class ChartResultEntity implements java.io.Serializable {
    
    /**
     * id : 839e0ac0b22a4f0ba47f6a30a636e1b2
     * action : 1
     * msg : {"id":"5594be867ae04ccfb9cddf525f5558da","msgType":0,"senderUserId":1309,"receiverType":1,"receiverUserId":1457,"receiverGroupId":null,"message":"饿的啊啊啊","createTime":null,"sendTime":"2021-01-11 10:20:03"}
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id = "";
    private int action = -1;
    @org.jetbrains.annotations.Nullable()
    private com.android.ctgapp.entity.chart.ChartResultEntity.MsgBean msg;
    
    public ChartResultEntity() {
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
    public final com.android.ctgapp.entity.chart.ChartResultEntity.MsgBean getMsg() {
        return null;
    }
    
    public final void setMsg(@org.jetbrains.annotations.Nullable()
    com.android.ctgapp.entity.chart.ChartResultEntity.MsgBean p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001e\u0010$\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u001a\u0010\'\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001a\u0010*\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u00a8\u00063"}, d2 = {"Lcom/android/ctgapp/entity/chart/ChartResultEntity$MsgBean;", "Ljava/io/Serializable;", "()V", "createTime", "", "getCreateTime", "()Ljava/lang/Object;", "setCreateTime", "(Ljava/lang/Object;)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "message", "getMessage", "setMessage", "msgStatus", "", "getMsgStatus", "()I", "setMsgStatus", "(I)V", "msgType", "getMsgType", "setMsgType", "receiverGroupId", "getReceiverGroupId", "()Ljava/lang/Integer;", "setReceiverGroupId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "receiverType", "getReceiverType", "setReceiverType", "receiverUserId", "getReceiverUserId", "setReceiverUserId", "sendTime", "getSendTime", "setSendTime", "senderUserId", "getSenderUserId", "setSenderUserId", "voicePlay", "", "getVoicePlay", "()Z", "setVoicePlay", "(Z)V", "app_ctgDebug"})
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
    }
}
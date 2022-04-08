package com.android.ctgapp.entity.chart;

import java.lang.System;

/**
 * 作者:LiBW
 * 创建日期: 2021/5/11
 * 描述: 消息在数据库中的格式
 */
@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0011J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\rH\u00c6\u0003J\u008a\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\u0005H\u00d6\u0001J\t\u0010E\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b-\u0010\'\"\u0004\b.\u0010)R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u0010\u0019\u00a8\u0006F"}, d2 = {"Lcom/android/ctgapp/entity/chart/CurrentChartEntity;", "", "id", "", "senderUserId", "", "receiverUserId", "receiverGroupId", "msgType", "receiverType", "sendTime", "message", "createTime", "", "msgStatus", "currentUserId", "read", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;IILjava/lang/String;Ljava/lang/String;JIII)V", "getCreateTime", "()J", "setCreateTime", "(J)V", "getCurrentUserId", "()I", "setCurrentUserId", "(I)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getMessage", "setMessage", "getMsgStatus", "setMsgStatus", "getMsgType", "setMsgType", "getRead", "setRead", "getReceiverGroupId", "()Ljava/lang/Integer;", "setReceiverGroupId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getReceiverType", "setReceiverType", "getReceiverUserId", "setReceiverUserId", "getSendTime", "setSendTime", "getSenderUserId", "setSenderUserId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;IILjava/lang/String;Ljava/lang/String;JIII)Lcom/android/ctgapp/entity/chart/CurrentChartEntity;", "equals", "", "other", "hashCode", "toString", "app_ctgDebug"})
public final class CurrentChartEntity {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private java.lang.String id;
    private int senderUserId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer receiverUserId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer receiverGroupId;
    private int msgType;
    private int receiverType;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sendTime;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String message;
    private long createTime;
    
    /**
     * *0为正常 1为发送中 2为发送失败
     */
    private int msgStatus;
    private int currentUserId;
    
    /**
     * 消息是否已读 0 未读 1 已读
     */
    private int read;
    
    /**
     * 作者:LiBW
     * 创建日期: 2021/5/11
     * 描述: 消息在数据库中的格式
     */
    @org.jetbrains.annotations.NotNull()
    public final com.android.ctgapp.entity.chart.CurrentChartEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int senderUserId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer receiverUserId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer receiverGroupId, int msgType, int receiverType, @org.jetbrains.annotations.NotNull()
    java.lang.String sendTime, @org.jetbrains.annotations.NotNull()
    java.lang.String message, long createTime, int msgStatus, int currentUserId, int read) {
        return null;
    }
    
    /**
     * 作者:LiBW
     * 创建日期: 2021/5/11
     * 描述: 消息在数据库中的格式
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * 作者:LiBW
     * 创建日期: 2021/5/11
     * 描述: 消息在数据库中的格式
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * 作者:LiBW
     * 创建日期: 2021/5/11
     * 描述: 消息在数据库中的格式
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CurrentChartEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String id, int senderUserId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer receiverUserId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer receiverGroupId, int msgType, int receiverType, @org.jetbrains.annotations.NotNull()
    java.lang.String sendTime, @org.jetbrains.annotations.NotNull()
    java.lang.String message, long createTime, int msgStatus, int currentUserId, int read) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getSenderUserId() {
        return 0;
    }
    
    public final void setSenderUserId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReceiverUserId() {
        return null;
    }
    
    public final void setReceiverUserId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReceiverGroupId() {
        return null;
    }
    
    public final void setReceiverGroupId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getMsgType() {
        return 0;
    }
    
    public final void setMsgType(int p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getReceiverType() {
        return 0;
    }
    
    public final void setReceiverType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSendTime() {
        return null;
    }
    
    public final void setSendTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long component9() {
        return 0L;
    }
    
    public final long getCreateTime() {
        return 0L;
    }
    
    public final void setCreateTime(long p0) {
    }
    
    /**
     * *0为正常 1为发送中 2为发送失败
     */
    public final int component10() {
        return 0;
    }
    
    /**
     * *0为正常 1为发送中 2为发送失败
     */
    public final int getMsgStatus() {
        return 0;
    }
    
    /**
     * *0为正常 1为发送中 2为发送失败
     */
    public final void setMsgStatus(int p0) {
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getCurrentUserId() {
        return 0;
    }
    
    public final void setCurrentUserId(int p0) {
    }
    
    /**
     * 消息是否已读 0 未读 1 已读
     */
    public final int component12() {
        return 0;
    }
    
    /**
     * 消息是否已读 0 未读 1 已读
     */
    public final int getRead() {
        return 0;
    }
    
    /**
     * 消息是否已读 0 未读 1 已读
     */
    public final void setRead(int p0) {
    }
}
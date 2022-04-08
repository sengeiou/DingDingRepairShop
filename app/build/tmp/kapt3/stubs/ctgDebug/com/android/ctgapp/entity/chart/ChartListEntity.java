package com.android.ctgapp.entity.chart;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\'\b\u0007\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b\'\u0010#R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0015R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0013\"\u0004\b3\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019\u00a8\u00066"}, d2 = {"Lcom/android/ctgapp/entity/chart/ChartListEntity;", "", "otherId", "", "otherHeaderImg", "", "otherName", "groupId", "lastMsg", "lastMsgTime", "", "unRedMsg", "companyName", "currentUserId", "newMsg", "", "online", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JILjava/lang/String;IZI)V", "getCompanyName", "()Ljava/lang/String;", "setCompanyName", "(Ljava/lang/String;)V", "getCurrentUserId", "()I", "setCurrentUserId", "(I)V", "getGroupId", "()Ljava/lang/Integer;", "setGroupId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "id", "getId", "()J", "setId", "(J)V", "getLastMsg", "setLastMsg", "getLastMsgTime", "setLastMsgTime", "getNewMsg", "()Z", "setNewMsg", "(Z)V", "getOnline", "setOnline", "getOtherHeaderImg", "setOtherHeaderImg", "getOtherId", "setOtherId", "getOtherName", "setOtherName", "getUnRedMsg", "setUnRedMsg", "app_ctgDebug"})
public final class ChartListEntity {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer otherId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String otherHeaderImg;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String otherName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer groupId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastMsg;
    private long lastMsgTime;
    private int unRedMsg;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String companyName;
    private int currentUserId;
    private boolean newMsg;
    private int online;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id = 0L;
    
    public ChartListEntity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer otherId, @org.jetbrains.annotations.NotNull()
    java.lang.String otherHeaderImg, @org.jetbrains.annotations.NotNull()
    java.lang.String otherName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer groupId, @org.jetbrains.annotations.NotNull()
    java.lang.String lastMsg, long lastMsgTime, int unRedMsg, @org.jetbrains.annotations.NotNull()
    java.lang.String companyName, int currentUserId, boolean newMsg, int online) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOtherId() {
        return null;
    }
    
    public final void setOtherId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOtherHeaderImg() {
        return null;
    }
    
    public final void setOtherHeaderImg(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOtherName() {
        return null;
    }
    
    public final void setOtherName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getGroupId() {
        return null;
    }
    
    public final void setGroupId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastMsg() {
        return null;
    }
    
    public final void setLastMsg(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getLastMsgTime() {
        return 0L;
    }
    
    public final void setLastMsgTime(long p0) {
    }
    
    public final int getUnRedMsg() {
        return 0;
    }
    
    public final void setUnRedMsg(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCompanyName() {
        return null;
    }
    
    public final void setCompanyName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCurrentUserId() {
        return 0;
    }
    
    public final void setCurrentUserId(int p0) {
    }
    
    public final boolean getNewMsg() {
        return false;
    }
    
    public final void setNewMsg(boolean p0) {
    }
    
    public final int getOnline() {
        return 0;
    }
    
    public final void setOnline(int p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
}
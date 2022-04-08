package com.android.ctgapp.entity.chart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010#\"\u0004\b(\u0010%R\u001a\u0010)\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001e\u0010,\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR\u001a\u0010/\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001a\u00102\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106\u00a8\u00067"}, d2 = {"Lcom/android/ctgapp/entity/chart/ChartListEntityCopy;", "", "()V", "companyName", "", "getCompanyName", "()Ljava/lang/String;", "setCompanyName", "(Ljava/lang/String;)V", "currentUserId", "", "getCurrentUserId", "()Ljava/lang/Integer;", "setCurrentUserId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "groupId", "getGroupId", "setGroupId", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "lastMsg", "getLastMsg", "setLastMsg", "lastMsgTime", "getLastMsgTime", "setLastMsgTime", "newMsg", "", "getNewMsg", "()Z", "setNewMsg", "(Z)V", "online", "getOnline", "setOnline", "otherHeaderImg", "getOtherHeaderImg", "setOtherHeaderImg", "otherId", "getOtherId", "setOtherId", "otherName", "getOtherName", "setOtherName", "unRedMsg", "getUnRedMsg", "()I", "setUnRedMsg", "(I)V", "app_hqpRelease"})
public final class ChartListEntityCopy {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer otherId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String otherHeaderImg = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String otherName = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer groupId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastMsg = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long lastMsgTime;
    private int unRedMsg = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String companyName = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer currentUserId;
    private boolean newMsg = true;
    private boolean online = false;
    
    public ChartListEntityCopy() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLastMsgTime() {
        return null;
    }
    
    public final void setLastMsgTime(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCurrentUserId() {
        return null;
    }
    
    public final void setCurrentUserId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean getNewMsg() {
        return false;
    }
    
    public final void setNewMsg(boolean p0) {
    }
    
    public final boolean getOnline() {
        return false;
    }
    
    public final void setOnline(boolean p0) {
    }
}
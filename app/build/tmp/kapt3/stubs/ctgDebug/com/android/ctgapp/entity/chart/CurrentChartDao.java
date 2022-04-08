package com.android.ctgapp.entity.chart;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\'J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000fH\'J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000fH\'\u00a8\u0006\u0019"}, d2 = {"Lcom/android/ctgapp/entity/chart/CurrentChartDao;", "", "changeRead", "", "targetId", "", "userId", "lastMsgTime", "", "deleteChartById", "chartId", "", "deleteChartByOtherId", "otherId", "findChartById", "Lcom/android/ctgapp/entity/chart/CurrentChartEntity;", "insertChart", "currentChartEntity", "loadAllChart", "", "loadChartByOtherId", "loadChartByPage", "size", "updateChart", "entity", "app_ctgDebug"})
public abstract interface CurrentChartDao {
    
    @androidx.room.Insert()
    public abstract long insertChart(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.CurrentChartEntity currentChartEntity);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from CurrentChartEntity where currentUserId =:userId order by CurrentChartEntity.createTime ")
    public abstract java.util.List<com.android.ctgapp.entity.chart.CurrentChartEntity> loadAllChart(int userId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from CurrentChartEntity where (senderUserId =:targetId or receiverUserId = :targetId) and createTime < :lastMsgTime and currentUserId =:userId order by CurrentChartEntity.createTime desc limit :size")
    public abstract java.util.List<com.android.ctgapp.entity.chart.CurrentChartEntity> loadChartByPage(int size, int targetId, long lastMsgTime, int userId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from CurrentChartEntity where (senderUserId =:targetId or receiverUserId = :targetId)  and currentUserId =:userId order by CurrentChartEntity.createTime desc ")
    public abstract java.util.List<com.android.ctgapp.entity.chart.CurrentChartEntity> loadChartByOtherId(int targetId, int userId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from CurrentChartEntity where id =:chartId")
    public abstract com.android.ctgapp.entity.chart.CurrentChartEntity findChartById(@org.jetbrains.annotations.NotNull()
    java.lang.String chartId);
    
    @androidx.room.Query(value = "update CurrentChartEntity set read = 1 where (senderUserId =:targetId or receiverUserId = :targetId) and createTime < :lastMsgTime and currentUserId =:userId")
    public abstract void changeRead(int targetId, int userId, long lastMsgTime);
    
    @androidx.room.Update()
    public abstract void updateChart(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.CurrentChartEntity entity);
    
    @androidx.room.Query(value = "delete  from CurrentChartEntity where id= :chartId")
    public abstract void deleteChartById(@org.jetbrains.annotations.NotNull()
    java.lang.String chartId);
    
    @androidx.room.Query(value = "delete  from CurrentChartEntity where currentUserId= :userId and (senderUserId =:otherId or receiverUserId=:otherId)")
    public abstract void deleteChartByOtherId(int otherId, int userId);
}
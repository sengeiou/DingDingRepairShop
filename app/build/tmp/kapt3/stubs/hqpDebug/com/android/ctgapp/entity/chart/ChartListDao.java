package com.android.ctgapp.entity.chart;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\t\u001a\u00020\bH\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/android/ctgapp/entity/chart/ChartListDao;", "", "deleteChartList", "", "list", "Lcom/android/ctgapp/entity/chart/ChartListEntity;", "findChartFromList", "senderId", "", "userId", "insertChartList", "", "chartListEntity", "loadAllChartList", "", "updateChartList", "app_hqpDebug"})
public abstract interface ChartListDao {
    
    @androidx.room.Insert()
    public abstract long insertChartList(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.ChartListEntity chartListEntity);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from ChartListEntity where currentUserId = :userId order by lastMsgTime desc")
    public abstract java.util.List<com.android.ctgapp.entity.chart.ChartListEntity> loadAllChartList(int userId);
    
    @androidx.room.Update()
    public abstract void updateChartList(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.ChartListEntity chartListEntity);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from ChartListEntity where otherId = :senderId and currentUserId =:userId")
    public abstract com.android.ctgapp.entity.chart.ChartListEntity findChartFromList(int senderId, int userId);
    
    @androidx.room.Delete()
    public abstract void deleteChartList(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.ChartListEntity list);
}
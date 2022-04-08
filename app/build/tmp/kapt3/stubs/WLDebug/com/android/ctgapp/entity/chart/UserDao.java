package com.android.ctgapp.entity.chart;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/android/ctgapp/entity/chart/UserDao;", "", "findUserByID", "Lcom/android/ctgapp/entity/chart/UserEntity;", "userId", "", "insertUser", "", "user", "updateUser", "", "app_WLDebug"})
public abstract interface UserDao {
    
    @androidx.room.Insert()
    public abstract long insertUser(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.UserEntity user);
    
    @androidx.room.Update()
    public abstract void updateUser(@org.jetbrains.annotations.NotNull()
    com.android.ctgapp.entity.chart.UserEntity user);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from UserEntity where userId = :userId")
    public abstract com.android.ctgapp.entity.chart.UserEntity findUserByID(int userId);
}
package com.android.ctgapp.sql;

import java.lang.System;

@androidx.room.Database(version = 3, entities = {com.android.ctgapp.entity.chart.CurrentChartEntity.class, com.android.ctgapp.entity.chart.ChartListEntity.class, com.android.ctgapp.entity.chart.UserEntity.class}, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/android/ctgapp/sql/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "chartListDao", "Lcom/android/ctgapp/entity/chart/ChartListDao;", "currentChartDao", "Lcom/android/ctgapp/entity/chart/CurrentChartDao;", "userDao", "Lcom/android/ctgapp/entity/chart/UserDao;", "Companion", "app_WLDebug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.android.ctgapp.sql.AppDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_2_3 = null;
    private static com.android.ctgapp.sql.AppDatabase instance;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.ctgapp.entity.chart.CurrentChartDao currentChartDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.ctgapp.entity.chart.ChartListDao chartListDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.android.ctgapp.entity.chart.UserDao userDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/android/ctgapp/sql/AppDatabase$Companion;", "", "()V", "MIGRATION_2_3", "Landroidx/room/migration/Migration;", "getMIGRATION_2_3", "()Landroidx/room/migration/Migration;", "instance", "Lcom/android/ctgapp/sql/AppDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_WLDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_2_3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Synchronized()
        public final synchronized com.android.ctgapp.sql.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}
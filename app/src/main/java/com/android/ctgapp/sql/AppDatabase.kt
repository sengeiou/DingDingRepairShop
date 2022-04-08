package com.android.ctgapp.sql

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.android.ctgapp.entity.chart.*

@Database(version = 3, entities = [CurrentChartEntity::class,ChartListEntity::class,UserEntity::class],exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun currentChartDao(): CurrentChartDao
    abstract fun chartListDao(): ChartListDao
    abstract fun userDao(): UserDao


    companion object {
        val MIGRATION_2_3=object :Migration(2,3){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("alter table CurrentChartEntity add column read int not null default 0")
                database.execSQL("alter table ChartListEntity add column online int not null default 0")
            }
        }

        private var instance: AppDatabase? = null

        @Synchronized
        fun getDatabase(context: Context):AppDatabase{
            instance?.let {
                return it
            }
            return  Room.databaseBuilder(context.applicationContext,AppDatabase::class.java,"app_database")
                .addMigrations(MIGRATION_2_3)
                .build().apply {
                instance=this
            }
        }
    }
}
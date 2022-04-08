package com.android.ctgapp.entity.chart

import androidx.room.*

@Dao
interface ChartListDao {

    @Insert
    fun insertChartList(chartListEntity: ChartListEntity): Long

    @Query("select * from ChartListEntity where currentUserId = :userId order by lastMsgTime desc")
    fun loadAllChartList(userId: Int): List<ChartListEntity>

    @Update
    fun updateChartList(chartListEntity: ChartListEntity)

    @Query("select * from ChartListEntity where otherId = :senderId and currentUserId =:userId")
    fun findChartFromList(senderId: Int, userId: Int): ChartListEntity?


    @Delete
    fun deleteChartList(list: ChartListEntity)


}
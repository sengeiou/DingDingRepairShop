package com.android.ctgapp.entity.chart

import androidx.room.*

@Dao
interface CurrentChartDao {

    @Insert
    fun insertChart(currentChartEntity: CurrentChartEntity): Long


    @Query("select * from CurrentChartEntity where currentUserId =:userId order by CurrentChartEntity.createTime ")
    fun loadAllChart(userId: Int): List<CurrentChartEntity>

    @Query("select * from CurrentChartEntity where (senderUserId =:targetId or receiverUserId = :targetId) and createTime < :lastMsgTime and currentUserId =:userId order by CurrentChartEntity.createTime desc limit :size")
    fun loadChartByPage(size: Int, targetId: Int, lastMsgTime: Long, userId: Int): List<CurrentChartEntity>

    @Query("select * from CurrentChartEntity where (senderUserId =:targetId or receiverUserId = :targetId)  and currentUserId =:userId order by CurrentChartEntity.createTime desc ")
    fun loadChartByOtherId(targetId: Int,  userId: Int): List<CurrentChartEntity>

    @Query("select * from CurrentChartEntity where id =:chartId")
    fun findChartById(chartId: String): CurrentChartEntity?


//    @Query("select * from CurrentChartEntity where (senderUserId =:targetId or receiverUserId = :targetId)  and currentUserId =:userId order by CurrentChartEntity.createTime desc ")
    @Query("update CurrentChartEntity set read = 1 where (senderUserId =:targetId or receiverUserId = :targetId) and createTime < :lastMsgTime and currentUserId =:userId")
    fun changeRead(targetId: Int,  userId: Int, lastMsgTime: Long)

    @Update
    fun updateChart(entity: CurrentChartEntity)

    @Query("delete  from CurrentChartEntity where id= :chartId")
    fun deleteChartById(chartId: String)


    @Query("delete  from CurrentChartEntity where currentUserId= :userId and (senderUserId =:otherId or receiverUserId=:otherId)")
    fun deleteChartByOtherId(otherId: Int, userId: Int)


//    @Query("select * from CurrentChartEntity order by CurrentChartEntity.createTime desc limit (:page-1)*(:size+1),(:page-1)*:size+:size")
//    fun loadChartByPage(page: Int, size: Int): List<CurrentChartEntity>

//    @Query("select * from CurrentChartEntity where CurrentChartEntity.createTime<(select * from ) order by CurrentChartEntity.createTime desc ")
//    fun loadChartByPage(size: Int, lastMsgId: Int, targetId: Int): List<CurrentChartEntity>
}
package com.android.ctgapp.entity.chart

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface  UserDao {
    @Insert
    fun insertUser(user: UserEntity): Long

    @Update
    fun updateUser(user: UserEntity)

    @Query("select * from UserEntity where userId = :userId")
    fun findUserByID(userId: Int): UserEntity?

}
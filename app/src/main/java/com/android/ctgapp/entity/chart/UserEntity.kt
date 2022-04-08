package com.android.ctgapp.entity.chart

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class UserEntity {
    @PrimaryKey
    var userId: Int? = null
    var telephone: String? = null
    var realName: String? = null
    var imageUrl: String? = null
    var head64: String? = null
}
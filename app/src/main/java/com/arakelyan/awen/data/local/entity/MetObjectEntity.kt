package com.arakelyan.awen.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "met_objects")
data class MetObjectEntity(
    @PrimaryKey val id: Int
)

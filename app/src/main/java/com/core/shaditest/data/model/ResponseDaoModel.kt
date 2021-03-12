package com.core.shaditest.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profilemodel")
data class ResponseDaoModel(

    @PrimaryKey
    @ColumnInfo(name = "name")
    var nameStr: String
) {
    constructor() : this(
        "Dummy"
    )
}
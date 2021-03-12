package com.core.shaditest.data.helper

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.core.shaditest.data.model.ResponseDaoModel
import kotlinx.coroutines.flow.Flow

@Dao
abstract class ResponseModelDAO {
    @Query("Select * from profilemodel")
    abstract fun getResponseModel(): Flow<List<ResponseDaoModel>>

    @Insert(onConflict = REPLACE)
    abstract fun insertResponseModel(profile: ResponseDaoModel)
}
package com.core.shaditest.data.repository

import androidx.annotation.WorkerThread
import com.core.shaditest.data.helper.ResponseModelDAO
import com.core.shaditest.data.model.ResponseDaoModel
import kotlinx.coroutines.flow.Flow

class ResponseDAORepository(private val responseDAO: ResponseModelDAO) {
    val responseModel: Flow<List<ResponseDaoModel>> = responseDAO.getResponseModel()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(responseModel: ResponseDaoModel) {
        responseDAO.insertResponseModel(responseModel)
    }
}
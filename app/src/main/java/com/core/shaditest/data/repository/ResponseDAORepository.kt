package com.core.shaditest.data.repository

import androidx.annotation.WorkerThread
import com.core.shaditest.data.helper.ResponseModelDAO
import com.core.shaditest.data.model.Profiles
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class ResponseDAORepository(private val responseDAO: ResponseModelDAO) {
    val responseModel: Flow<List<Profiles>> = responseDAO.getResponseModel()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(responseModel: Profiles) {
        GlobalScope.launch {
            responseDAO.insertResponseModel(responseModel)
        }
    }
}
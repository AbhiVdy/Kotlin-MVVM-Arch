package com.core.shaditest.data.network

import com.core.shaditest.data.model.ResponseModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NetworkService {
    @GET("/api/")
    fun getProfiledData(@Query("results") size: Int?): Single<ResponseModel>
}
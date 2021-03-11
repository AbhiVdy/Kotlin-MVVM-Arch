package com.core.shaditest.data.network

import com.core.shaditest.data.model.ResponseModel
import com.core.shaditest.utils.Constants
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class NetworkServiceImpl : NetworkService {

    override fun getProfiledData(size: Int?): Single<ResponseModel> {
        val retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service: NetworkService = retrofit.create(NetworkService::class.java)
        return service.getProfiledData(size)
    }
}
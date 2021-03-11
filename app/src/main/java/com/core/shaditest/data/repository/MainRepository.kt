package com.core.shaditest.data.repository

import com.core.shaditest.data.helper.NetworkHelper
import com.core.shaditest.data.model.ResponseModel
import io.reactivex.Single

class MainRepository(private val networkHelper: NetworkHelper) {

    fun getProfileList(size: Int) : Single<ResponseModel> {
        return networkHelper.getProfiles(size)
    }
}
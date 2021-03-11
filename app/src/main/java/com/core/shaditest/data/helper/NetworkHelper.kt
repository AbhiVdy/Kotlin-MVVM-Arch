package com.core.shaditest.data.helper

import com.core.shaditest.data.network.NetworkService

class NetworkHelper(private val networkService: NetworkService) {
    fun getProfiles(size: Int) = networkService.getProfiledData(size)
}
package com.core.shaditest.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.core.shaditest.data.helper.NetworkHelper
import com.core.shaditest.data.repository.MainRepository
import java.lang.IllegalArgumentException

class VMFactory(private val networkHelper: NetworkHelper, private val size: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(networkHelper), size = size) as T
        }
        throw IllegalArgumentException("Something went wrong")
    }
}
package com.core.shaditest.ui.base

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.core.shaditest.ShadiApplication
import com.core.shaditest.data.helper.NetworkHelper
import com.core.shaditest.data.repository.MainRepository

class VMFactory(
    private val application: Application,
    private val networkHelper: NetworkHelper,
    private val size: Int
) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(
                MainRepository(networkHelper),
                (application as ShadiApplication).repository,
                size
            ) as T
        }
        throw IllegalArgumentException("Something went wrong")
    }
}
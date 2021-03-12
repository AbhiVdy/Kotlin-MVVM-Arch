package com.core.shaditest

import android.app.Application
import com.core.shaditest.data.db.ResponseModelDatabase
import com.core.shaditest.data.repository.ResponseDAORepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class ShadiApplication : Application() {

    companion object {
        lateinit var instance: ShadiApplication
    }

    val applicationScope = CoroutineScope(SupervisorJob())

    private val database by lazy { ResponseModelDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { ResponseDAORepository(database.responseDAO()) }
}
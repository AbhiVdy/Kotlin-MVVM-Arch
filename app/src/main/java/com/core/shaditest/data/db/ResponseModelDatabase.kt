package com.core.shaditest.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.core.shaditest.data.helper.ResponseModelDAO
import com.core.shaditest.data.model.Profiles
import kotlinx.coroutines.CoroutineScope

@Database(entities = [Profiles::class], version = 1, exportSchema = false)
abstract class ResponseModelDatabase : RoomDatabase() {

    abstract fun responseDAO(): ResponseModelDAO

    companion object {
        private val DB_NAME = "profiles_db"

        @Volatile
        private var INSTANCE: ResponseModelDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): ResponseModelDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance =
                    Room.databaseBuilder(
                        context.applicationContext,
                        ResponseModelDatabase::class.java,
                        DB_NAME
                    ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
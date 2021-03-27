package com.core.shaditest.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.core.shaditest.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        GlobalScope.launch {
            delay(4000)
            navigateToAcvity()
        }
    }

    private fun navigateToAcvity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
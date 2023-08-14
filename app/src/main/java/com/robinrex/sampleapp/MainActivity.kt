package com.robinrex.sampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.robinrex.module1.Module1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Module1.module1()
    }
}
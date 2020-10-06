package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun min(a: Int, b: Int): Int = if (a > b) b else a
fun max(a: Int, b: Int): Int = if (a < b) b else a

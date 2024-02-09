package com.cs4520.assignment1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }
}

// Confused as to the usage of lifecycles here. The app works right now but we don't use
// onDestroy or anything like that. I wonder if my app is mismanaging memory/ not following best practices.
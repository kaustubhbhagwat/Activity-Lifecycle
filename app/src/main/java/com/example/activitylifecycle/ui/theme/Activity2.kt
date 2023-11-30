package com.example.activitylifecycle.ui.theme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.activitylifecycle.R

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val keyVal1 = intent.getStringExtra("key1")
        val keyVal2 = intent.getIntExtra("key2",0)

        Toast.makeText( this,"Value is $keyVal1 and $keyVal2",Toast.LENGTH_LONG).show()
    }
}
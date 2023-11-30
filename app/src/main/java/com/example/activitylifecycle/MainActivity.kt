package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.activitylifecycle.ui.theme.Activity2
import com.example.activitylifecycle.ui.theme.ActivityLifecycleTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("On Create", "is called")
        println("On Create is called")
        Toast.makeText(this,"On Create is Called", Toast.LENGTH_LONG).show()

        val btnSubmit = findViewById<Button>(R.id.button)
        btnSubmit.setOnClickListener {
            val intentMoveToAnotherActivity = Intent(this, Activity2::class.java).apply {
                putExtra("key1","value1")
                putExtra("key2",1)
            }
            startActivity(intentMoveToAnotherActivity)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart","is Called")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume","is Called")
    }

    override fun onPause() {
        super.onPause()
        Log.e("OnPause","is Called")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop","is Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart","is Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy","is Called")
    }
}
package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<Button>(R.id.WelcomeButton)
        next.setOnClickListener{
            val intent = Intent( this@MainActivity, TamagotchiAppActivity::class.java)
            startActivity(intent) // Start the TamagotchiAppActivity
        }
    }
}
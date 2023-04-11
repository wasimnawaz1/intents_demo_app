package com.example.intents_demo_app

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class ActivityB : AppCompatActivity() {

    private lateinit var tvMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        Log.d(TAG, "Second activity started!")
        tvMessage = findViewById(R.id.tv_message)

        val message = intent.getStringExtra("message")
        tvMessage.text = message

    }
}
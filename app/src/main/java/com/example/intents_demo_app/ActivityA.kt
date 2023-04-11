package com.example.intents_demo_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityA : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        val btnOpenActivity: Button = findViewById(R.id.btn_open_activity)
        btnOpenActivity.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            intent.putExtra("message", "This is Activity B started by Activity A.")
            startActivity(intent)
        }
    }

}

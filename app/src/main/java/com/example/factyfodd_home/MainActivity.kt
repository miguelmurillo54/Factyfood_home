package com.example.factyfodd_home

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: ImageButton= findViewById(R.id.imageButtonnewrecipe)
        btn.setOnClickListener{

            val intent: Intent=Intent(this, NuevasRecetas:: class.java)
            startActivity(intent)
        }
    }
}
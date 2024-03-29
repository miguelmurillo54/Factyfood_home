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

        val btnnewrecipe: ImageButton= findViewById(R.id.imageButtonnewrecipe)
        btnnewrecipe.setOnClickListener{

            val intent: Intent=Intent(this, NuevasRecetas:: class.java)
            startActivity(intent)
        }

        val btntrending: ImageButton= findViewById(R.id.imageButtontrending)
        btntrending.setOnClickListener{

            val intent: Intent=Intent(this, trending:: class.java)
            startActivity(intent)
        }

        val btnrice: ImageButton= findViewById(R.id.imageButtonrice)
        btnrice.setOnClickListener{

            val intent: Intent=Intent(this, Arroz::class.java)
            startActivity(intent)
        }
        val btnpasta: ImageButton= findViewById(R.id.imageButtonpasta)
        btnpasta.setOnClickListener{

            val intent: Intent=Intent(this, Pasta::class.java)
            startActivity(intent)
        }

        val btnvegetables: ImageButton= findViewById(R.id.imageButtonvegetables)
        btnvegetables.setOnClickListener{

            val intent: Intent=Intent(this, Vegetales::class.java)
            startActivity(intent)
        }

        val btnsoup: ImageButton= findViewById(R.id.imageButtonsoup)
        btnsoup.setOnClickListener{

            val intent: Intent=Intent(this, Sopa::class.java)
            startActivity(intent)
        }
        val btnfish: ImageButton= findViewById(R.id.imageButtonfish)
        btnsoup.setOnClickListener{

            val intent: Intent=Intent(this, pescados::class.java)
            startActivity(intent)
        }
    }
}
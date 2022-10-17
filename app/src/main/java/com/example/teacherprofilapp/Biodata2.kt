package com.example.teacherprofilapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Biodata2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata2)
        val btn3 = findViewById<ImageButton>(R.id.Imagebutton3)
        val btn4 = findViewById<ImageButton>(R.id.Imagebutton4)

        btn3.setOnClickListener {
            val Intent = Intent(this, identitas::class.java)
            startActivity(Intent)
        }
        btn4.setOnClickListener {
            val Intent = Intent(this, Mengajar::class.java)
            startActivity(Intent)
        }
    }
}
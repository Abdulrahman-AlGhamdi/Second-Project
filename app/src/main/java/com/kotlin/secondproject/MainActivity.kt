package com.kotlin.secondproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val root = findViewById<ConstraintLayout>(R.id.root)

        root.setOnLongClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            false
        }
    }
}
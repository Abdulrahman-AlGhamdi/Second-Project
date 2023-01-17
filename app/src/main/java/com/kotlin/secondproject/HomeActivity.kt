package com.kotlin.secondproject

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val emailText = findViewById<TextView>(R.id.user_email)
        val email = intent.getStringExtra("email") ?: "Email is empty"

        emailText.text = "Welcome Back! $email"

        toolbar.setNavigationOnClickListener {
            finish()
        }
    }
}
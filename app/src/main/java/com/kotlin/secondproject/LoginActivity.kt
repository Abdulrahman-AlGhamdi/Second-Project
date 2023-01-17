package com.kotlin.secondproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val viewModel = ViewModelProvider(this)[LoginViewModel::class.java]
        val loginButton = findViewById<Button>(R.id.login)
        val emailInput = findViewById<EditText>(R.id.email_input)
        val passInput = findViewById<EditText>(R.id.password_input)

        loginButton.setOnClickListener {
            val email = emailInput.text.toString()
            val pass = passInput.text.toString()
            val isEmailValid = viewModel.checkEmail(email)
            val isPassValid = viewModel.checkPass(pass)

            when {
                isEmailValid && isPassValid -> {
                    val intent = Intent(this, HomeActivity::class.java)
                    intent.putExtra("email", email)
                    startActivity(intent)
                }
                !isEmailValid -> Toast.makeText(this, "Email is wrong", Toast.LENGTH_SHORT).show()
                else -> Toast.makeText(this, "Password is wrong", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
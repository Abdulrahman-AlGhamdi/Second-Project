package com.kotlin.secondproject

import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    fun checkEmail(email: String) = email.equals("abdulrahman", true)

    fun checkPass(pass: String) = pass.length == 5
}
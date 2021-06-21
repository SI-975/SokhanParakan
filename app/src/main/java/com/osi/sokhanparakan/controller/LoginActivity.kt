package com.osi.sokhanparakan.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.osi.sokhanparakan.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var loginActBining: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginActBining = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginActBining.root)

        loginActBining.loginLoginBtn.setOnClickListener {  }
        loginActBining.loginCreateUserBtn.setOnClickListener {
            val intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }
    }
}
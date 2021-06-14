package com.example.sokhanparakan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sokhanparakan.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var loginActBining: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginActBining = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginActBining.root)

        loginActBining.loginLoginBtn.setOnClickListener {  }
        loginActBining.loginCreateUserBtn.setOnClickListener {  }
    }
}
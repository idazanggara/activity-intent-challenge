package com.example.activity_intent_challenge.screen

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activity_intent_challenge.R
import com.google.android.material.button.MaterialButton

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnRegister: MaterialButton = findViewById(R.id.btn_register)
        btnRegister.setOnClickListener {
            Toast.makeText(this, "Register successfully!", Toast.LENGTH_LONG).show()
            finish()
        }

        val btnLogin: MaterialButton = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener {
            finish()
        }
    }
}
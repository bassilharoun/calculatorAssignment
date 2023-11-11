package com.codingformobile.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.codingformobile.calculator.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
//        val name = binding.editTextText.text.toString()
//        binding.buttonLets.setOnClickListener {
//            var intent = Intent(this, MainActivity(name = "name")::class.java)
//            startActivity(intent)
//        }
    }


}
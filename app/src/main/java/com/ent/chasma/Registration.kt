package com.ent.chasma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ent.chasma.databinding.ActivityRegistrationBinding

class Registration : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.hide()

        binding.btnStart.setOnClickListener {
            if (binding.etName.text.toString().isEmpty()) {
                binding.etName.error = "UserName Required"
            } else if (binding.etMobileNumber.text.toString().isEmpty()) {
                binding.etMobileNumber.error = "Mobile Number Required"
            } else if (binding.etEmail.text.toString().isEmpty()) {
                binding.etEmail.error = "Email Required"
            } else if (binding.etUserName.text.toString().isEmpty()) {
                binding.etUserName.error = "Username Required"
            } else if (binding.etPassword.text.toString().isEmpty()) {
                binding.etPassword.error = "Password Required"
            } else {
                val intent = Intent(this, Registration::class.java)
                startActivity(intent)
                finish()
            }
            binding.login.setOnClickListener {
                val intent = Intent(this, Registration::class.java)
                startActivity(intent)
                finish()

            }
        }
    }

    fun onClick(view: android.view.View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
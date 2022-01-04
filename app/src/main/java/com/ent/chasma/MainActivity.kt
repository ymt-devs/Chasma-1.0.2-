package com.ent.chasma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.ent.chasma.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.hide()

        binding.btnStart.setOnClickListener{
            if(binding.etName.text.toString().isEmpty() ){
                binding.etName.error = "UserName Required"
            }else if(binding.etPassword.text.toString().isEmpty() ) {
                binding.etPassword.error = "Password Required"
            }
            else{
                val intent = Intent(this, Nav_drawer::class.java)
                startActivity(intent)
                finish()
            }
        binding.tvRegister.setOnClickListener{
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
            finish()

        }       }
    }

    fun onClick(view: android.view.View) {
        val intent = Intent(this, Registration::class.java)
        startActivity(intent)
        finish()
    }
}
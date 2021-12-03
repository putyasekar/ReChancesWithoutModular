package com.fin.rechanceswithoutmodular.authentication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fin.rechanceswithoutmodular.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signUpButton.setOnClickListener {
            SignInActivity.EMAIL = binding.emailET.text.toString()
            SignInActivity.PASSWORD = binding.passwordET.text.toString()
            SignInActivity.NAME = binding.fullNameET.text.toString()

            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

        binding.signInTV.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
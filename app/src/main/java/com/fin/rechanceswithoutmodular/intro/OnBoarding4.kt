package com.fin.rechanceswithoutmodular.intro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fin.rechanceswithoutmodular.authentication.SignInActivity
import com.fin.rechanceswithoutmodular.databinding.ActivityOnBoarding4Binding

class OnBoarding4 : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoarding4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNext4.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

        binding.back3.setOnClickListener {
            val intent = Intent(this, OnBoarding3::class.java)
            startActivity(intent)
        }
    }
}
package com.fin.rechanceswithoutmodular.intro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fin.rechanceswithoutmodular.authentication.SignInActivity
import com.fin.rechanceswithoutmodular.databinding.ActivityOnBoarding2Binding

class OnBoarding2 : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoarding2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNext2.setOnClickListener {
            val intent = Intent(this, OnBoarding3::class.java)
            startActivity(intent)
        }

        binding.back1.setOnClickListener {
            val intent = Intent(this, OnBoarding1::class.java)
            startActivity(intent)
        }

        binding.skipText2.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
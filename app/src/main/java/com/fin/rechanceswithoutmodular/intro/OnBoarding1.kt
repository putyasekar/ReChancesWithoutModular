package com.fin.rechanceswithoutmodular.intro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fin.rechanceswithoutmodular.authentication.SignInActivity
import com.fin.rechanceswithoutmodular.databinding.ActivityOnBoarding1Binding

class OnBoarding1 : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoarding1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNext.setOnClickListener {
            val intent = Intent(this, OnBoarding2::class.java)
            startActivity(intent)
        }

        binding.skipText.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
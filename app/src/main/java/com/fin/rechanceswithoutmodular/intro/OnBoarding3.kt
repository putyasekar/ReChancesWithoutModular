package com.fin.rechanceswithoutmodular.intro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fin.rechanceswithoutmodular.authentication.SignInActivity
import com.fin.rechanceswithoutmodular.databinding.ActivityOnBoarding3Binding

class OnBoarding3 : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoarding3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNext3.setOnClickListener {
            val intent = Intent(this, OnBoarding4::class.java)
            startActivity(intent)
        }

        binding.back2.setOnClickListener {
            val intent = Intent(this, OnBoarding2::class.java)
            startActivity(intent)
        }

        binding.skipText3.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
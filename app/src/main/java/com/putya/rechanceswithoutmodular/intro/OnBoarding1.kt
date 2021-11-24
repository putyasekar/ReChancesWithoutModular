package com.putya.rechanceswithoutmodular.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.putya.rechanceswithoutmodular.R
import com.putya.rechanceswithoutmodular.authentication.SignInActivity

class OnBoarding1 : AppCompatActivity() {
//    var btnNext: Button? = null
//    var btnSkip: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding1)

//        btnNext = findViewById(R.id.button_next)
//        btnSkip = findViewById(R.id.skipText)
//
//        btnNext?.setOnClickListener {
//            startActivity(Intent(this@OnBoarding1, OnBoarding2::class.java))
//        }
//
//        btnSkip?.setOnClickListener {
//            startActivity(Intent(this@OnBoarding1, SignInActivity::class.java))
//        }
    }
}
package com.putya.rechanceswithoutmodular.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.putya.rechanceswithoutmodular.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//        supportActionBar?.hide()

//        var handler = Handler()
//        handler.postDelayed({
//            var intent = Intent(this@SplashScreen, OnBoarding1::class.java)
//            startActivity(intent)
//            finish()
//        }, 5000L)

//        CoroutineScope(Dispatchers.Main).launch {
//            delay(5000L)
//            startActivity(Intent(this@SplashScreen, OnBoarding1::class.java))
//            finish()
//        }
    }
}
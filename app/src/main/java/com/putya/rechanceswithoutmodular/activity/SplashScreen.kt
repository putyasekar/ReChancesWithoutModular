package com.putya.rechanceswithoutmodular.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.putya.rechanceswithoutmodular.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        CoroutineScope(Dispatchers.Main).launch {
            delay(5000L)
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish()
        }
    }
}
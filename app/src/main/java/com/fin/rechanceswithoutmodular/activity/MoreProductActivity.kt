package com.fin.rechanceswithoutmodular.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fin.rechanceswithoutmodular.databinding.ActivityMoreProductBinding

class MoreProductActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMoreProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoreProductBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
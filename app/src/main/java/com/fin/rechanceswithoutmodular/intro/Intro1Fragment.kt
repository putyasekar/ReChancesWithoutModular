package com.fin.rechanceswithoutmodular.intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fin.rechanceswithoutmodular.R

class Intro1Fragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_intro1, container, false)
        }
    }
}
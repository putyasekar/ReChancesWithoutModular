package com.fin.rechanceswithoutmodular.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.adapter.ViewPagerAdapter
import com.fin.rechanceswithoutmodular.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chip_nav.setOnItemSelectedListener { id ->
            when (id) {
                R.id.home_page -> view_pager_home.currentItem = 0
                R.id.list_item_page -> view_pager_home.currentItem = 1
                R.id.post_page -> view_pager_home.currentItem = 2
                R.id.chat_page -> view_pager_home.currentItem = 3
                R.id.profile_page -> view_pager_home.currentItem = 4
            }
        }

        view_pager_home.setOnTouchListener(View.OnTouchListener { p, event -> true })
        view_pager_home.adapter = ViewPagerAdapter(supportFragmentManager).apply {
            list = ArrayList<String>().apply {
                add("Home")
                add("Lists")
                add("Post")
                add("Chat")
                add("Profile")
            }
        }
    }
}

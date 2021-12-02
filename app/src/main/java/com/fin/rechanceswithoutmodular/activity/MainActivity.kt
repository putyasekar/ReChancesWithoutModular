package com.fin.rechanceswithoutmodular.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home_page -> {
                    val homeFragment = HomeFragment()
                    addFragment(homeFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.list_item_page -> {
                    val bookingFragment = ListItemFragment()
                    addFragment(bookingFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.post_page -> {
                    val inboxFragment = PostFragment()
                    addFragment(inboxFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.chat_page -> {
                    val historyFragment = ChatFragment()
                    addFragment(historyFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.profile_page -> {
                    val profileFragment = ProfileFragment()
                    addFragment(profileFragment)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, fragment, fragment::class.java.simpleName)
            .addToBackStack(null).commit()
    }

    val defaultMainView = HomeFragment.defaultFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chip_nav.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        addFragment(defaultMainView)


    }
}

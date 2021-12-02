package com.fin.rechanceswithoutmodular.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val setOnItemSelectedListener =
        ChipNavigationBar.OnItemSelectedListener setOnItemSelectedListener@{ id ->
            when (id) {
                R.id.home_page -> {
                    val homeFragment = HomeFragment()
                    addFragment(homeFragment)
                    return@ true
                }
                R.id.list_item_page -> {
                    val bookingFragment = ListItemFragment()
                    addFragment(bookingFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.post_page -> {
                    val inboxFragment = PostFragment()
                    addFragment(inboxFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.chat_page -> {
                    val historyFragment = ChatFragment()
                    addFragment(historyFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.profile_page -> {
                    val profileFragment = ProfileFragment()
                    addFragment(profileFragment)
                    return@setOnItemSelectedListener true
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

        //WAIT!!!
        chip_nav.setOnItemSelectedListener(ChipNavigationBar.OnItemSelectedListener)

        addFragment(defaultMainView)

    }
}

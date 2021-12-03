package com.fin.rechanceswithoutmodular.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.databinding.ActivityMainBinding
import com.fin.rechanceswithoutmodular.fragment.*
import com.ismaeldivita.chipnavigation.ChipNavigationBar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mMainNav: ChipNavigationBar = binding.chipNav

        if (savedInstanceState == null) {
            mMainNav.setItemSelected(R.id.home_page, true)
            replaceFragment(HomeFragment())
        }

        mMainNav.setOnItemSelectedListener { id: Int ->
            when (id) {
                R.id.home_page -> replaceFragment(HomeFragment())
                R.id.list_item_page -> replaceFragment(ListItemFragment())
                R.id.post_page -> replaceFragment(PostFragment())
                R.id.chat_page -> replaceFragment(ChatFragment())
                R.id.profile_page -> replaceFragment(ProfileFragment())
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        var fragment = fragment
        val tag = fragment.javaClass.simpleName
        val tr = supportFragmentManager.beginTransaction()
        val curFrag = supportFragmentManager.primaryNavigationFragment
        val cacheFrag = supportFragmentManager.findFragmentByTag(tag)
        if (curFrag != null) tr.hide(curFrag)
        if (cacheFrag == null) {
            tr.add(R.id.view_pager_home, fragment, tag)
        } else {
            tr.show(cacheFrag)
            fragment = cacheFrag
        }
        tr.setPrimaryNavigationFragment(fragment)
        tr.commit()
    }
}

package com.dkgtech.instagramclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.dkgtech.instagramclone.databinding.ActivityMainBinding
import com.dkgtech.instagramclone.fragments.AccountFragment
import com.dkgtech.instagramclone.fragments.AddFragment
import com.dkgtech.instagramclone.fragments.HomeFragment
import com.dkgtech.instagramclone.fragments.ReelsFragment
import com.dkgtech.instagramclone.fragments.SearchFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var fm: FragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fm = supportFragmentManager
        loadFrag(HomeFragment(), true)

        binding.bnView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bnMenu_Home -> {
                    loadFrag(HomeFragment(), false)
                }

                R.id.bnMenu_Search -> {
                    loadFrag(SearchFragment(), false)
                }

                R.id.bnMenu_Add -> {
                    loadFrag(AddFragment(), false)
                }

                R.id.bnMenu_Reels -> {
                    loadFrag(ReelsFragment(), false)
                }

                else -> {
                    loadFrag(AccountFragment(), false)
                }
            }
            true
        }

    }

    fun loadFrag(frag: Fragment, flag: Boolean) {
        val ft = fm.beginTransaction()
        if (flag) {
            ft.add(R.id.container, frag)
        } else {
            ft.replace(R.id.container, frag)
        }
        ft.commit()
    }
}
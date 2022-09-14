package com.banquemisr.coffeeapp_banquemisr.presentation.main

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.banquemisr.coffeeapp_banquemisr.R
import com.banquemisr.coffeeapp_banquemisr.databinding.ActivityMainBinding
import com.banquemisr.coffeeapp_banquemisr.domain.model.Coffee
import com.banquemisr.coffeeapp_banquemisr.presentation.cart.CartFragment
import com.banquemisr.coffeeapp_banquemisr.presentation.menu.MenuListener
import com.banquemisr.coffeeapp_banquemisr.presentation.profile.FragmentProfile
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), MenuListener,
    NavigationView.OnNavigationItemSelectedListener {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.floatingActionButton.setOnClickListener {
            val fragmentMain = FragmentMain()
            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            ft.replace(R.id.fragmentContainer, fragmentMain)
            ft.commit()

        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNavigationView.background = null
        bottomNavigationView.setOnNavigationItemSelectedListener { item: MenuItem? ->
            onNavigationItemSelected(
                item!!
            )
        }
        val toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout, binding.toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )

        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        binding.navigationView.setNavigationItemSelectedListener(this)


    }

    override fun onClick(model: Coffee) {

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.menu_cart) {
            val cartFragment = CartFragment()
            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            ft.replace(R.id.fragmentContainer, cartFragment)
            ft.commit()
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        }
        if (item.itemId == R.id.menu_profile) {
            val fragmentProfile = FragmentProfile()
            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            ft.replace(R.id.fragmentContainer, fragmentProfile)
            ft.commit()
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        }



        return true
    }

    private fun signOut() {
        TODO("Not yet implemented")
    }


}
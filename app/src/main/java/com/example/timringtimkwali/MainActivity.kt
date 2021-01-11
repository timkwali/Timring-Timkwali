package com.example.timringtimkwali

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.navigation.findNavController
import com.example.timringtimkwali.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /** OPEN NAV DRAWER */
        binding.mainSideNavBtn.setOnClickListener {
            binding.drawerLayout.openDrawer(binding.mainNavigationNavVw)
        }
        /** CLOSE NAV DRAWER */
        binding.mainCloseDrawerIv.setOnClickListener{
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        }
        /** SET UP NAV DRAWER */
        val navigationView: NavigationView = binding.mainNavigationNavVw
        navigationView.itemIconTintList = null
        selectNavigationItem(navigationView)
    }

    private fun selectNavigationItem(navigationView: NavigationView) {
        navigationView.setNavigationItemSelectedListener {

            val navController = findNavController(R.id.main_fragmentContainer_frg)
            when(it.itemId) {
                R.id.actionUsers -> navController.navigate(R.id.usersFragment)
                R.id.actionCars -> Toast.makeText(this, "Go to cars fragment", Toast.LENGTH_SHORT).show()
            }

            it.isChecked = true
            binding.drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }
}
package com.example.lasthomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM = "Item"


class MainActivity : AppCompatActivity() {

    private lateinit var bottomMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        bottomMenu = findViewById(R.id.bottom_menu)
        bottomMenu.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.main -> {
                    val mainFragment = MainFragment()
                    replaceFragment(mainFragment)
                }

                R.id.care -> {
                    val careFragment = CareFragment()
                    replaceFragment(careFragment)
                }
                R.id.catalog -> {
                    val catalogFragment = PlantListFragment()
                    replaceFragment(catalogFragment)

                }
            }

            true
        }
        bottomMenu.selectedItemId = savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.main
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM, bottomMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }

}
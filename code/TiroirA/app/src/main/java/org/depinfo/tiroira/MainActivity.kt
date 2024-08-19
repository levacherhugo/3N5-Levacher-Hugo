package org.depinfo.tiroira

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import org.depinfo.tiroira.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "Tiroir A"

        setupDrawer()
    }

    private fun setupDrawer() {
        setupDrawerApplicationBar()
        setupDrawerItemSelected()
    }

    private fun setupDrawerApplicationBar() {
        actionBarDrawerToggle =
            ActionBarDrawerToggle(this, binding.dlTiroir, R.string.ouvert, R.string.ferm)

        binding.dlTiroir.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
    }

    private fun setupDrawerItemSelected() {
        binding.nvTiroir.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.accueil_item -> {
                    finish()
                }
                R.id.profile_item -> {
                    Toast.makeText(this, "Département d'informatique", Toast.LENGTH_LONG).show()
                }
                R.id.logout_item -> {
                    Log.i("TIROIR A", "Déconnexion")
                }
            }
            false
        }
    }
}
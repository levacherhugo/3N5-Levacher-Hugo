package org.depinfo.recettemenu

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import org.depinfo.recettemenu.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.mon_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.croissant) {
            Snackbar.make(binding.root,"Voici un croissant!", Snackbar.LENGTH_SHORT)
                .show()
            return true
        }
        if (id == R.id.help) {
            Snackbar.make(binding.root,"J'arrive à votre secours!", Snackbar.LENGTH_SHORT)
                .show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
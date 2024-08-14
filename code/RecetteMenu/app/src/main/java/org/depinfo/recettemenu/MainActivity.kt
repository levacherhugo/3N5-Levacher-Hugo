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

    // Lier le fichier de menu à l'activité
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.mon_menu, menu)
        return true
    }

    // Réagir au clic sur les éléments de menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        // On a cliqué sur le croissant
        if (id == R.id.croissant) {
            Snackbar.make(binding.root,"Voici un croissant!", Snackbar.LENGTH_SHORT)
                .show()
            return true
        }
        // On a cliqué sur le bouton d'aide
        if (id == R.id.help) {
            Snackbar.make(binding.root,"J'arrive à votre secours!", Snackbar.LENGTH_SHORT)
                .show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
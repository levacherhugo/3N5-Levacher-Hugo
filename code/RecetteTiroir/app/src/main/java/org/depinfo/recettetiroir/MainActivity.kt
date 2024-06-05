package org.depinfo.recettetiroir

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import org.depinfo.recettetiroir.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.accueil_item) {
            Snackbar.make(binding.root, "On va à l'accueil!", Snackbar.LENGTH_SHORT).show()
            return true
        } else if(item.itemId == R.id.rechercher_item) {
            Snackbar.make(binding.root, "On va rechercher!", Snackbar.LENGTH_SHORT).show()
            return true
        } else if (item.itemId == R.id.ajouter_item) {
            Snackbar.make(binding.root, "On va ajouter!", Snackbar.LENGTH_SHORT).show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
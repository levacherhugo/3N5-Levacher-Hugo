package org.levacher

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.levacher.adapters.MonAdapter
import org.levacher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MonAdapter // L'adapteur est accessible partout dans notre classe
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecycler()
        fillRecycler()
    }

    private fun setupRecycler() {
        adapter = MonAdapter() // Créer l'adapteur
        binding.rvMonAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvMonAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }
    private fun fillRecycler() {
        val items: MutableList<String> = mutableListOf(
            "Thriller",
            "The Dark Side of the Moon",
            "The Beatles",
            "Back in Black",
            "Rumours",
            "The Bodyguard",
            "Hotel California",
            "Bad",
            "1",
            "Saturday Night Fever",
            "Abbey Road",
            "Led Zeppelin IV",
            "Jagged Little Pill",
            "The Wall",
            "Bridge Over Troubled Water",
            "Born in the U.S.A.",
            "Come On Over",
            "21",
            "Dangerous",
            "Bellybutton"
        )
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}
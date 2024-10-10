package org.levacher.exercicebingo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.levacher.exercicebingo.adapter.BouleAdapter
import org.levacher.exercicebingo.databinding.ActivityMainBinding
import org.levacher.exercicebingo.models.Boule

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: BouleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecycler()
        fillRecycler()
    }

    private fun setupRecycler() {
        adapter = BouleAdapter() // Créer l'adapteur
        binding.rvBouleAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvBouleAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvBouleAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvBouleAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler() {
        val items: MutableList<Boule> = mutableListOf()
        val lettres = arrayOf('B','I','N','G','O')
        val numbers = (1..75).toList()
        val shuffled = numbers.shuffled()
        for(i in 1..75){
            val number = shuffled[i-1]
            val lettre:Char = lettres[(number-1)/15]
            items.add(Boule(i,number, lettre))
        }
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}
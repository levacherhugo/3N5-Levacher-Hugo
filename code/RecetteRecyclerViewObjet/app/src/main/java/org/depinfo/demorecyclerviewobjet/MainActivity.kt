package org.depinfo.demorecyclerviewobjet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.depinfo.demorecyclerviewobjet.adapters.PersonneAdapter
import org.depinfo.demorecyclerviewobjet.databinding.ActivityMainBinding
import org.depinfo.demorecyclerviewobjet.models.Personne

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PersonneAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecycler()
        fillRecycler()
    }

    private fun setupRecycler() {
        adapter = PersonneAdapter() // Créer l'adapteur
        binding.rvPersonneAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvPersonneAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvPersonneAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvPersonneAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler() {
        val items: MutableList<Personne> = mutableListOf()
        for (i in 1..10000) {
            val sexe: String
            if (i % 2 == 0) {
                sexe = "Homme"
            } else {
                sexe = "Femme"
            }
            items.add(Personne("Nom $i", "Prenom $i", i, sexe))
        }
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}
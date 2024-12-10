package org.levacher.formatifandroid

import adapters.VersionAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import models.Version
import org.levacher.formatifandroid.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerBinding
    private lateinit var adapter: VersionAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecycler()
        fillRecycler()
    }
    private fun setupRecycler() {
        adapter = VersionAdapter() // Créer l'adapteur
        binding.rvVersionAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvVersionAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvVersionAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvVersionAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler() {
        val items: MutableList<Version> = mutableListOf(
            Version("Petit Four", 1.1, "Voici la description de la nouvelle version"),
            Version("Cupcake", 1.5, "Voici la description de la nouvelle version"),
            Version("Edain", 2.0, "Voici la description de la nouvelle version"),
            Version("Honeycomb", 3.0, "Voici la description de la nouvelle version"),
            Version("Ice cream sandwich", 4.0, "Voici la description de la nouvelle version"),
            Version("Lollipop", 5.0, "Voici la description de la nouvelle version"),
        )
        for (i in 1..20) {
            items.add(Version(i.toString(),i.toDouble(),"Bla bla bla"))
        }
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}
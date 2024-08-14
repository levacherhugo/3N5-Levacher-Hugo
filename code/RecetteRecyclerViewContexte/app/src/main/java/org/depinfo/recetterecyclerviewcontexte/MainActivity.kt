package org.depinfo.recetterecyclerviewcontexte
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import org.depinfo.recetterecyclerviewcontexte.adapters.MonAdapter
import org.depinfo.recetterecyclerviewcontexte.databinding.ActivityMainBinding

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
        val items: MutableList<String> = mutableListOf()
        for (i in 1..10000) {
            items.add("Item #$i")
        }
        adapter.submitList(items) // À chaque fois qu'on veut changer ce qui est dans la liste, on utilise submitList de l'adapteur
    }
}
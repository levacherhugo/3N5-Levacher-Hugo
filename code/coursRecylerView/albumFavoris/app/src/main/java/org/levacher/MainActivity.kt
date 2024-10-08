package org.levacher

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.levacher.adapters.MonAdapter
import org.levacher.databinding.ActivityMainBinding
import org.levacher.models.Album

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
        val items: MutableList<Album> = mutableListOf(
            Album(1, "Thriller", "Michael Jackson"),
            Album(2, "The Dark Side of the Moon", "Pink Floyd"),
            Album(3, "The Beatles (White Album)", "The Beatles"),
            Album(4, "Back in Black", "AC/DC"),
            Album(5, "Rumours", "Fleetwood Mac"),
            Album(6, "The Bodyguard (Soundtrack)", "Whitney Houston"),
            Album(7, "Hotel California", "Eagles"),
            Album(8, "Bad", "Michael Jackson"),
            Album(9, "1", "The Beatles"),
            Album(10, "Saturday Night Fever (Soundtrack)", "Various Artists"),
            Album(11, "Abbey Road", "The Beatles"),
            Album(12, "Led Zeppelin IV", "Led Zeppelin"),
            Album(13, "Jagged Little Pill", "Alanis Morissette"),
            Album(14, "The Wall", "Pink Floyd"),
            Album(15, "Bridge Over Troubled Water", "Simon & Garfunkel"),
            Album(16, "Born in the U.S.A.", "Bruce Springsteen"),
            Album(17, "Come On Over", "Shania Twain"),
            Album(18, "21", "Adele"),
            Album(19, "Dangerous", "Michael Jackson"),
            Album(20, "Bellybutton", "Jellyfish")
        )
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}
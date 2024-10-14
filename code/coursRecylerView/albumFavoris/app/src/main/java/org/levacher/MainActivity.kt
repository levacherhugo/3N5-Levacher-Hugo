package org.levacher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
            Album(1, "Thriller", "Michael Jackson", "https://upload.wikimedia.org/wikipedia/en/5/55/Michael_Jackson_-_Thriller.png"),
            Album(2, "The Dark Side of the Moon", "Pink Floyd","https://upload.wikimedia.org/wikipedia/en/3/3b/Dark_Side_of_the_Moon.png"),
            Album(3, "The Beatles (White Album)", "The Beatles","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(4, "Back in Black", "AC/DC","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(5, "Rumours", "Fleetwood Mac","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(6, "The Bodyguard (Soundtrack)", "Whitney Houston","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(7, "Hotel California", "Eagles","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(8, "Bad", "Michael Jackson","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(9, "1", "The Beatles","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(10, "Saturday Night Fever (Soundtrack)", "Various Artists","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(11, "Abbey Road", "The Beatles","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(12, "Led Zeppelin IV", "Led Zeppelin","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(13, "Jagged Little Pill", "Alanis Morissette","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(14, "The Wall", "Pink Floyd","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(15, "Bridge Over Troubled Water", "Simon & Garfunkel","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(16, "Born in the U.S.A.", "Bruce Springsteen","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(17, "Come On Over", "Shania Twain","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(18, "21", "Adele","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(19, "Dangerous", "Michael Jackson","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140"),
            Album(20, "Bellybutton", "Jellyfish","https://static.wikia.nocookie.net/scribblenauts/images/d/d1/Square.png/revision/latest?cb=20140813193140")
        )
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}
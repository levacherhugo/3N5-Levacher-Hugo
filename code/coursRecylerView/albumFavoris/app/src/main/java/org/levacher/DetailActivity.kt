package org.levacher

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.levacher.adapters.MonAdapter
import org.levacher.databinding.ActivityDetailBinding
import org.levacher.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val albumName = intent.getStringExtra("ALBUM_NAME")
        val artistName = intent.getStringExtra("ARTIST_NAME")

        binding.AlbumTitle.text = albumName
        binding.AlbumArtist.text = artistName
    }
}
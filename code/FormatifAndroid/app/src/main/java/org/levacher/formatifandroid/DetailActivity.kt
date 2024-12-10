package org.levacher.formatifandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.levacher.formatifandroid.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvNom.text = intent.getStringExtra("NOM")
        binding.tvNumero.text = intent.getStringExtra("NUMERO")
        binding.tvMessage.text = intent.getStringExtra("CONTENU")
    }
}
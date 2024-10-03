package org.levacher

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.levacher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Accueil"
        if(intent.hasExtra("Nom")){
            binding.bonjour.setText("Bonjour ${intent.getStringExtra("Nom")}")
        }
        else{
            binding.bonjour.setText("Bonjour X")
        }
        binding.btnArticle.setOnClickListener {
            val intent = Intent(this, ArticleActivity::class.java)
            intent.putExtra("numArticle",binding.numberpicker.value.toString())
            startActivity(intent)
        }
        binding.btnContact.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }
        binding.numberpicker.setMinValue(0)
        binding.numberpicker.setMaxValue(10)
    }
}
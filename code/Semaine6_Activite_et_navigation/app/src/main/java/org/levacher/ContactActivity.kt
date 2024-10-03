package org.levacher

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.levacher.databinding.ActivityContactBinding
import org.levacher.databinding.ActivityMainBinding

class ContactActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Contact"
        binding.btnAccueil.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Nom", binding.nameinput.text.toString())
            startActivity(intent)
        }
    }
}
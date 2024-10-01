package com.example

import android.os.Bundle
import android.view.View
import android.view.WindowInsetsAnimation.Bounds
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    private lateinit var listeBoutons: List<Button>

    var scoreTops = 0
    var scoreFlops=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTops.setOnClickListener(View.OnClickListener {

        })
        listeBoutons= listOf(
            binding.btn1,
            binding.btn2,
            binding.btn3,
            binding.btn4,
            binding.btn5,
            binding.btn6,
            binding.btn7,
            binding.btn8,
            binding.btn9
        )

        for(btn in listeBoutons){
            btn.setOnClickListener(View.OnClickListener {
                reagirAuClick(it)
            })
        }

        initialiser()
    }

    fun initialiser(){
        for (btn in listeBoutons){
            btn.setText("Taupe")
        }
        val boutonLapin:Button = listeBoutons.random()
        boutonLapin.setText("Lapin")
    }

    fun reagirAuClick(it:View){
        val boutonClique:Button = it as Button
        if(boutonClique.text=="Lapin"){
            boutonClique.setText("Taupe")
            initialiser()
            scoreTops++
        }else{
            scoreFlops++
        }
        binding.tvTops.setText("Tops : $scoreTops")
        binding.tvFlops.setText("Flops : $scoreFlops")
    }
}
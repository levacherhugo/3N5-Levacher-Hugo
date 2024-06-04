package org.depinfo.recettegraphique

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate
import org.depinfo.recettegraphique.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Données brut à afficher
        // Distribution des animaux favoris en pourcentage
        val notes: Map<String, Int> = mapOf(
            "Chien" to 40, // Ex : 40% des gens préfèrent les chiens
            "Chat" to 30, // Ex : 30% des gens préfèrent les chats
            "Poisson rouge" to 15,
            "Perroquet" to 10,
            "Hamster" to 5
        )

        setupPieChar(notes)
    }

    private fun setupPieChar(notes: Map<String, Int>) {
        val chart = binding.chart
        // On traduit notre map en tableau de PieEntry, que notre PieChart s'attend à recevoir.
        val entries = notes.map { entry ->
            // Un PieEntry a besoin d'une valeur et d'une étiquette.
            // On va donc chercher les clés et les valeurs de notre map.
            PieEntry(entry.value.toFloat(),entry.key)
        }
        val dataSet = PieDataSet(entries, "Animaux préférés")
        // Recommendation : utilisez l'intellisens sur ColorTemplate pour trouver un ensemble de couleurs à votre goût.
        dataSet.colors = ColorTemplate.COLORFUL_COLORS.asList()
        val data = PieData(dataSet)
        data.setValueTextColor(Color.WHITE)
        data.setValueTextSize(24f)
        binding.chart.legend.isEnabled = false
        binding.chart.description.isEnabled = false
        chart.data = data
        // Toujours invalider le graphique après avoir modifié ses caractéristiques.
        chart.invalidate()
    }
}
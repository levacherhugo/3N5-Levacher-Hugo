package org.depinfo.exercicelogcat

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.depinfo.exercicelogcat.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val fileName = "MessagesImportants.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        logcat()
    }

    private fun logcat() {
        var reader: BufferedReader? = null
        try {
            reader = BufferedReader(
                InputStreamReader(assets.open(fileName), "UTF-8")
            )

            var mLine: String;
            while (reader.readLine().also { mLine = it } != null) {
                Log.i("TAG", "logcat: ")
            }
        } finally {
            reader?.close()
        }
    }
}
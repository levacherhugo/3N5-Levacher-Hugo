package org.depinfo.demorecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import org.depinfo.demorecyclerview.adapters.DemoAdapter
import org.depinfo.demorecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: DemoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecycler()
        fillRecycler()
    }

    private fun setupRecycler() {
        adapter = DemoAdapter()
        binding.rvDemo.adapter = adapter
        binding.rvDemo.setHasFixedSize(true)
        binding.rvDemo.addItemDecoration(
            DividerItemDecoration(
                binding.rvDemo.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler() {
        val items: MutableList<String> = mutableListOf()
        for (i in 1..100000) {
            items.add("Item #$i")
        }
        adapter.submitList(items)
    }


}
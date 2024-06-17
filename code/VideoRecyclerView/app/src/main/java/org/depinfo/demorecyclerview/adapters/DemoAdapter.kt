package org.depinfo.demorecyclerview.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.depinfo.demorecyclerview.databinding.DemoItemBinding

class DemoAdapter : ListAdapter<String, DemoAdapter.DemoViewHolder>(DemoDiffCallback) {

    inner class DemoViewHolder(private val binding: DemoItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String) {
            binding.tvItem.text = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DemoViewHolder {
        val binding = DemoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        Log.i("MON_DEBUG", "onCreate")
        val holder : DemoViewHolder = DemoViewHolder(binding)

        return holder
    }

    override fun onBindViewHolder(holder: DemoViewHolder, position: Int) {
        val item: String = getItem(position)
        holder.bind(item)
        Log.i("MON_DEBUG", "onBind ${String.format("%-3s", position)} : $item")
    }
}

object DemoDiffCallback : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}
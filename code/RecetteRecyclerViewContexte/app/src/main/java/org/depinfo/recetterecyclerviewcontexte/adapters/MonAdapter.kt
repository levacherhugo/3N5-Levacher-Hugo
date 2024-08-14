package org.depinfo.recetterecyclerviewcontexte.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.depinfo.recetterecyclerviewcontexte.SecondActivity
import org.depinfo.recetterecyclerviewcontexte.databinding.MonItemBinding

class MonAdapter : ListAdapter<String, MonAdapter.MonItemViewHolder>(MonItemDiffCallback) {

    // binding nous permet d'accéder à tout les champs de notre layout mon_item.xml
    inner class MonItemViewHolder(private val binding: MonItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String) {
            binding.tvElement.text = item // On affiche l'élément dans le TextView

            binding.btnActivity.setOnClickListener {
                val intent: Intent = Intent(binding.root.context, SecondActivity::class.java)
                // On ajoute le nom de l'élément à l'intent
                intent.putExtra("monExtra", item)
                // Démarrer l'activité SecondActivity
                binding.root.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonItemViewHolder {
        val binding: MonItemBinding =
            MonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MonItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MonItemViewHolder, position: Int) {
        val item: String = getItem(position)
        holder.bind(item)
    }

}

object MonItemDiffCallback : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}
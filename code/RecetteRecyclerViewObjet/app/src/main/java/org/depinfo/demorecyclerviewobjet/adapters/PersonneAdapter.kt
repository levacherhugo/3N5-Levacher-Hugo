package org.depinfo.demorecyclerviewobjet.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.depinfo.demorecyclerviewobjet.databinding.PersonneItemBinding
import org.depinfo.demorecyclerviewobjet.models.Personne

class PersonneAdapter : ListAdapter<Personne, PersonneAdapter.PersonneItemViewHolder>(PersonneItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout personne_item.xml
    inner class PersonneItemViewHolder(private val binding: PersonneItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(personne: Personne) {
            binding.tvPrenom.text = personne.prenom
            binding.tvNom.text = personne.nom
            binding.tvSexe.text = personne.sexe
            binding.tvAge.text =
                personne.age.toString() // Attention! Il faut toujours s'assurer qu'on assigne une String.
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonneItemViewHolder {
        val binding: PersonneItemBinding = PersonneItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonneItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonneItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object PersonneItemDiffCallback : DiffUtil.ItemCallback<Personne>() {
    override fun areItemsTheSame(oldItem: Personne, newItem: Personne): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Personne, newItem: Personne): Boolean {
        return oldItem.nom == newItem.nom &&
                oldItem.prenom == newItem.prenom &&
                oldItem.sexe == newItem.sexe &&
                oldItem.age == newItem.age
    }
}
package org.levacher.exercicebingo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.levacher.exercicebingo.databinding.BouleItemBinding
import org.levacher.exercicebingo.models.Boule

class BouleAdapter : ListAdapter<Boule, BouleAdapter.BouleItemViewHolder>(BouleItemDiffCallback){

    // binding nous permet d'accéder à tout le champs de notre layout personne_item.xml
    inner class BouleItemViewHolder(private val binding: BouleItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(boule: Boule) {
            binding.numTirage.text = "Tirage # ${boule.tirage}"
            binding.numeroTire.text = "Numéro tiré : ${boule.numero}"
            binding.charColonne.text = boule.lettre.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BouleItemViewHolder {
        val binding: BouleItemBinding = BouleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BouleItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BouleItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object BouleItemDiffCallback : DiffUtil.ItemCallback<Boule>() {
    override fun areItemsTheSame(oldItem: Boule, newItem: Boule): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Boule, newItem: Boule): Boolean {
        return oldItem.tirage == newItem.tirage &&
                oldItem.lettre == newItem.lettre &&
                oldItem.numero == newItem.numero
    }
}
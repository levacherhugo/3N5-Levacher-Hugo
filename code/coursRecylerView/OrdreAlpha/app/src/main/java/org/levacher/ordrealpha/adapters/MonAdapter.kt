package org.levacher.ordrealpha.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.levacher.ordrealpha.databinding.MonItemBinding

class MonAdapter : ListAdapter<String, MonAdapter.MonItemViewHolder>(MonItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout mon_item.xml
    inner class MonItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String) {
            binding.name.text = item // On affiche l'élément dans le TextView

            binding.btnMonter.setOnClickListener{
                val list = currentList.toMutableList()

                if (layoutPosition > 0) {
                    // Swap the current item with the one above it
                    val temp = list[layoutPosition]
                    list[layoutPosition] = list[layoutPosition - 1]
                    list[layoutPosition - 1] = temp
                    submitList(list) // Update the RecyclerView

                    if(list==list.sorted()){
                        Toast.makeText(itemView.context, "Félicitation, la liste est bien ordonée!", Toast.LENGTH_SHORT).show()
                        list.shuffle()
                        submitList(list)
                    }
                }
            }

            binding.btnDescendre.setOnClickListener{
                val list = currentList.toMutableList()

                if (layoutPosition < list.size - 1) {
                    // Swap the current item with the one below it
                    val temp = list[layoutPosition]
                    list[layoutPosition] = list[layoutPosition + 1]
                    list[layoutPosition + 1] = temp
                    submitList(list) // Update the RecyclerView

                    if(list==list.sorted()){
                        Toast.makeText(itemView.context, "Félicitation, la liste est bien ordonée!", Toast.LENGTH_SHORT).show()
                        list.shuffle()
                        submitList(list)
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonItemViewHolder {
        val binding: MonItemBinding = MonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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
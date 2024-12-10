package adapters

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import models.Version
import org.levacher.formatifandroid.DetailActivity
import org.levacher.formatifandroid.databinding.VersionItemBinding

class VersionAdapter : ListAdapter<Version, VersionAdapter.VersionItemViewHolder>(VersionItemDiffCallback) {

    inner class VersionItemViewHolder(private val binding: VersionItemBinding) : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(version: Version) {
            binding.tvNumero.text = version.numero.toString()
            binding.tvNom.text = version.nom

            binding.itemLayout.setOnClickListener{
                val intent: Intent = Intent(binding.root.context, DetailActivity::class.java)
                intent.putExtra("NOM", version.nom)
                intent.putExtra("NUMERO", version.numero.toString())
                intent.putExtra("CONTENU", version.contenu)
                binding.root.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VersionItemViewHolder {
        val binding: VersionItemBinding = VersionItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VersionItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VersionItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object VersionItemDiffCallback : DiffUtil.ItemCallback<Version>() {
    override fun areItemsTheSame(oldItem: Version, newItem: Version): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Version, newItem: Version): Boolean {
        return oldItem.nom == newItem.nom && oldItem.numero == newItem.numero && oldItem.contenu == newItem.contenu
    }
}
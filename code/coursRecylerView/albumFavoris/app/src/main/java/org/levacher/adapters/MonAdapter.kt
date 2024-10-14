package org.levacher.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import org.levacher.DetailActivity
import org.levacher.databinding.MonItemBinding
import org.levacher.models.Album

class MonAdapter : ListAdapter<Album, MonAdapter.MonItemViewHolder>(MonItemDiffCallback) {
    // binding nous permet d'accéder à tout le champs de notre layout mon_item.xml
    inner class MonItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(album: Album) {
            binding.AlbumTitle.text = album.name // On affiche l'élément dans le TextView
            binding.AlbumArtist.text = album.artistName // On affiche l'élément dans le TextView

            Picasso.get().load(album.coverUrl).into(binding.AlbumCover)

            binding.itemLayout.setOnClickListener{
                val intent:Intent = Intent(binding.root.context, DetailActivity::class.java)
                intent.putExtra("ALBUM_NAME", album.name)
                intent.putExtra("ARTIST_NAME", album.artistName)
                intent.putExtra("ALBUM_COVER", album.coverUrl)
                binding.root.context.startActivity(intent)
            }

            binding.btnDelete.setOnClickListener{
                removeItem(layoutPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonItemViewHolder {
        val binding: MonItemBinding = MonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MonItemViewHolder(binding)    }

    override fun onBindViewHolder(holder: MonItemViewHolder, position: Int) {
        val item: Album = getItem(position)
        holder.bind(item)
    }
    fun removeItem(position: Int) {
        val liste = currentList.toMutableList()
        liste.removeAt(position)
        submitList(liste)
    }
}

object MonItemDiffCallback : DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem.id == newItem.id && oldItem.name == newItem.name && oldItem.artistName == newItem.artistName && oldItem.coverUrl == newItem.coverUrl
    }
}
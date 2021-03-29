package com.example.mywallpapers.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mywallpapers.databinding.ItemMainBinding
import com.example.mywallpapers.model.Item

class WallpapersAdapter(private val item: List<Item>) :
    RecyclerView.Adapter<WallpapersAdapter.WallpaperViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WallpaperViewHolder {
        val binding =
            ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return WallpaperViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WallpaperViewHolder, position: Int) {

        val url = item[position].id

        Glide.with(holder.binding.root).load(url).into(holder.binding.oneImage)

//        holder.itemView.setOnClickListener {
//            val intent =
//                Intent(holder.binding.root.context.applicationContext, ShowFragment::class.java)
//            intent.putExtra("url", url)
//
//        }

    }

    override fun getItemCount() = item.size

    inner class WallpaperViewHolder(val binding: ItemMainBinding) :
        RecyclerView.ViewHolder(binding.root)
}
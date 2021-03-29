package com.example.mywallpapers.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mywallpapers.model.Item
import com.example.mywallpapers.R
import com.example.mywallpapers.adapter.WallpapersAdapter
import com.example.mywallpapers.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        val listItem = arrayListOf<Item>(
            Item(getString(R.string.FirstImage)),
            Item("https://wallpaperaccess.com/full/824062.jpg"),
            Item("https://wallpapercave.com/wp/wp4792744.jpg"),
            Item("https://wallpaper.dog/large/10867438.jpg"),
            Item("https://i2.wp.com/zeeoii.com/wp-content/uploads/2020/08/AMOLED-Mobile-Full-HD-Wallpaper-1080X1920-9.jpg?fit=1080%2C1920&ssl=1"),
            Item("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLO-dL_6K9LpXVlXKBc1kuo0xz_t66WrQfHg&usqp=CAU"),
            Item("https://www.setaswall.com/wp-content/uploads/2017/06/Dark-Phone-Wallpaper-002-1080x2340-340x737.jpg"),
            Item("https://wallpaperaccess.com/full/418779.jpg"),
            Item(getString(R.string.FirstImage)),
            Item(getString(R.string.FirstImage)),
        )

        val wallpaperAdapter = WallpapersAdapter(item = listItem)

        binding.recyclerView.apply {
            adapter = wallpaperAdapter
            setHasFixedSize(true)
        }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
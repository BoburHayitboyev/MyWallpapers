package com.example.mywallpapers.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import com.example.mywallpapers.adapter.PagerAdapter
import com.example.mywallpapers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = PagerAdapter(supportFragmentManager)

        binding.viewpager.adapter = adapter

        adapter.addFragment(SecondFragment(), "Dark")
        adapter.addFragment(FirstFragment(), "Hacker")

        binding.tablayout.setupWithViewPager(binding.viewpager)


//        val button = findViewById<Button>(R.id.button)
//
//        button.setOnClickListener {
//
//            val bitmap: Bitmap =
//                BitmapFactory.decodeResource(resources, R.drawable.download)
//
//            val wallpaperManager = WallpaperManager.getInstance(baseContext)
//
//            WallpaperManager.getInstance(this).setResource(R.raw.download)
//
//        }
    }
}
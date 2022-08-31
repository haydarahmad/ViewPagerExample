package com.haydar.viewpagerexample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haydar.viewpagerexample.controler.PagerAdapter
import com.haydar.viewpagerexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = PagerAdapter(supportFragmentManager)

//        binding.tabLayoutId.setupWithViewPager(binding.viewPager)
//
//        binding.tabLayoutId.setTabTextColors(Color.GRAY,(Color.parseColor("White")))

        binding.tabLayoutId.apply {
            setupWithViewPager(binding.viewPager)
            setTabTextColors(Color.GRAY,(Color.parseColor("Black")))
        }

    }
}
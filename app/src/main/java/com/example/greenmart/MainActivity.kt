package com.example.greenmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var imageList: List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.SliderDots)

        imageList = ArrayList<Int>()
        imageList = imageList + R.drawable.onboarding1
        imageList = imageList + R.drawable.onboarding2
        imageList = imageList + R.drawable.onboarding3

        viewPagerAdapter = ViewPagerAdapter(this@MainActivity, imageList)

        viewPager.adapter = viewPagerAdapter
    }
}
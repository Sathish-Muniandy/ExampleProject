package com.example.design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

//    lateinit var viewpager: ViewPager2
//    lateinit var tablayout:TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        viewpager = findViewById(R.id.introViewPager)
//        tablayout = findViewById(R.id.into_tab_layout)
//        viewpager.adapter = OnboardingAdapter()
//        TabLayoutMediator(tablayout, viewpager) { tab, position -> }.attach() //The Magical Line


    }
}
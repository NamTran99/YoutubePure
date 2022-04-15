package com.example.youtubepure.ui.main

import com.example.youtubepure.R
import com.example.youtubepure.base.BaseActivity
import com.example.youtubepure.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val layoutId: Int
        get() = R.layout.activity_main
    override val fragmentContainerView: Int
        get() = R.id.mainContainerView
}
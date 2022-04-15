package com.example.youtubepure.ui.home.fragments

import androidx.fragment.app.activityViewModels
import com.example.youtubepure.R
import com.sangtb.androidlibrary.base.BaseFragment
import com.example.youtubepure.databinding.FragmentHomeBinding
import com.example.youtubepure.ui.home.viewmodels.HomeViewModel

class HomeFragment : BaseFragment<FragmentHomeBinding,HomeViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_home
    override val viewModel: HomeViewModel by activityViewModels()

}
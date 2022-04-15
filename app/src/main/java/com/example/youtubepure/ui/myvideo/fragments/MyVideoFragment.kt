package com.example.youtubepure.ui.myvideo.fragments

import androidx.fragment.app.activityViewModels
import com.example.youtubepure.R
import com.example.youtubepure.databinding.FragmentMyVideoBinding
import com.example.youtubepure.ui.myvideo.viewmodels.MyVideoViewModel
import com.sangtb.androidlibrary.base.BaseFragment

class MyVideoFragment : BaseFragment<FragmentMyVideoBinding, MyVideoViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_my_video
    override val viewModel: MyVideoViewModel by activityViewModels()
}
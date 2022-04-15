package com.example.youtubepure.ui.myaccount.fragments

import androidx.fragment.app.activityViewModels
import com.example.youtubepure.R
import com.example.youtubepure.databinding.FragmentMyAccountBinding
import com.example.youtubepure.ui.myaccount.viewmodels.MyAccountViewModel
import com.sangtb.androidlibrary.base.BaseFragment


class MyAccountFragment : BaseFragment<FragmentMyAccountBinding, MyAccountViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_my_account
    override val viewModel: MyAccountViewModel by activityViewModels()

}
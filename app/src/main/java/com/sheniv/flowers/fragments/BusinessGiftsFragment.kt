package com.sheniv.flowers.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sheniv.flowers.R
import com.sheniv.flowers.databinding.FragmentBusinessGiftsBinding

class BusinessGiftsFragment : BaseFragment<FragmentBusinessGiftsBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentBusinessGiftsBinding.inflate(inflater, container, false)

    override fun FragmentBusinessGiftsBinding.onBindView(savedInstanceState: Bundle?) {

        btnBack.setOnClickListener { navController.popBackStack() }
    }

}
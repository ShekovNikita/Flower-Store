package com.sheniv.flowers.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sheniv.flowers.databinding.FragmentDescriptionBinding
import com.sheniv.flowers.fragments.BaseFragment

class DescriptionFragment : BaseFragment<FragmentDescriptionBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentDescriptionBinding.inflate(inflater, container, false)

    override fun FragmentDescriptionBinding.onBindView(savedInstanceState: Bundle?) {
    }

}
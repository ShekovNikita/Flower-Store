package com.sheniv.flowers.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.sheniv.flowers.R
import com.sheniv.flowers.adapters.FragmentStateAdapter
import com.sheniv.flowers.databinding.FragmentDeliveryCommonBinding

class DeliveryCommonFragment : BaseFragment<FragmentDeliveryCommonBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentDeliveryCommonBinding.inflate(inflater, container, false)

    override fun FragmentDeliveryCommonBinding.onBindView(savedInstanceState: Bundle?) {

        btnBack.setOnClickListener { navController.popBackStack() }

        btnCatalog.setOnClickListener { navController.navigate(R.id.catalogFragment) }
    }

}
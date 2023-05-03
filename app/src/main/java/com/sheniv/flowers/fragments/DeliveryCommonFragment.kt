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

        val topFragment = listOf<Fragment>(
            DescriptionFragment(),
            DescriptionFragment(),
        )

        val tabLayout = requireView().findViewById<TabLayout>(R.id.tab_layout)

        viewPager2.adapter = FragmentStateAdapter(requireActivity(), topFragment)
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            val list = arrayListOf("Description","Delivery")
            tab.text = list[position]
        }.attach()

        btnBack.setOnClickListener { navController.popBackStack() }
    }

}
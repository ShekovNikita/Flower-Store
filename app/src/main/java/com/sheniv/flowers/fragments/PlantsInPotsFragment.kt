package com.sheniv.flowers.fragments

import android.content.res.Resources
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.sheniv.flowers.R
import com.sheniv.flowers.adapters.ViewPagerAdapter
import com.sheniv.flowers.databinding.FragmentPlantsInPotsBinding
import com.sheniv.flowers.fragments.BaseFragment
import com.sheniv.flowers.models.AllPlantsInPots

class PlantsInPotsFragment : BaseFragment<FragmentPlantsInPotsBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentPlantsInPotsBinding.inflate(inflater, container, false)

    override fun FragmentPlantsInPotsBinding.onBindView(savedInstanceState: Bundle?) {

        /*val size = Resources.getSystem().displayMetrics.widthPixels;
        val params: ViewGroup.LayoutParams = viewPager2.layoutParams
        params.height = size
        viewPager2.layoutParams = params*/

        val items = AllPlantsInPots().getPlantsInPots()

        viewPager2.adapter = ViewPagerAdapter(items)

        /*TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
        }.attach()*/

        btnBack.setOnClickListener { navController.popBackStack() }

        btnCatalog.setOnClickListener { navController.navigate(R.id.catalogFragment) }

        btnRight.setOnClickListener { viewPager2.currentItem = 1 }

        btnLeft.setOnClickListener { viewPager2.currentItem = 0 }
    }

}
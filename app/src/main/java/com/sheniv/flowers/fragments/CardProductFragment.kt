package com.sheniv.flowers.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.sheniv.flowers.R
import com.sheniv.flowers.adapters.ItemProductCardAdapter
import com.sheniv.flowers.adapters.ViewPagerAdapter
import com.sheniv.flowers.databinding.FragmentCardProductBinding
import com.sheniv.flowers.fragments.BaseFragment
import com.sheniv.flowers.helpers.breadCrumbSecond

class CardProductFragment : BaseFragment<FragmentCardProductBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentCardProductBinding.inflate(inflater, container, false)

    override fun FragmentCardProductBinding.onBindView(savedInstanceState: Bundle?) {

        plus.setOnClickListener { counter.text = (counter.text.toString().toInt() + 1).toString() }
        minus.setOnClickListener { counter.text = (counter.text.toString().toInt() - 1).toString() }

        breadCrumb1.setOnClickListener { navController.navigate(R.id.mainFragment) }
        breadCrumb2.setOnClickListener { navController.popBackStack() }
        breadCrumb2.text = breadCrumbSecond

        val items = arrayListOf(R.drawable.alstroemeria_2, R.drawable.alstroemeria, R.drawable.alstroemeria_2,)
        viewPager2.adapter = ItemProductCardAdapter(items)

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
        }.attach()
    }

}
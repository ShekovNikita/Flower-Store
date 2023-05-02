package com.sheniv.flowers.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sheniv.flowers.R
import com.sheniv.flowers.databinding.FragmentAboutCompanyBinding

class AboutCompanyFragment : BaseFragment<FragmentAboutCompanyBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentAboutCompanyBinding.inflate(inflater, container, false)

    override fun FragmentAboutCompanyBinding.onBindView(savedInstanceState: Bundle?) {

        btnBack.setOnClickListener { navController.popBackStack() }

        btnBouquetCatalog.setOnClickListener { navController.navigate(R.id.catalogFragment) }
    }

}
package com.sheniv.flowers.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.sheniv.flowers.adapters.CatalogAdapter
import com.sheniv.flowers.databinding.FragmentCatalogBinding
import com.sheniv.flowers.fragments.BaseFragment
import com.sheniv.flowers.models.AllCatalog

class CatalogFragment : BaseFragment<FragmentCatalogBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentCatalogBinding.inflate(inflater, container, false)

    override fun FragmentCatalogBinding.onBindView(savedInstanceState: Bundle?) {

        recyclerCatalog.adapter = CatalogAdapter(AllCatalog().getAllCategory())

        btnBack.setOnClickListener { navController.popBackStack() }
    }

}
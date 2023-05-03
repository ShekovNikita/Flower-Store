package com.sheniv.flowers.fragments

import android.os.Build.VERSION_CODES.S
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.sheniv.flowers.R
import com.sheniv.flowers.adapters.CatalogAdapter
import com.sheniv.flowers.adapters.ClickOnItem
import com.sheniv.flowers.databinding.FragmentCatalogBinding
import com.sheniv.flowers.fragments.BaseFragment
import com.sheniv.flowers.helpers.breadCrumbSecond
import com.sheniv.flowers.models.AllCatalog
import com.sheniv.flowers.models.CatalogItem

class CatalogFragment : BaseFragment<FragmentCatalogBinding>(), ClickOnItem {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentCatalogBinding.inflate(inflater, container, false)

    override fun FragmentCatalogBinding.onBindView(savedInstanceState: Bundle?) {

        recyclerCatalog.adapter = CatalogAdapter(AllCatalog().getAllCategory(), this@CatalogFragment)

        btnBack.setOnClickListener { navController.popBackStack() }
    }

    override fun click(item: CatalogItem) {
        when(item.name){
            "Special offer" -> breadCrumbSecond = "Special offer "
            "Bouquets" -> breadCrumbSecond = "Bouquets "
            "Mono flowers" -> breadCrumbSecond = "Mono flowers "
            "Wedding floristry" -> breadCrumbSecond = "Wedding floristry "
            "Gift boxes" -> breadCrumbSecond = "Gift boxes "
            "Plants in pots" -> breadCrumbSecond = "Plants in pots "
        }
        navController.navigate(R.id.cardProductFragment)
    }
}
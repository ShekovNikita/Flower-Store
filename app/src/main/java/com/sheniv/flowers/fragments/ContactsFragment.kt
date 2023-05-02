package com.sheniv.flowers.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sheniv.flowers.R
import com.sheniv.flowers.databinding.FragmentContactsBinding
import com.sheniv.flowers.fragments.BaseFragment

class ContactsFragment : BaseFragment<FragmentContactsBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentContactsBinding.inflate(inflater, container, false)

    override fun FragmentContactsBinding.onBindView(savedInstanceState: Bundle?) {

        btnInstagram.setOnClickListener {
            val instagram_url = "https://www.instagram.com/smilemaker.by"
            val instagram = Intent(Intent.ACTION_VIEW, Uri.parse(instagram_url))
            startActivity(instagram)
        }

        btnCatalog.setOnClickListener { navController.navigate(R.id.catalogFragment) }

        number.setOnClickListener {
            val number = "tel:+375257696633"
            val call = Intent(Intent.ACTION_DIAL, Uri.parse(number))
            startActivity(call)
        }

        btnBack.setOnClickListener { navController.popBackStack() }
    }

}
package com.sheniv.flowers.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sheniv.flowers.R
import com.sheniv.flowers.databinding.FragmentFollowUsOnInstagramBinding

class FollowUsOnInstagramFragment : BaseFragment<FragmentFollowUsOnInstagramBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentFollowUsOnInstagramBinding.inflate(inflater, container, false)

    override fun FragmentFollowUsOnInstagramBinding.onBindView(savedInstanceState: Bundle?) {

        btnBack.setOnClickListener { navController.popBackStack() }

        followUs.setOnClickListener{
            val instagram_url = "https://www.instagram.com/smilemaker.by"
            val instagram = Intent(Intent.ACTION_VIEW, Uri.parse(instagram_url))
            startActivity(instagram)
        }
    }

}
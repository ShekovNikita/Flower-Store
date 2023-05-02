package com.sheniv.flowers.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView
import com.sheniv.flowers.R
import com.sheniv.flowers.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>(),
    NavigationView.OnNavigationItemSelectedListener {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentMainBinding.inflate(inflater, container, false)

    override fun FragmentMainBinding.onBindView(savedInstanceState: Bundle?) {

        navView.setNavigationItemSelectedListener(this@MainFragment)

        val toggle = ActionBarDrawerToggle(
            requireActivity(),
            drawerLayout,
            binding.toolbar,
            R.string.huy,
            R.string.pizda
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        catalog.setOnClickListener { navController.navigate(R.id.catalogFragment) }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val handled = NavigationUI.onNavDestinationSelected(item, navController)
        if (!handled) {
            when (item.itemId) {
                R.id.main -> {}
                R.id.plants_in_post -> navController.navigate(R.id.plantsInPotsFragment)
                R.id.catalog -> navController.navigate(R.id.catalogFragment)
                R.id.business_gifts -> navController.navigate(R.id.businessGiftsFragment)
                R.id.about_us -> navController.navigate(R.id.aboutCompanyFragment)
                R.id.follow_us -> navController.navigate(R.id.followUsOnInstagramFragment)
                R.id.contacts -> navController.navigate(R.id.contactsFragment)
            }
        }

        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return handled
    }
}
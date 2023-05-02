package com.sheniv.flowers.models

import com.sheniv.flowers.R

data class CatalogItem(
    val image: Int,
    val name: String
)

class AllCatalog(){
    private val first = CatalogItem(R.drawable.special_offer, "Special offer")
    private val second = CatalogItem(R.drawable.bouquets, "Bouquets")
    private val third = CatalogItem(R.drawable.mono_flowers, "Mono flowers")
    private val fourth = CatalogItem(R.drawable.wedding_floristry, "Wedding floristry")
    private val fifth = CatalogItem(R.drawable.gift_boxes, "Gift boxes")
    private val sixth = CatalogItem(R.drawable.plants_in_pots, "Plants in pots")

    fun getAllCategory() = arrayListOf(first, second, third, fourth, fifth, sixth)
}

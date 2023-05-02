package com.sheniv.flowers.models

import com.sheniv.flowers.R

data class PlantsInPots(
    val name: String,
    val description: String,
    val image: Int
)

class AllPlantsInPots{
    private val first = PlantsInPots(
        name = "Large plants",
        description = "As decor, indoor flowers are absolutely universal. Small specimens will look great on a small table or open shelving, while larger specimens can stand on the floor, filling the visual void (if your room has too little greenery and too much empty space, a plant in a tub is your option).",
        image = R.drawable.large_plants
    )
    private val second = PlantsInPots(
        name = "Plants for the balcony",
        description = "Small specimens will look great on a small table or open shelving, while larger specimens can stand on the floor, filling the visual void (if your room has too little greenery and too much empty space, a plant in a tub is your option). As decor, indoor flowers are absolutely universal.",
        image = R.drawable.plants_for_the_balcony
    )

    fun getPlantsInPots() = arrayListOf(first, second)
}

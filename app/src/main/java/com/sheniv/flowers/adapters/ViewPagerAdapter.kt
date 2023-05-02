package com.sheniv.flowers.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sheniv.flowers.R
import com.sheniv.flowers.databinding.ItemPlantsBinding
import com.sheniv.flowers.models.PlantsInPots

class ViewPagerAdapter(
    val arrayList: ArrayList<PlantsInPots>
): RecyclerView.Adapter<ViewPagerAdapter.VPAVH>() {

    inner class VPAVH(item: View): RecyclerView.ViewHolder(item){
        private val binding = ItemPlantsBinding.bind(item)
        fun bind(i: PlantsInPots) = with(binding){
            image.setImageResource(i.image)
            name.text = i.name
            description.text = i.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        VPAVH(LayoutInflater.from(parent.context).inflate(R.layout.item_plants, parent, false))

    override fun onBindViewHolder(holder: VPAVH, position: Int) {
        holder.bind(arrayList[position])
    }

    override fun getItemCount() = arrayList.size
}
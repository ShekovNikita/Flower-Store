package com.sheniv.flowers.adapters

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sheniv.flowers.R
import com.sheniv.flowers.databinding.ItemCardProductBinding

class ItemProductCardAdapter(
    val listImages: ArrayList<Int>
) : RecyclerView.Adapter<ItemProductCardAdapter.IPCAVH>(){
    inner class IPCAVH(item: View): RecyclerView.ViewHolder(item) {
        val binding = ItemCardProductBinding.bind(item)
        fun bind(item: Int) = with(binding){
            image.setImageResource(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        IPCAVH(
            LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_card_product, parent, false)
        )

    override fun onBindViewHolder(holder: IPCAVH, position: Int) {
        holder.bind(listImages[position])
    }

    override fun getItemCount() = listImages.size
}
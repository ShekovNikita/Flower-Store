package com.sheniv.flowers.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sheniv.flowers.R
import com.sheniv.flowers.databinding.ItemCatalogBinding
import com.sheniv.flowers.models.CatalogItem

class CatalogAdapter(
    val listCatalog: ArrayList<CatalogItem>,
    val clickOnItem: ClickOnItem
): RecyclerView.Adapter<CatalogAdapter.CAVH>() {
    inner class CAVH(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = ItemCatalogBinding.bind(item)
        fun bind(i: CatalogItem) = with(binding){
            image.setImageResource(i.image)
            name.text = i.name
            itemView.setOnClickListener { clickOnItem.click(i) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CAVH(LayoutInflater.from(parent.context).inflate(R.layout.item_catalog, parent, false))

    override fun onBindViewHolder(holder: CAVH, position: Int) {
        holder.bind(listCatalog[position])
    }

    override fun getItemCount() = listCatalog.size
}
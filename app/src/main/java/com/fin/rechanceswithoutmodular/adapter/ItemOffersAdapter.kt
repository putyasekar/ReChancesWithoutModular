package com.fin.rechanceswithoutmodular.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fin.rechanceswithoutmodular.databinding.RowCategoriesHomeBinding
import com.fin.rechanceswithoutmodular.databinding.RowListItemsToOfferBinding
import com.fin.rechanceswithoutmodular.model.ItemToOffer
import com.fin.rechanceswithoutmodular.model.StaticRvList

class ItemOffersAdapter(
    private val items: ArrayList<ItemToOffer>
) : RecyclerView.Adapter<ItemOffersAdapter.ItemOfferViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemOfferViewHolder{
        return ItemOfferViewHolder(
            RowListItemsToOfferBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemOfferViewHolder, position: Int) {
        val currentItem = items[position]
        holder.binding.apply {
            this.totalItem.text = currentItem.totalItem
            this.conditionType2.text = currentItem.condition
            this.TypeOfPorterage2.text = currentItem.type
            this.displayPictItem .setImageResource(currentItem.displayImage)
        }
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(currentItem.totalItem) }
    }


    inner class ItemOfferViewHolder(val binding: RowListItemsToOfferBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int = items.size

    interface OnItemClickCallback {
        fun onItemClicked(url:String)
    }
}
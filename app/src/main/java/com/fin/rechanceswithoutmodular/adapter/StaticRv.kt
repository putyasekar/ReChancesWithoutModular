package com.fin.rechanceswithoutmodular.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fin.rechanceswithoutmodular.databinding.RowCategoriesHomeBinding
import com.fin.rechanceswithoutmodular.model.StaticRvList

class StaticRv(
    private val items: ArrayList<StaticRvList>
) : RecyclerView.Adapter<StaticRv.StaticRVViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StaticRVViewHolder {
        return StaticRVViewHolder(
            RowCategoriesHomeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: StaticRVViewHolder, position: Int) {
        val currentItem = items[position]
        holder.binding.apply {
            this.titleFilter.text = currentItem.text
            this.displayFilter.setImageResource(currentItem.display)
        }
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(currentItem.text) }
    }


    inner class StaticRVViewHolder(val binding: RowCategoriesHomeBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int = items.size

    interface OnItemClickCallback {
        fun onItemClicked(url:String)
    }
}
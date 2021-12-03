package com.fin.rechanceswithoutmodular.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.databinding.RowBasedOnInterestBinding
import com.fin.rechanceswithoutmodular.databinding.RowCategoriesHomeBinding
import com.fin.rechanceswithoutmodular.model.ContentModel
import com.fin.rechanceswithoutmodular.model.StaticRvList
import kotlinx.android.synthetic.main.row_based_on_interest.view.*

class ProductAdapter(
    private val items: ArrayList<ContentModel>
) : RecyclerView.Adapter<ProductAdapter.ContentModelViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ContentModelViewHolder {
        return ContentModelViewHolder(
            RowBasedOnInterestBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ContentModelViewHolder, position: Int) {
        val currentItem = items[position]
        holder.binding.apply {
            this.tvTitle.text = currentItem.title
            this.ivProduct.setImageResource(currentItem.image)
        }
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(currentItem.title) }
    }


    inner class ContentModelViewHolder(val binding: RowBasedOnInterestBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int = items.size

    interface OnItemClickCallback {
        fun onItemClicked(url:String)
    }
}
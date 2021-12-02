package com.fin.rechanceswithoutmodular.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.model.ContentModel
import kotlinx.android.synthetic.main.row_based_on_interest.view.*

class ProductAdapter(private val listener: (ContentModel) -> Unit) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    private val listProduct = ArrayList<ContentModel>()

    @SuppressLint("NotifyDataSetChanged")
    fun setData(items: ArrayList<ContentModel>) {
        listProduct.clear()
        listProduct.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_based_on_interest, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listProduct.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listProduct[position], listener)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(content: ContentModel, listener: (ContentModel) -> Unit) {
            with(itemView) {
                Glide.with(itemView.context)
                    .load(content.image)
                    .apply(RequestOptions())
                    .override(300)
                    .into(iv_product)

                tv_title.text = content.title
                delivery_status.text = content.status_delivery

                itemView.setOnClickListener { listener(content) }
            }
        }
    }
}
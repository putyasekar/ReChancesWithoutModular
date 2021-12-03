package com.fin.rechanceswithoutmodular.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fin.rechanceswithoutmodular.databinding.RowListItemsToOfferBinding
import com.fin.rechanceswithoutmodular.databinding.UserRowChatBinding
import com.fin.rechanceswithoutmodular.model.ChatUser
import com.fin.rechanceswithoutmodular.model.ItemToOffer

class ChatAdapter(
    private val items: ArrayList<ChatUser>
) : RecyclerView.Adapter<ChatAdapter.ChatAdapterViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ChatAdapterViewHolder {
        return ChatAdapterViewHolder(
            UserRowChatBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ChatAdapterViewHolder, position: Int) {
        val currentItem = items[position]
        holder.binding.apply {
            this.displayPictureChat.setImageResource(currentItem.avatar)
            this.usernameChat.text = currentItem.username
            this.lastActiveChat.text = currentItem.lastActive
        }
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(currentItem.username) }
    }


    inner class ChatAdapterViewHolder(val binding: UserRowChatBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int = items.size

    interface OnItemClickCallback {
        fun onItemClicked(url:String)
    }
}
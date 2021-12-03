package com.fin.rechanceswithoutmodular.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.adapter.ChatAdapter
import com.fin.rechanceswithoutmodular.adapter.ItemOffersAdapter
import com.fin.rechanceswithoutmodular.data.ItemOfferDummy
import com.fin.rechanceswithoutmodular.data.ListChatDummy
import com.fin.rechanceswithoutmodular.databinding.FragmentChatBinding
import com.fin.rechanceswithoutmodular.databinding.FragmentListItemBinding
import com.fin.rechanceswithoutmodular.model.ChatUser
import com.fin.rechanceswithoutmodular.model.ItemToOffer


class ChatFragment : Fragment() {
    lateinit var binding: FragmentChatBinding
    private lateinit var adapter: ChatAdapter
    var list: ArrayList<ChatUser> = arrayListOf()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChatBinding.inflate(layoutInflater)
        list.addAll(ListChatDummy.getListData())
        showStaticRecyclerView()
        return binding.root
    }
    private fun showStaticRecyclerView() {
        adapter = ChatAdapter(list)
        binding.chatRecyclerView.apply {
            layoutManager =
                LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
            adapter = this@ChatFragment.adapter
            setHasFixedSize(true)
        }
    }
}
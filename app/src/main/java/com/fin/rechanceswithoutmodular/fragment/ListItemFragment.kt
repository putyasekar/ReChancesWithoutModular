package com.fin.rechanceswithoutmodular.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.adapter.ItemOffersAdapter
import com.fin.rechanceswithoutmodular.adapter.ProductAdapter
import com.fin.rechanceswithoutmodular.adapter.StaticRv
import com.fin.rechanceswithoutmodular.data.CategoryDummy
import com.fin.rechanceswithoutmodular.data.ContentModelDummy
import com.fin.rechanceswithoutmodular.data.ItemOfferDummy
import com.fin.rechanceswithoutmodular.databinding.FragmentHomeBinding
import com.fin.rechanceswithoutmodular.databinding.FragmentListItemBinding
import com.fin.rechanceswithoutmodular.model.ContentModel
import com.fin.rechanceswithoutmodular.model.ItemToOffer
import com.fin.rechanceswithoutmodular.model.StaticRvList

class ListItemFragment : Fragment() {
    lateinit var binding: FragmentListItemBinding
    private lateinit var adapter: ItemOffersAdapter
    var list: ArrayList<ItemToOffer> = arrayListOf()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentListItemBinding.inflate(layoutInflater)
        list.addAll(ItemOfferDummy.getListData())
        showStaticRecyclerView()
        return binding.root
    }

    private fun showStaticRecyclerView() {
        adapter = ItemOffersAdapter(list)
        binding.rvListItems1.apply {
            layoutManager =
                LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
            adapter = this@ListItemFragment.adapter
            setHasFixedSize(true)
        }
    }
}
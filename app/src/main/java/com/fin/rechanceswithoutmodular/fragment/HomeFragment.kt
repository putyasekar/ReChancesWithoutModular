package com.fin.rechanceswithoutmodular.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.activity.DetailActivity
import com.fin.rechanceswithoutmodular.activity.MoreProductActivity
import com.fin.rechanceswithoutmodular.adapter.ProductAdapter
import com.fin.rechanceswithoutmodular.adapter.StaticRv
import com.fin.rechanceswithoutmodular.data.CategoryDummy
import com.fin.rechanceswithoutmodular.data.ContentModelDummy
import com.fin.rechanceswithoutmodular.databinding.FragmentHomeBinding
import com.fin.rechanceswithoutmodular.databinding.RowCategoriesHomeBinding
import com.fin.rechanceswithoutmodular.model.ContentModel
import com.fin.rechanceswithoutmodular.model.StaticRvList
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    private lateinit var staticAdapter: StaticRv
    private lateinit var staticAdapterContent: ProductAdapter
    var list: ArrayList<StaticRvList> = arrayListOf()
    var listContent: ArrayList<ContentModel> = arrayListOf()

    companion object {
        fun defaultFragment(): HomeFragment {
            val homeFragment = HomeFragment()
            val bundle = Bundle()
            homeFragment.arguments = bundle
            return homeFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        list.addAll(CategoryDummy.getListData())
        listContent.addAll(ContentModelDummy.getListData())
        Log.d("data ku :" ,list.size.toString())
        showStaticRecyclerView()
        return binding.root
    }

    private fun showSelected() {
        view_all_1.setOnClickListener {
            val intent = Intent(context, MoreProductActivity::class.java)
            startActivity(intent)
        }
    }

    private fun showDetail(it: ContentModel) {
        val page = Intent(context, DetailActivity::class.java)
        page.putExtra(DetailActivity.KEY_PRODUCTS, it)
        startActivity(page)
    }

    private fun getListProduct(): ArrayList<ContentModel> {
        val dataTitle = resources.getStringArray(R.array.title)
        val dataStatus = resources.getStringArray(R.array.status)
        val dataTags = resources.getStringArray(R.array.tags)
        val dataPrice = resources.getStringArray(R.array.price)
        val dataDescription = resources.getStringArray(R.array.description)
        val dataImage = resources.obtainTypedArray(R.array.image)

        val listProduct = ArrayList<ContentModel>()

        for (position in dataTitle.indices) {
            val product = ContentModel(
                dataTitle[position],
                dataStatus[position],
                dataTags[position],
                dataPrice[position],
                dataDescription[position],
                dataImage.getResourceId(position, -1),
            )
            listProduct.add(product)
        }
        return listProduct
    }
    private fun showStaticRecyclerView() {
        staticAdapter = StaticRv(list)
        binding.rv1.apply {
            layoutManager =
                LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
            adapter = this@HomeFragment.staticAdapter
            setHasFixedSize(true)
        }
        staticAdapterContent = ProductAdapter(listContent)
        binding.rv2.apply {
            layoutManager =
                LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
            adapter = this@HomeFragment.staticAdapterContent
            setHasFixedSize(true)
        }
    }
}
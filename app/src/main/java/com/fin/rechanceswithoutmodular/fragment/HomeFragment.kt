package com.fin.rechanceswithoutmodular.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.activity.DetailActivity
import com.fin.rechanceswithoutmodular.adapter.ProductAdapter
import com.fin.rechanceswithoutmodular.model.ContentModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    private lateinit var productAdapter: ProductAdapter

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
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

//    private fun showSelected() {
//        view_all_1.setOnClickListener {
//            val intent = Intent(context, PopularActivity::class.java)
//            startActivity(intent)
//        }
//    }

    private fun showRecyclerList() {
        productAdapter = ProductAdapter { showDetail(it) }
        productAdapter.notifyDataSetChanged()
        productAdapter.setData(getListProduct())
        rv_2.setHasFixedSize(true)
        rv_2.layoutManager= LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rv_2.adapter = productAdapter
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
        val dataImage = resources.obtainTypedArray(R.array.image)

        val listHotel = ArrayList<ContentModel>()

        for (position in dataTitle.indices) {
            val hotel = ContentModel(
                dataTitle[position],
                dataStatus[position],
                dataTags[position],
                dataImage.getResourceId(position, -1)
            )
            listHotel.add(hotel)
        }
        return listHotel
    }
}
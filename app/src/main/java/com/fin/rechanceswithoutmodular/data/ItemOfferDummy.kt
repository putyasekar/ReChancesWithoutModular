package com.fin.rechanceswithoutmodular.data

import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.model.ItemToOffer
import com.fin.rechanceswithoutmodular.model.StaticRvList

object ItemOfferDummy {
    fun getListData(): ArrayList<ItemToOffer> {
        val list: ArrayList<ItemToOffer> = arrayListOf(
            ItemToOffer("4", "Drawer", "Preorder", "Free Shipping", R.drawable.drawer_display),
            ItemToOffer("4", "Drawer", "Preorder", "Free Shipping", R.drawable.drawer_display),
            ItemToOffer("4", "Drawer", "Preorder", "Free Shipping", R.drawable.drawer_display),
            ItemToOffer("4", "Drawer", "Preorder", "Free Shipping", R.drawable.drawer_display),
            ItemToOffer("4", "Drawer", "Preorder", "Free Shipping", R.drawable.drawer_display),
            ItemToOffer("4", "Drawer", "Preorder", "Free Shipping", R.drawable.drawer_display),
        )
        return list
    }
}
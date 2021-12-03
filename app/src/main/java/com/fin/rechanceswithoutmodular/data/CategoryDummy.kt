package com.fin.rechanceswithoutmodular.data

import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.model.StaticRvList

object CategoryDummy {
    fun getListData(): ArrayList<StaticRvList> {
        val list: ArrayList<StaticRvList> = arrayListOf(
            StaticRvList(R.drawable.dummy_display_plant, "Plant"),
            StaticRvList(R.drawable.another_dummy_plant, "Seeds"),
            StaticRvList(R.drawable.dummy_display_plant, "Phone"),
            StaticRvList(R.drawable.dummy_display_plant, "Books"),
        )
        return list
    }
}
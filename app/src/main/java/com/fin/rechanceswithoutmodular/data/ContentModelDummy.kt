package com.fin.rechanceswithoutmodular.data

import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.model.ContentModel
import com.fin.rechanceswithoutmodular.model.StaticRvList

object ContentModelDummy {
    fun getListData(): ArrayList<ContentModel> {
        val list: ArrayList<ContentModel> = arrayListOf(
            ContentModel("Membaca Buku", "Selesai", "-", "RP.25.000", "Sudah diterima", R.drawable.buku),
            ContentModel("Membaca Buku", "Selesai", "-", "RP.25.000", "Sudah diterima", R.drawable.buku),
            ContentModel("Membaca Buku", "Selesai", "-", "RP.25.000", "Sudah diterima", R.drawable.buku),
            ContentModel("Membaca Buku", "Selesai", "-", "RP.25.000", "Sudah diterima", R.drawable.buku),
            ContentModel("Membaca Buku", "Selesai", "-", "RP.25.000", "Sudah diterima", R.drawable.buku),
        )
        return list
    }
}
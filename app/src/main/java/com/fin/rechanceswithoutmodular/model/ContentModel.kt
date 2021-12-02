package com.fin.rechanceswithoutmodular.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ContentModel(
    var title: String,
    var status_delivery: String,
    var tags: String,
    var price: String,
    var desc: Int
) : Parcelable
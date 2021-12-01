package com.putya.rechanceswithoutmodular.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ContentModel(
    var title: String,
    var status_delivery: String,
    var tags: String,
    var image: Int
) : Parcelable
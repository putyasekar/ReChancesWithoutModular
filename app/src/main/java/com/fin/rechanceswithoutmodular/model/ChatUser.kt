package com.fin.rechanceswithoutmodular.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ChatUser(

    val username: String,
    val avatar : Int,
    val lastActive : String,

    ) : Parcelable


package com.example.movieapp.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Dates(
    val maximum: String,
    val minimum: String
):Parcelable
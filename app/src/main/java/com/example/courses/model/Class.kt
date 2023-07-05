package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Class(
    @StringRes val titleResourceId: Int,
    val numberResourceId: Int,
    @DrawableRes val imageResourceId: Int
)

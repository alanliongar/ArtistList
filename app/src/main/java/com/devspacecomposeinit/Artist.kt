package com.devspacecomposeinit

import androidx.annotation.DrawableRes

data class Artist(
    val id: Int,
    val name: String,
    val description: String,
    val lastSeenOnline: String,
    @DrawableRes val image: Int,
    @DrawableRes val art: Int
)
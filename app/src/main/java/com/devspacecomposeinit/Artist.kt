package com.devspacecomposeinit

import androidx.annotation.DrawableRes

data class Artist(
    val name: String,
    val lastSeenOnline: String,
    @DrawableRes val image: Int,
    @DrawableRes val art: Int,
)
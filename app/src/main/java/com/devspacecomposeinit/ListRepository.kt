package com.devspacecomposeinit

import androidx.compose.foundation.lazy.items

class ListRepository {

    private val leonardo = Artist(
        "Leonardo Da Vinci",
        "3 minutes ago",
        R.drawable.ic_leonardo_da_vinci,
        R.drawable.ic_mona_lisa
    )
    private val picasso = Artist(
        "Pablo Picasso",
        "5 minutes ago",
        R.drawable.ic_pablo_picasso,
        R.drawable.ic_beijo
    )
    private val salvador = Artist(
        "Salvador Dali",
        "7 minutes ago",
        R.drawable.ic_salvador_dali,
        R.drawable.ic_persistence_of_memory
    )
    private val vanGogh = Artist(
        "Vincent Van Gogh",
        "10 minutes ago",
        R.drawable.ic_vincent_van_gogh,
        R.drawable.ic_starry_night
    )
    private val artists = listOf(
        vanGogh,
        picasso,
        salvador,
        leonardo,
        vanGogh,
        picasso,
        salvador,
        leonardo,
        vanGogh,
        picasso,
        salvador,
        leonardo,
        vanGogh,
        picasso,
        salvador,
        leonardo,
        vanGogh,
        picasso,
        salvador,
        leonardo
    )
    fun getArtistList(): List<Artist> {
        return artists
    }

}
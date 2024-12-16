package com.devspacecomposeinit

class ListRepository {

    private val leonardo = Artist(
        id = 1,
        "Leonardo Da Vinci",
        description = "(1452 - 1519) - Italian Renaissance artist and scientist, known for works like Mona Lisa and The Last Supper. A master of painting, anatomy, engineering, and inventions, he symbolizes the ideal of the Renaissance 'universal man.' His curious mind explored the natural world and human potential.",
        "3 minutes ago",
        R.drawable.ic_leonardo_da_vinci,
        R.drawable.ic_mona_lisa
    )
    private val picasso = Artist(
        id = 2,
        "Pablo Picasso",
        description = "(1881 – 1973) - Spanish painter and sculptor, co-founder of Cubism, a style that revolutionized modern art. Picasso explored various styles and created iconic works like Guernica. He had a prolific career, always innovating with shapes and perspectives.",
        "5 minutes ago",
        R.drawable.ic_pablo_picasso,
        R.drawable.ic_beijo
    )
    private val salvador = Artist(
        id = 3,
        "Salvador Dali",
        description = "(1904 – 1989) - Spanish surrealist painter, famous for his eccentric imagination and works like The Persistence of Memory. Dalí blended dreams and reality, creating distorted images and complex symbolism. His extravagant personality also marked his presence in the art scene.",
        "7 minutes ago",
        R.drawable.ic_salvador_dali,
        R.drawable.ic_persistence_of_memory
    )
    private val vanGogh = Artist(
        id = 4,
        "Vincent Van Gogh",
        description = "(1853 – 1890) - Dutch post-impressionist painter, known for his expressive and emotional technique, with striking brushstrokes in works like Starry Night. He struggled with mental health issues and a lack of recognition during his lifetime, but became one of the most influential artists in history.",
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

    fun getArtistById(id: Int): Artist {
        return getArtistList().first { it.id == id }
    }

    fun getArtistList(): List<Artist> {
        return artists
    }
}
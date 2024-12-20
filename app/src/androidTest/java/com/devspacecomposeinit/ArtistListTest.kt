package com.devspacecomposeinit

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import junit.framework.TestCase.assertEquals
import org.junit.Rule
import org.junit.Test

class ArtistListTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testArtistListTitleDisplayCorrectly() {
        //Given en empty list
        val artistList = emptyList<Artist>()


        //When showing the UI
        composeTestRule.setContent {
            ArtistListContent(
                artistList = artistList,
                onClick = {}
            )
        }


        //Then Check title is displayed
        composeTestRule
            .onNodeWithText("Artist List App")
            .isDisplayed()
    }

    @Test
    fun testArtistListDisplayCorrectly() { //Only testing the name and lastSeenOnline
        //Given artist list containing 3 artists
        val artistList = listOf(
            Artist(
                id = 0,
                "Artist 0",
                description = "Artist Desc 0",
                lastSeenOnline = "0 min",
                image = R.drawable.ic_vincent_van_gogh,
                art = R.drawable.ic_starry_night,
            ), Artist(
                id = 1,
                "Artist 1",
                description = "Artist Desc 1",
                lastSeenOnline = "1 min",
                image = R.drawable.ic_vincent_van_gogh,
                art = R.drawable.ic_starry_night,
            ), Artist(
                id = 2,
                "Artist 2",
                description = "Artist Desc 2",
                lastSeenOnline = "2 min",
                image = R.drawable.ic_vincent_van_gogh,
                art = R.drawable.ic_starry_night,
            )
        )

        //When setContent is called
        composeTestRule.setContent {
            ArtistListContent(
                artistList = artistList,
                onClick = {}
            )
        }

        //Then assert of each of them are being shown
        artistList.forEach { artist ->
            composeTestRule
                .onNodeWithTag(ARTIST_LIST_NAME_TAG + artist.id, useUnmergedTree = true)
                .assertTextEquals(artist.name)
                .isDisplayed()

            composeTestRule
                .onNodeWithTag(ARTIST_LAST_SEEN_TAG + artist.id, useUnmergedTree = true)
                .assertTextEquals(artist.lastSeenOnline)
                .isDisplayed()
        }
    }

    @Test
    fun testArtistListClickIsTriggeredCorrectly() {
        var artistClicked: Artist? = null
        //Given list of one artist
        val artistList = listOf(
            Artist(
                id = 0,
                "Artist 0",
                description = "Artist Desc 0",
                lastSeenOnline = "0 min",
                image = R.drawable.ic_vincent_van_gogh,
                art = R.drawable.ic_starry_night,
            )
        )

        //When list is clicked
        composeTestRule.setContent {
            ArtistListContent(
                artistList = artistList,
                onClick = { artistClicked = it }
            )
        }

        composeTestRule.onNodeWithTag(
            ARTIST_LIST_NAME_TAG + artistList[0].id,
            useUnmergedTree = true
        ).performClick()

        //Then check the callback
        assertEquals(artistClicked, artistList[0])
    }
}
package com.devspacecomposeinit

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.devspacecomposeinit.designsystem.ToolbarWithBackButton
import com.devspacecomposeinit.ui.theme.ComposeInitTheme

@Composable
fun ArtistDetailScreen(artistId: Int, navController: NavController? = null) {
    val repo = ListRepository()
    val artist = repo.getArtistById(id = artistId)
    Scaffold(topBar = {
        ToolbarWithBackButton("Detail") {
            navController?.popBackStack()
        }
    }, content = { paddingValues ->
        ArtistDetailContent(
            artist = artist,
            modifier = Modifier.padding(paddingValues)
        )
    })
}

@Composable
private fun ArtistDetailContent(
    artist: Artist,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxSize()) {
        ArtistCard(artist = artist, onClick = {})
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            modifier = Modifier.padding(16.dp),
            text = artist.description
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ArtistDetailContentPreview() {
    ComposeInitTheme {
        val exampleArtist = Artist(
            id = 4,
            "Vincent Van Gogh",
            description =
            "(1853 – 1890) - Dutch post-impressionist painter, known for his expressive and emotional technique, with striking brushstrokes in works like Starry Night. He struggled with mental health issues and a lack of recognition during his lifetime, but became one of the most influential artists in history.",
            "10 minutes ago",
            R.drawable.ic_vincent_van_gogh,
            R.drawable.ic_starry_night
        )
        ArtistDetailScreen(exampleArtist.id)
    }
}
package com.devspacecomposeinit

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.SemiBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.devspacecomposeinit.ui.theme.ComposeInitTheme

@Composable
fun ArtistListScreen(navController: NavController) {
    val repository = ListRepository()
    val artists = repository.getArtistList()
    ArtistList(artistList = artists) { artist ->
        navController.navigate(route = "artistDetail/${artist.id}")
    }
}

@Composable
fun ArtistCard(
    artist: Artist,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .clickable(onClick = onClick)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.FillWidth,
                painter = painterResource(id = artist.image),
                contentDescription = "Artist Image"
            )
            Spacer(modifier = Modifier.size(16.dp))
            Column {
                Text(text = artist.name, fontSize = 18.sp, fontWeight = SemiBold)
                Text(artist.lastSeenOnline, color = Color.Gray)
            }
        }
        Card(
            modifier = Modifier.padding(8.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = artist.art),
                contentDescription = "Artist Art",
            )

        }
    }
}

@Composable
fun ArtistList(
    artistList: List<Artist>,
    onClick: (Artist) -> Unit
) {
    LazyColumn {
        items(artistList) { artist ->
            ArtistCard(
                artist,
                onClick = {
                    onClick.invoke(artist)
                }
            )
        }
    }
}

@Preview
@Composable
fun ArtistCardPreview() {
    ComposeInitTheme {
        val artist = Artist(
            id = 1,
            "Leonardo Da Vinci",
            description = "(1452 - 1519) - Italian Renaissance artist and scientist, known for works like Mona Lisa and The Last Supper. A master of painting, anatomy, engineering, and inventions, he symbolizes the ideal of the Renaissance 'universal man.' His curious mind explored the natural world and human potential.",
            "3 minutes ago",
            R.drawable.ic_leonardo_da_vinci,
            R.drawable.ic_mona_lisa
        )
        ArtistCard(artist, onClick = {})
    }
}
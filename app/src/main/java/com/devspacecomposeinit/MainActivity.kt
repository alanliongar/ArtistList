package com.devspacecomposeinit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.SemiBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devspacecomposeinit.R
import com.devspacecomposeinit.ui.theme.ComposeInitTheme


//oi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            ComposeInitTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val leonardo = Artist(
                        "Leonardo Da Vinci",
                        "3 minutes ago",
                        R.drawable.ic_leonardo_da_vinci,
                        R.drawable.ic_mona_lisa
                    )
                    val picasso = Artist(
                        "Pablo Picasso",
                        "5 minutes ago",
                        R.drawable.ic_pablo_picasso,
                        R.drawable.ic_beijo
                    )
                    val salvador = Artist(
                        "Salvador Dali",
                        "7 minutes ago",
                        R.drawable.ic_salvador_dali,
                        R.drawable.ic_persistence_of_memory
                    )
                    val vanGogh = Artist(
                        "Vincent Van Gogh",
                        "10 minutes ago",
                        R.drawable.ic_vincent_van_gogh,
                        R.drawable.ic_starry_night
                    )
                    val artists = listOf(vanGogh, picasso, salvador, leonardo)
                    LazyColumn {
                        items(items = artists) { artist ->
                            ArtistCard(artist = artist)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ArtistCard(artist: Artist) {
    Column(modifier = Modifier.padding(8.dp)) {
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

data class Artist(
    val name: String,
    val lastSeenOnline: String,
    @DrawableRes val image: Int,
    @DrawableRes val art: Int,
)

@Preview
@Composable
fun ArtistCardPreview() {
    ComposeInitTheme {
        val artist = Artist(
            "Leonardo Da Vinci",
            "3 minutes ago",
            R.drawable.ic_leonardo_da_vinci,
            R.drawable.ic_mona_lisa
        )
        ArtistCard(artist)
    }
}
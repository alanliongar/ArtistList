package com.devspacecomposeinit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
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
                    val artist = Artist(
                        "Leonardo Da Vinci",
                        "3 minutes ago",
                        R.drawable.ic_leonardo_da_vinci,
                        R.drawable.ic_mona_lisa)
                    ArtistCard(artist)
                }
            }
        }
    }
}

@Composable
fun ArtistCard(artist: Artist) {
    Column {
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
        Card{
            Image(painter = painterResource(id=artist.art), "Artist Art")
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
        val artist = Artist("Leonardo Da Vinci", "3 minutes ago", R.drawable.ic_leonardo_da_vinci, R.drawable.ic_mona_lisa)
        ArtistCard(artist)
    }
}
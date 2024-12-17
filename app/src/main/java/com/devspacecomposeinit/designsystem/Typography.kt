package com.devspacecomposeinit.designsystem

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devspacecomposeinit.ui.theme.ComposeInitTheme

@Composable
fun TitleSmallText(text: String) {
    Text(text = text, style = MaterialTheme.typography.titleSmall)
}

@Composable
fun TitleLargeText(text: String, modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = text, style = MaterialTheme.typography.titleLarge
    )
}


@Preview(showBackground = true)
@Composable
fun TypographyPreview() {
    ComposeInitTheme {
        Column() {
            TitleLargeText("Title Large Text")
            Spacer(modifier = Modifier.padding(16.dp))
            TitleSmallText("Title Small Text")
        }
    }
}
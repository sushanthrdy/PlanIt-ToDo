package com.sushanth.pitd.ui.screen.inprogress

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InProgressScreen(modifier: Modifier = Modifier) {
    Text(text = "InProgress Screen")
}

@Preview (showBackground = true)
@Composable
private fun InProgressScreenPreview() {
    InProgressScreen()
}